package org.eclipse.emf.texo.test.model.issues.bz444321.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz444321.Bz444321ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz444321.MainElement;

/**
 * The Dao implementation for the model object '<em><b>MainElement</b></em>'.
 *
 * @generated
 */
public class MainElementDao extends BaseDao<MainElement> {

  /**
   * @generated
   */
  @Override
  public Class<MainElement> getEntityClass() {
    return MainElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz444321ModelPackage.INSTANCE.getMainElementEClass();
  }
}
