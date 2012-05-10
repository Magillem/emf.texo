package org.eclipse.emf.texo.test.model.samples.capa;

import java.util.Date;
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

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: org.eclipse.emf.texo.test.model.samples.capa. It
 * contains code to create instances {@link ModelObject} wrappers and instances for EClasses and convert objects back
 * and forth from their String (XML) representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CapaModelFactory implements ModelFactory {

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
    case CapaModelPackage.CAPACITYENTRY_CLASSIFIER_ID:
      return createCapacityEntry();
    case CapaModelPackage.MACHINE_CLASSIFIER_ID:
      return createMachine();
    case CapaModelPackage.WORKWEEK_CLASSIFIER_ID:
      return createWorkWeek();
    case CapaModelPackage.TASK_CLASSIFIER_ID:
      return createTask();
    case CapaModelPackage.MACHINELIST_CLASSIFIER_ID:
      return createMachineList();
    case CapaModelPackage.PRODUCTION_CLASSIFIER_ID:
      return createProduction();
    case CapaModelPackage.WORKDAY_CLASSIFIER_ID:
      return createWorkDay();
    }
    throw new IllegalArgumentException("The EClass '" + eClass.getName() + "' is not a valid EClass for this EPackage");
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
  public ModelObject createModelObject(EClass eClass, Object adaptee) {
    ModelObject<Object> modelObject = null;
    switch (eClass.getClassifierID()) {
    case CapaModelPackage.CAPACITYENTRY_CLASSIFIER_ID:
      modelObject = new CapacityEntryModelObject();
      break;
    case CapaModelPackage.MACHINE_CLASSIFIER_ID:
      modelObject = new MachineModelObject();
      break;
    case CapaModelPackage.WORKWEEK_CLASSIFIER_ID:
      modelObject = new WorkWeekModelObject();
      break;
    case CapaModelPackage.TASK_CLASSIFIER_ID:
      modelObject = new TaskModelObject();
      break;
    case CapaModelPackage.MACHINELIST_CLASSIFIER_ID:
      modelObject = new MachineListModelObject();
      break;
    case CapaModelPackage.PRODUCTION_CLASSIFIER_ID:
      modelObject = new ProductionModelObject();
      break;
    case CapaModelPackage.WORKDAY_CLASSIFIER_ID:
      modelObject = new WorkDayModelObject();
      break;
    default:
      throw new IllegalArgumentException("The EClass '" + eClass + "' is not defined in this EPackage");
    }
    modelObject.setTarget(adaptee);
    return modelObject;
  }

  /**
   * Creates a feature map entry instance for a certain EStructuralFeature.
   * 
   * @param eStructuralFeature
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
   * @param eStructuralFeature
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
   * @return an instance of the model object representing the EClass CapacityEntry
   * @generated
   */
  public CapacityEntry createCapacityEntry() {
    return new CapacityEntry();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Machine
   * @generated
   */
  public Machine createMachine() {
    return new Machine();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass MachineList
   * @generated
   */
  public MachineList createMachineList() {
    return new MachineList();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Production
   * @generated
   */
  public Production createProduction() {
    return new Production();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Task
   * @generated
   */
  public Task createTask() {
    return new Task();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass WorkDay
   * @generated
   */
  public WorkDay createWorkDay() {
    return new WorkDay();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass WorkWeek
   * @generated
   */
  public WorkWeek createWorkWeek() {
    return new WorkWeek();
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
    }
    throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage");
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
    }
    throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CapacityEntry</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static class CapacityEntryModelObject<E extends CapacityEntry> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return CapaModelPackage.INSTANCE.getCapacityEntryEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return CapaModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CapaModelPackage.CAPACITYENTRY_CAPACITYENTRYID_FEATURE_ID:
        return getTarget().getCapacityEntryId();
      case CapaModelPackage.CAPACITYENTRY_NAME_FEATURE_ID:
        return getTarget().getName();
      }
      return super.eGet(eStructuralFeature);
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CapaModelPackage.CAPACITYENTRY_CAPACITYENTRYID_FEATURE_ID:
        getTarget().setCapacityEntryId((String) value);
        return;
      case CapaModelPackage.CAPACITYENTRY_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      }
      super.eSet(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      super.eAddTo(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      super.eAddTo(eStructuralFeature, value);
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Machine</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static class MachineModelObject<E extends Machine> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return CapaModelPackage.INSTANCE.getMachineEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return CapaModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CapaModelPackage.MACHINE_WORKWEEK_FEATURE_ID:
        return getTarget().getWorkWeek();
      case CapaModelPackage.MACHINE_TASKS_FEATURE_ID:
        return getTarget().getTasks();
      case CapaModelPackage.MACHINE_MACHINEID_FEATURE_ID:
        return getTarget().getMachineId();
      case CapaModelPackage.MACHINE_MACHINESEARCHSTRING_FEATURE_ID:
        return getTarget().getMachineSearchString();
      case CapaModelPackage.MACHINE_MULTIPLICITY_FEATURE_ID:
        return getTarget().getMultiplicity();
      case CapaModelPackage.MACHINE_TASKSEARCHSTRING_FEATURE_ID:
        return getTarget().getTaskSearchString();
      }
      return super.eGet(eStructuralFeature);
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CapaModelPackage.MACHINE_WORKWEEK_FEATURE_ID:
        getTarget().setWorkWeek((WorkWeek) value);
        return;
      case CapaModelPackage.MACHINE_TASKS_FEATURE_ID:
        getTarget().setTasks((List<Task>) value);
        return;
      case CapaModelPackage.MACHINE_MACHINEID_FEATURE_ID:
        getTarget().setMachineId((String) value);
        return;
      case CapaModelPackage.MACHINE_MACHINESEARCHSTRING_FEATURE_ID:
        getTarget().setMachineSearchString((String) value);
        return;
      case CapaModelPackage.MACHINE_MULTIPLICITY_FEATURE_ID:
        getTarget().setMultiplicity((Integer) value);
        return;
      case CapaModelPackage.MACHINE_TASKSEARCHSTRING_FEATURE_ID:
        getTarget().setTaskSearchString((String) value);
        return;
      }
      super.eSet(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CapaModelPackage.MACHINE_TASKS_FEATURE_ID:
        getTarget().getTasks().add((Task) value);
        return;

      }
      super.eAddTo(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CapaModelPackage.MACHINE_TASKS_FEATURE_ID:
        getTarget().getTasks().remove(value);
        return;

      }
      super.eAddTo(eStructuralFeature, value);
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>MachineList</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static class MachineListModelObject<E extends MachineList> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return CapaModelPackage.INSTANCE.getMachineListEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return CapaModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CapaModelPackage.MACHINELIST_MACHINES_FEATURE_ID:
        return getTarget().getMachines();
      }
      return super.eGet(eStructuralFeature);
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CapaModelPackage.MACHINELIST_MACHINES_FEATURE_ID:
        getTarget().setMachines((List<Machine>) value);
        return;
      }
      super.eSet(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CapaModelPackage.MACHINELIST_MACHINES_FEATURE_ID:
        getTarget().getMachines().add((Machine) value);
        return;
      }
      super.eAddTo(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CapaModelPackage.MACHINELIST_MACHINES_FEATURE_ID:
        getTarget().getMachines().remove(value);
        return;
      }
      super.eAddTo(eStructuralFeature, value);
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Production</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static class ProductionModelObject<E extends Production> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return CapaModelPackage.INSTANCE.getProductionEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return CapaModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CapaModelPackage.PRODUCTION_ARTICLE_FEATURE_ID:
        return getTarget().getArticle();
      case CapaModelPackage.PRODUCTION_DUETIME_FEATURE_ID:
        return getTarget().getDueTime();
      case CapaModelPackage.PRODUCTION_MISSINGAMOUNT_FEATURE_ID:
        return getTarget().getMissingAmount();
      case CapaModelPackage.PRODUCTION_PRODUCTIONID_FEATURE_ID:
        return getTarget().getProductionId();
      case CapaModelPackage.PRODUCTION_STARTTIME_FEATURE_ID:
        return getTarget().getStartTime();
      case CapaModelPackage.PRODUCTION_TOTALAMOUNT_FEATURE_ID:
        return getTarget().getTotalAmount();
      }
      return super.eGet(eStructuralFeature);
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CapaModelPackage.PRODUCTION_ARTICLE_FEATURE_ID:
        getTarget().setArticle((String) value);
        return;
      case CapaModelPackage.PRODUCTION_DUETIME_FEATURE_ID:
        getTarget().setDueTime((Date) value);
        return;
      case CapaModelPackage.PRODUCTION_MISSINGAMOUNT_FEATURE_ID:
        getTarget().setMissingAmount((Float) value);
        return;
      case CapaModelPackage.PRODUCTION_PRODUCTIONID_FEATURE_ID:
        getTarget().setProductionId((String) value);
        return;
      case CapaModelPackage.PRODUCTION_STARTTIME_FEATURE_ID:
        getTarget().setStartTime((Date) value);
        return;
      case CapaModelPackage.PRODUCTION_TOTALAMOUNT_FEATURE_ID:
        getTarget().setTotalAmount((Float) value);
        return;
      }
      super.eSet(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      super.eAddTo(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      super.eAddTo(eStructuralFeature, value);
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Task</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static class TaskModelObject<E extends Task> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return CapaModelPackage.INSTANCE.getTaskEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return CapaModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CapaModelPackage.TASK_CAPACITYENTRY_FEATURE_ID:
        return getTarget().getCapacityEntry();
      case CapaModelPackage.TASK_PRODUCTION_FEATURE_ID:
        return getTarget().getProduction();
      case CapaModelPackage.TASK_NAME_FEATURE_ID:
        return getTarget().getName();
      case CapaModelPackage.TASK_TASKID_FEATURE_ID:
        return getTarget().getTaskId();
      case CapaModelPackage.TASK_TIMEPERPICE_FEATURE_ID:
        return getTarget().getTimePerPice();
      case CapaModelPackage.TASK_TIMEPERPREPERATION_FEATURE_ID:
        return getTarget().getTimePerPreperation();
      }
      return super.eGet(eStructuralFeature);
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CapaModelPackage.TASK_CAPACITYENTRY_FEATURE_ID:
        getTarget().setCapacityEntry((CapacityEntry) value);
        return;
      case CapaModelPackage.TASK_PRODUCTION_FEATURE_ID:
        getTarget().setProduction((Production) value);
        return;
      case CapaModelPackage.TASK_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case CapaModelPackage.TASK_TASKID_FEATURE_ID:
        getTarget().setTaskId((String) value);
        return;
      case CapaModelPackage.TASK_TIMEPERPICE_FEATURE_ID:
        getTarget().setTimePerPice((Float) value);
        return;
      case CapaModelPackage.TASK_TIMEPERPREPERATION_FEATURE_ID:
        getTarget().setTimePerPreperation((Float) value);
        return;
      }
      super.eSet(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      super.eAddTo(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      super.eAddTo(eStructuralFeature, value);
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>WorkDay</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static class WorkDayModelObject<E extends WorkDay> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return CapaModelPackage.INSTANCE.getWorkDayEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return CapaModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CapaModelPackage.WORKDAY_DAYOFWEEK_FEATURE_ID:
        return getTarget().getDayOfWeek();
      case CapaModelPackage.WORKDAY_DURATION_FEATURE_ID:
        return getTarget().getDuration();
      case CapaModelPackage.WORKDAY_STARTTIME_FEATURE_ID:
        return getTarget().getStartTime();
      }
      return super.eGet(eStructuralFeature);
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CapaModelPackage.WORKDAY_DAYOFWEEK_FEATURE_ID:
        getTarget().setDayOfWeek((Integer) value);
        return;
      case CapaModelPackage.WORKDAY_DURATION_FEATURE_ID:
        getTarget().setDuration((Integer) value);
        return;
      case CapaModelPackage.WORKDAY_STARTTIME_FEATURE_ID:
        getTarget().setStartTime((Integer) value);
        return;
      }
      super.eSet(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      super.eAddTo(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      super.eAddTo(eStructuralFeature, value);
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>WorkWeek</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static class WorkWeekModelObject<E extends WorkWeek> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return CapaModelPackage.INSTANCE.getWorkWeekEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return CapaModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CapaModelPackage.WORKWEEK_DAYS_FEATURE_ID:
        return getTarget().getDays();
      case CapaModelPackage.WORKWEEK_WORKWEEKID_FEATURE_ID:
        return getTarget().getWorkWeekId();
      }
      return super.eGet(eStructuralFeature);
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CapaModelPackage.WORKWEEK_DAYS_FEATURE_ID:
        getTarget().setDays((List<WorkDay>) value);
        return;
      case CapaModelPackage.WORKWEEK_WORKWEEKID_FEATURE_ID:
        getTarget().setWorkWeekId((String) value);
        return;
      }
      super.eSet(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CapaModelPackage.WORKWEEK_DAYS_FEATURE_ID:
        getTarget().getDays().add((WorkDay) value);
        return;

      }
      super.eAddTo(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CapaModelPackage.WORKWEEK_DAYS_FEATURE_ID:
        getTarget().getDays().remove(value);
        return;

      }
      super.eAddTo(eStructuralFeature, value);
    }
  }

}
