package org.eclipse.emf.texo.test.model.issues.bz423155;

import org.eclipse.emf.ecore.EAttribute;
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
import org.eclipse.emf.texo.test.model.issues.bz423155.dao.Embedded423155Dao;
import org.eclipse.emf.texo.test.model.issues.bz423155.dao.Main423155Dao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>Bz423155</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 *
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Bz423155ModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/bz423155";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Bz423155ModelFactory MODELFACTORY = new Bz423155ModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EMBEDDED423155_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EMBEDDED423155_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EMBEDDED423155_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EMBEDDED423155_NAME1_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EMBEDDED423155_NAME2_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MAIN423155_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MAIN423155_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MAIN423155_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MAIN423155_EMBEDDED1_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MAIN423155_EMBEDDED2_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MAIN423155_EMBEDDED3_FEATURE_ID = 4;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Bz423155ModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return an initialized instance of this class
   *
   * @generated
   */
  public static Bz423155ModelPackage initialize() {

    if (isInitialized) {
      return (Bz423155ModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final Bz423155ModelPackage modelPackage = new Bz423155ModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(Embedded423155.class, modelPackage.getEmbedded423155EClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Main423155.class, modelPackage.getMain423155EClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(Embedded423155.class, Embedded423155Dao.class);
    DaoRegistry.getInstance().registerDao(Main423155.class, Main423155Dao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the {@link Bz423155ModelFactory} instance.
   * @generated
   */
  @Override
  public Bz423155ModelFactory getModelFactory() {
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
    return "Bz423155.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>Embedded423155</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Embedded423155</b></em>'
   * @generated
   */
  public EClass getEmbedded423155EClass() {
    return (EClass) getEPackage().getEClassifiers().get(EMBEDDED423155_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Embedded423155.name1</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Embedded423155.name1</b></em>'.
   * @generated
   */
  public EAttribute getEmbedded423155_Name1() {
    return (EAttribute) getEmbedded423155EClass().getEAllStructuralFeatures().get(EMBEDDED423155_NAME1_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Embedded423155.name2</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Embedded423155.name2</b></em>'.
   * @generated
   */
  public EAttribute getEmbedded423155_Name2() {
    return (EAttribute) getEmbedded423155EClass().getEAllStructuralFeatures().get(EMBEDDED423155_NAME2_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Main423155</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Main423155</b></em>'
   * @generated
   */
  public EClass getMain423155EClass() {
    return (EClass) getEPackage().getEClassifiers().get(MAIN423155_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Main423155.embedded1</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Main423155.embedded1</b></em>'.
   * @generated
   */
  public EReference getMain423155_Embedded1() {
    return (EReference) getMain423155EClass().getEAllStructuralFeatures().get(MAIN423155_EMBEDDED1_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Main423155.embedded2</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Main423155.embedded2</b></em>'.
   * @generated
   */
  public EReference getMain423155_Embedded2() {
    return (EReference) getMain423155EClass().getEAllStructuralFeatures().get(MAIN423155_EMBEDDED2_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Main423155.embedded3</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Main423155.embedded3</b></em>'.
   * @generated
   */
  public EReference getMain423155_Embedded3() {
    return (EReference) getMain423155EClass().getEAllStructuralFeatures().get(MAIN423155_EMBEDDED3_FEATURE_ID);
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
    case EMBEDDED423155_CLASSIFIER_ID:
      return Embedded423155.class;
    case MAIN423155_CLASSIFIER_ID:
      return Main423155.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
