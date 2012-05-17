package org.eclipse.modisco.kdm.platform;

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
import org.eclipse.modisco.kdm.KdmModelPackage;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.core.CoreModelPackage;
import org.eclipse.modisco.kdm.platform.dao.AbstractPlatformElementDao;
import org.eclipse.modisco.kdm.platform.dao.AbstractPlatformRelationshipDao;
import org.eclipse.modisco.kdm.platform.dao.BindsToDao;
import org.eclipse.modisco.kdm.platform.dao.DataManagerDao;
import org.eclipse.modisco.kdm.platform.dao.DefinedByDao;
import org.eclipse.modisco.kdm.platform.dao.DeployedComponentDao;
import org.eclipse.modisco.kdm.platform.dao.DeployedResourceDao;
import org.eclipse.modisco.kdm.platform.dao.DeployedSoftwareSystemDao;
import org.eclipse.modisco.kdm.platform.dao.ExecutionResourceDao;
import org.eclipse.modisco.kdm.platform.dao.ExternalActorDao;
import org.eclipse.modisco.kdm.platform.dao.FileResourceDao;
import org.eclipse.modisco.kdm.platform.dao.LoadsDao;
import org.eclipse.modisco.kdm.platform.dao.LockResourceDao;
import org.eclipse.modisco.kdm.platform.dao.MachineDao;
import org.eclipse.modisco.kdm.platform.dao.ManagesResourceDao;
import org.eclipse.modisco.kdm.platform.dao.MarshalledResourceDao;
import org.eclipse.modisco.kdm.platform.dao.MessagingResourceDao;
import org.eclipse.modisco.kdm.platform.dao.NamingResourceDao;
import org.eclipse.modisco.kdm.platform.dao.PlatformActionDao;
import org.eclipse.modisco.kdm.platform.dao.PlatformElementDao;
import org.eclipse.modisco.kdm.platform.dao.PlatformEventDao;
import org.eclipse.modisco.kdm.platform.dao.PlatformModelDao;
import org.eclipse.modisco.kdm.platform.dao.PlatformRelationshipDao;
import org.eclipse.modisco.kdm.platform.dao.ProcessDao;
import org.eclipse.modisco.kdm.platform.dao.ReadsResourceDao;
import org.eclipse.modisco.kdm.platform.dao.RequiresDao;
import org.eclipse.modisco.kdm.platform.dao.ResourceTypeDao;
import org.eclipse.modisco.kdm.platform.dao.RuntimeResourceDao;
import org.eclipse.modisco.kdm.platform.dao.SpawnsDao;
import org.eclipse.modisco.kdm.platform.dao.StreamResourceDao;
import org.eclipse.modisco.kdm.platform.dao.ThreadDao;
import org.eclipse.modisco.kdm.platform.dao.WritesResourceDao;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The <b>Package</b> for the model '<em><b>platform</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PlatformModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/MoDisco/kdm/platform";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final PlatformModelFactory MODELFACTORY = new PlatformModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMMODEL_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMMODEL_PLATFORMELEMENT_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTPLATFORMELEMENT_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTPLATFORMELEMENT_SOURCE_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTPLATFORMELEMENT_PLATFORMRELATION_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTPLATFORMELEMENT_ABSTRACTION_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTPLATFORMELEMENT_IMPLEMENTATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTPLATFORMRELATIONSHIP_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESOURCETYPE_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESOURCETYPE_PLATFORMELEMENT_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NAMINGRESOURCE_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MARSHALLEDRESOURCE_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MESSAGINGRESOURCE_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FILERESOURCE_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXECUTIONRESOURCE_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOCKRESOURCE_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STREAMRESOURCE_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAMANAGER_CLASSIFIER_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMEVENT_CLASSIFIER_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMEVENT_KIND_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMACTION_CLASSIFIER_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMACTION_KIND_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMACTION_PLATFORMELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTERNALACTOR_CLASSIFIER_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BINDSTO_CLASSIFIER_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BINDSTO_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BINDSTO_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REQUIRES_CLASSIFIER_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REQUIRES_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REQUIRES_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DEPLOYEDCOMPONENT_CLASSIFIER_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DEPLOYEDCOMPONENT_GROUPEDCODE_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESRESOURCE_CLASSIFIER_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESRESOURCE_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESRESOURCE_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSRESOURCE_CLASSIFIER_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSRESOURCE_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSRESOURCE_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESRESOURCE_CLASSIFIER_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESRESOURCE_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESRESOURCE_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DEFINEDBY_CLASSIFIER_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DEFINEDBY_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DEFINEDBY_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DEPLOYEDSOFTWARESYSTEM_CLASSIFIER_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DEPLOYEDSOFTWARESYSTEM_GROUPEDCOMPONENT_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MACHINE_CLASSIFIER_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MACHINE_DEPLOYEDCOMPONENT_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MACHINE_DEPLOYEDRESOURCE_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DEPLOYEDRESOURCE_CLASSIFIER_ID = 24;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DEPLOYEDRESOURCE_PLATFORMELEMENT_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RUNTIMERESOURCE_CLASSIFIER_ID = 25;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PROCESS_CLASSIFIER_ID = 26;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int THREAD_CLASSIFIER_ID = 27;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOADS_CLASSIFIER_ID = 28;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOADS_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOADS_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SPAWNS_CLASSIFIER_ID = 29;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SPAWNS_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SPAWNS_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMELEMENT_CLASSIFIER_ID = 30;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMRELATIONSHIP_CLASSIFIER_ID = 31;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMRELATIONSHIP_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMRELATIONSHIP_FROM_FEATURE_ID = 5;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final PlatformModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static PlatformModelPackage initialize() {

    if (isInitialized) {
      return (PlatformModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final PlatformModelPackage modelPackage = new PlatformModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    isInitialized = true;

    CodeModelPackage.initialize();
    KdmModelPackage.initialize();
    KdmModelPackage.initialize();
    SourceModelPackage.initialize();
    CoreModelPackage.initialize();
    ActionModelPackage.initialize();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(PlatformModel.class, modelPackage.getPlatformModelEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractPlatformElement.class,
        modelPackage.getAbstractPlatformElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractPlatformRelationship.class,
        modelPackage.getAbstractPlatformRelationshipEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ResourceType.class, modelPackage.getResourceTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(NamingResource.class, modelPackage.getNamingResourceEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(MarshalledResource.class,
        modelPackage.getMarshalledResourceEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(MessagingResource.class,
        modelPackage.getMessagingResourceEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(FileResource.class, modelPackage.getFileResourceEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ExecutionResource.class,
        modelPackage.getExecutionResourceEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(LockResource.class, modelPackage.getLockResourceEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(StreamResource.class, modelPackage.getStreamResourceEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DataManager.class, modelPackage.getDataManagerEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PlatformEvent.class, modelPackage.getPlatformEventEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PlatformAction.class, modelPackage.getPlatformActionEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ExternalActor.class, modelPackage.getExternalActorEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BindsTo.class, modelPackage.getBindsToEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Requires.class, modelPackage.getRequiresEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DeployedComponent.class,
        modelPackage.getDeployedComponentEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ManagesResource.class,
        modelPackage.getManagesResourceEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ReadsResource.class, modelPackage.getReadsResourceEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(WritesResource.class, modelPackage.getWritesResourceEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DefinedBy.class, modelPackage.getDefinedByEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DeployedSoftwareSystem.class,
        modelPackage.getDeployedSoftwareSystemEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Machine.class, modelPackage.getMachineEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DeployedResource.class,
        modelPackage.getDeployedResourceEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RuntimeResource.class,
        modelPackage.getRuntimeResourceEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Process.class, modelPackage.getProcessEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Thread.class, modelPackage.getThreadEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Loads.class, modelPackage.getLoadsEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Spawns.class, modelPackage.getSpawnsEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PlatformElement.class,
        modelPackage.getPlatformElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PlatformRelationship.class,
        modelPackage.getPlatformRelationshipEClass(), modelPackage);

    DaoRegistry.getInstance().registerDao(PlatformModel.class, PlatformModelDao.class);

    DaoRegistry.getInstance().registerDao(AbstractPlatformElement.class, AbstractPlatformElementDao.class);

    DaoRegistry.getInstance().registerDao(AbstractPlatformRelationship.class, AbstractPlatformRelationshipDao.class);

    DaoRegistry.getInstance().registerDao(ResourceType.class, ResourceTypeDao.class);

    DaoRegistry.getInstance().registerDao(NamingResource.class, NamingResourceDao.class);

    DaoRegistry.getInstance().registerDao(MarshalledResource.class, MarshalledResourceDao.class);

    DaoRegistry.getInstance().registerDao(MessagingResource.class, MessagingResourceDao.class);

    DaoRegistry.getInstance().registerDao(FileResource.class, FileResourceDao.class);

    DaoRegistry.getInstance().registerDao(ExecutionResource.class, ExecutionResourceDao.class);

    DaoRegistry.getInstance().registerDao(LockResource.class, LockResourceDao.class);

    DaoRegistry.getInstance().registerDao(StreamResource.class, StreamResourceDao.class);

    DaoRegistry.getInstance().registerDao(DataManager.class, DataManagerDao.class);

    DaoRegistry.getInstance().registerDao(PlatformEvent.class, PlatformEventDao.class);

    DaoRegistry.getInstance().registerDao(PlatformAction.class, PlatformActionDao.class);

    DaoRegistry.getInstance().registerDao(ExternalActor.class, ExternalActorDao.class);

    DaoRegistry.getInstance().registerDao(BindsTo.class, BindsToDao.class);

    DaoRegistry.getInstance().registerDao(Requires.class, RequiresDao.class);

    DaoRegistry.getInstance().registerDao(DeployedComponent.class, DeployedComponentDao.class);

    DaoRegistry.getInstance().registerDao(ManagesResource.class, ManagesResourceDao.class);

    DaoRegistry.getInstance().registerDao(ReadsResource.class, ReadsResourceDao.class);

    DaoRegistry.getInstance().registerDao(WritesResource.class, WritesResourceDao.class);

    DaoRegistry.getInstance().registerDao(DefinedBy.class, DefinedByDao.class);

    DaoRegistry.getInstance().registerDao(DeployedSoftwareSystem.class, DeployedSoftwareSystemDao.class);

    DaoRegistry.getInstance().registerDao(Machine.class, MachineDao.class);

    DaoRegistry.getInstance().registerDao(DeployedResource.class, DeployedResourceDao.class);

    DaoRegistry.getInstance().registerDao(RuntimeResource.class, RuntimeResourceDao.class);

    DaoRegistry.getInstance().registerDao(Process.class, ProcessDao.class);

    DaoRegistry.getInstance().registerDao(Thread.class, ThreadDao.class);

    DaoRegistry.getInstance().registerDao(Loads.class, LoadsDao.class);

    DaoRegistry.getInstance().registerDao(Spawns.class, SpawnsDao.class);

    DaoRegistry.getInstance().registerDao(PlatformElement.class, PlatformElementDao.class);

    DaoRegistry.getInstance().registerDao(PlatformRelationship.class, PlatformRelationshipDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link PlatformModelFactory} instance.
   * @generated
   */
  @Override
  public PlatformModelFactory getModelFactory() {
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
    return "platform.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>PlatformModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PlatformModel</b></em>'
   * @generated
   */
  public EClass getPlatformModelEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PLATFORMMODEL_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PlatformModel.platformElement</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PlatformModel.platformElement</b></em>'.
   * @generated
   */
  public EReference getPlatformModel_PlatformElement() {
    return (EReference) getPlatformModelEClass().getEAllStructuralFeatures().get(
        PLATFORMMODEL_PLATFORMELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractPlatformElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractPlatformElement</b></em>'
   * @generated
   */
  public EClass getAbstractPlatformElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTPLATFORMELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractPlatformElement.source</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractPlatformElement.source</b></em>'.
   * @generated
   */
  public EReference getAbstractPlatformElement_Source() {
    return (EReference) getAbstractPlatformElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTPLATFORMELEMENT_SOURCE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractPlatformElement.platformRelation</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractPlatformElement.platformRelation</b></em>'.
   * @generated
   */
  public EReference getAbstractPlatformElement_PlatformRelation() {
    return (EReference) getAbstractPlatformElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTPLATFORMELEMENT_PLATFORMRELATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractPlatformElement.abstraction</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractPlatformElement.abstraction</b></em>'.
   * @generated
   */
  public EReference getAbstractPlatformElement_Abstraction() {
    return (EReference) getAbstractPlatformElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTPLATFORMELEMENT_ABSTRACTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractPlatformElement.implementation</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractPlatformElement.implementation</b></em>'.
   * @generated
   */
  public EReference getAbstractPlatformElement_Implementation() {
    return (EReference) getAbstractPlatformElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTPLATFORMELEMENT_IMPLEMENTATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractPlatformRelationship</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractPlatformRelationship</b></em>'
   * @generated
   */
  public EClass getAbstractPlatformRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTPLATFORMRELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ResourceType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ResourceType</b></em>'
   * @generated
   */
  public EClass getResourceTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RESOURCETYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ResourceType.platformElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ResourceType.platformElement</b></em>'.
   * @generated
   */
  public EReference getResourceType_PlatformElement() {
    return (EReference) getResourceTypeEClass().getEAllStructuralFeatures()
        .get(RESOURCETYPE_PLATFORMELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>NamingResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>NamingResource</b></em>'
   * @generated
   */
  public EClass getNamingResourceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(NAMINGRESOURCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>MarshalledResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>MarshalledResource</b></em>'
   * @generated
   */
  public EClass getMarshalledResourceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MARSHALLEDRESOURCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>MessagingResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>MessagingResource</b></em>'
   * @generated
   */
  public EClass getMessagingResourceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MESSAGINGRESOURCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>FileResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>FileResource</b></em>'
   * @generated
   */
  public EClass getFileResourceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(FILERESOURCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ExecutionResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ExecutionResource</b></em>'
   * @generated
   */
  public EClass getExecutionResourceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EXECUTIONRESOURCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>LockResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>LockResource</b></em>'
   * @generated
   */
  public EClass getLockResourceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(LOCKRESOURCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>StreamResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>StreamResource</b></em>'
   * @generated
   */
  public EClass getStreamResourceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(STREAMRESOURCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DataManager</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DataManager</b></em>'
   * @generated
   */
  public EClass getDataManagerEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATAMANAGER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PlatformEvent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PlatformEvent</b></em>'
   * @generated
   */
  public EClass getPlatformEventEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PLATFORMEVENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PlatformEvent.kind</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PlatformEvent.kind</b></em>'.
   * @generated
   */
  public EAttribute getPlatformEvent_Kind() {
    return (EAttribute) getPlatformEventEClass().getEAllStructuralFeatures().get(PLATFORMEVENT_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PlatformAction</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PlatformAction</b></em>'
   * @generated
   */
  public EClass getPlatformActionEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PLATFORMACTION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PlatformAction.kind</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PlatformAction.kind</b></em>'.
   * @generated
   */
  public EAttribute getPlatformAction_Kind() {
    return (EAttribute) getPlatformActionEClass().getEAllStructuralFeatures().get(PLATFORMACTION_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PlatformAction.platformElement</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PlatformAction.platformElement</b></em>'.
   * @generated
   */
  public EReference getPlatformAction_PlatformElement() {
    return (EReference) getPlatformActionEClass().getEAllStructuralFeatures().get(
        PLATFORMACTION_PLATFORMELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ExternalActor</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ExternalActor</b></em>'
   * @generated
   */
  public EClass getExternalActorEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EXTERNALACTOR_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BindsTo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BindsTo</b></em>'
   * @generated
   */
  public EClass getBindsToEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BINDSTO_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BindsTo.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BindsTo.to</b></em>'.
   * @generated
   */
  public EReference getBindsTo_To() {
    return (EReference) getBindsToEClass().getEAllStructuralFeatures().get(BINDSTO_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BindsTo.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BindsTo.from</b></em>'.
   * @generated
   */
  public EReference getBindsTo_From() {
    return (EReference) getBindsToEClass().getEAllStructuralFeatures().get(BINDSTO_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Requires</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Requires</b></em>'
   * @generated
   */
  public EClass getRequiresEClass() {
    return (EClass) getEPackage().getEClassifiers().get(REQUIRES_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Requires.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Requires.to</b></em>'.
   * @generated
   */
  public EReference getRequires_To() {
    return (EReference) getRequiresEClass().getEAllStructuralFeatures().get(REQUIRES_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Requires.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Requires.from</b></em>'.
   * @generated
   */
  public EReference getRequires_From() {
    return (EReference) getRequiresEClass().getEAllStructuralFeatures().get(REQUIRES_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DeployedComponent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DeployedComponent</b></em>'
   * @generated
   */
  public EClass getDeployedComponentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DEPLOYEDCOMPONENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DeployedComponent.groupedCode</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DeployedComponent.groupedCode</b></em>'.
   * @generated
   */
  public EReference getDeployedComponent_GroupedCode() {
    return (EReference) getDeployedComponentEClass().getEAllStructuralFeatures().get(
        DEPLOYEDCOMPONENT_GROUPEDCODE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ManagesResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ManagesResource</b></em>'
   * @generated
   */
  public EClass getManagesResourceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MANAGESRESOURCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManagesResource.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManagesResource.to</b></em>'.
   * @generated
   */
  public EReference getManagesResource_To() {
    return (EReference) getManagesResourceEClass().getEAllStructuralFeatures().get(MANAGESRESOURCE_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManagesResource.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManagesResource.from</b></em>'.
   * @generated
   */
  public EReference getManagesResource_From() {
    return (EReference) getManagesResourceEClass().getEAllStructuralFeatures().get(MANAGESRESOURCE_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ReadsResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ReadsResource</b></em>'
   * @generated
   */
  public EClass getReadsResourceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(READSRESOURCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ReadsResource.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ReadsResource.to</b></em>'.
   * @generated
   */
  public EReference getReadsResource_To() {
    return (EReference) getReadsResourceEClass().getEAllStructuralFeatures().get(READSRESOURCE_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ReadsResource.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ReadsResource.from</b></em>'.
   * @generated
   */
  public EReference getReadsResource_From() {
    return (EReference) getReadsResourceEClass().getEAllStructuralFeatures().get(READSRESOURCE_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>WritesResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>WritesResource</b></em>'
   * @generated
   */
  public EClass getWritesResourceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(WRITESRESOURCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WritesResource.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WritesResource.to</b></em>'.
   * @generated
   */
  public EReference getWritesResource_To() {
    return (EReference) getWritesResourceEClass().getEAllStructuralFeatures().get(WRITESRESOURCE_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WritesResource.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WritesResource.from</b></em>'.
   * @generated
   */
  public EReference getWritesResource_From() {
    return (EReference) getWritesResourceEClass().getEAllStructuralFeatures().get(WRITESRESOURCE_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DefinedBy</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DefinedBy</b></em>'
   * @generated
   */
  public EClass getDefinedByEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DEFINEDBY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DefinedBy.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DefinedBy.to</b></em>'.
   * @generated
   */
  public EReference getDefinedBy_To() {
    return (EReference) getDefinedByEClass().getEAllStructuralFeatures().get(DEFINEDBY_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DefinedBy.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DefinedBy.from</b></em>'.
   * @generated
   */
  public EReference getDefinedBy_From() {
    return (EReference) getDefinedByEClass().getEAllStructuralFeatures().get(DEFINEDBY_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DeployedSoftwareSystem</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DeployedSoftwareSystem</b></em>'
   * @generated
   */
  public EClass getDeployedSoftwareSystemEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DEPLOYEDSOFTWARESYSTEM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DeployedSoftwareSystem.groupedComponent</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DeployedSoftwareSystem.groupedComponent</b></em>'.
   * @generated
   */
  public EReference getDeployedSoftwareSystem_GroupedComponent() {
    return (EReference) getDeployedSoftwareSystemEClass().getEAllStructuralFeatures().get(
        DEPLOYEDSOFTWARESYSTEM_GROUPEDCOMPONENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Machine</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Machine</b></em>'
   * @generated
   */
  public EClass getMachineEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MACHINE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Machine.deployedComponent</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Machine.deployedComponent</b></em>'.
   * @generated
   */
  public EReference getMachine_DeployedComponent() {
    return (EReference) getMachineEClass().getEAllStructuralFeatures().get(MACHINE_DEPLOYEDCOMPONENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Machine.deployedResource</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Machine.deployedResource</b></em>'.
   * @generated
   */
  public EReference getMachine_DeployedResource() {
    return (EReference) getMachineEClass().getEAllStructuralFeatures().get(MACHINE_DEPLOYEDRESOURCE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DeployedResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DeployedResource</b></em>'
   * @generated
   */
  public EClass getDeployedResourceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DEPLOYEDRESOURCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DeployedResource.platformElement</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DeployedResource.platformElement</b></em>'.
   * @generated
   */
  public EReference getDeployedResource_PlatformElement() {
    return (EReference) getDeployedResourceEClass().getEAllStructuralFeatures().get(
        DEPLOYEDRESOURCE_PLATFORMELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RuntimeResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RuntimeResource</b></em>'
   * @generated
   */
  public EClass getRuntimeResourceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RUNTIMERESOURCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Process</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Process</b></em>'
   * @generated
   */
  public EClass getProcessEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PROCESS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Thread</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Thread</b></em>'
   * @generated
   */
  public EClass getThreadEClass() {
    return (EClass) getEPackage().getEClassifiers().get(THREAD_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Loads</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Loads</b></em>'
   * @generated
   */
  public EClass getLoadsEClass() {
    return (EClass) getEPackage().getEClassifiers().get(LOADS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Loads.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Loads.to</b></em>'.
   * @generated
   */
  public EReference getLoads_To() {
    return (EReference) getLoadsEClass().getEAllStructuralFeatures().get(LOADS_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Loads.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Loads.from</b></em>'.
   * @generated
   */
  public EReference getLoads_From() {
    return (EReference) getLoadsEClass().getEAllStructuralFeatures().get(LOADS_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Spawns</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Spawns</b></em>'
   * @generated
   */
  public EClass getSpawnsEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SPAWNS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Spawns.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Spawns.to</b></em>'.
   * @generated
   */
  public EReference getSpawns_To() {
    return (EReference) getSpawnsEClass().getEAllStructuralFeatures().get(SPAWNS_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Spawns.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Spawns.from</b></em>'.
   * @generated
   */
  public EReference getSpawns_From() {
    return (EReference) getSpawnsEClass().getEAllStructuralFeatures().get(SPAWNS_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PlatformElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PlatformElement</b></em>'
   * @generated
   */
  public EClass getPlatformElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PLATFORMELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PlatformRelationship</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PlatformRelationship</b></em>'
   * @generated
   */
  public EClass getPlatformRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PLATFORMRELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PlatformRelationship.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PlatformRelationship.to</b></em>'.
   * @generated
   */
  public EReference getPlatformRelationship_To() {
    return (EReference) getPlatformRelationshipEClass().getEAllStructuralFeatures().get(
        PLATFORMRELATIONSHIP_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PlatformRelationship.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PlatformRelationship.from</b></em>'.
   * @generated
   */
  public EReference getPlatformRelationship_From() {
    return (EReference) getPlatformRelationshipEClass().getEAllStructuralFeatures().get(
        PLATFORMRELATIONSHIP_FROM_FEATURE_ID);
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
    case PLATFORMMODEL_CLASSIFIER_ID:
      return PlatformModel.class;
    case ABSTRACTPLATFORMELEMENT_CLASSIFIER_ID:
      return AbstractPlatformElement.class;
    case ABSTRACTPLATFORMRELATIONSHIP_CLASSIFIER_ID:
      return AbstractPlatformRelationship.class;
    case RESOURCETYPE_CLASSIFIER_ID:
      return ResourceType.class;
    case NAMINGRESOURCE_CLASSIFIER_ID:
      return NamingResource.class;
    case MARSHALLEDRESOURCE_CLASSIFIER_ID:
      return MarshalledResource.class;
    case MESSAGINGRESOURCE_CLASSIFIER_ID:
      return MessagingResource.class;
    case FILERESOURCE_CLASSIFIER_ID:
      return FileResource.class;
    case EXECUTIONRESOURCE_CLASSIFIER_ID:
      return ExecutionResource.class;
    case LOCKRESOURCE_CLASSIFIER_ID:
      return LockResource.class;
    case STREAMRESOURCE_CLASSIFIER_ID:
      return StreamResource.class;
    case DATAMANAGER_CLASSIFIER_ID:
      return DataManager.class;
    case PLATFORMEVENT_CLASSIFIER_ID:
      return PlatformEvent.class;
    case PLATFORMACTION_CLASSIFIER_ID:
      return PlatformAction.class;
    case EXTERNALACTOR_CLASSIFIER_ID:
      return ExternalActor.class;
    case BINDSTO_CLASSIFIER_ID:
      return BindsTo.class;
    case REQUIRES_CLASSIFIER_ID:
      return Requires.class;
    case DEPLOYEDCOMPONENT_CLASSIFIER_ID:
      return DeployedComponent.class;
    case MANAGESRESOURCE_CLASSIFIER_ID:
      return ManagesResource.class;
    case READSRESOURCE_CLASSIFIER_ID:
      return ReadsResource.class;
    case WRITESRESOURCE_CLASSIFIER_ID:
      return WritesResource.class;
    case DEFINEDBY_CLASSIFIER_ID:
      return DefinedBy.class;
    case DEPLOYEDSOFTWARESYSTEM_CLASSIFIER_ID:
      return DeployedSoftwareSystem.class;
    case MACHINE_CLASSIFIER_ID:
      return Machine.class;
    case DEPLOYEDRESOURCE_CLASSIFIER_ID:
      return DeployedResource.class;
    case RUNTIMERESOURCE_CLASSIFIER_ID:
      return RuntimeResource.class;
    case PROCESS_CLASSIFIER_ID:
      return Process.class;
    case THREAD_CLASSIFIER_ID:
      return Thread.class;
    case LOADS_CLASSIFIER_ID:
      return Loads.class;
    case SPAWNS_CLASSIFIER_ID:
      return Spawns.class;
    case PLATFORMELEMENT_CLASSIFIER_ID:
      return PlatformElement.class;
    case PLATFORMRELATIONSHIP_CLASSIFIER_ID:
      return PlatformRelationship.class;
    }
    throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
  }
}
