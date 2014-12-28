package org.eclipse.emf.texo.server.model.request;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ActionType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "request_ActionType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ActionType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @Convert("TexoTestObjectConverter")
  private List<Object> update = new ArrayList<Object>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @Convert("TexoTestObjectConverter")
  private List<Object> insert = new ArrayList<Object>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @Convert("TexoTestObjectConverter")
  private List<Object> delete = new ArrayList<Object>();

  /**
   * Returns the value of '<em><b>update</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>update</b></em>' feature
   * @generated
   */
  public List<Object> getUpdate() {
    return update;
  }

  /**
   * Sets the '{@link ActionType#getUpdate() <em>update</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newUpdate
   *          the new value of the '{@link ActionType#getUpdate() update}' feature.
   * @generated
   */
  public void setUpdate(List<Object> newUpdate) {
    update = newUpdate;
  }

  /**
   * Returns the value of '<em><b>insert</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>insert</b></em>' feature
   * @generated
   */
  public List<Object> getInsert() {
    return insert;
  }

  /**
   * Sets the '{@link ActionType#getInsert() <em>insert</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newInsert
   *          the new value of the '{@link ActionType#getInsert() insert}' feature.
   * @generated
   */
  public void setInsert(List<Object> newInsert) {
    insert = newInsert;
  }

  /**
   * Returns the value of '<em><b>delete</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>delete</b></em>' feature
   * @generated
   */
  public List<Object> getDelete() {
    return delete;
  }

  /**
   * Sets the '{@link ActionType#getDelete() <em>delete</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDelete
   *          the new value of the '{@link ActionType#getDelete() delete}' feature.
   * @generated
   */
  public void setDelete(List<Object> newDelete) {
    delete = newDelete;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ActionType " + "{extends: " + super.toString() + "} ";
  }
}
