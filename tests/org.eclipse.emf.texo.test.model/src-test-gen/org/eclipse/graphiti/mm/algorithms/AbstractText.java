package org.eclipse.graphiti.mm.algorithms;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>AbstractText</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "al_AbstractText")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class AbstractText extends GraphicsAlgorithm {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  private Font font = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Enumerated(EnumType.STRING)
  private Orientation horizontalAlignment = Orientation.ALIGNMENT_LEFT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Enumerated(EnumType.STRING)
  private Orientation verticalAlignment = Orientation.ALIGNMENT_CENTER;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer angle = new Integer((int) 0);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String value = null;

  /**
   * Returns the value of '<em><b>font</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>font</b></em>' feature
   * @generated
   */
  public Font getFont() {
    return font;
  }

  /**
   * Sets the '{@link AbstractText#getFont() <em>font</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link AbstractText#getFont() font}' feature.
   * @generated
   */
  public void setFont(Font newFont) {
    font = newFont;
  }

  /**
   * Returns the value of '<em><b>horizontalAlignment</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>horizontalAlignment</b></em>' feature
   * @generated
   */
  public Orientation getHorizontalAlignment() {
    return horizontalAlignment;
  }

  /**
   * Sets the '{@link AbstractText#getHorizontalAlignment() <em>horizontalAlignment</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link AbstractText#getHorizontalAlignment() horizontalAlignment}' feature.
   * @generated
   */
  public void setHorizontalAlignment(Orientation newHorizontalAlignment) {
    horizontalAlignment = newHorizontalAlignment;
  }

  /**
   * Returns the value of '<em><b>verticalAlignment</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>verticalAlignment</b></em>' feature
   * @generated
   */
  public Orientation getVerticalAlignment() {
    return verticalAlignment;
  }

  /**
   * Sets the '{@link AbstractText#getVerticalAlignment() <em>verticalAlignment</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link AbstractText#getVerticalAlignment() verticalAlignment}' feature.
   * @generated
   */
  public void setVerticalAlignment(Orientation newVerticalAlignment) {
    verticalAlignment = newVerticalAlignment;
  }

  /**
   * Returns the value of '<em><b>angle</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>angle</b></em>' feature
   * @generated
   */
  public Integer getAngle() {
    return angle;
  }

  /**
   * Sets the '{@link AbstractText#getAngle() <em>angle</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link AbstractText#getAngle() angle}' feature.
   * @generated
   */
  public void setAngle(Integer newAngle) {
    angle = newAngle;
  }

  /**
   * Returns the value of '<em><b>value</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>value</b></em>' feature
   * @generated
   */
  public String getValue() {
    return value;
  }

  /**
   * Sets the '{@link AbstractText#getValue() <em>value</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link AbstractText#getValue() value}' feature.
   * @generated
   */
  public void setValue(String newValue) {
    value = newValue;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AbstractText " + " [horizontalAlignment: " + getHorizontalAlignment() + "]" + " [verticalAlignment: "
        + getVerticalAlignment() + "]" + " [angle: " + getAngle() + "]" + " [value: " + getValue() + "]";
  }
}
