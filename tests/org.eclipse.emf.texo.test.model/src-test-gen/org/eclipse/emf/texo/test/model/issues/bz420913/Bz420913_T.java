package org.eclipse.emf.texo.test.model.issues.bz420913;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Bz420913_T</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Bz420913_Bz420913_T")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Bz420913_T extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Bz420913_O singleBidirectional = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn() })
  private Bz420913_O multiBidirectional = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  @JoinTable()
  private List<Bz420913_O> multiMultiBidirectional = new ArrayList<Bz420913_O>();

  /**
   * Returns the value of '<em><b>singleBidirectional</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>singleBidirectional</b></em>' feature
   * @generated
   */
  public Bz420913_O getSingleBidirectional() {
    return singleBidirectional;
  }

  /**
   * Sets the '{@link Bz420913_T#getSingleBidirectional() <em>singleBidirectional</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSingleBidirectional
   *          the new value of the '{@link Bz420913_T#getSingleBidirectional() singleBidirectional}' feature.
   * @generated
   */
  public void setSingleBidirectional(Bz420913_O newSingleBidirectional) {
    if (singleBidirectional != newSingleBidirectional) {
      if (singleBidirectional != null) {
        Bz420913_O tempSingleBidirectional = singleBidirectional;
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
  public Bz420913_O getMultiBidirectional() {
    return multiBidirectional;
  }

  /**
   * Sets the '{@link Bz420913_T#getMultiBidirectional() <em>multiBidirectional</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMultiBidirectional
   *          the new value of the '{@link Bz420913_T#getMultiBidirectional() multiBidirectional}' feature.
   * @generated
   */
  public void setMultiBidirectional(Bz420913_O newMultiBidirectional) {
    if (multiBidirectional != newMultiBidirectional) {
      if (multiBidirectional != null) {
        multiBidirectional.removeFromMultiBidirectional(this);
      }
      multiBidirectional = newMultiBidirectional;
      if (multiBidirectional != null) {
        multiBidirectional.addToMultiBidirectional(this);
      }
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
  public List<Bz420913_O> getMultiMultiBidirectional() {
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
  public boolean addToMultiMultiBidirectional(Bz420913_O multiMultiBidirectionalValue) {
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
  public boolean removeFromMultiMultiBidirectional(Bz420913_O multiMultiBidirectionalValue) {
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
   * Sets the '{@link Bz420913_T#getMultiMultiBidirectional() <em>multiMultiBidirectional</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMultiMultiBidirectional
   *          the new value of the '{@link Bz420913_T#getMultiMultiBidirectional() multiMultiBidirectional}' feature.
   * @generated
   */
  public void setMultiMultiBidirectional(List<Bz420913_O> newMultiMultiBidirectional) {
    clearMultiMultiBidirectional();
    for (Bz420913_O value : newMultiMultiBidirectional) {
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
    return "Bz420913_T " + "{extends: " + super.toString() + "} ";
  }
}
