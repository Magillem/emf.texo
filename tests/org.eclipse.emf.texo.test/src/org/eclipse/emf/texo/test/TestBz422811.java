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

import junit.framework.TestCase;

import org.eclipse.emf.texo.test.model.issues.bz422811.Bz422811ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz422811.EClassA;
import org.junit.Assert;
import org.junit.Test;

/**
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=422811
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */

public class TestBz422811 extends TestCase {

  @Test
  public void test() {
    final EClassA a = Bz422811ModelPackage.INSTANCE.getModelFactory().createEClassA();
    Assert.assertNull(a.getValue());
  }
}