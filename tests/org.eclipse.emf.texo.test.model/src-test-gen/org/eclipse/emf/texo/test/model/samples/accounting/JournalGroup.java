package org.eclipse.emf.texo.test.model.samples.accounting;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>JournalGroup</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "accounting_JournalGroup")
@Table(name = "accounting_JournalGroup")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class JournalGroup extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Column(name = "name")
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn(name = "accounting_JournalGroup_journalGroups_ind")
  @JoinColumns({ @JoinColumn(name = "accounting_JournalGroup_journalGroups") })
  private List<JournalGroup> journalGroups = new ArrayList<JournalGroup>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn(name = "accounting_JournalGroup_journalStatements_ind")
  @JoinColumns({ @JoinColumn(name = "accounting_JournalGroup_journalStatements") })
  private List<JournalStatement> journalStatements = new ArrayList<JournalStatement>();

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link JournalGroup#getName() <em>name</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link JournalGroup#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>journalGroups</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>journalGroups</b></em>' feature
   * @generated
   */
  public List<JournalGroup> getJournalGroups() {
    return journalGroups;
  }

  /**
   * Sets the '{@link JournalGroup#getJournalGroups() <em>journalGroups</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newJournalGroups
   *          the new value of the '{@link JournalGroup#getJournalGroups() journalGroups}' feature.
   * @generated
   */
  public void setJournalGroups(List<JournalGroup> newJournalGroups) {
    journalGroups = newJournalGroups;
  }

  /**
   * Returns the value of '<em><b>journalStatements</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>journalStatements</b></em>' feature
   * @generated
   */
  public List<JournalStatement> getJournalStatements() {
    return journalStatements;
  }

  /**
   * Sets the '{@link JournalGroup#getJournalStatements() <em>journalStatements</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newJournalStatements
   *          the new value of the '{@link JournalGroup#getJournalStatements() journalStatements}' feature.
   * @generated
   */
  public void setJournalStatements(List<JournalStatement> newJournalStatements) {
    journalStatements = newJournalStatements;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "JournalGroup " + " [name: " + getName() + "]" + "{extends: " + super.toString() + "} ";
  }
}
