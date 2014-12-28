package org.eclipse.emf.texo.test.model.issues.bz420913.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz420913.Bz420913ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz420913.Bz420913_T;

/**
 * The Dao implementation for the model object '<em><b>Bz420913_T</b></em>'.
 *
 * @generated
 */
public class Bz420913_TDao extends BaseDao<Bz420913_T> {

  /**
   * @generated
   */
  @Override
  public Class<Bz420913_T> getEntityClass() {
    return Bz420913_T.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz420913ModelPackage.INSTANCE.getBz420913_TEClass();
  }
}
