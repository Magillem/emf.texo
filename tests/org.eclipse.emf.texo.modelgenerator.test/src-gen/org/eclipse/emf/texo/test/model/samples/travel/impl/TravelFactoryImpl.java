/**
 */
package org.eclipse.emf.texo.test.model.samples.travel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.texo.test.model.samples.travel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TravelFactoryImpl extends EFactoryImpl implements TravelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TravelFactory init()
  {
    try
    {
      TravelFactory theTravelFactory = (TravelFactory)EPackage.Registry.INSTANCE.getEFactory(TravelPackage.eNS_URI);
      if (theTravelFactory != null)
      {
        return theTravelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TravelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TravelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TravelPackage.JOURNEY: return createJourney();
      case TravelPackage.TRIP: return createTrip();
      case TravelPackage.CITY: return createCity();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Journey createJourney()
  {
    JourneyImpl journey = new JourneyImpl();
    return journey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trip createTrip()
  {
    TripImpl trip = new TripImpl();
    return trip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public City createCity()
  {
    CityImpl city = new CityImpl();
    return city;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TravelPackage getTravelPackage()
  {
    return (TravelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TravelPackage getPackage()
  {
    return TravelPackage.eINSTANCE;
  }

} //TravelFactoryImpl
