/**
 * <copyright>
 * </copyright>
 *
 * $Id: JoinFetchType.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Join Fetch Type</b></em>', and
 * utility methods for working with them. <!-- end-user-doc --> <!-- begin-model-doc -->
 * 
 * 
 * public enum JoinFetchType { * * An inner join is used to fetch the related object. * This does not allow for
 * null/empty values. * INNER,
 * 
 * * * An inner join is used to fetch the related object. * This allows for null/empty values. * OUTER, }
 * 
 * 
 * <!-- end-model-doc -->
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getJoinFetchType()
 * @model extendedMetaData="name='join-fetch-type'"
 * @generated
 */
public enum JoinFetchType implements Enumerator {
  /**
   * The '<em><b>INNER</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #INNER_VALUE
   * @generated
   * @ordered
   */
  INNER(0, "INNER", "INNER"),

  /**
   * The '<em><b>OUTER</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #OUTER_VALUE
   * @generated
   * @ordered
   */
  OUTER(1, "OUTER", "OUTER");

  /**
   * The '<em><b>INNER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INNER</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INNER
   * @model
   * @generated
   * @ordered
   */
  public static final int INNER_VALUE = 0;

  /**
   * The '<em><b>OUTER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>OUTER</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OUTER
   * @model
   * @generated
   * @ordered
   */
  public static final int OUTER_VALUE = 1;

  /**
   * An array of all the '<em><b>Join Fetch Type</b></em>' enumerators.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private static final JoinFetchType[] VALUES_ARRAY = new JoinFetchType[] {
      INNER,
      OUTER,
    };

  /**
   * A public read-only list of all the '<em><b>Join Fetch Type</b></em>' enumerators.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static final List<JoinFetchType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Join Fetch Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JoinFetchType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      JoinFetchType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Join Fetch Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static JoinFetchType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      JoinFetchType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Join Fetch Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JoinFetchType get(int value) {
    switch (value) {
      case INNER_VALUE: return INNER;
      case OUTER_VALUE: return OUTER;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private JoinFetchType(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public int getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral() {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return literal;
  }

} // JoinFetchType
