package org.eclipse.emf.texo.modelgenerator.xtend;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.texo.generator.BaseTemplate;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.xtend.TemplateUtil;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EnumTemplate extends BaseTemplate {
  public void generate(final EEnumModelGenAnnotation eEnumModelGenAnnotation) {
    boolean _isGenerateCode = eEnumModelGenAnnotation.isGenerateCode();
    boolean _not = (!_isGenerateCode);
    if (_not) {
      return;
    }
    boolean _executeOverrides = this.executeOverrides(eEnumModelGenAnnotation);
    if (_executeOverrides) {
      return;
    }
    String fileName = TemplateUtil.classFileName(eEnumModelGenAnnotation);
    ModelController _modelController = this.getModelController();
    EDataType _eDataType = eEnumModelGenAnnotation.getEDataType();
    EPackageModelGenAnnotation _ownerEPackageAnnotation = eEnumModelGenAnnotation.getOwnerEPackageAnnotation();
    String content = this.generateContent(_modelController, eEnumModelGenAnnotation, ((EEnum) _eDataType), _ownerEPackageAnnotation);
    this.addFile(fileName, content);
  }
  
  public List<String> getTemplateOverrides() {
    ArrayList<String> _arrayList = new ArrayList<String>();
    List<String> list = _arrayList;
    list.add("org::eclipse::emf::texo::modelgenerator::templates::enum");
    list.add("org::eclipse::emf::texo::modelgenerator::xtend::EnumTemplate");
    return list;
  }
  
  public String generateContent(final ModelController modelController, final EEnumModelGenAnnotation eEnumModelGenAnnotation, final EEnum eEnum, final EPackageModelGenAnnotation ePackageAnnotation) {
    StringConcatenation _builder = new StringConcatenation();
    String _javaFileHeader = ePackageAnnotation.getJavaFileHeader();
    _builder.append(_javaFileHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packagePath = ePackageAnnotation.getPackagePath();
    _builder.append(_packagePath, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* A representation of the literals of the enumeration \'<em><b>");
    String _name = eEnumModelGenAnnotation.getName();
    _builder.append(_name, " ");
    _builder.append("</b></em>\'.");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    {
      String _documentation = eEnumModelGenAnnotation.getDocumentation();
      boolean _notEquals = (!Objects.equal(_documentation, null));
      if (_notEquals) {
        _builder.append("* <!-- begin-model-doc -->");
        _builder.newLine();
        _builder.append("* ");
        String _documentation_1 = eEnumModelGenAnnotation.getDocumentation();
        _builder.append(_documentation_1, "");
        _builder.newLineIfNotEmpty();
        _builder.append("* <!-- end-model-doc -->");
        _builder.newLine();
      }
    }
    _builder.append(" ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    EEnum _eEnum = eEnumModelGenAnnotation.getEEnum();
    String _javaAnnotations = modelController.getJavaAnnotations(_eEnum, "type");
    _builder.append(_javaAnnotations, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public enum ");
    String _simpleClassName = eEnumModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.newLine();
    String _executeXPandTemplate = this.executeXPandTemplate("org::eclipse::emf::texo::modelgenerator::templates::enum_addition", eEnumModelGenAnnotation);
    _builder.append(_executeXPandTemplate, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<EEnumLiteral> _eLiterals = eEnum.getELiterals();
      boolean _hasElements = false;
      for(final EEnumLiteral e : _eLiterals) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        EEnumLiteral el = ((EEnumLiteral) e);
        _builder.newLineIfNotEmpty();
        _builder.append(" \t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" \t ");
        _builder.append("* The enum: ");
        String _name_1 = el.getName();
        String _upperCase = TemplateUtil.toUpperCase(_name_1);
        _builder.append(_upperCase, " 	 ");
        _builder.newLineIfNotEmpty();
        _builder.append("     ");
        _builder.append("* <!-- begin-user-doc -->");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("* <!-- end-user-doc -->");
        _builder.newLine();
        {
          String _documentation_2 = TemplateUtil.getDocumentation(el);
          boolean _notEquals_1 = (!Objects.equal(_documentation_2, null));
          if (_notEquals_1) {
            _builder.append("* <!-- begin-model-doc -->");
            _builder.newLine();
            _builder.append("* ");
            String _documentation_3 = TemplateUtil.getDocumentation(el);
            _builder.append(_documentation_3, "");
            _builder.newLineIfNotEmpty();
            _builder.append("* <!-- end-model-doc -->");
            _builder.newLine();
          }
        }
        _builder.append(" \t ");
        _builder.append("* @generated");
        _builder.newLine();
        _builder.append(" \t ");
        _builder.append("*/");
        _builder.newLine();
        String _javaAnnotations_1 = modelController.getJavaAnnotations(el, "field");
        _builder.append(_javaAnnotations_1, "");
        _builder.newLineIfNotEmpty();
        String _name_2 = el.getName();
        String _format = TemplateUtil.format(_name_2);
        String _upperCase_1 = TemplateUtil.toUpperCase(_format);
        _builder.append(_upperCase_1, "");
        _builder.append("(");
        int _value = el.getValue();
        _builder.append(_value, "");
        _builder.append(", \"");
        String _name_3 = el.getName();
        _builder.append(_name_3, "");
        _builder.append("\", \"");
        String _literal = el.getLiteral();
        _builder.append(_literal, "");
        _builder.append("\") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append(" \t\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* @return always true for this instance");
        _builder.newLine();
        _builder.append(" \t\t ");
        _builder.append("* @generated");
        _builder.newLine();
        _builder.append(" \t\t ");
        _builder.append("*/ ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public boolean is");
        String _name_4 = el.getName();
        String _firstUpper = TemplateUtil.toFirstUpper(_name_4);
        _builder.append(_firstUpper, "	");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("return true;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* An array of all the \'<em><b>");
    String _name_5 = eEnumModelGenAnnotation.getName();
    _builder.append(_name_5, "	 ");
    _builder.append("</b></em>\' enumerators.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final ");
    String _simpleClassName_1 = eEnumModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName_1, "	");
    _builder.append("[] VALUES_ARRAY =");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("new ");
    String _simpleClassName_2 = eEnumModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName_2, "		");
    _builder.append("[] {");
    _builder.newLineIfNotEmpty();
    {
      EList<EEnumLiteral> _eLiterals_1 = eEnum.getELiterals();
      boolean _hasElements_1 = false;
      for(final EEnumLiteral e_1 : _eLiterals_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        EEnumLiteral el_1 = ((EEnumLiteral) e_1);
        String _name_6 = el_1.getName();
        String _format_1 = TemplateUtil.format(_name_6);
        String _upperCase_2 = TemplateUtil.toUpperCase(_format_1);
        _builder.append(_upperCase_2, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* A public read-only list of all the \'<em><b>");
    String _name_7 = eEnumModelGenAnnotation.getName();
    _builder.append(_name_7, "	 ");
    _builder.append("</b></em>\' enumerators.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final java.util.List<");
    String _simpleClassName_3 = eEnumModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName_3, "	");
    _builder.append("> VALUES = java.util.Collections.unmodifiableList(java.util.Arrays.asList(VALUES_ARRAY));");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Returns the \'<em><b>");
    String _name_8 = eEnumModelGenAnnotation.getName();
    _builder.append(_name_8, "	 ");
    _builder.append("</b></em>\' literal with the specified literal value.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static ");
    String _simpleClassName_4 = eEnumModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName_4, "	");
    _builder.append(" get(String literal) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("for (int i = 0; i < VALUES_ARRAY.length; ++i) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _simpleClassName_5 = eEnumModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName_5, "			");
    _builder.append(" result = VALUES_ARRAY[i];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("if (result.toString().equals(literal)) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return result;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Returns the \'<em><b>");
    String _name_9 = eEnumModelGenAnnotation.getName();
    _builder.append(_name_9, "	 ");
    _builder.append("</b></em>\' literal with the specified name.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static ");
    String _simpleClassName_6 = eEnumModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName_6, "	");
    _builder.append(" getByName(String name) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("for (int i = 0; i < VALUES_ARRAY.length; ++i) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _simpleClassName_7 = eEnumModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName_7, "			");
    _builder.append(" result = VALUES_ARRAY[i];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("if (result.getName().equals(name)) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return result;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Returns the \'<em><b>");
    String _name_10 = eEnumModelGenAnnotation.getName();
    _builder.append(_name_10, "	 ");
    _builder.append("</b></em>\' literal with the specified integer value.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static ");
    String _simpleClassName_8 = eEnumModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName_8, "	");
    _builder.append(" get(int value) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("for (");
    String _simpleClassName_9 = eEnumModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName_9, "		");
    _builder.append(" enumInstance : VALUES_ARRAY) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("if (enumInstance.getValue() == value) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return enumInstance;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final int value;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final String name;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final String literal;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Only this class can construct instances.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    String _simpleClassName_10 = eEnumModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName_10, "	");
    _builder.append("(int value, String name, String literal) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.value = value;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.name = name;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.literal = literal;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.newLine();
    {
      EList<EEnumLiteral> _eLiterals_2 = eEnum.getELiterals();
      for(final EEnumLiteral e_2 : _eLiterals_2) {
        EEnumLiteral el_2 = ((EEnumLiteral) e_2);
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* <!-- begin-user-doc -->");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* <!-- end-user-doc -->");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* @return false, is overridden by actual enum types.");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* @generated");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("public boolean is");
        String _name_11 = el_2.getName();
        String _firstUpper_1 = TemplateUtil.toFirstUpper(_name_11);
        _builder.append(_firstUpper_1, "");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return false;");
        _builder.newLine();
        _builder.append("}\t\t\t");
        _builder.newLine();
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public int getValue() {");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("return value;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String getName() {");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("return name;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String getLiteral() {");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("return literal;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @return the literal value of the enumerator, which is its string representation.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String toString() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return literal;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
