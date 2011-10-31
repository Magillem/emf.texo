/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmFactoryImpl.java,v 1.6 2011/10/25 13:25:23 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.texo.orm.annotations.model.orm.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class OrmFactoryImpl extends EFactoryImpl implements OrmFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static OrmFactory init() {
    try {
      OrmFactory theOrmFactory = (OrmFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/eclipselink/xsds/persistence/orm"); 
      if (theOrmFactory != null) {
        return theOrmFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OrmFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OrmFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case OrmPackage.ACCESS_METHODS: return (EObject)createAccessMethods();
      case OrmPackage.ASSOCIATION_OVERRIDE: return (EObject)createAssociationOverride();
      case OrmPackage.ATTRIBUTE_OVERRIDE: return (EObject)createAttributeOverride();
      case OrmPackage.ATTRIBUTES: return (EObject)createAttributes();
      case OrmPackage.BASIC: return (EObject)createBasic();
      case OrmPackage.BASIC_COLLECTION: return (EObject)createBasicCollection();
      case OrmPackage.BASIC_MAP: return (EObject)createBasicMap();
      case OrmPackage.CACHE: return (EObject)createCache();
      case OrmPackage.CACHE_INTERCEPTOR: return (EObject)createCacheInterceptor();
      case OrmPackage.CASCADE_TYPE: return (EObject)createCascadeType();
      case OrmPackage.CHANGE_TRACKING: return (EObject)createChangeTracking();
      case OrmPackage.CLONE_COPY_POLICY: return (EObject)createCloneCopyPolicy();
      case OrmPackage.COLLECTION_TABLE: return (EObject)createCollectionTable();
      case OrmPackage.COLUMN: return (EObject)createColumn();
      case OrmPackage.COLUMN_RESULT: return (EObject)createColumnResult();
      case OrmPackage.CONVERSION_VALUE: return (EObject)createConversionValue();
      case OrmPackage.CONVERTER: return (EObject)createConverter();
      case OrmPackage.COPY_POLICY: return (EObject)createCopyPolicy();
      case OrmPackage.CUSTOMIZER: return (EObject)createCustomizer();
      case OrmPackage.DISCRIMINATOR_CLASS: return (EObject)createDiscriminatorClass();
      case OrmPackage.DISCRIMINATOR_COLUMN: return (EObject)createDiscriminatorColumn();
      case OrmPackage.DOCUMENT_ROOT: return (EObject)createDocumentRoot();
      case OrmPackage.ECLIPSELINK_COLLECTION_TABLE: return (EObject)createEclipselinkCollectionTable();
      case OrmPackage.ELEMENT_COLLECTION: return (EObject)createElementCollection();
      case OrmPackage.EMBEDDABLE: return (EObject)createEmbeddable();
      case OrmPackage.EMBEDDED: return (EObject)createEmbedded();
      case OrmPackage.EMBEDDED_ID: return (EObject)createEmbeddedId();
      case OrmPackage.EMPTY_TYPE: return (EObject)createEmptyType();
      case OrmPackage.ENTITY: return (EObject)createEntity();
      case OrmPackage.ENTITY_LISTENER: return (EObject)createEntityListener();
      case OrmPackage.ENTITY_LISTENERS: return (EObject)createEntityListeners();
      case OrmPackage.ENTITY_MAPPINGS_TYPE: return (EObject)createEntityMappingsType();
      case OrmPackage.ENTITY_RESULT: return (EObject)createEntityResult();
      case OrmPackage.FIELD_RESULT: return (EObject)createFieldResult();
      case OrmPackage.GENERATED_VALUE: return (EObject)createGeneratedValue();
      case OrmPackage.ID: return (EObject)createId();
      case OrmPackage.ID_CLASS: return (EObject)createIdClass();
      case OrmPackage.INHERITANCE: return (EObject)createInheritance();
      case OrmPackage.INSTANTIATION_COPY_POLICY: return (EObject)createInstantiationCopyPolicy();
      case OrmPackage.JOIN_COLUMN: return (EObject)createJoinColumn();
      case OrmPackage.JOIN_TABLE: return (EObject)createJoinTable();
      case OrmPackage.LOB: return (EObject)createLob();
      case OrmPackage.MANY_TO_MANY: return (EObject)createManyToMany();
      case OrmPackage.MANY_TO_ONE: return (EObject)createManyToOne();
      case OrmPackage.MAP_KEY: return (EObject)createMapKey();
      case OrmPackage.MAP_KEY_CLASS: return (EObject)createMapKeyClass();
      case OrmPackage.MAP_KEY_COLUMN: return (EObject)createMapKeyColumn();
      case OrmPackage.MAP_KEY_JOIN_COLUMN: return (EObject)createMapKeyJoinColumn();
      case OrmPackage.MAPPED_SUPERCLASS: return (EObject)createMappedSuperclass();
      case OrmPackage.NAMED_NATIVE_QUERY: return (EObject)createNamedNativeQuery();
      case OrmPackage.NAMED_QUERY: return (EObject)createNamedQuery();
      case OrmPackage.NAMED_STORED_PROCEDURE_QUERY: return (EObject)createNamedStoredProcedureQuery();
      case OrmPackage.OBJECT_TYPE_CONVERTER: return (EObject)createObjectTypeConverter();
      case OrmPackage.ONE_TO_MANY: return (EObject)createOneToMany();
      case OrmPackage.ONE_TO_ONE: return (EObject)createOneToOne();
      case OrmPackage.OPTIMISTIC_LOCKING: return (EObject)createOptimisticLocking();
      case OrmPackage.ORDER_COLUMN: return (EObject)createOrderColumn();
      case OrmPackage.PERSISTENCE_UNIT_DEFAULTS: return (EObject)createPersistenceUnitDefaults();
      case OrmPackage.PERSISTENCE_UNIT_METADATA: return (EObject)createPersistenceUnitMetadata();
      case OrmPackage.POST_LOAD: return (EObject)createPostLoad();
      case OrmPackage.POST_PERSIST: return (EObject)createPostPersist();
      case OrmPackage.POST_REMOVE: return (EObject)createPostRemove();
      case OrmPackage.POST_UPDATE: return (EObject)createPostUpdate();
      case OrmPackage.PRE_PERSIST: return (EObject)createPrePersist();
      case OrmPackage.PRE_REMOVE: return (EObject)createPreRemove();
      case OrmPackage.PRE_UPDATE: return (EObject)createPreUpdate();
      case OrmPackage.PRIMARY_KEY: return (EObject)createPrimaryKey();
      case OrmPackage.PRIMARY_KEY_JOIN_COLUMN: return (EObject)createPrimaryKeyJoinColumn();
      case OrmPackage.PROPERTY: return (EObject)createProperty();
      case OrmPackage.QUERY_HINT: return (EObject)createQueryHint();
      case OrmPackage.QUERY_REDIRECTORS: return (EObject)createQueryRedirectors();
      case OrmPackage.READ_TRANSFORMER: return (EObject)createReadTransformer();
      case OrmPackage.SECONDARY_TABLE: return (EObject)createSecondaryTable();
      case OrmPackage.SEQUENCE_GENERATOR: return (EObject)createSequenceGenerator();
      case OrmPackage.SQL_RESULT_SET_MAPPING: return (EObject)createSqlResultSetMapping();
      case OrmPackage.STORED_PROCEDURE_PARAMETER: return (EObject)createStoredProcedureParameter();
      case OrmPackage.STRUCT_CONVERTER: return (EObject)createStructConverter();
      case OrmPackage.TABLE: return (EObject)createTable();
      case OrmPackage.TABLE_GENERATOR: return (EObject)createTableGenerator();
      case OrmPackage.TIME_OF_DAY: return (EObject)createTimeOfDay();
      case OrmPackage.TRANSFORMATION: return (EObject)createTransformation();
      case OrmPackage.TRANSIENT: return (EObject)createTransient();
      case OrmPackage.TYPE_CONVERTER: return (EObject)createTypeConverter();
      case OrmPackage.UNIQUE_CONSTRAINT: return (EObject)createUniqueConstraint();
      case OrmPackage.VARIABLE_ONE_TO_ONE: return (EObject)createVariableOneToOne();
      case OrmPackage.VERSION: return (EObject)createVersion();
      case OrmPackage.WRITE_TRANSFORMER: return (EObject)createWriteTransformer();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
      case OrmPackage.ACCESS_TYPE:
        return createAccessTypeFromString(eDataType, initialValue);
      case OrmPackage.CACHE_COORDINATION_TYPE:
        return createCacheCoordinationTypeFromString(eDataType, initialValue);
      case OrmPackage.CACHE_TYPE:
        return createCacheTypeFromString(eDataType, initialValue);
      case OrmPackage.CHANGE_TRACKING_TYPE:
        return createChangeTrackingTypeFromString(eDataType, initialValue);
      case OrmPackage.DIRECTION_TYPE:
        return createDirectionTypeFromString(eDataType, initialValue);
      case OrmPackage.DISCRIMINATOR_TYPE:
        return createDiscriminatorTypeFromString(eDataType, initialValue);
      case OrmPackage.ENUMERATED:
        return createEnumeratedFromString(eDataType, initialValue);
      case OrmPackage.ENUM_TYPE:
        return createEnumTypeFromString(eDataType, initialValue);
      case OrmPackage.EXISTENCE_TYPE:
        return createExistenceTypeFromString(eDataType, initialValue);
      case OrmPackage.FETCH_TYPE:
        return createFetchTypeFromString(eDataType, initialValue);
      case OrmPackage.GENERATION_TYPE:
        return createGenerationTypeFromString(eDataType, initialValue);
      case OrmPackage.ID_VALIDATION:
        return createIdValidationFromString(eDataType, initialValue);
      case OrmPackage.INHERITANCE_TYPE:
        return createInheritanceTypeFromString(eDataType, initialValue);
      case OrmPackage.JOIN_FETCH_TYPE:
        return createJoinFetchTypeFromString(eDataType, initialValue);
      case OrmPackage.LOCK_MODE_TYPE:
        return createLockModeTypeFromString(eDataType, initialValue);
      case OrmPackage.OPTIMISTIC_LOCKING_TYPE:
        return createOptimisticLockingTypeFromString(eDataType, initialValue);
      case OrmPackage.ORDER_COLUMN_CORRECTION_TYPE:
        return createOrderColumnCorrectionTypeFromString(eDataType, initialValue);
      case OrmPackage.TEMPORAL:
        return createTemporalFromString(eDataType, initialValue);
      case OrmPackage.TEMPORAL_TYPE:
        return createTemporalTypeFromString(eDataType, initialValue);
      case OrmPackage.ACCESS_TYPE_OBJECT:
        return createAccessTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.CACHE_COORDINATION_TYPE_OBJECT:
        return createCacheCoordinationTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.CACHE_TYPE_OBJECT:
        return createCacheTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.CHANGE_TRACKING_TYPE_OBJECT:
        return createChangeTrackingTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.DIRECTION_TYPE_OBJECT:
        return createDirectionTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.DISCRIMINATOR_TYPE_OBJECT:
        return createDiscriminatorTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.DISCRIMINATOR_VALUE:
        return createDiscriminatorValueFromString(eDataType, initialValue);
      case OrmPackage.ENUMERATED_OBJECT:
        return createEnumeratedObjectFromString(eDataType, initialValue);
      case OrmPackage.ENUM_TYPE_OBJECT:
        return createEnumTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.EXISTENCE_TYPE_OBJECT:
        return createExistenceTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.FETCH_TYPE_OBJECT:
        return createFetchTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.GENERATION_TYPE_OBJECT:
        return createGenerationTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.ID_VALIDATION_OBJECT:
        return createIdValidationObjectFromString(eDataType, initialValue);
      case OrmPackage.INHERITANCE_TYPE_OBJECT:
        return createInheritanceTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.JOIN_FETCH_TYPE_OBJECT:
        return createJoinFetchTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.LOCK_MODE_TYPE_OBJECT:
        return createLockModeTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.OPTIMISTIC_LOCKING_TYPE_OBJECT:
        return createOptimisticLockingTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.ORDER_BY:
        return createOrderByFromString(eDataType, initialValue);
      case OrmPackage.ORDER_COLUMN_CORRECTION_TYPE_OBJECT:
        return createOrderColumnCorrectionTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.TEMPORAL_OBJECT:
        return createTemporalObjectFromString(eDataType, initialValue);
      case OrmPackage.TEMPORAL_TYPE_OBJECT:
        return createTemporalTypeObjectFromString(eDataType, initialValue);
      case OrmPackage.VERSION_TYPE:
        return createVersionTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
      case OrmPackage.ACCESS_TYPE:
        return convertAccessTypeToString(eDataType, instanceValue);
      case OrmPackage.CACHE_COORDINATION_TYPE:
        return convertCacheCoordinationTypeToString(eDataType, instanceValue);
      case OrmPackage.CACHE_TYPE:
        return convertCacheTypeToString(eDataType, instanceValue);
      case OrmPackage.CHANGE_TRACKING_TYPE:
        return convertChangeTrackingTypeToString(eDataType, instanceValue);
      case OrmPackage.DIRECTION_TYPE:
        return convertDirectionTypeToString(eDataType, instanceValue);
      case OrmPackage.DISCRIMINATOR_TYPE:
        return convertDiscriminatorTypeToString(eDataType, instanceValue);
      case OrmPackage.ENUMERATED:
        return convertEnumeratedToString(eDataType, instanceValue);
      case OrmPackage.ENUM_TYPE:
        return convertEnumTypeToString(eDataType, instanceValue);
      case OrmPackage.EXISTENCE_TYPE:
        return convertExistenceTypeToString(eDataType, instanceValue);
      case OrmPackage.FETCH_TYPE:
        return convertFetchTypeToString(eDataType, instanceValue);
      case OrmPackage.GENERATION_TYPE:
        return convertGenerationTypeToString(eDataType, instanceValue);
      case OrmPackage.ID_VALIDATION:
        return convertIdValidationToString(eDataType, instanceValue);
      case OrmPackage.INHERITANCE_TYPE:
        return convertInheritanceTypeToString(eDataType, instanceValue);
      case OrmPackage.JOIN_FETCH_TYPE:
        return convertJoinFetchTypeToString(eDataType, instanceValue);
      case OrmPackage.LOCK_MODE_TYPE:
        return convertLockModeTypeToString(eDataType, instanceValue);
      case OrmPackage.OPTIMISTIC_LOCKING_TYPE:
        return convertOptimisticLockingTypeToString(eDataType, instanceValue);
      case OrmPackage.ORDER_COLUMN_CORRECTION_TYPE:
        return convertOrderColumnCorrectionTypeToString(eDataType, instanceValue);
      case OrmPackage.TEMPORAL:
        return convertTemporalToString(eDataType, instanceValue);
      case OrmPackage.TEMPORAL_TYPE:
        return convertTemporalTypeToString(eDataType, instanceValue);
      case OrmPackage.ACCESS_TYPE_OBJECT:
        return convertAccessTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.CACHE_COORDINATION_TYPE_OBJECT:
        return convertCacheCoordinationTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.CACHE_TYPE_OBJECT:
        return convertCacheTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.CHANGE_TRACKING_TYPE_OBJECT:
        return convertChangeTrackingTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.DIRECTION_TYPE_OBJECT:
        return convertDirectionTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.DISCRIMINATOR_TYPE_OBJECT:
        return convertDiscriminatorTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.DISCRIMINATOR_VALUE:
        return convertDiscriminatorValueToString(eDataType, instanceValue);
      case OrmPackage.ENUMERATED_OBJECT:
        return convertEnumeratedObjectToString(eDataType, instanceValue);
      case OrmPackage.ENUM_TYPE_OBJECT:
        return convertEnumTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.EXISTENCE_TYPE_OBJECT:
        return convertExistenceTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.FETCH_TYPE_OBJECT:
        return convertFetchTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.GENERATION_TYPE_OBJECT:
        return convertGenerationTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.ID_VALIDATION_OBJECT:
        return convertIdValidationObjectToString(eDataType, instanceValue);
      case OrmPackage.INHERITANCE_TYPE_OBJECT:
        return convertInheritanceTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.JOIN_FETCH_TYPE_OBJECT:
        return convertJoinFetchTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.LOCK_MODE_TYPE_OBJECT:
        return convertLockModeTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.OPTIMISTIC_LOCKING_TYPE_OBJECT:
        return convertOptimisticLockingTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.ORDER_BY:
        return convertOrderByToString(eDataType, instanceValue);
      case OrmPackage.ORDER_COLUMN_CORRECTION_TYPE_OBJECT:
        return convertOrderColumnCorrectionTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.TEMPORAL_OBJECT:
        return convertTemporalObjectToString(eDataType, instanceValue);
      case OrmPackage.TEMPORAL_TYPE_OBJECT:
        return convertTemporalTypeObjectToString(eDataType, instanceValue);
      case OrmPackage.VERSION_TYPE:
        return convertVersionTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AccessMethods createAccessMethods() {
    AccessMethodsImpl accessMethods = new AccessMethodsImpl();
    return accessMethods;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AssociationOverride createAssociationOverride() {
    AssociationOverrideImpl associationOverride = new AssociationOverrideImpl();
    return associationOverride;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AttributeOverride createAttributeOverride() {
    AttributeOverrideImpl attributeOverride = new AttributeOverrideImpl();
    return attributeOverride;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Attributes createAttributes() {
    AttributesImpl attributes = new AttributesImpl();
    return attributes;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Basic createBasic() {
    BasicImpl basic = new BasicImpl();
    return basic;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BasicCollection createBasicCollection() {
    BasicCollectionImpl basicCollection = new BasicCollectionImpl();
    return basicCollection;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BasicMap createBasicMap() {
    BasicMapImpl basicMap = new BasicMapImpl();
    return basicMap;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Cache createCache() {
    CacheImpl cache = new CacheImpl();
    return cache;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CacheInterceptor createCacheInterceptor() {
    CacheInterceptorImpl cacheInterceptor = new CacheInterceptorImpl();
    return cacheInterceptor;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CascadeType createCascadeType() {
    CascadeTypeImpl cascadeType = new CascadeTypeImpl();
    return cascadeType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ChangeTracking createChangeTracking() {
    ChangeTrackingImpl changeTracking = new ChangeTrackingImpl();
    return changeTracking;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CloneCopyPolicy createCloneCopyPolicy() {
    CloneCopyPolicyImpl cloneCopyPolicy = new CloneCopyPolicyImpl();
    return cloneCopyPolicy;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CollectionTable createCollectionTable() {
    CollectionTableImpl collectionTable = new CollectionTableImpl();
    return collectionTable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Column createColumn() {
    ColumnImpl column = new ColumnImpl();
    return column;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ColumnResult createColumnResult() {
    ColumnResultImpl columnResult = new ColumnResultImpl();
    return columnResult;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ConversionValue createConversionValue() {
    ConversionValueImpl conversionValue = new ConversionValueImpl();
    return conversionValue;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Converter createConverter() {
    ConverterImpl converter = new ConverterImpl();
    return converter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CopyPolicy createCopyPolicy() {
    CopyPolicyImpl copyPolicy = new CopyPolicyImpl();
    return copyPolicy;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Customizer createCustomizer() {
    CustomizerImpl customizer = new CustomizerImpl();
    return customizer;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DiscriminatorClass createDiscriminatorClass() {
    DiscriminatorClassImpl discriminatorClass = new DiscriminatorClassImpl();
    return discriminatorClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DiscriminatorColumn createDiscriminatorColumn() {
    DiscriminatorColumnImpl discriminatorColumn = new DiscriminatorColumnImpl();
    return discriminatorColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DocumentRoot createDocumentRoot() {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EclipselinkCollectionTable createEclipselinkCollectionTable() {
    EclipselinkCollectionTableImpl eclipselinkCollectionTable = new EclipselinkCollectionTableImpl();
    return eclipselinkCollectionTable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ElementCollection createElementCollection() {
    ElementCollectionImpl elementCollection = new ElementCollectionImpl();
    return elementCollection;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Embeddable createEmbeddable() {
    EmbeddableImpl embeddable = new EmbeddableImpl();
    return embeddable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Embedded createEmbedded() {
    EmbeddedImpl embedded = new EmbeddedImpl();
    return embedded;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EmbeddedId createEmbeddedId() {
    EmbeddedIdImpl embeddedId = new EmbeddedIdImpl();
    return embeddedId;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EmptyType createEmptyType() {
    EmptyTypeImpl emptyType = new EmptyTypeImpl();
    return emptyType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity() {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EntityListener createEntityListener() {
    EntityListenerImpl entityListener = new EntityListenerImpl();
    return entityListener;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EntityListeners createEntityListeners() {
    EntityListenersImpl entityListeners = new EntityListenersImpl();
    return entityListeners;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EntityMappingsType createEntityMappingsType() {
    EntityMappingsTypeImpl entityMappingsType = new EntityMappingsTypeImpl();
    return entityMappingsType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EntityResult createEntityResult() {
    EntityResultImpl entityResult = new EntityResultImpl();
    return entityResult;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FieldResult createFieldResult() {
    FieldResultImpl fieldResult = new FieldResultImpl();
    return fieldResult;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public GeneratedValue createGeneratedValue() {
    GeneratedValueImpl generatedValue = new GeneratedValueImpl();
    return generatedValue;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Id createId() {
    IdImpl id = new IdImpl();
    return id;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public IdClass createIdClass() {
    IdClassImpl idClass = new IdClassImpl();
    return idClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Inheritance createInheritance() {
    InheritanceImpl inheritance = new InheritanceImpl();
    return inheritance;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public InstantiationCopyPolicy createInstantiationCopyPolicy() {
    InstantiationCopyPolicyImpl instantiationCopyPolicy = new InstantiationCopyPolicyImpl();
    return instantiationCopyPolicy;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public JoinColumn createJoinColumn() {
    JoinColumnImpl joinColumn = new JoinColumnImpl();
    return joinColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public JoinTable createJoinTable() {
    JoinTableImpl joinTable = new JoinTableImpl();
    return joinTable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Lob createLob() {
    LobImpl lob = new LobImpl();
    return lob;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ManyToMany createManyToMany() {
    ManyToManyImpl manyToMany = new ManyToManyImpl();
    return manyToMany;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ManyToOne createManyToOne() {
    ManyToOneImpl manyToOne = new ManyToOneImpl();
    return manyToOne;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MapKey createMapKey() {
    MapKeyImpl mapKey = new MapKeyImpl();
    return mapKey;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MapKeyClass createMapKeyClass() {
    MapKeyClassImpl mapKeyClass = new MapKeyClassImpl();
    return mapKeyClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MapKeyColumn createMapKeyColumn() {
    MapKeyColumnImpl mapKeyColumn = new MapKeyColumnImpl();
    return mapKeyColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MapKeyJoinColumn createMapKeyJoinColumn() {
    MapKeyJoinColumnImpl mapKeyJoinColumn = new MapKeyJoinColumnImpl();
    return mapKeyJoinColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MappedSuperclass createMappedSuperclass() {
    MappedSuperclassImpl mappedSuperclass = new MappedSuperclassImpl();
    return mappedSuperclass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedNativeQuery createNamedNativeQuery() {
    NamedNativeQueryImpl namedNativeQuery = new NamedNativeQueryImpl();
    return namedNativeQuery;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedQuery createNamedQuery() {
    NamedQueryImpl namedQuery = new NamedQueryImpl();
    return namedQuery;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedStoredProcedureQuery createNamedStoredProcedureQuery() {
    NamedStoredProcedureQueryImpl namedStoredProcedureQuery = new NamedStoredProcedureQueryImpl();
    return namedStoredProcedureQuery;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ObjectTypeConverter createObjectTypeConverter() {
    ObjectTypeConverterImpl objectTypeConverter = new ObjectTypeConverterImpl();
    return objectTypeConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OneToMany createOneToMany() {
    OneToManyImpl oneToMany = new OneToManyImpl();
    return oneToMany;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OneToOne createOneToOne() {
    OneToOneImpl oneToOne = new OneToOneImpl();
    return oneToOne;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OptimisticLocking createOptimisticLocking() {
    OptimisticLockingImpl optimisticLocking = new OptimisticLockingImpl();
    return optimisticLocking;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OrderColumn createOrderColumn() {
    OrderColumnImpl orderColumn = new OrderColumnImpl();
    return orderColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PersistenceUnitDefaults createPersistenceUnitDefaults() {
    PersistenceUnitDefaultsImpl persistenceUnitDefaults = new PersistenceUnitDefaultsImpl();
    return persistenceUnitDefaults;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PersistenceUnitMetadata createPersistenceUnitMetadata() {
    PersistenceUnitMetadataImpl persistenceUnitMetadata = new PersistenceUnitMetadataImpl();
    return persistenceUnitMetadata;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PostLoad createPostLoad() {
    PostLoadImpl postLoad = new PostLoadImpl();
    return postLoad;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PostPersist createPostPersist() {
    PostPersistImpl postPersist = new PostPersistImpl();
    return postPersist;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PostRemove createPostRemove() {
    PostRemoveImpl postRemove = new PostRemoveImpl();
    return postRemove;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PostUpdate createPostUpdate() {
    PostUpdateImpl postUpdate = new PostUpdateImpl();
    return postUpdate;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PrePersist createPrePersist() {
    PrePersistImpl prePersist = new PrePersistImpl();
    return prePersist;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PreRemove createPreRemove() {
    PreRemoveImpl preRemove = new PreRemoveImpl();
    return preRemove;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PreUpdate createPreUpdate() {
    PreUpdateImpl preUpdate = new PreUpdateImpl();
    return preUpdate;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PrimaryKey createPrimaryKey() {
    PrimaryKeyImpl primaryKey = new PrimaryKeyImpl();
    return primaryKey;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PrimaryKeyJoinColumn createPrimaryKeyJoinColumn() {
    PrimaryKeyJoinColumnImpl primaryKeyJoinColumn = new PrimaryKeyJoinColumnImpl();
    return primaryKeyJoinColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty() {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public QueryHint createQueryHint() {
    QueryHintImpl queryHint = new QueryHintImpl();
    return queryHint;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public QueryRedirectors createQueryRedirectors() {
    QueryRedirectorsImpl queryRedirectors = new QueryRedirectorsImpl();
    return queryRedirectors;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ReadTransformer createReadTransformer() {
    ReadTransformerImpl readTransformer = new ReadTransformerImpl();
    return readTransformer;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SecondaryTable createSecondaryTable() {
    SecondaryTableImpl secondaryTable = new SecondaryTableImpl();
    return secondaryTable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SequenceGenerator createSequenceGenerator() {
    SequenceGeneratorImpl sequenceGenerator = new SequenceGeneratorImpl();
    return sequenceGenerator;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SqlResultSetMapping createSqlResultSetMapping() {
    SqlResultSetMappingImpl sqlResultSetMapping = new SqlResultSetMappingImpl();
    return sqlResultSetMapping;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public StoredProcedureParameter createStoredProcedureParameter() {
    StoredProcedureParameterImpl storedProcedureParameter = new StoredProcedureParameterImpl();
    return storedProcedureParameter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public StructConverter createStructConverter() {
    StructConverterImpl structConverter = new StructConverterImpl();
    return structConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Table createTable() {
    TableImpl table = new TableImpl();
    return table;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TableGenerator createTableGenerator() {
    TableGeneratorImpl tableGenerator = new TableGeneratorImpl();
    return tableGenerator;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TimeOfDay createTimeOfDay() {
    TimeOfDayImpl timeOfDay = new TimeOfDayImpl();
    return timeOfDay;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Transformation createTransformation() {
    TransformationImpl transformation = new TransformationImpl();
    return transformation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Transient createTransient() {
    TransientImpl transient_ = new TransientImpl();
    return transient_;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TypeConverter createTypeConverter() {
    TypeConverterImpl typeConverter = new TypeConverterImpl();
    return typeConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public UniqueConstraint createUniqueConstraint() {
    UniqueConstraintImpl uniqueConstraint = new UniqueConstraintImpl();
    return uniqueConstraint;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public VariableOneToOne createVariableOneToOne() {
    VariableOneToOneImpl variableOneToOne = new VariableOneToOneImpl();
    return variableOneToOne;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Version createVersion() {
    VersionImpl version = new VersionImpl();
    return version;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public WriteTransformer createWriteTransformer() {
    WriteTransformerImpl writeTransformer = new WriteTransformerImpl();
    return writeTransformer;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AccessType createAccessTypeFromString(EDataType eDataType, String initialValue) {
    AccessType result = AccessType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertAccessTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CacheCoordinationType createCacheCoordinationTypeFromString(EDataType eDataType, String initialValue) {
    CacheCoordinationType result = CacheCoordinationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertCacheCoordinationTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CacheType createCacheTypeFromString(EDataType eDataType, String initialValue) {
    CacheType result = CacheType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertCacheTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ChangeTrackingType createChangeTrackingTypeFromString(EDataType eDataType, String initialValue) {
    ChangeTrackingType result = ChangeTrackingType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertChangeTrackingTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DirectionType createDirectionTypeFromString(EDataType eDataType, String initialValue) {
    DirectionType result = DirectionType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertDirectionTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DiscriminatorType createDiscriminatorTypeFromString(EDataType eDataType, String initialValue) {
    DiscriminatorType result = DiscriminatorType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertDiscriminatorTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EnumType createEnumTypeFromString(EDataType eDataType, String initialValue) {
    EnumType result = EnumType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertEnumTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ExistenceType createExistenceTypeFromString(EDataType eDataType, String initialValue) {
    ExistenceType result = ExistenceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertExistenceTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FetchType createFetchTypeFromString(EDataType eDataType, String initialValue) {
    FetchType result = FetchType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertFetchTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public GenerationType createGenerationTypeFromString(EDataType eDataType, String initialValue) {
    GenerationType result = GenerationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertGenerationTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public IdValidation createIdValidationFromString(EDataType eDataType, String initialValue) {
    IdValidation result = IdValidation.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertIdValidationToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public InheritanceType createInheritanceTypeFromString(EDataType eDataType, String initialValue) {
    InheritanceType result = InheritanceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertInheritanceTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public JoinFetchType createJoinFetchTypeFromString(EDataType eDataType, String initialValue) {
    JoinFetchType result = JoinFetchType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertJoinFetchTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public LockModeType createLockModeTypeFromString(EDataType eDataType, String initialValue) {
    LockModeType result = LockModeType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertLockModeTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OptimisticLockingType createOptimisticLockingTypeFromString(EDataType eDataType, String initialValue) {
    OptimisticLockingType result = OptimisticLockingType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertOptimisticLockingTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OrderColumnCorrectionType createOrderColumnCorrectionTypeFromString(EDataType eDataType, String initialValue) {
    OrderColumnCorrectionType result = OrderColumnCorrectionType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertOrderColumnCorrectionTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TemporalType createTemporalTypeFromString(EDataType eDataType, String initialValue) {
    TemporalType result = TemporalType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertTemporalTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AccessType createAccessTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createAccessTypeFromString(OrmPackage.eINSTANCE.getAccessType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertAccessTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertAccessTypeToString(OrmPackage.eINSTANCE.getAccessType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CacheCoordinationType createCacheCoordinationTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createCacheCoordinationTypeFromString(OrmPackage.eINSTANCE.getCacheCoordinationType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertCacheCoordinationTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCacheCoordinationTypeToString(OrmPackage.eINSTANCE.getCacheCoordinationType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CacheType createCacheTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createCacheTypeFromString(OrmPackage.eINSTANCE.getCacheType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertCacheTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCacheTypeToString(OrmPackage.eINSTANCE.getCacheType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ChangeTrackingType createChangeTrackingTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createChangeTrackingTypeFromString(OrmPackage.eINSTANCE.getChangeTrackingType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertChangeTrackingTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertChangeTrackingTypeToString(OrmPackage.eINSTANCE.getChangeTrackingType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DirectionType createDirectionTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createDirectionTypeFromString(OrmPackage.eINSTANCE.getDirectionType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertDirectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertDirectionTypeToString(OrmPackage.eINSTANCE.getDirectionType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DiscriminatorType createDiscriminatorTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createDiscriminatorTypeFromString(OrmPackage.eINSTANCE.getDiscriminatorType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertDiscriminatorTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertDiscriminatorTypeToString(OrmPackage.eINSTANCE.getDiscriminatorType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String createDiscriminatorValueFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertDiscriminatorValueToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Enumerated createEnumeratedObjectFromString(EDataType eDataType, String initialValue) {
    return createEnumeratedFromString(OrmPackage.eINSTANCE.getEnumerated(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertEnumeratedObjectToString(EDataType eDataType, Object instanceValue) {
    return convertEnumeratedToString(OrmPackage.eINSTANCE.getEnumerated(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Enumerated createEnumeratedFromString(EDataType eDataType, String initialValue) {
    Enumerated result = Enumerated.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertEnumeratedToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EnumType createEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createEnumTypeFromString(OrmPackage.eINSTANCE.getEnumType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertEnumTypeToString(OrmPackage.eINSTANCE.getEnumType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ExistenceType createExistenceTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createExistenceTypeFromString(OrmPackage.eINSTANCE.getExistenceType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertExistenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertExistenceTypeToString(OrmPackage.eINSTANCE.getExistenceType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FetchType createFetchTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createFetchTypeFromString(OrmPackage.eINSTANCE.getFetchType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertFetchTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertFetchTypeToString(OrmPackage.eINSTANCE.getFetchType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public GenerationType createGenerationTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createGenerationTypeFromString(OrmPackage.eINSTANCE.getGenerationType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertGenerationTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertGenerationTypeToString(OrmPackage.eINSTANCE.getGenerationType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public IdValidation createIdValidationObjectFromString(EDataType eDataType, String initialValue) {
    return createIdValidationFromString(OrmPackage.eINSTANCE.getIdValidation(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertIdValidationObjectToString(EDataType eDataType, Object instanceValue) {
    return convertIdValidationToString(OrmPackage.eINSTANCE.getIdValidation(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public InheritanceType createInheritanceTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createInheritanceTypeFromString(OrmPackage.eINSTANCE.getInheritanceType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertInheritanceTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertInheritanceTypeToString(OrmPackage.eINSTANCE.getInheritanceType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public JoinFetchType createJoinFetchTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createJoinFetchTypeFromString(OrmPackage.eINSTANCE.getJoinFetchType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertJoinFetchTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertJoinFetchTypeToString(OrmPackage.eINSTANCE.getJoinFetchType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public LockModeType createLockModeTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createLockModeTypeFromString(OrmPackage.eINSTANCE.getLockModeType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertLockModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertLockModeTypeToString(OrmPackage.eINSTANCE.getLockModeType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OptimisticLockingType createOptimisticLockingTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createOptimisticLockingTypeFromString(OrmPackage.eINSTANCE.getOptimisticLockingType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertOptimisticLockingTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertOptimisticLockingTypeToString(OrmPackage.eINSTANCE.getOptimisticLockingType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String createOrderByFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertOrderByToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OrderColumnCorrectionType createOrderColumnCorrectionTypeObjectFromString(EDataType eDataType,
      String initialValue) {
    return createOrderColumnCorrectionTypeFromString(OrmPackage.eINSTANCE.getOrderColumnCorrectionType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertOrderColumnCorrectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertOrderColumnCorrectionTypeToString(OrmPackage.eINSTANCE.getOrderColumnCorrectionType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Temporal createTemporalObjectFromString(EDataType eDataType, String initialValue) {
    return createTemporalFromString(OrmPackage.eINSTANCE.getTemporal(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertTemporalObjectToString(EDataType eDataType, Object instanceValue) {
    return convertTemporalToString(OrmPackage.eINSTANCE.getTemporal(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Temporal createTemporalFromString(EDataType eDataType, String initialValue) {
    Temporal result = Temporal.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertTemporalToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TemporalType createTemporalTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createTemporalTypeFromString(OrmPackage.eINSTANCE.getTemporalType(), initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertTemporalTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertTemporalTypeToString(OrmPackage.eINSTANCE.getTemporalType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String createVersionTypeFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertVersionTypeToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OrmPackage getOrmPackage() {
    return (OrmPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OrmPackage getPackage() {
    return OrmPackage.eINSTANCE;
  }

} // OrmFactoryImpl
