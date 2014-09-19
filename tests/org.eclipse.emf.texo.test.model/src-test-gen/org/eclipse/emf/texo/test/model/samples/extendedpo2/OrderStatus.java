package org.eclipse.emf.texo.test.model.samples.extendedpo2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>OrderStatus</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum OrderStatus {

  /**
   * The enum: PENDING <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  PENDING(0, "Pending", "Pending") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isPending() {
      return true;
    }
  },
  /**
   * The enum: BACKORDER <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  BACKORDER(1, "BackOrder", "BackOrder") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isBackOrder() {
      return true;
    }
  },
  /**
   * The enum: COMPLETE <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  COMPLETE(2, "Complete", "Complete") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isComplete() {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>OrderStatus</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final OrderStatus[] VALUES_ARRAY = new OrderStatus[] { PENDING, BACKORDER, COMPLETE };

  /**
   * A public read-only list of all the '<em><b>OrderStatus</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<OrderStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>OrderStatus</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @param literal
   *          the literal to use to get the enum instance
   * @return the OrderStatus, the literal enum class
   * @generated
   */
  public static OrderStatus get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      OrderStatus result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>OrderStatus</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the OrderStatus, the literal enum class
   * @generated
   */
  public static OrderStatus getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      OrderStatus result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>OrderStatus</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the OrderStatus, the literal enum
   * @generated
   */
  public static OrderStatus get(int value) {
    for (OrderStatus enumInstance : VALUES_ARRAY) {
      if (enumInstance.getValue() == value) {
        return enumInstance;
      }
    }
    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private OrderStatus(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isPending() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isBackOrder() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isComplete() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value
   * @generated
   */
  public int getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the name
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the literal of this enum instance
   * @generated
   */
  public String getLiteral() {
    return literal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the literal value of the enumerator, which is its string representation.
   * @generated
   */
  @Override
  public String toString() {
    return literal;
  }
}
