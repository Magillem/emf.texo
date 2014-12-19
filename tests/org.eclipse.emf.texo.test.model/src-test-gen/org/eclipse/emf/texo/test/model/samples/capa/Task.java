package org.eclipse.emf.texo.test.model.samples.capa;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Task</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "capa_Task")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Task extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false)
  private CapacityEntry capacityEntry = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false)
  private Production production = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String taskId = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Float timePerPice = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Float timePerPreperation = null;

  /**
   * Returns the value of '<em><b>capacityEntry</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>capacityEntry</b></em>' feature
   * @generated
   */
  public CapacityEntry getCapacityEntry() {
    return capacityEntry;
  }

  /**
   * Sets the '{@link Task#getCapacityEntry() <em>capacityEntry</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCapacityEntry
   *          the new value of the '{@link Task#getCapacityEntry() capacityEntry}' feature.
   * @generated
   */
  public void setCapacityEntry(CapacityEntry newCapacityEntry) {
    capacityEntry = newCapacityEntry;
  }

  /**
   * Returns the value of '<em><b>production</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>production</b></em>' feature
   * @generated
   */
  public Production getProduction() {
    return production;
  }

  /**
   * Sets the '{@link Task#getProduction() <em>production</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newProduction
   *          the new value of the '{@link Task#getProduction() production}' feature.
   * @generated
   */
  public void setProduction(Production newProduction) {
    production = newProduction;
  }

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link Task#getName() <em>name</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link Task#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>taskId</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>taskId</b></em>' feature
   * @generated
   */
  public String getTaskId() {
    return taskId;
  }

  /**
   * Sets the '{@link Task#getTaskId() <em>taskId</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTaskId
   *          the new value of the '{@link Task#getTaskId() taskId}' feature.
   * @generated
   */
  public void setTaskId(String newTaskId) {
    taskId = newTaskId;
  }

  /**
   * Returns the value of '<em><b>timePerPice</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>timePerPice</b></em>' feature
   * @generated
   */
  public Float getTimePerPice() {
    return timePerPice;
  }

  /**
   * Sets the '{@link Task#getTimePerPice() <em>timePerPice</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTimePerPice
   *          the new value of the '{@link Task#getTimePerPice() timePerPice}' feature.
   * @generated
   */
  public void setTimePerPice(Float newTimePerPice) {
    timePerPice = newTimePerPice;
  }

  /**
   * Returns the value of '<em><b>timePerPreperation</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>timePerPreperation</b></em>' feature
   * @generated
   */
  public Float getTimePerPreperation() {
    return timePerPreperation;
  }

  /**
   * Sets the '{@link Task#getTimePerPreperation() <em>timePerPreperation</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTimePerPreperation
   *          the new value of the '{@link Task#getTimePerPreperation() timePerPreperation}' feature.
   * @generated
   */
  public void setTimePerPreperation(Float newTimePerPreperation) {
    timePerPreperation = newTimePerPreperation;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Task " + " [name: " + getName() + "]" + " [taskId: " + getTaskId() + "]" + " [timePerPice: "
        + getTimePerPice() + "]" + " [timePerPreperation: " + getTimePerPreperation() + "]";
  }
}
