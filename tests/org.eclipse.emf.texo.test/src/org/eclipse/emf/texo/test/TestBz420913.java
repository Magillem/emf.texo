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

import java.lang.reflect.Method;

import junit.framework.TestCase;

import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.test.model.issues.bz420913.Bz420913ModelFactory;
import org.eclipse.emf.texo.test.model.issues.bz420913.Bz420913ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz420913.Bz420913_O;
import org.eclipse.emf.texo.test.model.issues.bz420913.Bz420913_T;
import org.eclipse.emf.texo.test.model.issues.bz420913notbidirectional.Bz420913_NotBiDirectionalModelFactory;
import org.eclipse.emf.texo.test.model.issues.bz420913notbidirectional.Bz420913_NotBiDirectionalModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz420913notbidirectional.Bz420913_NotBiDirectional_O;
import org.eclipse.emf.texo.test.model.issues.bz420913notbidirectional.Bz420913_NotBiDirectional_T;
import org.junit.Assert;
import org.junit.Test;

/**
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=420913
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */

public class TestBz420913 extends TestCase {

  @Test
  public void test() {
    doTestBidirectionalDirectApi();
    doTestBidirectionalModelObjectApi();

    doTestNotBidirectionalDirectApi();
  }

  private void doTestNotBidirectionalDirectApi() {
    Bz420913_NotBiDirectionalModelFactory factory = Bz420913_NotBiDirectionalModelPackage.INSTANCE.getModelFactory();
    final Bz420913_NotBiDirectional_O biDirO1 = factory.createBz420913_NotBiDirectional_O();
    final Bz420913_NotBiDirectional_T biDirT1 = factory.createBz420913_NotBiDirectional_T();
    final Bz420913_NotBiDirectional_O biDirO2 = factory.createBz420913_NotBiDirectional_O();
    final Bz420913_NotBiDirectional_T biDirT2 = factory.createBz420913_NotBiDirectional_T();
    final ModelObject<?> moDirO2 = factory.createModelObject(
        Bz420913_NotBiDirectionalModelPackage.INSTANCE.getBz420913_NotBiDirectional_OEClass(), biDirO2);
    final ModelObject<?> moDirT2 = factory.createModelObject(
        Bz420913_NotBiDirectionalModelPackage.INSTANCE.getBz420913_NotBiDirectional_TEClass(), biDirT2);

    biDirO1.setSingleBidirectional(biDirT1);
    Assert.assertNull(biDirT1.getSingleBidirectional());
    biDirT1.setMultiBidirectional(biDirO1);
    Assert.assertTrue(biDirO1.getMultiBidirectional().isEmpty());

    moDirO2.eSet(Bz420913_NotBiDirectionalModelPackage.INSTANCE.getBz420913_NotBiDirectional_O_SingleBidirectional(),
        biDirT2);
    Assert.assertNull(biDirT2.getSingleBidirectional());
    moDirT2.eSet(Bz420913_NotBiDirectionalModelPackage.INSTANCE.getBz420913_NotBiDirectional_T_SingleBidirectional(),
        biDirO2);
    Assert.assertTrue(biDirO1.getMultiBidirectional().isEmpty());

    for (Method m : biDirO2.getClass().getMethods()) {
      if (m.getName().toLowerCase().contains("addto") || m.getName().toLowerCase().contains("removefrom")) { //$NON-NLS-1$//$NON-NLS-2$
        Assert.fail("Unexpected bidirectional or safe many access method " + m.getName()); //$NON-NLS-1$
      }
    }
  }

  private void doTestBidirectionalModelObjectApi() {
    Bz420913ModelFactory factory = Bz420913ModelPackage.INSTANCE.getModelFactory();
    final Bz420913_O biDirO1 = factory.createBz420913_O();
    final Bz420913_T biDirT1 = factory.createBz420913_T();
    final Bz420913_O biDirO2 = factory.createBz420913_O();
    final Bz420913_T biDirT2 = factory.createBz420913_T();

    final ModelObject<?> moDirO1 = factory.createModelObject(Bz420913ModelPackage.INSTANCE.getBz420913_OEClass(),
        biDirO1);
    final ModelObject<?> moDirO2 = factory.createModelObject(Bz420913ModelPackage.INSTANCE.getBz420913_OEClass(),
        biDirO2);
    final ModelObject<?> moDirT1 = factory.createModelObject(Bz420913ModelPackage.INSTANCE.getBz420913_TEClass(),
        biDirT1);
    final ModelObject<?> moDirT2 = factory.createModelObject(Bz420913ModelPackage.INSTANCE.getBz420913_TEClass(),
        biDirT2);

    // multi-to-single
    // initial
    Assert.assertNull(moDirT1.eGet(Bz420913ModelPackage.INSTANCE.getBz420913_T_MultiBidirectional()));
    // add
    moDirO1.eAddTo(Bz420913ModelPackage.INSTANCE.getBz420913_O_MultiBidirectional(), biDirT1);
    Assert.assertEquals(biDirO1, biDirT1.getMultiBidirectional());
    Assert.assertEquals(biDirO1, moDirT1.eGet(Bz420913ModelPackage.INSTANCE.getBz420913_T_MultiBidirectional()));
    // remove
    moDirO1.eRemoveFrom(Bz420913ModelPackage.INSTANCE.getBz420913_O_MultiBidirectional(), biDirT1);
    Assert.assertNull(moDirT1.eGet(Bz420913ModelPackage.INSTANCE.getBz420913_T_MultiBidirectional()));
    Assert.assertNull(biDirT1.getMultiBidirectional());
    // set from single
    moDirT1.eSet(Bz420913ModelPackage.INSTANCE.getBz420913_T_MultiBidirectional(), biDirO1);
    Assert.assertEquals(biDirO1.getMultiBidirectional().get(0), biDirT1);
    Assert.assertEquals(biDirO1, biDirT1.getMultiBidirectional());
    Assert.assertEquals(biDirO1, moDirT1.eGet(Bz420913ModelPackage.INSTANCE.getBz420913_T_MultiBidirectional()));

    // set a second one
    moDirO1.eAddTo(Bz420913ModelPackage.INSTANCE.getBz420913_O_MultiBidirectional(), biDirT2);
    Assert.assertEquals(biDirO1.getMultiBidirectional().get(1), biDirT2);
    Assert.assertEquals(biDirO1, biDirT2.getMultiBidirectional());
    Assert.assertEquals(biDirO1, moDirT2.eGet(Bz420913ModelPackage.INSTANCE.getBz420913_T_MultiBidirectional()));

    // set second from single side, first remove
    moDirO1.eRemoveFrom(Bz420913ModelPackage.INSTANCE.getBz420913_O_MultiBidirectional(), biDirT2);
    Assert.assertTrue(biDirO1.getMultiBidirectional().size() == 1);
    // set from single side again
    moDirT2.eSet(Bz420913ModelPackage.INSTANCE.getBz420913_T_MultiBidirectional(), biDirO1);
    Assert.assertEquals(biDirO1.getMultiBidirectional().get(1), biDirT2);

    // replace
    moDirO2.eAddTo(Bz420913ModelPackage.INSTANCE.getBz420913_O_MultiBidirectional(), biDirT2);
    Assert.assertEquals(biDirO2.getMultiBidirectional().get(0), biDirT2);
    Assert.assertEquals(biDirO2, biDirT2.getMultiBidirectional());
    // should be removed on the other side
    Assert.assertTrue(biDirO1.getMultiBidirectional().size() == 1);

    // single-to-single
    // set
    moDirO1.eSet(Bz420913ModelPackage.INSTANCE.getBz420913_O_SingleBidirectional(), biDirT1);
    Assert.assertEquals(biDirT1.getSingleBidirectional(), biDirO1);
    // remove
    moDirO1.eSet(Bz420913ModelPackage.INSTANCE.getBz420913_O_SingleBidirectional(), null);
    biDirO1.setSingleBidirectional(null);
    Assert.assertNull(biDirT1.getSingleBidirectional());

    // set and replace
    moDirO1.eSet(Bz420913ModelPackage.INSTANCE.getBz420913_O_SingleBidirectional(), biDirT1);
    Assert.assertEquals(biDirT1.getSingleBidirectional(), biDirO1);
    moDirO1.eSet(Bz420913ModelPackage.INSTANCE.getBz420913_O_SingleBidirectional(), biDirT2);
    Assert.assertNull(biDirT1.getSingleBidirectional());
    Assert.assertEquals(biDirT2.getSingleBidirectional(), biDirO1);

    moDirO2.eSet(Bz420913ModelPackage.INSTANCE.getBz420913_O_SingleBidirectional(), biDirT2);
    Assert.assertNull(biDirO1.getSingleBidirectional());
    Assert.assertEquals(biDirT2.getSingleBidirectional(), biDirO2);

    // multi-to-multi
    moDirO1.eAddTo(Bz420913ModelPackage.INSTANCE.getBz420913_O_MultiMultiBidirectional(), biDirT1);
    moDirO1.eAddTo(Bz420913ModelPackage.INSTANCE.getBz420913_O_MultiMultiBidirectional(), biDirT2);
    Assert.assertTrue(biDirT1.getMultiMultiBidirectional().contains(biDirO1));
    Assert.assertTrue(biDirT2.getMultiMultiBidirectional().contains(biDirO1));
    moDirO2.eAddTo(Bz420913ModelPackage.INSTANCE.getBz420913_O_MultiMultiBidirectional(), biDirT1);
    moDirO2.eAddTo(Bz420913ModelPackage.INSTANCE.getBz420913_O_MultiMultiBidirectional(), biDirT2);
    Assert.assertTrue(biDirT1.getMultiMultiBidirectional().contains(biDirO2));
    Assert.assertTrue(biDirT2.getMultiMultiBidirectional().contains(biDirO2));
    moDirT1.eRemoveFrom(Bz420913ModelPackage.INSTANCE.getBz420913_T_MultiMultiBidirectional(), biDirO1);
    biDirT1.removeFromMultiMultiBidirectional(biDirO1);
    Assert.assertTrue(!biDirO1.getMultiMultiBidirectional().contains(biDirT1));
    moDirT2.eRemoveFrom(Bz420913ModelPackage.INSTANCE.getBz420913_T_MultiMultiBidirectional(), biDirO1);
    Assert.assertTrue(!biDirO1.getMultiMultiBidirectional().contains(biDirT2));

  }

  private void doTestBidirectionalDirectApi() {
    Bz420913ModelFactory factory = Bz420913ModelPackage.INSTANCE.getModelFactory();
    final Bz420913_O biDirO1 = factory.createBz420913_O();
    final Bz420913_T biDirT1 = factory.createBz420913_T();
    final Bz420913_O biDirO2 = factory.createBz420913_O();
    final Bz420913_T biDirT2 = factory.createBz420913_T();

    // multi-to-single
    // initial
    Assert.assertNull(biDirT1.getMultiBidirectional());
    // add
    biDirO1.addToMultiBidirectional(biDirT1);
    Assert.assertEquals(biDirO1, biDirT1.getMultiBidirectional());
    // remove
    biDirO1.removeFromMultiBidirectional(biDirT1);
    Assert.assertNull(biDirT1.getMultiBidirectional());
    // set from single
    biDirT1.setMultiBidirectional(biDirO1);
    Assert.assertEquals(biDirO1.getMultiBidirectional().get(0), biDirT1);
    // set a second one
    biDirO1.addToMultiBidirectional(biDirT2);
    Assert.assertEquals(biDirO1.getMultiBidirectional().get(1), biDirT2);
    Assert.assertEquals(biDirO1, biDirT2.getMultiBidirectional());

    // set second from single side, first remove
    biDirO1.removeFromMultiBidirectional(biDirT2);
    Assert.assertTrue(biDirO1.getMultiBidirectional().size() == 1);
    // set from single side again
    biDirT2.setMultiBidirectional(biDirO1);
    Assert.assertEquals(biDirO1.getMultiBidirectional().get(1), biDirT2);

    // replace
    biDirO2.addToMultiBidirectional(biDirT2);
    Assert.assertEquals(biDirO2.getMultiBidirectional().get(0), biDirT2);
    Assert.assertEquals(biDirO2, biDirT2.getMultiBidirectional());
    // should be removed on the other side
    Assert.assertTrue(biDirO1.getMultiBidirectional().size() == 1);

    // single-to-single
    // set
    biDirO1.setSingleBidirectional(biDirT1);
    Assert.assertEquals(biDirT1.getSingleBidirectional(), biDirO1);
    // remove
    biDirO1.setSingleBidirectional(null);
    Assert.assertNull(biDirT1.getSingleBidirectional());

    // set and replace
    biDirO1.setSingleBidirectional(biDirT1);
    Assert.assertEquals(biDirT1.getSingleBidirectional(), biDirO1);
    biDirO1.setSingleBidirectional(biDirT2);
    Assert.assertNull(biDirT1.getSingleBidirectional());
    Assert.assertEquals(biDirT2.getSingleBidirectional(), biDirO1);

    biDirO2.setSingleBidirectional(biDirT2);
    Assert.assertNull(biDirO1.getSingleBidirectional());
    Assert.assertEquals(biDirT2.getSingleBidirectional(), biDirO2);

    // multi-to-multi
    biDirO1.addToMultiMultiBidirectional(biDirT1);
    biDirO1.addToMultiMultiBidirectional(biDirT2);
    Assert.assertTrue(biDirT1.getMultiMultiBidirectional().contains(biDirO1));
    Assert.assertTrue(biDirT2.getMultiMultiBidirectional().contains(biDirO1));
    biDirO2.addToMultiMultiBidirectional(biDirT1);
    biDirO2.addToMultiMultiBidirectional(biDirT2);
    Assert.assertTrue(biDirT1.getMultiMultiBidirectional().contains(biDirO2));
    Assert.assertTrue(biDirT2.getMultiMultiBidirectional().contains(biDirO2));
    biDirT1.removeFromMultiMultiBidirectional(biDirO1);
    Assert.assertTrue(!biDirO1.getMultiMultiBidirectional().contains(biDirT1));
    biDirT2.removeFromMultiMultiBidirectional(biDirO1);
    Assert.assertTrue(!biDirO1.getMultiMultiBidirectional().contains(biDirT2));

  }
}