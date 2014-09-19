package org.eclipse.modisco.kdm.build;

import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.modisco.kdm.core.CoreModelFactory;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.modisco.kdm.kdm.KdmModelFactory;
import org.eclipse.modisco.kdm.source.SourceRef;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: build. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class BuildModelFactory implements ModelFactory {

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
    case BuildModelPackage.BUILDRESOURCE_CLASSIFIER_ID:
      return createBuildResource();
    case BuildModelPackage.BUILDDESCRIPTION_CLASSIFIER_ID:
      return createBuildDescription();
    case BuildModelPackage.SYMBOLICLINK_CLASSIFIER_ID:
      return createSymbolicLink();
    case BuildModelPackage.LINKSTO_CLASSIFIER_ID:
      return createLinksTo();
    case BuildModelPackage.CONSUMES_CLASSIFIER_ID:
      return createConsumes();
    case BuildModelPackage.BUILDSTEP_CLASSIFIER_ID:
      return createBuildStep();
    case BuildModelPackage.BUILDMODEL_CLASSIFIER_ID:
      return createBuildModel();
    case BuildModelPackage.BUILDCOMPONENT_CLASSIFIER_ID:
      return createBuildComponent();
    case BuildModelPackage.SUPPLIER_CLASSIFIER_ID:
      return createSupplier();
    case BuildModelPackage.TOOL_CLASSIFIER_ID:
      return createTool();
    case BuildModelPackage.BUILDELEMENT_CLASSIFIER_ID:
      return createBuildElement();
    case BuildModelPackage.BUILDRELATIONSHIP_CLASSIFIER_ID:
      return createBuildRelationship();
    case BuildModelPackage.SUPPLIEDBY_CLASSIFIER_ID:
      return createSuppliedBy();
    case BuildModelPackage.LIBRARY_CLASSIFIER_ID:
      return createLibrary();
    case BuildModelPackage.PRODUCES_CLASSIFIER_ID:
      return createProduces();
    case BuildModelPackage.SUPPORTEDBY_CLASSIFIER_ID:
      return createSupportedBy();
    case BuildModelPackage.BUILDPRODUCT_CLASSIFIER_ID:
      return createBuildProduct();
    case BuildModelPackage.DESCRIBEDBY_CLASSIFIER_ID:
      return createDescribedBy();
    default:
      throw new IllegalArgumentException("The EClass '" + eClass.getName()
          + "' is not a valid EClass for this EPackage");
    }
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
    case BuildModelPackage.ABSTRACTBUILDELEMENT_CLASSIFIER_ID:
      modelObject = new AbstractBuildElementModelObject();
      break;
    case BuildModelPackage.ABSTRACTBUILDRELATIONSHIP_CLASSIFIER_ID:
      modelObject = new AbstractBuildRelationshipModelObject();
      break;
    case BuildModelPackage.BUILDRESOURCE_CLASSIFIER_ID:
      modelObject = new BuildResourceModelObject();
      break;
    case BuildModelPackage.BUILDDESCRIPTION_CLASSIFIER_ID:
      modelObject = new BuildDescriptionModelObject();
      break;
    case BuildModelPackage.SYMBOLICLINK_CLASSIFIER_ID:
      modelObject = new SymbolicLinkModelObject();
      break;
    case BuildModelPackage.LINKSTO_CLASSIFIER_ID:
      modelObject = new LinksToModelObject();
      break;
    case BuildModelPackage.CONSUMES_CLASSIFIER_ID:
      modelObject = new ConsumesModelObject();
      break;
    case BuildModelPackage.BUILDSTEP_CLASSIFIER_ID:
      modelObject = new BuildStepModelObject();
      break;
    case BuildModelPackage.BUILDMODEL_CLASSIFIER_ID:
      modelObject = new BuildModelModelObject();
      break;
    case BuildModelPackage.BUILDCOMPONENT_CLASSIFIER_ID:
      modelObject = new BuildComponentModelObject();
      break;
    case BuildModelPackage.SUPPLIER_CLASSIFIER_ID:
      modelObject = new SupplierModelObject();
      break;
    case BuildModelPackage.TOOL_CLASSIFIER_ID:
      modelObject = new ToolModelObject();
      break;
    case BuildModelPackage.BUILDELEMENT_CLASSIFIER_ID:
      modelObject = new BuildElementModelObject();
      break;
    case BuildModelPackage.BUILDRELATIONSHIP_CLASSIFIER_ID:
      modelObject = new BuildRelationshipModelObject();
      break;
    case BuildModelPackage.SUPPLIEDBY_CLASSIFIER_ID:
      modelObject = new SuppliedByModelObject();
      break;
    case BuildModelPackage.LIBRARY_CLASSIFIER_ID:
      modelObject = new LibraryModelObject();
      break;
    case BuildModelPackage.PRODUCES_CLASSIFIER_ID:
      modelObject = new ProducesModelObject();
      break;
    case BuildModelPackage.SUPPORTEDBY_CLASSIFIER_ID:
      modelObject = new SupportedByModelObject();
      break;
    case BuildModelPackage.BUILDPRODUCT_CLASSIFIER_ID:
      modelObject = new BuildProductModelObject();
      break;
    case BuildModelPackage.DESCRIBEDBY_CLASSIFIER_ID:
      modelObject = new DescribedByModelObject();
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
   * @param eFeature
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
   * @param eFeature
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
   * @return an instance of the model object representing the EClass BuildResource
   * @generated
   */
  public BuildResource createBuildResource() {
    return new BuildResource();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BuildDescription
   * @generated
   */
  public BuildDescription createBuildDescription() {
    return new BuildDescription();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SymbolicLink
   * @generated
   */
  public SymbolicLink createSymbolicLink() {
    return new SymbolicLink();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass LinksTo
   * @generated
   */
  public LinksTo createLinksTo() {
    return new LinksTo();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Consumes
   * @generated
   */
  public Consumes createConsumes() {
    return new Consumes();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BuildStep
   * @generated
   */
  public BuildStep createBuildStep() {
    return new BuildStep();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BuildModel
   * @generated
   */
  public BuildModel createBuildModel() {
    return new BuildModel();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BuildComponent
   * @generated
   */
  public BuildComponent createBuildComponent() {
    return new BuildComponent();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Supplier
   * @generated
   */
  public Supplier createSupplier() {
    return new Supplier();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Tool
   * @generated
   */
  public Tool createTool() {
    return new Tool();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BuildElement
   * @generated
   */
  public BuildElement createBuildElement() {
    return new BuildElement();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BuildRelationship
   * @generated
   */
  public BuildRelationship createBuildRelationship() {
    return new BuildRelationship();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SuppliedBy
   * @generated
   */
  public SuppliedBy createSuppliedBy() {
    return new SuppliedBy();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Library
   * @generated
   */
  public Library createLibrary() {
    return new Library();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Produces
   * @generated
   */
  public Produces createProduces() {
    return new Produces();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SupportedBy
   * @generated
   */
  public SupportedBy createSupportedBy() {
    return new SupportedBy();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BuildProduct
   * @generated
   */
  public BuildProduct createBuildProduct() {
    return new BuildProduct();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DescribedBy
   * @generated
   */
  public DescribedBy createDescribedBy() {
    return new DescribedBy();
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
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage");
    }
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
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractBuildElement</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class AbstractBuildElementModelObject<E extends AbstractBuildElement> extends
      CoreModelFactory.KDMEntityModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getAbstractBuildElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.ABSTRACTBUILDELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.ABSTRACTBUILDELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.ABSTRACTBUILDELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.ABSTRACTBUILDELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.ABSTRACTBUILDELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.ABSTRACTBUILDELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case BuildModelPackage.ABSTRACTBUILDELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case BuildModelPackage.ABSTRACTBUILDELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case BuildModelPackage.ABSTRACTBUILDELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case BuildModelPackage.ABSTRACTBUILDELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case BuildModelPackage.ABSTRACTBUILDELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case BuildModelPackage.ABSTRACTBUILDELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case BuildModelPackage.ABSTRACTBUILDELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case BuildModelPackage.ABSTRACTBUILDELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case BuildModelPackage.ABSTRACTBUILDELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case BuildModelPackage.ABSTRACTBUILDELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case BuildModelPackage.ABSTRACTBUILDELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case BuildModelPackage.ABSTRACTBUILDELEMENT_BUILDRELATION_FEATURE_ID:
        return getTarget().getBuildRelation();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.ABSTRACTBUILDELEMENT_BUILDRELATION_FEATURE_ID:
        getTarget().setBuildRelation((Set<AbstractBuildRelationship>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case BuildModelPackage.ABSTRACTBUILDELEMENT_BUILDRELATION_FEATURE_ID:
        return getTarget().addToBuildRelation((AbstractBuildRelationship) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case BuildModelPackage.ABSTRACTBUILDELEMENT_BUILDRELATION_FEATURE_ID:
        return getTarget().removeFromBuildRelation((AbstractBuildRelationship) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractBuildRelationship</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class AbstractBuildRelationshipModelObject<E extends AbstractBuildRelationship> extends
      CoreModelFactory.KDMRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getAbstractBuildRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.ABSTRACTBUILDRELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.ABSTRACTBUILDRELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.ABSTRACTBUILDRELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.ABSTRACTBUILDRELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.ABSTRACTBUILDRELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.ABSTRACTBUILDRELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>BuildResource</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class BuildResourceModelObject<E extends BuildResource> extends AbstractBuildElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getBuildResourceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.BUILDRESOURCE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.BUILDRESOURCE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.BUILDRESOURCE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.BUILDRESOURCE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.BUILDRESOURCE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.BUILDRESOURCE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case BuildModelPackage.BUILDRESOURCE_NAME_FEATURE_ID:
        return getTarget().getName();
      case BuildModelPackage.BUILDRESOURCE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case BuildModelPackage.BUILDRESOURCE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case BuildModelPackage.BUILDRESOURCE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case BuildModelPackage.BUILDRESOURCE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case BuildModelPackage.BUILDRESOURCE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case BuildModelPackage.BUILDRESOURCE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case BuildModelPackage.BUILDRESOURCE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case BuildModelPackage.BUILDRESOURCE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case BuildModelPackage.BUILDRESOURCE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case BuildModelPackage.BUILDRESOURCE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case BuildModelPackage.BUILDRESOURCE_BUILDRELATION_FEATURE_ID:
        return getTarget().getBuildRelation();
      case BuildModelPackage.BUILDRESOURCE_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case BuildModelPackage.BUILDRESOURCE_GROUPEDBUILD_FEATURE_ID:
        return getTarget().getGroupedBuild();
      case BuildModelPackage.BUILDRESOURCE_BUILDELEMENT_FEATURE_ID:
        return getTarget().getBuildElement();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.BUILDRESOURCE_IMPLEMENTATION_FEATURE_ID:
        getTarget().setImplementation((Set<KDMEntity>) value);
        return;
      case BuildModelPackage.BUILDRESOURCE_GROUPEDBUILD_FEATURE_ID:
        getTarget().setGroupedBuild((Set<AbstractBuildElement>) value);
        return;
      case BuildModelPackage.BUILDRESOURCE_BUILDELEMENT_FEATURE_ID:
        getTarget().setBuildElement((Set<AbstractBuildElement>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case BuildModelPackage.BUILDRESOURCE_IMPLEMENTATION_FEATURE_ID:
        return getTarget().addToImplementation((KDMEntity) value);

      case BuildModelPackage.BUILDRESOURCE_GROUPEDBUILD_FEATURE_ID:
        return getTarget().addToGroupedBuild((AbstractBuildElement) value);

      case BuildModelPackage.BUILDRESOURCE_BUILDELEMENT_FEATURE_ID:
        return getTarget().addToBuildElement((AbstractBuildElement) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case BuildModelPackage.BUILDRESOURCE_IMPLEMENTATION_FEATURE_ID:
        return getTarget().removeFromImplementation((KDMEntity) value);

      case BuildModelPackage.BUILDRESOURCE_GROUPEDBUILD_FEATURE_ID:
        return getTarget().removeFromGroupedBuild((AbstractBuildElement) value);

      case BuildModelPackage.BUILDRESOURCE_BUILDELEMENT_FEATURE_ID:
        return getTarget().removeFromBuildElement((AbstractBuildElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>BuildDescription</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class BuildDescriptionModelObject<E extends BuildDescription> extends BuildResourceModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getBuildDescriptionEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.BUILDDESCRIPTION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.BUILDDESCRIPTION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.BUILDDESCRIPTION_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.BUILDDESCRIPTION_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.BUILDDESCRIPTION_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.BUILDDESCRIPTION_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case BuildModelPackage.BUILDDESCRIPTION_NAME_FEATURE_ID:
        return getTarget().getName();
      case BuildModelPackage.BUILDDESCRIPTION_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case BuildModelPackage.BUILDDESCRIPTION_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case BuildModelPackage.BUILDDESCRIPTION_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case BuildModelPackage.BUILDDESCRIPTION_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case BuildModelPackage.BUILDDESCRIPTION_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case BuildModelPackage.BUILDDESCRIPTION_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case BuildModelPackage.BUILDDESCRIPTION_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case BuildModelPackage.BUILDDESCRIPTION_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case BuildModelPackage.BUILDDESCRIPTION_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case BuildModelPackage.BUILDDESCRIPTION_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case BuildModelPackage.BUILDDESCRIPTION_BUILDRELATION_FEATURE_ID:
        return getTarget().getBuildRelation();
      case BuildModelPackage.BUILDDESCRIPTION_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case BuildModelPackage.BUILDDESCRIPTION_GROUPEDBUILD_FEATURE_ID:
        return getTarget().getGroupedBuild();
      case BuildModelPackage.BUILDDESCRIPTION_BUILDELEMENT_FEATURE_ID:
        return getTarget().getBuildElement();
      case BuildModelPackage.BUILDDESCRIPTION_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case BuildModelPackage.BUILDDESCRIPTION_TEXT_FEATURE_ID:
        return getTarget().getText();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.BUILDDESCRIPTION_SOURCE_FEATURE_ID:
        getTarget().setSource((Set<SourceRef>) value);
        return;
      case BuildModelPackage.BUILDDESCRIPTION_TEXT_FEATURE_ID:
        getTarget().setText((String) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case BuildModelPackage.BUILDDESCRIPTION_SOURCE_FEATURE_ID:
        return getTarget().addToSource((SourceRef) value);

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case BuildModelPackage.BUILDDESCRIPTION_SOURCE_FEATURE_ID:
        return getTarget().removeFromSource((SourceRef) value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>SymbolicLink</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class SymbolicLinkModelObject<E extends SymbolicLink> extends AbstractBuildElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getSymbolicLinkEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.SYMBOLICLINK_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.SYMBOLICLINK_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.SYMBOLICLINK_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.SYMBOLICLINK_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.SYMBOLICLINK_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.SYMBOLICLINK_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case BuildModelPackage.SYMBOLICLINK_NAME_FEATURE_ID:
        return getTarget().getName();
      case BuildModelPackage.SYMBOLICLINK_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case BuildModelPackage.SYMBOLICLINK_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case BuildModelPackage.SYMBOLICLINK_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case BuildModelPackage.SYMBOLICLINK_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case BuildModelPackage.SYMBOLICLINK_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case BuildModelPackage.SYMBOLICLINK_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case BuildModelPackage.SYMBOLICLINK_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case BuildModelPackage.SYMBOLICLINK_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case BuildModelPackage.SYMBOLICLINK_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case BuildModelPackage.SYMBOLICLINK_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case BuildModelPackage.SYMBOLICLINK_BUILDRELATION_FEATURE_ID:
        return getTarget().getBuildRelation();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>LinksTo</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class LinksToModelObject<E extends LinksTo> extends AbstractBuildRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getLinksToEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.LINKSTO_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.LINKSTO_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.LINKSTO_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.LINKSTO_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.LINKSTO_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.LINKSTO_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case BuildModelPackage.LINKSTO_TO_FEATURE_ID:
        return getTarget().getTo();
      case BuildModelPackage.LINKSTO_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.LINKSTO_TO_FEATURE_ID:
        getTarget().setTo((AbstractBuildElement) value);
        return;
      case BuildModelPackage.LINKSTO_FROM_FEATURE_ID:
        getTarget().setFrom((SymbolicLink) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Consumes</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class ConsumesModelObject<E extends Consumes> extends AbstractBuildRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getConsumesEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.CONSUMES_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.CONSUMES_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.CONSUMES_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.CONSUMES_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.CONSUMES_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.CONSUMES_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case BuildModelPackage.CONSUMES_TO_FEATURE_ID:
        return getTarget().getTo();
      case BuildModelPackage.CONSUMES_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.CONSUMES_TO_FEATURE_ID:
        getTarget().setTo((AbstractBuildElement) value);
        return;
      case BuildModelPackage.CONSUMES_FROM_FEATURE_ID:
        getTarget().setFrom((BuildStep) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>BuildStep</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class BuildStepModelObject<E extends BuildStep> extends BuildResourceModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getBuildStepEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.BUILDSTEP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.BUILDSTEP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.BUILDSTEP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.BUILDSTEP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.BUILDSTEP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.BUILDSTEP_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case BuildModelPackage.BUILDSTEP_NAME_FEATURE_ID:
        return getTarget().getName();
      case BuildModelPackage.BUILDSTEP_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case BuildModelPackage.BUILDSTEP_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case BuildModelPackage.BUILDSTEP_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case BuildModelPackage.BUILDSTEP_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case BuildModelPackage.BUILDSTEP_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case BuildModelPackage.BUILDSTEP_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case BuildModelPackage.BUILDSTEP_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case BuildModelPackage.BUILDSTEP_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case BuildModelPackage.BUILDSTEP_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case BuildModelPackage.BUILDSTEP_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case BuildModelPackage.BUILDSTEP_BUILDRELATION_FEATURE_ID:
        return getTarget().getBuildRelation();
      case BuildModelPackage.BUILDSTEP_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case BuildModelPackage.BUILDSTEP_GROUPEDBUILD_FEATURE_ID:
        return getTarget().getGroupedBuild();
      case BuildModelPackage.BUILDSTEP_BUILDELEMENT_FEATURE_ID:
        return getTarget().getBuildElement();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>BuildModel</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class BuildModelModelObject<E extends BuildModel> extends KdmModelFactory.KDMModelModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getBuildModelEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.BUILDMODEL_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.BUILDMODEL_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.BUILDMODEL_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.BUILDMODEL_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.BUILDMODEL_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.BUILDMODEL_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case BuildModelPackage.BUILDMODEL_AUDIT_FEATURE_ID:
        return getTarget().getAudit();
      case BuildModelPackage.BUILDMODEL_EXTENSION_FEATURE_ID:
        return getTarget().getExtension();
      case BuildModelPackage.BUILDMODEL_NAME_FEATURE_ID:
        return getTarget().getName();
      case BuildModelPackage.BUILDMODEL_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case BuildModelPackage.BUILDMODEL_BUILDELEMENT_FEATURE_ID:
        return getTarget().getBuildElement();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.BUILDMODEL_BUILDELEMENT_FEATURE_ID:
        getTarget().setBuildElement((Set<AbstractBuildElement>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case BuildModelPackage.BUILDMODEL_BUILDELEMENT_FEATURE_ID:
        return getTarget().addToBuildElement((AbstractBuildElement) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case BuildModelPackage.BUILDMODEL_BUILDELEMENT_FEATURE_ID:
        return getTarget().removeFromBuildElement((AbstractBuildElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>BuildComponent</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class BuildComponentModelObject<E extends BuildComponent> extends BuildResourceModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getBuildComponentEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.BUILDCOMPONENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.BUILDCOMPONENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.BUILDCOMPONENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.BUILDCOMPONENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.BUILDCOMPONENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.BUILDCOMPONENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case BuildModelPackage.BUILDCOMPONENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case BuildModelPackage.BUILDCOMPONENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case BuildModelPackage.BUILDCOMPONENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case BuildModelPackage.BUILDCOMPONENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case BuildModelPackage.BUILDCOMPONENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case BuildModelPackage.BUILDCOMPONENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case BuildModelPackage.BUILDCOMPONENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case BuildModelPackage.BUILDCOMPONENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case BuildModelPackage.BUILDCOMPONENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case BuildModelPackage.BUILDCOMPONENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case BuildModelPackage.BUILDCOMPONENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case BuildModelPackage.BUILDCOMPONENT_BUILDRELATION_FEATURE_ID:
        return getTarget().getBuildRelation();
      case BuildModelPackage.BUILDCOMPONENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case BuildModelPackage.BUILDCOMPONENT_GROUPEDBUILD_FEATURE_ID:
        return getTarget().getGroupedBuild();
      case BuildModelPackage.BUILDCOMPONENT_BUILDELEMENT_FEATURE_ID:
        return getTarget().getBuildElement();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Supplier</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class SupplierModelObject<E extends Supplier> extends AbstractBuildElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getSupplierEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.SUPPLIER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.SUPPLIER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.SUPPLIER_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.SUPPLIER_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.SUPPLIER_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.SUPPLIER_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case BuildModelPackage.SUPPLIER_NAME_FEATURE_ID:
        return getTarget().getName();
      case BuildModelPackage.SUPPLIER_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case BuildModelPackage.SUPPLIER_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case BuildModelPackage.SUPPLIER_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case BuildModelPackage.SUPPLIER_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case BuildModelPackage.SUPPLIER_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case BuildModelPackage.SUPPLIER_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case BuildModelPackage.SUPPLIER_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case BuildModelPackage.SUPPLIER_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case BuildModelPackage.SUPPLIER_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case BuildModelPackage.SUPPLIER_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case BuildModelPackage.SUPPLIER_BUILDRELATION_FEATURE_ID:
        return getTarget().getBuildRelation();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Tool</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class ToolModelObject<E extends Tool> extends AbstractBuildElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getToolEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.TOOL_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.TOOL_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.TOOL_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.TOOL_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.TOOL_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.TOOL_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case BuildModelPackage.TOOL_NAME_FEATURE_ID:
        return getTarget().getName();
      case BuildModelPackage.TOOL_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case BuildModelPackage.TOOL_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case BuildModelPackage.TOOL_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case BuildModelPackage.TOOL_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case BuildModelPackage.TOOL_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case BuildModelPackage.TOOL_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case BuildModelPackage.TOOL_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case BuildModelPackage.TOOL_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case BuildModelPackage.TOOL_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case BuildModelPackage.TOOL_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case BuildModelPackage.TOOL_BUILDRELATION_FEATURE_ID:
        return getTarget().getBuildRelation();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>BuildElement</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class BuildElementModelObject<E extends BuildElement> extends AbstractBuildElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getBuildElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.BUILDELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.BUILDELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.BUILDELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.BUILDELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.BUILDELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.BUILDELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case BuildModelPackage.BUILDELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case BuildModelPackage.BUILDELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case BuildModelPackage.BUILDELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case BuildModelPackage.BUILDELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case BuildModelPackage.BUILDELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case BuildModelPackage.BUILDELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case BuildModelPackage.BUILDELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case BuildModelPackage.BUILDELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case BuildModelPackage.BUILDELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case BuildModelPackage.BUILDELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case BuildModelPackage.BUILDELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case BuildModelPackage.BUILDELEMENT_BUILDRELATION_FEATURE_ID:
        return getTarget().getBuildRelation();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>BuildRelationship</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class BuildRelationshipModelObject<E extends BuildRelationship> extends
      AbstractBuildRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getBuildRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.BUILDRELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.BUILDRELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.BUILDRELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.BUILDRELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.BUILDRELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.BUILDRELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case BuildModelPackage.BUILDRELATIONSHIP_TO_FEATURE_ID:
        return getTarget().getTo();
      case BuildModelPackage.BUILDRELATIONSHIP_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.BUILDRELATIONSHIP_TO_FEATURE_ID:
        getTarget().setTo((KDMEntity) value);
        return;
      case BuildModelPackage.BUILDRELATIONSHIP_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractBuildElement) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>SuppliedBy</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class SuppliedByModelObject<E extends SuppliedBy> extends AbstractBuildRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getSuppliedByEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.SUPPLIEDBY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.SUPPLIEDBY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.SUPPLIEDBY_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.SUPPLIEDBY_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.SUPPLIEDBY_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.SUPPLIEDBY_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case BuildModelPackage.SUPPLIEDBY_TO_FEATURE_ID:
        return getTarget().getTo();
      case BuildModelPackage.SUPPLIEDBY_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.SUPPLIEDBY_TO_FEATURE_ID:
        getTarget().setTo((Supplier) value);
        return;
      case BuildModelPackage.SUPPLIEDBY_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractBuildElement) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Library</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class LibraryModelObject<E extends Library> extends BuildResourceModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getLibraryEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.LIBRARY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.LIBRARY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.LIBRARY_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.LIBRARY_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.LIBRARY_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.LIBRARY_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case BuildModelPackage.LIBRARY_NAME_FEATURE_ID:
        return getTarget().getName();
      case BuildModelPackage.LIBRARY_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case BuildModelPackage.LIBRARY_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case BuildModelPackage.LIBRARY_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case BuildModelPackage.LIBRARY_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case BuildModelPackage.LIBRARY_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case BuildModelPackage.LIBRARY_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case BuildModelPackage.LIBRARY_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case BuildModelPackage.LIBRARY_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case BuildModelPackage.LIBRARY_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case BuildModelPackage.LIBRARY_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case BuildModelPackage.LIBRARY_BUILDRELATION_FEATURE_ID:
        return getTarget().getBuildRelation();
      case BuildModelPackage.LIBRARY_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case BuildModelPackage.LIBRARY_GROUPEDBUILD_FEATURE_ID:
        return getTarget().getGroupedBuild();
      case BuildModelPackage.LIBRARY_BUILDELEMENT_FEATURE_ID:
        return getTarget().getBuildElement();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Produces</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class ProducesModelObject<E extends Produces> extends AbstractBuildRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getProducesEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.PRODUCES_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.PRODUCES_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.PRODUCES_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.PRODUCES_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.PRODUCES_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.PRODUCES_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case BuildModelPackage.PRODUCES_TO_FEATURE_ID:
        return getTarget().getTo();
      case BuildModelPackage.PRODUCES_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.PRODUCES_TO_FEATURE_ID:
        getTarget().setTo((AbstractBuildElement) value);
        return;
      case BuildModelPackage.PRODUCES_FROM_FEATURE_ID:
        getTarget().setFrom((BuildStep) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>SupportedBy</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class SupportedByModelObject<E extends SupportedBy> extends AbstractBuildRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getSupportedByEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.SUPPORTEDBY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.SUPPORTEDBY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.SUPPORTEDBY_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.SUPPORTEDBY_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.SUPPORTEDBY_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.SUPPORTEDBY_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case BuildModelPackage.SUPPORTEDBY_TO_FEATURE_ID:
        return getTarget().getTo();
      case BuildModelPackage.SUPPORTEDBY_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.SUPPORTEDBY_TO_FEATURE_ID:
        getTarget().setTo((Tool) value);
        return;
      case BuildModelPackage.SUPPORTEDBY_FROM_FEATURE_ID:
        getTarget().setFrom((BuildStep) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>BuildProduct</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class BuildProductModelObject<E extends BuildProduct> extends BuildResourceModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getBuildProductEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.BUILDPRODUCT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.BUILDPRODUCT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.BUILDPRODUCT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.BUILDPRODUCT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.BUILDPRODUCT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.BUILDPRODUCT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case BuildModelPackage.BUILDPRODUCT_NAME_FEATURE_ID:
        return getTarget().getName();
      case BuildModelPackage.BUILDPRODUCT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case BuildModelPackage.BUILDPRODUCT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case BuildModelPackage.BUILDPRODUCT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case BuildModelPackage.BUILDPRODUCT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case BuildModelPackage.BUILDPRODUCT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case BuildModelPackage.BUILDPRODUCT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case BuildModelPackage.BUILDPRODUCT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case BuildModelPackage.BUILDPRODUCT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case BuildModelPackage.BUILDPRODUCT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case BuildModelPackage.BUILDPRODUCT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case BuildModelPackage.BUILDPRODUCT_BUILDRELATION_FEATURE_ID:
        return getTarget().getBuildRelation();
      case BuildModelPackage.BUILDPRODUCT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case BuildModelPackage.BUILDPRODUCT_GROUPEDBUILD_FEATURE_ID:
        return getTarget().getGroupedBuild();
      case BuildModelPackage.BUILDPRODUCT_BUILDELEMENT_FEATURE_ID:
        return getTarget().getBuildElement();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>DescribedBy</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class DescribedByModelObject<E extends DescribedBy> extends AbstractBuildRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return BuildModelPackage.INSTANCE.getDescribedByEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return BuildModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.DESCRIBEDBY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case BuildModelPackage.DESCRIBEDBY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case BuildModelPackage.DESCRIBEDBY_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case BuildModelPackage.DESCRIBEDBY_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case BuildModelPackage.DESCRIBEDBY_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case BuildModelPackage.DESCRIBEDBY_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case BuildModelPackage.DESCRIBEDBY_TO_FEATURE_ID:
        return getTarget().getTo();
      case BuildModelPackage.DESCRIBEDBY_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case BuildModelPackage.DESCRIBEDBY_TO_FEATURE_ID:
        getTarget().setTo((BuildDescription) value);
        return;
      case BuildModelPackage.DESCRIBEDBY_FROM_FEATURE_ID:
        getTarget().setFrom((BuildStep) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }
}