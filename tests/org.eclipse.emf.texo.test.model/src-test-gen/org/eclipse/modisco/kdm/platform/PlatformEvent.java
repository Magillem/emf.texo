package org.eclipse.modisco.kdm.platform;

import javax.persistence.Basic;
import javax.persistence.Entity;

/** 
 * A representation of the model object '<em><b>PlatformEvent</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "PlatformEvent")
public class PlatformEvent extends ResourceType {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private String kind = null;

  /**
   * Returns the value of '<em><b>kind</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>kind</b></em>' feature
   * @generated
   */
  public String getKind() {
    return kind;
  }

  /**
   * Sets the '{@link PlatformEvent#getKind() <em>kind</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link PlatformEvent#getKind() kind}' feature.
   * @generated
   */
  public void setKind(String newKind) {
    kind = newKind;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "PlatformEvent " + " [kind: " + getKind() + "]";
  }
}