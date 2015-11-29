package org.soluvas.jpa.jpa.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.soluvas.jpa.jpa.JpaModelPackage;
import org.soluvas.jpa.jpa.Positionable;

/**
 * The Dao implementation for the model object '<em><b>Positionable</b></em>'.
 *
 * @generated
 */
public class PositionableDao extends BaseDao<Positionable> {

	/**
	 * @generated
	 */
	@Override
	public Class<Positionable> getEntityClass() {
		return Positionable.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return JpaModelPackage.INSTANCE.getPositionableEClass();
	}
}
