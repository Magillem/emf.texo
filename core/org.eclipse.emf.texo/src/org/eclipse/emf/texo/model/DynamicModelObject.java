/**
 * <copyright>
 *
 * Copyright (c) 2009, 2010 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: DynamicModelObject.java,v 1.4 2011/08/25 12:32:37 mtaal Exp $
 */

package org.eclipse.emf.texo.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.component.TexoComponent;

/**
 * A dynamic representation of the {@link ModelObject}. Stores its values internally in an ArrayList.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class DynamicModelObject implements ModelObject<DynamicModelObject>, TexoComponent {

  private EClass eClass;
  private List<Object> values = new ArrayList<Object>();

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.model.ModelObject#getModelPackage()
   */
  public ModelPackage getModelPackage() {
    // TODO: maybe auto-create dynamic packages?
    throw new UnsupportedOperationException();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.model.ModelObject#setTarget(java.lang.Object)
   */
  public void setTarget(DynamicModelObject target) {
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.model.ModelObject#getTarget()
   */
  public DynamicModelObject getTarget() {
    return this;
  }

  /**
   * @return the {@link EClass} represented by this object
   */
  public EClass eClass() {
    return eClass;
  }

  public void setEClass(EClass eClass) {
    this.eClass = eClass;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.model.ModelObject#eGet(org.eclipse.emf.ecore.EStructuralFeature)
   */
  public Object eGet(EStructuralFeature eStructuralFeature) {
    final int featureId = eClass().getFeatureID(eStructuralFeature);
    if (featureId > values.size() - 1) {
      checkIncreaseValues(featureId);
    }
    final Object value = values.get(featureId);
    if (eStructuralFeature.isMany() && value == null) {
      final List<Object> newValue = new ArrayList<Object>();
      eSet(eStructuralFeature, newValue);
      return newValue;
    }
    return value;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.model.ModelObject#eSet(org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
   */
  public void eSet(EStructuralFeature eStructuralFeature, Object value) {
    final int featureId = eClass().getFeatureID(eStructuralFeature);
    if (featureId > values.size() - 1) {
      checkIncreaseValues(featureId);
    }
    // TODO: add some class checking....
    values.set(featureId, value);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.model.ModelObject#eSet(org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
   */
  public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
    final int featureId = eClass().getFeatureID(eStructuralFeature);
    if (featureId > values.size() - 1) {
      checkIncreaseValues(featureId);
    }
    @SuppressWarnings("unchecked")
    final Collection<Object> localValues = (Collection<Object>) eGet(eStructuralFeature);
    if (!localValues.contains(value)) {
      localValues.add(value);
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.model.ModelObject#eRemoveFrom(org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
   */
  public void eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
    final int featureId = eClass().getFeatureID(eStructuralFeature);
    if (featureId > values.size() - 1) {
      checkIncreaseValues(featureId);
    }
    @SuppressWarnings("unchecked")
    final Collection<Object> localValues = (Collection<Object>) eGet(eStructuralFeature);
    if (localValues.contains(value)) {
      localValues.remove(value);
    }
  }

  private synchronized void checkIncreaseValues(int featureId) {
    final int increaseBy = featureId - values.size() + 1;
    for (int i = 0; i < increaseBy; i++) {
      values.add(null);
    }
  }
}