package org.eclipse.emf.texo.test.model.issues.bz486803.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz486803.InterfaceTestModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz486803.InterfaceThreeT;

/**
 * The Dao implementation for the model object '<em><b>InterfaceThreeT</b></em>'.
 *
 * @generated
 */
public class InterfaceThreeTDao extends BaseDao<InterfaceThreeT> {

  /**
   * @generated
   */
  @Override
  public Class<InterfaceThreeT> getEntityClass() {
    return InterfaceThreeT.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return InterfaceTestModelPackage.INSTANCE.getInterfaceThreeTEClass();
  }
}
