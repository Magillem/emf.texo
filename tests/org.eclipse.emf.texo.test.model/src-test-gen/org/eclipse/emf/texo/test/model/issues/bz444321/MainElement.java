package org.eclipse.emf.texo.test.model.issues.bz444321;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>MainElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "bz444321_MainElement")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class MainElement extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private SubElement single = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, orphanRemoval = true)
  @OrderColumn()
  @JoinTable()
  private List<SubElement> multi = new ArrayList<SubElement>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  private List<SubElement> multiNoOrphanRemoval = new ArrayList<SubElement>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true)
  @OrderColumn()
  private List<SubElement> multiContainment = new ArrayList<SubElement>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<SubElement> multiContainmentNoOrphanRemoval = new ArrayList<SubElement>();

  /**
   * Returns the value of '<em><b>single</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>single</b></em>' feature
   * @generated
   */
  public SubElement getSingle() {
    return single;
  }

  /**
   * Sets the '{@link MainElement#getSingle() <em>single</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSingle
   *          the new value of the '{@link MainElement#getSingle() single}' feature.
   * @generated
   */
  public void setSingle(SubElement newSingle) {
    single = newSingle;
  }

  /**
   * Returns the value of '<em><b>multi</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>multi</b></em>' feature
   * @generated
   */
  public List<SubElement> getMulti() {
    return multi;
  }

  /**
   * Sets the '{@link MainElement#getMulti() <em>multi</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMulti
   *          the new value of the '{@link MainElement#getMulti() multi}' feature.
   * @generated
   */
  public void setMulti(List<SubElement> newMulti) {
    multi = newMulti;
  }

  /**
   * Returns the value of '<em><b>multiNoOrphanRemoval</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>multiNoOrphanRemoval</b></em>' feature
   * @generated
   */
  public List<SubElement> getMultiNoOrphanRemoval() {
    return multiNoOrphanRemoval;
  }

  /**
   * Sets the '{@link MainElement#getMultiNoOrphanRemoval() <em>multiNoOrphanRemoval</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMultiNoOrphanRemoval
   *          the new value of the '{@link MainElement#getMultiNoOrphanRemoval() multiNoOrphanRemoval}' feature.
   * @generated
   */
  public void setMultiNoOrphanRemoval(List<SubElement> newMultiNoOrphanRemoval) {
    multiNoOrphanRemoval = newMultiNoOrphanRemoval;
  }

  /**
   * Returns the value of '<em><b>multiContainment</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>multiContainment</b></em>' feature
   * @generated
   */
  public List<SubElement> getMultiContainment() {
    return multiContainment;
  }

  /**
   * Sets the '{@link MainElement#getMultiContainment() <em>multiContainment</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMultiContainment
   *          the new value of the '{@link MainElement#getMultiContainment() multiContainment}' feature.
   * @generated
   */
  public void setMultiContainment(List<SubElement> newMultiContainment) {
    multiContainment = newMultiContainment;
  }

  /**
   * Returns the value of '<em><b>multiContainmentNoOrphanRemoval</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>multiContainmentNoOrphanRemoval</b></em>' feature
   * @generated
   */
  public List<SubElement> getMultiContainmentNoOrphanRemoval() {
    return multiContainmentNoOrphanRemoval;
  }

  /**
   * Sets the '{@link MainElement#getMultiContainmentNoOrphanRemoval() <em>multiContainmentNoOrphanRemoval</em>}'
   * feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMultiContainmentNoOrphanRemoval
   *          the new value of the '{@link MainElement#getMultiContainmentNoOrphanRemoval()
   *          multiContainmentNoOrphanRemoval}' feature.
   * @generated
   */
  public void setMultiContainmentNoOrphanRemoval(List<SubElement> newMultiContainmentNoOrphanRemoval) {
    multiContainmentNoOrphanRemoval = newMultiContainmentNoOrphanRemoval;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "MainElement " + "{extends: " + super.toString() + "} ";
  }
}
