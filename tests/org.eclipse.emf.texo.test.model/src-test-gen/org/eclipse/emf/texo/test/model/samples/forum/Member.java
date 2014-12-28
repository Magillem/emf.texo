package org.eclipse.emf.texo.test.model.samples.forum;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Member</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "forum_Member")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Member extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String nickname = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  private List<Post> posts = new ArrayList<Post>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  private List<Topic> created = new ArrayList<Topic>();

  /**
   * Returns the value of '<em><b>nickname</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>nickname</b></em>' feature
   * @generated
   */
  public String getNickname() {
    return nickname;
  }

  /**
   * Sets the '{@link Member#getNickname() <em>nickname</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newNickname
   *          the new value of the '{@link Member#getNickname() nickname}' feature.
   * @generated
   */
  public void setNickname(String newNickname) {
    nickname = newNickname;
  }

  /**
   * Returns the value of '<em><b>posts</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>posts</b></em>' feature
   * @generated
   */
  public List<Post> getPosts() {
    return posts;
  }

  /**
   * Sets the '{@link Member#getPosts() <em>posts</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPosts
   *          the new value of the '{@link Member#getPosts() posts}' feature.
   * @generated
   */
  public void setPosts(List<Post> newPosts) {
    posts = newPosts;
  }

  /**
   * Returns the value of '<em><b>created</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>created</b></em>' feature
   * @generated
   */
  public List<Topic> getCreated() {
    return created;
  }

  /**
   * Sets the '{@link Member#getCreated() <em>created</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCreated
   *          the new value of the '{@link Member#getCreated() created}' feature.
   * @generated
   */
  public void setCreated(List<Topic> newCreated) {
    created = newCreated;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Member " + " [nickname: " + getNickname() + "]" + "{extends: " + super.toString() + "} ";
  }
}
