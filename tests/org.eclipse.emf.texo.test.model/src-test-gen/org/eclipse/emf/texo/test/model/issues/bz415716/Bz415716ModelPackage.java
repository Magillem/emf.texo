package org.eclipse.emf.texo.test.model.issues.bz415716;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz415716.dao.TestBz415716_OneDao;
import org.eclipse.emf.texo.test.model.issues.bz415716.dao.TestBz415716_TwoDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>bz415716</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 *
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Bz415716ModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/bz415716";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Bz415716ModelFactory MODELFACTORY = new Bz415716ModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TESTBZ415716_ONE_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TESTBZ415716_ONE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TESTBZ415716_ONE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TESTBZ415716_ONE_TWO_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TESTBZ415716_TWO_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TESTBZ415716_TWO_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TESTBZ415716_TWO_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TESTBZ415716_TWO_ONE_FEATURE_ID = 2;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Bz415716ModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return an initialized instance of this class
   *
   * @generated
   */
  public static Bz415716ModelPackage initialize() {

    if (isInitialized) {
      return (Bz415716ModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final Bz415716ModelPackage modelPackage = new Bz415716ModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(TestBz415716_One.class,
        modelPackage.getTestBz415716_OneEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TestBz415716_Two.class,
        modelPackage.getTestBz415716_TwoEClass(), modelPackage);

    DaoRegistry.getInstance().registerDao(TestBz415716_One.class, TestBz415716_OneDao.class);
    DaoRegistry.getInstance().registerDao(TestBz415716_Two.class, TestBz415716_TwoDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the {@link Bz415716ModelFactory} instance.
   * @generated
   */
  @Override
  public Bz415716ModelFactory getModelFactory() {
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
    return "bz415716.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>TestBz415716_One</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TestBz415716_One</b></em>'
   * @generated
   */
  public EClass getTestBz415716_OneEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TESTBZ415716_ONE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TestBz415716_One.two</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TestBz415716_One.two</b></em>'.
   * @generated
   */
  public EReference getTestBz415716_One_Two() {
    return (EReference) getTestBz415716_OneEClass().getEAllStructuralFeatures().get(TESTBZ415716_ONE_TWO_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>TestBz415716_Two</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TestBz415716_Two</b></em>'
   * @generated
   */
  public EClass getTestBz415716_TwoEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TESTBZ415716_TWO_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TestBz415716_Two.one</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TestBz415716_Two.one</b></em>'.
   * @generated
   */
  public EReference getTestBz415716_Two_One() {
    return (EReference) getTestBz415716_TwoEClass().getEAllStructuralFeatures().get(TESTBZ415716_TWO_ONE_FEATURE_ID);
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
    case TESTBZ415716_ONE_CLASSIFIER_ID:
      return TestBz415716_One.class;
    case TESTBZ415716_TWO_CLASSIFIER_ID:
      return TestBz415716_Two.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
