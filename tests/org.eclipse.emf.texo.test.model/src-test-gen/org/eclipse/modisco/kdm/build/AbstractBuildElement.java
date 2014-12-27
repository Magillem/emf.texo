package org.eclipse.modisco.kdm.build;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>AbstractBuildElement</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "build_AbstractBuildElement")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class AbstractBuildElement extends KDMEntity {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractBuildRelationship> buildRelation = new HashSet<AbstractBuildRelationship>();

  /**
   * Returns the value of '<em><b>buildRelation</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>buildRelation</b></em>' feature
   * @generated
   */
  public Set<AbstractBuildRelationship> getBuildRelation() {
    return buildRelation;
  }

  /**
   * Adds to the <em>buildRelation</em> feature.
   * 
   * @param buildRelationValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToBuildRelation(AbstractBuildRelationship buildRelationValue) {
    if (!buildRelation.contains(buildRelationValue)) {
      boolean result = buildRelation.add(buildRelationValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>buildRelation</em> feature.
   * 
   * @param buildRelationValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromBuildRelation(AbstractBuildRelationship buildRelationValue) {
    if (buildRelation.contains(buildRelationValue)) {
      boolean result = buildRelation.remove(buildRelationValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>buildRelation</em> feature.
   * 
   * @generated
   */
  public void clearBuildRelation() {
    while (!buildRelation.isEmpty()) {
      removeFromBuildRelation(buildRelation.iterator().next());
    }
  }

  /**
   * Sets the '{@link AbstractBuildElement#getBuildRelation() <em>buildRelation</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBuildRelation
   *          the new value of the '{@link AbstractBuildElement#getBuildRelation() buildRelation}' feature.
   * @generated
   */
  public void setBuildRelation(Set<AbstractBuildRelationship> newBuildRelation) {
    buildRelation = newBuildRelation;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AbstractBuildElement " + "{extends: " + super.toString() + "} ";
  }
}
