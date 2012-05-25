package org.eclipse.emf.texo.test.model.issues.bz331009;

import javax.persistence.Entity;
import javax.persistence.Table;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>UserGroup</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> Группа пользователей <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_UserGroup")
@Table(name = "m_UserGroup")
public class UserGroup extends Identifiable {

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "UserGroup ";
  }
}
