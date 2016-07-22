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

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.generator.BaseTemplate;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.xtend.TemplateUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ModelObjectTemplate extends BaseTemplate {
  public String generateContent(final EClassModelGenAnnotation eClassModelGenAnnotation) {
    String _xblockexpression = null;
    {
      EPackageModelGenAnnotation ePackageAnnotation = eClassModelGenAnnotation.getOwnerEPackageAnnotation();
      ModelController _modelController = this.getModelController();
      _xblockexpression = this.generateContent(_modelController, eClassModelGenAnnotation, ePackageAnnotation);
    }
    return _xblockexpression;
  }
  
  /**
   * Note that this method is just here for reference purposes,
   * this template is not overrideable at this point as the
   * override assumes that the overrider will generate a file
   */
  @Override
  public List<String> getTemplateOverrides() {
    List<String> list = new ArrayList<String>();
    list.add("org::eclipse::emf::texo::modelgenerator::templates::modelobject");
    list.add("org::eclipse::emf::texo::modelgenerator::xtend::ModelObjectTemplate");
    return list;
  }
  
  public String generateContent(final ModelController modelController, final EClassModelGenAnnotation eClassModelGenAnnotation, final EPackageModelGenAnnotation ePackageAnnotation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* The adapter/wrapper for the EClass \'<em><b>");
    String _name = eClassModelGenAnnotation.getName();
    _builder.append(_name, " ");
    _builder.append("</b></em>\'.");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param <E> the domain model java class");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public static class ");
    String _simpleClassName = eClassModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName, "");
    _builder.append("ModelObject<E extends ");
    String _qualifiedClassName = eClassModelGenAnnotation.getQualifiedClassName();
    _builder.append(_qualifiedClassName, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      boolean _isHasSuperEClass = eClassModelGenAnnotation.isHasSuperEClass();
      if (_isHasSuperEClass) {
        EClassModelGenAnnotation eSuperClassAnnotation = eClassModelGenAnnotation.getSuperEClass();
        _builder.newLineIfNotEmpty();
        EClassModelGenAnnotation _superEClass = eClassModelGenAnnotation.getSuperEClass();
        EPackageModelGenAnnotation eSuperPackageAnnotation = _superEClass.getOwnerEPackageAnnotation();
        _builder.newLineIfNotEmpty();
        {
          EPackage _ePackage = eSuperPackageAnnotation.getEPackage();
          EClass _eClass = eClassModelGenAnnotation.getEClass();
          EPackage _ePackage_1 = _eClass.getEPackage();
          boolean _notEquals = (!Objects.equal(_ePackage, _ePackage_1));
          if (_notEquals) {
            _builder.append("extends ");
            String _modelClassesPackagePath = eSuperPackageAnnotation.getModelClassesPackagePath();
            _builder.append(_modelClassesPackagePath, "");
            _builder.append(".");
            String _simpleModelFactoryClassName = eSuperPackageAnnotation.getSimpleModelFactoryClassName();
            _builder.append(_simpleModelFactoryClassName, "");
            _builder.append(".");
            String _simpleClassName_1 = eSuperClassAnnotation.getSimpleClassName();
            _builder.append(_simpleClassName_1, "");
            _builder.append("ModelObject<E>");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("extends ");
            String _simpleClassName_2 = eSuperClassAnnotation.getSimpleClassName();
            _builder.append(_simpleClassName_2, "");
            _builder.append("ModelObject<E>");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        _builder.append("extends org.eclipse.emf.texo.model.AbstractModelObject<E>");
        _builder.newLine();
      }
    }
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("*/");
    _builder.newLine();
    {
      boolean _isHasSuperEClass_1 = eClassModelGenAnnotation.isHasSuperEClass();
      if (_isHasSuperEClass_1) {
        _builder.append("    ");
        _builder.append("@Override");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("public org.eclipse.emf.ecore.EClass eClass() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return ");
    String _qualifiedClassName_1 = ePackageAnnotation.getQualifiedClassName();
    _builder.append(_qualifiedClassName_1, "        ");
    _builder.append(".INSTANCE.get");
    String _name_1 = eClassModelGenAnnotation.getName();
    String _firstUpper = TemplateUtil.toFirstUpper(_name_1);
    _builder.append(_firstUpper, "        ");
    _builder.append("EClass();");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("*/");
    _builder.newLine();
    {
      boolean _isHasSuperEClass_2 = eClassModelGenAnnotation.isHasSuperEClass();
      if (_isHasSuperEClass_2) {
        _builder.append("    ");
        _builder.append("@Override");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("public org.eclipse.emf.texo.model.ModelPackage getModelPackage() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return ");
    String _qualifiedClassName_2 = ePackageAnnotation.getQualifiedClassName();
    _builder.append(_qualifiedClassName_2, "        ");
    _builder.append(".INSTANCE;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Class<?> getTargetClass() {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("return ");
    String _qualifiedClassName_3 = eClassModelGenAnnotation.getQualifiedClassName();
    _builder.append(_qualifiedClassName_3, "    \t");
    _builder.append(".class;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Object eGet(org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final int featureID = eClass().getFeatureID(eStructuralFeature);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("switch (featureID) {");
    _builder.newLine();
    {
      EList<EStructuralFeatureModelGenAnnotation> _eAllStructuralFeatureModelGenAnnotations = eClassModelGenAnnotation.getEAllStructuralFeatureModelGenAnnotations();
      for(final EStructuralFeatureModelGenAnnotation featureAnnotation : _eAllStructuralFeatureModelGenAnnotations) {
        {
          boolean _isGenerateCode = featureAnnotation.isGenerateCode();
          if (_isGenerateCode) {
            _builder.append("case ");
            String _qualifiedClassName_4 = ePackageAnnotation.getQualifiedClassName();
            _builder.append(_qualifiedClassName_4, "");
            _builder.append(".");
            String _name_2 = eClassModelGenAnnotation.getName();
            String _upperCase = TemplateUtil.toUpperCase(_name_2);
            _builder.append(_upperCase, "");
            _builder.append("_");
            String _name_3 = featureAnnotation.getName();
            String _upperCase_1 = TemplateUtil.toUpperCase(_name_3);
            _builder.append(_upperCase_1, "");
            _builder.append("_FEATURE_ID:");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("return getTarget().");
            String _getter = featureAnnotation.getGetter();
            _builder.append(_getter, "    ");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("            ");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return super.eGet(eStructuralFeature);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    {
      if ((eClassModelGenAnnotation.getAddSuppressUnchecked() || IterableExtensions.<EStructuralFeatureModelGenAnnotation>exists(eClassModelGenAnnotation.getEStructuralFeatureModelGenAnnotations(), new Function1<EStructuralFeatureModelGenAnnotation, Boolean>() {
        @Override
        public Boolean apply(final EStructuralFeatureModelGenAnnotation e) {
          return Boolean.valueOf((e.getEStructuralFeature().isMany() && e.getEStructuralFeature().isChangeable()));
        }
      }))) {
        _builder.append("    ");
        _builder.append("@SuppressWarnings(\"unchecked\")");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void eSet(org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature, Object value) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final int featureID = eClass().getFeatureID(eStructuralFeature);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("switch (featureID) {");
    _builder.newLine();
    {
      EList<EStructuralFeatureModelGenAnnotation> _eStructuralFeatureModelGenAnnotations = eClassModelGenAnnotation.getEStructuralFeatureModelGenAnnotations();
      for(final EStructuralFeatureModelGenAnnotation featureAnnotation_1 : _eStructuralFeatureModelGenAnnotations) {
        {
          if ((featureAnnotation_1.isGenerateCode() && featureAnnotation_1.getEStructuralFeature().isChangeable())) {
            _builder.append("        ");
            _builder.append("case ");
            String _qualifiedClassName_5 = ePackageAnnotation.getQualifiedClassName();
            _builder.append(_qualifiedClassName_5, "        ");
            _builder.append(".");
            String _name_4 = eClassModelGenAnnotation.getName();
            String _upperCase_2 = TemplateUtil.toUpperCase(_name_4);
            _builder.append(_upperCase_2, "        ");
            _builder.append("_");
            String _name_5 = featureAnnotation_1.getName();
            String _upperCase_3 = TemplateUtil.toUpperCase(_name_5);
            _builder.append(_upperCase_3, "        ");
            _builder.append("_FEATURE_ID:");
            _builder.newLineIfNotEmpty();
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("getTarget().");
            String _setter = featureAnnotation_1.getSetter();
            _builder.append(_setter, "            ");
            _builder.append("(");
            String _objectType = featureAnnotation_1.getObjectType();
            String _cast = TemplateUtil.cast(_objectType);
            _builder.append(_cast, "            ");
            _builder.append("value);");
            _builder.newLineIfNotEmpty();
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("return;");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("            ");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("super.eSet(eStructuralFeature, value);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean eAddTo(org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature, Object value) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final int featureID = eClass().getFeatureID(eStructuralFeature);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("switch (featureID) {");
    _builder.newLine();
    {
      EList<EStructuralFeatureModelGenAnnotation> _eStructuralFeatureModelGenAnnotations_1 = eClassModelGenAnnotation.getEStructuralFeatureModelGenAnnotations();
      for(final EStructuralFeatureModelGenAnnotation featureAnnotation_2 : _eStructuralFeatureModelGenAnnotations_1) {
        _builder.append("        ");
        _builder.newLine();
        {
          if (((featureAnnotation_2.getEStructuralFeature().isChangeable() && featureAnnotation_2.isMany()) && (!featureAnnotation_2.getItemType().contains(",")))) {
            {
              if (((featureAnnotation_2.isReference() && Objects.equal(featureAnnotation_2.getFeatureMapFeature(), null)) && (((EReferenceModelGenAnnotation) featureAnnotation_2).isGenerateBidirectionalAssociationSupport() || ((EReferenceModelGenAnnotation) featureAnnotation_2).isGenerateSafeManyAccess()))) {
                _builder.append("        ");
                _builder.append("case ");
                String _qualifiedClassName_6 = ePackageAnnotation.getQualifiedClassName();
                _builder.append(_qualifiedClassName_6, "        ");
                _builder.append(".");
                String _name_6 = eClassModelGenAnnotation.getName();
                String _upperCase_4 = TemplateUtil.toUpperCase(_name_6);
                _builder.append(_upperCase_4, "        ");
                _builder.append("_");
                String _name_7 = featureAnnotation_2.getName();
                String _upperCase_5 = TemplateUtil.toUpperCase(_name_7);
                _builder.append(_upperCase_5, "        ");
                _builder.append("_FEATURE_ID:");
                _builder.newLineIfNotEmpty();
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("return getTarget().addTo");
                String _validJavaMemberName = featureAnnotation_2.getValidJavaMemberName();
                String _firstUpper_1 = TemplateUtil.toFirstUpper(_validJavaMemberName);
                _builder.append(_firstUpper_1, "            ");
                _builder.append("(");
                String _itemType = featureAnnotation_2.getItemType();
                String _cast_1 = TemplateUtil.cast(_itemType);
                _builder.append(_cast_1, "            ");
                _builder.append("value);");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("        ");
                _builder.append("case ");
                String _qualifiedClassName_7 = ePackageAnnotation.getQualifiedClassName();
                _builder.append(_qualifiedClassName_7, "        ");
                _builder.append(".");
                String _name_8 = eClassModelGenAnnotation.getName();
                String _upperCase_6 = TemplateUtil.toUpperCase(_name_8);
                _builder.append(_upperCase_6, "        ");
                _builder.append("_");
                String _name_9 = featureAnnotation_2.getName();
                String _upperCase_7 = TemplateUtil.toUpperCase(_name_9);
                _builder.append(_upperCase_7, "        ");
                _builder.append("_FEATURE_ID:");
                _builder.newLineIfNotEmpty();
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("return getTarget().");
                String _getter_1 = featureAnnotation_2.getGetter();
                _builder.append(_getter_1, "            ");
                _builder.append("().add(");
                String _itemType_1 = featureAnnotation_2.getItemType();
                String _cast_2 = TemplateUtil.cast(_itemType_1);
                _builder.append(_cast_2, "            ");
                _builder.append("value);");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("            ");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return super.eAddTo(eStructuralFeature, value);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean eRemoveFrom(org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature, Object value) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final int featureID = eClass().getFeatureID(eStructuralFeature);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("switch (featureID) {");
    _builder.newLine();
    {
      EList<EStructuralFeatureModelGenAnnotation> _eStructuralFeatureModelGenAnnotations_2 = eClassModelGenAnnotation.getEStructuralFeatureModelGenAnnotations();
      for(final EStructuralFeatureModelGenAnnotation featureAnnotation_3 : _eStructuralFeatureModelGenAnnotations_2) {
        _builder.append("        ");
        _builder.newLine();
        {
          if (((featureAnnotation_3.getEStructuralFeature().isChangeable() && featureAnnotation_3.isMany()) && (!featureAnnotation_3.getItemType().contains(",")))) {
            {
              if (((featureAnnotation_3.isReference() && Objects.equal(featureAnnotation_3.getFeatureMapFeature(), null)) && (((EReferenceModelGenAnnotation) featureAnnotation_3).isGenerateBidirectionalAssociationSupport() || ((EReferenceModelGenAnnotation) featureAnnotation_3).isGenerateSafeManyAccess()))) {
                _builder.append("        ");
                _builder.append("case ");
                String _qualifiedClassName_8 = ePackageAnnotation.getQualifiedClassName();
                _builder.append(_qualifiedClassName_8, "        ");
                _builder.append(".");
                String _name_10 = eClassModelGenAnnotation.getName();
                String _upperCase_8 = TemplateUtil.toUpperCase(_name_10);
                _builder.append(_upperCase_8, "        ");
                _builder.append("_");
                String _name_11 = featureAnnotation_3.getName();
                String _upperCase_9 = TemplateUtil.toUpperCase(_name_11);
                _builder.append(_upperCase_9, "        ");
                _builder.append("_FEATURE_ID:");
                _builder.newLineIfNotEmpty();
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("return getTarget().removeFrom");
                String _validJavaMemberName_1 = featureAnnotation_3.getValidJavaMemberName();
                String _firstUpper_2 = TemplateUtil.toFirstUpper(_validJavaMemberName_1);
                _builder.append(_firstUpper_2, "            ");
                _builder.append("((");
                String _itemType_2 = featureAnnotation_3.getItemType();
                _builder.append(_itemType_2, "            ");
                _builder.append(")value);");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("        ");
                _builder.append("case ");
                String _qualifiedClassName_9 = ePackageAnnotation.getQualifiedClassName();
                _builder.append(_qualifiedClassName_9, "        ");
                _builder.append(".");
                String _name_12 = eClassModelGenAnnotation.getName();
                String _upperCase_10 = TemplateUtil.toUpperCase(_name_12);
                _builder.append(_upperCase_10, "        ");
                _builder.append("_");
                String _name_13 = featureAnnotation_3.getName();
                String _upperCase_11 = TemplateUtil.toUpperCase(_name_13);
                _builder.append(_upperCase_11, "        ");
                _builder.append("_FEATURE_ID:");
                _builder.newLineIfNotEmpty();
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("return getTarget().");
                String _getter_2 = featureAnnotation_3.getGetter();
                _builder.append(_getter_2, "            ");
                _builder.append("().remove(value);");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("            ");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return super.eRemoveFrom(eStructuralFeature, value);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
