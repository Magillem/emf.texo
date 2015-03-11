package org.eclipse.emf.texo.test.model.issues.bz461726;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>A461726</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "PK461726_A461726")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class A461726 extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  @JoinTable()
  private List<B461726> bs = new ArrayList<B461726>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String name = null;

  /**
   * Returns the value of '<em><b>bs</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>bs</b></em>' feature
   * @generated
   */
  public List<B461726> getBs() {
    return bs;
  }

  /**
   * Adds to the <em>bs</em> feature.
   *
   * @param bsValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToBs(B461726 bsValue) {
    if (!bs.contains(bsValue)) {
      boolean result = bs.add(bsValue);
      bsValue.addToAs(this);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>bs</em> feature.
   *
   * @param bsValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   *
   * @generated
   */
  public boolean removeFromBs(B461726 bsValue) {
    if (bs.contains(bsValue)) {
      boolean result = bs.remove(bsValue);
      bsValue.removeFromAs(this);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>bs</em> feature.
   * 
   * @generated
   */
  public void clearBs() {
    while (!bs.isEmpty()) {
      removeFromBs(bs.iterator().next());
    }
  }

  /**
   * Sets the '{@link A461726#getBs() <em>bs</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBs
   *          the new value of the '{@link A461726#getBs() bs}' feature.
   * @generated
   */
  public void setBs(List<B461726> newBs) {
    clearBs();
    for (B461726 value : newBs) {
      addToBs(value);
    }
  }

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link A461726#getName() <em>name</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link A461726#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "A461726 " + " [name: " + getName() + "]" + "{extends: " + super.toString() + "} ";
  }
}
