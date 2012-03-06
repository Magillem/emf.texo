package org.eclipse.emf.texo.test.model.issues.bz371509;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

/**
 * A representation of the model object '<em><b>EClass0</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "EClass0")
public class EClass0 {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true, targetEntity = EClass1.class)
  @JoinTable(name = "EClass0_toClass1")
  private EClass1 toClass1 = null;

  /**
   * Returns the value of '<em><b>toClass1</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>toClass1</b></em>' feature
   * @generated
   */
  public EClass1 getToClass1() {
    return toClass1;
  }

  /**
   * Sets the '{@link EClass0#getToClass1() <em>toClass1</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link EClass0#getToClass1() toClass1}' feature.
   * @generated
   */
  public void setToClass1(EClass1 newToClass1) {
    if (toClass1 != newToClass1) {
      if (toClass1 != null) {
        toClass1.removeFromToClass0(this);
      }
      toClass1 = newToClass1;
      if (toClass1 != null) {
        toClass1.addToToClass0(this);
      }
    }
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "EClass0 ";
  }
}
