/**
 * <copyright>
 *
 * Copyright (c) 2009, 2010, 2012 Springsite BV (The Netherlands) and others
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
 * $Id: XMLServiceContext.java,v 1.6 2011/08/27 05:40:32 mtaal Exp $
 */
package org.eclipse.emf.texo.server.service.xml;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.texo.server.service.ServiceConstants;
import org.eclipse.emf.texo.server.service.ServiceContext;
import org.eclipse.emf.texo.server.store.ObjectStore;
import org.eclipse.emf.texo.xml.XMLWebServiceObjectResolver;

/**
 * Contains XML specific implementations of the {@link ServiceContext}.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public class XMLServiceContext extends ServiceContext {
  private static String TRUE_STRING = Boolean.TRUE.toString();

  public XMLServiceContext() {
    setResponseContentType(XMLWebServiceObjectResolver.XML_CONTENT_TYPE);
  }

  @Override
  public void setObjectStore(ObjectStore objectStore) {
    objectStore.setUseWebServiceUriFormat(true);
    super.setObjectStore(objectStore);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.server.service.ServiceContext#convertToResultFormat(java.lang.Object)
   */
  @Override
  protected String convertToResultFormat(Object object) {
    int childLevels = 2;
    if (getRequestParameters().containsKey(ServiceConstants.PARAM_CHILD_LEVELS)) {
      try {
        childLevels = Integer.parseInt((String) getRequestParameters().get(ServiceConstants.PARAM_CHILD_LEVELS));
      } catch (NumberFormatException e) {
        // ignore on purpose...
      }
    }

    return getObjectStore().toXML(Collections.singletonList(object), isXmi(), childLevels);
  }

  public boolean isXmi() {
    final String xmiString = (String) getRequestParameters().get(ServiceConstants.PARAM_XMI);
    if (xmiString != null && xmiString.equals(TRUE_STRING)) {
      return true;
    }
    return false;
  }

  @Override
  public List<Object> getRequestData() {
    return getObjectStore().fromXML(getRequestContent(), isXmi());
  }
}
