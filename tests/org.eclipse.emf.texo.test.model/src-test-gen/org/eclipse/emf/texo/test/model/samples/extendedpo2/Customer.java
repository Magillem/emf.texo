package org.eclipse.emf.texo.test.model.samples.extendedpo2;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Customer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "com_example_epo2_Customer")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Customer extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private int customerID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  @JoinTable()
  private List<PurchaseOrder> orders = new ArrayList<PurchaseOrder>();

  /**
   * Returns the value of '<em><b>customerID</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>customerID</b></em>' feature
   * @generated
   */
  public int getCustomerID() {
    return customerID;
  }

  /**
   * Sets the '{@link Customer#getCustomerID() <em>customerID</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCustomerID
   *          the new value of the '{@link Customer#getCustomerID() customerID}' feature.
   * @generated
   */
  public void setCustomerID(int newCustomerID) {
    customerID = newCustomerID;
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
   * Sets the '{@link Customer#getOrders() <em>orders</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newOrders
   *          the new value of the '{@link Customer#getOrders() orders}' feature.
   * @generated
   */
  public void setOrders(List<PurchaseOrder> newOrders) {
    orders = newOrders;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Customer " + " [customerID: " + getCustomerID() + "]" + "{extends: " + super.toString() + "} ";
  }
}
