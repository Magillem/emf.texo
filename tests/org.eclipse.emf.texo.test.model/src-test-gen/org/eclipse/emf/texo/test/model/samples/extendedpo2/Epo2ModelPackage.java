package org.eclipse.emf.texo.test.model.samples.extendedpo2;

import java.util.Date;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.dao.AddressDao;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.dao.CustomerDao;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.dao.GlobalAddressDao;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.dao.GlobalLocationDao;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.dao.ItemDao;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.dao.PurchaseOrderDao;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.dao.SupplierDao;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.dao.USAddressDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>epo2</b></em>'. It contains initialization code and access to the Factory to
 * instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Epo2ModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/extendedpo2";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Epo2ModelFactory MODELFACTORY = new Epo2ModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATE_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SKU_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ORDERSTATUS_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_ORDER_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_PRODUCTNAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_QUANTITY_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_USPRICE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_COMMENT_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_SHIPDATE_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_PARTNUM_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_ITEMS_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_BILLTO_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_SHIPTO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_COMMENT_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_ORDERDATE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_STATUS_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_TOTALAMOUNT_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_CUSTOMER_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_PREVIOUSORDER_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USADDRESS_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USADDRESS_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USADDRESS_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USADDRESS_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USADDRESS_COUNTRY_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USADDRESS_STREET_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USADDRESS_CITY_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USADDRESS_STATE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USADDRESS_ZIP_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_COUNTRY_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CUSTOMER_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CUSTOMER_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CUSTOMER_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CUSTOMER_CUSTOMERID_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CUSTOMER_ORDERS_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIER_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIER_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIER_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIER_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIER_CUSTOMERS_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIER_ORDERS_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIER_PENDINGORDERS_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIER_SHIPPEDORDERS_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GLOBALADDRESS_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GLOBALADDRESS_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GLOBALADDRESS_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GLOBALADDRESS_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GLOBALADDRESS_COUNTRY_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GLOBALADDRESS_LOCATION_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GLOBALADDRESS_COUNTRYCODE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GLOBALLOCATION_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GLOBALLOCATION_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GLOBALLOCATION_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GLOBALLOCATION_COUNTRYCODE_FEATURE_ID = 2;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Epo2ModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static Epo2ModelPackage initialize() {

    if (isInitialized) {
      return (Epo2ModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final Epo2ModelPackage modelPackage = new Epo2ModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(Item.class, modelPackage.getItemEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PurchaseOrder.class, modelPackage.getPurchaseOrderEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(USAddress.class, modelPackage.getUSAddressEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Address.class, modelPackage.getAddressEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Customer.class, modelPackage.getCustomerEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Supplier.class, modelPackage.getSupplierEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(GlobalAddress.class, modelPackage.getGlobalAddressEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(GlobalLocation.class, modelPackage.getGlobalLocationEClass(),
        modelPackage);

    ModelResolver.getInstance().registerClassModelMapping(OrderStatus.class, modelPackage.getOrderStatusEEnum(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(Item.class, ItemDao.class);
    DaoRegistry.getInstance().registerDao(PurchaseOrder.class, PurchaseOrderDao.class);
    DaoRegistry.getInstance().registerDao(USAddress.class, USAddressDao.class);
    DaoRegistry.getInstance().registerDao(Address.class, AddressDao.class);
    DaoRegistry.getInstance().registerDao(Customer.class, CustomerDao.class);
    DaoRegistry.getInstance().registerDao(Supplier.class, SupplierDao.class);
    DaoRegistry.getInstance().registerDao(GlobalAddress.class, GlobalAddressDao.class);
    DaoRegistry.getInstance().registerDao(GlobalLocation.class, GlobalLocationDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link Epo2ModelFactory} instance.
   * @generated
   */
  @Override
  public Epo2ModelFactory getModelFactory() {
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
    return "epo2.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>Item</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Item</b></em>'
   * @generated
   */
  public EClass getItemEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ITEM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Item.order</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Item.order</b></em>'.
   * @generated
   */
  public EReference getItem_Order() {
    return (EReference) getItemEClass().getEAllStructuralFeatures().get(ITEM_ORDER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Item.productName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Item.productName</b></em>'.
   * @generated
   */
  public EAttribute getItem_ProductName() {
    return (EAttribute) getItemEClass().getEAllStructuralFeatures().get(ITEM_PRODUCTNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Item.quantity</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Item.quantity</b></em>'.
   * @generated
   */
  public EAttribute getItem_Quantity() {
    return (EAttribute) getItemEClass().getEAllStructuralFeatures().get(ITEM_QUANTITY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Item.USPrice</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Item.USPrice</b></em>'.
   * @generated
   */
  public EAttribute getItem_USPrice() {
    return (EAttribute) getItemEClass().getEAllStructuralFeatures().get(ITEM_USPRICE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Item.comment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Item.comment</b></em>'.
   * @generated
   */
  public EAttribute getItem_Comment() {
    return (EAttribute) getItemEClass().getEAllStructuralFeatures().get(ITEM_COMMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Item.shipDate</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Item.shipDate</b></em>'.
   * @generated
   */
  public EAttribute getItem_ShipDate() {
    return (EAttribute) getItemEClass().getEAllStructuralFeatures().get(ITEM_SHIPDATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Item.partNum</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Item.partNum</b></em>'.
   * @generated
   */
  public EAttribute getItem_PartNum() {
    return (EAttribute) getItemEClass().getEAllStructuralFeatures().get(ITEM_PARTNUM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PurchaseOrder</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PurchaseOrder</b></em>'
   * @generated
   */
  public EClass getPurchaseOrderEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PURCHASEORDER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PurchaseOrder.items</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PurchaseOrder.items</b></em>'.
   * @generated
   */
  public EReference getPurchaseOrder_Items() {
    return (EReference) getPurchaseOrderEClass().getEAllStructuralFeatures().get(PURCHASEORDER_ITEMS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PurchaseOrder.billTo</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PurchaseOrder.billTo</b></em>'.
   * @generated
   */
  public EReference getPurchaseOrder_BillTo() {
    return (EReference) getPurchaseOrderEClass().getEAllStructuralFeatures().get(PURCHASEORDER_BILLTO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PurchaseOrder.shipTo</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PurchaseOrder.shipTo</b></em>'.
   * @generated
   */
  public EReference getPurchaseOrder_ShipTo() {
    return (EReference) getPurchaseOrderEClass().getEAllStructuralFeatures().get(PURCHASEORDER_SHIPTO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PurchaseOrder.comment</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PurchaseOrder.comment</b></em>'.
   * @generated
   */
  public EAttribute getPurchaseOrder_Comment() {
    return (EAttribute) getPurchaseOrderEClass().getEAllStructuralFeatures().get(PURCHASEORDER_COMMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PurchaseOrder.orderDate</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PurchaseOrder.orderDate</b></em>'.
   * @generated
   */
  public EAttribute getPurchaseOrder_OrderDate() {
    return (EAttribute) getPurchaseOrderEClass().getEAllStructuralFeatures().get(PURCHASEORDER_ORDERDATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PurchaseOrder.status</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PurchaseOrder.status</b></em>'.
   * @generated
   */
  public EAttribute getPurchaseOrder_Status() {
    return (EAttribute) getPurchaseOrderEClass().getEAllStructuralFeatures().get(PURCHASEORDER_STATUS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PurchaseOrder.totalAmount</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PurchaseOrder.totalAmount</b></em>'.
   * @generated
   */
  public EAttribute getPurchaseOrder_TotalAmount() {
    return (EAttribute) getPurchaseOrderEClass().getEAllStructuralFeatures().get(PURCHASEORDER_TOTALAMOUNT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PurchaseOrder.customer</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PurchaseOrder.customer</b></em>'.
   * @generated
   */
  public EReference getPurchaseOrder_Customer() {
    return (EReference) getPurchaseOrderEClass().getEAllStructuralFeatures().get(PURCHASEORDER_CUSTOMER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PurchaseOrder.previousOrder</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PurchaseOrder.previousOrder</b></em>'.
   * @generated
   */
  public EReference getPurchaseOrder_PreviousOrder() {
    return (EReference) getPurchaseOrderEClass().getEAllStructuralFeatures()
        .get(PURCHASEORDER_PREVIOUSORDER_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>USAddress</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>USAddress</b></em>'
   * @generated
   */
  public EClass getUSAddressEClass() {
    return (EClass) getEPackage().getEClassifiers().get(USADDRESS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>USAddress.street</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>USAddress.street</b></em>'.
   * @generated
   */
  public EAttribute getUSAddress_Street() {
    return (EAttribute) getUSAddressEClass().getEAllStructuralFeatures().get(USADDRESS_STREET_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>USAddress.city</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>USAddress.city</b></em>'.
   * @generated
   */
  public EAttribute getUSAddress_City() {
    return (EAttribute) getUSAddressEClass().getEAllStructuralFeatures().get(USADDRESS_CITY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>USAddress.state</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>USAddress.state</b></em>'.
   * @generated
   */
  public EAttribute getUSAddress_State() {
    return (EAttribute) getUSAddressEClass().getEAllStructuralFeatures().get(USADDRESS_STATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>USAddress.zip</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>USAddress.zip</b></em>'.
   * @generated
   */
  public EAttribute getUSAddress_Zip() {
    return (EAttribute) getUSAddressEClass().getEAllStructuralFeatures().get(USADDRESS_ZIP_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Address</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Address</b></em>'
   * @generated
   */
  public EClass getAddressEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ADDRESS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Address.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Address.name</b></em>'.
   * @generated
   */
  public EAttribute getAddress_Name() {
    return (EAttribute) getAddressEClass().getEAllStructuralFeatures().get(ADDRESS_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Address.country</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Address.country</b></em>'.
   * @generated
   */
  public EAttribute getAddress_Country() {
    return (EAttribute) getAddressEClass().getEAllStructuralFeatures().get(ADDRESS_COUNTRY_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Customer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Customer</b></em>'
   * @generated
   */
  public EClass getCustomerEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CUSTOMER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Customer.customerID</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Customer.customerID</b></em>'.
   * @generated
   */
  public EAttribute getCustomer_CustomerID() {
    return (EAttribute) getCustomerEClass().getEAllStructuralFeatures().get(CUSTOMER_CUSTOMERID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Customer.orders</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Customer.orders</b></em>'.
   * @generated
   */
  public EReference getCustomer_Orders() {
    return (EReference) getCustomerEClass().getEAllStructuralFeatures().get(CUSTOMER_ORDERS_FEATURE_ID);
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
   * Returns the {@link EStructuralFeature} '<em><b>Supplier.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Supplier.name</b></em>'.
   * @generated
   */
  public EAttribute getSupplier_Name() {
    return (EAttribute) getSupplierEClass().getEAllStructuralFeatures().get(SUPPLIER_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Supplier.customers</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Supplier.customers</b></em>'.
   * @generated
   */
  public EReference getSupplier_Customers() {
    return (EReference) getSupplierEClass().getEAllStructuralFeatures().get(SUPPLIER_CUSTOMERS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Supplier.orders</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Supplier.orders</b></em>'.
   * @generated
   */
  public EReference getSupplier_Orders() {
    return (EReference) getSupplierEClass().getEAllStructuralFeatures().get(SUPPLIER_ORDERS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Supplier.pendingOrders</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Supplier.pendingOrders</b></em>'.
   * @generated
   */
  public EReference getSupplier_PendingOrders() {
    return (EReference) getSupplierEClass().getEAllStructuralFeatures().get(SUPPLIER_PENDINGORDERS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Supplier.shippedOrders</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Supplier.shippedOrders</b></em>'.
   * @generated
   */
  public EReference getSupplier_ShippedOrders() {
    return (EReference) getSupplierEClass().getEAllStructuralFeatures().get(SUPPLIER_SHIPPEDORDERS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>GlobalAddress</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>GlobalAddress</b></em>'
   * @generated
   */
  public EClass getGlobalAddressEClass() {
    return (EClass) getEPackage().getEClassifiers().get(GLOBALADDRESS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GlobalAddress.location</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GlobalAddress.location</b></em>'.
   * @generated
   */
  public EAttribute getGlobalAddress_Location() {
    return (EAttribute) getGlobalAddressEClass().getEAllStructuralFeatures().get(GLOBALADDRESS_LOCATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GlobalAddress.countryCode</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GlobalAddress.countryCode</b></em>'.
   * @generated
   */
  public EAttribute getGlobalAddress_CountryCode() {
    return (EAttribute) getGlobalAddressEClass().getEAllStructuralFeatures().get(GLOBALADDRESS_COUNTRYCODE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>GlobalLocation</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>GlobalLocation</b></em>'
   * @generated
   */
  public EClass getGlobalLocationEClass() {
    return (EClass) getEPackage().getEClassifiers().get(GLOBALLOCATION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GlobalLocation.countryCode</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GlobalLocation.countryCode</b></em>'.
   * @generated
   */
  public EAttribute getGlobalLocation_CountryCode() {
    return (EAttribute) getGlobalLocationEClass().getEAllStructuralFeatures()
        .get(GLOBALLOCATION_COUNTRYCODE_FEATURE_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>Date</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>Date</b></em>'
   * @generated
   */
  public EDataType getDateEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(DATE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>SKU</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>SKU</b></em>'
   * @generated
   */
  public EDataType getSKUEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(SKU_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>OrderStatus</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>OrderStatus</b></em>'
   * @generated
   */
  public EEnum getOrderStatusEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(ORDERSTATUS_CLASSIFIER_ID);
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
    case ITEM_CLASSIFIER_ID:
      return Item.class;
    case PURCHASEORDER_CLASSIFIER_ID:
      return PurchaseOrder.class;
    case USADDRESS_CLASSIFIER_ID:
      return USAddress.class;
    case ADDRESS_CLASSIFIER_ID:
      return Address.class;
    case CUSTOMER_CLASSIFIER_ID:
      return Customer.class;
    case SUPPLIER_CLASSIFIER_ID:
      return Supplier.class;
    case GLOBALADDRESS_CLASSIFIER_ID:
      return GlobalAddress.class;
    case GLOBALLOCATION_CLASSIFIER_ID:
      return GlobalLocation.class;
    case DATE_CLASSIFIER_ID:
      return Date.class;
    case SKU_CLASSIFIER_ID:
      return String.class;
    case ORDERSTATUS_CLASSIFIER_ID:
      return OrderStatus.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
