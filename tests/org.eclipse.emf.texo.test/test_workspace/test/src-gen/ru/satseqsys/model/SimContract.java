package ru.satseqsys.model;

/** 
 * A representation of the model object '<em><b>SimContract</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Информация о контракте с оператором сотовой связи
 * <!-- end-model-doc -->
 * @generated 
 */
public class SimContract {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Номер контракта
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String contractNumber = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Название
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String name = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Описание
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String descritpion = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Платежная информация по договору
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private PaymentInfo paymentInfo = null;

	/**
	 * Returns the value of '<em><b>contractNumber</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Номер контракта
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>contractNumber</b></em>' feature
	 * @generated
	 */
	public String getContractNumber() {
		return contractNumber;
	}

	/**
	 * Sets the '{@link SimContract#getContractNumber() <em>contractNumber</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Номер контракта
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link SimContract#getContractNumber() contractNumber}' feature.
	 * @generated
	 */
	public void setContractNumber(String newContractNumber) {
		contractNumber = newContractNumber;
	}

	/**
	 * Returns the value of '<em><b>name</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Название
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>name</b></em>' feature
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the '{@link SimContract#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Название
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link SimContract#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>descritpion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Описание
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>descritpion</b></em>' feature
	 * @generated
	 */
	public String getDescritpion() {
		return descritpion;
	}

	/**
	 * Sets the '{@link SimContract#getDescritpion() <em>descritpion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Описание
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link SimContract#getDescritpion() descritpion}' feature.
	 * @generated
	 */
	public void setDescritpion(String newDescritpion) {
		descritpion = newDescritpion;
	}

	/**
	 * Returns the value of '<em><b>paymentInfo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Платежная информация по договору
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>paymentInfo</b></em>' feature
	 * @generated
	 */
	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	/**
	 * Sets the '{@link SimContract#getPaymentInfo() <em>paymentInfo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Платежная информация по договору
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link SimContract#getPaymentInfo() paymentInfo}' feature.
	 * @generated
	 */
	public void setPaymentInfo(PaymentInfo newPaymentInfo) {
		paymentInfo = newPaymentInfo;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "SimContract " + " [contractNumber: " + getContractNumber()
				+ "]" + " [name: " + getName() + "]" + " [descritpion: "
				+ getDescritpion() + "]";
	}
}
