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

import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.texo.converter.EMFModelConverter;
import org.eclipse.emf.texo.converter.ModelEMFConverter;
import org.eclipse.emf.texo.json.JSONModelConverter;
import org.eclipse.emf.texo.json.ModelJSONConverter;
import org.eclipse.emf.texo.test.model.issues.bz461726.A461726;
import org.eclipse.emf.texo.test.model.issues.bz461726.B461726;
import org.eclipse.emf.texo.test.model.issues.bz461726.PK461726ModelFactory;
import org.eclipse.emf.texo.test.model.issues.bz461726.PK461726ModelPackage;
import org.eclipse.emf.texo.xml.ModelXMLLoader;
import org.eclipse.emf.texo.xml.ModelXMLSaver;
import org.json.JSONArray;
import org.junit.Test;

/**
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=461726
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */

public class TestBz461726 extends TestCase {

  private static final int LIST_SIZE = 3;

  @Test
  public void test() {
    final PK461726ModelFactory factory = PK461726ModelPackage.MODELFACTORY;
    final List<A461726> as = new ArrayList<A461726>();
    final List<B461726> bs = new ArrayList<B461726>();
    for (int i = 0; i < LIST_SIZE; i++) {
      A461726 a = factory.createA461726();
      a.setName(i + ""); //$NON-NLS-1$
      a.setDb_Id(new Long(i));
      a.setDb_version(i);
      as.add(a);
      B461726 b = factory.createB461726();
      b.setName(i + ""); //$NON-NLS-1$
      b.setDb_Id(new Long(i));
      b.setDb_version(i);
      bs.add(b);
    }
    // get inverted bs
    List<B461726> invertedBs = new ArrayList<B461726>();
    for (int i = 0; i < LIST_SIZE; i++) {
      invertedBs.add(bs.get(2 - i));
    }

    for (int i = 0; i < 3; i++) {
      if (i % 2 == 0) {
        as.get(i).setBs(invertedBs);
      } else {
        as.get(i).setBs(bs);
      }
    }

    testEMFConversion(as, bs);
    testXMLConversion(as, bs, invertedBs);
    testJSONConversion(as, bs, invertedBs);
  }

  private void testEMFConversion(List<A461726> as, List<B461726> bs) {
    final EMFModelConverter emfModelConverter = new EMFModelConverter();
    final ModelEMFConverter modelEMFConverter = new ModelEMFConverter();
    modelEMFConverter.setConvertNonContainedReferencedObjects(true);
    List<EObject> eos = modelEMFConverter.convert(new ArrayList<Object>(as));
    List<Object> os = emfModelConverter.convert(eos);
    assertEquals(LIST_SIZE, os.size());
    for (int i = 0; i < LIST_SIZE; i++) {
      compareA(as.get(i), (A461726) os.get(i));
    }
  }

  private void testXMLConversion(List<A461726> as, List<B461726> bs, List<B461726> invertedBs) {
    List<Object> newObjects;
    String xml1 = ""; //$NON-NLS-1$
    String xml2 = ""; //$NON-NLS-1$
    {
      ModelXMLSaver xmlSaver = new ModelXMLSaver();
      xmlSaver.setSaveAsXMI(true);
      xmlSaver.setObjects(new ArrayList<Object>());
      xmlSaver.getObjects().addAll(invertedBs);
      xmlSaver.getObjects().addAll(as);
      StringWriter strWriter = new StringWriter();
      xmlSaver.setWriter(strWriter);
      xmlSaver.write();
      xml1 = strWriter.toString();

      ModelXMLLoader xmlLoader = new ModelXMLLoader();
      xmlLoader.setLoadAsXMI(true);
      StringReader strReader = new StringReader(xml1);
      xmlLoader.setReader(strReader);

      newObjects = xmlLoader.read();
      int i = 0;
      for (Object o : newObjects) {
        if (o instanceof A461726) {
          compareA(as.get(i), (A461726) o);
          i++;
        }
      }
    }
    {
      ModelXMLSaver xmlSaver = new ModelXMLSaver();
      xmlSaver.setSaveAsXMI(true);
      xmlSaver.setObjects(newObjects);
      StringWriter strWriter = new StringWriter();
      xmlSaver.setWriter(strWriter);
      xmlSaver.write();
      xml2 = strWriter.toString();
    }
    assertEquals(xml1, xml2);
  }

  private void testJSONConversion(List<A461726> as, List<B461726> bs, List<B461726> invertedBs) {
    List<Object> objects;
    Object json1;
    Object json2;
    {
      ModelJSONConverter modelJSONConverter = new ModelJSONConverter();
      modelJSONConverter.setConvertNonContainedReferencedObjects(true);
      JSONModelConverter jsonModelConverter = new JSONModelConverter();

      final List<Object> in = new ArrayList<Object>();
      in.addAll(invertedBs);
      in.addAll(as);
      json1 = modelJSONConverter.convert(in);
      objects = jsonModelConverter.convert((JSONArray) json1);
      int i = 0;
      for (Object o : objects) {
        if (o instanceof A461726) {
          compareA(as.get(i), (A461726) o);
          i++;
        }
      }
    }
    {
      ModelJSONConverter modelJSONConverter = new ModelJSONConverter();
      modelJSONConverter.setConvertNonContainedReferencedObjects(true);
      JSONModelConverter jsonModelConverter = new JSONModelConverter();
      json2 = modelJSONConverter.convert(objects);
      objects = jsonModelConverter.convert((JSONArray) json2);
      int i = 0;
      for (Object o : objects) {
        if (o instanceof A461726) {
          compareA(as.get(i), (A461726) o);
          i++;
        }
      }
    }
    assertEquals(json1.toString(), json2.toString());
  }

  private void compareA(A461726 aOriginal, A461726 aNew) {

    assertEquals(aOriginal.getName(), aNew.getName());
    assertEquals(LIST_SIZE, aNew.getBs().size());

    for (int i = 0; i < LIST_SIZE; i++) {
      compareB(aOriginal.getBs().get(i), aNew.getBs().get(i));
    }
  }

  private void compareB(B461726 bOriginal, B461726 bNew) {
    assertEquals(bOriginal.getName(), bNew.getName());
    assertEquals(LIST_SIZE, bNew.getAs().size());

    for (int i = 0; i < LIST_SIZE; i++) {
      assertEquals(bOriginal.getAs().get(i).getName(), bNew.getAs().get(i).getName());
    }

  }
}