package org.eclipse.emf.texo.test.model.issues.bz423155;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.AbstractModelObject;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: Bz423155. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Bz423155ModelFactory implements ModelFactory {

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
    case Bz423155ModelPackage.EMBEDDED423155_CLASSIFIER_ID:
      return createEmbedded423155();
    case Bz423155ModelPackage.MAIN423155_CLASSIFIER_ID:
      return createMain423155();
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
    case Bz423155ModelPackage.EMBEDDED423155_CLASSIFIER_ID:
      modelObject = new Embedded423155ModelObject();
      break;
    case Bz423155ModelPackage.MAIN423155_CLASSIFIER_ID:
      modelObject = new Main423155ModelObject();
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
   * @return an instance of the model object representing the EClass Embedded423155
   * @generated
   */
  public Embedded423155 createEmbedded423155() {
    return new Embedded423155();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Main423155
   * @generated
   */
  public Main423155 createMain423155() {
    return new Main423155();
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
   * The adapter/wrapper for the EClass '<em><b>Embedded423155</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class Embedded423155ModelObject<E extends Embedded423155> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return Bz423155ModelPackage.INSTANCE.getEmbedded423155EClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return Bz423155ModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return Embedded423155.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case Bz423155ModelPackage.EMBEDDED423155_NAME1_FEATURE_ID:
        return getTarget().getName1();
      case Bz423155ModelPackage.EMBEDDED423155_NAME2_FEATURE_ID:
        return getTarget().getName2();
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
      case Bz423155ModelPackage.EMBEDDED423155_NAME1_FEATURE_ID:
        getTarget().setName1((String) value);
        return;
      case Bz423155ModelPackage.EMBEDDED423155_NAME2_FEATURE_ID:
        getTarget().setName2((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Main423155</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class Main423155ModelObject<E extends Main423155> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return Bz423155ModelPackage.INSTANCE.getMain423155EClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return Bz423155ModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return Main423155.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case Bz423155ModelPackage.MAIN423155_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case Bz423155ModelPackage.MAIN423155_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case Bz423155ModelPackage.MAIN423155_EMBEDDED1_FEATURE_ID:
        return getTarget().getEmbedded1();
      case Bz423155ModelPackage.MAIN423155_EMBEDDED2_FEATURE_ID:
        return getTarget().getEmbedded2();
      case Bz423155ModelPackage.MAIN423155_EMBEDDED3_FEATURE_ID:
        return getTarget().getEmbedded3();
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
      case Bz423155ModelPackage.MAIN423155_EMBEDDED1_FEATURE_ID:
        getTarget().setEmbedded1((List<Embedded423155>) value);
        return;
      case Bz423155ModelPackage.MAIN423155_EMBEDDED2_FEATURE_ID:
        getTarget().setEmbedded2((List<Embedded423155>) value);
        return;
      case Bz423155ModelPackage.MAIN423155_EMBEDDED3_FEATURE_ID:
        getTarget().setEmbedded3((List<Embedded423155>) value);
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

      case Bz423155ModelPackage.MAIN423155_EMBEDDED1_FEATURE_ID:
        return getTarget().getEmbedded1().add((Embedded423155) value);

      case Bz423155ModelPackage.MAIN423155_EMBEDDED2_FEATURE_ID:
        return getTarget().getEmbedded2().add((Embedded423155) value);

      case Bz423155ModelPackage.MAIN423155_EMBEDDED3_FEATURE_ID:
        return getTarget().getEmbedded3().add((Embedded423155) value);
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

      case Bz423155ModelPackage.MAIN423155_EMBEDDED1_FEATURE_ID:
        return getTarget().getEmbedded1().remove(value);

      case Bz423155ModelPackage.MAIN423155_EMBEDDED2_FEATURE_ID:
        return getTarget().getEmbedded2().remove(value);

      case Bz423155ModelPackage.MAIN423155_EMBEDDED3_FEATURE_ID:
        return getTarget().getEmbedded3().remove(value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }
}