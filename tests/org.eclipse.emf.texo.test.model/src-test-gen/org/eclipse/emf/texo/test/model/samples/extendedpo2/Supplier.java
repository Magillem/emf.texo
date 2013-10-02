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
   * Adds to the <em>customers</em> feature.
   * 
   * @param customersValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToCustomers(Customer customersValue) {
    if (!customers.contains(customersValue)) {
      boolean result = customers.add(customersValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>customers</em> feature.
   * 
   * @param customersValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromCustomers(Customer customersValue) {
    if (customers.contains(customersValue)) {
      boolean result = customers.remove(customersValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>customers</em> feature.
   * 
   * @generated
   */
  public void clearCustomers() {
    while (!customers.isEmpty()) {
      removeFromCustomers(customers.iterator().next());
    }
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
   * Adds to the <em>orders</em> feature.
   * 
   * @param ordersValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToOrders(PurchaseOrder ordersValue) {
    if (!orders.contains(ordersValue)) {
      boolean result = orders.add(ordersValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>orders</em> feature.
   * 
   * @param ordersValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromOrders(PurchaseOrder ordersValue) {
    if (orders.contains(ordersValue)) {
      boolean result = orders.remove(ordersValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>orders</em> feature.
   * 
   * @generated
   */
  public void clearOrders() {
    while (!orders.isEmpty()) {
      removeFromOrders(orders.iterator().next());
    }
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
    return "Supplier " + " [name: " + getName() + "]";
  }
}
