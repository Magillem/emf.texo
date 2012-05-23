package org.eclipse.emf.texo.test.model.schemaconstructs.include;

import javax.persistence.Basic;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Include2</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Include2")
public class Include2 extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String code = null;

  /**
   * Returns the value of '<em><b>code</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>code</b></em>' feature
   * @generated
   */
  public String getCode() {
    return code;
  }

  /**
   * Sets the '{@link Include2#getCode() <em>code</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Include2#getCode() code}' feature.
   * @generated
   */
  public void setCode(String newCode) {
    code = newCode;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Include2 " + " [code: " + getCode() + "]";
  }
}
