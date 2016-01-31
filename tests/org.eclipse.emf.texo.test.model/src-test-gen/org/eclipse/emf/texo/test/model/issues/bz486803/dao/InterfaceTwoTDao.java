package org.eclipse.emf.texo.test.model.issues.bz486803.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz486803.InterfaceTestModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz486803.InterfaceTwoT;

/**
 * The Dao implementation for the model object '<em><b>InterfaceTwoT</b></em>'.
 *
 * @generated
 */
public class InterfaceTwoTDao extends BaseDao<InterfaceTwoT> {

  /**
   * @generated
   */
  @Override
  public Class<InterfaceTwoT> getEntityClass() {
    return InterfaceTwoT.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return InterfaceTestModelPackage.INSTANCE.getInterfaceTwoTEClass();
  }
}
