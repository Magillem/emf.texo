package org.eclipse.emf.texo.test.model.samples.capa;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * A representation of the model object '<em><b>CapacityEntry</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "CapacityEntry")
public class CapacityEntry {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  private String capacityEntryId = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  private String name = null;

  /**
   * Returns the value of '<em><b>capacityEntryId</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>capacityEntryId</b></em>' feature
   * @generated
   */
  public String getCapacityEntryId() {
    return capacityEntryId;
  }

  /**
   * Sets the '{@link CapacityEntry#getCapacityEntryId() <em>capacityEntryId</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link CapacityEntry#getCapacityEntryId() capacityEntryId}' feature.
   * @generated
   */
  public void setCapacityEntryId(String newCapacityEntryId) {
    capacityEntryId = newCapacityEntryId;
  }

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link CapacityEntry#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link CapacityEntry#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "CapacityEntry " + " [capacityEntryId: " + getCapacityEntryId() + "]" + " [name: " + getName() + "]";
  }
}
