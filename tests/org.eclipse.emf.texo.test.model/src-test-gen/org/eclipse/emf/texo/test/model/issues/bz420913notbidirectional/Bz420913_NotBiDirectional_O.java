package org.eclipse.emf.texo.test.model.issues.bz420913notbidirectional;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>bz420913_NotBiDirectional_O</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "bz420913_NotBiDirectional_bz420913_NotBiDirectional_O")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Bz420913_NotBiDirectional_O extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, mappedBy = "singleBidirectional")
  private Bz420913_NotBiDirectional_T singleBidirectional = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  @JoinTable()
  private List<Bz420913_NotBiDirectional_T> multiBidirectional = new ArrayList<Bz420913_NotBiDirectional_T>();

  /**
   * Returns the value of '<em><b>singleBidirectional</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>singleBidirectional</b></em>' feature
   * @generated
   */
  public Bz420913_NotBiDirectional_T getSingleBidirectional() {
    return singleBidirectional;
  }

  /**
   * Sets the '{@link Bz420913_NotBiDirectional_O#getSingleBidirectional() <em>singleBidirectional</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSingleBidirectional
   *          the new value of the '{@link Bz420913_NotBiDirectional_O#getSingleBidirectional() singleBidirectional}'
   *          feature.
   * @generated
   */
  public void setSingleBidirectional(Bz420913_NotBiDirectional_T newSingleBidirectional) {
    singleBidirectional = newSingleBidirectional;
  }

  /**
   * Returns the value of '<em><b>multiBidirectional</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>multiBidirectional</b></em>' feature
   * @generated
   */
  public List<Bz420913_NotBiDirectional_T> getMultiBidirectional() {
    return multiBidirectional;
  }

  /**
   * Sets the '{@link Bz420913_NotBiDirectional_O#getMultiBidirectional() <em>multiBidirectional</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMultiBidirectional
   *          the new value of the '{@link Bz420913_NotBiDirectional_O#getMultiBidirectional() multiBidirectional}'
   *          feature.
   * @generated
   */
  public void setMultiBidirectional(List<Bz420913_NotBiDirectional_T> newMultiBidirectional) {
    multiBidirectional = newMultiBidirectional;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "bz420913_NotBiDirectional_O " + "{extends: " + super.toString() + "} ";
  }
}
