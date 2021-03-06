/**
 * <copyright>
 * </copyright>
 *
 * $Id: ItemImpl.java,v 1.4 2011/08/25 14:34:34 mtaal Exp $
 */
package extlibrary.impl;

import extlibrary.ExtlibraryPackage;
import extlibrary.Item;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Item</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link extlibrary.impl.ItemImpl#getPublicationDate <em>Publication Date</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class ItemImpl extends EObjectImpl implements Item {
  /**
   * The default value of the '{@link #getPublicationDate() <em>Publication Date</em>}' attribute. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @see #getPublicationDate()
   * @generated
   * @ordered
   */
  protected static final Date PUBLICATION_DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPublicationDate() <em>Publication Date</em>}' attribute. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @see #getPublicationDate()
   * @generated
   * @ordered
   */
  protected Date publicationDate = PUBLICATION_DATE_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ItemImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ExtlibraryPackage.Literals.ITEM;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Date getPublicationDate() {
    return publicationDate;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setPublicationDate(Date newPublicationDate) {
    Date oldPublicationDate = publicationDate;
    publicationDate = newPublicationDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtlibraryPackage.ITEM__PUBLICATION_DATE,
          oldPublicationDate, publicationDate));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case ExtlibraryPackage.ITEM__PUBLICATION_DATE:
      return getPublicationDate();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
    case ExtlibraryPackage.ITEM__PUBLICATION_DATE:
      setPublicationDate((Date) newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
    case ExtlibraryPackage.ITEM__PUBLICATION_DATE:
      setPublicationDate(PUBLICATION_DATE_EDEFAULT);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
    case ExtlibraryPackage.ITEM__PUBLICATION_DATE:
      return PUBLICATION_DATE_EDEFAULT == null ? publicationDate != null : !PUBLICATION_DATE_EDEFAULT
          .equals(publicationDate);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy())
      return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (publicationDate: ");
    result.append(publicationDate);
    result.append(')');
    return result.toString();
  }

} // ItemImpl
