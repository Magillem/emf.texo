package org.eclipse.emf.texo.test.model.issues.bz420913;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * A representation of the model object '<em><b>Bz420913_T</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Bz420913_Bz420913_T")
public class Bz420913_T {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private Bz420913_O singleBidirectional = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JoinColumns({ @JoinColumn() })
	private Bz420913_O multiBidirectional = null;

	/**
	 * Returns the value of '<em><b>singleBidirectional</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>singleBidirectional</b></em>' feature
	 * @generated
	 */
	public Bz420913_O getSingleBidirectional() {
		return singleBidirectional;
	}

	/**
	 * Sets the '{@link Bz420913_T#getSingleBidirectional()
	 * <em>singleBidirectional</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSingleBidirectional
	 *            the new value of the '
	 *            {@link Bz420913_T#getSingleBidirectional()
	 *            singleBidirectional}' feature.
	 * @generated
	 */
	public void setSingleBidirectional(Bz420913_O newSingleBidirectional) {
		if (singleBidirectional != newSingleBidirectional) {
			if (singleBidirectional != null) {
				Bz420913_O tempSingleBidirectional = singleBidirectional;
				singleBidirectional = null;
				tempSingleBidirectional.setSingleBidirectional(null);
			}
			singleBidirectional = newSingleBidirectional;
			if (singleBidirectional != null) {
				singleBidirectional.setSingleBidirectional(this);
			}
		}
	}

	/**
	 * Returns the value of '<em><b>multiBidirectional</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>multiBidirectional</b></em>' feature
	 * @generated
	 */
	public Bz420913_O getMultiBidirectional() {
		return multiBidirectional;
	}

	/**
	 * Sets the '{@link Bz420913_T#getMultiBidirectional()
	 * <em>multiBidirectional</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newMultiBidirectional
	 *            the new value of the '
	 *            {@link Bz420913_T#getMultiBidirectional() multiBidirectional}'
	 *            feature.
	 * @generated
	 */
	public void setMultiBidirectional(Bz420913_O newMultiBidirectional) {
		if (multiBidirectional != newMultiBidirectional) {
			if (multiBidirectional != null) {
				multiBidirectional.removeFromMultiBidirectional(this);
			}
			multiBidirectional = newMultiBidirectional;
			if (multiBidirectional != null) {
				multiBidirectional.addToMultiBidirectional(this);
			}
		}
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Bz420913_T ";
	}
}
