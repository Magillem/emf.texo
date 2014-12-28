package org.eclipse.emf.texo.server.model.response;

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
 * A representation of the model object '<em><b>ResultType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "response_ResultType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ResultType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @Convert("TexoTestObjectConverter")
  private List<Object> updated = new ArrayList<Object>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @Convert("TexoTestObjectConverter")
  private List<Object> inserted = new ArrayList<Object>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @Convert("TexoTestObjectConverter")
  private List<Object> deleted = new ArrayList<Object>();

  /**
   * Returns the value of '<em><b>updated</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>updated</b></em>' feature
   * @generated
   */
  public List<Object> getUpdated() {
    return updated;
  }

  /**
   * Sets the '{@link ResultType#getUpdated() <em>updated</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newUpdated
   *          the new value of the '{@link ResultType#getUpdated() updated}' feature.
   * @generated
   */
  public void setUpdated(List<Object> newUpdated) {
    updated = newUpdated;
  }

  /**
   * Returns the value of '<em><b>inserted</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>inserted</b></em>' feature
   * @generated
   */
  public List<Object> getInserted() {
    return inserted;
  }

  /**
   * Sets the '{@link ResultType#getInserted() <em>inserted</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newInserted
   *          the new value of the '{@link ResultType#getInserted() inserted}' feature.
   * @generated
   */
  public void setInserted(List<Object> newInserted) {
    inserted = newInserted;
  }

  /**
   * Returns the value of '<em><b>deleted</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>deleted</b></em>' feature
   * @generated
   */
  public List<Object> getDeleted() {
    return deleted;
  }

  /**
   * Sets the '{@link ResultType#getDeleted() <em>deleted</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDeleted
   *          the new value of the '{@link ResultType#getDeleted() deleted}' feature.
   * @generated
   */
  public void setDeleted(List<Object> newDeleted) {
    deleted = newDeleted;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ResultType " + "{extends: " + super.toString() + "} ";
  }
}
