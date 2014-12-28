package org.eclipse.modisco.kdm.kdm;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>KDMModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> A KDM model corresponds to one of the well-known architecture views of software systems. KDM
 * defines several concrete subclasses of the KDMModel class. <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "kdm_KDMModel")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class KDMModel extends KDMFramework {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Instances of KDM entities owned by the
   * model. Each KDM model defines specific subclasses of KDMEntity class. <!-- end-model-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  @JoinTable()
  @Access(AccessType.FIELD)
  private List<KDMEntity> ownedElement = new ArrayList<KDMEntity>();

  /**
   * Returns the value of '<em><b>ownedElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Instances of KDM entities owned by the
   * model. Each KDM model defines specific subclasses of KDMEntity class. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>ownedElement</b></em>' feature
   * @generated
   */
  public List<KDMEntity> getOwnedElement() {
    return ownedElement;
  }

  /**
   * Adds to the <em>ownedElement</em> feature.
   *
   * @param ownedElementValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToOwnedElement(KDMEntity ownedElementValue) {
    if (!ownedElement.contains(ownedElementValue)) {
      boolean result = ownedElement.add(ownedElementValue);
      ownedElementValue.setModel(this);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>ownedElement</em> feature.
   *
   * @param ownedElementValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   *
   * @generated
   */
  public boolean removeFromOwnedElement(KDMEntity ownedElementValue) {
    if (ownedElement.contains(ownedElementValue)) {
      boolean result = ownedElement.remove(ownedElementValue);
      ownedElementValue.setModel(null);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>ownedElement</em> feature.
   * 
   * @generated
   */
  public void clearOwnedElement() {
    while (!ownedElement.isEmpty()) {
      removeFromOwnedElement(ownedElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link KDMModel#getOwnedElement() <em>ownedElement</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Instances of KDM entities owned by the
   * model. Each KDM model defines specific subclasses of KDMEntity class. <!-- end-model-doc -->
   * 
   * @param newOwnedElement
   *          the new value of the '{@link KDMModel#getOwnedElement() ownedElement}' feature.
   * @generated
   */
  public void setOwnedElement(List<KDMEntity> newOwnedElement) {
    clearOwnedElement();
    for (KDMEntity value : newOwnedElement) {
      addToOwnedElement(value);
    }
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "KDMModel " + "{extends: " + super.toString() + "} ";
  }
}
