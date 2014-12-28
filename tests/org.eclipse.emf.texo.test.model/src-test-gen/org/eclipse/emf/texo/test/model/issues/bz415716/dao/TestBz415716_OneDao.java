package org.eclipse.emf.texo.test.model.issues.bz415716.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz415716.Bz415716ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz415716.TestBz415716_One;

/**
 * The Dao implementation for the model object '<em><b>TestBz415716_One</b></em>'.
 *
 * @generated
 */
public class TestBz415716_OneDao extends BaseDao<TestBz415716_One> {

  /**
   * @generated
   */
  @Override
  public Class<TestBz415716_One> getEntityClass() {
    return TestBz415716_One.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz415716ModelPackage.INSTANCE.getTestBz415716_OneEClass();
  }
}
