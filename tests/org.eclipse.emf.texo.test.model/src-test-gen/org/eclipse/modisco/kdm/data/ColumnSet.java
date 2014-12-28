package org.eclipse.modisco.kdm.data;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.code.ItemUnit;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ColumnSet</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "data_ColumnSet")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ColumnSet extends DataContainer {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<ItemUnit> itemUnit = new ArrayList<ItemUnit>();

  /**
   * Returns the value of '<em><b>itemUnit</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>itemUnit</b></em>' feature
   * @generated
   */
  public List<ItemUnit> getItemUnit() {
    return itemUnit;
  }

  /**
   * Sets the '{@link ColumnSet#getItemUnit() <em>itemUnit</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newItemUnit
   *          the new value of the '{@link ColumnSet#getItemUnit() itemUnit}' feature.
   * @generated
   */
  public void setItemUnit(List<ItemUnit> newItemUnit) {
    itemUnit = newItemUnit;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ColumnSet " + "{extends: " + super.toString() + "} ";
  }
}
