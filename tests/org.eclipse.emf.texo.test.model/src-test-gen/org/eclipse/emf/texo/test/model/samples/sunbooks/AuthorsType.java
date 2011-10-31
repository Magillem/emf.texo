package org.eclipse.emf.texo.test.model.samples.sunbooks;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;

/** 
 * A representation of the model object '<em><b>AuthorsType</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "AuthorsType")
public class AuthorsType {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  private List<String> authorName = new ArrayList<String>();

  /**
   * Returns the value of '<em><b>authorName</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>authorName</b></em>' feature
   * @generated
   */
  public List<String> getAuthorName() {
    return authorName;
  }

  /**
   * Sets the '{@link AuthorsType#getAuthorName() <em>authorName</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link AuthorsType#getAuthorName() authorName}' feature.
   * @generated
   */
  public void setAuthorName(List<String> newAuthorName) {
    authorName = newAuthorName;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "AuthorsType ";
  }
}