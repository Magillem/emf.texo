package org.eclipse.emf.texo.test.model.issues.bz486803;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz486803.dao.ClzOneDao;
import org.eclipse.emf.texo.test.model.issues.bz486803.dao.InterfaceOneTDao;
import org.eclipse.emf.texo.test.model.issues.bz486803.dao.InterfaceThreeTDao;
import org.eclipse.emf.texo.test.model.issues.bz486803.dao.InterfaceTwoTDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>InterfaceTest</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 *
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class InterfaceTestModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/bz486803";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final InterfaceTestModelFactory MODELFACTORY = new InterfaceTestModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INTERFACEONET_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INTERFACEONET_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INTERFACEONET_THIRDNAME_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INTERFACEONET_SECONDNAME_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INTERFACETHREET_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INTERFACETHREET_THIRDNAME_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INTERFACETWOT_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INTERFACETWOT_SECONDNAME_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLZONE_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLZONE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLZONE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLZONE_THIRDNAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLZONE_SECONDNAME_FEATURE_ID = 3;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final InterfaceTestModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return an initialized instance of this class
   *
   * @generated
   */
  public static InterfaceTestModelPackage initialize() {

    if (isInitialized) {
      return (InterfaceTestModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final InterfaceTestModelPackage modelPackage = new InterfaceTestModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(InterfaceOneT.class, modelPackage.getInterfaceOneTEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(InterfaceThreeT.class,
        modelPackage.getInterfaceThreeTEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(InterfaceTwoT.class, modelPackage.getInterfaceTwoTEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ClzOne.class, modelPackage.getClzOneEClass(), modelPackage);

    DaoRegistry.getInstance().registerDao(InterfaceOneT.class, InterfaceOneTDao.class);
    DaoRegistry.getInstance().registerDao(InterfaceThreeT.class, InterfaceThreeTDao.class);
    DaoRegistry.getInstance().registerDao(InterfaceTwoT.class, InterfaceTwoTDao.class);
    DaoRegistry.getInstance().registerDao(ClzOne.class, ClzOneDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the {@link InterfaceTestModelFactory} instance.
   * @generated
   */
  @Override
  public InterfaceTestModelFactory getModelFactory() {
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
    return "InterfaceTest.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>InterfaceOneT</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>InterfaceOneT</b></em>'
   * @generated
   */
  public EClass getInterfaceOneTEClass() {
    return (EClass) getEPackage().getEClassifiers().get(INTERFACEONET_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>InterfaceOneT.name</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>InterfaceOneT.name</b></em>'.
   * @generated
   */
  public EAttribute getInterfaceOneT_Name() {
    return (EAttribute) getInterfaceOneTEClass().getEAllStructuralFeatures().get(INTERFACEONET_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>InterfaceOneT.thirdName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>InterfaceOneT.thirdName</b></em>'.
   * @generated
   */
  public EAttribute getInterfaceOneT_ThirdName() {
    return (EAttribute) getInterfaceOneTEClass().getEAllStructuralFeatures().get(INTERFACEONET_THIRDNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>InterfaceOneT.secondName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>InterfaceOneT.secondName</b></em>'.
   * @generated
   */
  public EAttribute getInterfaceOneT_SecondName() {
    return (EAttribute) getInterfaceOneTEClass().getEAllStructuralFeatures().get(INTERFACEONET_SECONDNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>InterfaceThreeT</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>InterfaceThreeT</b></em>'
   * @generated
   */
  public EClass getInterfaceThreeTEClass() {
    return (EClass) getEPackage().getEClassifiers().get(INTERFACETHREET_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>InterfaceThreeT.thirdName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>InterfaceThreeT.thirdName</b></em>'.
   * @generated
   */
  public EAttribute getInterfaceThreeT_ThirdName() {
    return (EAttribute) getInterfaceThreeTEClass().getEAllStructuralFeatures()
        .get(INTERFACETHREET_THIRDNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>InterfaceTwoT</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>InterfaceTwoT</b></em>'
   * @generated
   */
  public EClass getInterfaceTwoTEClass() {
    return (EClass) getEPackage().getEClassifiers().get(INTERFACETWOT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>InterfaceTwoT.secondName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>InterfaceTwoT.secondName</b></em>'.
   * @generated
   */
  public EAttribute getInterfaceTwoT_SecondName() {
    return (EAttribute) getInterfaceTwoTEClass().getEAllStructuralFeatures().get(INTERFACETWOT_SECONDNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ClzOne</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ClzOne</b></em>'
   * @generated
   */
  public EClass getClzOneEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CLZONE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ClzOne.thirdName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ClzOne.thirdName</b></em>'.
   * @generated
   */
  public EAttribute getClzOne_ThirdName() {
    return (EAttribute) getClzOneEClass().getEAllStructuralFeatures().get(CLZONE_THIRDNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ClzOne.secondName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ClzOne.secondName</b></em>'.
   * @generated
   */
  public EAttribute getClzOne_SecondName() {
    return (EAttribute) getClzOneEClass().getEAllStructuralFeatures().get(CLZONE_SECONDNAME_FEATURE_ID);
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
    case INTERFACEONET_CLASSIFIER_ID:
      return InterfaceOneT.class;
    case INTERFACETHREET_CLASSIFIER_ID:
      return InterfaceThreeT.class;
    case INTERFACETWOT_CLASSIFIER_ID:
      return InterfaceTwoT.class;
    case CLZONE_CLASSIFIER_ID:
      return ClzOne.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
