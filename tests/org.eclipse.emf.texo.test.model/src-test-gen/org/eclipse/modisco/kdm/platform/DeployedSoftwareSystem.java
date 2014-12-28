package org.eclipse.modisco.kdm.platform;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>DeployedSoftwareSystem</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "platform_DeployedSoftwareSystem")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class DeployedSoftwareSystem extends AbstractPlatformElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Set<DeployedComponent> groupedComponent = new HashSet<DeployedComponent>();

  /**
   * Returns the value of '<em><b>groupedComponent</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>groupedComponent</b></em>' feature
   * @generated
   */
  public Set<DeployedComponent> getGroupedComponent() {
    return groupedComponent;
  }

  /**
   * Sets the '{@link DeployedSoftwareSystem#getGroupedComponent() <em>groupedComponent</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newGroupedComponent
   *          the new value of the '{@link DeployedSoftwareSystem#getGroupedComponent() groupedComponent}' feature.
   * @generated
   */
  public void setGroupedComponent(Set<DeployedComponent> newGroupedComponent) {
    groupedComponent = newGroupedComponent;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "DeployedSoftwareSystem " + "{extends: " + super.toString() + "} ";
  }
}
