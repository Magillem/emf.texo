package org.eclipse.modisco.kdm.structure;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.core.AggregatedRelationship;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>AbstractStructureElement</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "structure_AbstractStructureElement")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class AbstractStructureElement extends KDMEntity {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AggregatedRelationship> aggregated = new HashSet<AggregatedRelationship>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Set<KDMEntity> implementation = new HashSet<KDMEntity>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractStructureElement> structureElement = new HashSet<AbstractStructureElement>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractStructureRelationship> structureRelationship = new HashSet<AbstractStructureRelationship>();

  /**
   * Returns the value of '<em><b>aggregated</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>aggregated</b></em>' feature
   * @generated
   */
  public Set<AggregatedRelationship> getAggregated() {
    return aggregated;
  }

  /**
   * Sets the '{@link AbstractStructureElement#getAggregated() <em>aggregated</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAggregated
   *          the new value of the '{@link AbstractStructureElement#getAggregated() aggregated}' feature.
   * @generated
   */
  public void setAggregated(Set<AggregatedRelationship> newAggregated) {
    aggregated = newAggregated;
  }

  /**
   * Returns the value of '<em><b>implementation</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>implementation</b></em>' feature
   * @generated
   */
  public Set<KDMEntity> getImplementation() {
    return implementation;
  }

  /**
   * Sets the '{@link AbstractStructureElement#getImplementation() <em>implementation</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newImplementation
   *          the new value of the '{@link AbstractStructureElement#getImplementation() implementation}' feature.
   * @generated
   */
  public void setImplementation(Set<KDMEntity> newImplementation) {
    implementation = newImplementation;
  }

  /**
   * Returns the value of '<em><b>structureElement</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>structureElement</b></em>' feature
   * @generated
   */
  public Set<AbstractStructureElement> getStructureElement() {
    return structureElement;
  }

  /**
   * Sets the '{@link AbstractStructureElement#getStructureElement() <em>structureElement</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStructureElement
   *          the new value of the '{@link AbstractStructureElement#getStructureElement() structureElement}' feature.
   * @generated
   */
  public void setStructureElement(Set<AbstractStructureElement> newStructureElement) {
    structureElement = newStructureElement;
  }

  /**
   * Returns the value of '<em><b>structureRelationship</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>structureRelationship</b></em>' feature
   * @generated
   */
  public Set<AbstractStructureRelationship> getStructureRelationship() {
    return structureRelationship;
  }

  /**
   * Sets the '{@link AbstractStructureElement#getStructureRelationship() <em>structureRelationship</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStructureRelationship
   *          the new value of the '{@link AbstractStructureElement#getStructureRelationship() structureRelationship}'
   *          feature.
   * @generated
   */
  public void setStructureRelationship(Set<AbstractStructureRelationship> newStructureRelationship) {
    structureRelationship = newStructureRelationship;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AbstractStructureElement " + "{extends: " + super.toString() + "} ";
  }
}
