/**
 */
package org.eclipse.emf.texo.test.model.samples.travel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.test.model.samples.travel.TravelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.eclipse.emf.texo.test.model.samples'"
 * @generated
 */
public interface TravelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "travel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "org.eclipse.emf.texo.test.model.samples.travel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "travel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TravelPackage eINSTANCE = org.eclipse.emf.texo.test.model.samples.travel.impl.TravelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.test.model.samples.travel.impl.JourneyImpl <em>Journey</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.test.model.samples.travel.impl.JourneyImpl
   * @see org.eclipse.emf.texo.test.model.samples.travel.impl.TravelPackageImpl#getJourney()
   * @generated
   */
  int JOURNEY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNEY__NAME = 0;

  /**
   * The feature id for the '<em><b>Trips</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNEY__TRIPS = 1;

  /**
   * The number of structural features of the '<em>Journey</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNEY_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Journey</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNEY_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.test.model.samples.travel.impl.TripImpl <em>Trip</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.test.model.samples.travel.impl.TripImpl
   * @see org.eclipse.emf.texo.test.model.samples.travel.impl.TravelPackageImpl#getTrip()
   * @generated
   */
  int TRIP = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIP__NAME = 0;

  /**
   * The feature id for the '<em><b>Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIP__DESTINATION = 1;

  /**
   * The number of structural features of the '<em>Trip</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIP_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Trip</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIP_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.test.model.samples.travel.impl.CityImpl <em>City</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.test.model.samples.travel.impl.CityImpl
   * @see org.eclipse.emf.texo.test.model.samples.travel.impl.TravelPackageImpl#getCity()
   * @generated
   */
  int CITY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CITY__NAME = 0;

  /**
   * The number of structural features of the '<em>City</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CITY_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>City</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CITY_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.test.model.samples.travel.Journey <em>Journey</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Journey</em>'.
   * @see org.eclipse.emf.texo.test.model.samples.travel.Journey
   * @generated
   */
  EClass getJourney();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.test.model.samples.travel.Journey#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.test.model.samples.travel.Journey#getName()
   * @see #getJourney()
   * @generated
   */
  EAttribute getJourney_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.test.model.samples.travel.Journey#getTrips <em>Trips</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trips</em>'.
   * @see org.eclipse.emf.texo.test.model.samples.travel.Journey#getTrips()
   * @see #getJourney()
   * @generated
   */
  EReference getJourney_Trips();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.test.model.samples.travel.Trip <em>Trip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trip</em>'.
   * @see org.eclipse.emf.texo.test.model.samples.travel.Trip
   * @generated
   */
  EClass getTrip();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.test.model.samples.travel.Trip#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.test.model.samples.travel.Trip#getName()
   * @see #getTrip()
   * @generated
   */
  EAttribute getTrip_Name();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.texo.test.model.samples.travel.Trip#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Destination</em>'.
   * @see org.eclipse.emf.texo.test.model.samples.travel.Trip#getDestination()
   * @see #getTrip()
   * @generated
   */
  EReference getTrip_Destination();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.test.model.samples.travel.City <em>City</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>City</em>'.
   * @see org.eclipse.emf.texo.test.model.samples.travel.City
   * @generated
   */
  EClass getCity();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.test.model.samples.travel.City#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.test.model.samples.travel.City#getName()
   * @see #getCity()
   * @generated
   */
  EAttribute getCity_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TravelFactory getTravelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.test.model.samples.travel.impl.JourneyImpl <em>Journey</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.test.model.samples.travel.impl.JourneyImpl
     * @see org.eclipse.emf.texo.test.model.samples.travel.impl.TravelPackageImpl#getJourney()
     * @generated
     */
    EClass JOURNEY = eINSTANCE.getJourney();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOURNEY__NAME = eINSTANCE.getJourney_Name();

    /**
     * The meta object literal for the '<em><b>Trips</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOURNEY__TRIPS = eINSTANCE.getJourney_Trips();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.test.model.samples.travel.impl.TripImpl <em>Trip</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.test.model.samples.travel.impl.TripImpl
     * @see org.eclipse.emf.texo.test.model.samples.travel.impl.TravelPackageImpl#getTrip()
     * @generated
     */
    EClass TRIP = eINSTANCE.getTrip();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRIP__NAME = eINSTANCE.getTrip_Name();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIP__DESTINATION = eINSTANCE.getTrip_Destination();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.texo.test.model.samples.travel.impl.CityImpl <em>City</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.test.model.samples.travel.impl.CityImpl
     * @see org.eclipse.emf.texo.test.model.samples.travel.impl.TravelPackageImpl#getCity()
     * @generated
     */
    EClass CITY = eINSTANCE.getCity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CITY__NAME = eINSTANCE.getCity_Name();

  }

} //TravelPackage
