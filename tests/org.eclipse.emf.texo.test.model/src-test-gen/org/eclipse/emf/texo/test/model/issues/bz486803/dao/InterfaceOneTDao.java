package org.eclipse.emf.texo.test.model.issues.bz486803.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz486803.InterfaceOneT;
import org.eclipse.emf.texo.test.model.issues.bz486803.InterfaceTestModelPackage;

/**
 * The Dao implementation for the model object '<em><b>InterfaceOneT</b></em>'.
 *
 * @generated
 */
public class InterfaceOneTDao extends BaseDao<InterfaceOneT> {

  /**
   * @generated
   */
  @Override
  public Class<InterfaceOneT> getEntityClass() {
    return InterfaceOneT.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return InterfaceTestModelPackage.INSTANCE.getInterfaceOneTEClass();
  }
}
