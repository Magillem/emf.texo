/**
 * <copyright>
 * </copyright>
 *
 * $Id: FieldResult.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Field Result</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({}) @Retention(RUNTIME)
 * 				public @interface
 * 				FieldResult {
 * 				String name();
 * 				String column();
 * 				}
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.FieldResult#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.FieldResult#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getFieldResult()
 * @model extendedMetaData="name='field-result' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface FieldResult extends BaseOrmAnnotation {
  /**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(String)
	 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getFieldResult_Column()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='column'"
	 * @generated
	 */
  String getColumn();

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.FieldResult#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #getColumn()
	 * @generated
	 */
  void setColumn(String value);

  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getFieldResult_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.FieldResult#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

} // FieldResult
