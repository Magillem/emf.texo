package org.eclipse.emf.texo.test.model.issues.bz424797;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz424797.dao.AbstractSuper424797Dao;
import org.eclipse.emf.texo.test.model.issues.bz424797.dao.Other4242797Dao;
import org.eclipse.emf.texo.test.model.issues.bz424797.dao.Sub4242797Dao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>Bz424797</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 *
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Bz424797ModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/bz424797";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Bz424797ModelFactory MODELFACTORY = new Bz424797ModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSUPER424797_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSUPER424797_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSUPER424797_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUB4242797_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUB4242797_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUB4242797_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int OTHER4242797_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int OTHER4242797_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int OTHER4242797_DB_VERSION_FEATURE_ID = 1;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Bz424797ModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return an initialized instance of this class
   *
   * @generated
   */
  public static Bz424797ModelPackage initialize() {

    if (isInitialized) {
      return (Bz424797ModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final Bz424797ModelPackage modelPackage = new Bz424797ModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(AbstractSuper424797.class,
        modelPackage.getAbstractSuper424797EClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Sub4242797.class, modelPackage.getSub4242797EClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Other4242797.class, modelPackage.getOther4242797EClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(AbstractSuper424797.class, AbstractSuper424797Dao.class);
    DaoRegistry.getInstance().registerDao(Sub4242797.class, Sub4242797Dao.class);
    DaoRegistry.getInstance().registerDao(Other4242797.class, Other4242797Dao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the {@link Bz424797ModelFactory} instance.
   * @generated
   */
  @Override
  public Bz424797ModelFactory getModelFactory() {
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
    return "Bz424797.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractSuper424797</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractSuper424797</b></em>'
   * @generated
   */
  public EClass getAbstractSuper424797EClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTSUPER424797_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Sub4242797</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Sub4242797</b></em>'
   * @generated
   */
  public EClass getSub4242797EClass() {
    return (EClass) getEPackage().getEClassifiers().get(SUB4242797_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Other4242797</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Other4242797</b></em>'
   * @generated
   */
  public EClass getOther4242797EClass() {
    return (EClass) getEPackage().getEClassifiers().get(OTHER4242797_CLASSIFIER_ID);
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
    case ABSTRACTSUPER424797_CLASSIFIER_ID:
      return AbstractSuper424797.class;
    case SUB4242797_CLASSIFIER_ID:
      return Sub4242797.class;
    case OTHER4242797_CLASSIFIER_ID:
      return Other4242797.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
