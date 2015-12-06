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

/**
 * Tests the XML web service.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class WSMainJSONTest extends WSMainTest {

  @Override
  protected boolean isXmlTest() {
    return false;
  }

}