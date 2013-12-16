package org.eclipse.emf.texo.test.model.samples.capa;

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
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.samples.capa.dao.CapacityEntryDao;
import org.eclipse.emf.texo.test.model.samples.capa.dao.MachineDao;
import org.eclipse.emf.texo.test.model.samples.capa.dao.MachineListDao;
import org.eclipse.emf.texo.test.model.samples.capa.dao.ProductionDao;
import org.eclipse.emf.texo.test.model.samples.capa.dao.TaskDao;
import org.eclipse.emf.texo.test.model.samples.capa.dao.WorkDayDao;
import org.eclipse.emf.texo.test.model.samples.capa.dao.WorkWeekDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>capa</b></em>'. It contains initialization code and access to the Factory to
 * instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CapaModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/capa";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final CapaModelFactory MODELFACTORY = new CapaModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CAPACITYENTRY_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CAPACITYENTRY_CAPACITYENTRYID_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CAPACITYENTRY_NAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MACHINE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MACHINE_WORKWEEK_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MACHINE_TASKS_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MACHINE_MACHINEID_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MACHINE_MACHINESEARCHSTRING_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MACHINE_MULTIPLICITY_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MACHINE_TASKSEARCHSTRING_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKWEEK_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKWEEK_DAYS_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKWEEK_WORKWEEKID_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_CAPACITYENTRY_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_PRODUCTION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_NAME_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_TASKID_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_TIMEPERPICE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_TIMEPERPREPERATION_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MACHINELIST_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MACHINELIST_MACHINES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCTION_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCTION_ARTICLE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCTION_DUETIME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCTION_MISSINGAMOUNT_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCTION_PRODUCTIONID_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCTION_STARTTIME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCTION_TOTALAMOUNT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKDAY_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKDAY_DAYOFWEEK_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKDAY_DURATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKDAY_STARTTIME_FEATURE_ID = 4;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final CapaModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static CapaModelPackage initialize() {

    if (isInitialized) {
      return (CapaModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final CapaModelPackage modelPackage = new CapaModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(CapacityEntry.class, modelPackage.getCapacityEntryEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Machine.class, modelPackage.getMachineEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(WorkWeek.class, modelPackage.getWorkWeekEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Task.class, modelPackage.getTaskEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(MachineList.class, modelPackage.getMachineListEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Production.class, modelPackage.getProductionEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(WorkDay.class, modelPackage.getWorkDayEClass(), modelPackage);

    DaoRegistry.getInstance().registerDao(CapacityEntry.class, CapacityEntryDao.class);
    DaoRegistry.getInstance().registerDao(Machine.class, MachineDao.class);
    DaoRegistry.getInstance().registerDao(WorkWeek.class, WorkWeekDao.class);
    DaoRegistry.getInstance().registerDao(Task.class, TaskDao.class);
    DaoRegistry.getInstance().registerDao(MachineList.class, MachineListDao.class);
    DaoRegistry.getInstance().registerDao(Production.class, ProductionDao.class);
    DaoRegistry.getInstance().registerDao(WorkDay.class, WorkDayDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link CapaModelFactory} instance.
   * @generated
   */
  @Override
  public CapaModelFactory getModelFactory() {
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
    return "capa.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>CapacityEntry</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CapacityEntry</b></em>'
   * @generated
   */
  public EClass getCapacityEntryEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CAPACITYENTRY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CapacityEntry.capacityEntryId</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CapacityEntry.capacityEntryId</b></em>'.
   * @generated
   */
  public EAttribute getCapacityEntry_CapacityEntryId() {
    return (EAttribute) getCapacityEntryEClass().getEAllStructuralFeatures().get(
        CAPACITYENTRY_CAPACITYENTRYID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CapacityEntry.name</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CapacityEntry.name</b></em>'.
   * @generated
   */
  public EAttribute getCapacityEntry_Name() {
    return (EAttribute) getCapacityEntryEClass().getEAllStructuralFeatures().get(CAPACITYENTRY_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Machine</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Machine</b></em>'
   * @generated
   */
  public EClass getMachineEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MACHINE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Machine.workWeek</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Machine.workWeek</b></em>'.
   * @generated
   */
  public EReference getMachine_WorkWeek() {
    return (EReference) getMachineEClass().getEAllStructuralFeatures().get(MACHINE_WORKWEEK_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Machine.tasks</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Machine.tasks</b></em>'.
   * @generated
   */
  public EReference getMachine_Tasks() {
    return (EReference) getMachineEClass().getEAllStructuralFeatures().get(MACHINE_TASKS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Machine.machineId</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Machine.machineId</b></em>'.
   * @generated
   */
  public EAttribute getMachine_MachineId() {
    return (EAttribute) getMachineEClass().getEAllStructuralFeatures().get(MACHINE_MACHINEID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Machine.machineSearchString</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Machine.machineSearchString</b></em>'.
   * @generated
   */
  public EAttribute getMachine_MachineSearchString() {
    return (EAttribute) getMachineEClass().getEAllStructuralFeatures().get(MACHINE_MACHINESEARCHSTRING_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Machine.multiplicity</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Machine.multiplicity</b></em>'.
   * @generated
   */
  public EAttribute getMachine_Multiplicity() {
    return (EAttribute) getMachineEClass().getEAllStructuralFeatures().get(MACHINE_MULTIPLICITY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Machine.taskSearchString</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Machine.taskSearchString</b></em>'.
   * @generated
   */
  public EAttribute getMachine_TaskSearchString() {
    return (EAttribute) getMachineEClass().getEAllStructuralFeatures().get(MACHINE_TASKSEARCHSTRING_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>WorkWeek</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>WorkWeek</b></em>'
   * @generated
   */
  public EClass getWorkWeekEClass() {
    return (EClass) getEPackage().getEClassifiers().get(WORKWEEK_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WorkWeek.days</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WorkWeek.days</b></em>'.
   * @generated
   */
  public EReference getWorkWeek_Days() {
    return (EReference) getWorkWeekEClass().getEAllStructuralFeatures().get(WORKWEEK_DAYS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WorkWeek.workWeekId</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WorkWeek.workWeekId</b></em>'.
   * @generated
   */
  public EAttribute getWorkWeek_WorkWeekId() {
    return (EAttribute) getWorkWeekEClass().getEAllStructuralFeatures().get(WORKWEEK_WORKWEEKID_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Task</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Task</b></em>'
   * @generated
   */
  public EClass getTaskEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TASK_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Task.capacityEntry</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Task.capacityEntry</b></em>'.
   * @generated
   */
  public EReference getTask_CapacityEntry() {
    return (EReference) getTaskEClass().getEAllStructuralFeatures().get(TASK_CAPACITYENTRY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Task.production</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Task.production</b></em>'.
   * @generated
   */
  public EReference getTask_Production() {
    return (EReference) getTaskEClass().getEAllStructuralFeatures().get(TASK_PRODUCTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Task.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Task.name</b></em>'.
   * @generated
   */
  public EAttribute getTask_Name() {
    return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(TASK_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Task.taskId</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Task.taskId</b></em>'.
   * @generated
   */
  public EAttribute getTask_TaskId() {
    return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(TASK_TASKID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Task.timePerPice</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Task.timePerPice</b></em>'.
   * @generated
   */
  public EAttribute getTask_TimePerPice() {
    return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(TASK_TIMEPERPICE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Task.timePerPreperation</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Task.timePerPreperation</b></em>'.
   * @generated
   */
  public EAttribute getTask_TimePerPreperation() {
    return (EAttribute) getTaskEClass().getEAllStructuralFeatures().get(TASK_TIMEPERPREPERATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>MachineList</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>MachineList</b></em>'
   * @generated
   */
  public EClass getMachineListEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MACHINELIST_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>MachineList.machines</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>MachineList.machines</b></em>'.
   * @generated
   */
  public EReference getMachineList_Machines() {
    return (EReference) getMachineListEClass().getEAllStructuralFeatures().get(MACHINELIST_MACHINES_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Production</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Production</b></em>'
   * @generated
   */
  public EClass getProductionEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PRODUCTION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Production.article</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Production.article</b></em>'.
   * @generated
   */
  public EAttribute getProduction_Article() {
    return (EAttribute) getProductionEClass().getEAllStructuralFeatures().get(PRODUCTION_ARTICLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Production.dueTime</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Production.dueTime</b></em>'.
   * @generated
   */
  public EAttribute getProduction_DueTime() {
    return (EAttribute) getProductionEClass().getEAllStructuralFeatures().get(PRODUCTION_DUETIME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Production.missingAmount</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Production.missingAmount</b></em>'.
   * @generated
   */
  public EAttribute getProduction_MissingAmount() {
    return (EAttribute) getProductionEClass().getEAllStructuralFeatures().get(PRODUCTION_MISSINGAMOUNT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Production.productionId</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Production.productionId</b></em>'.
   * @generated
   */
  public EAttribute getProduction_ProductionId() {
    return (EAttribute) getProductionEClass().getEAllStructuralFeatures().get(PRODUCTION_PRODUCTIONID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Production.startTime</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Production.startTime</b></em>'.
   * @generated
   */
  public EAttribute getProduction_StartTime() {
    return (EAttribute) getProductionEClass().getEAllStructuralFeatures().get(PRODUCTION_STARTTIME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Production.totalAmount</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Production.totalAmount</b></em>'.
   * @generated
   */
  public EAttribute getProduction_TotalAmount() {
    return (EAttribute) getProductionEClass().getEAllStructuralFeatures().get(PRODUCTION_TOTALAMOUNT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>WorkDay</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>WorkDay</b></em>'
   * @generated
   */
  public EClass getWorkDayEClass() {
    return (EClass) getEPackage().getEClassifiers().get(WORKDAY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WorkDay.dayOfWeek</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WorkDay.dayOfWeek</b></em>'.
   * @generated
   */
  public EAttribute getWorkDay_DayOfWeek() {
    return (EAttribute) getWorkDayEClass().getEAllStructuralFeatures().get(WORKDAY_DAYOFWEEK_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WorkDay.duration</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WorkDay.duration</b></em>'.
   * @generated
   */
  public EAttribute getWorkDay_Duration() {
    return (EAttribute) getWorkDayEClass().getEAllStructuralFeatures().get(WORKDAY_DURATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WorkDay.startTime</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WorkDay.startTime</b></em>'.
   * @generated
   */
  public EAttribute getWorkDay_StartTime() {
    return (EAttribute) getWorkDayEClass().getEAllStructuralFeatures().get(WORKDAY_STARTTIME_FEATURE_ID);
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
    case CAPACITYENTRY_CLASSIFIER_ID:
      return CapacityEntry.class;
    case MACHINE_CLASSIFIER_ID:
      return Machine.class;
    case WORKWEEK_CLASSIFIER_ID:
      return WorkWeek.class;
    case TASK_CLASSIFIER_ID:
      return Task.class;
    case MACHINELIST_CLASSIFIER_ID:
      return MachineList.class;
    case PRODUCTION_CLASSIFIER_ID:
      return Production.class;
    case WORKDAY_CLASSIFIER_ID:
      return WorkDay.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
