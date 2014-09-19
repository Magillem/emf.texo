/**
 * Copyright (c) 2012 Springsite BV (http://www.springsite.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Author - Martin Taal
 */
package org.eclipse.emf.texo.modelgenerator.xtend;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.modelgenerator.annotator.GenUtils;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassifierModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.utils.ModelUtils;

@SuppressWarnings("all")
public class TemplateUtil {
  public static String classFileName(final EClassifierModelGenAnnotation eClassifierModelGenAnnotation) {
    String _qualifiedClassName = eClassifierModelGenAnnotation.getQualifiedClassName();
    String _replaceAll = _qualifiedClassName.replaceAll("\\.", "/");
    return (_replaceAll + ".java");
  }
  
  public static String daoClassFileName(final EClassModelGenAnnotation eClassModelGenAnnotation) {
    String _daoQualifiedClassName = eClassModelGenAnnotation.getDaoQualifiedClassName();
    String _replaceAll = _daoQualifiedClassName.replaceAll("\\.", "/");
    return (_replaceAll + ".java");
  }
  
  public static String classFileName(final EStructuralFeatureModelGenAnnotation eStructuralFeatureModelGenAnnotation) {
    String _featureMapQualifiedClassName = eStructuralFeatureModelGenAnnotation.getFeatureMapQualifiedClassName();
    String _replaceAll = _featureMapQualifiedClassName.replaceAll("\\.", "/");
    return (_replaceAll + ".java");
  }
  
  public static String packageFileName(final EPackageModelGenAnnotation ePackageModelGenAnnotation) {
    String _qualifiedClassName = ePackageModelGenAnnotation.getQualifiedClassName();
    String _replaceAll = _qualifiedClassName.replaceAll("\\.", "/");
    return (_replaceAll + ".java");
  }
  
  public static String ecoreFileName(final EPackageModelGenAnnotation ePackageModelGenAnnotation) {
    String _modelClassesPackagePath = ePackageModelGenAnnotation.getModelClassesPackagePath();
    String _plus = (_modelClassesPackagePath + ".");
    String _name = ePackageModelGenAnnotation.getName();
    String _plus_1 = (_plus + _name);
    String _replaceAll = _plus_1.replaceAll("\\.", "/");
    return (_replaceAll + ".ecore");
  }
  
  public static String modelFactoryFileName(final EPackageModelGenAnnotation ePackageModelGenAnnotation) {
    String _modelClassesPackagePath = ePackageModelGenAnnotation.getModelClassesPackagePath();
    String _plus = (_modelClassesPackagePath + ".");
    String _simpleModelFactoryClassName = ePackageModelGenAnnotation.getSimpleModelFactoryClassName();
    String _plus_1 = (_plus + _simpleModelFactoryClassName);
    String _replaceAll = _plus_1.replaceAll("\\.", "/");
    return (_replaceAll + ".java");
  }
  
  public static String toLowerCase(final String value) {
    return ModelUtils.toLowerCase(value);
  }
  
  public static String toUpperCase(final String value) {
    return ModelUtils.toUpperCase(value);
  }
  
  public static String toFirstLower(final String value) {
    return ModelUtils.lowerCaseFirst(value);
  }
  
  public static String toFirstUpper(final String value) {
    return ModelUtils.upCaseFirst(value);
  }
  
  public static boolean isDocumentRoot(final EClass eClass) {
    return GenUtils.isDocumentRoot(eClass);
  }
  
  public static String format(final String value) {
    return GenUtils.formatIdentifier(value);
  }
  
  public static boolean isMixed(final EStructuralFeature eStructuralFeature) {
    return ModelUtils.isMixed(eStructuralFeature);
  }
  
  public static String getDocumentation(final ENamedElement eNamedElement) {
    return ModelUtils.getDocumentation(eNamedElement);
  }
  
  public static String cast(final String value) {
    return GenUtils.cast(value);
  }
  
  public static String correctTypeDef(final String value) {
    return GenUtils.correctTypeDef(value);
  }
}
