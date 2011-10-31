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
 *   Dzmitry [zmicer] Harachka - implementation
 * </copyright>
 *
 * $Id: RetrieveModelOperation.java,v 1.7 2011/09/04 20:04:19 mtaal Exp $
 */
package org.eclipse.emf.texo.server.service;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.provider.IdProvider;
import org.eclipse.emf.texo.server.model.response.ResponseModelPackage;
import org.eclipse.emf.texo.server.model.response.ResponseType;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The model operation which takes care of retrieving data. The conversion to the expected format is done by the
 * implementing subclass.
 * 
 * The following type of request uris are supported here:
 * <ul>
 * <li>http://www.test.com/XMLService?query=select o from Order&firstResult=10&maxResults=50 a query with paging
 * parameters</li>
 * <li>http://www.test.com/XMLService?id=http://www.test.com/XMLService/Order/123 an uri with an id parameter
 * <li>http://www.test.com/XMLService/Order/123 a direct uri with a type and id</li>
 * <li>http://www.test.com/XMLService/Order an uri with just a type (and optional page parameters).</li>
 * </ul>
 * 
 * The response of this web service is an instance of the {@link ResponseType}.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public class RetrieveModelOperation extends ModelOperation {

  private static final String FALSE = Boolean.FALSE.toString();

  @Override
  protected void internalExecute() {
    // 1) there is a query!
    if (getServiceContext().getRequestParameters().containsKey(ServiceConstants.PARAM_QUERY)) {
      final String qryStr = (String) getServiceContext().getRequestParameters().get(ServiceConstants.PARAM_QUERY);

      int maxResults = getMaxResults();
      int startRow = getFirstResult() == -1 ? 0 : getFirstResult();

      if (!doCount() && maxResults != -1) {
        // try to get one more than the requested result size
        // if we should not do count
        maxResults++;
      }

      @SuppressWarnings("unchecked")
      final List<Object> resultList = (List<Object>) getObjectStore().query(qryStr, new HashMap<String, Object>(),
          startRow, maxResults);

      // now do smart things, to prevent unnecessary count operations
      long cnt;
      if (resultList.size() < maxResults) {
        // we did not get everything so we reached the end anyway
        cnt = resultList.size() + startRow;
      } else if (maxResults == -1) {
        // if there were no paging limitations then this is the size
        cnt = resultList.size() + startRow;
      } else if (doCount()) {
        cnt = getObjectStore().count(qryStr, new HashMap<String, Object>());
      } else {
        // okay then the count is one more than the original maxresults
        cnt = maxResults;
        // remove the last result from the result
        resultList.remove(resultList.size() - 1);
      }

      final Object responseObject = getResponse(resultList, startRow, startRow + resultList.size(), cnt);
      getServiceContext().setResultInResponse(responseObject);
    } else if (getServiceContext().getRequestParameters().containsKey(ServiceConstants.PARAM_ID)) {
      // an id which must be a uri
      final URI uri = URI.createURI((String) getServiceContext().getRequestParameters().get(ServiceConstants.PARAM_ID));
      final Object object = getObjectStore().fromUri(uri);
      getServiceContext().setResultInResponse(object);
    } else {
      final String[] segments = ServiceUtils.getSegments(getServiceContext().getServiceRequestURI());
      if (segments.length == 0) {
        throw new IllegalArgumentException("Service path " + getServiceContext().getServiceRequestURI() //$NON-NLS-1$
            + " not supported, uri " + getServiceContext().getRequestURI()); //$NON-NLS-1$
      } else if (segments.length == 1) {
        // 2) there is a specific type without an id, return all instances
        final EClass eClass = ModelUtils.getEClassFromQualifiedName(segments[0]);
        @SuppressWarnings("unchecked")
        final List<Object> resultList = (List<Object>) getObjectStore()
            .query(eClass, getFirstResult(), getMaxResults());

        int maxResults = getMaxResults();
        int startRow = getFirstResult() == -1 ? 0 : getFirstResult();

        if (!doCount() && maxResults != -1) {
          // try to get one more than the requested result size
          // if we should not do count
          maxResults++;
        }

        // now do smart things, to prevent unnecessary count operations
        long cnt;
        if (resultList.size() < maxResults) {
          // we did not get everything so we reached the end anyway
          cnt = resultList.size() + startRow;
        } else if (maxResults == -1) {
          // if there were no paging limitations then this is the size
          cnt = resultList.size() + startRow;
        } else if (doCount()) {
          cnt = getObjectStore().count(
              "from " + getObjectStore().getEntityName(eClass) + " e", new HashMap<String, Object>()); //$NON-NLS-1$ //$NON-NLS-2$
        } else {
          // okay then the count is one more than the original maxresults
          cnt = maxResults;
          // remove the last result from the result
          resultList.remove(resultList.size() - 1);
        }

        final Object responseObject = getResponse(resultList, startRow, startRow + resultList.size(), cnt);
        getServiceContext().setResultInResponse(responseObject);
      } else if (segments.length == 2) {
        // 3) there is specific type with an id
        final EClass eClass = ModelUtils.getEClassFromQualifiedName(segments[0]);
        final String idString = segments[1];
        final Object id = IdProvider.getInstance().convertIdStringToId(eClass, idString);
        final Object object = getObjectStore().get(eClass, id);
        if (object == null) {
          getServiceContext().createResourceNotFoundResult();
        } else {
          getServiceContext().setResultInResponse(object);
        }
      } else {
        throw new IllegalArgumentException("Service path " + getServiceContext().getServiceRequestURI() //$NON-NLS-1$
            + " not supported, uri " + getServiceContext().getRequestURI()); //$NON-NLS-1$
      }
    }
  }

  protected ResponseType getResponse(List<Object> objects, int startRow, int endRow, long totalRows) {
    final ResponseType responseType = ResponseModelPackage.INSTANCE.getModelFactory().createResponseType();
    responseType.setEndRow(endRow);
    responseType.setStartRow(startRow);
    responseType.setTotalRows(totalRows);
    responseType.setStatus(ServiceConstants.STATUS_SUCCESS);
    responseType.setData(objects);
    return responseType;
  }

  private boolean doCount() {
    // if there is no limit on the max results and there is no first row then don't count
    if (getMaxResults() == -1 && getFirstResult() == -1) {
      return false;
    }
    final String noCountParam = (String) getServiceContext().getRequestParameters()
        .get(ServiceConstants.PARAM_NO_COUNT);
    return noCountParam == null || FALSE.equals(noCountParam);
  }
}
