package org.soluvas.jpa.jpa.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.soluvas.jpa.jpa.JpaModelPackage;
import org.soluvas.jpa.jpa.NameContainer;

/**
 * The Dao implementation for the model object '<em><b>NameContainer</b></em>'.
 *
 * @generated
 */
public class NameContainerDao extends BaseDao<NameContainer> {

	/**
	 * @generated
	 */
	@Override
	public Class<NameContainer> getEntityClass() {
		return NameContainer.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return JpaModelPackage.INSTANCE.getNameContainerEClass();
	}
}
