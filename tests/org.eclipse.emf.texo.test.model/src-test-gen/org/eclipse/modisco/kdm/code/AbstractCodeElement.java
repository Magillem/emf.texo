package org.eclipse.modisco.kdm.code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.action.EntryFlow;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.modisco.kdm.source.SourceRef;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>AbstractCodeElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "code_AbstractCodeElement")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class AbstractCodeElement extends KDMEntity {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<SourceRef> source = new HashSet<SourceRef>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<CommentUnit> comment = new HashSet<CommentUnit>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractCodeRelationship> codeRelation = new HashSet<AbstractCodeRelationship>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  private List<EntryFlow> entryFlow = new ArrayList<EntryFlow>();

  /**
   * Returns the value of '<em><b>source</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>source</b></em>' feature
   * @generated
   */
  public Set<SourceRef> getSource() {
    return source;
  }

  /**
   * Sets the '{@link AbstractCodeElement#getSource() <em>source</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSource
   *          the new value of the '{@link AbstractCodeElement#getSource() source}' feature.
   * @generated
   */
  public void setSource(Set<SourceRef> newSource) {
    source = newSource;
  }

  /**
   * Returns the value of '<em><b>comment</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>comment</b></em>' feature
   * @generated
   */
  public Set<CommentUnit> getComment() {
    return comment;
  }

  /**
   * Sets the '{@link AbstractCodeElement#getComment() <em>comment</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newComment
   *          the new value of the '{@link AbstractCodeElement#getComment() comment}' feature.
   * @generated
   */
  public void setComment(Set<CommentUnit> newComment) {
    comment = newComment;
  }

  /**
   * Returns the value of '<em><b>codeRelation</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>codeRelation</b></em>' feature
   * @generated
   */
  public Set<AbstractCodeRelationship> getCodeRelation() {
    return codeRelation;
  }

  /**
   * Sets the '{@link AbstractCodeElement#getCodeRelation() <em>codeRelation</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCodeRelation
   *          the new value of the '{@link AbstractCodeElement#getCodeRelation() codeRelation}' feature.
   * @generated
   */
  public void setCodeRelation(Set<AbstractCodeRelationship> newCodeRelation) {
    codeRelation = newCodeRelation;
  }

  /**
   * Returns the value of '<em><b>entryFlow</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>entryFlow</b></em>' feature
   * @generated
   */
  public List<EntryFlow> getEntryFlow() {
    return entryFlow;
  }

  /**
   * Sets the '{@link AbstractCodeElement#getEntryFlow() <em>entryFlow</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEntryFlow
   *          the new value of the '{@link AbstractCodeElement#getEntryFlow() entryFlow}' feature.
   * @generated
   */
  public void setEntryFlow(List<EntryFlow> newEntryFlow) {
    entryFlow = newEntryFlow;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AbstractCodeElement " + "{extends: " + super.toString() + "} ";
  }
}
