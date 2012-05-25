package org.eclipse.modisco.kdm.ui;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * A representation of the model object '<em><b>UIAction</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "ui_UIAction")
public class UIAction extends AbstractUIElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String kind = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<UIEvent> uIElement = new HashSet<UIEvent>();

  /**
   * Returns the value of '<em><b>kind</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>kind</b></em>' feature
   * @generated
   */
  public String getKind() {
    return kind;
  }

  /**
   * Sets the '{@link UIAction#getKind() <em>kind</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link UIAction#getKind() kind}' feature.
   * @generated
   */
  public void setKind(String newKind) {
    kind = newKind;
  }

  /**
   * Returns the value of '<em><b>UIElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>UIElement</b></em>' feature
   * @generated
   */
  public Set<UIEvent> getUIElement() {
    return uIElement;
  }

  /**
   * Adds to the <em>UIElement</em> feature.
   * 
   * @generated
   */
  public void addToUIElement(UIEvent uIElementValue) {
    if (!uIElement.contains(uIElementValue)) {
      uIElement.add(uIElementValue);
    }
  }

  /**
   * Removes from the <em>UIElement</em> feature.
   * 
   * @generated
   */
  public void removeFromUIElement(UIEvent uIElementValue) {
    if (uIElement.contains(uIElementValue)) {
      uIElement.remove(uIElementValue);
    }
  }

  /**
   * Clears the <em>UIElement</em> feature.
   * 
   * @generated
   */
  public void clearUIElement() {
    while (!uIElement.isEmpty()) {
      removeFromUIElement(uIElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link UIAction#getUIElement() <em>UIElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link UIAction#getUIElement() UIElement}' feature.
   * @generated
   */
  public void setUIElement(Set<UIEvent> newUIElement) {
    uIElement = newUIElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "UIAction " + " [kind: " + getKind() + "]";
  }
}
