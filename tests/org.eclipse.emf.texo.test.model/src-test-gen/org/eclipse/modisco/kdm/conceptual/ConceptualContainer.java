package org.eclipse.modisco.kdm.conceptual;

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
 * A representation of the model object '<em><b>ConceptualContainer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "conceptual_ConceptualContainer")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ConceptualContainer extends AbstractConceptualElement {

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
   * Sets the '{@link ConceptualContainer#getConceptualElement() <em>conceptualElement</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newConceptualElement
   *          the new value of the '{@link ConceptualContainer#getConceptualElement() conceptualElement}' feature.
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
    return "ConceptualContainer " + "{extends: " + super.toString() + "} ";
  }
}
