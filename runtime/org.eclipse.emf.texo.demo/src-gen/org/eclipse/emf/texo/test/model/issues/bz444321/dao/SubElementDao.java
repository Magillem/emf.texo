package org.eclipse.emf.texo.test.model.issues.bz444321.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz444321.Bz444321ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz444321.SubElement;

/**
 * The Dao implementation for the model object '<em><b>SubElement</b></em>'.
 *
 * @generated
 */
public class SubElementDao extends BaseDao<SubElement> {

	/**
	 * @generated
	 */
	@Override
	public Class<SubElement> getEntityClass() {
		return SubElement.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return Bz444321ModelPackage.INSTANCE.getSubElementEClass();
	}
}
