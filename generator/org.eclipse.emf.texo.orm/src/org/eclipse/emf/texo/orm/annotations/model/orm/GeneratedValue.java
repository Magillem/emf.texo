/**
 * <copyright>
 * </copyright>
 *
 * $Id: GeneratedValue.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Generated Value</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * 
 * 
 * @Target({METHOD, FIELD}) @Retention(RUNTIME) public @interface GeneratedValue { GenerationType strategy() default
 *                  AUTO; String generator() default ""; }
 * 
 * 
 *                  <!-- end-model-doc -->
 * 
 *                  <p>
 *                  The following features are supported:
 *                  <ul>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.GeneratedValue#getGenerator <em>Generator
 *                  </em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.GeneratedValue#getStrategy <em>Strategy
 *                  </em>}</li>
 *                  </ul>
 *                  </p>
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getGeneratedValue()
 * @model extendedMetaData="name='generated-value' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface GeneratedValue extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Generator</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generator</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Generator</em>' attribute.
   * @see #setGenerator(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getGeneratedValue_Generator()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData="kind='attribute' name='generator'"
   * @generated
   */
  String getGenerator();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.GeneratedValue#getGenerator
   * <em>Generator</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Generator</em>' attribute.
   * @see #getGenerator()
   * @generated
   */
  void setGenerator(String value);

  /**
   * Returns the value of the '<em><b>Strategy</b></em>' attribute. The literals are from the enumeration
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.GenerationType}. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strategy</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Strategy</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.GenerationType
   * @see #isSetStrategy()
   * @see #unsetStrategy()
   * @see #setStrategy(GenerationType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getGeneratedValue_Strategy()
   * @model unsettable="true" extendedMetaData="kind='attribute' name='strategy'"
   * @generated
   */
  GenerationType getStrategy();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.GeneratedValue#getStrategy
   * <em>Strategy</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Strategy</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.GenerationType
   * @see #isSetStrategy()
   * @see #unsetStrategy()
   * @see #getStrategy()
   * @generated
   */
  void setStrategy(GenerationType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.GeneratedValue#getStrategy
   * <em>Strategy</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetStrategy()
   * @see #getStrategy()
   * @see #setStrategy(GenerationType)
   * @generated
   */
  void unsetStrategy();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.GeneratedValue#getStrategy
   * <em>Strategy</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return whether the value of the '<em>Strategy</em>' attribute is set.
   * @see #unsetStrategy()
   * @see #getStrategy()
   * @see #setStrategy(GenerationType)
   * @generated
   */
  boolean isSetStrategy();

} // GeneratedValue
