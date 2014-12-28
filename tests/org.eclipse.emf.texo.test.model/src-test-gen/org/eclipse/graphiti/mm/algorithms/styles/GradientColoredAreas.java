package org.eclipse.graphiti.mm.algorithms.styles;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>GradientColoredAreas</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "st_GradientColoredAreas")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class GradientColoredAreas extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<GradientColoredArea> gradientColor = new ArrayList<GradientColoredArea>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer styleAdaption = null;

  /**
   * Returns the value of '<em><b>gradientColor</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>gradientColor</b></em>' feature
   * @generated
   */
  public List<GradientColoredArea> getGradientColor() {
    return gradientColor;
  }

  /**
   * Sets the '{@link GradientColoredAreas#getGradientColor() <em>gradientColor</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newGradientColor
   *          the new value of the '{@link GradientColoredAreas#getGradientColor() gradientColor}' feature.
   * @generated
   */
  public void setGradientColor(List<GradientColoredArea> newGradientColor) {
    gradientColor = newGradientColor;
  }

  /**
   * Returns the value of '<em><b>styleAdaption</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>styleAdaption</b></em>' feature
   * @generated
   */
  public Integer getStyleAdaption() {
    return styleAdaption;
  }

  /**
   * Sets the '{@link GradientColoredAreas#getStyleAdaption() <em>styleAdaption</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStyleAdaption
   *          the new value of the '{@link GradientColoredAreas#getStyleAdaption() styleAdaption}' feature.
   * @generated
   */
  public void setStyleAdaption(Integer newStyleAdaption) {
    styleAdaption = newStyleAdaption;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "GradientColoredAreas " + " [styleAdaption: " + getStyleAdaption() + "]" + "{extends: " + super.toString()
        + "} ";
  }
}
