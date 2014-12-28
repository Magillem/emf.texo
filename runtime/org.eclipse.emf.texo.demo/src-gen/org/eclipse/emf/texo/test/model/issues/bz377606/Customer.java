package org.eclipse.emf.texo.test.model.issues.bz377606;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * A representation of the model object '<em><b>Customer</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Order_Customer")
public class Customer {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String firstName = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String lastName = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.ALL })
	private Address address = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private Double id = null;

	/**
	 * Returns the value of '<em><b>firstName</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>firstName</b></em>' feature
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the '{@link Customer#getFirstName() <em>firstName</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFirstName
	 *            the new value of the '{@link Customer#getFirstName()
	 *            firstName}' feature.
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}

	/**
	 * Returns the value of '<em><b>lastName</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>lastName</b></em>' feature
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the '{@link Customer#getLastName() <em>lastName</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newLastName
	 *            the new value of the '{@link Customer#getLastName() lastName}'
	 *            feature.
	 * @generated
	 */
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}

	/**
	 * Returns the value of '<em><b>address</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>address</b></em>' feature
	 * @generated
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Sets the '{@link Customer#getAddress() <em>address</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newAddress
	 *            the new value of the '{@link Customer#getAddress() address}'
	 *            feature.
	 * @generated
	 */
	public void setAddress(Address newAddress) {
		address = newAddress;
	}

	/**
	 * Returns the value of '<em><b>id</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>id</b></em>' feature
	 * @generated
	 */
	public Double getId() {
		return id;
	}

	/**
	 * Sets the '{@link Customer#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newId
	 *            the new value of the '{@link Customer#getId() id}' feature.
	 * @generated
	 */
	public void setId(Double newId) {
		id = newId;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Customer " + " [firstName: " + getFirstName() + "]"
				+ " [lastName: " + getLastName() + "]" + " [id: " + getId()
				+ "]";
	}
}
