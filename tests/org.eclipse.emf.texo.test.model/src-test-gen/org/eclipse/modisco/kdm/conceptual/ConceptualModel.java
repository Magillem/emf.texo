package org.eclipse.modisco.kdm.conceptual;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.kdm.KDMModel;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ConceptualModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "conceptual_ConceptualModel")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ConceptualModel extends KDMModel {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractConceptualElement> conceptualElement = new HashSet<AbstractConceptualElement>();

  /**
   * Returns the value of '<em><b>conceptualElement</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>conceptualElement</b></em>' feature
   * @generated
   */
  public Set<AbstractConceptualElement> getConceptualElement() {
    return conceptualElement;
  }

  /**
   * Sets the '{@link ConceptualModel#getConceptualElement() <em>conceptualElement</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newConceptualElement
   *          the new value of the '{@link ConceptualModel#getConceptualElement() conceptualElement}' feature.
   * @generated
   */
  public void setConceptualElement(Set<AbstractConceptualElement> newConceptualElement) {
    conceptualElement = newConceptualElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ConceptualModel " + "{extends: " + super.toString() + "} ";
  }
}
