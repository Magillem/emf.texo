package org.eclipse.emf.texo.test.model.samples.capa;

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
 * A representation of the model object '<em><b>WorkWeek</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "capa_WorkWeek")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class WorkWeek extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<WorkDay> days = new ArrayList<WorkDay>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String workWeekId = null;

  /**
   * Returns the value of '<em><b>days</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>days</b></em>' feature
   * @generated
   */
  public List<WorkDay> getDays() {
    return days;
  }

  /**
   * Sets the '{@link WorkWeek#getDays() <em>days</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDays
   *          the new value of the '{@link WorkWeek#getDays() days}' feature.
   * @generated
   */
  public void setDays(List<WorkDay> newDays) {
    days = newDays;
  }

  /**
   * Returns the value of '<em><b>workWeekId</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>workWeekId</b></em>' feature
   * @generated
   */
  public String getWorkWeekId() {
    return workWeekId;
  }

  /**
   * Sets the '{@link WorkWeek#getWorkWeekId() <em>workWeekId</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newWorkWeekId
   *          the new value of the '{@link WorkWeek#getWorkWeekId() workWeekId}' feature.
   * @generated
   */
  public void setWorkWeekId(String newWorkWeekId) {
    workWeekId = newWorkWeekId;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "WorkWeek " + " [workWeekId: " + getWorkWeekId() + "]" + "{extends: " + super.toString() + "} ";
  }
}
