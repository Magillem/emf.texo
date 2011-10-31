package org.eclipse.emf.texo.test.model.samples.workflow;

import javax.persistence.Basic;
import javax.persistence.Entity;

/** 
 * A representation of the model object '<em><b>LoopTask</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "LoopTask")
public class LoopTask extends CompoundTask {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = false)
  private String whileCondition = null;

  /**
   * Returns the value of '<em><b>whileCondition</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>whileCondition</b></em>' feature
   * @generated
   */
  public String getWhileCondition() {
    return whileCondition;
  }

  /**
   * Sets the '{@link LoopTask#getWhileCondition() <em>whileCondition</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link LoopTask#getWhileCondition() whileCondition}' feature.
   * @generated
   */
  public void setWhileCondition(String newWhileCondition) {
    whileCondition = newWhileCondition;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "LoopTask " + " [whileCondition: " + getWhileCondition() + "]";
  }
}