/**
 */
package org.eclipse.emf.texo.test.model.samples.travel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.texo.test.model.samples.travel.Journey;
import org.eclipse.emf.texo.test.model.samples.travel.TravelPackage;
import org.eclipse.emf.texo.test.model.samples.travel.Trip;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Journey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.test.model.samples.travel.impl.JourneyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.test.model.samples.travel.impl.JourneyImpl#getTrips <em>Trips</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JourneyImpl extends MinimalEObjectImpl.Container implements Journey
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTrips() <em>Trips</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrips()
   * @generated
   * @ordered
   */
  protected Trip trips;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JourneyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TravelPackage.Literals.JOURNEY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TravelPackage.JOURNEY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trip getTrips()
  {
    return trips;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrips(Trip newTrips, NotificationChain msgs)
  {
    Trip oldTrips = trips;
    trips = newTrips;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TravelPackage.JOURNEY__TRIPS, oldTrips, newTrips);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrips(Trip newTrips)
  {
    if (newTrips != trips)
    {
      NotificationChain msgs = null;
      if (trips != null)
        msgs = ((InternalEObject)trips).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TravelPackage.JOURNEY__TRIPS, null, msgs);
      if (newTrips != null)
        msgs = ((InternalEObject)newTrips).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TravelPackage.JOURNEY__TRIPS, null, msgs);
      msgs = basicSetTrips(newTrips, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TravelPackage.JOURNEY__TRIPS, newTrips, newTrips));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TravelPackage.JOURNEY__TRIPS:
        return basicSetTrips(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TravelPackage.JOURNEY__NAME:
        return getName();
      case TravelPackage.JOURNEY__TRIPS:
        return getTrips();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TravelPackage.JOURNEY__NAME:
        setName((String)newValue);
        return;
      case TravelPackage.JOURNEY__TRIPS:
        setTrips((Trip)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TravelPackage.JOURNEY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TravelPackage.JOURNEY__TRIPS:
        setTrips((Trip)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TravelPackage.JOURNEY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TravelPackage.JOURNEY__TRIPS:
        return trips != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //JourneyImpl
