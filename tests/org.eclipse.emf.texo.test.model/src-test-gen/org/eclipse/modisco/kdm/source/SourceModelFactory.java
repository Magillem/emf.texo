package org.eclipse.modisco.kdm.source;

import java.util.List;
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

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: source. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SourceModelFactory implements ModelFactory {

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
    case SourceModelPackage.INVENTORYMODEL_CLASSIFIER_ID:
      return createInventoryModel();
    case SourceModelPackage.INVENTORYITEM_CLASSIFIER_ID:
      return createInventoryItem();
    case SourceModelPackage.SOURCEFILE_CLASSIFIER_ID:
      return createSourceFile();
    case SourceModelPackage.IMAGE_CLASSIFIER_ID:
      return createImage();
    case SourceModelPackage.CONFIGURATION_CLASSIFIER_ID:
      return createConfiguration();
    case SourceModelPackage.RESOURCEDESCRIPTION_CLASSIFIER_ID:
      return createResourceDescription();
    case SourceModelPackage.BINARYFILE_CLASSIFIER_ID:
      return createBinaryFile();
    case SourceModelPackage.EXECUTABLEFILE_CLASSIFIER_ID:
      return createExecutableFile();
    case SourceModelPackage.INVENTORYCONTAINER_CLASSIFIER_ID:
      return createInventoryContainer();
    case SourceModelPackage.DIRECTORY_CLASSIFIER_ID:
      return createDirectory();
    case SourceModelPackage.PROJECT_CLASSIFIER_ID:
      return createProject();
    case SourceModelPackage.DEPENDSON_CLASSIFIER_ID:
      return createDependsOn();
    case SourceModelPackage.SOURCEREF_CLASSIFIER_ID:
      return createSourceRef();
    case SourceModelPackage.SOURCEREGION_CLASSIFIER_ID:
      return createSourceRegion();
    case SourceModelPackage.INVENTORYELEMENT_CLASSIFIER_ID:
      return createInventoryElement();
    case SourceModelPackage.INVENTORYRELATIONSHIP_CLASSIFIER_ID:
      return createInventoryRelationship();
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
    case SourceModelPackage.INVENTORYMODEL_CLASSIFIER_ID:
      modelObject = new InventoryModelModelObject();
      break;
    case SourceModelPackage.ABSTRACTINVENTORYELEMENT_CLASSIFIER_ID:
      modelObject = new AbstractInventoryElementModelObject();
      break;
    case SourceModelPackage.ABSTRACTINVENTORYRELATIONSHIP_CLASSIFIER_ID:
      modelObject = new AbstractInventoryRelationshipModelObject();
      break;
    case SourceModelPackage.INVENTORYITEM_CLASSIFIER_ID:
      modelObject = new InventoryItemModelObject();
      break;
    case SourceModelPackage.SOURCEFILE_CLASSIFIER_ID:
      modelObject = new SourceFileModelObject();
      break;
    case SourceModelPackage.IMAGE_CLASSIFIER_ID:
      modelObject = new ImageModelObject();
      break;
    case SourceModelPackage.CONFIGURATION_CLASSIFIER_ID:
      modelObject = new ConfigurationModelObject();
      break;
    case SourceModelPackage.RESOURCEDESCRIPTION_CLASSIFIER_ID:
      modelObject = new ResourceDescriptionModelObject();
      break;
    case SourceModelPackage.BINARYFILE_CLASSIFIER_ID:
      modelObject = new BinaryFileModelObject();
      break;
    case SourceModelPackage.EXECUTABLEFILE_CLASSIFIER_ID:
      modelObject = new ExecutableFileModelObject();
      break;
    case SourceModelPackage.INVENTORYCONTAINER_CLASSIFIER_ID:
      modelObject = new InventoryContainerModelObject();
      break;
    case SourceModelPackage.DIRECTORY_CLASSIFIER_ID:
      modelObject = new DirectoryModelObject();
      break;
    case SourceModelPackage.PROJECT_CLASSIFIER_ID:
      modelObject = new ProjectModelObject();
      break;
    case SourceModelPackage.DEPENDSON_CLASSIFIER_ID:
      modelObject = new DependsOnModelObject();
      break;
    case SourceModelPackage.SOURCEREF_CLASSIFIER_ID:
      modelObject = new SourceRefModelObject();
      break;
    case SourceModelPackage.SOURCEREGION_CLASSIFIER_ID:
      modelObject = new SourceRegionModelObject();
      break;
    case SourceModelPackage.INVENTORYELEMENT_CLASSIFIER_ID:
      modelObject = new InventoryElementModelObject();
      break;
    case SourceModelPackage.INVENTORYRELATIONSHIP_CLASSIFIER_ID:
      modelObject = new InventoryRelationshipModelObject();
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
   * @return an instance of the model object representing the EClass InventoryModel
   * @generated
   */
  public InventoryModel createInventoryModel() {
    return new InventoryModel();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass InventoryItem
   * @generated
   */
  public InventoryItem createInventoryItem() {
    return new InventoryItem();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SourceFile
   * @generated
   */
  public SourceFile createSourceFile() {
    return new SourceFile();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Image
   * @generated
   */
  public Image createImage() {
    return new Image();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Configuration
   * @generated
   */
  public Configuration createConfiguration() {
    return new Configuration();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ResourceDescription
   * @generated
   */
  public ResourceDescription createResourceDescription() {
    return new ResourceDescription();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BinaryFile
   * @generated
   */
  public BinaryFile createBinaryFile() {
    return new BinaryFile();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ExecutableFile
   * @generated
   */
  public ExecutableFile createExecutableFile() {
    return new ExecutableFile();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass InventoryContainer
   * @generated
   */
  public InventoryContainer createInventoryContainer() {
    return new InventoryContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Directory
   * @generated
   */
  public Directory createDirectory() {
    return new Directory();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Project
   * @generated
   */
  public Project createProject() {
    return new Project();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DependsOn
   * @generated
   */
  public DependsOn createDependsOn() {
    return new DependsOn();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SourceRef
   * @generated
   */
  public SourceRef createSourceRef() {
    return new SourceRef();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SourceRegion
   * @generated
   */
  public SourceRegion createSourceRegion() {
    return new SourceRegion();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass InventoryElement
   * @generated
   */
  public InventoryElement createInventoryElement() {
    return new InventoryElement();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass InventoryRelationship
   * @generated
   */
  public InventoryRelationship createInventoryRelationship() {
    return new InventoryRelationship();
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
   * The adapter/wrapper for the EClass '<em><b>InventoryModel</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class InventoryModelModelObject<E extends InventoryModel> extends
      KdmModelFactory.KDMModelModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getInventoryModelEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.INVENTORYMODEL_INVENTORYELEMENT_FEATURE_ID:
        return getTarget().getInventoryElement();
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
      case SourceModelPackage.INVENTORYMODEL_INVENTORYELEMENT_FEATURE_ID:
        getTarget().setInventoryElement((Set<AbstractInventoryElement>) value);
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

      case SourceModelPackage.INVENTORYMODEL_INVENTORYELEMENT_FEATURE_ID:
        return getTarget().addToInventoryElement((AbstractInventoryElement) value);
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

      case SourceModelPackage.INVENTORYMODEL_INVENTORYELEMENT_FEATURE_ID:
        return getTarget().removeFromInventoryElement((AbstractInventoryElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractInventoryElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractInventoryElementModelObject<E extends AbstractInventoryElement> extends
      CoreModelFactory.KDMEntityModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getAbstractInventoryElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_INVENTORYRELATIONSHIP_FEATURE_ID:
        return getTarget().getInventoryRelationship();
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
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_INVENTORYRELATIONSHIP_FEATURE_ID:
        getTarget().setInventoryRelationship((Set<AbstractInventoryRelationship>) value);
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

      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_INVENTORYRELATIONSHIP_FEATURE_ID:
        return getTarget().addToInventoryRelationship((AbstractInventoryRelationship) value);
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

      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_INVENTORYRELATIONSHIP_FEATURE_ID:
        return getTarget().removeFromInventoryRelationship((AbstractInventoryRelationship) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractInventoryRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractInventoryRelationshipModelObject<E extends AbstractInventoryRelationship> extends
      CoreModelFactory.KDMRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getAbstractInventoryRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
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
   * The adapter/wrapper for the EClass '<em><b>InventoryItem</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class InventoryItemModelObject<E extends InventoryItem> extends AbstractInventoryElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getInventoryItemEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.INVENTORYITEM_VERSION_FEATURE_ID:
        return getTarget().getVersion();
      case SourceModelPackage.INVENTORYITEM_PATH_FEATURE_ID:
        return getTarget().getPath();
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
      case SourceModelPackage.INVENTORYITEM_VERSION_FEATURE_ID:
        getTarget().setVersion((String) value);
        return;
      case SourceModelPackage.INVENTORYITEM_PATH_FEATURE_ID:
        getTarget().setPath((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>SourceFile</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SourceFileModelObject<E extends SourceFile> extends InventoryItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getSourceFileEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.SOURCEFILE_LANGUAGE_FEATURE_ID:
        return getTarget().getLanguage();
      case SourceModelPackage.SOURCEFILE_ENCODING_FEATURE_ID:
        return getTarget().getEncoding();
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
      case SourceModelPackage.SOURCEFILE_LANGUAGE_FEATURE_ID:
        getTarget().setLanguage((String) value);
        return;
      case SourceModelPackage.SOURCEFILE_ENCODING_FEATURE_ID:
        getTarget().setEncoding((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Image</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ImageModelObject<E extends Image> extends InventoryItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getImageEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
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
   * The adapter/wrapper for the EClass '<em><b>Configuration</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ConfigurationModelObject<E extends Configuration> extends InventoryItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getConfigurationEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
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
   * The adapter/wrapper for the EClass '<em><b>ResourceDescription</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ResourceDescriptionModelObject<E extends ResourceDescription> extends InventoryItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getResourceDescriptionEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
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
   * The adapter/wrapper for the EClass '<em><b>BinaryFile</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BinaryFileModelObject<E extends BinaryFile> extends InventoryItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getBinaryFileEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
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
   * The adapter/wrapper for the EClass '<em><b>ExecutableFile</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ExecutableFileModelObject<E extends ExecutableFile> extends InventoryItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getExecutableFileEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
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
   * The adapter/wrapper for the EClass '<em><b>InventoryContainer</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class InventoryContainerModelObject<E extends InventoryContainer> extends
      AbstractInventoryElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getInventoryContainerEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.INVENTORYCONTAINER_INVENTORYELEMENT_FEATURE_ID:
        return getTarget().getInventoryElement();
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
      case SourceModelPackage.INVENTORYCONTAINER_INVENTORYELEMENT_FEATURE_ID:
        getTarget().setInventoryElement((Set<AbstractInventoryElement>) value);
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

      case SourceModelPackage.INVENTORYCONTAINER_INVENTORYELEMENT_FEATURE_ID:
        return getTarget().addToInventoryElement((AbstractInventoryElement) value);
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

      case SourceModelPackage.INVENTORYCONTAINER_INVENTORYELEMENT_FEATURE_ID:
        return getTarget().removeFromInventoryElement((AbstractInventoryElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Directory</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DirectoryModelObject<E extends Directory> extends InventoryContainerModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getDirectoryEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.DIRECTORY_PATH_FEATURE_ID:
        return getTarget().getPath();
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
      case SourceModelPackage.DIRECTORY_PATH_FEATURE_ID:
        getTarget().setPath((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Project</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ProjectModelObject<E extends Project> extends InventoryContainerModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getProjectEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
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
   * The adapter/wrapper for the EClass '<em><b>DependsOn</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DependsOnModelObject<E extends DependsOn> extends AbstractInventoryRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getDependsOnEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.DEPENDSON_TO_FEATURE_ID:
        return getTarget().getTo();
      case SourceModelPackage.DEPENDSON_FROM_FEATURE_ID:
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
      case SourceModelPackage.DEPENDSON_TO_FEATURE_ID:
        getTarget().setTo((AbstractInventoryElement) value);
        return;
      case SourceModelPackage.DEPENDSON_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractInventoryElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>SourceRef</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SourceRefModelObject<E extends SourceRef> extends CoreModelFactory.ElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getSourceRefEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.SOURCEREF_REGION_FEATURE_ID:
        return getTarget().getRegion();
      case SourceModelPackage.SOURCEREF_LANGUAGE_FEATURE_ID:
        return getTarget().getLanguage();
      case SourceModelPackage.SOURCEREF_SNIPPET_FEATURE_ID:
        return getTarget().getSnippet();
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
      case SourceModelPackage.SOURCEREF_REGION_FEATURE_ID:
        getTarget().setRegion((List<SourceRegion>) value);
        return;
      case SourceModelPackage.SOURCEREF_LANGUAGE_FEATURE_ID:
        getTarget().setLanguage((String) value);
        return;
      case SourceModelPackage.SOURCEREF_SNIPPET_FEATURE_ID:
        getTarget().setSnippet((String) value);
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

      case SourceModelPackage.SOURCEREF_REGION_FEATURE_ID:
        return getTarget().addToRegion((SourceRegion) value);

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

      case SourceModelPackage.SOURCEREF_REGION_FEATURE_ID:
        return getTarget().removeFromRegion((SourceRegion) value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>SourceRegion</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SourceRegionModelObject<E extends SourceRegion> extends CoreModelFactory.ElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getSourceRegionEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.SOURCEREGION_FILE_FEATURE_ID:
        return getTarget().getFile();
      case SourceModelPackage.SOURCEREGION_STARTLINE_FEATURE_ID:
        return getTarget().getStartLine();
      case SourceModelPackage.SOURCEREGION_STARTPOSITION_FEATURE_ID:
        return getTarget().getStartPosition();
      case SourceModelPackage.SOURCEREGION_ENDLINE_FEATURE_ID:
        return getTarget().getEndLine();
      case SourceModelPackage.SOURCEREGION_ENDPOSITION_FEATURE_ID:
        return getTarget().getEndPosition();
      case SourceModelPackage.SOURCEREGION_LANGUAGE_FEATURE_ID:
        return getTarget().getLanguage();
      case SourceModelPackage.SOURCEREGION_PATH_FEATURE_ID:
        return getTarget().getPath();
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
      case SourceModelPackage.SOURCEREGION_FILE_FEATURE_ID:
        getTarget().setFile((SourceFile) value);
        return;
      case SourceModelPackage.SOURCEREGION_STARTLINE_FEATURE_ID:
        getTarget().setStartLine((Integer) value);
        return;
      case SourceModelPackage.SOURCEREGION_STARTPOSITION_FEATURE_ID:
        getTarget().setStartPosition((Integer) value);
        return;
      case SourceModelPackage.SOURCEREGION_ENDLINE_FEATURE_ID:
        getTarget().setEndLine((Integer) value);
        return;
      case SourceModelPackage.SOURCEREGION_ENDPOSITION_FEATURE_ID:
        getTarget().setEndPosition((Integer) value);
        return;
      case SourceModelPackage.SOURCEREGION_LANGUAGE_FEATURE_ID:
        getTarget().setLanguage((String) value);
        return;
      case SourceModelPackage.SOURCEREGION_PATH_FEATURE_ID:
        getTarget().setPath((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>InventoryElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class InventoryElementModelObject<E extends InventoryElement> extends
      AbstractInventoryElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getInventoryElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
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
   * The adapter/wrapper for the EClass '<em><b>InventoryRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class InventoryRelationshipModelObject<E extends InventoryRelationship> extends
      AbstractInventoryRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getInventoryRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.INVENTORYRELATIONSHIP_TO_FEATURE_ID:
        return getTarget().getTo();
      case SourceModelPackage.INVENTORYRELATIONSHIP_FROM_FEATURE_ID:
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
      case SourceModelPackage.INVENTORYRELATIONSHIP_TO_FEATURE_ID:
        getTarget().setTo((KDMEntity) value);
        return;
      case SourceModelPackage.INVENTORYRELATIONSHIP_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractInventoryElement) value);
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