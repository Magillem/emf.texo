package org.eclipse.emf.texo.test.model.samples.capa;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>WorkDay</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "capa_WorkDay")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class WorkDay extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer dayOfWeek = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer duration = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer startTime = null;

  /**
   * Returns the value of '<em><b>dayOfWeek</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>dayOfWeek</b></em>' feature
   * @generated
   */
  public Integer getDayOfWeek() {
    return dayOfWeek;
  }

  /**
   * Sets the '{@link WorkDay#getDayOfWeek() <em>dayOfWeek</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDayOfWeek
   *          the new value of the '{@link WorkDay#getDayOfWeek() dayOfWeek}' feature.
   * @generated
   */
  public void setDayOfWeek(Integer newDayOfWeek) {
    dayOfWeek = newDayOfWeek;
  }

  /**
   * Returns the value of '<em><b>duration</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>duration</b></em>' feature
   * @generated
   */
  public Integer getDuration() {
    return duration;
  }

  /**
   * Sets the '{@link WorkDay#getDuration() <em>duration</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDuration
   *          the new value of the '{@link WorkDay#getDuration() duration}' feature.
   * @generated
   */
  public void setDuration(Integer newDuration) {
    duration = newDuration;
  }

  /**
   * Returns the value of '<em><b>startTime</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>startTime</b></em>' feature
   * @generated
   */
  public Integer getStartTime() {
    return startTime;
  }

  /**
   * Sets the '{@link WorkDay#getStartTime() <em>startTime</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStartTime
   *          the new value of the '{@link WorkDay#getStartTime() startTime}' feature.
   * @generated
   */
  public void setStartTime(Integer newStartTime) {
    startTime = newStartTime;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "WorkDay " + " [dayOfWeek: " + getDayOfWeek() + "]" + " [duration: " + getDuration() + "]" + " [startTime: "
        + getStartTime() + "]";
  }
}
