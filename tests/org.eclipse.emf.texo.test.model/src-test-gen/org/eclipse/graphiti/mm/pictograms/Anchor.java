package org.eclipse.graphiti.mm.pictograms;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Anchor</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "pi_Anchor")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class Anchor extends PictogramElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  private AnchorContainer parent = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, mappedBy = "start")
  private Set<Connection> outgoingConnections = new HashSet<Connection>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, mappedBy = "end")
  private Set<Connection> incomingConnections = new HashSet<Connection>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  private GraphicsAlgorithm referencedGraphicsAlgorithm = null;

  /**
   * Returns the value of '<em><b>parent</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>parent</b></em>' feature
   * @generated
   */
  public AnchorContainer getParent() {
    return parent;
  }

  /**
   * Sets the '{@link Anchor#getParent() <em>parent</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newParent
   *          the new value of the '{@link Anchor#getParent() parent}' feature.
   * @generated
   */
  public void setParent(AnchorContainer newParent) {
    if (parent != newParent) {
      if (parent != null) {
        parent.removeFromAnchors(this);
      }
      parent = newParent;
      if (parent != null) {
        parent.addToAnchors(this);
      }
    }
  }

  /**
   * Returns the value of '<em><b>outgoingConnections</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>outgoingConnections</b></em>' feature
   * @generated
   */
  public Set<Connection> getOutgoingConnections() {
    return outgoingConnections;
  }

  /**
   * Adds to the <em>outgoingConnections</em> feature.
   * 
   * @param outgoingConnectionsValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToOutgoingConnections(Connection outgoingConnectionsValue) {
    if (!outgoingConnections.contains(outgoingConnectionsValue)) {
      boolean result = outgoingConnections.add(outgoingConnectionsValue);
      outgoingConnectionsValue.setStart(this);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>outgoingConnections</em> feature.
   * 
   * @param outgoingConnectionsValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromOutgoingConnections(Connection outgoingConnectionsValue) {
    if (outgoingConnections.contains(outgoingConnectionsValue)) {
      boolean result = outgoingConnections.remove(outgoingConnectionsValue);
      outgoingConnectionsValue.setStart(null);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>outgoingConnections</em> feature.
   * 
   * @generated
   */
  public void clearOutgoingConnections() {
    while (!outgoingConnections.isEmpty()) {
      removeFromOutgoingConnections(outgoingConnections.iterator().next());
    }
  }

  /**
   * Sets the '{@link Anchor#getOutgoingConnections() <em>outgoingConnections</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newOutgoingConnections
   *          the new value of the '{@link Anchor#getOutgoingConnections() outgoingConnections}' feature.
   * @generated
   */
  public void setOutgoingConnections(Set<Connection> newOutgoingConnections) {
    clearOutgoingConnections();
    for (Connection value : newOutgoingConnections) {
      addToOutgoingConnections(value);
    }
  }

  /**
   * Returns the value of '<em><b>incomingConnections</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>incomingConnections</b></em>' feature
   * @generated
   */
  public Set<Connection> getIncomingConnections() {
    return incomingConnections;
  }

  /**
   * Adds to the <em>incomingConnections</em> feature.
   * 
   * @param incomingConnectionsValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToIncomingConnections(Connection incomingConnectionsValue) {
    if (!incomingConnections.contains(incomingConnectionsValue)) {
      boolean result = incomingConnections.add(incomingConnectionsValue);
      incomingConnectionsValue.setEnd(this);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>incomingConnections</em> feature.
   * 
   * @param incomingConnectionsValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromIncomingConnections(Connection incomingConnectionsValue) {
    if (incomingConnections.contains(incomingConnectionsValue)) {
      boolean result = incomingConnections.remove(incomingConnectionsValue);
      incomingConnectionsValue.setEnd(null);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>incomingConnections</em> feature.
   * 
   * @generated
   */
  public void clearIncomingConnections() {
    while (!incomingConnections.isEmpty()) {
      removeFromIncomingConnections(incomingConnections.iterator().next());
    }
  }

  /**
   * Sets the '{@link Anchor#getIncomingConnections() <em>incomingConnections</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newIncomingConnections
   *          the new value of the '{@link Anchor#getIncomingConnections() incomingConnections}' feature.
   * @generated
   */
  public void setIncomingConnections(Set<Connection> newIncomingConnections) {
    clearIncomingConnections();
    for (Connection value : newIncomingConnections) {
      addToIncomingConnections(value);
    }
  }

  /**
   * Returns the value of '<em><b>referencedGraphicsAlgorithm</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>referencedGraphicsAlgorithm</b></em>' feature
   * @generated
   */
  public GraphicsAlgorithm getReferencedGraphicsAlgorithm() {
    return referencedGraphicsAlgorithm;
  }

  /**
   * Sets the '{@link Anchor#getReferencedGraphicsAlgorithm() <em>referencedGraphicsAlgorithm</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newReferencedGraphicsAlgorithm
   *          the new value of the '{@link Anchor#getReferencedGraphicsAlgorithm() referencedGraphicsAlgorithm}'
   *          feature.
   * @generated
   */
  public void setReferencedGraphicsAlgorithm(GraphicsAlgorithm newReferencedGraphicsAlgorithm) {
    referencedGraphicsAlgorithm = newReferencedGraphicsAlgorithm;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Anchor " + "{extends: " + super.toString() + "} ";
  }
}
