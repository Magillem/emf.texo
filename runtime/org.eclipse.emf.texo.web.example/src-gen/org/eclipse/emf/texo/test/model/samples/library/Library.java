package org.eclipse.emf.texo.test.model.samples.library;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/** 
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class Library extends Identifiable {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String name = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<Writer> writers = new ArrayList<Writer>();

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<Book> books = new ArrayList<Book>();

	/**
	 * Returns the value of '<em><b>name</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>name</b></em>' feature
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the '{@link Library#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Library#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>writers</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>writers</b></em>' feature
	 * @generated
	 */
	public List<Writer> getWriters() {
		return writers;
	}

	/**
	 * Adds to the <em>writers</em> feature.
	 * @generated
	 */
	public void addToWriters(Writer writersValue) {

		if (!writers.contains(writersValue)) {

			writers.add(writersValue);

		}

	}

	/**			
	 * Removes from the <em>writers</em> feature.
	 * @generated
	 */
	public void removeFromWriters(Writer writersValue) {
		if (writers.contains(writersValue)) {
			writers.remove(writersValue);
		}
	}

	/**			
	 * Clears the <em>writers</em> feature.
	 * @generated
	 */
	public void clearWriters() {
		for (Writer writersElement : writers) {
			removeFromWriters(writersElement);
		}
	}

	/**
	 * Sets the '{@link Library#getWriters() <em>writers</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Library#getWriters() writers}' feature.
	 * @generated
	 */
	public void setWriters(List<Writer> newWriters) {
		writers = newWriters;
	}

	/**
	 * Returns the value of '<em><b>books</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>books</b></em>' feature
	 * @generated
	 */
	public List<Book> getBooks() {
		return books;
	}

	/**
	 * Adds to the <em>books</em> feature.
	 * @generated
	 */
	public void addToBooks(Book booksValue) {

		if (!books.contains(booksValue)) {

			books.add(booksValue);

		}

	}

	/**			
	 * Removes from the <em>books</em> feature.
	 * @generated
	 */
	public void removeFromBooks(Book booksValue) {
		if (books.contains(booksValue)) {
			books.remove(booksValue);
		}
	}

	/**			
	 * Clears the <em>books</em> feature.
	 * @generated
	 */
	public void clearBooks() {
		for (Book booksElement : books) {
			removeFromBooks(booksElement);
		}
	}

	/**
	 * Sets the '{@link Library#getBooks() <em>books</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Library#getBooks() books}' feature.
	 * @generated
	 */
	public void setBooks(List<Book> newBooks) {
		books = newBooks;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "Library " + " [name: " + getName() + "]";
	}
}
