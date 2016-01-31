/**
 * <copyright>
 *
 * Copyright (c) 2014 Springsite BV (The Netherlands) and others
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
 * $Id: TestModelAccess.java,v 1.7 2011/08/25 12:42:19 mtaal Exp $
 */

package org.eclipse.emf.texo.test;

import org.eclipse.emf.texo.test.model.issues.bz486803.ClzOne;
import org.eclipse.emf.texo.test.model.issues.bz486803.InterfaceOneT;
import org.eclipse.emf.texo.test.model.issues.bz486803.InterfaceThreeT;
import org.eclipse.emf.texo.test.model.issues.bz486803.InterfaceTwoT;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=486803
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */

public class TestBz486803 extends TestCase {

  @Test
  public void test() {
    {
      Class<?> clz = InterfaceOneT.class;
      assertEquals(2, clz.getInterfaces().length);
      assertEquals(InterfaceTwoT.class, clz.getInterfaces()[1]);
      assertEquals(InterfaceThreeT.class, clz.getInterfaces()[0]);
    }
    {
      Class<?> clz = ClzOne.class;
      assertEquals(2, clz.getInterfaces().length);
      assertEquals(InterfaceTwoT.class, clz.getInterfaces()[1]);
      assertEquals(InterfaceThreeT.class, clz.getInterfaces()[0]);
    }
  }
}