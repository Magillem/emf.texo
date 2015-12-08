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
 * $Id: ReferersTest.java,v 1.4 2011/08/26 07:58:32 mtaal Exp $
 */
package org.eclipse.emf.texo.server.test.store;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.EPersistenceService;
import org.eclipse.emf.texo.server.web.ObjectStoreFactory;
import org.eclipse.emf.texo.store.EMFResourceObjectStore;
import org.eclipse.emf.texo.store.ObjectStore;
import org.eclipse.emf.texo.store.TexoEMFResourceURIConverter;
import org.eclipse.emf.texo.test.model.issues.bz391624.Bz391624ModelPackage;
import org.eclipse.emf.texo.test.model.samples.library.Book;
import org.eclipse.emf.texo.test.model.samples.library.Library;
import org.eclipse.emf.texo.test.model.samples.library.Writer;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelFactory;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.emap.EmapModelPackage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Tests the {@link EPersistenceService} object.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
@RunWith(Parameterized.class)
public class EMFResourceObjectStoreTest {

  private final int COUNT = 10;

  @Parameterized.Parameters
  public static List<String> getParameters() {
    return Arrays.asList(new String[] { "xml", "xmi" });
  }

  @BeforeClass
  public static void beforeClass() {
    ModelResolver.getInstance().deregister(Bz391624ModelPackage.INSTANCE);
    ModelResolver.getInstance().deregister(EmapModelPackage.INSTANCE);
  }

  @AfterClass
  public static void afterClass() {
    ObjectStoreFactory.setInstance(new ObjectStoreFactory());
    ModelResolver.getInstance().reRegisterModelPackage(Bz391624ModelPackage.INSTANCE);
    ModelResolver.getInstance().reRegisterModelPackage(EmapModelPackage.INSTANCE);
  }

  @Before
  public void before() {
    {
      File xmiFile = new File(getTemporaryDirectoryPath(), "texo_data.xmi");
      if (xmiFile.exists()) {
        xmiFile.delete();
      }
    }
    {
      File xmlFile = new File(getTemporaryDirectoryPath(), "texo_data.xml");
      if (xmlFile.exists()) {
        xmlFile.delete();
      }
    }
    ObjectStoreFactory.setInstance(new ObjectStoreFactory() {

      @Override
      protected ObjectStore createObjectStoreLocal(HttpServletRequest request, String objectStoreUri) {
        ObjectStore os = super.createEMFResourceObjectStore();
        if ("xml".equals(fileExtension)) {
          final EMFResourceObjectStore eos = (EMFResourceObjectStore) os;
          ((TexoEMFResourceURIConverter) eos.getURIConverter())
              .setResourceType(TexoEMFResourceURIConverter.ResourceType.XML);
        }
        return os;
      }
    });
  }

  @After
  public void after() {
    ObjectStoreFactory.setInstance(new ObjectStoreFactory());
  }

  private String fileExtension;
  private String uriStr;

  public EMFResourceObjectStoreTest(String extension) {
    fileExtension = extension;
    uriStr = null;
  }

  @Test
  public void testPersistenceRead() {
    createPersistTestData();
    readAdd();
    readRemove();
    readUpdate();
  }

  private void readAdd() {
    ObjectStore os = getObjectStore();
    os.begin();
    Assert.assertEquals(1,
        os.count("FROM " + LibraryModelPackage.INSTANCE.getLibraryEClass().getName(), new HashMap<String, Object>()));
    Assert.assertEquals(COUNT,
        os.count("FROM " + LibraryModelPackage.INSTANCE.getBookEClass().getName(), new HashMap<String, Object>()));
    Library lib = (Library) os.query(LibraryModelPackage.INSTANCE.getLibraryEClass(), 0, 100).get(0);
    Book bk = LibraryModelPackage.INSTANCE.getModelFactory().createBook();
    bk.setTitle("Title " + 11);
    bk.setPages(11);
    lib.getBooks().add(bk);
    os.insert(bk);
    os.commit();
  }

  private void readRemove() {
    ObjectStore os = getObjectStore();
    os.begin();
    Assert.assertEquals(1,
        os.count("FROM " + LibraryModelPackage.INSTANCE.getLibraryEClass().getName(), new HashMap<String, Object>()));
    Assert.assertEquals(COUNT + 1,
        os.count("FROM " + LibraryModelPackage.INSTANCE.getBookEClass().getName(), new HashMap<String, Object>()));
    Library lib = (Library) os.query(LibraryModelPackage.INSTANCE.getLibraryEClass(), 0, 100).get(0);
    {
      os.remove(lib.getBooks().get(0));
      Book bk = lib.getBooks().remove(0);
      if (bk.getAuthor() != null) {
        bk.getAuthor().getBooks().remove(bk);
      }
    }
    {
      os.remove(lib.getBooks().get(0));
      Book bk = lib.getBooks().remove(0);
      if (bk.getAuthor() != null) {
        bk.getAuthor().getBooks().remove(bk);
      }
    }
    os.commit();
  }

  private void readUpdate() {
    String newTitle = "UPDATE TRY";
    {
      ObjectStore os = getObjectStore();
      os.begin();
      Assert.assertEquals(1,
          os.count("FROM " + LibraryModelPackage.INSTANCE.getLibraryEClass().getName(), new HashMap<String, Object>()));
      Assert.assertEquals(COUNT - 1,
          os.count("FROM " + LibraryModelPackage.INSTANCE.getBookEClass().getName(), new HashMap<String, Object>()));
      Library lib = (Library) os.query(LibraryModelPackage.INSTANCE.getLibraryEClass(), 0, 100).get(0);
      lib.getBooks().get(5).setTitle(newTitle);
      os.commit();
    }
    {
      ObjectStore os = getObjectStore();
      os.begin();
      Library lib = (Library) os.query(LibraryModelPackage.INSTANCE.getLibraryEClass(), 0, 100).get(0);
      Assert.assertEquals(newTitle, lib.getBooks().get(5).getTitle());
      os.commit();
    }
  }

  protected void createPersistTestData() {
    ObjectStore os = getObjectStore();
    os.begin();
    LibraryModelFactory modelFactory = LibraryModelPackage.INSTANCE.getModelFactory();
    Library library = modelFactory.createLibrary();
    library.setName("T1");
    os.insert(library);
    for (int i = 0; i < COUNT; i++) {
      Book bk = modelFactory.createBook();
      bk.setTitle("Title " + i);
      bk.setPages(i);
      Writer w = modelFactory.createWriter();
      w.setName("Name " + i);
      w.getBooks().add(bk);
      bk.setAuthor(w);
      library.getBooks().add(bk);
      library.getWriters().add(w);
      os.insert(bk);
      os.insert(w);
    }
    os.commit();
  }

  protected ObjectStore getObjectStore() {
    try {
      final EMFResourceObjectStore objectStore = ComponentProvider.getInstance()
          .newInstance(EMFResourceObjectStore.class);
      if (uriStr == null) {
        uriStr = "http://localhost:8080/texo/data";
      }
      objectStore.setUri(URI.createURI(uriStr));
      objectStore.setChildLevels(1);
      return objectStore;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
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
