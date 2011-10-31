package ru.satseqsys.model;

import java.util.Date;

/** 
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Сообщения обмена командами
 * <!-- end-model-doc -->
 * @generated 
 */
public class Message {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Текст сообщения
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String text = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Тип сообщения
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private MessageType type = MessageType.SERVICE;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Отправитель
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private SimCard from = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Получатель
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private SimCard to = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Дата/время получения
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private Date dateTime = null;

	/**
	 * Returns the value of '<em><b>text</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Текст сообщения
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>text</b></em>' feature
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the '{@link Message#getText() <em>text</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Текст сообщения
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link Message#getText() text}' feature.
	 * @generated
	 */
	public void setText(String newText) {
		text = newText;
	}

	/**
	 * Returns the value of '<em><b>type</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Тип сообщения
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>type</b></em>' feature
	 * @generated
	 */
	public MessageType getType() {
		return type;
	}

	/**
	 * Sets the '{@link Message#getType() <em>type</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Тип сообщения
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link Message#getType() type}' feature.
	 * @generated
	 */
	public void setType(MessageType newType) {
		type = newType;
	}

	/**
	 * Returns the value of '<em><b>from</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Отправитель
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>from</b></em>' feature
	 * @generated
	 */
	public SimCard getFrom() {
		return from;
	}

	/**
	 * Sets the '{@link Message#getFrom() <em>from</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Отправитель
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link Message#getFrom() from}' feature.
	 * @generated
	 */
	public void setFrom(SimCard newFrom) {
		from = newFrom;
	}

	/**
	 * Returns the value of '<em><b>to</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Получатель
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>to</b></em>' feature
	 * @generated
	 */
	public SimCard getTo() {
		return to;
	}

	/**
	 * Sets the '{@link Message#getTo() <em>to</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Получатель
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link Message#getTo() to}' feature.
	 * @generated
	 */
	public void setTo(SimCard newTo) {
		to = newTo;
	}

	/**
	 * Returns the value of '<em><b>dateTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Дата/время получения
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>dateTime</b></em>' feature
	 * @generated
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * Sets the '{@link Message#getDateTime() <em>dateTime</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Дата/время получения
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link Message#getDateTime() dateTime}' feature.
	 * @generated
	 */
	public void setDateTime(Date newDateTime) {
		dateTime = newDateTime;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "Message " + " [text: " + getText() + "]" + " [type: "
				+ getType() + "]" + " [dateTime: " + getDateTime() + "]";
	}
}