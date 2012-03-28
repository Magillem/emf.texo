/**
 * <copyright>
 * </copyright>
 *
 * $Id: MappedSuperclassImpl.java,v 1.7 2011/10/25 22:27:57 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessType;
import org.eclipse.emf.texo.orm.annotations.model.orm.Attributes;
import org.eclipse.emf.texo.orm.annotations.model.orm.Cache;
import org.eclipse.emf.texo.orm.annotations.model.orm.CacheInterceptor;
import org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTracking;
import org.eclipse.emf.texo.orm.annotations.model.orm.CloneCopyPolicy;
import org.eclipse.emf.texo.orm.annotations.model.orm.Converter;
import org.eclipse.emf.texo.orm.annotations.model.orm.CopyPolicy;
import org.eclipse.emf.texo.orm.annotations.model.orm.Customizer;
import org.eclipse.emf.texo.orm.annotations.model.orm.EmptyType;
import org.eclipse.emf.texo.orm.annotations.model.orm.EntityListeners;
import org.eclipse.emf.texo.orm.annotations.model.orm.ExistenceType;
import org.eclipse.emf.texo.orm.annotations.model.orm.IdClass;
import org.eclipse.emf.texo.orm.annotations.model.orm.InstantiationCopyPolicy;
import org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass;
import org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.PostLoad;
import org.eclipse.emf.texo.orm.annotations.model.orm.PostPersist;
import org.eclipse.emf.texo.orm.annotations.model.orm.PostRemove;
import org.eclipse.emf.texo.orm.annotations.model.orm.PostUpdate;
import org.eclipse.emf.texo.orm.annotations.model.orm.PrePersist;
import org.eclipse.emf.texo.orm.annotations.model.orm.PreRemove;
import org.eclipse.emf.texo.orm.annotations.model.orm.PreUpdate;
import org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKey;
import org.eclipse.emf.texo.orm.annotations.model.orm.Property;
import org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;
import org.eclipse.emf.texo.orm.annotator.ORMJavaAnnotationGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Mapped Superclass</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getDescription <em>Description
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getCustomizer <em>Customizer
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getChangeTracking <em>Change
 * Tracking</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getIdClass <em>Id Class</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getPrimaryKey <em>Primary Key
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getOptimisticLocking <em>
 * Optimistic Locking</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getCache <em>Cache</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getCacheInterceptor <em>Cache
 * Interceptor</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getConverter <em>Converter</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getTypeConverter <em>Type
 * Converter</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getObjectTypeConverter <em>Object
 * Type Converter</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getStructConverter <em>Struct
 * Converter</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getCopyPolicy <em>Copy Policy
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getInstantiationCopyPolicy <em>
 * Instantiation Copy Policy</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getCloneCopyPolicy <em>Clone Copy
 * Policy</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getExcludeDefaultListeners <em>
 * Exclude Default Listeners</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getExcludeSuperclassListeners
 * <em>Exclude Superclass Listeners</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getEntityListeners <em>Entity
 * Listeners</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getPrePersist <em>Pre Persist
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getPostPersist <em>Post Persist
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getPreRemove <em>Pre Remove</em>}
 * </li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getPostRemove <em>Post Remove
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getPreUpdate <em>Pre Update</em>}
 * </li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getPostUpdate <em>Post Update
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getPostLoad <em>Post Load</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getProperty <em>Property</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getAttributes <em>Attributes
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getAccess <em>Access</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#isCacheable <em>Cacheable</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getClass_ <em>Class</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#isExcludeDefaultMappings <em>
 * Exclude Default Mappings</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#getExistenceChecking <em>
 * Existence Checking</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#isMetadataComplete <em>Metadata
 * Complete</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl#isReadOnly <em>Read Only</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MappedSuperclassImpl extends BaseOrmAnnotationImpl implements MappedSuperclass {
  /**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
	 * The cached value of the '{@link #getCustomizer() <em>Customizer</em>}' containment reference.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #getCustomizer()
	 * @generated
	 * @ordered
	 */
  protected Customizer customizer;

  /**
   * The cached value of the '{@link #getChangeTracking() <em>Change Tracking</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getChangeTracking()
   * @generated
   * @ordered
   */
  protected ChangeTracking changeTracking;

  /**
	 * The cached value of the '{@link #getIdClass() <em>Id Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getIdClass()
	 * @generated
	 * @ordered
	 */
  protected IdClass idClass;

  /**
	 * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' containment reference.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
  protected PrimaryKey primaryKey;

  /**
   * The cached value of the '{@link #getOptimisticLocking() <em>Optimistic Locking</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOptimisticLocking()
   * @generated
   * @ordered
   */
  protected OptimisticLocking optimisticLocking;

  /**
	 * The cached value of the '{@link #getCache() <em>Cache</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getCache()
	 * @generated
	 * @ordered
	 */
  protected Cache cache;

  /**
   * The cached value of the '{@link #getCacheInterceptor() <em>Cache Interceptor</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getCacheInterceptor()
   * @generated
   * @ordered
   */
  protected CacheInterceptor cacheInterceptor;

  /**
   * The cached value of the '{@link #getConverter() <em>Converter</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getConverter()
   * @generated
   * @ordered
   */
  protected EList<Converter> converter;

  /**
   * The cached value of the '{@link #getTypeConverter() <em>Type Converter</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTypeConverter()
   * @generated
   * @ordered
   */
  protected EList<TypeConverter> typeConverter;

  /**
	 * The cached value of the '{@link #getObjectTypeConverter() <em>Object Type Converter</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getObjectTypeConverter()
	 * @generated
	 * @ordered
	 */
  protected EList<ObjectTypeConverter> objectTypeConverter;

  /**
   * The cached value of the '{@link #getStructConverter() <em>Struct Converter</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getStructConverter()
   * @generated
   * @ordered
   */
  protected EList<StructConverter> structConverter;

  /**
	 * The cached value of the '{@link #getCopyPolicy() <em>Copy Policy</em>}' containment reference.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #getCopyPolicy()
	 * @generated
	 * @ordered
	 */
  protected CopyPolicy copyPolicy;

  /**
	 * The cached value of the '{@link #getInstantiationCopyPolicy() <em>Instantiation Copy Policy</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInstantiationCopyPolicy()
	 * @generated
	 * @ordered
	 */
  protected InstantiationCopyPolicy instantiationCopyPolicy;

  /**
   * The cached value of the '{@link #getCloneCopyPolicy() <em>Clone Copy Policy</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getCloneCopyPolicy()
   * @generated
   * @ordered
   */
  protected CloneCopyPolicy cloneCopyPolicy;

  /**
	 * The cached value of the '{@link #getExcludeDefaultListeners() <em>Exclude Default Listeners</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getExcludeDefaultListeners()
	 * @generated
	 * @ordered
	 */
  protected EmptyType excludeDefaultListeners;

  /**
	 * The cached value of the '{@link #getExcludeSuperclassListeners() <em>Exclude Superclass Listeners</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getExcludeSuperclassListeners()
	 * @generated
	 * @ordered
	 */
  protected EmptyType excludeSuperclassListeners;

  /**
   * The cached value of the '{@link #getEntityListeners() <em>Entity Listeners</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getEntityListeners()
   * @generated
   * @ordered
   */
  protected EntityListeners entityListeners;

  /**
	 * The cached value of the '{@link #getPrePersist() <em>Pre Persist</em>}' containment reference.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #getPrePersist()
	 * @generated
	 * @ordered
	 */
  protected PrePersist prePersist;

  /**
   * The cached value of the '{@link #getPostPersist() <em>Post Persist</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getPostPersist()
   * @generated
   * @ordered
   */
  protected PostPersist postPersist;

  /**
	 * The cached value of the '{@link #getPreRemove() <em>Pre Remove</em>}' containment reference.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #getPreRemove()
	 * @generated
	 * @ordered
	 */
  protected PreRemove preRemove;

  /**
	 * The cached value of the '{@link #getPostRemove() <em>Post Remove</em>}' containment reference.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #getPostRemove()
	 * @generated
	 * @ordered
	 */
  protected PostRemove postRemove;

  /**
	 * The cached value of the '{@link #getPreUpdate() <em>Pre Update</em>}' containment reference.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #getPreUpdate()
	 * @generated
	 * @ordered
	 */
  protected PreUpdate preUpdate;

  /**
	 * The cached value of the '{@link #getPostUpdate() <em>Post Update</em>}' containment reference.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #getPostUpdate()
	 * @generated
	 * @ordered
	 */
  protected PostUpdate postUpdate;

  /**
	 * The cached value of the '{@link #getPostLoad() <em>Post Load</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPostLoad()
	 * @generated
	 * @ordered
	 */
  protected PostLoad postLoad;

  /**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
  protected EList<Property> property;

  /**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
  protected Attributes attributes;

  /**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
  protected static final AccessType ACCESS_EDEFAULT = AccessType.FIELD;

  /**
   * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected AccessType access = ACCESS_EDEFAULT;

  /**
	 * This is true if the Access attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean accessESet;

  /**
	 * The default value of the '{@link #isCacheable() <em>Cacheable</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #isCacheable()
	 * @generated
	 * @ordered
	 */
  protected static final boolean CACHEABLE_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isCacheable() <em>Cacheable</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #isCacheable()
	 * @generated
	 * @ordered
	 */
  protected boolean cacheable = CACHEABLE_EDEFAULT;

  /**
	 * This is true if the Cacheable attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean cacheableESet;

  /**
   * The default value of the '{@link #getClass_() <em>Class</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected static final String CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected String class_ = CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #isExcludeDefaultMappings() <em>Exclude Default Mappings</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isExcludeDefaultMappings()
   * @generated
   * @ordered
   */
  protected static final boolean EXCLUDE_DEFAULT_MAPPINGS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExcludeDefaultMappings() <em>Exclude Default Mappings</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isExcludeDefaultMappings()
   * @generated
   * @ordered
   */
  protected boolean excludeDefaultMappings = EXCLUDE_DEFAULT_MAPPINGS_EDEFAULT;

  /**
	 * This is true if the Exclude Default Mappings attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean excludeDefaultMappingsESet;

  /**
   * The default value of the '{@link #getExistenceChecking() <em>Existence Checking</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getExistenceChecking()
   * @generated
   * @ordered
   */
  protected static final ExistenceType EXISTENCE_CHECKING_EDEFAULT = ExistenceType.CHECKCACHE;

  /**
   * The cached value of the '{@link #getExistenceChecking() <em>Existence Checking</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getExistenceChecking()
   * @generated
   * @ordered
   */
  protected ExistenceType existenceChecking = EXISTENCE_CHECKING_EDEFAULT;

  /**
	 * This is true if the Existence Checking attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean existenceCheckingESet;

  /**
	 * The default value of the '{@link #isMetadataComplete() <em>Metadata Complete</em>}' attribute.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #isMetadataComplete()
	 * @generated
	 * @ordered
	 */
  protected static final boolean METADATA_COMPLETE_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isMetadataComplete() <em>Metadata Complete</em>}' attribute.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #isMetadataComplete()
	 * @generated
	 * @ordered
	 */
  protected boolean metadataComplete = METADATA_COMPLETE_EDEFAULT;

  /**
	 * This is true if the Metadata Complete attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean metadataCompleteESet;

  /**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
  protected static final boolean READ_ONLY_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
  protected boolean readOnly = READ_ONLY_EDEFAULT;

  /**
	 * This is true if the Read Only attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean readOnlyESet;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected MappedSuperclassImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return OrmPackage.eINSTANCE.getMappedSuperclass();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public String getDescription() {
		return description;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public Customizer getCustomizer() {
		return customizer;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCustomizer(Customizer newCustomizer, NotificationChain msgs) {
		Customizer oldCustomizer = customizer;
		customizer = newCustomizer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__CUSTOMIZER, oldCustomizer, newCustomizer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setCustomizer(Customizer newCustomizer) {
		if (newCustomizer != customizer) {
			NotificationChain msgs = null;
			if (customizer != null)
				msgs = ((InternalEObject)customizer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__CUSTOMIZER, null, msgs);
			if (newCustomizer != null)
				msgs = ((InternalEObject)newCustomizer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__CUSTOMIZER, null, msgs);
			msgs = basicSetCustomizer(newCustomizer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__CUSTOMIZER, newCustomizer, newCustomizer));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public ChangeTracking getChangeTracking() {
		return changeTracking;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetChangeTracking(ChangeTracking newChangeTracking, NotificationChain msgs) {
		ChangeTracking oldChangeTracking = changeTracking;
		changeTracking = newChangeTracking;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__CHANGE_TRACKING, oldChangeTracking, newChangeTracking);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setChangeTracking(ChangeTracking newChangeTracking) {
		if (newChangeTracking != changeTracking) {
			NotificationChain msgs = null;
			if (changeTracking != null)
				msgs = ((InternalEObject)changeTracking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__CHANGE_TRACKING, null, msgs);
			if (newChangeTracking != null)
				msgs = ((InternalEObject)newChangeTracking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__CHANGE_TRACKING, null, msgs);
			msgs = basicSetChangeTracking(newChangeTracking, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__CHANGE_TRACKING, newChangeTracking, newChangeTracking));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public IdClass getIdClass() {
		return idClass;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetIdClass(IdClass newIdClass, NotificationChain msgs) {
		IdClass oldIdClass = idClass;
		idClass = newIdClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__ID_CLASS, oldIdClass, newIdClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setIdClass(IdClass newIdClass) {
		if (newIdClass != idClass) {
			NotificationChain msgs = null;
			if (idClass != null)
				msgs = ((InternalEObject)idClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__ID_CLASS, null, msgs);
			if (newIdClass != null)
				msgs = ((InternalEObject)newIdClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__ID_CLASS, null, msgs);
			msgs = basicSetIdClass(newIdClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__ID_CLASS, newIdClass, newIdClass));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public PrimaryKey getPrimaryKey() {
		return primaryKey;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPrimaryKey(PrimaryKey newPrimaryKey, NotificationChain msgs) {
		PrimaryKey oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__PRIMARY_KEY, oldPrimaryKey, newPrimaryKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setPrimaryKey(PrimaryKey newPrimaryKey) {
		if (newPrimaryKey != primaryKey) {
			NotificationChain msgs = null;
			if (primaryKey != null)
				msgs = ((InternalEObject)primaryKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__PRIMARY_KEY, null, msgs);
			if (newPrimaryKey != null)
				msgs = ((InternalEObject)newPrimaryKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__PRIMARY_KEY, null, msgs);
			msgs = basicSetPrimaryKey(newPrimaryKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__PRIMARY_KEY, newPrimaryKey, newPrimaryKey));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public OptimisticLocking getOptimisticLocking() {
		return optimisticLocking;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetOptimisticLocking(OptimisticLocking newOptimisticLocking, NotificationChain msgs) {
		OptimisticLocking oldOptimisticLocking = optimisticLocking;
		optimisticLocking = newOptimisticLocking;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__OPTIMISTIC_LOCKING, oldOptimisticLocking, newOptimisticLocking);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setOptimisticLocking(OptimisticLocking newOptimisticLocking) {
		if (newOptimisticLocking != optimisticLocking) {
			NotificationChain msgs = null;
			if (optimisticLocking != null)
				msgs = ((InternalEObject)optimisticLocking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__OPTIMISTIC_LOCKING, null, msgs);
			if (newOptimisticLocking != null)
				msgs = ((InternalEObject)newOptimisticLocking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__OPTIMISTIC_LOCKING, null, msgs);
			msgs = basicSetOptimisticLocking(newOptimisticLocking, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__OPTIMISTIC_LOCKING, newOptimisticLocking, newOptimisticLocking));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public Cache getCache() {
		return cache;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCache(Cache newCache, NotificationChain msgs) {
		Cache oldCache = cache;
		cache = newCache;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__CACHE, oldCache, newCache);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setCache(Cache newCache) {
		if (newCache != cache) {
			NotificationChain msgs = null;
			if (cache != null)
				msgs = ((InternalEObject)cache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__CACHE, null, msgs);
			if (newCache != null)
				msgs = ((InternalEObject)newCache).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__CACHE, null, msgs);
			msgs = basicSetCache(newCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__CACHE, newCache, newCache));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public CacheInterceptor getCacheInterceptor() {
		return cacheInterceptor;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCacheInterceptor(CacheInterceptor newCacheInterceptor, NotificationChain msgs) {
		CacheInterceptor oldCacheInterceptor = cacheInterceptor;
		cacheInterceptor = newCacheInterceptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__CACHE_INTERCEPTOR, oldCacheInterceptor, newCacheInterceptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setCacheInterceptor(CacheInterceptor newCacheInterceptor) {
		if (newCacheInterceptor != cacheInterceptor) {
			NotificationChain msgs = null;
			if (cacheInterceptor != null)
				msgs = ((InternalEObject)cacheInterceptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__CACHE_INTERCEPTOR, null, msgs);
			if (newCacheInterceptor != null)
				msgs = ((InternalEObject)newCacheInterceptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__CACHE_INTERCEPTOR, null, msgs);
			msgs = basicSetCacheInterceptor(newCacheInterceptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__CACHE_INTERCEPTOR, newCacheInterceptor, newCacheInterceptor));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Converter> getConverter() {
		if (converter == null) {
			converter = new EObjectContainmentEList<Converter>(Converter.class, this, OrmPackage.MAPPED_SUPERCLASS__CONVERTER);
		}
		return converter;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<TypeConverter> getTypeConverter() {
		if (typeConverter == null) {
			typeConverter = new EObjectContainmentEList<TypeConverter>(TypeConverter.class, this, OrmPackage.MAPPED_SUPERCLASS__TYPE_CONVERTER);
		}
		return typeConverter;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ObjectTypeConverter> getObjectTypeConverter() {
		if (objectTypeConverter == null) {
			objectTypeConverter = new EObjectContainmentEList<ObjectTypeConverter>(ObjectTypeConverter.class, this, OrmPackage.MAPPED_SUPERCLASS__OBJECT_TYPE_CONVERTER);
		}
		return objectTypeConverter;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<StructConverter> getStructConverter() {
		if (structConverter == null) {
			structConverter = new EObjectContainmentEList<StructConverter>(StructConverter.class, this, OrmPackage.MAPPED_SUPERCLASS__STRUCT_CONVERTER);
		}
		return structConverter;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public CopyPolicy getCopyPolicy() {
		return copyPolicy;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCopyPolicy(CopyPolicy newCopyPolicy, NotificationChain msgs) {
		CopyPolicy oldCopyPolicy = copyPolicy;
		copyPolicy = newCopyPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__COPY_POLICY, oldCopyPolicy, newCopyPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setCopyPolicy(CopyPolicy newCopyPolicy) {
		if (newCopyPolicy != copyPolicy) {
			NotificationChain msgs = null;
			if (copyPolicy != null)
				msgs = ((InternalEObject)copyPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__COPY_POLICY, null, msgs);
			if (newCopyPolicy != null)
				msgs = ((InternalEObject)newCopyPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__COPY_POLICY, null, msgs);
			msgs = basicSetCopyPolicy(newCopyPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__COPY_POLICY, newCopyPolicy, newCopyPolicy));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public InstantiationCopyPolicy getInstantiationCopyPolicy() {
		return instantiationCopyPolicy;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetInstantiationCopyPolicy(InstantiationCopyPolicy newInstantiationCopyPolicy,
      NotificationChain msgs) {
		InstantiationCopyPolicy oldInstantiationCopyPolicy = instantiationCopyPolicy;
		instantiationCopyPolicy = newInstantiationCopyPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__INSTANTIATION_COPY_POLICY, oldInstantiationCopyPolicy, newInstantiationCopyPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setInstantiationCopyPolicy(InstantiationCopyPolicy newInstantiationCopyPolicy) {
		if (newInstantiationCopyPolicy != instantiationCopyPolicy) {
			NotificationChain msgs = null;
			if (instantiationCopyPolicy != null)
				msgs = ((InternalEObject)instantiationCopyPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__INSTANTIATION_COPY_POLICY, null, msgs);
			if (newInstantiationCopyPolicy != null)
				msgs = ((InternalEObject)newInstantiationCopyPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__INSTANTIATION_COPY_POLICY, null, msgs);
			msgs = basicSetInstantiationCopyPolicy(newInstantiationCopyPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__INSTANTIATION_COPY_POLICY, newInstantiationCopyPolicy, newInstantiationCopyPolicy));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public CloneCopyPolicy getCloneCopyPolicy() {
		return cloneCopyPolicy;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCloneCopyPolicy(CloneCopyPolicy newCloneCopyPolicy, NotificationChain msgs) {
		CloneCopyPolicy oldCloneCopyPolicy = cloneCopyPolicy;
		cloneCopyPolicy = newCloneCopyPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__CLONE_COPY_POLICY, oldCloneCopyPolicy, newCloneCopyPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setCloneCopyPolicy(CloneCopyPolicy newCloneCopyPolicy) {
		if (newCloneCopyPolicy != cloneCopyPolicy) {
			NotificationChain msgs = null;
			if (cloneCopyPolicy != null)
				msgs = ((InternalEObject)cloneCopyPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__CLONE_COPY_POLICY, null, msgs);
			if (newCloneCopyPolicy != null)
				msgs = ((InternalEObject)newCloneCopyPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__CLONE_COPY_POLICY, null, msgs);
			msgs = basicSetCloneCopyPolicy(newCloneCopyPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__CLONE_COPY_POLICY, newCloneCopyPolicy, newCloneCopyPolicy));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EmptyType getExcludeDefaultListeners() {
		return excludeDefaultListeners;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetExcludeDefaultListeners(EmptyType newExcludeDefaultListeners, NotificationChain msgs) {
		EmptyType oldExcludeDefaultListeners = excludeDefaultListeners;
		excludeDefaultListeners = newExcludeDefaultListeners;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS, oldExcludeDefaultListeners, newExcludeDefaultListeners);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setExcludeDefaultListeners(EmptyType newExcludeDefaultListeners) {
		if (newExcludeDefaultListeners != excludeDefaultListeners) {
			NotificationChain msgs = null;
			if (excludeDefaultListeners != null)
				msgs = ((InternalEObject)excludeDefaultListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS, null, msgs);
			if (newExcludeDefaultListeners != null)
				msgs = ((InternalEObject)newExcludeDefaultListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS, null, msgs);
			msgs = basicSetExcludeDefaultListeners(newExcludeDefaultListeners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS, newExcludeDefaultListeners, newExcludeDefaultListeners));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EmptyType getExcludeSuperclassListeners() {
		return excludeSuperclassListeners;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetExcludeSuperclassListeners(EmptyType newExcludeSuperclassListeners,
      NotificationChain msgs) {
		EmptyType oldExcludeSuperclassListeners = excludeSuperclassListeners;
		excludeSuperclassListeners = newExcludeSuperclassListeners;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS, oldExcludeSuperclassListeners, newExcludeSuperclassListeners);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setExcludeSuperclassListeners(EmptyType newExcludeSuperclassListeners) {
		if (newExcludeSuperclassListeners != excludeSuperclassListeners) {
			NotificationChain msgs = null;
			if (excludeSuperclassListeners != null)
				msgs = ((InternalEObject)excludeSuperclassListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS, null, msgs);
			if (newExcludeSuperclassListeners != null)
				msgs = ((InternalEObject)newExcludeSuperclassListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS, null, msgs);
			msgs = basicSetExcludeSuperclassListeners(newExcludeSuperclassListeners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS, newExcludeSuperclassListeners, newExcludeSuperclassListeners));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EntityListeners getEntityListeners() {
		return entityListeners;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetEntityListeners(EntityListeners newEntityListeners, NotificationChain msgs) {
		EntityListeners oldEntityListeners = entityListeners;
		entityListeners = newEntityListeners;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__ENTITY_LISTENERS, oldEntityListeners, newEntityListeners);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setEntityListeners(EntityListeners newEntityListeners) {
		if (newEntityListeners != entityListeners) {
			NotificationChain msgs = null;
			if (entityListeners != null)
				msgs = ((InternalEObject)entityListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__ENTITY_LISTENERS, null, msgs);
			if (newEntityListeners != null)
				msgs = ((InternalEObject)newEntityListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__ENTITY_LISTENERS, null, msgs);
			msgs = basicSetEntityListeners(newEntityListeners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__ENTITY_LISTENERS, newEntityListeners, newEntityListeners));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public PrePersist getPrePersist() {
		return prePersist;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPrePersist(PrePersist newPrePersist, NotificationChain msgs) {
		PrePersist oldPrePersist = prePersist;
		prePersist = newPrePersist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__PRE_PERSIST, oldPrePersist, newPrePersist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setPrePersist(PrePersist newPrePersist) {
		if (newPrePersist != prePersist) {
			NotificationChain msgs = null;
			if (prePersist != null)
				msgs = ((InternalEObject)prePersist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__PRE_PERSIST, null, msgs);
			if (newPrePersist != null)
				msgs = ((InternalEObject)newPrePersist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__PRE_PERSIST, null, msgs);
			msgs = basicSetPrePersist(newPrePersist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__PRE_PERSIST, newPrePersist, newPrePersist));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public PostPersist getPostPersist() {
		return postPersist;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPostPersist(PostPersist newPostPersist, NotificationChain msgs) {
		PostPersist oldPostPersist = postPersist;
		postPersist = newPostPersist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__POST_PERSIST, oldPostPersist, newPostPersist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setPostPersist(PostPersist newPostPersist) {
		if (newPostPersist != postPersist) {
			NotificationChain msgs = null;
			if (postPersist != null)
				msgs = ((InternalEObject)postPersist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__POST_PERSIST, null, msgs);
			if (newPostPersist != null)
				msgs = ((InternalEObject)newPostPersist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__POST_PERSIST, null, msgs);
			msgs = basicSetPostPersist(newPostPersist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__POST_PERSIST, newPostPersist, newPostPersist));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public PreRemove getPreRemove() {
		return preRemove;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPreRemove(PreRemove newPreRemove, NotificationChain msgs) {
		PreRemove oldPreRemove = preRemove;
		preRemove = newPreRemove;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__PRE_REMOVE, oldPreRemove, newPreRemove);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setPreRemove(PreRemove newPreRemove) {
		if (newPreRemove != preRemove) {
			NotificationChain msgs = null;
			if (preRemove != null)
				msgs = ((InternalEObject)preRemove).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__PRE_REMOVE, null, msgs);
			if (newPreRemove != null)
				msgs = ((InternalEObject)newPreRemove).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__PRE_REMOVE, null, msgs);
			msgs = basicSetPreRemove(newPreRemove, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__PRE_REMOVE, newPreRemove, newPreRemove));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public PostRemove getPostRemove() {
		return postRemove;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPostRemove(PostRemove newPostRemove, NotificationChain msgs) {
		PostRemove oldPostRemove = postRemove;
		postRemove = newPostRemove;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__POST_REMOVE, oldPostRemove, newPostRemove);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setPostRemove(PostRemove newPostRemove) {
		if (newPostRemove != postRemove) {
			NotificationChain msgs = null;
			if (postRemove != null)
				msgs = ((InternalEObject)postRemove).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__POST_REMOVE, null, msgs);
			if (newPostRemove != null)
				msgs = ((InternalEObject)newPostRemove).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__POST_REMOVE, null, msgs);
			msgs = basicSetPostRemove(newPostRemove, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__POST_REMOVE, newPostRemove, newPostRemove));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public PreUpdate getPreUpdate() {
		return preUpdate;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPreUpdate(PreUpdate newPreUpdate, NotificationChain msgs) {
		PreUpdate oldPreUpdate = preUpdate;
		preUpdate = newPreUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__PRE_UPDATE, oldPreUpdate, newPreUpdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setPreUpdate(PreUpdate newPreUpdate) {
		if (newPreUpdate != preUpdate) {
			NotificationChain msgs = null;
			if (preUpdate != null)
				msgs = ((InternalEObject)preUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__PRE_UPDATE, null, msgs);
			if (newPreUpdate != null)
				msgs = ((InternalEObject)newPreUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__PRE_UPDATE, null, msgs);
			msgs = basicSetPreUpdate(newPreUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__PRE_UPDATE, newPreUpdate, newPreUpdate));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public PostUpdate getPostUpdate() {
		return postUpdate;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPostUpdate(PostUpdate newPostUpdate, NotificationChain msgs) {
		PostUpdate oldPostUpdate = postUpdate;
		postUpdate = newPostUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__POST_UPDATE, oldPostUpdate, newPostUpdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setPostUpdate(PostUpdate newPostUpdate) {
		if (newPostUpdate != postUpdate) {
			NotificationChain msgs = null;
			if (postUpdate != null)
				msgs = ((InternalEObject)postUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__POST_UPDATE, null, msgs);
			if (newPostUpdate != null)
				msgs = ((InternalEObject)newPostUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__POST_UPDATE, null, msgs);
			msgs = basicSetPostUpdate(newPostUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__POST_UPDATE, newPostUpdate, newPostUpdate));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public PostLoad getPostLoad() {
		return postLoad;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPostLoad(PostLoad newPostLoad, NotificationChain msgs) {
		PostLoad oldPostLoad = postLoad;
		postLoad = newPostLoad;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__POST_LOAD, oldPostLoad, newPostLoad);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setPostLoad(PostLoad newPostLoad) {
		if (newPostLoad != postLoad) {
			NotificationChain msgs = null;
			if (postLoad != null)
				msgs = ((InternalEObject)postLoad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__POST_LOAD, null, msgs);
			if (newPostLoad != null)
				msgs = ((InternalEObject)newPostLoad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__POST_LOAD, null, msgs);
			msgs = basicSetPostLoad(newPostLoad, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__POST_LOAD, newPostLoad, newPostLoad));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class, this, OrmPackage.MAPPED_SUPERCLASS__PROPERTY);
		}
		return property;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public Attributes getAttributes() {
		return attributes;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAttributes(Attributes newAttributes, NotificationChain msgs) {
		Attributes oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setAttributes(Attributes newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MAPPED_SUPERCLASS__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__ATTRIBUTES, newAttributes, newAttributes));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public AccessType getAccess() {
		return access;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setAccess(AccessType newAccess) {
		AccessType oldAccess = access;
		access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
		boolean oldAccessESet = accessESet;
		accessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__ACCESS, oldAccess, access, !oldAccessESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetAccess() {
		AccessType oldAccess = access;
		boolean oldAccessESet = accessESet;
		access = ACCESS_EDEFAULT;
		accessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MAPPED_SUPERCLASS__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetAccess() {
		return accessESet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isCacheable() {
		return cacheable;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setCacheable(boolean newCacheable) {
		boolean oldCacheable = cacheable;
		cacheable = newCacheable;
		boolean oldCacheableESet = cacheableESet;
		cacheableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__CACHEABLE, oldCacheable, cacheable, !oldCacheableESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetCacheable() {
		boolean oldCacheable = cacheable;
		boolean oldCacheableESet = cacheableESet;
		cacheable = CACHEABLE_EDEFAULT;
		cacheableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MAPPED_SUPERCLASS__CACHEABLE, oldCacheable, CACHEABLE_EDEFAULT, oldCacheableESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetCacheable() {
		return cacheableESet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public String getClass_() {
		return class_;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__CLASS, oldClass, class_));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isExcludeDefaultMappings() {
		return excludeDefaultMappings;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setExcludeDefaultMappings(boolean newExcludeDefaultMappings) {
		boolean oldExcludeDefaultMappings = excludeDefaultMappings;
		excludeDefaultMappings = newExcludeDefaultMappings;
		boolean oldExcludeDefaultMappingsESet = excludeDefaultMappingsESet;
		excludeDefaultMappingsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_MAPPINGS, oldExcludeDefaultMappings, excludeDefaultMappings, !oldExcludeDefaultMappingsESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetExcludeDefaultMappings() {
		boolean oldExcludeDefaultMappings = excludeDefaultMappings;
		boolean oldExcludeDefaultMappingsESet = excludeDefaultMappingsESet;
		excludeDefaultMappings = EXCLUDE_DEFAULT_MAPPINGS_EDEFAULT;
		excludeDefaultMappingsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_MAPPINGS, oldExcludeDefaultMappings, EXCLUDE_DEFAULT_MAPPINGS_EDEFAULT, oldExcludeDefaultMappingsESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetExcludeDefaultMappings() {
		return excludeDefaultMappingsESet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public ExistenceType getExistenceChecking() {
		return existenceChecking;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setExistenceChecking(ExistenceType newExistenceChecking) {
		ExistenceType oldExistenceChecking = existenceChecking;
		existenceChecking = newExistenceChecking == null ? EXISTENCE_CHECKING_EDEFAULT : newExistenceChecking;
		boolean oldExistenceCheckingESet = existenceCheckingESet;
		existenceCheckingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__EXISTENCE_CHECKING, oldExistenceChecking, existenceChecking, !oldExistenceCheckingESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetExistenceChecking() {
		ExistenceType oldExistenceChecking = existenceChecking;
		boolean oldExistenceCheckingESet = existenceCheckingESet;
		existenceChecking = EXISTENCE_CHECKING_EDEFAULT;
		existenceCheckingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MAPPED_SUPERCLASS__EXISTENCE_CHECKING, oldExistenceChecking, EXISTENCE_CHECKING_EDEFAULT, oldExistenceCheckingESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetExistenceChecking() {
		return existenceCheckingESet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isMetadataComplete() {
		return metadataComplete;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setMetadataComplete(boolean newMetadataComplete) {
		boolean oldMetadataComplete = metadataComplete;
		metadataComplete = newMetadataComplete;
		boolean oldMetadataCompleteESet = metadataCompleteESet;
		metadataCompleteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__METADATA_COMPLETE, oldMetadataComplete, metadataComplete, !oldMetadataCompleteESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetMetadataComplete() {
		boolean oldMetadataComplete = metadataComplete;
		boolean oldMetadataCompleteESet = metadataCompleteESet;
		metadataComplete = METADATA_COMPLETE_EDEFAULT;
		metadataCompleteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MAPPED_SUPERCLASS__METADATA_COMPLETE, oldMetadataComplete, METADATA_COMPLETE_EDEFAULT, oldMetadataCompleteESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetMetadataComplete() {
		return metadataCompleteESet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isReadOnly() {
		return readOnly;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		boolean oldReadOnlyESet = readOnlyESet;
		readOnlyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAPPED_SUPERCLASS__READ_ONLY, oldReadOnly, readOnly, !oldReadOnlyESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetReadOnly() {
		boolean oldReadOnly = readOnly;
		boolean oldReadOnlyESet = readOnlyESet;
		readOnly = READ_ONLY_EDEFAULT;
		readOnlyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MAPPED_SUPERCLASS__READ_ONLY, oldReadOnly, READ_ONLY_EDEFAULT, oldReadOnlyESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetReadOnly() {
		return readOnlyESet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrmPackage.MAPPED_SUPERCLASS__CUSTOMIZER:
				return basicSetCustomizer(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__CHANGE_TRACKING:
				return basicSetChangeTracking(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__ID_CLASS:
				return basicSetIdClass(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__PRIMARY_KEY:
				return basicSetPrimaryKey(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__OPTIMISTIC_LOCKING:
				return basicSetOptimisticLocking(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__CACHE:
				return basicSetCache(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__CACHE_INTERCEPTOR:
				return basicSetCacheInterceptor(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__CONVERTER:
				return ((InternalEList<?>)getConverter()).basicRemove(otherEnd, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__TYPE_CONVERTER:
				return ((InternalEList<?>)getTypeConverter()).basicRemove(otherEnd, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__OBJECT_TYPE_CONVERTER:
				return ((InternalEList<?>)getObjectTypeConverter()).basicRemove(otherEnd, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__STRUCT_CONVERTER:
				return ((InternalEList<?>)getStructConverter()).basicRemove(otherEnd, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__COPY_POLICY:
				return basicSetCopyPolicy(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__INSTANTIATION_COPY_POLICY:
				return basicSetInstantiationCopyPolicy(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__CLONE_COPY_POLICY:
				return basicSetCloneCopyPolicy(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS:
				return basicSetExcludeDefaultListeners(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS:
				return basicSetExcludeSuperclassListeners(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__ENTITY_LISTENERS:
				return basicSetEntityListeners(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__PRE_PERSIST:
				return basicSetPrePersist(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__POST_PERSIST:
				return basicSetPostPersist(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__PRE_REMOVE:
				return basicSetPreRemove(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__POST_REMOVE:
				return basicSetPostRemove(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__PRE_UPDATE:
				return basicSetPreUpdate(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__POST_UPDATE:
				return basicSetPostUpdate(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__POST_LOAD:
				return basicSetPostLoad(null, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case OrmPackage.MAPPED_SUPERCLASS__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrmPackage.MAPPED_SUPERCLASS__DESCRIPTION:
				return getDescription();
			case OrmPackage.MAPPED_SUPERCLASS__CUSTOMIZER:
				return getCustomizer();
			case OrmPackage.MAPPED_SUPERCLASS__CHANGE_TRACKING:
				return getChangeTracking();
			case OrmPackage.MAPPED_SUPERCLASS__ID_CLASS:
				return getIdClass();
			case OrmPackage.MAPPED_SUPERCLASS__PRIMARY_KEY:
				return getPrimaryKey();
			case OrmPackage.MAPPED_SUPERCLASS__OPTIMISTIC_LOCKING:
				return getOptimisticLocking();
			case OrmPackage.MAPPED_SUPERCLASS__CACHE:
				return getCache();
			case OrmPackage.MAPPED_SUPERCLASS__CACHE_INTERCEPTOR:
				return getCacheInterceptor();
			case OrmPackage.MAPPED_SUPERCLASS__CONVERTER:
				return getConverter();
			case OrmPackage.MAPPED_SUPERCLASS__TYPE_CONVERTER:
				return getTypeConverter();
			case OrmPackage.MAPPED_SUPERCLASS__OBJECT_TYPE_CONVERTER:
				return getObjectTypeConverter();
			case OrmPackage.MAPPED_SUPERCLASS__STRUCT_CONVERTER:
				return getStructConverter();
			case OrmPackage.MAPPED_SUPERCLASS__COPY_POLICY:
				return getCopyPolicy();
			case OrmPackage.MAPPED_SUPERCLASS__INSTANTIATION_COPY_POLICY:
				return getInstantiationCopyPolicy();
			case OrmPackage.MAPPED_SUPERCLASS__CLONE_COPY_POLICY:
				return getCloneCopyPolicy();
			case OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS:
				return getExcludeDefaultListeners();
			case OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS:
				return getExcludeSuperclassListeners();
			case OrmPackage.MAPPED_SUPERCLASS__ENTITY_LISTENERS:
				return getEntityListeners();
			case OrmPackage.MAPPED_SUPERCLASS__PRE_PERSIST:
				return getPrePersist();
			case OrmPackage.MAPPED_SUPERCLASS__POST_PERSIST:
				return getPostPersist();
			case OrmPackage.MAPPED_SUPERCLASS__PRE_REMOVE:
				return getPreRemove();
			case OrmPackage.MAPPED_SUPERCLASS__POST_REMOVE:
				return getPostRemove();
			case OrmPackage.MAPPED_SUPERCLASS__PRE_UPDATE:
				return getPreUpdate();
			case OrmPackage.MAPPED_SUPERCLASS__POST_UPDATE:
				return getPostUpdate();
			case OrmPackage.MAPPED_SUPERCLASS__POST_LOAD:
				return getPostLoad();
			case OrmPackage.MAPPED_SUPERCLASS__PROPERTY:
				return getProperty();
			case OrmPackage.MAPPED_SUPERCLASS__ATTRIBUTES:
				return getAttributes();
			case OrmPackage.MAPPED_SUPERCLASS__ACCESS:
				return getAccess();
			case OrmPackage.MAPPED_SUPERCLASS__CACHEABLE:
				return isCacheable();
			case OrmPackage.MAPPED_SUPERCLASS__CLASS:
				return getClass_();
			case OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_MAPPINGS:
				return isExcludeDefaultMappings();
			case OrmPackage.MAPPED_SUPERCLASS__EXISTENCE_CHECKING:
				return getExistenceChecking();
			case OrmPackage.MAPPED_SUPERCLASS__METADATA_COMPLETE:
				return isMetadataComplete();
			case OrmPackage.MAPPED_SUPERCLASS__READ_ONLY:
				return isReadOnly();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrmPackage.MAPPED_SUPERCLASS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__CUSTOMIZER:
				setCustomizer((Customizer)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__CHANGE_TRACKING:
				setChangeTracking((ChangeTracking)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__ID_CLASS:
				setIdClass((IdClass)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__OPTIMISTIC_LOCKING:
				setOptimisticLocking((OptimisticLocking)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__CACHE:
				setCache((Cache)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__CACHE_INTERCEPTOR:
				setCacheInterceptor((CacheInterceptor)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__CONVERTER:
				getConverter().clear();
				getConverter().addAll((Collection<? extends Converter>)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__TYPE_CONVERTER:
				getTypeConverter().clear();
				getTypeConverter().addAll((Collection<? extends TypeConverter>)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__OBJECT_TYPE_CONVERTER:
				getObjectTypeConverter().clear();
				getObjectTypeConverter().addAll((Collection<? extends ObjectTypeConverter>)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__STRUCT_CONVERTER:
				getStructConverter().clear();
				getStructConverter().addAll((Collection<? extends StructConverter>)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__COPY_POLICY:
				setCopyPolicy((CopyPolicy)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__INSTANTIATION_COPY_POLICY:
				setInstantiationCopyPolicy((InstantiationCopyPolicy)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__CLONE_COPY_POLICY:
				setCloneCopyPolicy((CloneCopyPolicy)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS:
				setExcludeDefaultListeners((EmptyType)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS:
				setExcludeSuperclassListeners((EmptyType)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__ENTITY_LISTENERS:
				setEntityListeners((EntityListeners)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__PRE_PERSIST:
				setPrePersist((PrePersist)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__POST_PERSIST:
				setPostPersist((PostPersist)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__PRE_REMOVE:
				setPreRemove((PreRemove)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__POST_REMOVE:
				setPostRemove((PostRemove)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__PRE_UPDATE:
				setPreUpdate((PreUpdate)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__POST_UPDATE:
				setPostUpdate((PostUpdate)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__POST_LOAD:
				setPostLoad((PostLoad)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__ATTRIBUTES:
				setAttributes((Attributes)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__ACCESS:
				setAccess((AccessType)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__CACHEABLE:
				setCacheable((Boolean)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__CLASS:
				setClass((String)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_MAPPINGS:
				setExcludeDefaultMappings((Boolean)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__EXISTENCE_CHECKING:
				setExistenceChecking((ExistenceType)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__METADATA_COMPLETE:
				setMetadataComplete((Boolean)newValue);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID) {
		switch (featureID) {
			case OrmPackage.MAPPED_SUPERCLASS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__CUSTOMIZER:
				setCustomizer((Customizer)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__CHANGE_TRACKING:
				setChangeTracking((ChangeTracking)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__ID_CLASS:
				setIdClass((IdClass)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__OPTIMISTIC_LOCKING:
				setOptimisticLocking((OptimisticLocking)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__CACHE:
				setCache((Cache)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__CACHE_INTERCEPTOR:
				setCacheInterceptor((CacheInterceptor)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__CONVERTER:
				getConverter().clear();
				return;
			case OrmPackage.MAPPED_SUPERCLASS__TYPE_CONVERTER:
				getTypeConverter().clear();
				return;
			case OrmPackage.MAPPED_SUPERCLASS__OBJECT_TYPE_CONVERTER:
				getObjectTypeConverter().clear();
				return;
			case OrmPackage.MAPPED_SUPERCLASS__STRUCT_CONVERTER:
				getStructConverter().clear();
				return;
			case OrmPackage.MAPPED_SUPERCLASS__COPY_POLICY:
				setCopyPolicy((CopyPolicy)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__INSTANTIATION_COPY_POLICY:
				setInstantiationCopyPolicy((InstantiationCopyPolicy)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__CLONE_COPY_POLICY:
				setCloneCopyPolicy((CloneCopyPolicy)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS:
				setExcludeDefaultListeners((EmptyType)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS:
				setExcludeSuperclassListeners((EmptyType)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__ENTITY_LISTENERS:
				setEntityListeners((EntityListeners)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__PRE_PERSIST:
				setPrePersist((PrePersist)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__POST_PERSIST:
				setPostPersist((PostPersist)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__PRE_REMOVE:
				setPreRemove((PreRemove)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__POST_REMOVE:
				setPostRemove((PostRemove)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__PRE_UPDATE:
				setPreUpdate((PreUpdate)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__POST_UPDATE:
				setPostUpdate((PostUpdate)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__POST_LOAD:
				setPostLoad((PostLoad)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__PROPERTY:
				getProperty().clear();
				return;
			case OrmPackage.MAPPED_SUPERCLASS__ATTRIBUTES:
				setAttributes((Attributes)null);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__ACCESS:
				unsetAccess();
				return;
			case OrmPackage.MAPPED_SUPERCLASS__CACHEABLE:
				unsetCacheable();
				return;
			case OrmPackage.MAPPED_SUPERCLASS__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_MAPPINGS:
				unsetExcludeDefaultMappings();
				return;
			case OrmPackage.MAPPED_SUPERCLASS__EXISTENCE_CHECKING:
				unsetExistenceChecking();
				return;
			case OrmPackage.MAPPED_SUPERCLASS__METADATA_COMPLETE:
				unsetMetadataComplete();
				return;
			case OrmPackage.MAPPED_SUPERCLASS__READ_ONLY:
				unsetReadOnly();
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OrmPackage.MAPPED_SUPERCLASS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OrmPackage.MAPPED_SUPERCLASS__CUSTOMIZER:
				return customizer != null;
			case OrmPackage.MAPPED_SUPERCLASS__CHANGE_TRACKING:
				return changeTracking != null;
			case OrmPackage.MAPPED_SUPERCLASS__ID_CLASS:
				return idClass != null;
			case OrmPackage.MAPPED_SUPERCLASS__PRIMARY_KEY:
				return primaryKey != null;
			case OrmPackage.MAPPED_SUPERCLASS__OPTIMISTIC_LOCKING:
				return optimisticLocking != null;
			case OrmPackage.MAPPED_SUPERCLASS__CACHE:
				return cache != null;
			case OrmPackage.MAPPED_SUPERCLASS__CACHE_INTERCEPTOR:
				return cacheInterceptor != null;
			case OrmPackage.MAPPED_SUPERCLASS__CONVERTER:
				return converter != null && !converter.isEmpty();
			case OrmPackage.MAPPED_SUPERCLASS__TYPE_CONVERTER:
				return typeConverter != null && !typeConverter.isEmpty();
			case OrmPackage.MAPPED_SUPERCLASS__OBJECT_TYPE_CONVERTER:
				return objectTypeConverter != null && !objectTypeConverter.isEmpty();
			case OrmPackage.MAPPED_SUPERCLASS__STRUCT_CONVERTER:
				return structConverter != null && !structConverter.isEmpty();
			case OrmPackage.MAPPED_SUPERCLASS__COPY_POLICY:
				return copyPolicy != null;
			case OrmPackage.MAPPED_SUPERCLASS__INSTANTIATION_COPY_POLICY:
				return instantiationCopyPolicy != null;
			case OrmPackage.MAPPED_SUPERCLASS__CLONE_COPY_POLICY:
				return cloneCopyPolicy != null;
			case OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS:
				return excludeDefaultListeners != null;
			case OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS:
				return excludeSuperclassListeners != null;
			case OrmPackage.MAPPED_SUPERCLASS__ENTITY_LISTENERS:
				return entityListeners != null;
			case OrmPackage.MAPPED_SUPERCLASS__PRE_PERSIST:
				return prePersist != null;
			case OrmPackage.MAPPED_SUPERCLASS__POST_PERSIST:
				return postPersist != null;
			case OrmPackage.MAPPED_SUPERCLASS__PRE_REMOVE:
				return preRemove != null;
			case OrmPackage.MAPPED_SUPERCLASS__POST_REMOVE:
				return postRemove != null;
			case OrmPackage.MAPPED_SUPERCLASS__PRE_UPDATE:
				return preUpdate != null;
			case OrmPackage.MAPPED_SUPERCLASS__POST_UPDATE:
				return postUpdate != null;
			case OrmPackage.MAPPED_SUPERCLASS__POST_LOAD:
				return postLoad != null;
			case OrmPackage.MAPPED_SUPERCLASS__PROPERTY:
				return property != null && !property.isEmpty();
			case OrmPackage.MAPPED_SUPERCLASS__ATTRIBUTES:
				return attributes != null;
			case OrmPackage.MAPPED_SUPERCLASS__ACCESS:
				return isSetAccess();
			case OrmPackage.MAPPED_SUPERCLASS__CACHEABLE:
				return isSetCacheable();
			case OrmPackage.MAPPED_SUPERCLASS__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_MAPPINGS:
				return isSetExcludeDefaultMappings();
			case OrmPackage.MAPPED_SUPERCLASS__EXISTENCE_CHECKING:
				return isSetExistenceChecking();
			case OrmPackage.MAPPED_SUPERCLASS__METADATA_COMPLETE:
				return isSetMetadataComplete();
			case OrmPackage.MAPPED_SUPERCLASS__READ_ONLY:
				return isSetReadOnly();
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", access: ");
		if (accessESet) result.append(access); else result.append("<unset>");
		result.append(", cacheable: ");
		if (cacheableESet) result.append(cacheable); else result.append("<unset>");
		result.append(", class: ");
		result.append(class_);
		result.append(", excludeDefaultMappings: ");
		if (excludeDefaultMappingsESet) result.append(excludeDefaultMappings); else result.append("<unset>");
		result.append(", existenceChecking: ");
		if (existenceCheckingESet) result.append(existenceChecking); else result.append("<unset>");
		result.append(", metadataComplete: ");
		if (metadataCompleteESet) result.append(metadataComplete); else result.append("<unset>");
		result.append(", readOnly: ");
		if (readOnlyESet) result.append(readOnly); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

  @Override
  public String getJavaAnnotation() {
    final List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
    // add just any feature to force all eattributes to be ignored
    features.add(OrmPackage.eINSTANCE.getManyToOne_Cascade());

    return ORMJavaAnnotationGenerator.getInstance().generateJavaAnnotation(this, features, true);
  }

} // MappedSuperclassImpl
