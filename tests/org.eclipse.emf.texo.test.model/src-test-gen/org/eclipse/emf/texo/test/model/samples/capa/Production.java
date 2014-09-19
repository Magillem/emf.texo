package org.eclipse.emf.texo.test.model.samples.capa;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Production</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "capa_Production")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Production extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String article = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Temporal(TemporalType.DATE)
  private Date dueTime = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Float missingAmount = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String productionId = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Temporal(TemporalType.DATE)
  private Date startTime = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Float totalAmount = null;

  /**
   * Returns the value of '<em><b>article</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>article</b></em>' feature
   * @generated
   */
  public String getArticle() {
    return article;
  }

  /**
   * Sets the '{@link Production#getArticle() <em>article</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newArticle
   *          the new value of the '{@link Production#getArticle() article}' feature.
   * @generated
   */
  public void setArticle(String newArticle) {
    article = newArticle;
  }

  /**
   * Returns the value of '<em><b>dueTime</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>dueTime</b></em>' feature
   * @generated
   */
  public Date getDueTime() {
    return dueTime;
  }

  /**
   * Sets the '{@link Production#getDueTime() <em>dueTime</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDueTime
   *          the new value of the '{@link Production#getDueTime() dueTime}' feature.
   * @generated
   */
  public void setDueTime(Date newDueTime) {
    dueTime = newDueTime;
  }

  /**
   * Returns the value of '<em><b>missingAmount</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>missingAmount</b></em>' feature
   * @generated
   */
  public Float getMissingAmount() {
    return missingAmount;
  }

  /**
   * Sets the '{@link Production#getMissingAmount() <em>missingAmount</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMissingAmount
   *          the new value of the '{@link Production#getMissingAmount() missingAmount}' feature.
   * @generated
   */
  public void setMissingAmount(Float newMissingAmount) {
    missingAmount = newMissingAmount;
  }

  /**
   * Returns the value of '<em><b>productionId</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>productionId</b></em>' feature
   * @generated
   */
  public String getProductionId() {
    return productionId;
  }

  /**
   * Sets the '{@link Production#getProductionId() <em>productionId</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newProductionId
   *          the new value of the '{@link Production#getProductionId() productionId}' feature.
   * @generated
   */
  public void setProductionId(String newProductionId) {
    productionId = newProductionId;
  }

  /**
   * Returns the value of '<em><b>startTime</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>startTime</b></em>' feature
   * @generated
   */
  public Date getStartTime() {
    return startTime;
  }

  /**
   * Sets the '{@link Production#getStartTime() <em>startTime</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStartTime
   *          the new value of the '{@link Production#getStartTime() startTime}' feature.
   * @generated
   */
  public void setStartTime(Date newStartTime) {
    startTime = newStartTime;
  }

  /**
   * Returns the value of '<em><b>totalAmount</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>totalAmount</b></em>' feature
   * @generated
   */
  public Float getTotalAmount() {
    return totalAmount;
  }

  /**
   * Sets the '{@link Production#getTotalAmount() <em>totalAmount</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTotalAmount
   *          the new value of the '{@link Production#getTotalAmount() totalAmount}' feature.
   * @generated
   */
  public void setTotalAmount(Float newTotalAmount) {
    totalAmount = newTotalAmount;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Production " + " [article: " + getArticle() + "]" + " [dueTime: " + getDueTime() + "]"
        + " [missingAmount: " + getMissingAmount() + "]" + " [productionId: " + getProductionId() + "]"
        + " [startTime: " + getStartTime() + "]" + " [totalAmount: " + getTotalAmount() + "]";
  }
}
