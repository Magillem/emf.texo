package test.def.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import test.def.DefModelPackage;
import test.def.T2;

/**
 * The Dao implementation for the model object '<em><b>T2</b></em>'.
 *
 * @generated
 */
public class T2Dao extends BaseDao<T2> {

	/**
	 * @generated
	 */
	@Override
	public Class<T2> getEntityClass() {
		return T2.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return DefModelPackage.INSTANCE.getT2EClass();
	}
}
