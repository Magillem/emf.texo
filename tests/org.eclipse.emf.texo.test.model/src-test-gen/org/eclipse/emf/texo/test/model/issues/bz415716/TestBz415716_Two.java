package org.eclipse.emf.texo.test.model.issues.bz415716;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>TestBz415716_Two</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "bz415716_TestBz415716_Two")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class TestBz415716_Two extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn() })
  private TestBz415716_One one = null;

  /**
   * Returns the value of '<em><b>one</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>one</b></em>' feature
   * @generated
   */
  public TestBz415716_One getOne() {
    return one;
  }

  /**
   * Sets the '{@link TestBz415716_Two#getOne() <em>one</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newOne
   *          the new value of the '{@link TestBz415716_Two#getOne() one}' feature.
   * @generated
   */
  public void setOne(TestBz415716_One newOne) {
    if (one != newOne) {
      if (one != null) {
        one.removeFromTwo(this);
      }
      one = newOne;
      if (one != null) {
        one.addToTwo(this);
      }
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
    return "TestBz415716_Two " + "{extends: " + super.toString() + "} ";
  }
}
