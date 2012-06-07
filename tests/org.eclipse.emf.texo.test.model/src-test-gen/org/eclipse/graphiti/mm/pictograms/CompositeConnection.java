package org.eclipse.graphiti.mm.pictograms;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;

/**
 * A representation of the model object '<em><b>CompositeConnection</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "pi_CompositeConnection")
public class CompositeConnection extends Connection {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  private List<CurvedConnection> children = new ArrayList<CurvedConnection>();

  /**
   * Returns the value of '<em><b>children</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>children</b></em>' feature
   * @generated
   */
  public List<CurvedConnection> getChildren() {
    return children;
  }

  /**
   * Adds to the <em>children</em> feature.
   * 
   * @generated
   */
  public void addToChildren(CurvedConnection childrenValue) {
    if (!children.contains(childrenValue)) {
      children.add(childrenValue);
    }
  }

  /**
   * Removes from the <em>children</em> feature.
   * 
   * @generated
   */
  public void removeFromChildren(CurvedConnection childrenValue) {
    if (children.contains(childrenValue)) {
      children.remove(childrenValue);
    }
  }

  /**
   * Clears the <em>children</em> feature.
   * 
   * @generated
   */
  public void clearChildren() {
    while (!children.isEmpty()) {
      removeFromChildren(children.iterator().next());
    }
  }

  /**
   * Sets the '{@link CompositeConnection#getChildren() <em>children</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link CompositeConnection#getChildren() children}' feature.
   * @generated
   */
  public void setChildren(List<CurvedConnection> newChildren) {
    children = newChildren;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "CompositeConnection ";
  }
}