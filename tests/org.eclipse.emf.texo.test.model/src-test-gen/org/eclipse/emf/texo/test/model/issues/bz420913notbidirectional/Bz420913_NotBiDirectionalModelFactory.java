package org.eclipse.emf.texo.test.model.issues.bz420913notbidirectional;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: bz420913_NotBiDirectional. It contains code to create
 * instances {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their
 * String (XML) representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Bz420913_NotBiDirectionalModelFactory implements ModelFactory {

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
    case Bz420913_NotBiDirectionalModelPackage.BZ420913_NOTBIDIRECTIONAL_O_CLASSIFIER_ID:
      return createBz420913_NotBiDirectional_O();
    case Bz420913_NotBiDirectionalModelPackage.BZ420913_NOTBIDIRECTIONAL_T_CLASSIFIER_ID:
      return createBz420913_NotBiDirectional_T();
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
  public <T> ModelObject<T> createModelObject(EClass eClass, T adaptee) {
    ModelObject<Object> modelObject = null;
    switch (eClass.getClassifierID()) {
    case Bz420913_NotBiDirectionalModelPackage.BZ420913_NOTBIDIRECTIONAL_O_CLASSIFIER_ID:
      modelObject = new Bz420913_NotBiDirectional_OModelObject();
      break;
    case Bz420913_NotBiDirectionalModelPackage.BZ420913_NOTBIDIRECTIONAL_T_CLASSIFIER_ID:
      modelObject = new Bz420913_NotBiDirectional_TModelObject();
      break;
    default:
      throw new IllegalArgumentException("The EClass '" + eClass + "' is not defined in this EPackage");
    }
    modelObject.setTarget(adaptee);
    return (ModelObject<T>) modelObject;
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
   * @return an instance of the model object representing the EClass bz420913_NotBiDirectional_O
   * @generated
   */
  public Bz420913_NotBiDirectional_O createBz420913_NotBiDirectional_O() {
    return new Bz420913_NotBiDirectional_O();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass bz420913_NotBiDirectional_T
   * @generated
   */
  public Bz420913_NotBiDirectional_T createBz420913_NotBiDirectional_T() {
    return new Bz420913_NotBiDirectional_T();
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
   * The adapter/wrapper for the EClass '<em><b>bz420913_NotBiDirectional_O</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class Bz420913_NotBiDirectional_OModelObject<E extends Bz420913_NotBiDirectional_O> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return Bz420913_NotBiDirectionalModelPackage.INSTANCE.getBz420913_NotBiDirectional_OEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return Bz420913_NotBiDirectionalModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    public Class<?> getTargetClass() {
      return Bz420913_NotBiDirectional_O.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case Bz420913_NotBiDirectionalModelPackage.BZ420913_NOTBIDIRECTIONAL_O_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case Bz420913_NotBiDirectionalModelPackage.BZ420913_NOTBIDIRECTIONAL_O_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case Bz420913_NotBiDirectionalModelPackage.BZ420913_NOTBIDIRECTIONAL_O_SINGLEBIDIRECTIONAL_FEATURE_ID:
        return getTarget().getSingleBidirectional();
      case Bz420913_NotBiDirectionalModelPackage.BZ420913_NOTBIDIRECTIONAL_O_MULTIBIDIRECTIONAL_FEATURE_ID:
        return getTarget().getMultiBidirectional();
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
      case Bz420913_NotBiDirectionalModelPackage.BZ420913_NOTBIDIRECTIONAL_O_SINGLEBIDIRECTIONAL_FEATURE_ID:
        getTarget().setSingleBidirectional((Bz420913_NotBiDirectional_T) value);
        return;
      case Bz420913_NotBiDirectionalModelPackage.BZ420913_NOTBIDIRECTIONAL_O_MULTIBIDIRECTIONAL_FEATURE_ID:
        getTarget().setMultiBidirectional((List<Bz420913_NotBiDirectional_T>) value);
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

      case Bz420913_NotBiDirectionalModelPackage.BZ420913_NOTBIDIRECTIONAL_O_MULTIBIDIRECTIONAL_FEATURE_ID:
        return getTarget().getMultiBidirectional().add((Bz420913_NotBiDirectional_T) value);
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

      case Bz420913_NotBiDirectionalModelPackage.BZ420913_NOTBIDIRECTIONAL_O_MULTIBIDIRECTIONAL_FEATURE_ID:
        return getTarget().getMultiBidirectional().remove(value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>bz420913_NotBiDirectional_T</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class Bz420913_NotBiDirectional_TModelObject<E extends Bz420913_NotBiDirectional_T> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return Bz420913_NotBiDirectionalModelPackage.INSTANCE.getBz420913_NotBiDirectional_TEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return Bz420913_NotBiDirectionalModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    public Class<?> getTargetClass() {
      return Bz420913_NotBiDirectional_T.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case Bz420913_NotBiDirectionalModelPackage.BZ420913_NOTBIDIRECTIONAL_T_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case Bz420913_NotBiDirectionalModelPackage.BZ420913_NOTBIDIRECTIONAL_T_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case Bz420913_NotBiDirectionalModelPackage.BZ420913_NOTBIDIRECTIONAL_T_SINGLEBIDIRECTIONAL_FEATURE_ID:
        return getTarget().getSingleBidirectional();
      case Bz420913_NotBiDirectionalModelPackage.BZ420913_NOTBIDIRECTIONAL_T_MULTIBIDIRECTIONAL_FEATURE_ID:
        return getTarget().getMultiBidirectional();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case Bz420913_NotBiDirectionalModelPackage.BZ420913_NOTBIDIRECTIONAL_T_SINGLEBIDIRECTIONAL_FEATURE_ID:
        getTarget().setSingleBidirectional((Bz420913_NotBiDirectional_O) value);
        return;
      case Bz420913_NotBiDirectionalModelPackage.BZ420913_NOTBIDIRECTIONAL_T_MULTIBIDIRECTIONAL_FEATURE_ID:
        getTarget().setMultiBidirectional((Bz420913_NotBiDirectional_O) value);
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