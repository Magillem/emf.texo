package org.eclipse.emf.texo.test.model.samples.rental;

import org.eclipse.emf.texo.demo.BaseObject;

/** 
 * A representation of the model object '<em><b>RentalContractLine</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class RentalContractLine extends BaseObject {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private RentalContract rentalContract = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private long number = 0;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private RentalUnit rentalUnit = null;

	/**
	 * Returns the value of '<em><b>rentalContract</b></em>' feature.
	 * Note: the returned collection is Unmodifiable use the {#addToRentalContract(org.eclipse.emf.texo.test.model.samples.rental.RentalContract value)}
	 * and {@link #removeFromRentalContract(RentalContract value)} methods 
	 * to modify this feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>rentalContract</b></em>' feature
	 * @generated
	 */
	public RentalContract getRentalContract() {
		return rentalContract;
	}

	/**
	 * Sets the '{@link RentalContractLine#getRentalContract() <em>rentalContract</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link RentalContractLine#getRentalContract() rentalContract}' feature.
	 * @generated
	 */
	public void setRentalContract(RentalContract newRentalContract) {
		if (rentalContract != newRentalContract) {
			if (rentalContract != null) {
				rentalContract.removeFromRentalContractLines(this);
			}
			rentalContract = newRentalContract;
			if (rentalContract != null) {
				rentalContract.addToRentalContractLines(this);
			}
		}
	}

	/**
	 * Returns the value of '<em><b>number</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>number</b></em>' feature
	 * @generated
	 */
	public long getNumber() {
		return number;
	}

	/**
	 * Sets the '{@link RentalContractLine#getNumber() <em>number</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link RentalContractLine#getNumber() number}' feature.
	 * @generated
	 */
	public void setNumber(long newNumber) {
		number = newNumber;
	}

	/**
	 * Returns the value of '<em><b>rentalUnit</b></em>' feature.
	 * Note: the returned collection is Unmodifiable use the {#addToRentalUnit(org.eclipse.emf.texo.test.model.samples.rental.RentalUnit value)}
	 * and {@link #removeFromRentalUnit(RentalUnit value)} methods 
	 * to modify this feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>rentalUnit</b></em>' feature
	 * @generated
	 */
	public RentalUnit getRentalUnit() {
		return rentalUnit;
	}

	/**
	 * Sets the '{@link RentalContractLine#getRentalUnit() <em>rentalUnit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link RentalContractLine#getRentalUnit() rentalUnit}' feature.
	 * @generated
	 */
	public void setRentalUnit(RentalUnit newRentalUnit) {
		rentalUnit = newRentalUnit;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "RentalContractLine " + " [number: " + getNumber() + "]";
	}
}
