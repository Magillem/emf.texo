package org.eclipse.modisco.kdm.ui;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>UIResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "ui_UIResource")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class UIResource extends AbstractUIElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractUIElement> uIElement = new HashSet<AbstractUIElement>();

  /**
   * Returns the value of '<em><b>UIElement</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>UIElement</b></em>' feature
   * @generated
   */
  public Set<AbstractUIElement> getUIElement() {
    return uIElement;
  }

  /**
   * Sets the '{@link UIResource#getUIElement() <em>UIElement</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newUIElement
   *          the new value of the '{@link UIResource#getUIElement() UIElement}' feature.
   * @generated
   */
  public void setUIElement(Set<AbstractUIElement> newUIElement) {
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
    return "UIResource " + "{extends: " + super.toString() + "} ";
  }
}
