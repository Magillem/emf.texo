package org.eclipse.emf.texo.test.model.samples.capa;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

/** 
 * A representation of the model object '<em><b>WorkWeek</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "WorkWeek")
public class WorkWeek {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = WorkDay.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<WorkDay> days = new ArrayList<WorkDay>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private String workWeekId = null;

  /**
   * Returns the value of '<em><b>days</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>days</b></em>' feature
   * @generated
   */
  public List<WorkDay> getDays() {
    return days;
  }

  /**
   * Adds to the <em>days</em> feature.
   * @generated
   */
  public void addToDays(WorkDay daysValue) {
    if (!days.contains(daysValue)) {

      days.add(daysValue);
    }

  }

  /**			
   * Removes from the <em>days</em> feature.
   * @generated
   */
  public void removeFromDays(WorkDay daysValue) {
    if (days.contains(daysValue)) {
      days.remove(daysValue);
    }
  }

  /**			
   * Clears the <em>days</em> feature.
   * @generated
   */
  public void clearDays() {
    for (WorkDay daysElement : days) {
      removeFromDays(daysElement);
    }
  }

  /**
   * Sets the '{@link WorkWeek#getDays() <em>days</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link WorkWeek#getDays() days}' feature.
   * @generated
   */
  public void setDays(List<WorkDay> newDays) {
    days = newDays;
  }

  /**
   * Returns the value of '<em><b>workWeekId</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
   * @param the new value of the '{@link WorkWeek#getWorkWeekId() workWeekId}' feature.
   * @generated
   */
  public void setWorkWeekId(String newWorkWeekId) {
    workWeekId = newWorkWeekId;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "WorkWeek " + " [workWeekId: " + getWorkWeekId() + "]";
  }
}