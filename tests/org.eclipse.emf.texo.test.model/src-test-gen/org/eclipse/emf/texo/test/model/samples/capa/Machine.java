package org.eclipse.emf.texo.test.model.samples.capa;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Machine</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "capa_Machine")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Machine extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false)
  private WorkWeek workWeek = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<Task> tasks = new ArrayList<Task>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String machineId = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String machineSearchString = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer multiplicity = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String taskSearchString = null;

  /**
   * Returns the value of '<em><b>workWeek</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>workWeek</b></em>' feature
   * @generated
   */
  public WorkWeek getWorkWeek() {
    return workWeek;
  }

  /**
   * Sets the '{@link Machine#getWorkWeek() <em>workWeek</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newWorkWeek
   *          the new value of the '{@link Machine#getWorkWeek() workWeek}' feature.
   * @generated
   */
  public void setWorkWeek(WorkWeek newWorkWeek) {
    workWeek = newWorkWeek;
  }

  /**
   * Returns the value of '<em><b>tasks</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>tasks</b></em>' feature
   * @generated
   */
  public List<Task> getTasks() {
    return tasks;
  }

  /**
   * Adds to the <em>tasks</em> feature.
   * 
   * @param tasksValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToTasks(Task tasksValue) {
    if (!tasks.contains(tasksValue)) {
      boolean result = tasks.add(tasksValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>tasks</em> feature.
   * 
   * @param tasksValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromTasks(Task tasksValue) {
    if (tasks.contains(tasksValue)) {
      boolean result = tasks.remove(tasksValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>tasks</em> feature.
   * 
   * @generated
   */
  public void clearTasks() {
    while (!tasks.isEmpty()) {
      removeFromTasks(tasks.iterator().next());
    }
  }

  /**
   * Sets the '{@link Machine#getTasks() <em>tasks</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTasks
   *          the new value of the '{@link Machine#getTasks() tasks}' feature.
   * @generated
   */
  public void setTasks(List<Task> newTasks) {
    tasks = newTasks;
  }

  /**
   * Returns the value of '<em><b>machineId</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>machineId</b></em>' feature
   * @generated
   */
  public String getMachineId() {
    return machineId;
  }

  /**
   * Sets the '{@link Machine#getMachineId() <em>machineId</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMachineId
   *          the new value of the '{@link Machine#getMachineId() machineId}' feature.
   * @generated
   */
  public void setMachineId(String newMachineId) {
    machineId = newMachineId;
  }

  /**
   * Returns the value of '<em><b>machineSearchString</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>machineSearchString</b></em>' feature
   * @generated
   */
  public String getMachineSearchString() {
    return machineSearchString;
  }

  /**
   * Sets the '{@link Machine#getMachineSearchString() <em>machineSearchString</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMachineSearchString
   *          the new value of the '{@link Machine#getMachineSearchString() machineSearchString}' feature.
   * @generated
   */
  public void setMachineSearchString(String newMachineSearchString) {
    machineSearchString = newMachineSearchString;
  }

  /**
   * Returns the value of '<em><b>multiplicity</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>multiplicity</b></em>' feature
   * @generated
   */
  public Integer getMultiplicity() {
    return multiplicity;
  }

  /**
   * Sets the '{@link Machine#getMultiplicity() <em>multiplicity</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMultiplicity
   *          the new value of the '{@link Machine#getMultiplicity() multiplicity}' feature.
   * @generated
   */
  public void setMultiplicity(Integer newMultiplicity) {
    multiplicity = newMultiplicity;
  }

  /**
   * Returns the value of '<em><b>taskSearchString</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>taskSearchString</b></em>' feature
   * @generated
   */
  public String getTaskSearchString() {
    return taskSearchString;
  }

  /**
   * Sets the '{@link Machine#getTaskSearchString() <em>taskSearchString</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTaskSearchString
   *          the new value of the '{@link Machine#getTaskSearchString() taskSearchString}' feature.
   * @generated
   */
  public void setTaskSearchString(String newTaskSearchString) {
    taskSearchString = newTaskSearchString;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Machine " + " [machineId: " + getMachineId() + "]" + " [machineSearchString: " + getMachineSearchString()
        + "]" + " [multiplicity: " + getMultiplicity() + "]" + " [taskSearchString: " + getTaskSearchString() + "]";
  }
}
