package org.eclipse.modisco.kdm.conceptual;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.modisco.kdm.KdmModelPackage;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.conceptual.dao.AbstractConceptualElementDao;
import org.eclipse.modisco.kdm.conceptual.dao.AbstractConceptualRelationshipDao;
import org.eclipse.modisco.kdm.conceptual.dao.BehaviorUnitDao;
import org.eclipse.modisco.kdm.conceptual.dao.ConceptualContainerDao;
import org.eclipse.modisco.kdm.conceptual.dao.ConceptualElementDao;
import org.eclipse.modisco.kdm.conceptual.dao.ConceptualFlowDao;
import org.eclipse.modisco.kdm.conceptual.dao.ConceptualModelDao;
import org.eclipse.modisco.kdm.conceptual.dao.ConceptualRelationshipDao;
import org.eclipse.modisco.kdm.conceptual.dao.ConceptualRoleDao;
import org.eclipse.modisco.kdm.conceptual.dao.FactUnitDao;
import org.eclipse.modisco.kdm.conceptual.dao.RuleUnitDao;
import org.eclipse.modisco.kdm.conceptual.dao.ScenarioUnitDao;
import org.eclipse.modisco.kdm.conceptual.dao.TermUnitDao;
import org.eclipse.modisco.kdm.core.CoreModelPackage;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The <b>Package</b> for the model '<em><b>conceptual</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ConceptualModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/MoDisco/kdm/conceptual";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final ConceptualModelFactory MODELFACTORY = new ConceptualModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONCEPTUALMODEL_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONCEPTUALMODEL_CONCEPTUALELEMENT_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONCEPTUALELEMENT_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONCEPTUALELEMENT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONCEPTUALELEMENT_IMPLEMENTATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONCEPTUALELEMENT_CONCEPTUALRELATION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONCEPTUALELEMENT_ABSTRACTION_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONCEPTUALRELATIONSHIP_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TERMUNIT_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONCEPTUALCONTAINER_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONCEPTUALCONTAINER_CONCEPTUALELEMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FACTUNIT_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONCEPTUALRELATIONSHIP_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONCEPTUALRELATIONSHIP_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONCEPTUALRELATIONSHIP_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BEHAVIORUNIT_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RULEUNIT_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCENARIOUNIT_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONCEPTUALFLOW_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONCEPTUALFLOW_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONCEPTUALFLOW_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONCEPTUALELEMENT_CLASSIFIER_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONCEPTUALROLE_CLASSIFIER_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONCEPTUALROLE_CONCEPTUALELEMENT_FEATURE_ID = 21;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final ConceptualModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static ConceptualModelPackage initialize() {

    if (isInitialized) {
      return (ConceptualModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final ConceptualModelPackage modelPackage = new ConceptualModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    isInitialized = true;

    SourceModelPackage.initialize();
    CoreModelPackage.initialize();
    ActionModelPackage.initialize();
    KdmModelPackage.initialize();
    org.eclipse.modisco.kdm.kdm.KdmModelPackage.initialize();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(ConceptualModel.class,
        modelPackage.getConceptualModelEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractConceptualElement.class,
        modelPackage.getAbstractConceptualElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractConceptualRelationship.class,
        modelPackage.getAbstractConceptualRelationshipEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TermUnit.class, modelPackage.getTermUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ConceptualContainer.class,
        modelPackage.getConceptualContainerEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(FactUnit.class, modelPackage.getFactUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ConceptualRelationship.class,
        modelPackage.getConceptualRelationshipEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BehaviorUnit.class, modelPackage.getBehaviorUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RuleUnit.class, modelPackage.getRuleUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ScenarioUnit.class, modelPackage.getScenarioUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ConceptualFlow.class, modelPackage.getConceptualFlowEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ConceptualElement.class,
        modelPackage.getConceptualElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ConceptualRole.class, modelPackage.getConceptualRoleEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(ConceptualModel.class, ConceptualModelDao.class);

    DaoRegistry.getInstance().registerDao(AbstractConceptualElement.class, AbstractConceptualElementDao.class);

    DaoRegistry.getInstance()
        .registerDao(AbstractConceptualRelationship.class, AbstractConceptualRelationshipDao.class);

    DaoRegistry.getInstance().registerDao(TermUnit.class, TermUnitDao.class);

    DaoRegistry.getInstance().registerDao(ConceptualContainer.class, ConceptualContainerDao.class);

    DaoRegistry.getInstance().registerDao(FactUnit.class, FactUnitDao.class);

    DaoRegistry.getInstance().registerDao(ConceptualRelationship.class, ConceptualRelationshipDao.class);

    DaoRegistry.getInstance().registerDao(BehaviorUnit.class, BehaviorUnitDao.class);

    DaoRegistry.getInstance().registerDao(RuleUnit.class, RuleUnitDao.class);

    DaoRegistry.getInstance().registerDao(ScenarioUnit.class, ScenarioUnitDao.class);

    DaoRegistry.getInstance().registerDao(ConceptualFlow.class, ConceptualFlowDao.class);

    DaoRegistry.getInstance().registerDao(ConceptualElement.class, ConceptualElementDao.class);

    DaoRegistry.getInstance().registerDao(ConceptualRole.class, ConceptualRoleDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link ConceptualModelFactory} instance.
   * @generated
   */
  @Override
  public ConceptualModelFactory getModelFactory() {
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
    return "conceptual.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>ConceptualModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ConceptualModel</b></em>'
   * @generated
   */
  public EClass getConceptualModelEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONCEPTUALMODEL_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ConceptualModel.conceptualElement</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ConceptualModel.conceptualElement</b></em>'.
   * @generated
   */
  public EReference getConceptualModel_ConceptualElement() {
    return (EReference) getConceptualModelEClass().getEAllStructuralFeatures().get(
        CONCEPTUALMODEL_CONCEPTUALELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractConceptualElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractConceptualElement</b></em>'
   * @generated
   */
  public EClass getAbstractConceptualElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTCONCEPTUALELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractConceptualElement.source</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractConceptualElement.source</b></em>'.
   * @generated
   */
  public EReference getAbstractConceptualElement_Source() {
    return (EReference) getAbstractConceptualElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTCONCEPTUALELEMENT_SOURCE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractConceptualElement.implementation</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractConceptualElement.implementation</b></em>'.
   * @generated
   */
  public EReference getAbstractConceptualElement_Implementation() {
    return (EReference) getAbstractConceptualElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTCONCEPTUALELEMENT_IMPLEMENTATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractConceptualElement.conceptualRelation</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '
   *         <em><b>AbstractConceptualElement.conceptualRelation</b></em>'.
   * @generated
   */
  public EReference getAbstractConceptualElement_ConceptualRelation() {
    return (EReference) getAbstractConceptualElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTCONCEPTUALELEMENT_CONCEPTUALRELATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractConceptualElement.abstraction</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractConceptualElement.abstraction</b></em>'.
   * @generated
   */
  public EReference getAbstractConceptualElement_Abstraction() {
    return (EReference) getAbstractConceptualElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTCONCEPTUALELEMENT_ABSTRACTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractConceptualRelationship</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractConceptualRelationship</b></em>'
   * @generated
   */
  public EClass getAbstractConceptualRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTCONCEPTUALRELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>TermUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TermUnit</b></em>'
   * @generated
   */
  public EClass getTermUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TERMUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ConceptualContainer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ConceptualContainer</b></em>'
   * @generated
   */
  public EClass getConceptualContainerEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONCEPTUALCONTAINER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ConceptualContainer.conceptualElement</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ConceptualContainer.conceptualElement</b></em>'.
   * @generated
   */
  public EReference getConceptualContainer_ConceptualElement() {
    return (EReference) getConceptualContainerEClass().getEAllStructuralFeatures().get(
        CONCEPTUALCONTAINER_CONCEPTUALELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>FactUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>FactUnit</b></em>'
   * @generated
   */
  public EClass getFactUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(FACTUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ConceptualRelationship</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ConceptualRelationship</b></em>'
   * @generated
   */
  public EClass getConceptualRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONCEPTUALRELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ConceptualRelationship.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ConceptualRelationship.to</b></em>'.
   * @generated
   */
  public EReference getConceptualRelationship_To() {
    return (EReference) getConceptualRelationshipEClass().getEAllStructuralFeatures().get(
        CONCEPTUALRELATIONSHIP_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ConceptualRelationship.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ConceptualRelationship.from</b></em>'.
   * @generated
   */
  public EReference getConceptualRelationship_From() {
    return (EReference) getConceptualRelationshipEClass().getEAllStructuralFeatures().get(
        CONCEPTUALRELATIONSHIP_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BehaviorUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BehaviorUnit</b></em>'
   * @generated
   */
  public EClass getBehaviorUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BEHAVIORUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RuleUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RuleUnit</b></em>'
   * @generated
   */
  public EClass getRuleUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RULEUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ScenarioUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ScenarioUnit</b></em>'
   * @generated
   */
  public EClass getScenarioUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SCENARIOUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ConceptualFlow</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ConceptualFlow</b></em>'
   * @generated
   */
  public EClass getConceptualFlowEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONCEPTUALFLOW_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ConceptualFlow.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ConceptualFlow.to</b></em>'.
   * @generated
   */
  public EReference getConceptualFlow_To() {
    return (EReference) getConceptualFlowEClass().getEAllStructuralFeatures().get(CONCEPTUALFLOW_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ConceptualFlow.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ConceptualFlow.from</b></em>'.
   * @generated
   */
  public EReference getConceptualFlow_From() {
    return (EReference) getConceptualFlowEClass().getEAllStructuralFeatures().get(CONCEPTUALFLOW_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ConceptualElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ConceptualElement</b></em>'
   * @generated
   */
  public EClass getConceptualElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONCEPTUALELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ConceptualRole</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ConceptualRole</b></em>'
   * @generated
   */
  public EClass getConceptualRoleEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONCEPTUALROLE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ConceptualRole.conceptualElement</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ConceptualRole.conceptualElement</b></em>'.
   * @generated
   */
  public EReference getConceptualRole_ConceptualElement() {
    return (EReference) getConceptualRoleEClass().getEAllStructuralFeatures().get(
        CONCEPTUALROLE_CONCEPTUALELEMENT_FEATURE_ID);
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
    case CONCEPTUALMODEL_CLASSIFIER_ID:
      return ConceptualModel.class;
    case ABSTRACTCONCEPTUALELEMENT_CLASSIFIER_ID:
      return AbstractConceptualElement.class;
    case ABSTRACTCONCEPTUALRELATIONSHIP_CLASSIFIER_ID:
      return AbstractConceptualRelationship.class;
    case TERMUNIT_CLASSIFIER_ID:
      return TermUnit.class;
    case CONCEPTUALCONTAINER_CLASSIFIER_ID:
      return ConceptualContainer.class;
    case FACTUNIT_CLASSIFIER_ID:
      return FactUnit.class;
    case CONCEPTUALRELATIONSHIP_CLASSIFIER_ID:
      return ConceptualRelationship.class;
    case BEHAVIORUNIT_CLASSIFIER_ID:
      return BehaviorUnit.class;
    case RULEUNIT_CLASSIFIER_ID:
      return RuleUnit.class;
    case SCENARIOUNIT_CLASSIFIER_ID:
      return ScenarioUnit.class;
    case CONCEPTUALFLOW_CLASSIFIER_ID:
      return ConceptualFlow.class;
    case CONCEPTUALELEMENT_CLASSIFIER_ID:
      return ConceptualElement.class;
    case CONCEPTUALROLE_CLASSIFIER_ID:
      return ConceptualRole.class;
    }
    throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
  }
}
