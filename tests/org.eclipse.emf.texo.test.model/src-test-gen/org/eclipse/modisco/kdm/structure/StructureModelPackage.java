package org.eclipse.modisco.kdm.structure;

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
import org.eclipse.modisco.kdm.core.CoreModelPackage;
import org.eclipse.modisco.kdm.structure.dao.AbstractStructureElementDao;
import org.eclipse.modisco.kdm.structure.dao.AbstractStructureRelationshipDao;
import org.eclipse.modisco.kdm.structure.dao.ArchitectureViewDao;
import org.eclipse.modisco.kdm.structure.dao.ComponentDao;
import org.eclipse.modisco.kdm.structure.dao.LayerDao;
import org.eclipse.modisco.kdm.structure.dao.SoftwareSystemDao;
import org.eclipse.modisco.kdm.structure.dao.StructureElementDao;
import org.eclipse.modisco.kdm.structure.dao.StructureModelDao;
import org.eclipse.modisco.kdm.structure.dao.StructureRelationshipDao;
import org.eclipse.modisco.kdm.structure.dao.SubsystemDao;

/**
 * The <b>Package</b> for the model '<em><b>structure</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class StructureModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/MoDisco/kdm/structure";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final StructureModelFactory MODELFACTORY = new StructureModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSTRUCTUREELEMENT_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSTRUCTUREELEMENT_AGGREGATED_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSTRUCTUREELEMENT_IMPLEMENTATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSTRUCTUREELEMENT_STRUCTUREELEMENT_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSTRUCTUREELEMENT_STRUCTURERELATIONSHIP_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSTRUCTURERELATIONSHIP_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUBSYSTEM_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LAYER_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STRUCTUREMODEL_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STRUCTUREMODEL_STRUCTUREELEMENT_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPONENT_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SOFTWARESYSTEM_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STRUCTURERELATIONSHIP_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STRUCTURERELATIONSHIP_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STRUCTURERELATIONSHIP_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ARCHITECTUREVIEW_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STRUCTUREELEMENT_CLASSIFIER_ID = 9;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final StructureModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static StructureModelPackage initialize() {

    if (isInitialized) {
      return (StructureModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final StructureModelPackage modelPackage = new StructureModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    isInitialized = true;

    KdmModelPackage.initialize();
    CoreModelPackage.initialize();
    org.eclipse.modisco.kdm.kdm.KdmModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(AbstractStructureElement.class,
        modelPackage.getAbstractStructureElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractStructureRelationship.class,
        modelPackage.getAbstractStructureRelationshipEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Subsystem.class, modelPackage.getSubsystemEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Layer.class, modelPackage.getLayerEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(StructureModel.class, modelPackage.getStructureModelEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Component.class, modelPackage.getComponentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SoftwareSystem.class, modelPackage.getSoftwareSystemEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(StructureRelationship.class,
        modelPackage.getStructureRelationshipEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ArchitectureView.class,
        modelPackage.getArchitectureViewEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(StructureElement.class,
        modelPackage.getStructureElementEClass(), modelPackage);

    DaoRegistry.getInstance().registerDao(AbstractStructureElement.class, AbstractStructureElementDao.class);
    DaoRegistry.getInstance().registerDao(AbstractStructureRelationship.class, AbstractStructureRelationshipDao.class);
    DaoRegistry.getInstance().registerDao(Subsystem.class, SubsystemDao.class);
    DaoRegistry.getInstance().registerDao(Layer.class, LayerDao.class);
    DaoRegistry.getInstance().registerDao(StructureModel.class, StructureModelDao.class);
    DaoRegistry.getInstance().registerDao(Component.class, ComponentDao.class);
    DaoRegistry.getInstance().registerDao(SoftwareSystem.class, SoftwareSystemDao.class);
    DaoRegistry.getInstance().registerDao(StructureRelationship.class, StructureRelationshipDao.class);
    DaoRegistry.getInstance().registerDao(ArchitectureView.class, ArchitectureViewDao.class);
    DaoRegistry.getInstance().registerDao(StructureElement.class, StructureElementDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link StructureModelFactory} instance.
   * @generated
   */
  @Override
  public StructureModelFactory getModelFactory() {
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
    return "structure.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractStructureElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractStructureElement</b></em>'
   * @generated
   */
  public EClass getAbstractStructureElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTSTRUCTUREELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractStructureElement.aggregated</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractStructureElement.aggregated</b></em>'.
   * @generated
   */
  public EReference getAbstractStructureElement_Aggregated() {
    return (EReference) getAbstractStructureElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTSTRUCTUREELEMENT_AGGREGATED_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractStructureElement.implementation</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractStructureElement.implementation</b></em>'.
   * @generated
   */
  public EReference getAbstractStructureElement_Implementation() {
    return (EReference) getAbstractStructureElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTSTRUCTUREELEMENT_IMPLEMENTATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractStructureElement.structureElement</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractStructureElement.structureElement</b></em>'.
   * @generated
   */
  public EReference getAbstractStructureElement_StructureElement() {
    return (EReference) getAbstractStructureElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTSTRUCTUREELEMENT_STRUCTUREELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractStructureElement.structureRelationship</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '
   *         <em><b>AbstractStructureElement.structureRelationship</b></em>'.
   * @generated
   */
  public EReference getAbstractStructureElement_StructureRelationship() {
    return (EReference) getAbstractStructureElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTSTRUCTUREELEMENT_STRUCTURERELATIONSHIP_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractStructureRelationship</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractStructureRelationship</b></em>'
   * @generated
   */
  public EClass getAbstractStructureRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTSTRUCTURERELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Subsystem</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Subsystem</b></em>'
   * @generated
   */
  public EClass getSubsystemEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SUBSYSTEM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Layer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Layer</b></em>'
   * @generated
   */
  public EClass getLayerEClass() {
    return (EClass) getEPackage().getEClassifiers().get(LAYER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>StructureModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>StructureModel</b></em>'
   * @generated
   */
  public EClass getStructureModelEClass() {
    return (EClass) getEPackage().getEClassifiers().get(STRUCTUREMODEL_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>StructureModel.structureElement</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>StructureModel.structureElement</b></em>'.
   * @generated
   */
  public EReference getStructureModel_StructureElement() {
    return (EReference) getStructureModelEClass().getEAllStructuralFeatures().get(
        STRUCTUREMODEL_STRUCTUREELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Component</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Component</b></em>'
   * @generated
   */
  public EClass getComponentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COMPONENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SoftwareSystem</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SoftwareSystem</b></em>'
   * @generated
   */
  public EClass getSoftwareSystemEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SOFTWARESYSTEM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>StructureRelationship</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>StructureRelationship</b></em>'
   * @generated
   */
  public EClass getStructureRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(STRUCTURERELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>StructureRelationship.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>StructureRelationship.to</b></em>'.
   * @generated
   */
  public EReference getStructureRelationship_To() {
    return (EReference) getStructureRelationshipEClass().getEAllStructuralFeatures().get(
        STRUCTURERELATIONSHIP_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>StructureRelationship.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>StructureRelationship.from</b></em>'.
   * @generated
   */
  public EReference getStructureRelationship_From() {
    return (EReference) getStructureRelationshipEClass().getEAllStructuralFeatures().get(
        STRUCTURERELATIONSHIP_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ArchitectureView</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ArchitectureView</b></em>'
   * @generated
   */
  public EClass getArchitectureViewEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ARCHITECTUREVIEW_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>StructureElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>StructureElement</b></em>'
   * @generated
   */
  public EClass getStructureElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(STRUCTUREELEMENT_CLASSIFIER_ID);
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
    case ABSTRACTSTRUCTUREELEMENT_CLASSIFIER_ID:
      return AbstractStructureElement.class;
    case ABSTRACTSTRUCTURERELATIONSHIP_CLASSIFIER_ID:
      return AbstractStructureRelationship.class;
    case SUBSYSTEM_CLASSIFIER_ID:
      return Subsystem.class;
    case LAYER_CLASSIFIER_ID:
      return Layer.class;
    case STRUCTUREMODEL_CLASSIFIER_ID:
      return StructureModel.class;
    case COMPONENT_CLASSIFIER_ID:
      return Component.class;
    case SOFTWARESYSTEM_CLASSIFIER_ID:
      return SoftwareSystem.class;
    case STRUCTURERELATIONSHIP_CLASSIFIER_ID:
      return StructureRelationship.class;
    case ARCHITECTUREVIEW_CLASSIFIER_ID:
      return ArchitectureView.class;
    case STRUCTUREELEMENT_CLASSIFIER_ID:
      return StructureElement.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
