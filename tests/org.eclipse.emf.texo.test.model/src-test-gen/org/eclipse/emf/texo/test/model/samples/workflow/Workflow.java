package org.eclipse.emf.texo.test.model.samples.workflow;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Workflow</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "workflow_Workflow")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Workflow extends WorkflowElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn(name = "workflow_Workflow_nodes_ind")
  @JoinColumns({ @JoinColumn(name = "workflow_Workflow_nodes") })
  private List<WorkflowNode> nodes = new ArrayList<WorkflowNode>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn(name = "workflow_Workflow_edges_ind")
  @JoinColumns({ @JoinColumn(name = "workflow_Workflow_edges") })
  private List<Edge> edges = new ArrayList<Edge>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn(name = "workflow_Workflow_comments_ind")
  @JoinColumns({ @JoinColumn(name = "workflow_Workflow_comments") })
  private List<Comment> comments = new ArrayList<Comment>();

  /**
   * Returns the value of '<em><b>nodes</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>nodes</b></em>' feature
   * @generated
   */
  public List<WorkflowNode> getNodes() {
    return nodes;
  }

  /**
   * Sets the '{@link Workflow#getNodes() <em>nodes</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newNodes
   *          the new value of the '{@link Workflow#getNodes() nodes}' feature.
   * @generated
   */
  public void setNodes(List<WorkflowNode> newNodes) {
    nodes = newNodes;
  }

  /**
   * Returns the value of '<em><b>edges</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>edges</b></em>' feature
   * @generated
   */
  public List<Edge> getEdges() {
    return edges;
  }

  /**
   * Sets the '{@link Workflow#getEdges() <em>edges</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEdges
   *          the new value of the '{@link Workflow#getEdges() edges}' feature.
   * @generated
   */
  public void setEdges(List<Edge> newEdges) {
    edges = newEdges;
  }

  /**
   * Returns the value of '<em><b>comments</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>comments</b></em>' feature
   * @generated
   */
  public List<Comment> getComments() {
    return comments;
  }

  /**
   * Sets the '{@link Workflow#getComments() <em>comments</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newComments
   *          the new value of the '{@link Workflow#getComments() comments}' feature.
   * @generated
   */
  public void setComments(List<Comment> newComments) {
    comments = newComments;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Workflow " + "{extends: " + super.toString() + "} ";
  }
}
