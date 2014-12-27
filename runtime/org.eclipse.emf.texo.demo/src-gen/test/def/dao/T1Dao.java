package test.def.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import test.def.DefModelPackage;
import test.def.T1;

/**
 * The Dao implementation for the model object '<em><b>T1</b></em>'.
 *
 * @generated
 */
public class T1Dao extends BaseDao<T1> {

	/**
	 * @generated
	 */
	@Override
	public Class<T1> getEntityClass() {
		return T1.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return DefModelPackage.INSTANCE.getT1EClass();
	}
}
