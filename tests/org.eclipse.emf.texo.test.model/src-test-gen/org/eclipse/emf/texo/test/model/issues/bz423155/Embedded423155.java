package org.eclipse.emf.texo.test.model.issues.bz423155;

import javax.persistence.Basic;
import javax.persistence.Embeddable;

/**
 * A representation of the model object '<em><b>Embedded423155</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Embeddable()
public class Embedded423155 {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String name1 = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String name2 = null;

  /**
   * Returns the value of '<em><b>name1</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name1</b></em>' feature
   * @generated
   */
  public String getName1() {
    return name1;
  }

  /**
   * Sets the '{@link Embedded423155#getName1() <em>name1</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName1
   *          the new value of the '{@link Embedded423155#getName1() name1}' feature.
   * @generated
   */
  public void setName1(String newName1) {
    name1 = newName1;
  }

  /**
   * Returns the value of '<em><b>name2</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name2</b></em>' feature
   * @generated
   */
  public String getName2() {
    return name2;
  }

  /**
   * Sets the '{@link Embedded423155#getName2() <em>name2</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName2
   *          the new value of the '{@link Embedded423155#getName2() name2}' feature.
   * @generated
   */
  public void setName2(String newName2) {
    name2 = newName2;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Embedded423155 " + " [name1: " + getName1() + "]" + " [name2: " + getName2() + "]";
  }
}
