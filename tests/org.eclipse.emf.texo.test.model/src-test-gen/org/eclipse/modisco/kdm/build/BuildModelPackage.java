package org.eclipse.modisco.kdm.build;

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
import org.eclipse.modisco.kdm.build.dao.AbstractBuildElementDao;
import org.eclipse.modisco.kdm.build.dao.AbstractBuildRelationshipDao;
import org.eclipse.modisco.kdm.build.dao.BuildComponentDao;
import org.eclipse.modisco.kdm.build.dao.BuildDescriptionDao;
import org.eclipse.modisco.kdm.build.dao.BuildElementDao;
import org.eclipse.modisco.kdm.build.dao.BuildModelDao;
import org.eclipse.modisco.kdm.build.dao.BuildProductDao;
import org.eclipse.modisco.kdm.build.dao.BuildRelationshipDao;
import org.eclipse.modisco.kdm.build.dao.BuildResourceDao;
import org.eclipse.modisco.kdm.build.dao.BuildStepDao;
import org.eclipse.modisco.kdm.build.dao.ConsumesDao;
import org.eclipse.modisco.kdm.build.dao.DescribedByDao;
import org.eclipse.modisco.kdm.build.dao.LibraryDao;
import org.eclipse.modisco.kdm.build.dao.LinksToDao;
import org.eclipse.modisco.kdm.build.dao.ProducesDao;
import org.eclipse.modisco.kdm.build.dao.SuppliedByDao;
import org.eclipse.modisco.kdm.build.dao.SupplierDao;
import org.eclipse.modisco.kdm.build.dao.SupportedByDao;
import org.eclipse.modisco.kdm.build.dao.SymbolicLinkDao;
import org.eclipse.modisco.kdm.build.dao.ToolDao;
import org.eclipse.modisco.kdm.core.CoreModelPackage;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The <b>Package</b> for the model '<em><b>build</b></em>'. It contains initialization code and access to the Factory
 * to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class BuildModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/MoDisco/kdm/build";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final BuildModelFactory MODELFACTORY = new BuildModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTBUILDELEMENT_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTBUILDELEMENT_BUILDRELATION_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTBUILDRELATIONSHIP_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BUILDRESOURCE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BUILDRESOURCE_IMPLEMENTATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BUILDRESOURCE_GROUPEDBUILD_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BUILDRESOURCE_BUILDELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BUILDDESCRIPTION_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BUILDDESCRIPTION_SOURCE_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BUILDDESCRIPTION_TEXT_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SYMBOLICLINK_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LINKSTO_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LINKSTO_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LINKSTO_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONSUMES_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONSUMES_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONSUMES_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BUILDSTEP_CLASSIFIER_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BUILDMODEL_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BUILDMODEL_BUILDELEMENT_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BUILDCOMPONENT_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIER_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TOOL_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BUILDELEMENT_CLASSIFIER_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BUILDRELATIONSHIP_CLASSIFIER_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BUILDRELATIONSHIP_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BUILDRELATIONSHIP_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIEDBY_CLASSIFIER_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIEDBY_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIEDBY_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LIBRARY_CLASSIFIER_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCES_CLASSIFIER_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCES_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCES_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPORTEDBY_CLASSIFIER_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPORTEDBY_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPORTEDBY_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BUILDPRODUCT_CLASSIFIER_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DESCRIBEDBY_CLASSIFIER_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DESCRIBEDBY_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DESCRIBEDBY_FROM_FEATURE_ID = 7;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final BuildModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static BuildModelPackage initialize() {

    if (isInitialized) {
      return (BuildModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final BuildModelPackage modelPackage = new BuildModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    isInitialized = true;

    KdmModelPackage.initialize();
    CoreModelPackage.initialize();
    SourceModelPackage.initialize();
    org.eclipse.modisco.kdm.kdm.KdmModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(AbstractBuildElement.class,
        modelPackage.getAbstractBuildElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractBuildRelationship.class,
        modelPackage.getAbstractBuildRelationshipEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BuildResource.class, modelPackage.getBuildResourceEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BuildDescription.class,
        modelPackage.getBuildDescriptionEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SymbolicLink.class, modelPackage.getSymbolicLinkEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(LinksTo.class, modelPackage.getLinksToEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Consumes.class, modelPackage.getConsumesEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BuildStep.class, modelPackage.getBuildStepEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BuildModel.class, modelPackage.getBuildModelEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BuildComponent.class, modelPackage.getBuildComponentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Supplier.class, modelPackage.getSupplierEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Tool.class, modelPackage.getToolEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BuildElement.class, modelPackage.getBuildElementEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BuildRelationship.class,
        modelPackage.getBuildRelationshipEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SuppliedBy.class, modelPackage.getSuppliedByEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Library.class, modelPackage.getLibraryEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Produces.class, modelPackage.getProducesEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SupportedBy.class, modelPackage.getSupportedByEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BuildProduct.class, modelPackage.getBuildProductEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DescribedBy.class, modelPackage.getDescribedByEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(AbstractBuildElement.class, AbstractBuildElementDao.class);
    DaoRegistry.getInstance().registerDao(AbstractBuildRelationship.class, AbstractBuildRelationshipDao.class);
    DaoRegistry.getInstance().registerDao(BuildResource.class, BuildResourceDao.class);
    DaoRegistry.getInstance().registerDao(BuildDescription.class, BuildDescriptionDao.class);
    DaoRegistry.getInstance().registerDao(SymbolicLink.class, SymbolicLinkDao.class);
    DaoRegistry.getInstance().registerDao(LinksTo.class, LinksToDao.class);
    DaoRegistry.getInstance().registerDao(Consumes.class, ConsumesDao.class);
    DaoRegistry.getInstance().registerDao(BuildStep.class, BuildStepDao.class);
    DaoRegistry.getInstance().registerDao(BuildModel.class, BuildModelDao.class);
    DaoRegistry.getInstance().registerDao(BuildComponent.class, BuildComponentDao.class);
    DaoRegistry.getInstance().registerDao(Supplier.class, SupplierDao.class);
    DaoRegistry.getInstance().registerDao(Tool.class, ToolDao.class);
    DaoRegistry.getInstance().registerDao(BuildElement.class, BuildElementDao.class);
    DaoRegistry.getInstance().registerDao(BuildRelationship.class, BuildRelationshipDao.class);
    DaoRegistry.getInstance().registerDao(SuppliedBy.class, SuppliedByDao.class);
    DaoRegistry.getInstance().registerDao(Library.class, LibraryDao.class);
    DaoRegistry.getInstance().registerDao(Produces.class, ProducesDao.class);
    DaoRegistry.getInstance().registerDao(SupportedBy.class, SupportedByDao.class);
    DaoRegistry.getInstance().registerDao(BuildProduct.class, BuildProductDao.class);
    DaoRegistry.getInstance().registerDao(DescribedBy.class, DescribedByDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link BuildModelFactory} instance.
   * @generated
   */
  @Override
  public BuildModelFactory getModelFactory() {
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
    return "build.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractBuildElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractBuildElement</b></em>'
   * @generated
   */
  public EClass getAbstractBuildElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTBUILDELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractBuildElement.buildRelation</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractBuildElement.buildRelation</b></em>'.
   * @generated
   */
  public EReference getAbstractBuildElement_BuildRelation() {
    return (EReference) getAbstractBuildElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTBUILDELEMENT_BUILDRELATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractBuildRelationship</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractBuildRelationship</b></em>'
   * @generated
   */
  public EClass getAbstractBuildRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTBUILDRELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BuildResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BuildResource</b></em>'
   * @generated
   */
  public EClass getBuildResourceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BUILDRESOURCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BuildResource.implementation</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BuildResource.implementation</b></em>'.
   * @generated
   */
  public EReference getBuildResource_Implementation() {
    return (EReference) getBuildResourceEClass().getEAllStructuralFeatures().get(
        BUILDRESOURCE_IMPLEMENTATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BuildResource.groupedBuild</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BuildResource.groupedBuild</b></em>'.
   * @generated
   */
  public EReference getBuildResource_GroupedBuild() {
    return (EReference) getBuildResourceEClass().getEAllStructuralFeatures().get(BUILDRESOURCE_GROUPEDBUILD_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BuildResource.buildElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BuildResource.buildElement</b></em>'.
   * @generated
   */
  public EReference getBuildResource_BuildElement() {
    return (EReference) getBuildResourceEClass().getEAllStructuralFeatures().get(BUILDRESOURCE_BUILDELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BuildDescription</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BuildDescription</b></em>'
   * @generated
   */
  public EClass getBuildDescriptionEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BUILDDESCRIPTION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BuildDescription.source</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BuildDescription.source</b></em>'.
   * @generated
   */
  public EReference getBuildDescription_Source() {
    return (EReference) getBuildDescriptionEClass().getEAllStructuralFeatures().get(BUILDDESCRIPTION_SOURCE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BuildDescription.text</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BuildDescription.text</b></em>'.
   * @generated
   */
  public EAttribute getBuildDescription_Text() {
    return (EAttribute) getBuildDescriptionEClass().getEAllStructuralFeatures().get(BUILDDESCRIPTION_TEXT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SymbolicLink</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SymbolicLink</b></em>'
   * @generated
   */
  public EClass getSymbolicLinkEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SYMBOLICLINK_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>LinksTo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>LinksTo</b></em>'
   * @generated
   */
  public EClass getLinksToEClass() {
    return (EClass) getEPackage().getEClassifiers().get(LINKSTO_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>LinksTo.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>LinksTo.to</b></em>'.
   * @generated
   */
  public EReference getLinksTo_To() {
    return (EReference) getLinksToEClass().getEAllStructuralFeatures().get(LINKSTO_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>LinksTo.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>LinksTo.from</b></em>'.
   * @generated
   */
  public EReference getLinksTo_From() {
    return (EReference) getLinksToEClass().getEAllStructuralFeatures().get(LINKSTO_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Consumes</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Consumes</b></em>'
   * @generated
   */
  public EClass getConsumesEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONSUMES_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Consumes.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Consumes.to</b></em>'.
   * @generated
   */
  public EReference getConsumes_To() {
    return (EReference) getConsumesEClass().getEAllStructuralFeatures().get(CONSUMES_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Consumes.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Consumes.from</b></em>'.
   * @generated
   */
  public EReference getConsumes_From() {
    return (EReference) getConsumesEClass().getEAllStructuralFeatures().get(CONSUMES_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BuildStep</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BuildStep</b></em>'
   * @generated
   */
  public EClass getBuildStepEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BUILDSTEP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BuildModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BuildModel</b></em>'
   * @generated
   */
  public EClass getBuildModelEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BUILDMODEL_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BuildModel.buildElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BuildModel.buildElement</b></em>'.
   * @generated
   */
  public EReference getBuildModel_BuildElement() {
    return (EReference) getBuildModelEClass().getEAllStructuralFeatures().get(BUILDMODEL_BUILDELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BuildComponent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BuildComponent</b></em>'
   * @generated
   */
  public EClass getBuildComponentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BUILDCOMPONENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Supplier</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Supplier</b></em>'
   * @generated
   */
  public EClass getSupplierEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SUPPLIER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Tool</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Tool</b></em>'
   * @generated
   */
  public EClass getToolEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TOOL_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BuildElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BuildElement</b></em>'
   * @generated
   */
  public EClass getBuildElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BUILDELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BuildRelationship</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BuildRelationship</b></em>'
   * @generated
   */
  public EClass getBuildRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BUILDRELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BuildRelationship.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BuildRelationship.to</b></em>'.
   * @generated
   */
  public EReference getBuildRelationship_To() {
    return (EReference) getBuildRelationshipEClass().getEAllStructuralFeatures().get(BUILDRELATIONSHIP_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BuildRelationship.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BuildRelationship.from</b></em>'.
   * @generated
   */
  public EReference getBuildRelationship_From() {
    return (EReference) getBuildRelationshipEClass().getEAllStructuralFeatures().get(BUILDRELATIONSHIP_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SuppliedBy</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SuppliedBy</b></em>'
   * @generated
   */
  public EClass getSuppliedByEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SUPPLIEDBY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SuppliedBy.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SuppliedBy.to</b></em>'.
   * @generated
   */
  public EReference getSuppliedBy_To() {
    return (EReference) getSuppliedByEClass().getEAllStructuralFeatures().get(SUPPLIEDBY_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SuppliedBy.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SuppliedBy.from</b></em>'.
   * @generated
   */
  public EReference getSuppliedBy_From() {
    return (EReference) getSuppliedByEClass().getEAllStructuralFeatures().get(SUPPLIEDBY_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Library</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Library</b></em>'
   * @generated
   */
  public EClass getLibraryEClass() {
    return (EClass) getEPackage().getEClassifiers().get(LIBRARY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Produces</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Produces</b></em>'
   * @generated
   */
  public EClass getProducesEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PRODUCES_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Produces.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Produces.to</b></em>'.
   * @generated
   */
  public EReference getProduces_To() {
    return (EReference) getProducesEClass().getEAllStructuralFeatures().get(PRODUCES_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Produces.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Produces.from</b></em>'.
   * @generated
   */
  public EReference getProduces_From() {
    return (EReference) getProducesEClass().getEAllStructuralFeatures().get(PRODUCES_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SupportedBy</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SupportedBy</b></em>'
   * @generated
   */
  public EClass getSupportedByEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SUPPORTEDBY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SupportedBy.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SupportedBy.to</b></em>'.
   * @generated
   */
  public EReference getSupportedBy_To() {
    return (EReference) getSupportedByEClass().getEAllStructuralFeatures().get(SUPPORTEDBY_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SupportedBy.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SupportedBy.from</b></em>'.
   * @generated
   */
  public EReference getSupportedBy_From() {
    return (EReference) getSupportedByEClass().getEAllStructuralFeatures().get(SUPPORTEDBY_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BuildProduct</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BuildProduct</b></em>'
   * @generated
   */
  public EClass getBuildProductEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BUILDPRODUCT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DescribedBy</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DescribedBy</b></em>'
   * @generated
   */
  public EClass getDescribedByEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DESCRIBEDBY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DescribedBy.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DescribedBy.to</b></em>'.
   * @generated
   */
  public EReference getDescribedBy_To() {
    return (EReference) getDescribedByEClass().getEAllStructuralFeatures().get(DESCRIBEDBY_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DescribedBy.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DescribedBy.from</b></em>'.
   * @generated
   */
  public EReference getDescribedBy_From() {
    return (EReference) getDescribedByEClass().getEAllStructuralFeatures().get(DESCRIBEDBY_FROM_FEATURE_ID);
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
    case ABSTRACTBUILDELEMENT_CLASSIFIER_ID:
      return AbstractBuildElement.class;
    case ABSTRACTBUILDRELATIONSHIP_CLASSIFIER_ID:
      return AbstractBuildRelationship.class;
    case BUILDRESOURCE_CLASSIFIER_ID:
      return BuildResource.class;
    case BUILDDESCRIPTION_CLASSIFIER_ID:
      return BuildDescription.class;
    case SYMBOLICLINK_CLASSIFIER_ID:
      return SymbolicLink.class;
    case LINKSTO_CLASSIFIER_ID:
      return LinksTo.class;
    case CONSUMES_CLASSIFIER_ID:
      return Consumes.class;
    case BUILDSTEP_CLASSIFIER_ID:
      return BuildStep.class;
    case BUILDMODEL_CLASSIFIER_ID:
      return BuildModel.class;
    case BUILDCOMPONENT_CLASSIFIER_ID:
      return BuildComponent.class;
    case SUPPLIER_CLASSIFIER_ID:
      return Supplier.class;
    case TOOL_CLASSIFIER_ID:
      return Tool.class;
    case BUILDELEMENT_CLASSIFIER_ID:
      return BuildElement.class;
    case BUILDRELATIONSHIP_CLASSIFIER_ID:
      return BuildRelationship.class;
    case SUPPLIEDBY_CLASSIFIER_ID:
      return SuppliedBy.class;
    case LIBRARY_CLASSIFIER_ID:
      return Library.class;
    case PRODUCES_CLASSIFIER_ID:
      return Produces.class;
    case SUPPORTEDBY_CLASSIFIER_ID:
      return SupportedBy.class;
    case BUILDPRODUCT_CLASSIFIER_ID:
      return BuildProduct.class;
    case DESCRIBEDBY_CLASSIFIER_ID:
      return DescribedBy.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
