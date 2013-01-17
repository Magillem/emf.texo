package org.eclipse.emf.texo.test.model.issues.bz391624;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Book</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "bz391624_Book")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Book extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @CollectionTable(name = "AUTHOR")
  private List<Author> authors = new ArrayList<Author>();

  /**
   * Returns the value of '<em><b>authors</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>authors</b></em>' feature
   * @generated
   */
  public List<Author> getAuthors() {
    return authors;
  }

  /**
   * Adds to the <em>authors</em> feature.
   * 
   * @param authorsValue
   *          the value to add
   * 
   * @generated
   */
  public void addToAuthors(Author authorsValue) {
    if (!authors.contains(authorsValue)) {
      authors.add(authorsValue);
    }
  }

  /**
   * Removes from the <em>authors</em> feature.
   * 
   * @param authorsValue
   *          the value to remove
   * 
   * @generated
   */
  public void removeFromAuthors(Author authorsValue) {
    if (authors.contains(authorsValue)) {
      authors.remove(authorsValue);
    }
  }

  /**
   * Clears the <em>authors</em> feature.
   * 
   * @generated
   */
  public void clearAuthors() {
    while (!authors.isEmpty()) {
      removeFromAuthors(authors.iterator().next());
    }
  }

  /**
   * Sets the '{@link Book#getAuthors() <em>authors</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAuthors
   *          the new value of the '{@link Book#getAuthors() authors}' feature.
   * @generated
   */
  public void setAuthors(List<Author> newAuthors) {
    authors = newAuthors;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Book ";
  }
}
