/**
 * <copyright>
 *
 * Copyright (c) 2009, 2010, 2011 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: BaseWSWebTest.java,v 1.4 2011/09/24 04:46:48 mtaal Exp $
 */
package org.eclipse.emf.texo.server.test.ws;

import java.io.StringReader;
import java.io.StringWriter;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.json.JSONModelConverter;
import org.eclipse.emf.texo.json.JSONWebServiceObjectResolver;
import org.eclipse.emf.texo.json.ModelJSONConverter;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.resolver.ObjectResolver;
import org.eclipse.emf.texo.server.model.request.ActionType;
import org.eclipse.emf.texo.server.model.request.RequestModelPackage;
import org.eclipse.emf.texo.server.model.response.ErrorType;
import org.eclipse.emf.texo.server.service.ServiceContext;
import org.eclipse.emf.texo.server.test.BaseTest;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.eclipse.emf.texo.xml.ModelXMLLoader;
import org.eclipse.emf.texo.xml.ModelXMLSaver;
import org.eclipse.emf.texo.xml.XMLWebServiceObjectResolver;
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;
import org.eclipse.jetty.client.api.Request;
import org.eclipse.jetty.client.util.BytesContentProvider;
import org.eclipse.jetty.http.HttpMethod;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

/**
 * Base test case for the server environment which also starts and stops jetty and registers the WS servlets for
 * subclasses to use.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public abstract class BaseWSWebTest extends BaseTest {

  private HttpClient httpClient;

  public BaseWSWebTest(String name) {
    super(name);
    ServiceContext.setInTexoTestRun();
  }

  protected void startClient() throws Exception {
    if (httpClient != null) {
      stopClient();
    }
    httpClient = new HttpClient();
    httpClient.start();
  }

  protected void stopClient() throws Exception {
    if (httpClient != null) {
      httpClient.stop();
      httpClient = null;
    }
  }

  @Before
  @Override
  public void setUp() throws Exception {
    super.setUp();
    doServerSetUp();
  }

  @Override
  @After
  public void tearDown() throws Exception {
    super.tearDown();
    if (httpClient != null) {
      stopClient();
    }
    doServerTearDown();
  }

  protected ContentResponse doRequest(String wsPartOfUrl, HttpMethod method, String content) throws Exception {
    if (httpClient == null) {
      startClient();
    }

    final Request request = httpClient.newRequest(getURL() + "/" + encodeWsPart(wsPartOfUrl)); //$NON-NLS-1$
    request.method(method);

    if (content != null) {
      request.content(new BytesContentProvider(content.getBytes(CHARACTER_ENCODING)), "text/plain");
    }

    final ContentResponse response = request.send();
    return response;
  }

  private String encodeWsPart(String wsPart) throws Exception {

    final boolean hasQueryParam = wsPart.contains("query");
    int qIndex = wsPart.indexOf("?"); //$NON-NLS-1$
    if (qIndex == -1) {
      // test with empty query param
      // https://bugs.eclipse.org/bugs/show_bug.cgi?id=387555
      return URLEncoder.encode(wsPart, "UTF-8") + (!hasQueryParam ? "?query=" : ""); //$NON-NLS-1$
    }

    // test with empty query param
    // https://bugs.eclipse.org/bugs/show_bug.cgi?id=387555
    return URLEncoder.encode(wsPart.substring(0, qIndex), "UTF-8") + wsPart.substring(qIndex) //$NON-NLS-1$
        + (!hasQueryParam ? "&query=" : "");
  }

  protected void doDeleteRequest(String wsPart, int expectedResponse) {
    try {
      final ContentResponse response = doRequest(wsPart, HttpMethod.DELETE, null);
      System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
      System.err.println(response.getContent());
      Assert.assertEquals(expectedResponse, response.getStatus());
    } catch (final Exception e) {
      throw new IllegalStateException(e);
    }
  }

  protected String doContentRequest(String wsPart, String content, int expectedResponse, String expectedContent,
      HttpMethod method) {
    try {

      final ContentResponse contentResponse = doRequest(wsPart, method, content);

      System.err.println(content);

      dumpError(expectedResponse, contentResponse);

      Assert.assertEquals(expectedResponse, contentResponse.getStatus());

      if (expectedResponse == 500) {
        // no content available anyway
        return ""; //$NON-NLS-1$
      }
      final String retContent = contentResponse.getContentAsString();
      System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
      System.err.println(retContent);

      if (expectedContent != null && retContent.indexOf(expectedContent) == -1) {
        System.err.println(retContent);
        Assert.fail();
      }
      return retContent;
    } catch (final Exception e) {
      throw new IllegalStateException(e);
    }
  }

  protected String getTagValue(String content, String tag) {
    final int index1 = content.indexOf("<" + tag + ">") + ("<" + tag + ">").length(); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$//$NON-NLS-4$
    if (index1 == -1) {
      return ""; //$NON-NLS-1$
    }
    final int index2 = content.indexOf("</" + tag + ">"); //$NON-NLS-1$ //$NON-NLS-2$
    if (index2 == -1) {
      return ""; //$NON-NLS-1$
    }
    return content.substring(index1, index2);
  }

  protected String getOneObject(Object object) {
    return doGetRequest(getObjectUrlPart(object), null, 200);
  }

  protected void checkExists(Object object, boolean exists) {
    doGetRequest(getObjectUrlPart(object), null, exists ? HttpServletResponse.SC_OK : HttpServletResponse.SC_NOT_FOUND);
  }

  protected String getObjectUrlPart(Object object) {
    final Identifiable identifiable = (Identifiable) object;
    final ModelObject<?> valueModelObject = ModelResolver.getInstance().getModelObject(object);
    return ModelUtils.getQualifiedNameFromEClass(valueModelObject.eClass()) + "/" + identifiable.getDb_Id(); //$NON-NLS-1$
  }

  protected void getValidateOneObject(Object object) {
    final Identifiable identifiable = (Identifiable) object;
    final String content = getOneObject(object);
    final List<Object> result = deserialize(content);
    Assert.assertEquals(1, result.size());
    final Identifiable identifiable2 = (Identifiable) result.get(0);
    Assert.assertNotSame(identifiable, identifiable2);
    Assert.assertEquals(identifiable.getDb_Id(), identifiable2.getDb_Id());
    Assert.assertSame(identifiable.getClass(), identifiable2.getClass());
  }

  protected List<Object> deserialize(String content) {
    if (isXmlTest()) {
      final ModelXMLLoader xmlLoader = new ModelXMLLoader();
      xmlLoader.getEMFModelConverter().setUriResolver(getUriResolver());
      xmlLoader.setReader(new StringReader(content));
      final List<Object> result = xmlLoader.read();
      return result;
    } else {
      try {
        final JSONModelConverter jsonModelConverter = ComponentProvider.getInstance()
            .newInstance(JSONModelConverter.class);
        jsonModelConverter.setObjectResolver(getUriResolver());
        return Collections.singletonList(jsonModelConverter.convert(new JSONObject(content)));
      } catch (JSONException e) {
        throw new RuntimeException(content, e);
      }
    }
  }

  protected String serialize(Object object) {
    if (isXmlTest()) {
      final ModelXMLSaver xmlSaver = new ModelXMLSaver();
      xmlSaver.setObjects(Collections.singletonList(object));
      final StringWriter sw = new StringWriter();
      xmlSaver.setWriter(sw);
      xmlSaver.getModelEMFConverter().getObjectResolver().setUseWebServiceUriFormat(true);
      xmlSaver.write();
      return sw.toString();
    } else {
      final ModelJSONConverter modelJSONConverter = ComponentProvider.getInstance()
          .newInstance(ModelJSONConverter.class);
      modelJSONConverter.setObjectResolver(getUriResolver());
      return modelJSONConverter.convert(object).toString();
    }
  }

  protected String serialize(List<Object> objects) {
    ActionType actionType = RequestModelPackage.MODELFACTORY.createActionType();
    actionType.getUpdate().addAll(objects);
    if (isXmlTest()) {
      final ModelXMLSaver xmlSaver = new ModelXMLSaver();
      xmlSaver.setObjects(Collections.singletonList((Object) actionType));
      final StringWriter sw = new StringWriter();
      xmlSaver.setWriter(sw);
      xmlSaver.getModelEMFConverter().getObjectResolver().setUseWebServiceUriFormat(true);
      xmlSaver.write();
      return sw.toString();
    } else {
      final ModelJSONConverter modelJSONConverter = ComponentProvider.getInstance()
          .newInstance(ModelJSONConverter.class);
      modelJSONConverter.setObjectResolver(getUriResolver());
      return modelJSONConverter.convert(actionType).toString();
    }
  }

  private ObjectResolver getUriResolver() {
    ObjectResolver or;
    if (isXmlTest()) {
      or = new XMLWebServiceObjectResolver();
    } else {
      or = new JSONWebServiceObjectResolver();
    }
    or.setUri(URI.createURI(getURL()));
    return or;
  }

  protected boolean isXmlTest() {
    return true;
  }

  protected String doGetRequest(String wsPart, String testContent, int responseCode) {
    try {
      final ContentResponse contentResponse = doRequest(wsPart, HttpMethod.GET, null);
      dumpError(responseCode, contentResponse);
      final String content = contentResponse.getContentAsString();
      System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");

      System.err.println(content);

      Assert.assertEquals(responseCode, contentResponse.getStatus());
      if (testContent != null && content.indexOf(testContent) == -1) {
        System.err.println(content);
        Assert.fail();
      }
      return content;
    } catch (final Exception e) {
      throw new IllegalStateException("Exception when executing ws: " + wsPart, e); //$NON-NLS-1$
    }
  }

  private void dumpError(int expectedResponseCode, ContentResponse response) throws Exception {
    if (expectedResponseCode != response.getStatus()
        && response.getStatus() == HttpServletResponse.SC_INTERNAL_SERVER_ERROR) {
      final String content = response.getContentAsString();
      if (content.contains("response:error")) { //$NON-NLS-1$
        final ErrorType errorType = (ErrorType) deserialize(content).get(0);
        System.err.println(errorType.getMessage());
        System.err.println(errorType.getStackTrace());
      }
    }
  }

  protected String getURL() {
    if (isXmlTest()) {
      return super.getBaseURL() + "/" + XMLWS; //$NON-NLS-1$
    } else {
      return super.getBaseURL() + "/" + JSONWS; //$NON-NLS-1$
    }
  }
}
