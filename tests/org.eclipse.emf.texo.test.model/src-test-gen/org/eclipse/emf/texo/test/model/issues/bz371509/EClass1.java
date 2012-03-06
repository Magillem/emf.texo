package org.eclipse.emf.texo.test.model.issues.bz371509;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * A representation of the model object '<em><b>EClass1</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "EClass1")
public class EClass1 {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, mappedBy = "toClass1", targetEntity = EClass0.class)
  private Set<EClass0> toClass0 = new HashSet<EClass0>();

  /**
   * Returns the value of '<em><b>toClass0</b></em>' feature. Note: the returned collection is Unmodifiable use the
   * {#addToToClass0(org.eclipse.emf.texo.test.model.issues.bz371509.EClass0 value)} and
   * {@link #removeFromToClass0(EClass0 value)} methods to modify this feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>toClass0</b></em>' feature
   * @generated
   */
  public Set<EClass0> getToClass0() {
    return Collections.unmodifiableSet(toClass0);
  }

  /**
   * Adds to the <em>toClass0</em> feature.
   * 
   * @generated
   */
  public void addToToClass0(EClass0 toClass0Value) {
    if (!toClass0.contains(toClass0Value)) {

      toClass0.add(toClass0Value);
      toClass0Value.setToClass1(this);
    }

  }

  /**
   * Removes from the <em>toClass0</em> feature.
   * 
   * @generated
   */
  public void removeFromToClass0(EClass0 toClass0Value) {
    if (toClass0.contains(toClass0Value)) {
      toClass0.remove(toClass0Value);
      toClass0Value.setToClass1(null);
    }
  }

  /**
   * Clears the <em>toClass0</em> feature.
   * 
   * @generated
   */
  public void clearToClass0() {
    while (!toClass0.isEmpty()) {
      removeFromToClass0(toClass0.iterator().next());
    }
  }

  /**
   * Sets the '{@link EClass1#getToClass0() <em>toClass0</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link EClass1#getToClass0() toClass0}' feature.
   * @generated
   */
  public void setToClass0(Set<EClass0> newToClass0) {
    clearToClass0();
    for (EClass0 value : newToClass0) {
      addToToClass0(value);
    }
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "EClass1 ";
  }
}
