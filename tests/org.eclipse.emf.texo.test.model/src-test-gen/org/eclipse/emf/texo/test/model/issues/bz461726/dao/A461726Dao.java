package org.eclipse.emf.texo.test.model.issues.bz461726.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz461726.A461726;
import org.eclipse.emf.texo.test.model.issues.bz461726.PK461726ModelPackage;

/**
 * The Dao implementation for the model object '<em><b>A461726</b></em>'.
 *
 * @generated
 */
public class A461726Dao extends BaseDao<A461726> {

  /**
   * @generated
   */
  @Override
  public Class<A461726> getEntityClass() {
    return A461726.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return PK461726ModelPackage.INSTANCE.getA461726EClass();
  }
}
