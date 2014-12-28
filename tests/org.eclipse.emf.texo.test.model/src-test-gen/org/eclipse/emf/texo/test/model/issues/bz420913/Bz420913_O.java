package org.eclipse.emf.texo.test.model.issues.bz420913;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Bz420913_O</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Bz420913_Bz420913_O")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Bz420913_O extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, mappedBy = "singleBidirectional")
  private Bz420913_T singleBidirectional = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  @JoinTable()
  private List<Bz420913_T> multiBidirectional = new ArrayList<Bz420913_T>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  @JoinTable()
  private List<Bz420913_T> multiMultiBidirectional = new ArrayList<Bz420913_T>();

  /**
   * Returns the value of '<em><b>singleBidirectional</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>singleBidirectional</b></em>' feature
   * @generated
   */
  public Bz420913_T getSingleBidirectional() {
    return singleBidirectional;
  }

  /**
   * Sets the '{@link Bz420913_O#getSingleBidirectional() <em>singleBidirectional</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSingleBidirectional
   *          the new value of the '{@link Bz420913_O#getSingleBidirectional() singleBidirectional}' feature.
   * @generated
   */
  public void setSingleBidirectional(Bz420913_T newSingleBidirectional) {
    if (singleBidirectional != newSingleBidirectional) {
      if (singleBidirectional != null) {
        Bz420913_T tempSingleBidirectional = singleBidirectional;
        singleBidirectional = null;
        tempSingleBidirectional.setSingleBidirectional(null);
      }
      singleBidirectional = newSingleBidirectional;
      if (singleBidirectional != null) {
        singleBidirectional.setSingleBidirectional(this);
      }
    }
  }

  /**
   * Returns the value of '<em><b>multiBidirectional</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>multiBidirectional</b></em>' feature
   * @generated
   */
  public List<Bz420913_T> getMultiBidirectional() {
    return multiBidirectional;
  }

  /**
   * Adds to the <em>multiBidirectional</em> feature.
   *
   * @param multiBidirectionalValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToMultiBidirectional(Bz420913_T multiBidirectionalValue) {
    if (!multiBidirectional.contains(multiBidirectionalValue)) {
      boolean result = multiBidirectional.add(multiBidirectionalValue);
      multiBidirectionalValue.setMultiBidirectional(this);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>multiBidirectional</em> feature.
   *
   * @param multiBidirectionalValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   *
   * @generated
   */
  public boolean removeFromMultiBidirectional(Bz420913_T multiBidirectionalValue) {
    if (multiBidirectional.contains(multiBidirectionalValue)) {
      boolean result = multiBidirectional.remove(multiBidirectionalValue);
      multiBidirectionalValue.setMultiBidirectional(null);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>multiBidirectional</em> feature.
   * 
   * @generated
   */
  public void clearMultiBidirectional() {
    while (!multiBidirectional.isEmpty()) {
      removeFromMultiBidirectional(multiBidirectional.iterator().next());
    }
  }

  /**
   * Sets the '{@link Bz420913_O#getMultiBidirectional() <em>multiBidirectional</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMultiBidirectional
   *          the new value of the '{@link Bz420913_O#getMultiBidirectional() multiBidirectional}' feature.
   * @generated
   */
  public void setMultiBidirectional(List<Bz420913_T> newMultiBidirectional) {
    clearMultiBidirectional();
    for (Bz420913_T value : newMultiBidirectional) {
      addToMultiBidirectional(value);
    }
  }

  /**
   * Returns the value of '<em><b>multiMultiBidirectional</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>multiMultiBidirectional</b></em>' feature
   * @generated
   */
  public List<Bz420913_T> getMultiMultiBidirectional() {
    return multiMultiBidirectional;
  }

  /**
   * Adds to the <em>multiMultiBidirectional</em> feature.
   *
   * @param multiMultiBidirectionalValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToMultiMultiBidirectional(Bz420913_T multiMultiBidirectionalValue) {
    if (!multiMultiBidirectional.contains(multiMultiBidirectionalValue)) {
      boolean result = multiMultiBidirectional.add(multiMultiBidirectionalValue);
      multiMultiBidirectionalValue.addToMultiMultiBidirectional(this);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>multiMultiBidirectional</em> feature.
   *
   * @param multiMultiBidirectionalValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   *
   * @generated
   */
  public boolean removeFromMultiMultiBidirectional(Bz420913_T multiMultiBidirectionalValue) {
    if (multiMultiBidirectional.contains(multiMultiBidirectionalValue)) {
      boolean result = multiMultiBidirectional.remove(multiMultiBidirectionalValue);
      multiMultiBidirectionalValue.removeFromMultiMultiBidirectional(this);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>multiMultiBidirectional</em> feature.
   * 
   * @generated
   */
  public void clearMultiMultiBidirectional() {
    while (!multiMultiBidirectional.isEmpty()) {
      removeFromMultiMultiBidirectional(multiMultiBidirectional.iterator().next());
    }
  }

  /**
   * Sets the '{@link Bz420913_O#getMultiMultiBidirectional() <em>multiMultiBidirectional</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMultiMultiBidirectional
   *          the new value of the '{@link Bz420913_O#getMultiMultiBidirectional() multiMultiBidirectional}' feature.
   * @generated
   */
  public void setMultiMultiBidirectional(List<Bz420913_T> newMultiMultiBidirectional) {
    clearMultiMultiBidirectional();
    for (Bz420913_T value : newMultiMultiBidirectional) {
      addToMultiMultiBidirectional(value);
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
    return "Bz420913_O " + "{extends: " + super.toString() + "} ";
  }
}
