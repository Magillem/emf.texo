package org.eclipse.emf.texo.test.model.samples.extendedpo2;

import java.util.Date;
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
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: epo2. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Epo2ModelFactory implements ModelFactory {

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
    case Epo2ModelPackage.ITEM_CLASSIFIER_ID:
      return createItem();
    case Epo2ModelPackage.PURCHASEORDER_CLASSIFIER_ID:
      return createPurchaseOrder();
    case Epo2ModelPackage.USADDRESS_CLASSIFIER_ID:
      return createUSAddress();
    case Epo2ModelPackage.CUSTOMER_CLASSIFIER_ID:
      return createCustomer();
    case Epo2ModelPackage.SUPPLIER_CLASSIFIER_ID:
      return createSupplier();
    case Epo2ModelPackage.GLOBALADDRESS_CLASSIFIER_ID:
      return createGlobalAddress();
    case Epo2ModelPackage.GLOBALLOCATION_CLASSIFIER_ID:
      return createGlobalLocation();
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
    case Epo2ModelPackage.ITEM_CLASSIFIER_ID:
      modelObject = new ItemModelObject();
      break;
    case Epo2ModelPackage.PURCHASEORDER_CLASSIFIER_ID:
      modelObject = new PurchaseOrderModelObject();
      break;
    case Epo2ModelPackage.USADDRESS_CLASSIFIER_ID:
      modelObject = new USAddressModelObject();
      break;
    case Epo2ModelPackage.ADDRESS_CLASSIFIER_ID:
      modelObject = new AddressModelObject();
      break;
    case Epo2ModelPackage.CUSTOMER_CLASSIFIER_ID:
      modelObject = new CustomerModelObject();
      break;
    case Epo2ModelPackage.SUPPLIER_CLASSIFIER_ID:
      modelObject = new SupplierModelObject();
      break;
    case Epo2ModelPackage.GLOBALADDRESS_CLASSIFIER_ID:
      modelObject = new GlobalAddressModelObject();
      break;
    case Epo2ModelPackage.GLOBALLOCATION_CLASSIFIER_ID:
      modelObject = new GlobalLocationModelObject();
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
   * @return an instance of the model object representing the EClass Item
   * @generated
   */
  public Item createItem() {
    return new Item();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PurchaseOrder
   * @generated
   */
  public PurchaseOrder createPurchaseOrder() {
    return new PurchaseOrder();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass USAddress
   * @generated
   */
  public USAddress createUSAddress() {
    return new USAddress();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Customer
   * @generated
   */
  public Customer createCustomer() {
    return new Customer();
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
   * @return an instance of the model object representing the EClass GlobalAddress
   * @generated
   */
  public GlobalAddress createGlobalAddress() {
    return new GlobalAddress();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass GlobalLocation
   * @generated
   */
  public GlobalLocation createGlobalLocation() {
    return new GlobalLocation();
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
    case Epo2ModelPackage.DATE_CLASSIFIER_ID:
      return createDateFromString(value);
    case Epo2ModelPackage.SKU_CLASSIFIER_ID:
      return createSKUFromString(value);
    case Epo2ModelPackage.ORDERSTATUS_CLASSIFIER_ID:
      return createOrderStatusFromString(value);
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
    case Epo2ModelPackage.DATE_CLASSIFIER_ID:
      return convertDateToString((Date) value);
    case Epo2ModelPackage.SKU_CLASSIFIER_ID:
      return convertSKUToString((String) value);
    case Epo2ModelPackage.ORDERSTATUS_CLASSIFIER_ID:
      return convertOrderStatusToString((OrderStatus) value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * Converts the EDataType: Date to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertDateToString(Date value) {
    if (value == null) {
      return null;
    }
    return ModelUtils.convertToXML(value);
  }

  /**
   * Creates an instance of the EDataType: Date from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public Date createDateFromString(String value) {
    if (value == null) {
      return null;
    }
    return ModelUtils.createFromXML(value);
  }

  /**
   * Converts the EDataType: SKU to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertSKUToString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Creates an instance of the EDataType: SKU from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public String createSKUFromString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Converts the EDataType: OrderStatus to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertOrderStatusToString(OrderStatus value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: OrderStatus from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public OrderStatus createOrderStatusFromString(String value) {
    if (value == null) {
      return null;
    }
    return OrderStatus.get(value);
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Item</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class ItemModelObject<E extends Item> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return Epo2ModelPackage.INSTANCE.getItemEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return Epo2ModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return Item.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case Epo2ModelPackage.ITEM_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case Epo2ModelPackage.ITEM_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case Epo2ModelPackage.ITEM_ORDER_FEATURE_ID:
        return getTarget().getOrder();
      case Epo2ModelPackage.ITEM_PRODUCTNAME_FEATURE_ID:
        return getTarget().getProductName();
      case Epo2ModelPackage.ITEM_QUANTITY_FEATURE_ID:
        return getTarget().getQuantity();
      case Epo2ModelPackage.ITEM_USPRICE_FEATURE_ID:
        return getTarget().getUSPrice();
      case Epo2ModelPackage.ITEM_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case Epo2ModelPackage.ITEM_SHIPDATE_FEATURE_ID:
        return getTarget().getShipDate();
      case Epo2ModelPackage.ITEM_PARTNUM_FEATURE_ID:
        return getTarget().getPartNum();
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
      case Epo2ModelPackage.ITEM_ORDER_FEATURE_ID:
        getTarget().setOrder((PurchaseOrder) value);
        return;
      case Epo2ModelPackage.ITEM_PRODUCTNAME_FEATURE_ID:
        getTarget().setProductName((String) value);
        return;
      case Epo2ModelPackage.ITEM_QUANTITY_FEATURE_ID:
        getTarget().setQuantity((Integer) value);
        return;
      case Epo2ModelPackage.ITEM_USPRICE_FEATURE_ID:
        getTarget().setUSPrice((Integer) value);
        return;
      case Epo2ModelPackage.ITEM_COMMENT_FEATURE_ID:
        getTarget().setComment((String) value);
        return;
      case Epo2ModelPackage.ITEM_SHIPDATE_FEATURE_ID:
        getTarget().setShipDate((Date) value);
        return;
      case Epo2ModelPackage.ITEM_PARTNUM_FEATURE_ID:
        getTarget().setPartNum((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>PurchaseOrder</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class PurchaseOrderModelObject<E extends PurchaseOrder> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return Epo2ModelPackage.INSTANCE.getPurchaseOrderEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return Epo2ModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return PurchaseOrder.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case Epo2ModelPackage.PURCHASEORDER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case Epo2ModelPackage.PURCHASEORDER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case Epo2ModelPackage.PURCHASEORDER_ITEMS_FEATURE_ID:
        return getTarget().getItems();
      case Epo2ModelPackage.PURCHASEORDER_BILLTO_FEATURE_ID:
        return getTarget().getBillTo();
      case Epo2ModelPackage.PURCHASEORDER_SHIPTO_FEATURE_ID:
        return getTarget().getShipTo();
      case Epo2ModelPackage.PURCHASEORDER_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case Epo2ModelPackage.PURCHASEORDER_ORDERDATE_FEATURE_ID:
        return getTarget().getOrderDate();
      case Epo2ModelPackage.PURCHASEORDER_STATUS_FEATURE_ID:
        return getTarget().getStatus();
      case Epo2ModelPackage.PURCHASEORDER_TOTALAMOUNT_FEATURE_ID:
        return getTarget().getTotalAmount();
      case Epo2ModelPackage.PURCHASEORDER_CUSTOMER_FEATURE_ID:
        return getTarget().getCustomer();
      case Epo2ModelPackage.PURCHASEORDER_PREVIOUSORDER_FEATURE_ID:
        return getTarget().getPreviousOrder();
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
      case Epo2ModelPackage.PURCHASEORDER_ITEMS_FEATURE_ID:
        getTarget().setItems((List<Item>) value);
        return;
      case Epo2ModelPackage.PURCHASEORDER_BILLTO_FEATURE_ID:
        getTarget().setBillTo((Address) value);
        return;
      case Epo2ModelPackage.PURCHASEORDER_SHIPTO_FEATURE_ID:
        getTarget().setShipTo((Address) value);
        return;
      case Epo2ModelPackage.PURCHASEORDER_COMMENT_FEATURE_ID:
        getTarget().setComment((String) value);
        return;
      case Epo2ModelPackage.PURCHASEORDER_ORDERDATE_FEATURE_ID:
        getTarget().setOrderDate((Date) value);
        return;
      case Epo2ModelPackage.PURCHASEORDER_STATUS_FEATURE_ID:
        getTarget().setStatus((OrderStatus) value);
        return;
      case Epo2ModelPackage.PURCHASEORDER_CUSTOMER_FEATURE_ID:
        getTarget().setCustomer((Customer) value);
        return;
      case Epo2ModelPackage.PURCHASEORDER_PREVIOUSORDER_FEATURE_ID:
        getTarget().setPreviousOrder((PurchaseOrder) value);
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

      case Epo2ModelPackage.PURCHASEORDER_ITEMS_FEATURE_ID:
        return getTarget().addToItems((Item) value);

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

      case Epo2ModelPackage.PURCHASEORDER_ITEMS_FEATURE_ID:
        return getTarget().removeFromItems((Item) value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>USAddress</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class USAddressModelObject<E extends USAddress> extends AddressModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return Epo2ModelPackage.INSTANCE.getUSAddressEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return Epo2ModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return USAddress.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case Epo2ModelPackage.USADDRESS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case Epo2ModelPackage.USADDRESS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case Epo2ModelPackage.USADDRESS_NAME_FEATURE_ID:
        return getTarget().getName();
      case Epo2ModelPackage.USADDRESS_COUNTRY_FEATURE_ID:
        return getTarget().getCountry();
      case Epo2ModelPackage.USADDRESS_STREET_FEATURE_ID:
        return getTarget().getStreet();
      case Epo2ModelPackage.USADDRESS_CITY_FEATURE_ID:
        return getTarget().getCity();
      case Epo2ModelPackage.USADDRESS_STATE_FEATURE_ID:
        return getTarget().getState();
      case Epo2ModelPackage.USADDRESS_ZIP_FEATURE_ID:
        return getTarget().getZip();
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
      case Epo2ModelPackage.USADDRESS_STREET_FEATURE_ID:
        getTarget().setStreet((String) value);
        return;
      case Epo2ModelPackage.USADDRESS_CITY_FEATURE_ID:
        getTarget().setCity((String) value);
        return;
      case Epo2ModelPackage.USADDRESS_STATE_FEATURE_ID:
        getTarget().setState((String) value);
        return;
      case Epo2ModelPackage.USADDRESS_ZIP_FEATURE_ID:
        getTarget().setZip((Integer) value);
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
   * The adapter/wrapper for the EClass '<em><b>Address</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class AddressModelObject<E extends Address> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return Epo2ModelPackage.INSTANCE.getAddressEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return Epo2ModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return Address.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case Epo2ModelPackage.ADDRESS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case Epo2ModelPackage.ADDRESS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case Epo2ModelPackage.ADDRESS_NAME_FEATURE_ID:
        return getTarget().getName();
      case Epo2ModelPackage.ADDRESS_COUNTRY_FEATURE_ID:
        return getTarget().getCountry();
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
      case Epo2ModelPackage.ADDRESS_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case Epo2ModelPackage.ADDRESS_COUNTRY_FEATURE_ID:
        getTarget().setCountry((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Customer</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class CustomerModelObject<E extends Customer> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return Epo2ModelPackage.INSTANCE.getCustomerEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return Epo2ModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return Customer.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case Epo2ModelPackage.CUSTOMER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case Epo2ModelPackage.CUSTOMER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case Epo2ModelPackage.CUSTOMER_CUSTOMERID_FEATURE_ID:
        return getTarget().getCustomerID();
      case Epo2ModelPackage.CUSTOMER_ORDERS_FEATURE_ID:
        return getTarget().getOrders();
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
      case Epo2ModelPackage.CUSTOMER_CUSTOMERID_FEATURE_ID:
        getTarget().setCustomerID((Integer) value);
        return;
      case Epo2ModelPackage.CUSTOMER_ORDERS_FEATURE_ID:
        getTarget().setOrders((List<PurchaseOrder>) value);
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

      case Epo2ModelPackage.CUSTOMER_ORDERS_FEATURE_ID:
        return getTarget().addToOrders((PurchaseOrder) value);
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

      case Epo2ModelPackage.CUSTOMER_ORDERS_FEATURE_ID:
        return getTarget().removeFromOrders((PurchaseOrder) value);
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
  public static class SupplierModelObject<E extends Supplier> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return Epo2ModelPackage.INSTANCE.getSupplierEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return Epo2ModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return Supplier.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case Epo2ModelPackage.SUPPLIER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case Epo2ModelPackage.SUPPLIER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case Epo2ModelPackage.SUPPLIER_NAME_FEATURE_ID:
        return getTarget().getName();
      case Epo2ModelPackage.SUPPLIER_CUSTOMERS_FEATURE_ID:
        return getTarget().getCustomers();
      case Epo2ModelPackage.SUPPLIER_ORDERS_FEATURE_ID:
        return getTarget().getOrders();
      case Epo2ModelPackage.SUPPLIER_PENDINGORDERS_FEATURE_ID:
        return getTarget().getPendingOrders();
      case Epo2ModelPackage.SUPPLIER_SHIPPEDORDERS_FEATURE_ID:
        return getTarget().getShippedOrders();
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
      case Epo2ModelPackage.SUPPLIER_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case Epo2ModelPackage.SUPPLIER_CUSTOMERS_FEATURE_ID:
        getTarget().setCustomers((List<Customer>) value);
        return;
      case Epo2ModelPackage.SUPPLIER_ORDERS_FEATURE_ID:
        getTarget().setOrders((List<PurchaseOrder>) value);
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

      case Epo2ModelPackage.SUPPLIER_CUSTOMERS_FEATURE_ID:
        return getTarget().getCustomers().add((Customer) value);

      case Epo2ModelPackage.SUPPLIER_ORDERS_FEATURE_ID:
        return getTarget().getOrders().add((PurchaseOrder) value);

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

      case Epo2ModelPackage.SUPPLIER_CUSTOMERS_FEATURE_ID:
        return getTarget().getCustomers().remove(value);

      case Epo2ModelPackage.SUPPLIER_ORDERS_FEATURE_ID:
        return getTarget().getOrders().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>GlobalAddress</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class GlobalAddressModelObject<E extends GlobalAddress> extends AddressModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return Epo2ModelPackage.INSTANCE.getGlobalAddressEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return Epo2ModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return GlobalAddress.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case Epo2ModelPackage.GLOBALADDRESS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case Epo2ModelPackage.GLOBALADDRESS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case Epo2ModelPackage.GLOBALADDRESS_NAME_FEATURE_ID:
        return getTarget().getName();
      case Epo2ModelPackage.GLOBALADDRESS_COUNTRY_FEATURE_ID:
        return getTarget().getCountry();
      case Epo2ModelPackage.GLOBALADDRESS_LOCATION_FEATURE_ID:
        return getTarget().getLocation();
      case Epo2ModelPackage.GLOBALADDRESS_COUNTRYCODE_FEATURE_ID:
        return getTarget().getCountryCode();
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
      case Epo2ModelPackage.GLOBALADDRESS_LOCATION_FEATURE_ID:
        getTarget().setLocation((List<String>) value);
        return;
      case Epo2ModelPackage.GLOBALADDRESS_COUNTRYCODE_FEATURE_ID:
        getTarget().setCountryCode((Integer) value);
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

      case Epo2ModelPackage.GLOBALADDRESS_LOCATION_FEATURE_ID:
        return getTarget().getLocation().add((String) value);

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

      case Epo2ModelPackage.GLOBALADDRESS_LOCATION_FEATURE_ID:
        return getTarget().getLocation().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>GlobalLocation</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class GlobalLocationModelObject<E extends GlobalLocation> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return Epo2ModelPackage.INSTANCE.getGlobalLocationEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return Epo2ModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return GlobalLocation.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case Epo2ModelPackage.GLOBALLOCATION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case Epo2ModelPackage.GLOBALLOCATION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case Epo2ModelPackage.GLOBALLOCATION_COUNTRYCODE_FEATURE_ID:
        return getTarget().getCountryCode();
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
      case Epo2ModelPackage.GLOBALLOCATION_COUNTRYCODE_FEATURE_ID:
        getTarget().setCountryCode((Integer) value);
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