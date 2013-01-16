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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ReportGroup</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "accounting_ReportGroup")
@Table(name = "accounting_ReportGroup")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ReportGroup extends Identifiable {

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
  @OrderColumn(name = "accounting_ReportGroup_reportGroup_ind")
  @JoinColumns({ @JoinColumn(name = "accounting_ReportGroup_reportGroup") })
  private List<ReportGroup> reportGroup = new ArrayList<ReportGroup>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn(name = "accounting_ReportGroup_account_ind")
  @JoinTable(joinColumns = { @JoinColumn(name = "accounting_ReportGroup_account") }, inverseJoinColumns = { @JoinColumn(name = "account_accounting_BalanceAccount") }, name = "accounting_ReportGroup_account")
  private List<BalanceAccount> account = new ArrayList<BalanceAccount>();

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
   * Sets the '{@link ReportGroup#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link ReportGroup#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>reportGroup</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>reportGroup</b></em>' feature
   * @generated
   */
  public List<ReportGroup> getReportGroup() {
    return reportGroup;
  }

  /**
   * Adds to the <em>reportGroup</em> feature.
   * 
   * @generated
   */
  public void addToReportGroup(ReportGroup reportGroupValue) {
    if (!reportGroup.contains(reportGroupValue)) {
      reportGroup.add(reportGroupValue);
    }
  }

  /**
   * Removes from the <em>reportGroup</em> feature.
   * 
   * @generated
   */
  public void removeFromReportGroup(ReportGroup reportGroupValue) {
    if (reportGroup.contains(reportGroupValue)) {
      reportGroup.remove(reportGroupValue);
    }
  }

  /**
   * Clears the <em>reportGroup</em> feature.
   * 
   * @generated
   */
  public void clearReportGroup() {
    while (!reportGroup.isEmpty()) {
      removeFromReportGroup(reportGroup.iterator().next());
    }
  }

  /**
   * Sets the '{@link ReportGroup#getReportGroup() <em>reportGroup</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newReportGroup
   *          the new value of the '{@link ReportGroup#getReportGroup() reportGroup}' feature.
   * @generated
   */
  public void setReportGroup(List<ReportGroup> newReportGroup) {
    reportGroup = newReportGroup;
  }

  /**
   * Returns the value of '<em><b>account</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>account</b></em>' feature
   * @generated
   */
  public List<BalanceAccount> getAccount() {
    return account;
  }

  /**
   * Adds to the <em>account</em> feature.
   * 
   * @generated
   */
  public void addToAccount(BalanceAccount accountValue) {
    if (!account.contains(accountValue)) {
      account.add(accountValue);
    }
  }

  /**
   * Removes from the <em>account</em> feature.
   * 
   * @generated
   */
  public void removeFromAccount(BalanceAccount accountValue) {
    if (account.contains(accountValue)) {
      account.remove(accountValue);
    }
  }

  /**
   * Clears the <em>account</em> feature.
   * 
   * @generated
   */
  public void clearAccount() {
    while (!account.isEmpty()) {
      removeFromAccount(account.iterator().next());
    }
  }

  /**
   * Sets the '{@link ReportGroup#getAccount() <em>account</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAccount
   *          the new value of the '{@link ReportGroup#getAccount() account}' feature.
   * @generated
   */
  public void setAccount(List<BalanceAccount> newAccount) {
    account = newAccount;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ReportGroup " + " [name: " + getName() + "]";
  }
}
