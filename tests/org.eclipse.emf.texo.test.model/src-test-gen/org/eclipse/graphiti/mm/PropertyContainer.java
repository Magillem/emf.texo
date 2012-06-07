package org.eclipse.graphiti.mm;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>PropertyContainer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "mm_PropertyContainer")
public abstract class PropertyContainer extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<Property> properties = new HashSet<Property>();

  /**
   * Returns the value of '<em><b>properties</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>properties</b></em>' feature
   * @generated
   */
  public Set<Property> getProperties() {
    return properties;
  }

  /**
   * Adds to the <em>properties</em> feature.
   * 
   * @generated
   */
  public void addToProperties(Property propertiesValue) {
    if (!properties.contains(propertiesValue)) {
      properties.add(propertiesValue);
    }
  }

  /**
   * Removes from the <em>properties</em> feature.
   * 
   * @generated
   */
  public void removeFromProperties(Property propertiesValue) {
    if (properties.contains(propertiesValue)) {
      properties.remove(propertiesValue);
    }
  }

  /**
   * Clears the <em>properties</em> feature.
   * 
   * @generated
   */
  public void clearProperties() {
    while (!properties.isEmpty()) {
      removeFromProperties(properties.iterator().next());
    }
  }

  /**
   * Sets the '{@link PropertyContainer#getProperties() <em>properties</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link PropertyContainer#getProperties() properties}' feature.
   * @generated
   */
  public void setProperties(Set<Property> newProperties) {
    properties = newProperties;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PropertyContainer ";
  }
}