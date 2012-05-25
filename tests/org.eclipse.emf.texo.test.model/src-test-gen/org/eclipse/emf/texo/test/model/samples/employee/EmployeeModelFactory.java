package org.eclipse.emf.texo.test.model.samples.employee;

import java.util.Date;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: org.eclipse.emf.texo.test.model.samples.employee. It
 * contains code to create instances {@link ModelObject} wrappers and instances for EClasses and convert objects back
 * and forth from their String (XML) representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EmployeeModelFactory implements ModelFactory {

  /**
   * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClass
   *          creates a Object instance for this EClass
   * @return an object representing the eClass
   * @generated
   */
  public Object create(EClass eClass) {
    switch (eClass.getClassifierID()) {
    case EmployeeModelPackage.DEPARTMENT_CLASSIFIER_ID:
      return createDepartment();
    case EmployeeModelPackage.EMPLOYEE_CLASSIFIER_ID:
      return createEmployee();
    }
    throw new IllegalArgumentException("The EClass '" + eClass.getName() + "' is not a valid EClass for this EPackage");
  }

  /**
   * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClass
   *          the EClass of the object
   * @param adaptee
   *          the object being wrapped/adapted
   * @return the wrapper {@link ModelObject}
   * @generated
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public ModelObject createModelObject(EClass eClass, Object adaptee) {
    ModelObject<Object> modelObject = null;
    switch (eClass.getClassifierID()) {
    case EmployeeModelPackage.DEPARTMENT_CLASSIFIER_ID:
      modelObject = new DepartmentModelObject();
      break;
    case EmployeeModelPackage.EMPLOYEE_CLASSIFIER_ID:
      modelObject = new EmployeeModelObject();
      break;
    default:
      throw new IllegalArgumentException("The EClass '" + eClass + "' is not defined in this EPackage");
    }
    modelObject.setTarget(adaptee);
    return modelObject;
  }

  /**
   * Creates a feature map entry instance for a certain EStructuralFeature.
   * 
   * @param eStructuralFeature
   *          the feature map feature
   * @return the pojo feature map entry
   * @generated
   */
  public Object createFeatureMapEntry(EStructuralFeature eFeature) {
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}. If the feature map entry is null then a
   * new one is created and <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eStructuralFeature
   *          the feature map feature of the object
   * @param adaptee
   *          the pojo feature map entry being wrapped/adapted
   * @return the wrapper {@link ModelFeatureMapEntry}
   * @generated
   */
  public ModelFeatureMapEntry<?> createModelFeatureMapEntry(EStructuralFeature eFeature, Object adaptee) {
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Department
   * @generated
   */
  public Department createDepartment() {
    return new Department();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Employee
   * @generated
   */
  public Employee createEmployee() {
    return new Employee();
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if the value is null then null is returned.
   * @generated
   */
  public Object createFromString(EDataType eDataType, String value) {
    switch (eDataType.getClassifierID()) {
    case EmployeeModelPackage.DATE_CLASSIFIER_ID:
      return createDateFromString(value);
    }
    throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage");
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if value == null then null is returned
   * @generated
   */
  public String convertToString(EDataType eDataType, Object value) {
    switch (eDataType.getClassifierID()) {
    case EmployeeModelPackage.DATE_CLASSIFIER_ID:
      return convertDateToString((Date) value);
    }
    throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
  }

  /**
   * Converts the EDataType: Date to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertDateToString(Date value) {
    if (value == null) {
      return null;
    }
    return ModelUtils.convertToXML(value);
  }

  /**
   * Creates an instance of the EDataType: Date from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public Date createDateFromString(String value) {
    if (value == null) {
      return null;
    }
    return ModelUtils.createFromXML(value);
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Department</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static class DepartmentModelObject<E extends Department> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EmployeeModelPackage.INSTANCE.getDepartmentEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EmployeeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EmployeeModelPackage.DEPARTMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case EmployeeModelPackage.DEPARTMENT_EMPLOYEES_FEATURE_ID:
        return getTarget().getEmployees();
      }
      return super.eGet(eStructuralFeature);
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EmployeeModelPackage.DEPARTMENT_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case EmployeeModelPackage.DEPARTMENT_EMPLOYEES_FEATURE_ID:
        getTarget().setEmployees((List<Employee>) value);
        return;
      }
      super.eSet(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case EmployeeModelPackage.DEPARTMENT_EMPLOYEES_FEATURE_ID:
        getTarget().getEmployees().add((Employee) value);
        return;
      }
      super.eAddTo(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case EmployeeModelPackage.DEPARTMENT_EMPLOYEES_FEATURE_ID:
        getTarget().getEmployees().remove(value);
        return;
      }
      super.eAddTo(eStructuralFeature, value);
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Employee</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static class EmployeeModelObject<E extends Employee> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EmployeeModelPackage.INSTANCE.getEmployeeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EmployeeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EmployeeModelPackage.EMPLOYEE_NAME_FEATURE_ID:
        return getTarget().getName();
      case EmployeeModelPackage.EMPLOYEE_SALARY_FEATURE_ID:
        return getTarget().getSalary();
      case EmployeeModelPackage.EMPLOYEE_AGE_FEATURE_ID:
        return getTarget().getAge();
      case EmployeeModelPackage.EMPLOYEE_HIREDATE_FEATURE_ID:
        return getTarget().getHireDate();
      }
      return super.eGet(eStructuralFeature);
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EmployeeModelPackage.EMPLOYEE_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case EmployeeModelPackage.EMPLOYEE_SALARY_FEATURE_ID:
        getTarget().setSalary((Integer) value);
        return;
      case EmployeeModelPackage.EMPLOYEE_AGE_FEATURE_ID:
        getTarget().setAge((Integer) value);
        return;
      case EmployeeModelPackage.EMPLOYEE_HIREDATE_FEATURE_ID:
        getTarget().setHireDate((Date) value);
        return;
      }
      super.eSet(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      super.eAddTo(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      super.eAddTo(eStructuralFeature, value);
    }
  }

}
