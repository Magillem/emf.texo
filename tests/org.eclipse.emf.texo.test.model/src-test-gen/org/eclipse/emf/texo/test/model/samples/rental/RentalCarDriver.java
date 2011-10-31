package org.eclipse.emf.texo.test.model.samples.rental;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/** 
 * A representation of the model object '<em><b>RentalCarDriver</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "RentalCarDriver")
public class RentalCarDriver extends Identifiable {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = false)
  private String name = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToOne(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, mappedBy = "currentDriver", optional = true, targetEntity = RentalCar.class)
  private RentalCar currentRentalCar = null;

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link RentalCarDriver#getName() <em>name</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link RentalCarDriver#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>currentRentalCar</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>currentRentalCar</b></em>' feature
   * @generated
   */
  public RentalCar getCurrentRentalCar() {
    return currentRentalCar;
  }

  /**
   * Sets the '{@link RentalCarDriver#getCurrentRentalCar() <em>currentRentalCar</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link RentalCarDriver#getCurrentRentalCar() currentRentalCar}' feature.
   * @generated
   */
  public void setCurrentRentalCar(RentalCar newCurrentRentalCar) {
    currentRentalCar = newCurrentRentalCar;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "RentalCarDriver " + " [name: " + getName() + "]";
  }
}