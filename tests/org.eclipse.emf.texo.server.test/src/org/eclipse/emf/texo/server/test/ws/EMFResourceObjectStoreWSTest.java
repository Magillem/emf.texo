/**
 * <copyright>
 *
 * Copyright (c) 2009, 2010 Springsite BV (The Netherlands) and others
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
 * $Id: WSMainTest.java,v 1.1 2011/09/21 14:32:54 mtaal Exp $
 */

package org.eclipse.emf.texo.server.test.ws;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.model.response.ErrorType;
import org.eclipse.emf.texo.server.model.response.ResponseType;
import org.eclipse.emf.texo.server.model.response.ResultType;
import org.eclipse.emf.texo.server.service.ServiceModelPackageRegistry;
import org.eclipse.emf.texo.server.web.ObjectStoreFactory;
import org.eclipse.emf.texo.store.EMFResourceObjectStore;
import org.eclipse.emf.texo.store.ObjectStore;
import org.eclipse.emf.texo.store.TexoEMFResourceURIConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.emf.texo.test.model.samples.library.Book;
import org.eclipse.emf.texo.test.model.samples.library.Library;
import org.eclipse.emf.texo.test.model.samples.library.Writer;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelFactory;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.eclipse.jetty.http.HttpMethod;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Tests the web service retrieve calls.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
@RunWith(Parameterized.class)
public class EMFResourceObjectStoreWSTest extends BaseWSWebTest {

  @Parameterized.Parameters
  public static List<TexoEMFResourceURIConverter.ResourceType> getParameters() {
    return Arrays.asList(new TexoEMFResourceURIConverter.ResourceType[] { // TexoEMFResourceURIConverter.ResourceType.XML,
        TexoEMFResourceURIConverter.ResourceType.XMI });
  }

  @BeforeClass
  public static void beforeClass() {
  }

  @Before
  public void before() {
    {
      File xmiFile = new File(getTemporaryDirectoryPath(), "texo_xmlws.xmi");
      if (xmiFile.exists()) {
        xmiFile.delete();
      }
    }
    {
      File xmlFile = new File(getTemporaryDirectoryPath(), "texo_xmlws.xml");
      if (xmlFile.exists()) {
        xmlFile.delete();
      }
    }
    ObjectStoreFactory.setInstance(new ObjectStoreFactory() {

      @Override
      protected ObjectStore createObjectStoreLocal(HttpServletRequest request, String objectStoreUri) {
        ObjectStore os = super.createEMFResourceObjectStore();
        if (TexoEMFResourceURIConverter.ResourceType.XML.equals(resourceType)) {
          final EMFResourceObjectStore eos = (EMFResourceObjectStore) os;
          ((TexoEMFResourceURIConverter) eos.getURIConverter())
              .setResourceType(TexoEMFResourceURIConverter.ResourceType.XML);
        }
        return super.createEMFResourceObjectStore();
      }
    });
  }

  @After
  public void after() {
    ObjectStoreFactory.setInstance(new ObjectStoreFactory());
  }

  private TexoEMFResourceURIConverter.ResourceType resourceType = null;

  public EMFResourceObjectStoreWSTest(TexoEMFResourceURIConverter.ResourceType resourceType) {
    super("library"); //$NON-NLS-1$
    this.resourceType = resourceType;
    ServiceModelPackageRegistry.getInstance().register(LibraryModelPackage.INSTANCE);
  }

  @Override
  protected ObjectStore getNewObjectStore() {
    try {
      final EMFResourceObjectStore objectStore = ComponentProvider.getInstance()
          .newInstance(EMFResourceObjectStore.class);
      objectStore.setUri(URI.createURI(getURL()));
      ((TexoEMFResourceURIConverter) objectStore.getURIConverter()).setResourceType(resourceType);
      objectStore.setChildLevels(3);
      return objectStore;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Test
  public void testRetrievalAndDelete() {
    final Library lib = createTestData();

    // children
    final Writer w = lib.getWriters().get(0);
    final Book bk = lib.getBooks().get(0);

    // get all libraries
    {
      final String content = doGetRequest(LibraryModelPackage.INSTANCE.getLibraryEClass().getName(), null,
          HttpServletResponse.SC_OK);
      final List<Object> objects = deserialize(content);
      Assert.assertEquals(1, objects.size());
      final ResponseType responseType = (ResponseType) objects.get(0);
      final Library libResult = (Library) responseType.getData().get(0);
      Assert.assertNotSame(lib, libResult);
      Assert.assertEquals(lib.getDb_Id(), libResult.getDb_Id());
    }

    // get one library, and call its content
    {
      String content = getOneObject(lib);
      getValidateOneObject(lib);

      System.err.println(content);
      // and all its content
      final ModelObject<?> modelObject = ModelResolver.getInstance().getModelObject(lib);
      for (EReference eReference : modelObject.eClass().getEAllReferences()) {
        final Object value = modelObject.eGet(eReference);
        if (value == null) {
          continue;
        }
        if (eReference.isMany()) {
          for (Object element : (List<?>) value) {
            if (element instanceof Identifiable) {
              getValidateOneObject(element);
            }
          }
        } else {
          if (value instanceof Identifiable) {
            getValidateOneObject(value);
          }
        }
      }
    }

    // now delete the library
    doDeleteRequest(LibraryModelPackage.INSTANCE.getLibraryEClass().getName() + "/" + lib.getDb_Id(), //$NON-NLS-1$
        HttpServletResponse.SC_OK);
    // this should fail
    {
      final String content = doGetRequest(
          LibraryModelPackage.INSTANCE.getLibraryEClass().getName() + "/" + lib.getDb_Id(), null,
          HttpServletResponse.SC_NOT_FOUND);
      final List<Object> objects = deserialize(content);
      Assert.assertEquals(1, objects.size());
      final ErrorType errorType = (ErrorType) objects.get(0);
      Assert.assertTrue(errorType.getMessage().contains("Resource not found")); //$NON-NLS-1$
    }

    // children are removed
    checkExists(w, false);
    checkExists(bk, false);
  }

  @Test
  public void testUpdateAndDeleteOfChildren() {
    final Library lib = createTestData();
    {
      String content = doGetRequest(LibraryModelPackage.INSTANCE.getLibraryEClass().getName(), null,
          HttpServletResponse.SC_OK);
      final List<Object> objects = deserialize(content);
      Assert.assertEquals(1, objects.size());
      final ResponseType responseType = (ResponseType) objects.get(0);
      final Library libResult = (Library) responseType.getData().get(0);
      Assert.assertNotSame(lib, libResult);
      Assert.assertEquals(lib.getDb_Id(), libResult.getDb_Id());

      // now remove parts from the library
      // for the EMF resource
      Writer w = libResult.getWriters().get(0);
      libResult.getBooks().removeAll(w.getBooks());
      libResult.getWriters().remove(w);
      libResult.setName("updated"); //$NON-NLS-1$
      content = serialize(libResult);
      doContentRequest(getObjectUrlPart(libResult), content, HttpServletResponse.SC_OK, null, HttpMethod.PUT);
      // the above content request only changes the lib structure
      checkExists(w, true);
      // then remove the objects one by one
      doDeleteRequest(getObjectUrlPart(w), 200);
      checkExists(w, false);
      for (Book bk : w.getBooks()) {
        checkExists(bk, true);
        doDeleteRequest(getObjectUrlPart(bk), 200);
        checkExists(bk, false);
      }
    }

    // check that the name of the library got updated
    {
      String content = doGetRequest(LibraryModelPackage.INSTANCE.getLibraryEClass().getName(), null,
          HttpServletResponse.SC_OK);
      final List<Object> objects = deserialize(content);
      Assert.assertEquals(1, objects.size());
      final ResponseType responseType = (ResponseType) objects.get(0);
      final Library resultLib = (Library) responseType.getData().get(0);
      Assert.assertEquals("updated", resultLib.getName()); //$NON-NLS-1$
    }
  }

  @Test
  public void createAndPageTest() {
    final int COUNT = 35;
    final List<Writer> insertedWs = new ArrayList<Writer>();
    for (int i = 0; i < COUNT; i++) {
      final Writer w = LibraryModelPackage.MODELFACTORY.createWriter();
      w.setName("name" + i); //$NON-NLS-1$
      final String content = serialize(w);
      final String resultStr = doContentRequest(LibraryModelPackage.INSTANCE.getWriterEClass().getName(), content,
          HttpServletResponse.SC_OK, null, HttpMethod.POST);
      final ResultType result = (ResultType) deserialize(resultStr).get(0);
      Assert.assertEquals(1, result.getInserted().size());
      Assert.assertEquals(0, result.getUpdated().size());
      Assert.assertEquals(0, result.getDeleted().size());
      final Writer insertedW = (Writer) result.getInserted().get(0);
      Assert.assertEquals(w.getName(), insertedW.getName());
      checkExists(insertedW, true);
      insertedWs.add(insertedW);
    }

    final int[] expectedCount = new int[] { 10, 10, 10, 5, 0 };
    int startRow = 0;
    final List<Writer> checkedWs = new ArrayList<Writer>(insertedWs);
    for (int i = 0; i < expectedCount.length; i++) {
      final String wsPartUrl = ModelUtils.getQualifiedNameFromEClass(LibraryModelPackage.INSTANCE.getWriterEClass())
          + "?firstResult=" + startRow //$NON-NLS-1$
          + "&maxResults=10"; //$NON-NLS-1$
      final String content = doGetRequest(wsPartUrl, null, HttpServletResponse.SC_OK);

      final ResponseType result = (ResponseType) deserialize(content).get(0);
      Assert.assertEquals(COUNT, result.getTotalRows());
      Assert.assertEquals(expectedCount[i], result.getData().size());
      if (result.getData().size() > 0) {
        Assert.assertEquals(startRow, result.getStartRow());
        Assert.assertEquals(startRow + expectedCount[i] - 1, result.getEndRow());
      }

      // check that the data exists
      for (Object o : result.getData()) {
        final Writer w = (Writer) o;
        boolean found = false;
        for (Writer insertedW : insertedWs) {
          if (w.getDb_Id().equals(insertedW.getDb_Id())) {
            checkedWs.remove(insertedW);
            found = true;
            break;
          }
        }
        Assert.assertTrue(found);
      }
      startRow += expectedCount[i];
    }
    Assert.assertTrue(checkedWs.isEmpty());
  }

  @Test
  public void createAndQueryPageTest() throws Exception {
    final int COUNT = 35;
    for (int i = 0; i < COUNT; i++) {
      final Writer w = LibraryModelPackage.MODELFACTORY.createWriter();
      w.setName("name" + i); //$NON-NLS-1$
      final String content = serialize(w);
      doContentRequest(ModelUtils.getQualifiedNameFromEClass(LibraryModelPackage.INSTANCE.getWriterEClass()), content,
          HttpServletResponse.SC_OK, null, HttpMethod.POST);
    }
  }

  @Test
  public void insertComplexStructureTest() throws Exception {
    Library lib = null;
    {
      final String content = serialize(createTestDataInstance());
      final String resultStr = doContentRequest(
          ModelUtils.getQualifiedNameFromEClass(LibraryModelPackage.INSTANCE.getWriterEClass()), content,
          HttpServletResponse.SC_OK, null, HttpMethod.POST);
      final ResultType result = (ResultType) deserialize(resultStr).get(0);
      lib = (Library) result.getInserted().get(0);
      Assert.assertTrue(lib.getDb_Id() != null);
      for (Book bk : lib.getBooks()) {
        Assert.assertTrue(bk.getDb_Id() != null);
        checkExists(bk, true);
      }
      for (Writer w : lib.getWriters()) {
        Assert.assertTrue(w.getDb_Id() != null);
        checkExists(w, true);
      }
    }

    // remove all books
    Writer w = lib.getWriters().get(0);
    final String newName = "" + System.currentTimeMillis(); //$NON-NLS-1$
    w.setName(newName);

    final List<Object> os = new ArrayList<Object>();
    os.add(w);
    os.addAll(w.getBooks());

    final Book bk = w.getBooks().get(0);
    w.getBooks().clear();

    {
      final String content = serialize(os);
      final String resultStr = doContentRequest(
          ModelUtils.getQualifiedNameFromEClass(LibraryModelPackage.INSTANCE.getWriterEClass()), content,
          HttpServletResponse.SC_OK, null, HttpMethod.POST);
      final ResultType resultType = (ResultType) deserialize(resultStr).get(0);
      final Writer wResult = (Writer) resultType.getUpdated().get(0);
      Assert.assertNotSame(w, wResult);
      Assert.assertEquals(w.getDb_Id(), wResult.getDb_Id());
      Assert.assertEquals(0, wResult.getBooks().size());

      // use the new writer as the version may have changed
      w = wResult;
      checkExists(w, true);
    }

    {
      final Writer w2 = (Writer) deserialize(getOneObject(w)).get(0);
      Assert.assertEquals(0, w2.getBooks().size());
    }

    {
      final String content = doGetRequest(
          ModelUtils.getQualifiedNameFromEClass(LibraryModelPackage.INSTANCE.getWriterEClass()), null,
          HttpServletResponse.SC_OK);
      final List<Object> objects = deserialize(content);
      System.err.println(objects.size());
    }

    {
      final Writer w2 = (Writer) deserialize(getOneObject(w)).get(0);
      Assert.assertEquals(0, w2.getBooks().size());
    }

    // and add one book again
    {
      w.getBooks().add(bk);
      bk.setAuthor(w);
      final String content = serialize(w);
      final String resultStr = doContentRequest(
          ModelUtils.getQualifiedNameFromEClass(LibraryModelPackage.INSTANCE.getWriterEClass()), content,
          HttpServletResponse.SC_OK, null, HttpMethod.POST);
      final ResultType resultType = (ResultType) deserialize(resultStr).get(0);
      final Writer wResult = (Writer) resultType.getUpdated().get(0);
      Assert.assertNotSame(w, wResult);
      Assert.assertEquals(w.getDb_Id(), wResult.getDb_Id());
      Assert.assertEquals(1, wResult.getBooks().size());
      // disabled test as books of a writer are proxied
      // Assert.assertEquals(wResult.getBooks().get(0).getAuthor(), wResult);
    }
    {
      final Writer w2 = (Writer) deserialize(getOneObject(w)).get(0);
      Assert.assertNotSame(w, w2);
      Assert.assertEquals(newName, w2.getName());
      Assert.assertEquals(w.getDb_Id(), w2.getDb_Id());
      Assert.assertEquals(1, w2.getBooks().size());
      Assert.assertEquals(bk.getDb_Id(), w2.getBooks().get(0).getDb_Id());
    }

  }

  private Library createTestData() {
    final Library lib = createTestDataInstance();
    getObjectStore().begin();
    getObjectStore().insert(lib);
    getObjectStore().commit();
    return lib;
  }

  private Library createTestDataInstance() {
    final LibraryModelFactory factory = LibraryModelPackage.MODELFACTORY;
    final int COUNT = 5;

    // create testdata
    final Library lib = factory.createLibrary();
    lib.setName("name"); //$NON-NLS-1$

    for (int w = 0; w < COUNT; w++) {
      final Writer writer = factory.createWriter();
      lib.getWriters().add(writer);

      for (int b = 0; b < COUNT; b++) {
        final Book bk = factory.createBook();
        bk.setAuthor(writer);
        writer.getBooks().add(bk);
        lib.getBooks().add(bk);
      }
    }
    return lib;
  }

  @Override
  protected String getURL() {
    return super.getBaseURL() + "/" + XMLWS; //$NON-NLS-1$
  }

  protected boolean isXmlTest() {
    return true;
  }

  protected String getTemporaryDirectoryPath() {
    try {
      final File f = File.createTempFile("test" + System.currentTimeMillis(), null); //$NON-NLS-1$
      String tempDirectory = f.getParentFile().getAbsolutePath();
      f.delete();
      return tempDirectory;
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }

}