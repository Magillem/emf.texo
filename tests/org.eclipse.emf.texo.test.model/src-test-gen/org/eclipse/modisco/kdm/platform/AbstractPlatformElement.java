package org.eclipse.modisco.kdm.platform;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.modisco.kdm.action.ActionElement;
import org.eclipse.modisco.kdm.code.AbstractCodeElement;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.modisco.kdm.source.SourceRef;

/** 
 * A representation of the model object '<em><b>AbstractPlatformElement</b></em>'.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated 
 */
@Entity(name = "AbstractPlatformElement")
public abstract class AbstractPlatformElement extends KDMEntity {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = SourceRef.class)
  @JoinColumns({ @JoinColumn() })
  private Set<SourceRef> source = new HashSet<SourceRef>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = AbstractPlatformRelationship.class)
  @JoinColumns({ @JoinColumn() })
  private Set<AbstractPlatformRelationship> platformRelation = new HashSet<AbstractPlatformRelationship>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = ActionElement.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<ActionElement> abstraction = new ArrayList<ActionElement>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToMany(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = AbstractCodeElement.class)
  @JoinTable(name = "AbstractPlatformElement_implementation")
  private Set<AbstractCodeElement> implementation = new HashSet<AbstractCodeElement>();

  /**
   * Returns the value of '<em><b>source</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>source</b></em>' feature
   * @generated
   */
  public Set<SourceRef> getSource() {
    return source;
  }

  /**
   * Adds to the <em>source</em> feature.
   * @generated
   */
  public void addToSource(SourceRef sourceValue) {
    if (!source.contains(sourceValue)) {

      source.add(sourceValue);
    }

  }

  /**			
   * Removes from the <em>source</em> feature.
   * @generated
   */
  public void removeFromSource(SourceRef sourceValue) {
    if (source.contains(sourceValue)) {
      source.remove(sourceValue);
    }
  }

  /**			
   * Clears the <em>source</em> feature.
   * @generated
   */
  public void clearSource() {
    for (SourceRef sourceElement : source) {
      removeFromSource(sourceElement);
    }
  }

  /**
   * Sets the '{@link AbstractPlatformElement#getSource() <em>source</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link AbstractPlatformElement#getSource() source}' feature.
   * @generated
   */
  public void setSource(Set<SourceRef> newSource) {
    source = newSource;
  }

  /**
   * Returns the value of '<em><b>platformRelation</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>platformRelation</b></em>' feature
   * @generated
   */
  public Set<AbstractPlatformRelationship> getPlatformRelation() {
    return platformRelation;
  }

  /**
   * Adds to the <em>platformRelation</em> feature.
   * @generated
   */
  public void addToPlatformRelation(AbstractPlatformRelationship platformRelationValue) {
    if (!platformRelation.contains(platformRelationValue)) {

      platformRelation.add(platformRelationValue);
    }

  }

  /**			
   * Removes from the <em>platformRelation</em> feature.
   * @generated
   */
  public void removeFromPlatformRelation(AbstractPlatformRelationship platformRelationValue) {
    if (platformRelation.contains(platformRelationValue)) {
      platformRelation.remove(platformRelationValue);
    }
  }

  /**			
   * Clears the <em>platformRelation</em> feature.
   * @generated
   */
  public void clearPlatformRelation() {
    for (AbstractPlatformRelationship platformRelationElement : platformRelation) {
      removeFromPlatformRelation(platformRelationElement);
    }
  }

  /**
   * Sets the '{@link AbstractPlatformElement#getPlatformRelation() <em>platformRelation</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link AbstractPlatformElement#getPlatformRelation() platformRelation}' feature.
   * @generated
   */
  public void setPlatformRelation(Set<AbstractPlatformRelationship> newPlatformRelation) {
    platformRelation = newPlatformRelation;
  }

  /**
   * Returns the value of '<em><b>abstraction</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>abstraction</b></em>' feature
   * @generated
   */
  public List<ActionElement> getAbstraction() {
    return abstraction;
  }

  /**
   * Adds to the <em>abstraction</em> feature.
   * @generated
   */
  public void addToAbstraction(ActionElement abstractionValue) {
    if (!abstraction.contains(abstractionValue)) {

      abstraction.add(abstractionValue);
    }

  }

  /**			
   * Removes from the <em>abstraction</em> feature.
   * @generated
   */
  public void removeFromAbstraction(ActionElement abstractionValue) {
    if (abstraction.contains(abstractionValue)) {
      abstraction.remove(abstractionValue);
    }
  }

  /**			
   * Clears the <em>abstraction</em> feature.
   * @generated
   */
  public void clearAbstraction() {
    for (ActionElement abstractionElement : abstraction) {
      removeFromAbstraction(abstractionElement);
    }
  }

  /**
   * Sets the '{@link AbstractPlatformElement#getAbstraction() <em>abstraction</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link AbstractPlatformElement#getAbstraction() abstraction}' feature.
   * @generated
   */
  public void setAbstraction(List<ActionElement> newAbstraction) {
    abstraction = newAbstraction;
  }

  /**
   * Returns the value of '<em><b>implementation</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>implementation</b></em>' feature
   * @generated
   */
  public Set<AbstractCodeElement> getImplementation() {
    return implementation;
  }

  /**
   * Adds to the <em>implementation</em> feature.
   * @generated
   */
  public void addToImplementation(AbstractCodeElement implementationValue) {
    if (!implementation.contains(implementationValue)) {

      implementation.add(implementationValue);
    }

  }

  /**			
   * Removes from the <em>implementation</em> feature.
   * @generated
   */
  public void removeFromImplementation(AbstractCodeElement implementationValue) {
    if (implementation.contains(implementationValue)) {
      implementation.remove(implementationValue);
    }
  }

  /**			
   * Clears the <em>implementation</em> feature.
   * @generated
   */
  public void clearImplementation() {
    for (AbstractCodeElement implementationElement : implementation) {
      removeFromImplementation(implementationElement);
    }
  }

  /**
   * Sets the '{@link AbstractPlatformElement#getImplementation() <em>implementation</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link AbstractPlatformElement#getImplementation() implementation}' feature.
   * @generated
   */
  public void setImplementation(Set<AbstractCodeElement> newImplementation) {
    implementation = newImplementation;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "AbstractPlatformElement ";
  }
}