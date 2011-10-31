package org.eclipse.modisco.kdm.code;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

/** 
 * A representation of the model object '<em><b>InterfaceUnit</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "InterfaceUnit")
public class InterfaceUnit extends Datatype {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = CodeItem.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<CodeItem> codeElement = new ArrayList<CodeItem>();

  /**
   * Returns the value of '<em><b>codeElement</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>codeElement</b></em>' feature
   * @generated
   */
  public List<CodeItem> getCodeElement() {
    return codeElement;
  }

  /**
   * Adds to the <em>codeElement</em> feature.
   * @generated
   */
  public void addToCodeElement(CodeItem codeElementValue) {
    if (!codeElement.contains(codeElementValue)) {

      codeElement.add(codeElementValue);
    }

  }

  /**			
   * Removes from the <em>codeElement</em> feature.
   * @generated
   */
  public void removeFromCodeElement(CodeItem codeElementValue) {
    if (codeElement.contains(codeElementValue)) {
      codeElement.remove(codeElementValue);
    }
  }

  /**			
   * Clears the <em>codeElement</em> feature.
   * @generated
   */
  public void clearCodeElement() {
    for (CodeItem codeElementElement : codeElement) {
      removeFromCodeElement(codeElementElement);
    }
  }

  /**
   * Sets the '{@link InterfaceUnit#getCodeElement() <em>codeElement</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link InterfaceUnit#getCodeElement() codeElement}' feature.
   * @generated
   */
  public void setCodeElement(List<CodeItem> newCodeElement) {
    codeElement = newCodeElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "InterfaceUnit ";
  }
}