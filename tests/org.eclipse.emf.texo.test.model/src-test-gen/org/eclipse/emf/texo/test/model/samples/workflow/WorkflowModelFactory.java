package org.eclipse.emf.texo.test.model.samples.workflow;

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

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: workflow. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class WorkflowModelFactory implements ModelFactory {

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
    case WorkflowModelPackage.CONDITIONALOUTPUTPORT_CLASSIFIER_ID:
      return createConditionalOutputPort();
    case WorkflowModelPackage.WORKFLOW_CLASSIFIER_ID:
      return createWorkflow();
    case WorkflowModelPackage.EDGE_CLASSIFIER_ID:
      return createEdge();
    case WorkflowModelPackage.COMMENT_CLASSIFIER_ID:
      return createComment();
    case WorkflowModelPackage.OUTPUTPORT_CLASSIFIER_ID:
      return createOutputPort();
    case WorkflowModelPackage.INPUTPORT_CLASSIFIER_ID:
      return createInputPort();
    case WorkflowModelPackage.FAULT_CLASSIFIER_ID:
      return createFault();
    case WorkflowModelPackage.COMPOUNDTASK_CLASSIFIER_ID:
      return createCompoundTask();
    case WorkflowModelPackage.TRANSFORMATIONTASK_CLASSIFIER_ID:
      return createTransformationTask();
    case WorkflowModelPackage.CONDITIONALTASK_CLASSIFIER_ID:
      return createConditionalTask();
    case WorkflowModelPackage.LOOPTASK_CLASSIFIER_ID:
      return createLoopTask();
    case WorkflowModelPackage.TASK_CLASSIFIER_ID:
      return createTask();
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
  public ModelObject createModelObject(EClass eClass, Object adaptee) {
    ModelObject<Object> modelObject = null;
    switch (eClass.getClassifierID()) {
    case WorkflowModelPackage.CONDITIONALOUTPUTPORT_CLASSIFIER_ID:
      modelObject = new ConditionalOutputPortModelObject();
      break;
    case WorkflowModelPackage.WORKFLOW_CLASSIFIER_ID:
      modelObject = new WorkflowModelObject();
      break;
    case WorkflowModelPackage.WORKFLOWELEMENT_CLASSIFIER_ID:
      modelObject = new WorkflowElementModelObject();
      break;
    case WorkflowModelPackage.WORKFLOWNODE_CLASSIFIER_ID:
      modelObject = new WorkflowNodeModelObject();
      break;
    case WorkflowModelPackage.EDGE_CLASSIFIER_ID:
      modelObject = new EdgeModelObject();
      break;
    case WorkflowModelPackage.COMMENT_CLASSIFIER_ID:
      modelObject = new CommentModelObject();
      break;
    case WorkflowModelPackage.OUTPUTPORT_CLASSIFIER_ID:
      modelObject = new OutputPortModelObject();
      break;
    case WorkflowModelPackage.PORT_CLASSIFIER_ID:
      modelObject = new PortModelObject();
      break;
    case WorkflowModelPackage.INPUTPORT_CLASSIFIER_ID:
      modelObject = new InputPortModelObject();
      break;
    case WorkflowModelPackage.FAULT_CLASSIFIER_ID:
      modelObject = new FaultModelObject();
      break;
    case WorkflowModelPackage.COMPOUNDTASK_CLASSIFIER_ID:
      modelObject = new CompoundTaskModelObject();
      break;
    case WorkflowModelPackage.TRANSFORMATIONTASK_CLASSIFIER_ID:
      modelObject = new TransformationTaskModelObject();
      break;
    case WorkflowModelPackage.CONDITIONALTASK_CLASSIFIER_ID:
      modelObject = new ConditionalTaskModelObject();
      break;
    case WorkflowModelPackage.LOOPTASK_CLASSIFIER_ID:
      modelObject = new LoopTaskModelObject();
      break;
    case WorkflowModelPackage.TASK_CLASSIFIER_ID:
      modelObject = new TaskModelObject();
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
   * @return an instance of the model object representing the EClass ConditionalOutputPort
   * @generated
   */
  public ConditionalOutputPort createConditionalOutputPort() {
    return new ConditionalOutputPort();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Workflow
   * @generated
   */
  public Workflow createWorkflow() {
    return new Workflow();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Edge
   * @generated
   */
  public Edge createEdge() {
    return new Edge();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Comment
   * @generated
   */
  public Comment createComment() {
    return new Comment();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass OutputPort
   * @generated
   */
  public OutputPort createOutputPort() {
    return new OutputPort();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass InputPort
   * @generated
   */
  public InputPort createInputPort() {
    return new InputPort();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Fault
   * @generated
   */
  public Fault createFault() {
    return new Fault();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CompoundTask
   * @generated
   */
  public CompoundTask createCompoundTask() {
    return new CompoundTask();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TransformationTask
   * @generated
   */
  public TransformationTask createTransformationTask() {
    return new TransformationTask();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ConditionalTask
   * @generated
   */
  public ConditionalTask createConditionalTask() {
    return new ConditionalTask();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass LoopTask
   * @generated
   */
  public LoopTask createLoopTask() {
    return new LoopTask();
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
   * The adapter/wrapper for the EClass '<em><b>ConditionalOutputPort</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ConditionalOutputPortModelObject<E extends ConditionalOutputPort> extends
      OutputPortModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getConditionalOutputPortEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.CONDITIONALOUTPUTPORT_CONDITION_FEATURE_ID:
        return getTarget().getCondition();
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
      case WorkflowModelPackage.CONDITIONALOUTPUTPORT_CONDITION_FEATURE_ID:
        getTarget().setCondition((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Workflow</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class WorkflowModelObject<E extends Workflow> extends WorkflowElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getWorkflowEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.WORKFLOW_NODES_FEATURE_ID:
        return getTarget().getNodes();
      case WorkflowModelPackage.WORKFLOW_EDGES_FEATURE_ID:
        return getTarget().getEdges();
      case WorkflowModelPackage.WORKFLOW_COMMENTS_FEATURE_ID:
        return getTarget().getComments();
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
      case WorkflowModelPackage.WORKFLOW_NODES_FEATURE_ID:
        getTarget().setNodes((List<WorkflowNode>) value);
        return;
      case WorkflowModelPackage.WORKFLOW_EDGES_FEATURE_ID:
        getTarget().setEdges((List<Edge>) value);
        return;
      case WorkflowModelPackage.WORKFLOW_COMMENTS_FEATURE_ID:
        getTarget().setComments((List<Comment>) value);
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

      case WorkflowModelPackage.WORKFLOW_NODES_FEATURE_ID:
        return getTarget().addToNodes((WorkflowNode) value);

      case WorkflowModelPackage.WORKFLOW_EDGES_FEATURE_ID:
        return getTarget().addToEdges((Edge) value);

      case WorkflowModelPackage.WORKFLOW_COMMENTS_FEATURE_ID:
        return getTarget().addToComments((Comment) value);
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

      case WorkflowModelPackage.WORKFLOW_NODES_FEATURE_ID:
        return getTarget().removeFromNodes((WorkflowNode) value);

      case WorkflowModelPackage.WORKFLOW_EDGES_FEATURE_ID:
        return getTarget().removeFromEdges((Edge) value);

      case WorkflowModelPackage.WORKFLOW_COMMENTS_FEATURE_ID:
        return getTarget().removeFromComments((Comment) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>WorkflowElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class WorkflowElementModelObject<E extends WorkflowElement> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getWorkflowElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.WORKFLOWELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case WorkflowModelPackage.WORKFLOWELEMENT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case WorkflowModelPackage.WORKFLOWELEMENT_X_FEATURE_ID:
        return getTarget().getX();
      case WorkflowModelPackage.WORKFLOWELEMENT_Y_FEATURE_ID:
        return getTarget().getY();
      case WorkflowModelPackage.WORKFLOWELEMENT_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case WorkflowModelPackage.WORKFLOWELEMENT_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case WorkflowModelPackage.WORKFLOWELEMENT_WORKFLOWELEMENTID_FEATURE_ID:
        return getTarget().getWorkFlowElementId();
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
      case WorkflowModelPackage.WORKFLOWELEMENT_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case WorkflowModelPackage.WORKFLOWELEMENT_COMMENT_FEATURE_ID:
        getTarget().setComment((String) value);
        return;
      case WorkflowModelPackage.WORKFLOWELEMENT_X_FEATURE_ID:
        getTarget().setX((Integer) value);
        return;
      case WorkflowModelPackage.WORKFLOWELEMENT_Y_FEATURE_ID:
        getTarget().setY((Integer) value);
        return;
      case WorkflowModelPackage.WORKFLOWELEMENT_WIDTH_FEATURE_ID:
        getTarget().setWidth((Integer) value);
        return;
      case WorkflowModelPackage.WORKFLOWELEMENT_HEIGHT_FEATURE_ID:
        getTarget().setHeight((Integer) value);
        return;
      case WorkflowModelPackage.WORKFLOWELEMENT_WORKFLOWELEMENTID_FEATURE_ID:
        getTarget().setWorkFlowElementId((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>WorkflowNode</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class WorkflowNodeModelObject<E extends WorkflowNode> extends WorkflowElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getWorkflowNodeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.WORKFLOWNODE_WORKFLOW_FEATURE_ID:
        return getTarget().getWorkflow();
      case WorkflowModelPackage.WORKFLOWNODE_OUTPUTS_FEATURE_ID:
        return getTarget().getOutputs();
      case WorkflowModelPackage.WORKFLOWNODE_INPUTS_FEATURE_ID:
        return getTarget().getInputs();
      case WorkflowModelPackage.WORKFLOWNODE_ISSTART_FEATURE_ID:
        return getTarget().isIsStart();
      case WorkflowModelPackage.WORKFLOWNODE_ISFINISH_FEATURE_ID:
        return getTarget().isIsFinish();
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
      case WorkflowModelPackage.WORKFLOWNODE_WORKFLOW_FEATURE_ID:
        getTarget().setWorkflow((Workflow) value);
        return;
      case WorkflowModelPackage.WORKFLOWNODE_OUTPUTS_FEATURE_ID:
        getTarget().setOutputs((List<OutputPort>) value);
        return;
      case WorkflowModelPackage.WORKFLOWNODE_INPUTS_FEATURE_ID:
        getTarget().setInputs((List<InputPort>) value);
        return;
      case WorkflowModelPackage.WORKFLOWNODE_ISSTART_FEATURE_ID:
        getTarget().setIsStart((Boolean) value);
        return;
      case WorkflowModelPackage.WORKFLOWNODE_ISFINISH_FEATURE_ID:
        getTarget().setIsFinish((Boolean) value);
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

      case WorkflowModelPackage.WORKFLOWNODE_OUTPUTS_FEATURE_ID:
        return getTarget().addToOutputs((OutputPort) value);

      case WorkflowModelPackage.WORKFLOWNODE_INPUTS_FEATURE_ID:
        return getTarget().addToInputs((InputPort) value);

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

      case WorkflowModelPackage.WORKFLOWNODE_OUTPUTS_FEATURE_ID:
        return getTarget().removeFromOutputs((OutputPort) value);

      case WorkflowModelPackage.WORKFLOWNODE_INPUTS_FEATURE_ID:
        return getTarget().removeFromInputs((InputPort) value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Edge</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class EdgeModelObject<E extends Edge> extends WorkflowElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getEdgeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.EDGE_WORKFLOW_FEATURE_ID:
        return getTarget().getWorkflow();
      case WorkflowModelPackage.EDGE_TARGET_FEATURE_ID:
        return getTarget().getTarget();
      case WorkflowModelPackage.EDGE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
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
      case WorkflowModelPackage.EDGE_WORKFLOW_FEATURE_ID:
        getTarget().setWorkflow((Workflow) value);
        return;
      case WorkflowModelPackage.EDGE_TARGET_FEATURE_ID:
        getTarget().setTarget((InputPort) value);
        return;
      case WorkflowModelPackage.EDGE_SOURCE_FEATURE_ID:
        getTarget().setSource((OutputPort) value);
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
   * The adapter/wrapper for the EClass '<em><b>Comment</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CommentModelObject<E extends Comment> extends WorkflowElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getCommentEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.COMMENT_WORKFLOW_FEATURE_ID:
        return getTarget().getWorkflow();
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
      case WorkflowModelPackage.COMMENT_WORKFLOW_FEATURE_ID:
        getTarget().setWorkflow((Workflow) value);
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
   * The adapter/wrapper for the EClass '<em><b>OutputPort</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class OutputPortModelObject<E extends OutputPort> extends PortModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getOutputPortEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.OUTPUTPORT_NODE_FEATURE_ID:
        return getTarget().getNode();
      case WorkflowModelPackage.OUTPUTPORT_EDGES_FEATURE_ID:
        return getTarget().getEdges();
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
      case WorkflowModelPackage.OUTPUTPORT_NODE_FEATURE_ID:
        getTarget().setNode((WorkflowNode) value);
        return;
      case WorkflowModelPackage.OUTPUTPORT_EDGES_FEATURE_ID:
        getTarget().setEdges((List<Edge>) value);
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

      case WorkflowModelPackage.OUTPUTPORT_EDGES_FEATURE_ID:
        return getTarget().addToEdges((Edge) value);
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

      case WorkflowModelPackage.OUTPUTPORT_EDGES_FEATURE_ID:
        return getTarget().removeFromEdges((Edge) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Port</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PortModelObject<E extends Port> extends WorkflowElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getPortEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
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
   * The adapter/wrapper for the EClass '<em><b>InputPort</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class InputPortModelObject<E extends InputPort> extends PortModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getInputPortEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.INPUTPORT_NODE_FEATURE_ID:
        return getTarget().getNode();
      case WorkflowModelPackage.INPUTPORT_EDGES_FEATURE_ID:
        return getTarget().getEdges();
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
      case WorkflowModelPackage.INPUTPORT_NODE_FEATURE_ID:
        getTarget().setNode((WorkflowNode) value);
        return;
      case WorkflowModelPackage.INPUTPORT_EDGES_FEATURE_ID:
        getTarget().setEdges((List<Edge>) value);
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

      case WorkflowModelPackage.INPUTPORT_EDGES_FEATURE_ID:
        return getTarget().addToEdges((Edge) value);
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

      case WorkflowModelPackage.INPUTPORT_EDGES_FEATURE_ID:
        return getTarget().removeFromEdges((Edge) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Fault</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class FaultModelObject<E extends Fault> extends OutputPortModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getFaultEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
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
   * The adapter/wrapper for the EClass '<em><b>CompoundTask</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CompoundTaskModelObject<E extends CompoundTask> extends WorkflowNodeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getCompoundTaskEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.COMPOUNDTASK_SUBWORKFLOW_FEATURE_ID:
        return getTarget().getSubworkflow();
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
      case WorkflowModelPackage.COMPOUNDTASK_SUBWORKFLOW_FEATURE_ID:
        getTarget().setSubworkflow((Workflow) value);
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
   * The adapter/wrapper for the EClass '<em><b>TransformationTask</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TransformationTaskModelObject<E extends TransformationTask> extends WorkflowNodeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getTransformationTaskEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.TRANSFORMATIONTASK_TRANSFORMEXPRESSION_FEATURE_ID:
        return getTarget().getTransformExpression();
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
      case WorkflowModelPackage.TRANSFORMATIONTASK_TRANSFORMEXPRESSION_FEATURE_ID:
        getTarget().setTransformExpression((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>ConditionalTask</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ConditionalTaskModelObject<E extends ConditionalTask> extends WorkflowNodeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getConditionalTaskEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
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
   * The adapter/wrapper for the EClass '<em><b>LoopTask</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class LoopTaskModelObject<E extends LoopTask> extends CompoundTaskModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getLoopTaskEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.LOOPTASK_WHILECONDITION_FEATURE_ID:
        return getTarget().getWhileCondition();
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
      case WorkflowModelPackage.LOOPTASK_WHILECONDITION_FEATURE_ID:
        getTarget().setWhileCondition((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Task</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TaskModelObject<E extends Task> extends WorkflowNodeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getTaskEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
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