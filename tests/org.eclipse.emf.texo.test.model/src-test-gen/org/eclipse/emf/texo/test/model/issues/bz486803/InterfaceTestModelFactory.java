package org.eclipse.emf.texo.test.model.issues.bz486803;

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
 * The <b>{@link ModelFactory}</b> for the types of this model: InterfaceTest. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class InterfaceTestModelFactory implements ModelFactory {

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
    case InterfaceTestModelPackage.CLZONE_CLASSIFIER_ID:
      return createClzOne();
    default:
      throw new IllegalArgumentException(
          "The EClass '" + eClass.getName() + "' is not a valid EClass for this EPackage");
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
    case InterfaceTestModelPackage.INTERFACEONET_CLASSIFIER_ID:
      modelObject = new InterfaceOneTModelObject();
      break;
    case InterfaceTestModelPackage.INTERFACETHREET_CLASSIFIER_ID:
      modelObject = new InterfaceThreeTModelObject();
      break;
    case InterfaceTestModelPackage.INTERFACETWOT_CLASSIFIER_ID:
      modelObject = new InterfaceTwoTModelObject();
      break;
    case InterfaceTestModelPackage.CLZONE_CLASSIFIER_ID:
      modelObject = new ClzOneModelObject();
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
    throw new IllegalArgumentException(
        "The EStructuralFeature '" + eFeature + "' is not a valid feature map in this EPackage");
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
    throw new IllegalArgumentException(
        "The EStructuralFeature '" + eFeature + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ClzOne
   * @generated
   */
  public ClzOne createClzOne() {
    return new ClzOne();
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
   * The adapter/wrapper for the EClass '<em><b>InterfaceOneT</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class InterfaceOneTModelObject<E extends InterfaceOneT> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return InterfaceTestModelPackage.INSTANCE.getInterfaceOneTEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return InterfaceTestModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return InterfaceOneT.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case InterfaceTestModelPackage.INTERFACEONET_NAME_FEATURE_ID:
        return getTarget().getName();
      case InterfaceTestModelPackage.INTERFACEONET_THIRDNAME_FEATURE_ID:
        return getTarget().getThirdName();
      case InterfaceTestModelPackage.INTERFACEONET_SECONDNAME_FEATURE_ID:
        return getTarget().getSecondName();
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
      case InterfaceTestModelPackage.INTERFACEONET_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case InterfaceTestModelPackage.INTERFACEONET_THIRDNAME_FEATURE_ID:
        getTarget().setThirdName((String) value);
        return;
      case InterfaceTestModelPackage.INTERFACEONET_SECONDNAME_FEATURE_ID:
        getTarget().setSecondName((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>InterfaceThreeT</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class InterfaceThreeTModelObject<E extends InterfaceThreeT> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return InterfaceTestModelPackage.INSTANCE.getInterfaceThreeTEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return InterfaceTestModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return InterfaceThreeT.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case InterfaceTestModelPackage.INTERFACETHREET_THIRDNAME_FEATURE_ID:
        return getTarget().getThirdName();
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
      case InterfaceTestModelPackage.INTERFACETHREET_THIRDNAME_FEATURE_ID:
        getTarget().setThirdName((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>InterfaceTwoT</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class InterfaceTwoTModelObject<E extends InterfaceTwoT> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return InterfaceTestModelPackage.INSTANCE.getInterfaceTwoTEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return InterfaceTestModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return InterfaceTwoT.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case InterfaceTestModelPackage.INTERFACETWOT_SECONDNAME_FEATURE_ID:
        return getTarget().getSecondName();
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
      case InterfaceTestModelPackage.INTERFACETWOT_SECONDNAME_FEATURE_ID:
        getTarget().setSecondName((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>ClzOne</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class ClzOneModelObject<E extends ClzOne> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return InterfaceTestModelPackage.INSTANCE.getClzOneEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return InterfaceTestModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return ClzOne.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case InterfaceTestModelPackage.CLZONE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case InterfaceTestModelPackage.CLZONE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case InterfaceTestModelPackage.CLZONE_THIRDNAME_FEATURE_ID:
        return getTarget().getThirdName();
      case InterfaceTestModelPackage.CLZONE_SECONDNAME_FEATURE_ID:
        return getTarget().getSecondName();
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
      case InterfaceTestModelPackage.CLZONE_THIRDNAME_FEATURE_ID:
        getTarget().setThirdName((String) value);
        return;
      case InterfaceTestModelPackage.CLZONE_SECONDNAME_FEATURE_ID:
        getTarget().setSecondName((String) value);
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