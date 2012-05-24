package org.eclipse.modisco.kdm.data;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * A representation of the model object '<em><b>XMLSchema</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "XMLSchema")
public class XMLSchema extends AbstractDataElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractContentElement> contentElement = new HashSet<AbstractContentElement>();

  /**
   * Returns the value of '<em><b>contentElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>contentElement</b></em>' feature
   * @generated
   */
  public Set<AbstractContentElement> getContentElement() {
    return contentElement;
  }

  /**
   * Adds to the <em>contentElement</em> feature.
   * 
   * @generated
   */
  public void addToContentElement(AbstractContentElement contentElementValue) {
    if (!contentElement.contains(contentElementValue)) {
      contentElement.add(contentElementValue);
    }
  }

  /**
   * Removes from the <em>contentElement</em> feature.
   * 
   * @generated
   */
  public void removeFromContentElement(AbstractContentElement contentElementValue) {
    if (contentElement.contains(contentElementValue)) {
      contentElement.remove(contentElementValue);
    }
  }

  /**
   * Clears the <em>contentElement</em> feature.
   * 
   * @generated
   */
  public void clearContentElement() {
    while (!contentElement.isEmpty()) {
      removeFromContentElement(contentElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link XMLSchema#getContentElement() <em>contentElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link XMLSchema#getContentElement() contentElement}' feature.
   * @generated
   */
  public void setContentElement(Set<AbstractContentElement> newContentElement) {
    contentElement = newContentElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "XMLSchema ";
  }
}
