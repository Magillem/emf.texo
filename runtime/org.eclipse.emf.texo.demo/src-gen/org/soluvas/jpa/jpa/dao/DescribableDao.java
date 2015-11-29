package org.soluvas.jpa.jpa.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.soluvas.jpa.jpa.Describable;
import org.soluvas.jpa.jpa.JpaModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Describable</b></em>'.
 *
 * @generated
 */
public class DescribableDao extends BaseDao<Describable> {

	/**
	 * @generated
	 */
	@Override
	public Class<Describable> getEntityClass() {
		return Describable.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return JpaModelPackage.INSTANCE.getDescribableEClass();
	}
}
