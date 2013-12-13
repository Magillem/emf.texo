/**
 */
package org.eclipse.emf.texo.test.model.samples.travel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.test.model.samples.travel.Journey#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.test.model.samples.travel.Journey#getTrips <em>Trips</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.test.model.samples.travel.TravelPackage#getJourney()
 * @model
 * @generated
 */
public interface Journey extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.test.model.samples.travel.TravelPackage#getJourney_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.test.model.samples.travel.Journey#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Trips</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trips</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trips</em>' containment reference.
   * @see #setTrips(Trip)
   * @see org.eclipse.emf.texo.test.model.samples.travel.TravelPackage#getJourney_Trips()
   * @model containment="true"
   * @generated
   */
  Trip getTrips();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.test.model.samples.travel.Journey#getTrips <em>Trips</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trips</em>' containment reference.
   * @see #getTrips()
   * @generated
   */
  void setTrips(Trip value);

} // Journey
