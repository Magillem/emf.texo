package org.eclipse.emf.texo.test.model.issues.bz415716;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>TestBz415716_One</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "bz415716_TestBz415716_One")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class TestBz415716_One extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  @JoinTable()
  private List<TestBz415716_Two> two = new ArrayList<TestBz415716_Two>();

  /**
   * Returns the value of '<em><b>two</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>two</b></em>' feature
   * @generated
   */
  public List<TestBz415716_Two> getTwo() {
    return two;
  }

  /**
   * Adds to the <em>two</em> feature.
   *
   * @param twoValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToTwo(TestBz415716_Two twoValue) {
    if (!two.contains(twoValue)) {
      boolean result = two.add(twoValue);
      twoValue.setOne(this);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>two</em> feature.
   *
   * @param twoValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   *
   * @generated
   */
  public boolean removeFromTwo(TestBz415716_Two twoValue) {
    if (two.contains(twoValue)) {
      boolean result = two.remove(twoValue);
      twoValue.setOne(null);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>two</em> feature.
   * 
   * @generated
   */
  public void clearTwo() {
    while (!two.isEmpty()) {
      removeFromTwo(two.iterator().next());
    }
  }

  /**
   * Sets the '{@link TestBz415716_One#getTwo() <em>two</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTwo
   *          the new value of the '{@link TestBz415716_One#getTwo() two}' feature.
   * @generated
   */
  public void setTwo(List<TestBz415716_Two> newTwo) {
    clearTwo();
    for (TestBz415716_Two value : newTwo) {
      addToTwo(value);
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
    return "TestBz415716_One " + "{extends: " + super.toString() + "} ";
  }
}
