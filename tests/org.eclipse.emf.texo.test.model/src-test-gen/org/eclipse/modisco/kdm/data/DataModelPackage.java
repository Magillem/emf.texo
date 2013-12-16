package org.eclipse.modisco.kdm.data;

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
import org.eclipse.modisco.kdm.data.dao.AbstractContentElementDao;
import org.eclipse.modisco.kdm.data.dao.AbstractDataElementDao;
import org.eclipse.modisco.kdm.data.dao.AbstractDataRelationshipDao;
import org.eclipse.modisco.kdm.data.dao.AllContentDao;
import org.eclipse.modisco.kdm.data.dao.CatalogDao;
import org.eclipse.modisco.kdm.data.dao.ChoiceContentDao;
import org.eclipse.modisco.kdm.data.dao.ColumnSetDao;
import org.eclipse.modisco.kdm.data.dao.ComplexContentTypeDao;
import org.eclipse.modisco.kdm.data.dao.ContentAttributeDao;
import org.eclipse.modisco.kdm.data.dao.ContentElementDao;
import org.eclipse.modisco.kdm.data.dao.ContentItemDao;
import org.eclipse.modisco.kdm.data.dao.ContentReferenceDao;
import org.eclipse.modisco.kdm.data.dao.ContentRestrictionDao;
import org.eclipse.modisco.kdm.data.dao.DataActionDao;
import org.eclipse.modisco.kdm.data.dao.DataContainerDao;
import org.eclipse.modisco.kdm.data.dao.DataEventDao;
import org.eclipse.modisco.kdm.data.dao.DataModelDao;
import org.eclipse.modisco.kdm.data.dao.DataRelationshipDao;
import org.eclipse.modisco.kdm.data.dao.DataResourceDao;
import org.eclipse.modisco.kdm.data.dao.DataSegmentDao;
import org.eclipse.modisco.kdm.data.dao.DatatypeOfDao;
import org.eclipse.modisco.kdm.data.dao.ExtendedDataElementDao;
import org.eclipse.modisco.kdm.data.dao.ExtensionToDao;
import org.eclipse.modisco.kdm.data.dao.GroupContentDao;
import org.eclipse.modisco.kdm.data.dao.HasContentDao;
import org.eclipse.modisco.kdm.data.dao.IndexDao;
import org.eclipse.modisco.kdm.data.dao.IndexElementDao;
import org.eclipse.modisco.kdm.data.dao.KeyRelationDao;
import org.eclipse.modisco.kdm.data.dao.ManagesDataDao;
import org.eclipse.modisco.kdm.data.dao.MixedContentDao;
import org.eclipse.modisco.kdm.data.dao.ProducesDataEventDao;
import org.eclipse.modisco.kdm.data.dao.ReadsColumnSetDao;
import org.eclipse.modisco.kdm.data.dao.RecordFileDao;
import org.eclipse.modisco.kdm.data.dao.ReferenceKeyDao;
import org.eclipse.modisco.kdm.data.dao.ReferenceToDao;
import org.eclipse.modisco.kdm.data.dao.RelationalSchemaDao;
import org.eclipse.modisco.kdm.data.dao.RelationalTableDao;
import org.eclipse.modisco.kdm.data.dao.RelationalViewDao;
import org.eclipse.modisco.kdm.data.dao.RestrictionOfDao;
import org.eclipse.modisco.kdm.data.dao.SeqContentDao;
import org.eclipse.modisco.kdm.data.dao.SimpleContentTypeDao;
import org.eclipse.modisco.kdm.data.dao.TypedByDao;
import org.eclipse.modisco.kdm.data.dao.UniqueKeyDao;
import org.eclipse.modisco.kdm.data.dao.WritesColumnSetDao;
import org.eclipse.modisco.kdm.data.dao.XMLSchemaDao;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The <b>Package</b> for the model '<em><b>data</b></em>'. It contains initialization code and access to the Factory to
 * instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DataModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/MoDisco/kdm/data";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final DataModelFactory MODELFACTORY = new DataModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAMODEL_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAMODEL_DATAELEMENT_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATARELATIONSHIP_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_IMPLEMENTATION_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KEYRELATION_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KEYRELATION_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KEYRELATION_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_DATAELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_CLASSIFIER_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_CODEELEMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_CLASSIFIER_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_ITEMUNIT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_CLASSIFIER_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_CLASSIFIER_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_CLASSIFIER_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_CLASSIFIER_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_KIND_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_CLASSIFIER_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_CONTENTELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_CLASSIFIER_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_CLASSIFIER_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_CONTENTELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_CLASSIFIER_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_CLASSIFIER_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_CLASSIFIER_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_CLASSIFIER_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_TYPE_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_CONTENTELEMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_CLASSIFIER_ID = 24;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_CLASSIFIER_ID = 25;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_KIND_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_VALUE_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_CLASSIFIER_ID = 26;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_TYPE_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_KIND_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_CLASSIFIER_ID = 27;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARELATIONSHIP_CLASSIFIER_ID = 28;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARELATIONSHIP_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARELATIONSHIP_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_CLASSIFIER_ID = 29;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_CLASSIFIER_ID = 30;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_CLASSIFIER_ID = 31;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_KIND_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_IMPLEMENTATION_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_DATAELEMENT_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSCOLUMNSET_CLASSIFIER_ID = 32;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSCOLUMNSET_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSCOLUMNSET_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_CLASSIFIER_ID = 33;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TYPEDBY_CLASSIFIER_ID = 34;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TYPEDBY_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TYPEDBY_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCETO_CLASSIFIER_ID = 35;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCETO_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCETO_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESTRICTIONOF_CLASSIFIER_ID = 36;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESTRICTIONOF_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESTRICTIONOF_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENSIONTO_CLASSIFIER_ID = 37;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENSIONTO_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENSIONTO_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATATYPEOF_CLASSIFIER_ID = 38;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATATYPEOF_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATATYPEOF_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int HASCONTENT_CLASSIFIER_ID = 39;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int HASCONTENT_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int HASCONTENT_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESCOLUMNSET_CLASSIFIER_ID = 40;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESCOLUMNSET_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESCOLUMNSET_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCESDATAEVENT_CLASSIFIER_ID = 41;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCESDATAEVENT_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCESDATAEVENT_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_CLASSIFIER_ID = 42;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_CLASSIFIER_ID = 43;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESDATA_CLASSIFIER_ID = 44;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESDATA_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESDATA_FROM_FEATURE_ID = 7;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final DataModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static DataModelPackage initialize() {

    if (isInitialized) {
      return (DataModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final DataModelPackage modelPackage = new DataModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    isInitialized = true;

    KdmModelPackage.initialize();
    org.eclipse.modisco.kdm.kdm.KdmModelPackage.initialize();
    CoreModelPackage.initialize();
    SourceModelPackage.initialize();
    ActionModelPackage.initialize();
    CodeModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(DataModel.class, modelPackage.getDataModelEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractDataElement.class,
        modelPackage.getAbstractDataElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractDataRelationship.class,
        modelPackage.getAbstractDataRelationshipEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DataResource.class, modelPackage.getDataResourceEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(IndexElement.class, modelPackage.getIndexElementEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UniqueKey.class, modelPackage.getUniqueKeyEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Index.class, modelPackage.getIndexEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(KeyRelation.class, modelPackage.getKeyRelationEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ReferenceKey.class, modelPackage.getReferenceKeyEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DataContainer.class, modelPackage.getDataContainerEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Catalog.class, modelPackage.getCatalogEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RelationalSchema.class,
        modelPackage.getRelationalSchemaEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ColumnSet.class, modelPackage.getColumnSetEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RelationalTable.class,
        modelPackage.getRelationalTableEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RelationalView.class, modelPackage.getRelationalViewEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RecordFile.class, modelPackage.getRecordFileEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DataEvent.class, modelPackage.getDataEventEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(XMLSchema.class, modelPackage.getXMLSchemaEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractContentElement.class,
        modelPackage.getAbstractContentElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ComplexContentType.class,
        modelPackage.getComplexContentTypeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AllContent.class, modelPackage.getAllContentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SeqContent.class, modelPackage.getSeqContentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ChoiceContent.class, modelPackage.getChoiceContentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ContentItem.class, modelPackage.getContentItemEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(GroupContent.class, modelPackage.getGroupContentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ContentRestriction.class,
        modelPackage.getContentRestrictionEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SimpleContentType.class,
        modelPackage.getSimpleContentTypeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ExtendedDataElement.class,
        modelPackage.getExtendedDataElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DataRelationship.class,
        modelPackage.getDataRelationshipEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(MixedContent.class, modelPackage.getMixedContentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ContentReference.class,
        modelPackage.getContentReferenceEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DataAction.class, modelPackage.getDataActionEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ReadsColumnSet.class, modelPackage.getReadsColumnSetEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ContentAttribute.class,
        modelPackage.getContentAttributeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TypedBy.class, modelPackage.getTypedByEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ReferenceTo.class, modelPackage.getReferenceToEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RestrictionOf.class, modelPackage.getRestrictionOfEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ExtensionTo.class, modelPackage.getExtensionToEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DatatypeOf.class, modelPackage.getDatatypeOfEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(HasContent.class, modelPackage.getHasContentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(WritesColumnSet.class,
        modelPackage.getWritesColumnSetEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ProducesDataEvent.class,
        modelPackage.getProducesDataEventEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DataSegment.class, modelPackage.getDataSegmentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ContentElement.class, modelPackage.getContentElementEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ManagesData.class, modelPackage.getManagesDataEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(DataModel.class, DataModelDao.class);
    DaoRegistry.getInstance().registerDao(AbstractDataElement.class, AbstractDataElementDao.class);
    DaoRegistry.getInstance().registerDao(AbstractDataRelationship.class, AbstractDataRelationshipDao.class);
    DaoRegistry.getInstance().registerDao(DataResource.class, DataResourceDao.class);
    DaoRegistry.getInstance().registerDao(IndexElement.class, IndexElementDao.class);
    DaoRegistry.getInstance().registerDao(UniqueKey.class, UniqueKeyDao.class);
    DaoRegistry.getInstance().registerDao(Index.class, IndexDao.class);
    DaoRegistry.getInstance().registerDao(KeyRelation.class, KeyRelationDao.class);
    DaoRegistry.getInstance().registerDao(ReferenceKey.class, ReferenceKeyDao.class);
    DaoRegistry.getInstance().registerDao(DataContainer.class, DataContainerDao.class);
    DaoRegistry.getInstance().registerDao(Catalog.class, CatalogDao.class);
    DaoRegistry.getInstance().registerDao(RelationalSchema.class, RelationalSchemaDao.class);
    DaoRegistry.getInstance().registerDao(ColumnSet.class, ColumnSetDao.class);
    DaoRegistry.getInstance().registerDao(RelationalTable.class, RelationalTableDao.class);
    DaoRegistry.getInstance().registerDao(RelationalView.class, RelationalViewDao.class);
    DaoRegistry.getInstance().registerDao(RecordFile.class, RecordFileDao.class);
    DaoRegistry.getInstance().registerDao(DataEvent.class, DataEventDao.class);
    DaoRegistry.getInstance().registerDao(XMLSchema.class, XMLSchemaDao.class);
    DaoRegistry.getInstance().registerDao(AbstractContentElement.class, AbstractContentElementDao.class);
    DaoRegistry.getInstance().registerDao(ComplexContentType.class, ComplexContentTypeDao.class);
    DaoRegistry.getInstance().registerDao(AllContent.class, AllContentDao.class);
    DaoRegistry.getInstance().registerDao(SeqContent.class, SeqContentDao.class);
    DaoRegistry.getInstance().registerDao(ChoiceContent.class, ChoiceContentDao.class);
    DaoRegistry.getInstance().registerDao(ContentItem.class, ContentItemDao.class);
    DaoRegistry.getInstance().registerDao(GroupContent.class, GroupContentDao.class);
    DaoRegistry.getInstance().registerDao(ContentRestriction.class, ContentRestrictionDao.class);
    DaoRegistry.getInstance().registerDao(SimpleContentType.class, SimpleContentTypeDao.class);
    DaoRegistry.getInstance().registerDao(ExtendedDataElement.class, ExtendedDataElementDao.class);
    DaoRegistry.getInstance().registerDao(DataRelationship.class, DataRelationshipDao.class);
    DaoRegistry.getInstance().registerDao(MixedContent.class, MixedContentDao.class);
    DaoRegistry.getInstance().registerDao(ContentReference.class, ContentReferenceDao.class);
    DaoRegistry.getInstance().registerDao(DataAction.class, DataActionDao.class);
    DaoRegistry.getInstance().registerDao(ReadsColumnSet.class, ReadsColumnSetDao.class);
    DaoRegistry.getInstance().registerDao(ContentAttribute.class, ContentAttributeDao.class);
    DaoRegistry.getInstance().registerDao(TypedBy.class, TypedByDao.class);
    DaoRegistry.getInstance().registerDao(ReferenceTo.class, ReferenceToDao.class);
    DaoRegistry.getInstance().registerDao(RestrictionOf.class, RestrictionOfDao.class);
    DaoRegistry.getInstance().registerDao(ExtensionTo.class, ExtensionToDao.class);
    DaoRegistry.getInstance().registerDao(DatatypeOf.class, DatatypeOfDao.class);
    DaoRegistry.getInstance().registerDao(HasContent.class, HasContentDao.class);
    DaoRegistry.getInstance().registerDao(WritesColumnSet.class, WritesColumnSetDao.class);
    DaoRegistry.getInstance().registerDao(ProducesDataEvent.class, ProducesDataEventDao.class);
    DaoRegistry.getInstance().registerDao(DataSegment.class, DataSegmentDao.class);
    DaoRegistry.getInstance().registerDao(ContentElement.class, ContentElementDao.class);
    DaoRegistry.getInstance().registerDao(ManagesData.class, ManagesDataDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link DataModelFactory} instance.
   * @generated
   */
  @Override
  public DataModelFactory getModelFactory() {
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
    return "data.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>DataModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DataModel</b></em>'
   * @generated
   */
  public EClass getDataModelEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATAMODEL_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataModel.dataElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataModel.dataElement</b></em>'.
   * @generated
   */
  public EReference getDataModel_DataElement() {
    return (EReference) getDataModelEClass().getEAllStructuralFeatures().get(DATAMODEL_DATAELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractDataElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractDataElement</b></em>'
   * @generated
   */
  public EClass getAbstractDataElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTDATAELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractDataElement.source</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractDataElement.source</b></em>'.
   * @generated
   */
  public EReference getAbstractDataElement_Source() {
    return (EReference) getAbstractDataElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTDATAELEMENT_SOURCE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractDataElement.dataRelation</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractDataElement.dataRelation</b></em>'.
   * @generated
   */
  public EReference getAbstractDataElement_DataRelation() {
    return (EReference) getAbstractDataElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTDATAELEMENT_DATARELATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractDataElement.abstraction</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractDataElement.abstraction</b></em>'.
   * @generated
   */
  public EReference getAbstractDataElement_Abstraction() {
    return (EReference) getAbstractDataElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTDATAELEMENT_ABSTRACTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractDataRelationship</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractDataRelationship</b></em>'
   * @generated
   */
  public EClass getAbstractDataRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTDATARELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DataResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DataResource</b></em>'
   * @generated
   */
  public EClass getDataResourceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATARESOURCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>IndexElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>IndexElement</b></em>'
   * @generated
   */
  public EClass getIndexElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(INDEXELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>IndexElement.implementation</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>IndexElement.implementation</b></em>'.
   * @generated
   */
  public EReference getIndexElement_Implementation() {
    return (EReference) getIndexElementEClass().getEAllStructuralFeatures().get(INDEXELEMENT_IMPLEMENTATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UniqueKey</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>UniqueKey</b></em>'
   * @generated
   */
  public EClass getUniqueKeyEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UNIQUEKEY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Index</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Index</b></em>'
   * @generated
   */
  public EClass getIndexEClass() {
    return (EClass) getEPackage().getEClassifiers().get(INDEX_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>KeyRelation</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>KeyRelation</b></em>'
   * @generated
   */
  public EClass getKeyRelationEClass() {
    return (EClass) getEPackage().getEClassifiers().get(KEYRELATION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>KeyRelation.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>KeyRelation.to</b></em>'.
   * @generated
   */
  public EReference getKeyRelation_To() {
    return (EReference) getKeyRelationEClass().getEAllStructuralFeatures().get(KEYRELATION_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>KeyRelation.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>KeyRelation.from</b></em>'.
   * @generated
   */
  public EReference getKeyRelation_From() {
    return (EReference) getKeyRelationEClass().getEAllStructuralFeatures().get(KEYRELATION_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ReferenceKey</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ReferenceKey</b></em>'
   * @generated
   */
  public EClass getReferenceKeyEClass() {
    return (EClass) getEPackage().getEClassifiers().get(REFERENCEKEY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DataContainer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DataContainer</b></em>'
   * @generated
   */
  public EClass getDataContainerEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATACONTAINER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataContainer.dataElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataContainer.dataElement</b></em>'.
   * @generated
   */
  public EReference getDataContainer_DataElement() {
    return (EReference) getDataContainerEClass().getEAllStructuralFeatures().get(DATACONTAINER_DATAELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Catalog</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Catalog</b></em>'
   * @generated
   */
  public EClass getCatalogEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CATALOG_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RelationalSchema</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RelationalSchema</b></em>'
   * @generated
   */
  public EClass getRelationalSchemaEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RELATIONALSCHEMA_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RelationalSchema.codeElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RelationalSchema.codeElement</b></em>'.
   * @generated
   */
  public EReference getRelationalSchema_CodeElement() {
    return (EReference) getRelationalSchemaEClass().getEAllStructuralFeatures().get(
        RELATIONALSCHEMA_CODEELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ColumnSet</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ColumnSet</b></em>'
   * @generated
   */
  public EClass getColumnSetEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COLUMNSET_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ColumnSet.itemUnit</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ColumnSet.itemUnit</b></em>'.
   * @generated
   */
  public EReference getColumnSet_ItemUnit() {
    return (EReference) getColumnSetEClass().getEAllStructuralFeatures().get(COLUMNSET_ITEMUNIT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RelationalTable</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RelationalTable</b></em>'
   * @generated
   */
  public EClass getRelationalTableEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RELATIONALTABLE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RelationalView</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RelationalView</b></em>'
   * @generated
   */
  public EClass getRelationalViewEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RELATIONALVIEW_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RecordFile</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RecordFile</b></em>'
   * @generated
   */
  public EClass getRecordFileEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RECORDFILE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DataEvent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DataEvent</b></em>'
   * @generated
   */
  public EClass getDataEventEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATAEVENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataEvent.kind</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataEvent.kind</b></em>'.
   * @generated
   */
  public EAttribute getDataEvent_Kind() {
    return (EAttribute) getDataEventEClass().getEAllStructuralFeatures().get(DATAEVENT_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>XMLSchema</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>XMLSchema</b></em>'
   * @generated
   */
  public EClass getXMLSchemaEClass() {
    return (EClass) getEPackage().getEClassifiers().get(XMLSCHEMA_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>XMLSchema.contentElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>XMLSchema.contentElement</b></em>'.
   * @generated
   */
  public EReference getXMLSchema_ContentElement() {
    return (EReference) getXMLSchemaEClass().getEAllStructuralFeatures().get(XMLSCHEMA_CONTENTELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractContentElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractContentElement</b></em>'
   * @generated
   */
  public EClass getAbstractContentElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTCONTENTELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ComplexContentType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ComplexContentType</b></em>'
   * @generated
   */
  public EClass getComplexContentTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COMPLEXCONTENTTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ComplexContentType.contentElement</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ComplexContentType.contentElement</b></em>'.
   * @generated
   */
  public EReference getComplexContentType_ContentElement() {
    return (EReference) getComplexContentTypeEClass().getEAllStructuralFeatures().get(
        COMPLEXCONTENTTYPE_CONTENTELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AllContent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AllContent</b></em>'
   * @generated
   */
  public EClass getAllContentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ALLCONTENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SeqContent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SeqContent</b></em>'
   * @generated
   */
  public EClass getSeqContentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SEQCONTENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ChoiceContent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ChoiceContent</b></em>'
   * @generated
   */
  public EClass getChoiceContentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CHOICECONTENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ContentItem</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ContentItem</b></em>'
   * @generated
   */
  public EClass getContentItemEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONTENTITEM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ContentItem.type</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ContentItem.type</b></em>'.
   * @generated
   */
  public EReference getContentItem_Type() {
    return (EReference) getContentItemEClass().getEAllStructuralFeatures().get(CONTENTITEM_TYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ContentItem.contentElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ContentItem.contentElement</b></em>'.
   * @generated
   */
  public EReference getContentItem_ContentElement() {
    return (EReference) getContentItemEClass().getEAllStructuralFeatures().get(CONTENTITEM_CONTENTELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>GroupContent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>GroupContent</b></em>'
   * @generated
   */
  public EClass getGroupContentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(GROUPCONTENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ContentRestriction</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ContentRestriction</b></em>'
   * @generated
   */
  public EClass getContentRestrictionEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONTENTRESTRICTION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ContentRestriction.kind</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ContentRestriction.kind</b></em>'.
   * @generated
   */
  public EAttribute getContentRestriction_Kind() {
    return (EAttribute) getContentRestrictionEClass().getEAllStructuralFeatures().get(
        CONTENTRESTRICTION_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ContentRestriction.value</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ContentRestriction.value</b></em>'.
   * @generated
   */
  public EAttribute getContentRestriction_Value() {
    return (EAttribute) getContentRestrictionEClass().getEAllStructuralFeatures().get(
        CONTENTRESTRICTION_VALUE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SimpleContentType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SimpleContentType</b></em>'
   * @generated
   */
  public EClass getSimpleContentTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SIMPLECONTENTTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleContentType.type</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleContentType.type</b></em>'.
   * @generated
   */
  public EReference getSimpleContentType_Type() {
    return (EReference) getSimpleContentTypeEClass().getEAllStructuralFeatures().get(SIMPLECONTENTTYPE_TYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleContentType.kind</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleContentType.kind</b></em>'.
   * @generated
   */
  public EAttribute getSimpleContentType_Kind() {
    return (EAttribute) getSimpleContentTypeEClass().getEAllStructuralFeatures().get(SIMPLECONTENTTYPE_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ExtendedDataElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ExtendedDataElement</b></em>'
   * @generated
   */
  public EClass getExtendedDataElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EXTENDEDDATAELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DataRelationship</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DataRelationship</b></em>'
   * @generated
   */
  public EClass getDataRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATARELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataRelationship.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataRelationship.to</b></em>'.
   * @generated
   */
  public EReference getDataRelationship_To() {
    return (EReference) getDataRelationshipEClass().getEAllStructuralFeatures().get(DATARELATIONSHIP_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataRelationship.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataRelationship.from</b></em>'.
   * @generated
   */
  public EReference getDataRelationship_From() {
    return (EReference) getDataRelationshipEClass().getEAllStructuralFeatures().get(DATARELATIONSHIP_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>MixedContent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>MixedContent</b></em>'
   * @generated
   */
  public EClass getMixedContentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MIXEDCONTENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ContentReference</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ContentReference</b></em>'
   * @generated
   */
  public EClass getContentReferenceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONTENTREFERENCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DataAction</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DataAction</b></em>'
   * @generated
   */
  public EClass getDataActionEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATAACTION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataAction.kind</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataAction.kind</b></em>'.
   * @generated
   */
  public EAttribute getDataAction_Kind() {
    return (EAttribute) getDataActionEClass().getEAllStructuralFeatures().get(DATAACTION_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataAction.implementation</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataAction.implementation</b></em>'.
   * @generated
   */
  public EReference getDataAction_Implementation() {
    return (EReference) getDataActionEClass().getEAllStructuralFeatures().get(DATAACTION_IMPLEMENTATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataAction.dataElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataAction.dataElement</b></em>'.
   * @generated
   */
  public EReference getDataAction_DataElement() {
    return (EReference) getDataActionEClass().getEAllStructuralFeatures().get(DATAACTION_DATAELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ReadsColumnSet</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ReadsColumnSet</b></em>'
   * @generated
   */
  public EClass getReadsColumnSetEClass() {
    return (EClass) getEPackage().getEClassifiers().get(READSCOLUMNSET_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ReadsColumnSet.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ReadsColumnSet.to</b></em>'.
   * @generated
   */
  public EReference getReadsColumnSet_To() {
    return (EReference) getReadsColumnSetEClass().getEAllStructuralFeatures().get(READSCOLUMNSET_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ReadsColumnSet.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ReadsColumnSet.from</b></em>'.
   * @generated
   */
  public EReference getReadsColumnSet_From() {
    return (EReference) getReadsColumnSetEClass().getEAllStructuralFeatures().get(READSCOLUMNSET_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ContentAttribute</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ContentAttribute</b></em>'
   * @generated
   */
  public EClass getContentAttributeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONTENTATTRIBUTE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>TypedBy</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TypedBy</b></em>'
   * @generated
   */
  public EClass getTypedByEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TYPEDBY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TypedBy.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TypedBy.to</b></em>'.
   * @generated
   */
  public EReference getTypedBy_To() {
    return (EReference) getTypedByEClass().getEAllStructuralFeatures().get(TYPEDBY_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TypedBy.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TypedBy.from</b></em>'.
   * @generated
   */
  public EReference getTypedBy_From() {
    return (EReference) getTypedByEClass().getEAllStructuralFeatures().get(TYPEDBY_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ReferenceTo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ReferenceTo</b></em>'
   * @generated
   */
  public EClass getReferenceToEClass() {
    return (EClass) getEPackage().getEClassifiers().get(REFERENCETO_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ReferenceTo.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ReferenceTo.to</b></em>'.
   * @generated
   */
  public EReference getReferenceTo_To() {
    return (EReference) getReferenceToEClass().getEAllStructuralFeatures().get(REFERENCETO_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ReferenceTo.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ReferenceTo.from</b></em>'.
   * @generated
   */
  public EReference getReferenceTo_From() {
    return (EReference) getReferenceToEClass().getEAllStructuralFeatures().get(REFERENCETO_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RestrictionOf</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RestrictionOf</b></em>'
   * @generated
   */
  public EClass getRestrictionOfEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RESTRICTIONOF_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RestrictionOf.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RestrictionOf.to</b></em>'.
   * @generated
   */
  public EReference getRestrictionOf_To() {
    return (EReference) getRestrictionOfEClass().getEAllStructuralFeatures().get(RESTRICTIONOF_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RestrictionOf.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RestrictionOf.from</b></em>'.
   * @generated
   */
  public EReference getRestrictionOf_From() {
    return (EReference) getRestrictionOfEClass().getEAllStructuralFeatures().get(RESTRICTIONOF_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ExtensionTo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ExtensionTo</b></em>'
   * @generated
   */
  public EClass getExtensionToEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EXTENSIONTO_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ExtensionTo.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ExtensionTo.to</b></em>'.
   * @generated
   */
  public EReference getExtensionTo_To() {
    return (EReference) getExtensionToEClass().getEAllStructuralFeatures().get(EXTENSIONTO_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ExtensionTo.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ExtensionTo.from</b></em>'.
   * @generated
   */
  public EReference getExtensionTo_From() {
    return (EReference) getExtensionToEClass().getEAllStructuralFeatures().get(EXTENSIONTO_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DatatypeOf</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DatatypeOf</b></em>'
   * @generated
   */
  public EClass getDatatypeOfEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATATYPEOF_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DatatypeOf.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DatatypeOf.to</b></em>'.
   * @generated
   */
  public EReference getDatatypeOf_To() {
    return (EReference) getDatatypeOfEClass().getEAllStructuralFeatures().get(DATATYPEOF_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DatatypeOf.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DatatypeOf.from</b></em>'.
   * @generated
   */
  public EReference getDatatypeOf_From() {
    return (EReference) getDatatypeOfEClass().getEAllStructuralFeatures().get(DATATYPEOF_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>HasContent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>HasContent</b></em>'
   * @generated
   */
  public EClass getHasContentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(HASCONTENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>HasContent.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>HasContent.to</b></em>'.
   * @generated
   */
  public EReference getHasContent_To() {
    return (EReference) getHasContentEClass().getEAllStructuralFeatures().get(HASCONTENT_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>HasContent.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>HasContent.from</b></em>'.
   * @generated
   */
  public EReference getHasContent_From() {
    return (EReference) getHasContentEClass().getEAllStructuralFeatures().get(HASCONTENT_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>WritesColumnSet</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>WritesColumnSet</b></em>'
   * @generated
   */
  public EClass getWritesColumnSetEClass() {
    return (EClass) getEPackage().getEClassifiers().get(WRITESCOLUMNSET_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WritesColumnSet.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WritesColumnSet.to</b></em>'.
   * @generated
   */
  public EReference getWritesColumnSet_To() {
    return (EReference) getWritesColumnSetEClass().getEAllStructuralFeatures().get(WRITESCOLUMNSET_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WritesColumnSet.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WritesColumnSet.from</b></em>'.
   * @generated
   */
  public EReference getWritesColumnSet_From() {
    return (EReference) getWritesColumnSetEClass().getEAllStructuralFeatures().get(WRITESCOLUMNSET_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ProducesDataEvent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ProducesDataEvent</b></em>'
   * @generated
   */
  public EClass getProducesDataEventEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PRODUCESDATAEVENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ProducesDataEvent.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ProducesDataEvent.to</b></em>'.
   * @generated
   */
  public EReference getProducesDataEvent_To() {
    return (EReference) getProducesDataEventEClass().getEAllStructuralFeatures().get(PRODUCESDATAEVENT_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ProducesDataEvent.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ProducesDataEvent.from</b></em>'.
   * @generated
   */
  public EReference getProducesDataEvent_From() {
    return (EReference) getProducesDataEventEClass().getEAllStructuralFeatures().get(PRODUCESDATAEVENT_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DataSegment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DataSegment</b></em>'
   * @generated
   */
  public EClass getDataSegmentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATASEGMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ContentElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ContentElement</b></em>'
   * @generated
   */
  public EClass getContentElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONTENTELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ManagesData</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ManagesData</b></em>'
   * @generated
   */
  public EClass getManagesDataEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MANAGESDATA_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManagesData.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManagesData.to</b></em>'.
   * @generated
   */
  public EReference getManagesData_To() {
    return (EReference) getManagesDataEClass().getEAllStructuralFeatures().get(MANAGESDATA_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManagesData.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManagesData.from</b></em>'.
   * @generated
   */
  public EReference getManagesData_From() {
    return (EReference) getManagesDataEClass().getEAllStructuralFeatures().get(MANAGESDATA_FROM_FEATURE_ID);
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
    case DATAMODEL_CLASSIFIER_ID:
      return DataModel.class;
    case ABSTRACTDATAELEMENT_CLASSIFIER_ID:
      return AbstractDataElement.class;
    case ABSTRACTDATARELATIONSHIP_CLASSIFIER_ID:
      return AbstractDataRelationship.class;
    case DATARESOURCE_CLASSIFIER_ID:
      return DataResource.class;
    case INDEXELEMENT_CLASSIFIER_ID:
      return IndexElement.class;
    case UNIQUEKEY_CLASSIFIER_ID:
      return UniqueKey.class;
    case INDEX_CLASSIFIER_ID:
      return Index.class;
    case KEYRELATION_CLASSIFIER_ID:
      return KeyRelation.class;
    case REFERENCEKEY_CLASSIFIER_ID:
      return ReferenceKey.class;
    case DATACONTAINER_CLASSIFIER_ID:
      return DataContainer.class;
    case CATALOG_CLASSIFIER_ID:
      return Catalog.class;
    case RELATIONALSCHEMA_CLASSIFIER_ID:
      return RelationalSchema.class;
    case COLUMNSET_CLASSIFIER_ID:
      return ColumnSet.class;
    case RELATIONALTABLE_CLASSIFIER_ID:
      return RelationalTable.class;
    case RELATIONALVIEW_CLASSIFIER_ID:
      return RelationalView.class;
    case RECORDFILE_CLASSIFIER_ID:
      return RecordFile.class;
    case DATAEVENT_CLASSIFIER_ID:
      return DataEvent.class;
    case XMLSCHEMA_CLASSIFIER_ID:
      return XMLSchema.class;
    case ABSTRACTCONTENTELEMENT_CLASSIFIER_ID:
      return AbstractContentElement.class;
    case COMPLEXCONTENTTYPE_CLASSIFIER_ID:
      return ComplexContentType.class;
    case ALLCONTENT_CLASSIFIER_ID:
      return AllContent.class;
    case SEQCONTENT_CLASSIFIER_ID:
      return SeqContent.class;
    case CHOICECONTENT_CLASSIFIER_ID:
      return ChoiceContent.class;
    case CONTENTITEM_CLASSIFIER_ID:
      return ContentItem.class;
    case GROUPCONTENT_CLASSIFIER_ID:
      return GroupContent.class;
    case CONTENTRESTRICTION_CLASSIFIER_ID:
      return ContentRestriction.class;
    case SIMPLECONTENTTYPE_CLASSIFIER_ID:
      return SimpleContentType.class;
    case EXTENDEDDATAELEMENT_CLASSIFIER_ID:
      return ExtendedDataElement.class;
    case DATARELATIONSHIP_CLASSIFIER_ID:
      return DataRelationship.class;
    case MIXEDCONTENT_CLASSIFIER_ID:
      return MixedContent.class;
    case CONTENTREFERENCE_CLASSIFIER_ID:
      return ContentReference.class;
    case DATAACTION_CLASSIFIER_ID:
      return DataAction.class;
    case READSCOLUMNSET_CLASSIFIER_ID:
      return ReadsColumnSet.class;
    case CONTENTATTRIBUTE_CLASSIFIER_ID:
      return ContentAttribute.class;
    case TYPEDBY_CLASSIFIER_ID:
      return TypedBy.class;
    case REFERENCETO_CLASSIFIER_ID:
      return ReferenceTo.class;
    case RESTRICTIONOF_CLASSIFIER_ID:
      return RestrictionOf.class;
    case EXTENSIONTO_CLASSIFIER_ID:
      return ExtensionTo.class;
    case DATATYPEOF_CLASSIFIER_ID:
      return DatatypeOf.class;
    case HASCONTENT_CLASSIFIER_ID:
      return HasContent.class;
    case WRITESCOLUMNSET_CLASSIFIER_ID:
      return WritesColumnSet.class;
    case PRODUCESDATAEVENT_CLASSIFIER_ID:
      return ProducesDataEvent.class;
    case DATASEGMENT_CLASSIFIER_ID:
      return DataSegment.class;
    case CONTENTELEMENT_CLASSIFIER_ID:
      return ContentElement.class;
    case MANAGESDATA_CLASSIFIER_ID:
      return ManagesData.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
