package org.eclipse.modisco.kdm.code;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/** 
 * A representation of the model object '<em><b>Expands</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "Expands")
public class Expands extends AbstractCodeRelationship {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = MacroUnit.class)
  @JoinColumns({ @JoinColumn() })
  private MacroUnit to = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = PreprocessorDirective.class)
  @JoinColumns({ @JoinColumn() })
  private PreprocessorDirective from = null;

  /**
   * Returns the value of '<em><b>to</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>to</b></em>' feature
   * @generated
   */
  public MacroUnit getTo() {
    return to;
  }

  /**
   * Sets the '{@link Expands#getTo() <em>to</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Expands#getTo() to}' feature.
   * @generated
   */
  public void setTo(MacroUnit newTo) {
    to = newTo;
  }

  /**
   * Returns the value of '<em><b>from</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>from</b></em>' feature
   * @generated
   */
  public PreprocessorDirective getFrom() {
    return from;
  }

  /**
   * Sets the '{@link Expands#getFrom() <em>from</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Expands#getFrom() from}' feature.
   * @generated
   */
  public void setFrom(PreprocessorDirective newFrom) {
    from = newFrom;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "Expands ";
  }
}