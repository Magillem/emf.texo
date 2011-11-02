package org.eclipse.modisco.kdm.event;

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
import org.eclipse.modisco.kdm.event.dao.ConsumesEventDao;
import org.eclipse.modisco.kdm.event.dao.EventActionDao;
import org.eclipse.modisco.kdm.event.dao.EventDao;
import org.eclipse.modisco.kdm.event.dao.EventElementDao;
import org.eclipse.modisco.kdm.event.dao.EventModelDao;
import org.eclipse.modisco.kdm.event.dao.EventRelationshipDao;
import org.eclipse.modisco.kdm.event.dao.EventResourceDao;
import org.eclipse.modisco.kdm.event.dao.HasStateDao;
import org.eclipse.modisco.kdm.event.dao.InitialStateDao;
import org.eclipse.modisco.kdm.event.dao.NextStateDao;
import org.eclipse.modisco.kdm.event.dao.OnEntryDao;
import org.eclipse.modisco.kdm.event.dao.OnExitDao;
import org.eclipse.modisco.kdm.event.dao.ProducesEventDao;
import org.eclipse.modisco.kdm.event.dao.ReadsStateDao;
import org.eclipse.modisco.kdm.event.dao.StateDao;
import org.eclipse.modisco.kdm.event.dao.TransitionDao;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The <b>Package</b> for the model '<em><b>event</b></em>'.
 * It contains initialization code and access to the Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class EventModelPackage extends ModelPackage {

  /**
   * Is set when the package has been initialized.
   * 
   * @generated
   */
  private static boolean isInitialized = false;

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final String NS_URI = "http://www.eclipse.org/MoDisco/kdm/event";

  /**
   * The {@link ModelFactory} for this package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final EventModelFactory MODELFACTORY = new EventModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int EVENTMODEL_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int EVENTMODEL_EVENTELEMENT_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int ABSTRACTEVENTELEMENT_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int ABSTRACTEVENTELEMENT_SOURCE_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int ABSTRACTEVENTELEMENT_EVENTRELATION_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int ABSTRACTEVENTELEMENT_ABSTRACTION_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int ABSTRACTEVENTELEMENT_IMPLEMENTATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int ABSTRACTEVENTRELATIONSHIP_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int EVENT_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int EVENT_KIND_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int EVENTRELATIONSHIP_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int EVENTRELATIONSHIP_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int EVENTRELATIONSHIP_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int EVENTRESOURCE_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int EVENTRESOURCE_EVENTELEMENT_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int STATE_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int TRANSITION_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int ONENTRY_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int ONEXIT_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int EVENTACTION_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int EVENTACTION_KIND_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int EVENTACTION_EVENTELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int READSSTATE_CLASSIFIER_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int READSSTATE_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int READSSTATE_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int PRODUCESEVENT_CLASSIFIER_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int PRODUCESEVENT_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int PRODUCESEVENT_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int CONSUMESEVENT_CLASSIFIER_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int CONSUMESEVENT_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int CONSUMESEVENT_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int NEXTSTATE_CLASSIFIER_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int NEXTSTATE_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int NEXTSTATE_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int INITIALSTATE_CLASSIFIER_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int EVENTELEMENT_CLASSIFIER_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int HASSTATE_CLASSIFIER_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int HASSTATE_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int HASSTATE_FROM_FEATURE_ID = 5;

  /**
   * The static member with the instance of this {@link ModelPackage}.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final EventModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static EventModelPackage initialize() {

    if (isInitialized) {
      return (EventModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final EventModelPackage modelPackage = new EventModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    isInitialized = true;

    KdmModelPackage.initialize();
    CoreModelPackage.initialize();
    org.eclipse.modisco.kdm.kdm.KdmModelPackage.initialize();
    SourceModelPackage.initialize();
    CodeModelPackage.initialize();
    ActionModelPackage.initialize();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(EventModel.class, modelPackage.getEventModelEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractEventElement.class,
        modelPackage.getAbstractEventElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractEventRelationship.class,
        modelPackage.getAbstractEventRelationshipEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Event.class, modelPackage.getEventEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(EventRelationship.class,
        modelPackage.getEventRelationshipEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(EventResource.class, modelPackage.getEventResourceEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(State.class, modelPackage.getStateEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Transition.class, modelPackage.getTransitionEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(OnEntry.class, modelPackage.getOnEntryEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(OnExit.class, modelPackage.getOnExitEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(EventAction.class, modelPackage.getEventActionEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ReadsState.class, modelPackage.getReadsStateEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ProducesEvent.class, modelPackage.getProducesEventEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ConsumesEvent.class, modelPackage.getConsumesEventEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(NextState.class, modelPackage.getNextStateEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(InitialState.class, modelPackage.getInitialStateEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(EventElement.class, modelPackage.getEventElementEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(HasState.class, modelPackage.getHasStateEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(EventModel.class, EventModelDao.class);

    DaoRegistry.getInstance().registerDao(Event.class, EventDao.class);

    DaoRegistry.getInstance().registerDao(EventRelationship.class, EventRelationshipDao.class);

    DaoRegistry.getInstance().registerDao(EventResource.class, EventResourceDao.class);

    DaoRegistry.getInstance().registerDao(State.class, StateDao.class);

    DaoRegistry.getInstance().registerDao(Transition.class, TransitionDao.class);

    DaoRegistry.getInstance().registerDao(OnEntry.class, OnEntryDao.class);

    DaoRegistry.getInstance().registerDao(OnExit.class, OnExitDao.class);

    DaoRegistry.getInstance().registerDao(EventAction.class, EventActionDao.class);

    DaoRegistry.getInstance().registerDao(ReadsState.class, ReadsStateDao.class);

    DaoRegistry.getInstance().registerDao(ProducesEvent.class, ProducesEventDao.class);

    DaoRegistry.getInstance().registerDao(ConsumesEvent.class, ConsumesEventDao.class);

    DaoRegistry.getInstance().registerDao(NextState.class, NextStateDao.class);

    DaoRegistry.getInstance().registerDao(InitialState.class, InitialStateDao.class);

    DaoRegistry.getInstance().registerDao(EventElement.class, EventElementDao.class);

    DaoRegistry.getInstance().registerDao(HasState.class, HasStateDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link EventModelFactory} instance.
   * @generated
   */
  @Override
  public EventModelFactory getModelFactory() {
    return MODELFACTORY;
  }

  /** 
   * Returns the nsUri of the {@link EPackage} managed by this Package instance.
   * <!-- begin-user-doc --> <!--
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
    return "event.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>EventModel</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>EventModel</b></em>' 
   * @generated
   */
  public EClass getEventModelEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EVENTMODEL_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>EventModel.eventElement</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>EventModel.eventElement</b></em>'.
   * @generated
   */
  public EReference getEventModel_EventElement() {
    return (EReference) getEventModelEClass().getEAllStructuralFeatures().get(EVENTMODEL_EVENTELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractEventElement</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>AbstractEventElement</b></em>' 
   * @generated
   */
  public EClass getAbstractEventElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTEVENTELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractEventElement.source</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractEventElement.source</b></em>'.
   * @generated
   */
  public EReference getAbstractEventElement_Source() {
    return (EReference) getAbstractEventElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTEVENTELEMENT_SOURCE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractEventElement.eventRelation</b></em>'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractEventElement.eventRelation</b></em>'.
   * @generated
   */
  public EReference getAbstractEventElement_EventRelation() {
    return (EReference) getAbstractEventElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTEVENTELEMENT_EVENTRELATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractEventElement.abstraction</b></em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractEventElement.abstraction</b></em>'.
   * @generated
   */
  public EReference getAbstractEventElement_Abstraction() {
    return (EReference) getAbstractEventElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTEVENTELEMENT_ABSTRACTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractEventElement.implementation</b></em>'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractEventElement.implementation</b></em>'.
   * @generated
   */
  public EReference getAbstractEventElement_Implementation() {
    return (EReference) getAbstractEventElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTEVENTELEMENT_IMPLEMENTATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractEventRelationship</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractEventRelationship</b></em>'
   * @generated
   */
  public EClass getAbstractEventRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTEVENTRELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Event</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>Event</b></em>' 
   * @generated
   */
  public EClass getEventEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EVENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Event.kind</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Event.kind</b></em>'.
   * @generated
   */
  public EAttribute getEvent_Kind() {
    return (EAttribute) getEventEClass().getEAllStructuralFeatures().get(EVENT_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>EventRelationship</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>EventRelationship</b></em>' 
   * @generated
   */
  public EClass getEventRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EVENTRELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>EventRelationship.to</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>EventRelationship.to</b></em>'.
   * @generated
   */
  public EReference getEventRelationship_To() {
    return (EReference) getEventRelationshipEClass().getEAllStructuralFeatures().get(EVENTRELATIONSHIP_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>EventRelationship.from</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>EventRelationship.from</b></em>'.
   * @generated
   */
  public EReference getEventRelationship_From() {
    return (EReference) getEventRelationshipEClass().getEAllStructuralFeatures().get(EVENTRELATIONSHIP_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>EventResource</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>EventResource</b></em>' 
   * @generated
   */
  public EClass getEventResourceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EVENTRESOURCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>EventResource.eventElement</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>EventResource.eventElement</b></em>'.
   * @generated
   */
  public EReference getEventResource_EventElement() {
    return (EReference) getEventResourceEClass().getEAllStructuralFeatures().get(EVENTRESOURCE_EVENTELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>State</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>State</b></em>' 
   * @generated
   */
  public EClass getStateEClass() {
    return (EClass) getEPackage().getEClassifiers().get(STATE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Transition</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>Transition</b></em>' 
   * @generated
   */
  public EClass getTransitionEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TRANSITION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>OnEntry</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>OnEntry</b></em>' 
   * @generated
   */
  public EClass getOnEntryEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ONENTRY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>OnExit</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>OnExit</b></em>' 
   * @generated
   */
  public EClass getOnExitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ONEXIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>EventAction</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>EventAction</b></em>' 
   * @generated
   */
  public EClass getEventActionEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EVENTACTION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>EventAction.kind</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>EventAction.kind</b></em>'.
   * @generated
   */
  public EAttribute getEventAction_Kind() {
    return (EAttribute) getEventActionEClass().getEAllStructuralFeatures().get(EVENTACTION_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>EventAction.eventElement</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>EventAction.eventElement</b></em>'.
   * @generated
   */
  public EReference getEventAction_EventElement() {
    return (EReference) getEventActionEClass().getEAllStructuralFeatures().get(EVENTACTION_EVENTELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ReadsState</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>ReadsState</b></em>' 
   * @generated
   */
  public EClass getReadsStateEClass() {
    return (EClass) getEPackage().getEClassifiers().get(READSSTATE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ReadsState.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ReadsState.to</b></em>'.
   * @generated
   */
  public EReference getReadsState_To() {
    return (EReference) getReadsStateEClass().getEAllStructuralFeatures().get(READSSTATE_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ReadsState.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ReadsState.from</b></em>'.
   * @generated
   */
  public EReference getReadsState_From() {
    return (EReference) getReadsStateEClass().getEAllStructuralFeatures().get(READSSTATE_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ProducesEvent</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>ProducesEvent</b></em>' 
   * @generated
   */
  public EClass getProducesEventEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PRODUCESEVENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ProducesEvent.to</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ProducesEvent.to</b></em>'.
   * @generated
   */
  public EReference getProducesEvent_To() {
    return (EReference) getProducesEventEClass().getEAllStructuralFeatures().get(PRODUCESEVENT_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ProducesEvent.from</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ProducesEvent.from</b></em>'.
   * @generated
   */
  public EReference getProducesEvent_From() {
    return (EReference) getProducesEventEClass().getEAllStructuralFeatures().get(PRODUCESEVENT_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ConsumesEvent</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>ConsumesEvent</b></em>' 
   * @generated
   */
  public EClass getConsumesEventEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONSUMESEVENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ConsumesEvent.to</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ConsumesEvent.to</b></em>'.
   * @generated
   */
  public EReference getConsumesEvent_To() {
    return (EReference) getConsumesEventEClass().getEAllStructuralFeatures().get(CONSUMESEVENT_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ConsumesEvent.from</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ConsumesEvent.from</b></em>'.
   * @generated
   */
  public EReference getConsumesEvent_From() {
    return (EReference) getConsumesEventEClass().getEAllStructuralFeatures().get(CONSUMESEVENT_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>NextState</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>NextState</b></em>' 
   * @generated
   */
  public EClass getNextStateEClass() {
    return (EClass) getEPackage().getEClassifiers().get(NEXTSTATE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>NextState.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>NextState.to</b></em>'.
   * @generated
   */
  public EReference getNextState_To() {
    return (EReference) getNextStateEClass().getEAllStructuralFeatures().get(NEXTSTATE_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>NextState.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>NextState.from</b></em>'.
   * @generated
   */
  public EReference getNextState_From() {
    return (EReference) getNextStateEClass().getEAllStructuralFeatures().get(NEXTSTATE_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>InitialState</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>InitialState</b></em>' 
   * @generated
   */
  public EClass getInitialStateEClass() {
    return (EClass) getEPackage().getEClassifiers().get(INITIALSTATE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>EventElement</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>EventElement</b></em>' 
   * @generated
   */
  public EClass getEventElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EVENTELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>HasState</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>HasState</b></em>' 
   * @generated
   */
  public EClass getHasStateEClass() {
    return (EClass) getEPackage().getEClassifiers().get(HASSTATE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>HasState.to</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>HasState.to</b></em>'.
   * @generated
   */
  public EReference getHasState_To() {
    return (EReference) getHasStateEClass().getEAllStructuralFeatures().get(HASSTATE_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>HasState.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>HasState.from</b></em>'.
   * @generated
   */
  public EReference getHasState_From() {
    return (EReference) getHasStateEClass().getEAllStructuralFeatures().get(HASSTATE_FROM_FEATURE_ID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param eClassifier
   *            the {@link EClassifier}
   * @return the class implementing a specific {@link EClass}.
   * @generated
   */
  @Override
  public Class<?> getEClassifierClass(EClassifier eClassifier) {
    switch (eClassifier.getClassifierID()) {
    case EVENTMODEL_CLASSIFIER_ID:
      return EventModel.class;
    case ABSTRACTEVENTELEMENT_CLASSIFIER_ID:
      return AbstractEventElement.class;
    case ABSTRACTEVENTRELATIONSHIP_CLASSIFIER_ID:
      return AbstractEventRelationship.class;
    case EVENT_CLASSIFIER_ID:
      return Event.class;
    case EVENTRELATIONSHIP_CLASSIFIER_ID:
      return EventRelationship.class;
    case EVENTRESOURCE_CLASSIFIER_ID:
      return EventResource.class;
    case STATE_CLASSIFIER_ID:
      return State.class;
    case TRANSITION_CLASSIFIER_ID:
      return Transition.class;
    case ONENTRY_CLASSIFIER_ID:
      return OnEntry.class;
    case ONEXIT_CLASSIFIER_ID:
      return OnExit.class;
    case EVENTACTION_CLASSIFIER_ID:
      return EventAction.class;
    case READSSTATE_CLASSIFIER_ID:
      return ReadsState.class;
    case PRODUCESEVENT_CLASSIFIER_ID:
      return ProducesEvent.class;
    case CONSUMESEVENT_CLASSIFIER_ID:
      return ConsumesEvent.class;
    case NEXTSTATE_CLASSIFIER_ID:
      return NextState.class;
    case INITIALSTATE_CLASSIFIER_ID:
      return InitialState.class;
    case EVENTELEMENT_CLASSIFIER_ID:
      return EventElement.class;
    case HASSTATE_CLASSIFIER_ID:
      return HasState.class;
    }
    throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
  }
}
