package org.eclipse.emf.texo.test.model.issues.bz486803;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ClzOne</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "InterfaceTest_ClzOne")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ClzOne extends Identifiable implements InterfaceThreeT, InterfaceTwoT {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String thirdName = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String secondName = null;

  /**
   * Returns the value of '<em><b>thirdName</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>thirdName</b></em>' feature
   * @generated
   */
  public String getThirdName() {
    return thirdName;
  }

  /**
   * Sets the '{@link ClzOne#getThirdName() <em>thirdName</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newThirdName
   *          the new value of the '{@link ClzOne#getThirdName() thirdName}' feature.
   * @generated
   */
  public void setThirdName(String newThirdName) {
    thirdName = newThirdName;
  }

  /**
   * Returns the value of '<em><b>secondName</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>secondName</b></em>' feature
   * @generated
   */
  public String getSecondName() {
    return secondName;
  }

  /**
   * Sets the '{@link ClzOne#getSecondName() <em>secondName</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSecondName
   *          the new value of the '{@link ClzOne#getSecondName() secondName}' feature.
   * @generated
   */
  public void setSecondName(String newSecondName) {
    secondName = newSecondName;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ClzOne " + " [thirdName: " + getThirdName() + "]" + " [secondName: " + getSecondName() + "]" + "{extends: "
        + super.toString() + "} ";
  }
}
