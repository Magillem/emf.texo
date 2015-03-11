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
 * A representation of the model object '<em><b>B461726</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "PK461726_B461726")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class B461726 extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  @JoinTable()
  private List<A461726> as = new ArrayList<A461726>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String name = null;

  /**
   * Returns the value of '<em><b>as</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>as</b></em>' feature
   * @generated
   */
  public List<A461726> getAs() {
    return as;
  }

  /**
   * Adds to the <em>as</em> feature.
   *
   * @param asValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToAs(A461726 asValue) {
    if (!as.contains(asValue)) {
      boolean result = as.add(asValue);
      asValue.addToBs(this);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>as</em> feature.
   *
   * @param asValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   *
   * @generated
   */
  public boolean removeFromAs(A461726 asValue) {
    if (as.contains(asValue)) {
      boolean result = as.remove(asValue);
      asValue.removeFromBs(this);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>as</em> feature.
   * 
   * @generated
   */
  public void clearAs() {
    while (!as.isEmpty()) {
      removeFromAs(as.iterator().next());
    }
  }

  /**
   * Sets the '{@link B461726#getAs() <em>as</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAs
   *          the new value of the '{@link B461726#getAs() as}' feature.
   * @generated
   */
  public void setAs(List<A461726> newAs) {
    clearAs();
    for (A461726 value : newAs) {
      addToAs(value);
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
   * Sets the '{@link B461726#getName() <em>name</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link B461726#getName() name}' feature.
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
    return "B461726 " + " [name: " + getName() + "]" + "{extends: " + super.toString() + "} ";
  }
}
