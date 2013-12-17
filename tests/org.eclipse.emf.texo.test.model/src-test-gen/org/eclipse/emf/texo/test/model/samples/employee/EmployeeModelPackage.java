package org.eclipse.emf.texo.test.model.samples.employee;

import java.util.Date;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.samples.employee.dao.DepartmentDao;
import org.eclipse.emf.texo.test.model.samples.employee.dao.EmployeeDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>employee</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EmployeeModelPackage extends ModelPackage {

  /**
   * Is set when the package has been initialized.
   * 
   * @generated
   */
  private static boolean isInitialized = false;

  /**
   * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/Employee";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final EmployeeModelFactory MODELFACTORY = new EmployeeModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATE_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DEPARTMENT_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DEPARTMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DEPARTMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DEPARTMENT_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DEPARTMENT_EMPLOYEES_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EMPLOYEE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EMPLOYEE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EMPLOYEE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EMPLOYEE_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EMPLOYEE_SALARY_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EMPLOYEE_AGE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EMPLOYEE_HIREDATE_FEATURE_ID = 5;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final EmployeeModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static EmployeeModelPackage initialize() {

    if (isInitialized) {
      return (EmployeeModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final EmployeeModelPackage modelPackage = new EmployeeModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(Department.class, modelPackage.getDepartmentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Employee.class, modelPackage.getEmployeeEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(Department.class, DepartmentDao.class);
    DaoRegistry.getInstance().registerDao(Employee.class, EmployeeDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link EmployeeModelFactory} instance.
   * @generated
   */
  @Override
  public EmployeeModelFactory getModelFactory() {
    return MODELFACTORY;
  }

  /**
   * Returns the nsUri of the {@link EPackage} managed by this Package instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return the nsUri of the EPackage
   * @generated
   */
  @Override
  public String getNsURI() {
    return NS_URI;
  }

  /**
   * Returns the name of the ecore file containing the ecore model of the {@link EPackage} managed here. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the name of the ecore file
   * @generated
   */
  @Override
  public String getEcoreFileName() {
    return "employee.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>Department</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Department</b></em>'
   * @generated
   */
  public EClass getDepartmentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DEPARTMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Department.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Department.name</b></em>'.
   * @generated
   */
  public EAttribute getDepartment_Name() {
    return (EAttribute) getDepartmentEClass().getEAllStructuralFeatures().get(DEPARTMENT_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Department.employees</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Department.employees</b></em>'.
   * @generated
   */
  public EReference getDepartment_Employees() {
    return (EReference) getDepartmentEClass().getEAllStructuralFeatures().get(DEPARTMENT_EMPLOYEES_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Employee</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Employee</b></em>'
   * @generated
   */
  public EClass getEmployeeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EMPLOYEE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Employee.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Employee.name</b></em>'.
   * @generated
   */
  public EAttribute getEmployee_Name() {
    return (EAttribute) getEmployeeEClass().getEAllStructuralFeatures().get(EMPLOYEE_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Employee.salary</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Employee.salary</b></em>'.
   * @generated
   */
  public EAttribute getEmployee_Salary() {
    return (EAttribute) getEmployeeEClass().getEAllStructuralFeatures().get(EMPLOYEE_SALARY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Employee.age</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Employee.age</b></em>'.
   * @generated
   */
  public EAttribute getEmployee_Age() {
    return (EAttribute) getEmployeeEClass().getEAllStructuralFeatures().get(EMPLOYEE_AGE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Employee.hireDate</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Employee.hireDate</b></em>'.
   * @generated
   */
  public EAttribute getEmployee_HireDate() {
    return (EAttribute) getEmployeeEClass().getEAllStructuralFeatures().get(EMPLOYEE_HIREDATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>Date</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>Date</b></em>'
   * @generated
   */
  public EDataType getDateEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(DATE_CLASSIFIER_ID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClassifier
   *          the {@link EClassifier}
   * @return the class implementing a specific {@link EClass}.
   * @generated
   */
  @Override
  public Class<?> getEClassifierClass(EClassifier eClassifier) {
    switch (eClassifier.getClassifierID()) {
    case DEPARTMENT_CLASSIFIER_ID:
      return Department.class;
    case EMPLOYEE_CLASSIFIER_ID:
      return Employee.class;
    case DATE_CLASSIFIER_ID:
      return Date.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
