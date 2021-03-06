/**
 * <copyright>
 * </copyright>
 *
 * $Id: UniqueConstraint.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Unique Constraint</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <!-- begin-model-doc -->
 * 
 * 
 * @Target({ ) @Retention(RUNTIME) public @interface UniqueConstraint { String name() default ""; String[]
 *           columnNames(); }
 * 
 * 
 *           <!-- end-model-doc -->
 * 
 *           <p>
 *           The following features are supported:
 *           <ul>
 *           <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.UniqueConstraint#getColumnName <em>Column Name
 *           </em>}</li>
 *           <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.UniqueConstraint#getName <em>Name</em>}</li>
 *           </ul>
 *           </p>
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getUniqueConstraint()
 * @model extendedMetaData="name='unique-constraint' kind='elementOnly'"
 * @generated
 */
public interface UniqueConstraint extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Column Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Name</em>' attribute list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Name</em>' attribute list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getUniqueConstraint_ColumnName()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='column-name' namespace='##targetNamespace'"
   * @generated
   */
  EList<String> getColumnName();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getUniqueConstraint_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.UniqueConstraint#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // UniqueConstraint
