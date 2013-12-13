/**
 */
package org.eclipse.emf.texo.test.model.samples.travel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.test.model.samples.travel.TravelPackage
 * @generated
 */
public interface TravelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TravelFactory eINSTANCE = org.eclipse.emf.texo.test.model.samples.travel.impl.TravelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Journey</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Journey</em>'.
   * @generated
   */
  Journey createJourney();

  /**
   * Returns a new object of class '<em>Trip</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trip</em>'.
   * @generated
   */
  Trip createTrip();

  /**
   * Returns a new object of class '<em>City</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>City</em>'.
   * @generated
   */
  City createCity();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TravelPackage getTravelPackage();

} //TravelFactory
