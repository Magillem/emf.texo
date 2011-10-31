package org.eclipse.emf.texo.test.model.schemaconstructs.substitution;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;

/** 
 * A representation of the model object '<em><b>MultiNumberType</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "MultiNumberType")
public class MultiNumberType {

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
  private List<MultiNumberTypeMyComplexAbstractGroupFeatureGroup> myComplexAbstractGroup = new ArrayList<MultiNumberTypeMyComplexAbstractGroupFeatureGroup>();

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
   * Sets the '{@link MultiNumberType#getName() <em>name</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link MultiNumberType#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>myComplexAbstractGroup</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>myComplexAbstractGroup</b></em>' feature
   * @generated
   */
  public List<MultiNumberTypeMyComplexAbstractGroupFeatureGroup> getMyComplexAbstractGroup() {
    return myComplexAbstractGroup;
  }

  /**
   * Sets the '{@link MultiNumberType#getMyComplexAbstractGroup() <em>myComplexAbstractGroup</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link MultiNumberType#getMyComplexAbstractGroup() myComplexAbstractGroup}' feature.
   * @generated
   */
  public void setMyComplexAbstractGroup(
      List<MultiNumberTypeMyComplexAbstractGroupFeatureGroup> newMyComplexAbstractGroup) {
    myComplexAbstractGroup = newMyComplexAbstractGroup;
  }

  /**
   * Returns the value of '<em><b>myComplexAbstract</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>myComplexAbstract</b></em>' feature
   * @generated
   */
  public List<ComplexNumber> getMyComplexAbstract() {
    return MultiNumberTypeMyComplexAbstractGroupFeatureGroup.createUnmodifiableValueList(getMyComplexAbstractGroup(),
        MultiNumberTypeMyComplexAbstractGroupFeatureGroup.Feature.MYCOMPLEXABSTRACT);
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "MultiNumberType " + " [name: " + getName() + "]";
  }
}