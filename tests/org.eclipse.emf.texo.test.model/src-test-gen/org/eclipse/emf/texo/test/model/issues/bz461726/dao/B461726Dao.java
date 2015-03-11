package org.eclipse.emf.texo.test.model.issues.bz461726.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz461726.B461726;
import org.eclipse.emf.texo.test.model.issues.bz461726.PK461726ModelPackage;

/**
 * The Dao implementation for the model object '<em><b>B461726</b></em>'.
 *
 * @generated
 */
public class B461726Dao extends BaseDao<B461726> {

  /**
   * @generated
   */
  @Override
  public Class<B461726> getEntityClass() {
    return B461726.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PK461726ModelPackage.INSTANCE.getB461726EClass();
  }
}
