package org.eclipse.emf.texo.test.model.issues.bz486803.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz486803.ClzOne;
import org.eclipse.emf.texo.test.model.issues.bz486803.InterfaceTestModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ClzOne</b></em>'.
 *
 * @generated
 */
public class ClzOneDao extends BaseDao<ClzOne> {

  /**
   * @generated
   */
  @Override
  public Class<ClzOne> getEntityClass() {
    return ClzOne.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return InterfaceTestModelPackage.INSTANCE.getClzOneEClass();
  }
}
