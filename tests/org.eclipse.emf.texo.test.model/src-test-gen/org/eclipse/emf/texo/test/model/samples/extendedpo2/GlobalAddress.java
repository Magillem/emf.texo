package org.eclipse.emf.texo.test.model.samples.extendedpo2;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>GlobalAddress</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "com_example_epo2_GlobalAddress")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class GlobalAddress extends Address {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @CollectionTable()
  private List<String> location = new ArrayList<String>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private int countryCode = 0;

  /**
   * Returns the value of '<em><b>location</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>location</b></em>' feature
   * @generated
   */
  public List<String> getLocation() {
    return location;
  }

  /**
   * Sets the '{@link GlobalAddress#getLocation() <em>location</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLocation
   *          the new value of the '{@link GlobalAddress#getLocation() location}' feature.
   * @generated
   */
  public void setLocation(List<String> newLocation) {
    location = newLocation;
  }

  /**
   * Returns the value of '<em><b>countryCode</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>countryCode</b></em>' feature
   * @generated
   */
  public int getCountryCode() {
    return countryCode;
  }

  /**
   * Sets the '{@link GlobalAddress#getCountryCode() <em>countryCode</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCountryCode
   *          the new value of the '{@link GlobalAddress#getCountryCode() countryCode}' feature.
   * @generated
   */
  public void setCountryCode(int newCountryCode) {
    countryCode = newCountryCode;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "GlobalAddress " + " [countryCode: " + getCountryCode() + "]" + "{extends: " + super.toString() + "} ";
  }
}
