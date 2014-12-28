package org.eclipse.emf.texo.test.model.issues.bz420913notbidirectional.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz420913notbidirectional.Bz420913_NotBiDirectionalModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz420913notbidirectional.Bz420913_NotBiDirectional_O;

/**
 * The Dao implementation for the model object '
 * <em><b>bz420913_NotBiDirectional_O</b></em>'.
 *
 * @generated
 */
public class Bz420913_NotBiDirectional_ODao extends
		BaseDao<Bz420913_NotBiDirectional_O> {

	/**
	 * @generated
	 */
	@Override
	public Class<Bz420913_NotBiDirectional_O> getEntityClass() {
		return Bz420913_NotBiDirectional_O.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return Bz420913_NotBiDirectionalModelPackage.INSTANCE
				.getBz420913_NotBiDirectional_OEClass();
	}
}
