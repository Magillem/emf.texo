package org.eclipse.emf.texo.test.model.samples.workflow;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>WorkflowNode</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "workflow_WorkflowNode")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class WorkflowNode extends WorkflowElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
  @JoinColumns({ @JoinColumn(name = "workflow_WorkflowNode_workflow", nullable = true) })
  private Workflow workflow = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn(name = "workflow_WorkflowNode_outputs_ind")
  @JoinColumns({ @JoinColumn(name = "workflow_WorkflowNode_outputs") })
  private List<OutputPort> outputs = new ArrayList<OutputPort>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn(name = "workflow_WorkflowNode_inputs_ind")
  @JoinColumns({ @JoinColumn(name = "workflow_WorkflowNode_inputs") })
  private List<InputPort> inputs = new ArrayList<InputPort>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Column(name = "isStart", nullable = true)
  private boolean isStart = false;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Column(name = "isFinish", nullable = true)
  private boolean isFinish = false;

  /**
   * Returns the value of '<em><b>workflow</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>workflow</b></em>' feature
   * @generated
   */
  public Workflow getWorkflow() {
    return workflow;
  }

  /**
   * Sets the '{@link WorkflowNode#getWorkflow() <em>workflow</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newWorkflow
   *          the new value of the '{@link WorkflowNode#getWorkflow() workflow}' feature.
   * @generated
   */
  public void setWorkflow(Workflow newWorkflow) {
    workflow = newWorkflow;
  }

  /**
   * Returns the value of '<em><b>outputs</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>outputs</b></em>' feature
   * @generated
   */
  public List<OutputPort> getOutputs() {
    return outputs;
  }

  /**
   * Sets the '{@link WorkflowNode#getOutputs() <em>outputs</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newOutputs
   *          the new value of the '{@link WorkflowNode#getOutputs() outputs}' feature.
   * @generated
   */
  public void setOutputs(List<OutputPort> newOutputs) {
    outputs = newOutputs;
  }

  /**
   * Returns the value of '<em><b>inputs</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>inputs</b></em>' feature
   * @generated
   */
  public List<InputPort> getInputs() {
    return inputs;
  }

  /**
   * Sets the '{@link WorkflowNode#getInputs() <em>inputs</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newInputs
   *          the new value of the '{@link WorkflowNode#getInputs() inputs}' feature.
   * @generated
   */
  public void setInputs(List<InputPort> newInputs) {
    inputs = newInputs;
  }

  /**
   * Returns the value of '<em><b>isStart</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>isStart</b></em>' feature
   * @generated
   */
  public boolean isIsStart() {
    return isStart;
  }

  /**
   * Sets the '{@link WorkflowNode#isIsStart() <em>isStart</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newIsStart
   *          the new value of the '{@link WorkflowNode#isIsStart() isStart}' feature.
   * @generated
   */
  public void setIsStart(boolean newIsStart) {
    isStart = newIsStart;
  }

  /**
   * Returns the value of '<em><b>isFinish</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>isFinish</b></em>' feature
   * @generated
   */
  public boolean isIsFinish() {
    return isFinish;
  }

  /**
   * Sets the '{@link WorkflowNode#isIsFinish() <em>isFinish</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newIsFinish
   *          the new value of the '{@link WorkflowNode#isIsFinish() isFinish}' feature.
   * @generated
   */
  public void setIsFinish(boolean newIsFinish) {
    isFinish = newIsFinish;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "WorkflowNode " + " [isStart: " + isIsStart() + "]" + " [isFinish: " + isIsFinish() + "]" + "{extends: "
        + super.toString() + "} ";
  }
}
