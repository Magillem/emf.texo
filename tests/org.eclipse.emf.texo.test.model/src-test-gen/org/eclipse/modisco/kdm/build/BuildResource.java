package org.eclipse.modisco.kdm.build;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>BuildResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "build_BuildResource")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class BuildResource extends AbstractBuildElement {

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
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Set<AbstractBuildElement> groupedBuild = new HashSet<AbstractBuildElement>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractBuildElement> buildElement = new HashSet<AbstractBuildElement>();

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
   * Adds to the <em>implementation</em> feature.
   * 
   * @param implementationValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToImplementation(KDMEntity implementationValue) {
    if (!implementation.contains(implementationValue)) {
      boolean result = implementation.add(implementationValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>implementation</em> feature.
   * 
   * @param implementationValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromImplementation(KDMEntity implementationValue) {
    if (implementation.contains(implementationValue)) {
      boolean result = implementation.remove(implementationValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>implementation</em> feature.
   * 
   * @generated
   */
  public void clearImplementation() {
    while (!implementation.isEmpty()) {
      removeFromImplementation(implementation.iterator().next());
    }
  }

  /**
   * Sets the '{@link BuildResource#getImplementation() <em>implementation</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newImplementation
   *          the new value of the '{@link BuildResource#getImplementation() implementation}' feature.
   * @generated
   */
  public void setImplementation(Set<KDMEntity> newImplementation) {
    implementation = newImplementation;
  }

  /**
   * Returns the value of '<em><b>groupedBuild</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>groupedBuild</b></em>' feature
   * @generated
   */
  public Set<AbstractBuildElement> getGroupedBuild() {
    return groupedBuild;
  }

  /**
   * Adds to the <em>groupedBuild</em> feature.
   * 
   * @param groupedBuildValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToGroupedBuild(AbstractBuildElement groupedBuildValue) {
    if (!groupedBuild.contains(groupedBuildValue)) {
      boolean result = groupedBuild.add(groupedBuildValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>groupedBuild</em> feature.
   * 
   * @param groupedBuildValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromGroupedBuild(AbstractBuildElement groupedBuildValue) {
    if (groupedBuild.contains(groupedBuildValue)) {
      boolean result = groupedBuild.remove(groupedBuildValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>groupedBuild</em> feature.
   * 
   * @generated
   */
  public void clearGroupedBuild() {
    while (!groupedBuild.isEmpty()) {
      removeFromGroupedBuild(groupedBuild.iterator().next());
    }
  }

  /**
   * Sets the '{@link BuildResource#getGroupedBuild() <em>groupedBuild</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newGroupedBuild
   *          the new value of the '{@link BuildResource#getGroupedBuild() groupedBuild}' feature.
   * @generated
   */
  public void setGroupedBuild(Set<AbstractBuildElement> newGroupedBuild) {
    groupedBuild = newGroupedBuild;
  }

  /**
   * Returns the value of '<em><b>buildElement</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>buildElement</b></em>' feature
   * @generated
   */
  public Set<AbstractBuildElement> getBuildElement() {
    return buildElement;
  }

  /**
   * Adds to the <em>buildElement</em> feature.
   * 
   * @param buildElementValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToBuildElement(AbstractBuildElement buildElementValue) {
    if (!buildElement.contains(buildElementValue)) {
      boolean result = buildElement.add(buildElementValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>buildElement</em> feature.
   * 
   * @param buildElementValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromBuildElement(AbstractBuildElement buildElementValue) {
    if (buildElement.contains(buildElementValue)) {
      boolean result = buildElement.remove(buildElementValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>buildElement</em> feature.
   * 
   * @generated
   */
  public void clearBuildElement() {
    while (!buildElement.isEmpty()) {
      removeFromBuildElement(buildElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link BuildResource#getBuildElement() <em>buildElement</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBuildElement
   *          the new value of the '{@link BuildResource#getBuildElement() buildElement}' feature.
   * @generated
   */
  public void setBuildElement(Set<AbstractBuildElement> newBuildElement) {
    buildElement = newBuildElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "BuildResource " + "{extends: " + super.toString() + "} ";
  }
}
