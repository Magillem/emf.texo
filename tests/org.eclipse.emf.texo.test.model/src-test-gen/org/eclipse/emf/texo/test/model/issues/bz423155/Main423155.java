package org.eclipse.emf.texo.test.model.issues.bz423155;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Main423155</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Bz423155_Main423155")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Main423155 extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @AttributeOverrides({ @AttributeOverride(column = @Column(name = "nameOne"), name = "name1"),
      @AttributeOverride(column = @Column(name = "nameTwo"), name = "name2") })
  private List<Embedded423155> embedded1 = new ArrayList<Embedded423155>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @AttributeOverrides({ @AttributeOverride(column = @Column(name = "nameOne"), name = "name1"),
      @AttributeOverride(column = @Column(name = "nameTwo"), name = "name2") })
  private List<Embedded423155> embedded2 = new ArrayList<Embedded423155>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @AttributeOverrides({ @AttributeOverride(column = @Column(name = "nameOne"), name = "name1"),
      @AttributeOverride(column = @Column(name = "nameTwo"), name = "name2") })
  private List<Embedded423155> embedded3 = new ArrayList<Embedded423155>();

  /**
   * Returns the value of '<em><b>embedded1</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>embedded1</b></em>' feature
   * @generated
   */
  public List<Embedded423155> getEmbedded1() {
    return embedded1;
  }

  /**
   * Sets the '{@link Main423155#getEmbedded1() <em>embedded1</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEmbedded1
   *          the new value of the '{@link Main423155#getEmbedded1() embedded1}' feature.
   * @generated
   */
  public void setEmbedded1(List<Embedded423155> newEmbedded1) {
    embedded1 = newEmbedded1;
  }

  /**
   * Returns the value of '<em><b>embedded2</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>embedded2</b></em>' feature
   * @generated
   */
  public List<Embedded423155> getEmbedded2() {
    return embedded2;
  }

  /**
   * Sets the '{@link Main423155#getEmbedded2() <em>embedded2</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEmbedded2
   *          the new value of the '{@link Main423155#getEmbedded2() embedded2}' feature.
   * @generated
   */
  public void setEmbedded2(List<Embedded423155> newEmbedded2) {
    embedded2 = newEmbedded2;
  }

  /**
   * Returns the value of '<em><b>embedded3</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>embedded3</b></em>' feature
   * @generated
   */
  public List<Embedded423155> getEmbedded3() {
    return embedded3;
  }

  /**
   * Sets the '{@link Main423155#getEmbedded3() <em>embedded3</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEmbedded3
   *          the new value of the '{@link Main423155#getEmbedded3() embedded3}' feature.
   * @generated
   */
  public void setEmbedded3(List<Embedded423155> newEmbedded3) {
    embedded3 = newEmbedded3;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Main423155 " + "{extends: " + super.toString() + "} ";
  }
}
