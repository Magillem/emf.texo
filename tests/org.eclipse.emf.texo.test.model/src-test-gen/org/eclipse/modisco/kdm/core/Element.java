package org.eclipse.modisco.kdm.core;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.modisco.kdm.kdm.Annotation;
import org.eclipse.modisco.kdm.kdm.Attribute;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Element</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> An element is an atomic constituent of a model. In the meta-model, an Element is the top
 * meta-element in the KDM class hierarchy. Element is an abstract meta-model element. <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "core_Element")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class Element extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of attributes owned by the given
   * element. <!-- end-model-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<Attribute> attribute = new HashSet<Attribute>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of annotations owned by the given
   * element. <!-- end-model-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<Annotation> annotation = new HashSet<Annotation>();

  /**
   * Returns the value of '<em><b>attribute</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of attributes owned by the given
   * element. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>attribute</b></em>' feature
   * @generated
   */
  public Set<Attribute> getAttribute() {
    return attribute;
  }

  /**
   * Sets the '{@link Element#getAttribute() <em>attribute</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of attributes owned by the given
   * element. <!-- end-model-doc -->
   * 
   * @param newAttribute
   *          the new value of the '{@link Element#getAttribute() attribute}' feature.
   * @generated
   */
  public void setAttribute(Set<Attribute> newAttribute) {
    attribute = newAttribute;
  }

  /**
   * Returns the value of '<em><b>annotation</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of annotations owned by the given
   * element. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>annotation</b></em>' feature
   * @generated
   */
  public Set<Annotation> getAnnotation() {
    return annotation;
  }

  /**
   * Sets the '{@link Element#getAnnotation() <em>annotation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of annotations owned by the given
   * element. <!-- end-model-doc -->
   * 
   * @param newAnnotation
   *          the new value of the '{@link Element#getAnnotation() annotation}' feature.
   * @generated
   */
  public void setAnnotation(Set<Annotation> newAnnotation) {
    annotation = newAnnotation;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Element " + "{extends: " + super.toString() + "} ";
  }
}
