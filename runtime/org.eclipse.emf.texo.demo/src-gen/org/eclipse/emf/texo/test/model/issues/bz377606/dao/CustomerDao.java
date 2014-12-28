package org.eclipse.emf.texo.test.model.issues.bz377606.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz377606.Customer;
import org.eclipse.emf.texo.test.model.issues.bz377606.OrderModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Customer</b></em>'.
 *
 * @generated
 */
public class CustomerDao extends BaseDao<Customer> {

	/**
	 * @generated
	 */
	@Override
	public Class<Customer> getEntityClass() {
		return Customer.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return OrderModelPackage.INSTANCE.getCustomerEClass();
	}
}
