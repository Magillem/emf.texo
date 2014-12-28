package org.eclipse.emf.texo.test.model.samples.extendedpo2;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Supplier</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "com_example_epo2_Supplier")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Supplier extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<Customer> customers = new ArrayList<Customer>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<PurchaseOrder> orders = new ArrayList<PurchaseOrder>();

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
   * Sets the '{@link Supplier#getName() <em>name</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link Supplier#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>customers</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>customers</b></em>' feature
   * @generated
   */
  public List<Customer> getCustomers() {
    return customers;
  }

  /**
   * Sets the '{@link Supplier#getCustomers() <em>customers</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCustomers
   *          the new value of the '{@link Supplier#getCustomers() customers}' feature.
   * @generated
   */
  public void setCustomers(List<Customer> newCustomers) {
    customers = newCustomers;
  }

  /**
   * Returns the value of '<em><b>orders</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>orders</b></em>' feature
   * @generated
   */
  public List<PurchaseOrder> getOrders() {
    return orders;
  }

  /**
   * Sets the '{@link Supplier#getOrders() <em>orders</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newOrders
   *          the new value of the '{@link Supplier#getOrders() orders}' feature.
   * @generated
   */
  public void setOrders(List<PurchaseOrder> newOrders) {
    orders = newOrders;
  }

  /**
   * Returns the value of '<em><b>pendingOrders</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>pendingOrders</b></em>' feature
   * @generated
   */
  public List<PurchaseOrder> getPendingOrders() {
    // Volatile feature
    // TODO: implement this method to return the 'pendingOrders'
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * Returns the value of '<em><b>shippedOrders</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>shippedOrders</b></em>' feature
   * @generated
   */
  public List<PurchaseOrder> getShippedOrders() {
    // Volatile feature
    // TODO: implement this method to return the 'shippedOrders'
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Supplier " + " [name: " + getName() + "]" + "{extends: " + super.toString() + "} ";
  }
}
