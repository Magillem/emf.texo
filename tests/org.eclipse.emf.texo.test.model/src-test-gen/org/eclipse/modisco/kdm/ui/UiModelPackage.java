package org.eclipse.modisco.kdm.ui;

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
import org.eclipse.modisco.kdm.source.SourceModelPackage;
import org.eclipse.modisco.kdm.ui.dao.DisplaysDao;
import org.eclipse.modisco.kdm.ui.dao.DisplaysImageDao;
import org.eclipse.modisco.kdm.ui.dao.ManagesUIDao;
import org.eclipse.modisco.kdm.ui.dao.ReadsUIDao;
import org.eclipse.modisco.kdm.ui.dao.ReportDao;
import org.eclipse.modisco.kdm.ui.dao.ScreenDao;
import org.eclipse.modisco.kdm.ui.dao.UIActionDao;
import org.eclipse.modisco.kdm.ui.dao.UIDisplayDao;
import org.eclipse.modisco.kdm.ui.dao.UIElementDao;
import org.eclipse.modisco.kdm.ui.dao.UIEventDao;
import org.eclipse.modisco.kdm.ui.dao.UIFieldDao;
import org.eclipse.modisco.kdm.ui.dao.UIFlowDao;
import org.eclipse.modisco.kdm.ui.dao.UILayoutDao;
import org.eclipse.modisco.kdm.ui.dao.UIModelDao;
import org.eclipse.modisco.kdm.ui.dao.UIRelationshipDao;
import org.eclipse.modisco.kdm.ui.dao.UIResourceDao;
import org.eclipse.modisco.kdm.ui.dao.WritesUIDao;

/**
 * The <b>Package</b> for the model '<em><b>ui</b></em>'.
 * It contains initialization code and access to the Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class UiModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/MoDisco/kdm/ui";

  /**
   * The {@link ModelFactory} for this package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final UiModelFactory MODELFACTORY = new UiModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_SOURCE_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_UIRELATION_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_IMPLEMENTATION_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_ABSTRACTION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int ABSTRACTUIRELATIONSHIP_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UIRESOURCE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UIRESOURCE_UIELEMENT_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UIDISPLAY_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int SCREEN_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORT_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UIMODEL_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UIMODEL_UIELEMENT_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UILAYOUT_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UILAYOUT_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UILAYOUT_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UIFIELD_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int DISPLAYSIMAGE_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int DISPLAYSIMAGE_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int DISPLAYSIMAGE_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int DISPLAYS_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int DISPLAYS_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int DISPLAYS_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UIFLOW_CLASSIFIER_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UIFLOW_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UIFLOW_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UIELEMENT_CLASSIFIER_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UIRELATIONSHIP_CLASSIFIER_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UIRELATIONSHIP_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UIRELATIONSHIP_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UIACTION_CLASSIFIER_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UIACTION_KIND_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UIACTION_UIELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UIEVENT_CLASSIFIER_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int UIEVENT_KIND_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int READSUI_CLASSIFIER_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int READSUI_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int READSUI_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int WRITESUI_CLASSIFIER_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int WRITESUI_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int WRITESUI_FROM_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int MANAGESUI_CLASSIFIER_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int MANAGESUI_TO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final int MANAGESUI_FROM_FEATURE_ID = 5;

  /**
   * The static member with the instance of this {@link ModelPackage}.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final UiModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static UiModelPackage initialize() {

    if (isInitialized) {
      return (UiModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final UiModelPackage modelPackage = new UiModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    isInitialized = true;

    KdmModelPackage.initialize();
    CoreModelPackage.initialize();
    org.eclipse.modisco.kdm.kdm.KdmModelPackage.initialize();
    SourceModelPackage.initialize();
    CodeModelPackage.initialize();
    ActionModelPackage.initialize();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(AbstractUIElement.class,
        modelPackage.getAbstractUIElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractUIRelationship.class,
        modelPackage.getAbstractUIRelationshipEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UIResource.class, modelPackage.getUIResourceEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UIDisplay.class, modelPackage.getUIDisplayEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Screen.class, modelPackage.getScreenEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Report.class, modelPackage.getReportEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UIModel.class, modelPackage.getUIModelEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UILayout.class, modelPackage.getUILayoutEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UIField.class, modelPackage.getUIFieldEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DisplaysImage.class, modelPackage.getDisplaysImageEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Displays.class, modelPackage.getDisplaysEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UIFlow.class, modelPackage.getUIFlowEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UIElement.class, modelPackage.getUIElementEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UIRelationship.class, modelPackage.getUIRelationshipEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UIAction.class, modelPackage.getUIActionEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UIEvent.class, modelPackage.getUIEventEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ReadsUI.class, modelPackage.getReadsUIEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(WritesUI.class, modelPackage.getWritesUIEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ManagesUI.class, modelPackage.getManagesUIEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(UIResource.class, UIResourceDao.class);

    DaoRegistry.getInstance().registerDao(UIDisplay.class, UIDisplayDao.class);

    DaoRegistry.getInstance().registerDao(Screen.class, ScreenDao.class);

    DaoRegistry.getInstance().registerDao(Report.class, ReportDao.class);

    DaoRegistry.getInstance().registerDao(UIModel.class, UIModelDao.class);

    DaoRegistry.getInstance().registerDao(UILayout.class, UILayoutDao.class);

    DaoRegistry.getInstance().registerDao(UIField.class, UIFieldDao.class);

    DaoRegistry.getInstance().registerDao(DisplaysImage.class, DisplaysImageDao.class);

    DaoRegistry.getInstance().registerDao(Displays.class, DisplaysDao.class);

    DaoRegistry.getInstance().registerDao(UIFlow.class, UIFlowDao.class);

    DaoRegistry.getInstance().registerDao(UIElement.class, UIElementDao.class);

    DaoRegistry.getInstance().registerDao(UIRelationship.class, UIRelationshipDao.class);

    DaoRegistry.getInstance().registerDao(UIAction.class, UIActionDao.class);

    DaoRegistry.getInstance().registerDao(UIEvent.class, UIEventDao.class);

    DaoRegistry.getInstance().registerDao(ReadsUI.class, ReadsUIDao.class);

    DaoRegistry.getInstance().registerDao(WritesUI.class, WritesUIDao.class);

    DaoRegistry.getInstance().registerDao(ManagesUI.class, ManagesUIDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link UiModelFactory} instance.
   * @generated
   */
  @Override
  public UiModelFactory getModelFactory() {
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
    return "ui.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractUIElement</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>AbstractUIElement</b></em>' 
   * @generated
   */
  public EClass getAbstractUIElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTUIELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractUIElement.source</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractUIElement.source</b></em>'.
   * @generated
   */
  public EReference getAbstractUIElement_Source() {
    return (EReference) getAbstractUIElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTUIELEMENT_SOURCE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractUIElement.UIRelation</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractUIElement.UIRelation</b></em>'.
   * @generated
   */
  public EReference getAbstractUIElement_UIRelation() {
    return (EReference) getAbstractUIElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTUIELEMENT_UIRELATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractUIElement.implementation</b></em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractUIElement.implementation</b></em>'.
   * @generated
   */
  public EReference getAbstractUIElement_Implementation() {
    return (EReference) getAbstractUIElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTUIELEMENT_IMPLEMENTATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractUIElement.abstraction</b></em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractUIElement.abstraction</b></em>'.
   * @generated
   */
  public EReference getAbstractUIElement_Abstraction() {
    return (EReference) getAbstractUIElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTUIELEMENT_ABSTRACTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractUIRelationship</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>AbstractUIRelationship</b></em>' 
   * @generated
   */
  public EClass getAbstractUIRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTUIRELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UIResource</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>UIResource</b></em>' 
   * @generated
   */
  public EClass getUIResourceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UIRESOURCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UIResource.UIElement</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UIResource.UIElement</b></em>'.
   * @generated
   */
  public EReference getUIResource_UIElement() {
    return (EReference) getUIResourceEClass().getEAllStructuralFeatures().get(UIRESOURCE_UIELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UIDisplay</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>UIDisplay</b></em>' 
   * @generated
   */
  public EClass getUIDisplayEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UIDISPLAY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Screen</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>Screen</b></em>' 
   * @generated
   */
  public EClass getScreenEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SCREEN_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Report</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>Report</b></em>' 
   * @generated
   */
  public EClass getReportEClass() {
    return (EClass) getEPackage().getEClassifiers().get(REPORT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UIModel</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>UIModel</b></em>' 
   * @generated
   */
  public EClass getUIModelEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UIMODEL_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UIModel.UIElement</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UIModel.UIElement</b></em>'.
   * @generated
   */
  public EReference getUIModel_UIElement() {
    return (EReference) getUIModelEClass().getEAllStructuralFeatures().get(UIMODEL_UIELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UILayout</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>UILayout</b></em>' 
   * @generated
   */
  public EClass getUILayoutEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UILAYOUT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UILayout.to</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UILayout.to</b></em>'.
   * @generated
   */
  public EReference getUILayout_To() {
    return (EReference) getUILayoutEClass().getEAllStructuralFeatures().get(UILAYOUT_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UILayout.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UILayout.from</b></em>'.
   * @generated
   */
  public EReference getUILayout_From() {
    return (EReference) getUILayoutEClass().getEAllStructuralFeatures().get(UILAYOUT_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UIField</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>UIField</b></em>' 
   * @generated
   */
  public EClass getUIFieldEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UIFIELD_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DisplaysImage</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>DisplaysImage</b></em>' 
   * @generated
   */
  public EClass getDisplaysImageEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DISPLAYSIMAGE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DisplaysImage.to</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DisplaysImage.to</b></em>'.
   * @generated
   */
  public EReference getDisplaysImage_To() {
    return (EReference) getDisplaysImageEClass().getEAllStructuralFeatures().get(DISPLAYSIMAGE_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DisplaysImage.from</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DisplaysImage.from</b></em>'.
   * @generated
   */
  public EReference getDisplaysImage_From() {
    return (EReference) getDisplaysImageEClass().getEAllStructuralFeatures().get(DISPLAYSIMAGE_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Displays</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>Displays</b></em>' 
   * @generated
   */
  public EClass getDisplaysEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DISPLAYS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Displays.to</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Displays.to</b></em>'.
   * @generated
   */
  public EReference getDisplays_To() {
    return (EReference) getDisplaysEClass().getEAllStructuralFeatures().get(DISPLAYS_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Displays.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Displays.from</b></em>'.
   * @generated
   */
  public EReference getDisplays_From() {
    return (EReference) getDisplaysEClass().getEAllStructuralFeatures().get(DISPLAYS_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UIFlow</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>UIFlow</b></em>' 
   * @generated
   */
  public EClass getUIFlowEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UIFLOW_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UIFlow.to</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UIFlow.to</b></em>'.
   * @generated
   */
  public EReference getUIFlow_To() {
    return (EReference) getUIFlowEClass().getEAllStructuralFeatures().get(UIFLOW_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UIFlow.from</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UIFlow.from</b></em>'.
   * @generated
   */
  public EReference getUIFlow_From() {
    return (EReference) getUIFlowEClass().getEAllStructuralFeatures().get(UIFLOW_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UIElement</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>UIElement</b></em>' 
   * @generated
   */
  public EClass getUIElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UIELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UIRelationship</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>UIRelationship</b></em>' 
   * @generated
   */
  public EClass getUIRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UIRELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UIRelationship.to</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UIRelationship.to</b></em>'.
   * @generated
   */
  public EReference getUIRelationship_To() {
    return (EReference) getUIRelationshipEClass().getEAllStructuralFeatures().get(UIRELATIONSHIP_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UIRelationship.from</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UIRelationship.from</b></em>'.
   * @generated
   */
  public EReference getUIRelationship_From() {
    return (EReference) getUIRelationshipEClass().getEAllStructuralFeatures().get(UIRELATIONSHIP_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UIAction</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>UIAction</b></em>' 
   * @generated
   */
  public EClass getUIActionEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UIACTION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UIAction.kind</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UIAction.kind</b></em>'.
   * @generated
   */
  public EAttribute getUIAction_Kind() {
    return (EAttribute) getUIActionEClass().getEAllStructuralFeatures().get(UIACTION_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UIAction.UIElement</b></em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UIAction.UIElement</b></em>'.
   * @generated
   */
  public EReference getUIAction_UIElement() {
    return (EReference) getUIActionEClass().getEAllStructuralFeatures().get(UIACTION_UIELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UIEvent</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>UIEvent</b></em>' 
   * @generated
   */
  public EClass getUIEventEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UIEVENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UIEvent.kind</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UIEvent.kind</b></em>'.
   * @generated
   */
  public EAttribute getUIEvent_Kind() {
    return (EAttribute) getUIEventEClass().getEAllStructuralFeatures().get(UIEVENT_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ReadsUI</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>ReadsUI</b></em>' 
   * @generated
   */
  public EClass getReadsUIEClass() {
    return (EClass) getEPackage().getEClassifiers().get(READSUI_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ReadsUI.to</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ReadsUI.to</b></em>'.
   * @generated
   */
  public EReference getReadsUI_To() {
    return (EReference) getReadsUIEClass().getEAllStructuralFeatures().get(READSUI_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ReadsUI.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ReadsUI.from</b></em>'.
   * @generated
   */
  public EReference getReadsUI_From() {
    return (EReference) getReadsUIEClass().getEAllStructuralFeatures().get(READSUI_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>WritesUI</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>WritesUI</b></em>' 
   * @generated
   */
  public EClass getWritesUIEClass() {
    return (EClass) getEPackage().getEClassifiers().get(WRITESUI_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WritesUI.to</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WritesUI.to</b></em>'.
   * @generated
   */
  public EReference getWritesUI_To() {
    return (EReference) getWritesUIEClass().getEAllStructuralFeatures().get(WRITESUI_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WritesUI.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WritesUI.from</b></em>'.
   * @generated
   */
  public EReference getWritesUI_From() {
    return (EReference) getWritesUIEClass().getEAllStructuralFeatures().get(WRITESUI_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ManagesUI</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the {@link EClass} '<em><b>ManagesUI</b></em>' 
   * @generated
   */
  public EClass getManagesUIEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MANAGESUI_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManagesUI.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManagesUI.to</b></em>'.
   * @generated
   */
  public EReference getManagesUI_To() {
    return (EReference) getManagesUIEClass().getEAllStructuralFeatures().get(MANAGESUI_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManagesUI.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManagesUI.from</b></em>'.
   * @generated
   */
  public EReference getManagesUI_From() {
    return (EReference) getManagesUIEClass().getEAllStructuralFeatures().get(MANAGESUI_FROM_FEATURE_ID);
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
    case ABSTRACTUIELEMENT_CLASSIFIER_ID:
      return AbstractUIElement.class;
    case ABSTRACTUIRELATIONSHIP_CLASSIFIER_ID:
      return AbstractUIRelationship.class;
    case UIRESOURCE_CLASSIFIER_ID:
      return UIResource.class;
    case UIDISPLAY_CLASSIFIER_ID:
      return UIDisplay.class;
    case SCREEN_CLASSIFIER_ID:
      return Screen.class;
    case REPORT_CLASSIFIER_ID:
      return Report.class;
    case UIMODEL_CLASSIFIER_ID:
      return UIModel.class;
    case UILAYOUT_CLASSIFIER_ID:
      return UILayout.class;
    case UIFIELD_CLASSIFIER_ID:
      return UIField.class;
    case DISPLAYSIMAGE_CLASSIFIER_ID:
      return DisplaysImage.class;
    case DISPLAYS_CLASSIFIER_ID:
      return Displays.class;
    case UIFLOW_CLASSIFIER_ID:
      return UIFlow.class;
    case UIELEMENT_CLASSIFIER_ID:
      return UIElement.class;
    case UIRELATIONSHIP_CLASSIFIER_ID:
      return UIRelationship.class;
    case UIACTION_CLASSIFIER_ID:
      return UIAction.class;
    case UIEVENT_CLASSIFIER_ID:
      return UIEvent.class;
    case READSUI_CLASSIFIER_ID:
      return ReadsUI.class;
    case WRITESUI_CLASSIFIER_ID:
      return WritesUI.class;
    case MANAGESUI_CLASSIFIER_ID:
      return ManagesUI.class;
    }
    throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
  }
}
