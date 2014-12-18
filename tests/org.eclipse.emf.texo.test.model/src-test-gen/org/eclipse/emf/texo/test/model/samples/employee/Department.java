package org.eclipse.emf.texo.test.model.samples.employee;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Department</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "employee_Department")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Department extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<Employee> employees = new ArrayList<Employee>();

  /**
   * @return the hello string
   * @generated
   */
  public String helloWorld() {
    System.err.println("hello, I am Department ");
    return " Department";
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
   * Sets the '{@link Department#getName() <em>name</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link Department#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>employees</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>employees</b></em>' feature
   * @generated
   */
  public List<Employee> getEmployees() {
    return employees;
  }

  /**
   * Adds to the <em>employees</em> feature.
   * 
   * @param employeesValue
   *          value to add
   * @return true if added, false otherwise
   * 
   * @generated
   */
  public boolean addToEmployees(Employee employeesValue) {
    if (!employees.contains(employeesValue)) {
      employees.add(employeesValue);
      return true;
    }
    return false;
  }

  /**
   * Removes from the <em>employees</em> feature.
   * 
   * @param employeesValue
   *          value to remove
   * @return true if removed, false otherwise
   * @generated
   */
  public boolean removeFromEmployees(Employee employeesValue) {
    if (employees.contains(employeesValue)) {
      employees.remove(employeesValue);
      return true;
    }
    return false;
  }

  /**
   * Clears the <em>employees</em> feature.
   * 
   * @generated
   */
  public void clearEmployees() {
    while (!employees.isEmpty()) {
      removeFromEmployees(employees.iterator().next());
    }
  }

  /**
   * Sets the '{@link Department#getEmployees() <em>employees</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEmployees
   *          the new value of the '{@link Department#getEmployees() employees}' feature.
   * @generated
   */
  public void setEmployees(List<Employee> newEmployees) {
    employees = newEmployees;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Department " + " [name: " + getName() + "]";
  }

  /**
   * @return the boolean value
   * @generated
   */
  public boolean templateIsOverridden() {
    return true;
  }
}
