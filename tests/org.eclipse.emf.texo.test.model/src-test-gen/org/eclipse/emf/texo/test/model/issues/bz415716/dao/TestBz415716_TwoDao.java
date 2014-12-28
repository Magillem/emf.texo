package org.eclipse.emf.texo.test.model.issues.bz415716.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz415716.Bz415716ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz415716.TestBz415716_Two;

/**
 * The Dao implementation for the model object '<em><b>TestBz415716_Two</b></em>'.
 *
 * @generated
 */
public class TestBz415716_TwoDao extends BaseDao<TestBz415716_Two> {

  /**
   * @generated
   */
  @Override
  public Class<TestBz415716_Two> getEntityClass() {
    return TestBz415716_Two.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz415716ModelPackage.INSTANCE.getTestBz415716_TwoEClass();
  }
}
