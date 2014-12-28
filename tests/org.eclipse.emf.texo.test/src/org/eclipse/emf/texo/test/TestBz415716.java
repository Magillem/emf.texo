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
 * $Id: TestModelAccess.java,v 1.7 2011/08/25 12:42:19 mtaal Exp $
 */

package org.eclipse.emf.texo.test;

import junit.framework.TestCase;

import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.test.model.issues.bz415716.Bz415716ModelFactory;
import org.eclipse.emf.texo.test.model.issues.bz415716.Bz415716ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz415716.TestBz415716_One;
import org.eclipse.emf.texo.test.model.issues.bz415716.TestBz415716_Two;
import org.junit.Test;

/**
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=415716
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */

public class TestBz415716 extends TestCase {

  @Test
  public void test() {
    final Bz415716ModelFactory factory = Bz415716ModelPackage.MODELFACTORY;
    {
      final TestBz415716_One one = factory.createTestBz415716_One();
      final TestBz415716_Two two = factory.createTestBz415716_Two();

      assertTrue(one.addToTwo(two));
      assertFalse(one.addToTwo(two));
      assertTrue(one.removeFromTwo(two));
      assertFalse(one.removeFromTwo(two));
      assertFalse(one.removeFromTwo(factory.createTestBz415716_Two()));
      assertTrue(one.addToTwo(two));
      two.setOne(one);
    }
    {
      final TestBz415716_One one = factory.createTestBz415716_One();
      final TestBz415716_Two two = factory.createTestBz415716_Two();
      final ModelObject<TestBz415716_One> moOne = factory.createModelObject(
          Bz415716ModelPackage.INSTANCE.getTestBz415716_OneEClass(), one);

      assertTrue(moOne.eAddTo(Bz415716ModelPackage.INSTANCE.getTestBz415716_One_Two(), two));
      assertFalse(moOne.eAddTo(Bz415716ModelPackage.INSTANCE.getTestBz415716_One_Two(), two));
      assertTrue(moOne.eRemoveFrom(Bz415716ModelPackage.INSTANCE.getTestBz415716_One_Two(), two));
      assertFalse(moOne.eRemoveFrom(Bz415716ModelPackage.INSTANCE.getTestBz415716_One_Two(), two));
      assertFalse(moOne.eRemoveFrom(Bz415716ModelPackage.INSTANCE.getTestBz415716_One_Two(),
          factory.createTestBz415716_Two()));
      assertTrue(moOne.eAddTo(Bz415716ModelPackage.INSTANCE.getTestBz415716_One_Two(), two));
      assertTrue(moOne.eRemoveFrom(Bz415716ModelPackage.INSTANCE.getTestBz415716_One_Two(), two));
    }
  }
}