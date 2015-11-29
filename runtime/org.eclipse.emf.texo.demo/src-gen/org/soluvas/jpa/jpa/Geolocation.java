package org.soluvas.jpa.jpa;

import java.io.Serializable;

/**
 * A representation of the model object '<em><b>Geolocation</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Why Double?
 * 
 * Hibernate Search has this as best practice:
 * "add the @Latitude and @Longitude annotations on your properties representing the coordinates; these must be of type Double"
 * http://docs.jboss.org/hibernate/search/4.2/reference/en-US/html/spatial.html
 * <!-- end-model-doc -->
 * 
 * @generated
 */
public class Geolocation implements Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Double latitude = 0.0f;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Double longitude = 0.0f;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Double elevation = 0.0f;

	/**
	 * Returns the value of '<em><b>latitude</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>latitude</b></em>' feature
	 * @generated
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * Sets the '{@link Geolocation#getLatitude() <em>latitude</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newLatitude
	 *            the new value of the '{@link Geolocation#getLatitude()
	 *            latitude}' feature.
	 * @generated
	 */
	public void setLatitude(Double newLatitude) {
		latitude = newLatitude;
	}

	/**
	 * Returns the value of '<em><b>longitude</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>longitude</b></em>' feature
	 * @generated
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * Sets the '{@link Geolocation#getLongitude() <em>longitude</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newLongitude
	 *            the new value of the '{@link Geolocation#getLongitude()
	 *            longitude}' feature.
	 * @generated
	 */
	public void setLongitude(Double newLongitude) {
		longitude = newLongitude;
	}

	/**
	 * Returns the value of '<em><b>elevation</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>elevation</b></em>' feature
	 * @generated
	 */
	public Double getElevation() {
		return elevation;
	}

	/**
	 * Sets the '{@link Geolocation#getElevation() <em>elevation</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newElevation
	 *            the new value of the '{@link Geolocation#getElevation()
	 *            elevation}' feature.
	 * @generated
	 */
	public void setElevation(Double newElevation) {
		elevation = newElevation;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Geolocation " + " [latitude: " + getLatitude() + "]"
				+ " [longitude: " + getLongitude() + "]" + " [elevation: "
				+ getElevation() + "]";
	}
}
