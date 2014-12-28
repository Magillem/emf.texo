package org.eclipse.modisco.kdm.source;

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
 * A representation of the model object '<em><b>AbstractInventoryElement</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "source_AbstractInventoryElement")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class AbstractInventoryElement extends KDMEntity {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractInventoryRelationship> inventoryRelationship = new HashSet<AbstractInventoryRelationship>();

  /**
   * Returns the value of '<em><b>inventoryRelationship</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>inventoryRelationship</b></em>' feature
   * @generated
   */
  public Set<AbstractInventoryRelationship> getInventoryRelationship() {
    return inventoryRelationship;
  }

  /**
   * Sets the '{@link AbstractInventoryElement#getInventoryRelationship() <em>inventoryRelationship</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newInventoryRelationship
   *          the new value of the '{@link AbstractInventoryElement#getInventoryRelationship() inventoryRelationship}'
   *          feature.
   * @generated
   */
  public void setInventoryRelationship(Set<AbstractInventoryRelationship> newInventoryRelationship) {
    inventoryRelationship = newInventoryRelationship;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AbstractInventoryElement " + "{extends: " + super.toString() + "} ";
  }
}
