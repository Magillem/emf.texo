package org.eclipse.modisco.kdm.code;

import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.modisco.kdm.action.EntryFlow;
import org.eclipse.modisco.kdm.core.CoreModelFactory;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.modisco.kdm.kdm.KdmModelFactory;
import org.eclipse.modisco.kdm.source.SourceRef;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: code. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CodeModelFactory implements ModelFactory {

  /**
   * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClass
   *          creates a Object instance for this EClass
   * @return an object representing the eClass
   * @generated
   */
  public Object create(EClass eClass) {
    switch (eClass.getClassifierID()) {
    case CodeModelPackage.CODEMODEL_CLASSIFIER_ID:
      return createCodeModel();
    case CodeModelPackage.COMMENTUNIT_CLASSIFIER_ID:
      return createCommentUnit();
    case CodeModelPackage.COMPUTATIONALOBJECT_CLASSIFIER_ID:
      return createComputationalObject();
    case CodeModelPackage.DATATYPE_CLASSIFIER_ID:
      return createDatatype();
    case CodeModelPackage.MODULE_CLASSIFIER_ID:
      return createModule();
    case CodeModelPackage.COMPILATIONUNIT_CLASSIFIER_ID:
      return createCompilationUnit();
    case CodeModelPackage.SHAREDUNIT_CLASSIFIER_ID:
      return createSharedUnit();
    case CodeModelPackage.LANGUAGEUNIT_CLASSIFIER_ID:
      return createLanguageUnit();
    case CodeModelPackage.CODEASSEMBLY_CLASSIFIER_ID:
      return createCodeAssembly();
    case CodeModelPackage.PACKAGE_CLASSIFIER_ID:
      return createPackage();
    case CodeModelPackage.CONTROLELEMENT_CLASSIFIER_ID:
      return createControlElement();
    case CodeModelPackage.CALLABLEUNIT_CLASSIFIER_ID:
      return createCallableUnit();
    case CodeModelPackage.METHODUNIT_CLASSIFIER_ID:
      return createMethodUnit();
    case CodeModelPackage.DATAELEMENT_CLASSIFIER_ID:
      return createDataElement();
    case CodeModelPackage.STORABLEUNIT_CLASSIFIER_ID:
      return createStorableUnit();
    case CodeModelPackage.ITEMUNIT_CLASSIFIER_ID:
      return createItemUnit();
    case CodeModelPackage.INDEXUNIT_CLASSIFIER_ID:
      return createIndexUnit();
    case CodeModelPackage.MEMBERUNIT_CLASSIFIER_ID:
      return createMemberUnit();
    case CodeModelPackage.PARAMETERUNIT_CLASSIFIER_ID:
      return createParameterUnit();
    case CodeModelPackage.VALUE_CLASSIFIER_ID:
      return createValue();
    case CodeModelPackage.VALUELIST_CLASSIFIER_ID:
      return createValueList();
    case CodeModelPackage.PRIMITIVETYPE_CLASSIFIER_ID:
      return createPrimitiveType();
    case CodeModelPackage.BOOLEANTYPE_CLASSIFIER_ID:
      return createBooleanType();
    case CodeModelPackage.CHARTYPE_CLASSIFIER_ID:
      return createCharType();
    case CodeModelPackage.ORDINALTYPE_CLASSIFIER_ID:
      return createOrdinalType();
    case CodeModelPackage.DATETYPE_CLASSIFIER_ID:
      return createDateType();
    case CodeModelPackage.TIMETYPE_CLASSIFIER_ID:
      return createTimeType();
    case CodeModelPackage.INTEGERTYPE_CLASSIFIER_ID:
      return createIntegerType();
    case CodeModelPackage.DECIMALTYPE_CLASSIFIER_ID:
      return createDecimalType();
    case CodeModelPackage.SCALEDTYPE_CLASSIFIER_ID:
      return createScaledType();
    case CodeModelPackage.FLOATTYPE_CLASSIFIER_ID:
      return createFloatType();
    case CodeModelPackage.VOIDTYPE_CLASSIFIER_ID:
      return createVoidType();
    case CodeModelPackage.STRINGTYPE_CLASSIFIER_ID:
      return createStringType();
    case CodeModelPackage.BITTYPE_CLASSIFIER_ID:
      return createBitType();
    case CodeModelPackage.BITSTRINGTYPE_CLASSIFIER_ID:
      return createBitstringType();
    case CodeModelPackage.OCTETTYPE_CLASSIFIER_ID:
      return createOctetType();
    case CodeModelPackage.OCTETSTRINGTYPE_CLASSIFIER_ID:
      return createOctetstringType();
    case CodeModelPackage.ENUMERATEDTYPE_CLASSIFIER_ID:
      return createEnumeratedType();
    case CodeModelPackage.COMPOSITETYPE_CLASSIFIER_ID:
      return createCompositeType();
    case CodeModelPackage.CHOICETYPE_CLASSIFIER_ID:
      return createChoiceType();
    case CodeModelPackage.RECORDTYPE_CLASSIFIER_ID:
      return createRecordType();
    case CodeModelPackage.DERIVEDTYPE_CLASSIFIER_ID:
      return createDerivedType();
    case CodeModelPackage.ARRAYTYPE_CLASSIFIER_ID:
      return createArrayType();
    case CodeModelPackage.POINTERTYPE_CLASSIFIER_ID:
      return createPointerType();
    case CodeModelPackage.RANGETYPE_CLASSIFIER_ID:
      return createRangeType();
    case CodeModelPackage.BAGTYPE_CLASSIFIER_ID:
      return createBagType();
    case CodeModelPackage.SETTYPE_CLASSIFIER_ID:
      return createSetType();
    case CodeModelPackage.SEQUENCETYPE_CLASSIFIER_ID:
      return createSequenceType();
    case CodeModelPackage.SIGNATURE_CLASSIFIER_ID:
      return createSignature();
    case CodeModelPackage.TYPEUNIT_CLASSIFIER_ID:
      return createTypeUnit();
    case CodeModelPackage.SYNONYMUNIT_CLASSIFIER_ID:
      return createSynonymUnit();
    case CodeModelPackage.CLASSUNIT_CLASSIFIER_ID:
      return createClassUnit();
    case CodeModelPackage.INTERFACEUNIT_CLASSIFIER_ID:
      return createInterfaceUnit();
    case CodeModelPackage.TEMPLATEUNIT_CLASSIFIER_ID:
      return createTemplateUnit();
    case CodeModelPackage.TEMPLATEPARAMETER_CLASSIFIER_ID:
      return createTemplateParameter();
    case CodeModelPackage.TEMPLATETYPE_CLASSIFIER_ID:
      return createTemplateType();
    case CodeModelPackage.INSTANCEOF_CLASSIFIER_ID:
      return createInstanceOf();
    case CodeModelPackage.PARAMETERTO_CLASSIFIER_ID:
      return createParameterTo();
    case CodeModelPackage.IMPLEMENTS_CLASSIFIER_ID:
      return createImplements();
    case CodeModelPackage.IMPLEMENTATIONOF_CLASSIFIER_ID:
      return createImplementationOf();
    case CodeModelPackage.HASTYPE_CLASSIFIER_ID:
      return createHasType();
    case CodeModelPackage.HASVALUE_CLASSIFIER_ID:
      return createHasValue();
    case CodeModelPackage.EXTENDS_CLASSIFIER_ID:
      return createExtends();
    case CodeModelPackage.PREPROCESSORDIRECTIVE_CLASSIFIER_ID:
      return createPreprocessorDirective();
    case CodeModelPackage.MACROUNIT_CLASSIFIER_ID:
      return createMacroUnit();
    case CodeModelPackage.MACRODIRECTIVE_CLASSIFIER_ID:
      return createMacroDirective();
    case CodeModelPackage.INCLUDEDIRECTIVE_CLASSIFIER_ID:
      return createIncludeDirective();
    case CodeModelPackage.CONDITIONALDIRECTIVE_CLASSIFIER_ID:
      return createConditionalDirective();
    case CodeModelPackage.EXPANDS_CLASSIFIER_ID:
      return createExpands();
    case CodeModelPackage.GENERATEDFROM_CLASSIFIER_ID:
      return createGeneratedFrom();
    case CodeModelPackage.INCLUDES_CLASSIFIER_ID:
      return createIncludes();
    case CodeModelPackage.VARIANTTO_CLASSIFIER_ID:
      return createVariantTo();
    case CodeModelPackage.REDEFINES_CLASSIFIER_ID:
      return createRedefines();
    case CodeModelPackage.NAMESPACE_CLASSIFIER_ID:
      return createNamespace();
    case CodeModelPackage.VISIBLEIN_CLASSIFIER_ID:
      return createVisibleIn();
    case CodeModelPackage.IMPORTS_CLASSIFIER_ID:
      return createImports();
    case CodeModelPackage.CODEELEMENT_CLASSIFIER_ID:
      return createCodeElement();
    case CodeModelPackage.CODERELATIONSHIP_CLASSIFIER_ID:
      return createCodeRelationship();
    default:
      throw new IllegalArgumentException("The EClass '" + eClass.getName()
          + "' is not a valid EClass for this EPackage");
    }
  }

  /**
   * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClass
   *          the EClass of the object
   * @param adaptee
   *          the object being wrapped/adapted
   * @return the wrapper {@link ModelObject}
   * @generated
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public ModelObject createModelObject(EClass eClass, Object adaptee) {
    ModelObject<Object> modelObject = null;
    switch (eClass.getClassifierID()) {
    case CodeModelPackage.CODEMODEL_CLASSIFIER_ID:
      modelObject = new CodeModelModelObject();
      break;
    case CodeModelPackage.ABSTRACTCODEELEMENT_CLASSIFIER_ID:
      modelObject = new AbstractCodeElementModelObject();
      break;
    case CodeModelPackage.COMMENTUNIT_CLASSIFIER_ID:
      modelObject = new CommentUnitModelObject();
      break;
    case CodeModelPackage.ABSTRACTCODERELATIONSHIP_CLASSIFIER_ID:
      modelObject = new AbstractCodeRelationshipModelObject();
      break;
    case CodeModelPackage.CODEITEM_CLASSIFIER_ID:
      modelObject = new CodeItemModelObject();
      break;
    case CodeModelPackage.COMPUTATIONALOBJECT_CLASSIFIER_ID:
      modelObject = new ComputationalObjectModelObject();
      break;
    case CodeModelPackage.DATATYPE_CLASSIFIER_ID:
      modelObject = new DatatypeModelObject();
      break;
    case CodeModelPackage.MODULE_CLASSIFIER_ID:
      modelObject = new ModuleModelObject();
      break;
    case CodeModelPackage.COMPILATIONUNIT_CLASSIFIER_ID:
      modelObject = new CompilationUnitModelObject();
      break;
    case CodeModelPackage.SHAREDUNIT_CLASSIFIER_ID:
      modelObject = new SharedUnitModelObject();
      break;
    case CodeModelPackage.LANGUAGEUNIT_CLASSIFIER_ID:
      modelObject = new LanguageUnitModelObject();
      break;
    case CodeModelPackage.CODEASSEMBLY_CLASSIFIER_ID:
      modelObject = new CodeAssemblyModelObject();
      break;
    case CodeModelPackage.PACKAGE_CLASSIFIER_ID:
      modelObject = new PackageModelObject();
      break;
    case CodeModelPackage.CONTROLELEMENT_CLASSIFIER_ID:
      modelObject = new ControlElementModelObject();
      break;
    case CodeModelPackage.CALLABLEUNIT_CLASSIFIER_ID:
      modelObject = new CallableUnitModelObject();
      break;
    case CodeModelPackage.METHODUNIT_CLASSIFIER_ID:
      modelObject = new MethodUnitModelObject();
      break;
    case CodeModelPackage.DATAELEMENT_CLASSIFIER_ID:
      modelObject = new DataElementModelObject();
      break;
    case CodeModelPackage.STORABLEUNIT_CLASSIFIER_ID:
      modelObject = new StorableUnitModelObject();
      break;
    case CodeModelPackage.ITEMUNIT_CLASSIFIER_ID:
      modelObject = new ItemUnitModelObject();
      break;
    case CodeModelPackage.INDEXUNIT_CLASSIFIER_ID:
      modelObject = new IndexUnitModelObject();
      break;
    case CodeModelPackage.MEMBERUNIT_CLASSIFIER_ID:
      modelObject = new MemberUnitModelObject();
      break;
    case CodeModelPackage.PARAMETERUNIT_CLASSIFIER_ID:
      modelObject = new ParameterUnitModelObject();
      break;
    case CodeModelPackage.VALUEELEMENT_CLASSIFIER_ID:
      modelObject = new ValueElementModelObject();
      break;
    case CodeModelPackage.VALUE_CLASSIFIER_ID:
      modelObject = new ValueModelObject();
      break;
    case CodeModelPackage.VALUELIST_CLASSIFIER_ID:
      modelObject = new ValueListModelObject();
      break;
    case CodeModelPackage.PRIMITIVETYPE_CLASSIFIER_ID:
      modelObject = new PrimitiveTypeModelObject();
      break;
    case CodeModelPackage.BOOLEANTYPE_CLASSIFIER_ID:
      modelObject = new BooleanTypeModelObject();
      break;
    case CodeModelPackage.CHARTYPE_CLASSIFIER_ID:
      modelObject = new CharTypeModelObject();
      break;
    case CodeModelPackage.ORDINALTYPE_CLASSIFIER_ID:
      modelObject = new OrdinalTypeModelObject();
      break;
    case CodeModelPackage.DATETYPE_CLASSIFIER_ID:
      modelObject = new DateTypeModelObject();
      break;
    case CodeModelPackage.TIMETYPE_CLASSIFIER_ID:
      modelObject = new TimeTypeModelObject();
      break;
    case CodeModelPackage.INTEGERTYPE_CLASSIFIER_ID:
      modelObject = new IntegerTypeModelObject();
      break;
    case CodeModelPackage.DECIMALTYPE_CLASSIFIER_ID:
      modelObject = new DecimalTypeModelObject();
      break;
    case CodeModelPackage.SCALEDTYPE_CLASSIFIER_ID:
      modelObject = new ScaledTypeModelObject();
      break;
    case CodeModelPackage.FLOATTYPE_CLASSIFIER_ID:
      modelObject = new FloatTypeModelObject();
      break;
    case CodeModelPackage.VOIDTYPE_CLASSIFIER_ID:
      modelObject = new VoidTypeModelObject();
      break;
    case CodeModelPackage.STRINGTYPE_CLASSIFIER_ID:
      modelObject = new StringTypeModelObject();
      break;
    case CodeModelPackage.BITTYPE_CLASSIFIER_ID:
      modelObject = new BitTypeModelObject();
      break;
    case CodeModelPackage.BITSTRINGTYPE_CLASSIFIER_ID:
      modelObject = new BitstringTypeModelObject();
      break;
    case CodeModelPackage.OCTETTYPE_CLASSIFIER_ID:
      modelObject = new OctetTypeModelObject();
      break;
    case CodeModelPackage.OCTETSTRINGTYPE_CLASSIFIER_ID:
      modelObject = new OctetstringTypeModelObject();
      break;
    case CodeModelPackage.ENUMERATEDTYPE_CLASSIFIER_ID:
      modelObject = new EnumeratedTypeModelObject();
      break;
    case CodeModelPackage.COMPOSITETYPE_CLASSIFIER_ID:
      modelObject = new CompositeTypeModelObject();
      break;
    case CodeModelPackage.CHOICETYPE_CLASSIFIER_ID:
      modelObject = new ChoiceTypeModelObject();
      break;
    case CodeModelPackage.RECORDTYPE_CLASSIFIER_ID:
      modelObject = new RecordTypeModelObject();
      break;
    case CodeModelPackage.DERIVEDTYPE_CLASSIFIER_ID:
      modelObject = new DerivedTypeModelObject();
      break;
    case CodeModelPackage.ARRAYTYPE_CLASSIFIER_ID:
      modelObject = new ArrayTypeModelObject();
      break;
    case CodeModelPackage.POINTERTYPE_CLASSIFIER_ID:
      modelObject = new PointerTypeModelObject();
      break;
    case CodeModelPackage.RANGETYPE_CLASSIFIER_ID:
      modelObject = new RangeTypeModelObject();
      break;
    case CodeModelPackage.BAGTYPE_CLASSIFIER_ID:
      modelObject = new BagTypeModelObject();
      break;
    case CodeModelPackage.SETTYPE_CLASSIFIER_ID:
      modelObject = new SetTypeModelObject();
      break;
    case CodeModelPackage.SEQUENCETYPE_CLASSIFIER_ID:
      modelObject = new SequenceTypeModelObject();
      break;
    case CodeModelPackage.SIGNATURE_CLASSIFIER_ID:
      modelObject = new SignatureModelObject();
      break;
    case CodeModelPackage.DEFINEDTYPE_CLASSIFIER_ID:
      modelObject = new DefinedTypeModelObject();
      break;
    case CodeModelPackage.TYPEUNIT_CLASSIFIER_ID:
      modelObject = new TypeUnitModelObject();
      break;
    case CodeModelPackage.SYNONYMUNIT_CLASSIFIER_ID:
      modelObject = new SynonymUnitModelObject();
      break;
    case CodeModelPackage.CLASSUNIT_CLASSIFIER_ID:
      modelObject = new ClassUnitModelObject();
      break;
    case CodeModelPackage.INTERFACEUNIT_CLASSIFIER_ID:
      modelObject = new InterfaceUnitModelObject();
      break;
    case CodeModelPackage.TEMPLATEUNIT_CLASSIFIER_ID:
      modelObject = new TemplateUnitModelObject();
      break;
    case CodeModelPackage.TEMPLATEPARAMETER_CLASSIFIER_ID:
      modelObject = new TemplateParameterModelObject();
      break;
    case CodeModelPackage.TEMPLATETYPE_CLASSIFIER_ID:
      modelObject = new TemplateTypeModelObject();
      break;
    case CodeModelPackage.INSTANCEOF_CLASSIFIER_ID:
      modelObject = new InstanceOfModelObject();
      break;
    case CodeModelPackage.PARAMETERTO_CLASSIFIER_ID:
      modelObject = new ParameterToModelObject();
      break;
    case CodeModelPackage.IMPLEMENTS_CLASSIFIER_ID:
      modelObject = new ImplementsModelObject();
      break;
    case CodeModelPackage.IMPLEMENTATIONOF_CLASSIFIER_ID:
      modelObject = new ImplementationOfModelObject();
      break;
    case CodeModelPackage.HASTYPE_CLASSIFIER_ID:
      modelObject = new HasTypeModelObject();
      break;
    case CodeModelPackage.HASVALUE_CLASSIFIER_ID:
      modelObject = new HasValueModelObject();
      break;
    case CodeModelPackage.EXTENDS_CLASSIFIER_ID:
      modelObject = new ExtendsModelObject();
      break;
    case CodeModelPackage.PREPROCESSORDIRECTIVE_CLASSIFIER_ID:
      modelObject = new PreprocessorDirectiveModelObject();
      break;
    case CodeModelPackage.MACROUNIT_CLASSIFIER_ID:
      modelObject = new MacroUnitModelObject();
      break;
    case CodeModelPackage.MACRODIRECTIVE_CLASSIFIER_ID:
      modelObject = new MacroDirectiveModelObject();
      break;
    case CodeModelPackage.INCLUDEDIRECTIVE_CLASSIFIER_ID:
      modelObject = new IncludeDirectiveModelObject();
      break;
    case CodeModelPackage.CONDITIONALDIRECTIVE_CLASSIFIER_ID:
      modelObject = new ConditionalDirectiveModelObject();
      break;
    case CodeModelPackage.EXPANDS_CLASSIFIER_ID:
      modelObject = new ExpandsModelObject();
      break;
    case CodeModelPackage.GENERATEDFROM_CLASSIFIER_ID:
      modelObject = new GeneratedFromModelObject();
      break;
    case CodeModelPackage.INCLUDES_CLASSIFIER_ID:
      modelObject = new IncludesModelObject();
      break;
    case CodeModelPackage.VARIANTTO_CLASSIFIER_ID:
      modelObject = new VariantToModelObject();
      break;
    case CodeModelPackage.REDEFINES_CLASSIFIER_ID:
      modelObject = new RedefinesModelObject();
      break;
    case CodeModelPackage.NAMESPACE_CLASSIFIER_ID:
      modelObject = new NamespaceModelObject();
      break;
    case CodeModelPackage.VISIBLEIN_CLASSIFIER_ID:
      modelObject = new VisibleInModelObject();
      break;
    case CodeModelPackage.IMPORTS_CLASSIFIER_ID:
      modelObject = new ImportsModelObject();
      break;
    case CodeModelPackage.CODEELEMENT_CLASSIFIER_ID:
      modelObject = new CodeElementModelObject();
      break;
    case CodeModelPackage.CODERELATIONSHIP_CLASSIFIER_ID:
      modelObject = new CodeRelationshipModelObject();
      break;
    default:
      throw new IllegalArgumentException("The EClass '" + eClass + "' is not defined in this EPackage");
    }
    modelObject.setTarget(adaptee);
    return modelObject;
  }

  /**
   * Creates a feature map entry instance for a certain EStructuralFeature.
   * 
   * @param eFeature
   *          the feature map feature
   * @return the pojo feature map entry
   * @generated
   */
  public Object createFeatureMapEntry(EStructuralFeature eFeature) {
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}. If the feature map entry is null then a
   * new one is created and <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eFeature
   *          the feature map feature of the object
   * @param adaptee
   *          the pojo feature map entry being wrapped/adapted
   * @return the wrapper {@link ModelFeatureMapEntry}
   * @generated
   */
  public ModelFeatureMapEntry<?> createModelFeatureMapEntry(EStructuralFeature eFeature, Object adaptee) {
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CodeModel
   * @generated
   */
  public CodeModel createCodeModel() {
    return new CodeModel();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CommentUnit
   * @generated
   */
  public CommentUnit createCommentUnit() {
    return new CommentUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ComputationalObject
   * @generated
   */
  public ComputationalObject createComputationalObject() {
    return new ComputationalObject();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Datatype
   * @generated
   */
  public Datatype createDatatype() {
    return new Datatype();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Module
   * @generated
   */
  public Module createModule() {
    return new Module();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CompilationUnit
   * @generated
   */
  public CompilationUnit createCompilationUnit() {
    return new CompilationUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SharedUnit
   * @generated
   */
  public SharedUnit createSharedUnit() {
    return new SharedUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass LanguageUnit
   * @generated
   */
  public LanguageUnit createLanguageUnit() {
    return new LanguageUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CodeAssembly
   * @generated
   */
  public CodeAssembly createCodeAssembly() {
    return new CodeAssembly();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Package
   * @generated
   */
  public Package createPackage() {
    return new Package();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ControlElement
   * @generated
   */
  public ControlElement createControlElement() {
    return new ControlElement();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CallableUnit
   * @generated
   */
  public CallableUnit createCallableUnit() {
    return new CallableUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass MethodUnit
   * @generated
   */
  public MethodUnit createMethodUnit() {
    return new MethodUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DataElement
   * @generated
   */
  public DataElement createDataElement() {
    return new DataElement();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass StorableUnit
   * @generated
   */
  public StorableUnit createStorableUnit() {
    return new StorableUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ItemUnit
   * @generated
   */
  public ItemUnit createItemUnit() {
    return new ItemUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass IndexUnit
   * @generated
   */
  public IndexUnit createIndexUnit() {
    return new IndexUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass MemberUnit
   * @generated
   */
  public MemberUnit createMemberUnit() {
    return new MemberUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ParameterUnit
   * @generated
   */
  public ParameterUnit createParameterUnit() {
    return new ParameterUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Value
   * @generated
   */
  public Value createValue() {
    return new Value();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ValueList
   * @generated
   */
  public ValueList createValueList() {
    return new ValueList();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PrimitiveType
   * @generated
   */
  public PrimitiveType createPrimitiveType() {
    return new PrimitiveType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BooleanType
   * @generated
   */
  public BooleanType createBooleanType() {
    return new BooleanType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CharType
   * @generated
   */
  public CharType createCharType() {
    return new CharType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass OrdinalType
   * @generated
   */
  public OrdinalType createOrdinalType() {
    return new OrdinalType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DateType
   * @generated
   */
  public DateType createDateType() {
    return new DateType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TimeType
   * @generated
   */
  public TimeType createTimeType() {
    return new TimeType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass IntegerType
   * @generated
   */
  public IntegerType createIntegerType() {
    return new IntegerType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DecimalType
   * @generated
   */
  public DecimalType createDecimalType() {
    return new DecimalType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ScaledType
   * @generated
   */
  public ScaledType createScaledType() {
    return new ScaledType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass FloatType
   * @generated
   */
  public FloatType createFloatType() {
    return new FloatType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass VoidType
   * @generated
   */
  public VoidType createVoidType() {
    return new VoidType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass StringType
   * @generated
   */
  public StringType createStringType() {
    return new StringType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BitType
   * @generated
   */
  public BitType createBitType() {
    return new BitType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BitstringType
   * @generated
   */
  public BitstringType createBitstringType() {
    return new BitstringType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass OctetType
   * @generated
   */
  public OctetType createOctetType() {
    return new OctetType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass OctetstringType
   * @generated
   */
  public OctetstringType createOctetstringType() {
    return new OctetstringType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass EnumeratedType
   * @generated
   */
  public EnumeratedType createEnumeratedType() {
    return new EnumeratedType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CompositeType
   * @generated
   */
  public CompositeType createCompositeType() {
    return new CompositeType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ChoiceType
   * @generated
   */
  public ChoiceType createChoiceType() {
    return new ChoiceType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RecordType
   * @generated
   */
  public RecordType createRecordType() {
    return new RecordType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DerivedType
   * @generated
   */
  public DerivedType createDerivedType() {
    return new DerivedType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ArrayType
   * @generated
   */
  public ArrayType createArrayType() {
    return new ArrayType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PointerType
   * @generated
   */
  public PointerType createPointerType() {
    return new PointerType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RangeType
   * @generated
   */
  public RangeType createRangeType() {
    return new RangeType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BagType
   * @generated
   */
  public BagType createBagType() {
    return new BagType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SetType
   * @generated
   */
  public SetType createSetType() {
    return new SetType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SequenceType
   * @generated
   */
  public SequenceType createSequenceType() {
    return new SequenceType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Signature
   * @generated
   */
  public Signature createSignature() {
    return new Signature();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TypeUnit
   * @generated
   */
  public TypeUnit createTypeUnit() {
    return new TypeUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SynonymUnit
   * @generated
   */
  public SynonymUnit createSynonymUnit() {
    return new SynonymUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ClassUnit
   * @generated
   */
  public ClassUnit createClassUnit() {
    return new ClassUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass InterfaceUnit
   * @generated
   */
  public InterfaceUnit createInterfaceUnit() {
    return new InterfaceUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TemplateUnit
   * @generated
   */
  public TemplateUnit createTemplateUnit() {
    return new TemplateUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TemplateParameter
   * @generated
   */
  public TemplateParameter createTemplateParameter() {
    return new TemplateParameter();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TemplateType
   * @generated
   */
  public TemplateType createTemplateType() {
    return new TemplateType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass InstanceOf
   * @generated
   */
  public InstanceOf createInstanceOf() {
    return new InstanceOf();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ParameterTo
   * @generated
   */
  public ParameterTo createParameterTo() {
    return new ParameterTo();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Implements
   * @generated
   */
  public Implements createImplements() {
    return new Implements();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ImplementationOf
   * @generated
   */
  public ImplementationOf createImplementationOf() {
    return new ImplementationOf();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass HasType
   * @generated
   */
  public HasType createHasType() {
    return new HasType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass HasValue
   * @generated
   */
  public HasValue createHasValue() {
    return new HasValue();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Extends
   * @generated
   */
  public Extends createExtends() {
    return new Extends();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PreprocessorDirective
   * @generated
   */
  public PreprocessorDirective createPreprocessorDirective() {
    return new PreprocessorDirective();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass MacroUnit
   * @generated
   */
  public MacroUnit createMacroUnit() {
    return new MacroUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass MacroDirective
   * @generated
   */
  public MacroDirective createMacroDirective() {
    return new MacroDirective();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass IncludeDirective
   * @generated
   */
  public IncludeDirective createIncludeDirective() {
    return new IncludeDirective();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ConditionalDirective
   * @generated
   */
  public ConditionalDirective createConditionalDirective() {
    return new ConditionalDirective();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Expands
   * @generated
   */
  public Expands createExpands() {
    return new Expands();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass GeneratedFrom
   * @generated
   */
  public GeneratedFrom createGeneratedFrom() {
    return new GeneratedFrom();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Includes
   * @generated
   */
  public Includes createIncludes() {
    return new Includes();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass VariantTo
   * @generated
   */
  public VariantTo createVariantTo() {
    return new VariantTo();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Redefines
   * @generated
   */
  public Redefines createRedefines() {
    return new Redefines();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Namespace
   * @generated
   */
  public Namespace createNamespace() {
    return new Namespace();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass VisibleIn
   * @generated
   */
  public VisibleIn createVisibleIn() {
    return new VisibleIn();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Imports
   * @generated
   */
  public Imports createImports() {
    return new Imports();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CodeElement
   * @generated
   */
  public CodeElement createCodeElement() {
    return new CodeElement();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CodeRelationship
   * @generated
   */
  public CodeRelationship createCodeRelationship() {
    return new CodeRelationship();
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if the value is null then null is returned.
   * @generated
   */
  public Object createFromString(EDataType eDataType, String value) {
    switch (eDataType.getClassifierID()) {
    case CodeModelPackage.CALLABLEKIND_CLASSIFIER_ID:
      return createCallableKindFromString(value);
    case CodeModelPackage.METHODKIND_CLASSIFIER_ID:
      return createMethodKindFromString(value);
    case CodeModelPackage.EXPORTKIND_CLASSIFIER_ID:
      return createExportKindFromString(value);
    case CodeModelPackage.STORABLEKIND_CLASSIFIER_ID:
      return createStorableKindFromString(value);
    case CodeModelPackage.PARAMETERKIND_CLASSIFIER_ID:
      return createParameterKindFromString(value);
    case CodeModelPackage.MACROKIND_CLASSIFIER_ID:
      return createMacroKindFromString(value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage");
    }
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if value == null then null is returned
   * @generated
   */
  public String convertToString(EDataType eDataType, Object value) {
    switch (eDataType.getClassifierID()) {
    case CodeModelPackage.CALLABLEKIND_CLASSIFIER_ID:
      return convertCallableKindToString((CallableKind) value);
    case CodeModelPackage.METHODKIND_CLASSIFIER_ID:
      return convertMethodKindToString((MethodKind) value);
    case CodeModelPackage.EXPORTKIND_CLASSIFIER_ID:
      return convertExportKindToString((ExportKind) value);
    case CodeModelPackage.STORABLEKIND_CLASSIFIER_ID:
      return convertStorableKindToString((StorableKind) value);
    case CodeModelPackage.PARAMETERKIND_CLASSIFIER_ID:
      return convertParameterKindToString((ParameterKind) value);
    case CodeModelPackage.MACROKIND_CLASSIFIER_ID:
      return convertMacroKindToString((MacroKind) value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * Converts the EDataType: CallableKind to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertCallableKindToString(CallableKind value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: CallableKind from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public CallableKind createCallableKindFromString(String value) {
    if (value == null) {
      return null;
    }
    return CallableKind.get(value);
  }

  /**
   * Converts the EDataType: MethodKind to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertMethodKindToString(MethodKind value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: MethodKind from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public MethodKind createMethodKindFromString(String value) {
    if (value == null) {
      return null;
    }
    return MethodKind.get(value);
  }

  /**
   * Converts the EDataType: ExportKind to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertExportKindToString(ExportKind value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: ExportKind from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public ExportKind createExportKindFromString(String value) {
    if (value == null) {
      return null;
    }
    return ExportKind.get(value);
  }

  /**
   * Converts the EDataType: StorableKind to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertStorableKindToString(StorableKind value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: StorableKind from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public StorableKind createStorableKindFromString(String value) {
    if (value == null) {
      return null;
    }
    return StorableKind.get(value);
  }

  /**
   * Converts the EDataType: ParameterKind to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertParameterKindToString(ParameterKind value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: ParameterKind from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public ParameterKind createParameterKindFromString(String value) {
    if (value == null) {
      return null;
    }
    return ParameterKind.get(value);
  }

  /**
   * Converts the EDataType: MacroKind to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertMacroKindToString(MacroKind value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: MacroKind from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public MacroKind createMacroKindFromString(String value) {
    if (value == null) {
      return null;
    }
    return MacroKind.get(value);
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CodeModel</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CodeModelModelObject<E extends CodeModel> extends KdmModelFactory.KDMModelModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCodeModelEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CODEMODEL_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CODEMODEL_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((List<AbstractCodeElement>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.CODEMODEL_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((AbstractCodeElement) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.CODEMODEL_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((AbstractCodeElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractCodeElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractCodeElementModelObject<E extends AbstractCodeElement> extends
      CoreModelFactory.KDMEntityModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getAbstractCodeElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.ABSTRACTCODEELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.ABSTRACTCODEELEMENT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.ABSTRACTCODEELEMENT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.ABSTRACTCODEELEMENT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.ABSTRACTCODEELEMENT_SOURCE_FEATURE_ID:
        getTarget().setSource((Set<SourceRef>) value);
        return;
      case CodeModelPackage.ABSTRACTCODEELEMENT_COMMENT_FEATURE_ID:
        getTarget().setComment((Set<CommentUnit>) value);
        return;
      case CodeModelPackage.ABSTRACTCODEELEMENT_CODERELATION_FEATURE_ID:
        getTarget().setCodeRelation((Set<AbstractCodeRelationship>) value);
        return;
      case CodeModelPackage.ABSTRACTCODEELEMENT_ENTRYFLOW_FEATURE_ID:
        getTarget().setEntryFlow((List<EntryFlow>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.ABSTRACTCODEELEMENT_SOURCE_FEATURE_ID:
        return getTarget().addToSource((SourceRef) value);

      case CodeModelPackage.ABSTRACTCODEELEMENT_COMMENT_FEATURE_ID:
        return getTarget().addToComment((CommentUnit) value);

      case CodeModelPackage.ABSTRACTCODEELEMENT_CODERELATION_FEATURE_ID:
        return getTarget().addToCodeRelation((AbstractCodeRelationship) value);

      case CodeModelPackage.ABSTRACTCODEELEMENT_ENTRYFLOW_FEATURE_ID:
        return getTarget().addToEntryFlow((EntryFlow) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.ABSTRACTCODEELEMENT_SOURCE_FEATURE_ID:
        return getTarget().removeFromSource((SourceRef) value);

      case CodeModelPackage.ABSTRACTCODEELEMENT_COMMENT_FEATURE_ID:
        return getTarget().removeFromComment((CommentUnit) value);

      case CodeModelPackage.ABSTRACTCODEELEMENT_CODERELATION_FEATURE_ID:
        return getTarget().removeFromCodeRelation((AbstractCodeRelationship) value);

      case CodeModelPackage.ABSTRACTCODEELEMENT_ENTRYFLOW_FEATURE_ID:
        return getTarget().removeFromEntryFlow((EntryFlow) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CommentUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CommentUnitModelObject<E extends CommentUnit> extends CoreModelFactory.ModelElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCommentUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.COMMENTUNIT_TEXT_FEATURE_ID:
        return getTarget().getText();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.COMMENTUNIT_TEXT_FEATURE_ID:
        getTarget().setText((String) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractCodeRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractCodeRelationshipModelObject<E extends AbstractCodeRelationship> extends
      CoreModelFactory.KDMRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getAbstractCodeRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CodeItem</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CodeItemModelObject<E extends CodeItem> extends AbstractCodeElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCodeItemEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ComputationalObject</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ComputationalObjectModelObject<E extends ComputationalObject> extends CodeItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getComputationalObjectEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Datatype</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DatatypeModelObject<E extends Datatype> extends CodeItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getDatatypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Module</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ModuleModelObject<E extends Module> extends CodeItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getModuleEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.MODULE_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.MODULE_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((List<AbstractCodeElement>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.MODULE_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((AbstractCodeElement) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.MODULE_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((AbstractCodeElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CompilationUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CompilationUnitModelObject<E extends CompilationUnit> extends ModuleModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCompilationUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>SharedUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SharedUnitModelObject<E extends SharedUnit> extends CompilationUnitModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getSharedUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>LanguageUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class LanguageUnitModelObject<E extends LanguageUnit> extends ModuleModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getLanguageUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CodeAssembly</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CodeAssemblyModelObject<E extends CodeAssembly> extends ModuleModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCodeAssemblyEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Package</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PackageModelObject<E extends Package> extends ModuleModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getPackageEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ControlElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ControlElementModelObject<E extends ControlElement> extends ComputationalObjectModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getControlElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CONTROLELEMENT_TYPE_FEATURE_ID:
        return getTarget().getType();
      case CodeModelPackage.CONTROLELEMENT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CONTROLELEMENT_TYPE_FEATURE_ID:
        getTarget().setType((Datatype) value);
        return;
      case CodeModelPackage.CONTROLELEMENT_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((List<AbstractCodeElement>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.CONTROLELEMENT_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((AbstractCodeElement) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.CONTROLELEMENT_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((AbstractCodeElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CallableUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CallableUnitModelObject<E extends CallableUnit> extends ControlElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCallableUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CALLABLEUNIT_KIND_FEATURE_ID:
        return getTarget().getKind();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CALLABLEUNIT_KIND_FEATURE_ID:
        getTarget().setKind((CallableKind) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>MethodUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class MethodUnitModelObject<E extends MethodUnit> extends ControlElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getMethodUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.METHODUNIT_KIND_FEATURE_ID:
        return getTarget().getKind();
      case CodeModelPackage.METHODUNIT_EXPORT_FEATURE_ID:
        return getTarget().getExport();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.METHODUNIT_KIND_FEATURE_ID:
        getTarget().setKind((MethodKind) value);
        return;
      case CodeModelPackage.METHODUNIT_EXPORT_FEATURE_ID:
        getTarget().setExport((ExportKind) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>DataElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DataElementModelObject<E extends DataElement> extends ComputationalObjectModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getDataElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.DATAELEMENT_TYPE_FEATURE_ID:
        return getTarget().getType();
      case CodeModelPackage.DATAELEMENT_EXT_FEATURE_ID:
        return getTarget().getExt();
      case CodeModelPackage.DATAELEMENT_SIZE_FEATURE_ID:
        return getTarget().getSize();
      case CodeModelPackage.DATAELEMENT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.DATAELEMENT_TYPE_FEATURE_ID:
        getTarget().setType((Datatype) value);
        return;
      case CodeModelPackage.DATAELEMENT_EXT_FEATURE_ID:
        getTarget().setExt((String) value);
        return;
      case CodeModelPackage.DATAELEMENT_SIZE_FEATURE_ID:
        getTarget().setSize((Integer) value);
        return;
      case CodeModelPackage.DATAELEMENT_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((Set<Datatype>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.DATAELEMENT_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((Datatype) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.DATAELEMENT_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((Datatype) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>StorableUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class StorableUnitModelObject<E extends StorableUnit> extends DataElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getStorableUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.STORABLEUNIT_KIND_FEATURE_ID:
        return getTarget().getKind();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.STORABLEUNIT_KIND_FEATURE_ID:
        getTarget().setKind((StorableKind) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ItemUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ItemUnitModelObject<E extends ItemUnit> extends DataElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getItemUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>IndexUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class IndexUnitModelObject<E extends IndexUnit> extends DataElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getIndexUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>MemberUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class MemberUnitModelObject<E extends MemberUnit> extends DataElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getMemberUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.MEMBERUNIT_EXPORT_FEATURE_ID:
        return getTarget().getExport();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.MEMBERUNIT_EXPORT_FEATURE_ID:
        getTarget().setExport((ExportKind) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ParameterUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ParameterUnitModelObject<E extends ParameterUnit> extends DataElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getParameterUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.PARAMETERUNIT_KIND_FEATURE_ID:
        return getTarget().getKind();
      case CodeModelPackage.PARAMETERUNIT_POS_FEATURE_ID:
        return getTarget().getPos();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.PARAMETERUNIT_KIND_FEATURE_ID:
        getTarget().setKind((ParameterKind) value);
        return;
      case CodeModelPackage.PARAMETERUNIT_POS_FEATURE_ID:
        getTarget().setPos((Integer) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ValueElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ValueElementModelObject<E extends ValueElement> extends DataElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getValueElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Value</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ValueModelObject<E extends Value> extends ValueElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getValueEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ValueList</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ValueListModelObject<E extends ValueList> extends ValueElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getValueListEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.VALUELIST_VALUEELEMENT_FEATURE_ID:
        return getTarget().getValueElement();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.VALUELIST_VALUEELEMENT_FEATURE_ID:
        getTarget().setValueElement((List<ValueElement>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.VALUELIST_VALUEELEMENT_FEATURE_ID:
        return getTarget().addToValueElement((ValueElement) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.VALUELIST_VALUEELEMENT_FEATURE_ID:
        return getTarget().removeFromValueElement((ValueElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>PrimitiveType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PrimitiveTypeModelObject<E extends PrimitiveType> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getPrimitiveTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>BooleanType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BooleanTypeModelObject<E extends BooleanType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getBooleanTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CharType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CharTypeModelObject<E extends CharType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCharTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>OrdinalType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class OrdinalTypeModelObject<E extends OrdinalType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getOrdinalTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>DateType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DateTypeModelObject<E extends DateType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getDateTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>TimeType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TimeTypeModelObject<E extends TimeType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getTimeTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>IntegerType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class IntegerTypeModelObject<E extends IntegerType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getIntegerTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>DecimalType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DecimalTypeModelObject<E extends DecimalType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getDecimalTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ScaledType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ScaledTypeModelObject<E extends ScaledType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getScaledTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>FloatType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class FloatTypeModelObject<E extends FloatType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getFloatTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>VoidType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class VoidTypeModelObject<E extends VoidType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getVoidTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>StringType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class StringTypeModelObject<E extends StringType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getStringTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>BitType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BitTypeModelObject<E extends BitType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getBitTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>BitstringType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BitstringTypeModelObject<E extends BitstringType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getBitstringTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>OctetType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class OctetTypeModelObject<E extends OctetType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getOctetTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>OctetstringType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class OctetstringTypeModelObject<E extends OctetstringType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getOctetstringTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>EnumeratedType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class EnumeratedTypeModelObject<E extends EnumeratedType> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getEnumeratedTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.ENUMERATEDTYPE_VALUE_FEATURE_ID:
        return getTarget().getValue();
      case CodeModelPackage.ENUMERATEDTYPE_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.ENUMERATEDTYPE_VALUE_FEATURE_ID:
        getTarget().setValue((List<Value>) value);
        return;
      case CodeModelPackage.ENUMERATEDTYPE_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((List<CodeItem>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.ENUMERATEDTYPE_VALUE_FEATURE_ID:
        return getTarget().addToValue((Value) value);

      case CodeModelPackage.ENUMERATEDTYPE_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((CodeItem) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.ENUMERATEDTYPE_VALUE_FEATURE_ID:
        return getTarget().removeFromValue((Value) value);

      case CodeModelPackage.ENUMERATEDTYPE_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((CodeItem) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CompositeType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CompositeTypeModelObject<E extends CompositeType> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCompositeTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.COMPOSITETYPE_ITEMUNIT_FEATURE_ID:
        return getTarget().getItemUnit();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.COMPOSITETYPE_ITEMUNIT_FEATURE_ID:
        getTarget().setItemUnit((List<ItemUnit>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.COMPOSITETYPE_ITEMUNIT_FEATURE_ID:
        return getTarget().addToItemUnit((ItemUnit) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.COMPOSITETYPE_ITEMUNIT_FEATURE_ID:
        return getTarget().removeFromItemUnit((ItemUnit) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ChoiceType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ChoiceTypeModelObject<E extends ChoiceType> extends CompositeTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getChoiceTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>RecordType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RecordTypeModelObject<E extends RecordType> extends CompositeTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getRecordTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>DerivedType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DerivedTypeModelObject<E extends DerivedType> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getDerivedTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.DERIVEDTYPE_ITEMUNIT_FEATURE_ID:
        return getTarget().getItemUnit();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.DERIVEDTYPE_ITEMUNIT_FEATURE_ID:
        getTarget().setItemUnit((ItemUnit) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ArrayType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ArrayTypeModelObject<E extends ArrayType> extends DerivedTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getArrayTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.ARRAYTYPE_SIZE_FEATURE_ID:
        return getTarget().getSize();
      case CodeModelPackage.ARRAYTYPE_INDEXUNIT_FEATURE_ID:
        return getTarget().getIndexUnit();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.ARRAYTYPE_SIZE_FEATURE_ID:
        getTarget().setSize((Integer) value);
        return;
      case CodeModelPackage.ARRAYTYPE_INDEXUNIT_FEATURE_ID:
        getTarget().setIndexUnit((IndexUnit) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>PointerType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PointerTypeModelObject<E extends PointerType> extends DerivedTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getPointerTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>RangeType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RangeTypeModelObject<E extends RangeType> extends DerivedTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getRangeTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.RANGETYPE_LOWER_FEATURE_ID:
        return getTarget().getLower();
      case CodeModelPackage.RANGETYPE_UPPER_FEATURE_ID:
        return getTarget().getUpper();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.RANGETYPE_LOWER_FEATURE_ID:
        getTarget().setLower((Integer) value);
        return;
      case CodeModelPackage.RANGETYPE_UPPER_FEATURE_ID:
        getTarget().setUpper((Integer) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>BagType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BagTypeModelObject<E extends BagType> extends DerivedTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getBagTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.BAGTYPE_SIZE_FEATURE_ID:
        return getTarget().getSize();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.BAGTYPE_SIZE_FEATURE_ID:
        getTarget().setSize((Integer) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>SetType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SetTypeModelObject<E extends SetType> extends DerivedTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getSetTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.SETTYPE_SIZE_FEATURE_ID:
        return getTarget().getSize();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.SETTYPE_SIZE_FEATURE_ID:
        getTarget().setSize((Integer) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>SequenceType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SequenceTypeModelObject<E extends SequenceType> extends DerivedTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getSequenceTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.SEQUENCETYPE_SIZE_FEATURE_ID:
        return getTarget().getSize();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.SEQUENCETYPE_SIZE_FEATURE_ID:
        getTarget().setSize((Integer) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Signature</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SignatureModelObject<E extends Signature> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getSignatureEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.SIGNATURE_PARAMETERUNIT_FEATURE_ID:
        return getTarget().getParameterUnit();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.SIGNATURE_PARAMETERUNIT_FEATURE_ID:
        getTarget().setParameterUnit((List<ParameterUnit>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.SIGNATURE_PARAMETERUNIT_FEATURE_ID:
        return getTarget().addToParameterUnit((ParameterUnit) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.SIGNATURE_PARAMETERUNIT_FEATURE_ID:
        return getTarget().removeFromParameterUnit((ParameterUnit) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>DefinedType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DefinedTypeModelObject<E extends DefinedType> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getDefinedTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.DEFINEDTYPE_TYPE_FEATURE_ID:
        return getTarget().getType();
      case CodeModelPackage.DEFINEDTYPE_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.DEFINEDTYPE_TYPE_FEATURE_ID:
        getTarget().setType((Datatype) value);
        return;
      case CodeModelPackage.DEFINEDTYPE_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((Datatype) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>TypeUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TypeUnitModelObject<E extends TypeUnit> extends DefinedTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getTypeUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>SynonymUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SynonymUnitModelObject<E extends SynonymUnit> extends DefinedTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getSynonymUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ClassUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ClassUnitModelObject<E extends ClassUnit> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getClassUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CLASSUNIT_ISABSTRACT_FEATURE_ID:
        return getTarget().getIsAbstract();
      case CodeModelPackage.CLASSUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CLASSUNIT_ISABSTRACT_FEATURE_ID:
        getTarget().setIsAbstract((Boolean) value);
        return;
      case CodeModelPackage.CLASSUNIT_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((List<CodeItem>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.CLASSUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((CodeItem) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.CLASSUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((CodeItem) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>InterfaceUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class InterfaceUnitModelObject<E extends InterfaceUnit> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getInterfaceUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.INTERFACEUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.INTERFACEUNIT_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((List<CodeItem>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.INTERFACEUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((CodeItem) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.INTERFACEUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((CodeItem) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>TemplateUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TemplateUnitModelObject<E extends TemplateUnit> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getTemplateUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.TEMPLATEUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.TEMPLATEUNIT_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((List<CodeItem>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.TEMPLATEUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((CodeItem) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.TEMPLATEUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((CodeItem) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>TemplateParameter</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TemplateParameterModelObject<E extends TemplateParameter> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getTemplateParameterEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>TemplateType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TemplateTypeModelObject<E extends TemplateType> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getTemplateTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>InstanceOf</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class InstanceOfModelObject<E extends InstanceOf> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getInstanceOfEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.INSTANCEOF_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.INSTANCEOF_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.INSTANCEOF_TO_FEATURE_ID:
        getTarget().setTo((TemplateUnit) value);
        return;
      case CodeModelPackage.INSTANCEOF_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractCodeElement) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ParameterTo</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ParameterToModelObject<E extends ParameterTo> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getParameterToEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.PARAMETERTO_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.PARAMETERTO_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.PARAMETERTO_TO_FEATURE_ID:
        getTarget().setTo((CodeItem) value);
        return;
      case CodeModelPackage.PARAMETERTO_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractCodeElement) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Implements</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ImplementsModelObject<E extends Implements> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getImplementsEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.IMPLEMENTS_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.IMPLEMENTS_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.IMPLEMENTS_TO_FEATURE_ID:
        getTarget().setTo((CodeItem) value);
        return;
      case CodeModelPackage.IMPLEMENTS_FROM_FEATURE_ID:
        getTarget().setFrom((CodeItem) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ImplementationOf</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ImplementationOfModelObject<E extends ImplementationOf> extends
      AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getImplementationOfEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.IMPLEMENTATIONOF_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.IMPLEMENTATIONOF_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.IMPLEMENTATIONOF_TO_FEATURE_ID:
        getTarget().setTo((CodeItem) value);
        return;
      case CodeModelPackage.IMPLEMENTATIONOF_FROM_FEATURE_ID:
        getTarget().setFrom((CodeItem) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>HasType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class HasTypeModelObject<E extends HasType> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getHasTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.HASTYPE_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.HASTYPE_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.HASTYPE_TO_FEATURE_ID:
        getTarget().setTo((Datatype) value);
        return;
      case CodeModelPackage.HASTYPE_FROM_FEATURE_ID:
        getTarget().setFrom((CodeItem) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>HasValue</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class HasValueModelObject<E extends HasValue> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getHasValueEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.HASVALUE_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.HASVALUE_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.HASVALUE_TO_FEATURE_ID:
        getTarget().setTo((AbstractCodeElement) value);
        return;
      case CodeModelPackage.HASVALUE_FROM_FEATURE_ID:
        getTarget().setFrom((CodeItem) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Extends</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ExtendsModelObject<E extends Extends> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getExtendsEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.EXTENDS_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.EXTENDS_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.EXTENDS_TO_FEATURE_ID:
        getTarget().setTo((Datatype) value);
        return;
      case CodeModelPackage.EXTENDS_FROM_FEATURE_ID:
        getTarget().setFrom((Datatype) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>PreprocessorDirective</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PreprocessorDirectiveModelObject<E extends PreprocessorDirective> extends
      AbstractCodeElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getPreprocessorDirectiveEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.PREPROCESSORDIRECTIVE_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.PREPROCESSORDIRECTIVE_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((Set<AbstractCodeElement>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.PREPROCESSORDIRECTIVE_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((AbstractCodeElement) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.PREPROCESSORDIRECTIVE_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((AbstractCodeElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>MacroUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class MacroUnitModelObject<E extends MacroUnit> extends PreprocessorDirectiveModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getMacroUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.MACROUNIT_KIND_FEATURE_ID:
        return getTarget().getKind();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.MACROUNIT_KIND_FEATURE_ID:
        getTarget().setKind((MacroKind) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>MacroDirective</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class MacroDirectiveModelObject<E extends MacroDirective> extends PreprocessorDirectiveModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getMacroDirectiveEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>IncludeDirective</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class IncludeDirectiveModelObject<E extends IncludeDirective> extends
      PreprocessorDirectiveModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getIncludeDirectiveEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ConditionalDirective</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ConditionalDirectiveModelObject<E extends ConditionalDirective> extends
      PreprocessorDirectiveModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getConditionalDirectiveEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Expands</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ExpandsModelObject<E extends Expands> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getExpandsEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.EXPANDS_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.EXPANDS_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.EXPANDS_TO_FEATURE_ID:
        getTarget().setTo((MacroUnit) value);
        return;
      case CodeModelPackage.EXPANDS_FROM_FEATURE_ID:
        getTarget().setFrom((PreprocessorDirective) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>GeneratedFrom</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class GeneratedFromModelObject<E extends GeneratedFrom> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getGeneratedFromEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.GENERATEDFROM_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.GENERATEDFROM_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.GENERATEDFROM_TO_FEATURE_ID:
        getTarget().setTo((PreprocessorDirective) value);
        return;
      case CodeModelPackage.GENERATEDFROM_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractCodeElement) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Includes</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class IncludesModelObject<E extends Includes> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getIncludesEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.INCLUDES_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.INCLUDES_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.INCLUDES_TO_FEATURE_ID:
        getTarget().setTo((AbstractCodeElement) value);
        return;
      case CodeModelPackage.INCLUDES_FROM_FEATURE_ID:
        getTarget().setFrom((PreprocessorDirective) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>VariantTo</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class VariantToModelObject<E extends VariantTo> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getVariantToEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.VARIANTTO_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.VARIANTTO_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.VARIANTTO_TO_FEATURE_ID:
        getTarget().setTo((PreprocessorDirective) value);
        return;
      case CodeModelPackage.VARIANTTO_FROM_FEATURE_ID:
        getTarget().setFrom((PreprocessorDirective) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Redefines</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RedefinesModelObject<E extends Redefines> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getRedefinesEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.REDEFINES_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.REDEFINES_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.REDEFINES_TO_FEATURE_ID:
        getTarget().setTo((MacroUnit) value);
        return;
      case CodeModelPackage.REDEFINES_FROM_FEATURE_ID:
        getTarget().setFrom((PreprocessorDirective) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Namespace</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class NamespaceModelObject<E extends Namespace> extends CodeItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getNamespaceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.NAMESPACE_GROUPEDCODE_FEATURE_ID:
        return getTarget().getGroupedCode();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.NAMESPACE_GROUPEDCODE_FEATURE_ID:
        getTarget().setGroupedCode((Set<CodeItem>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.NAMESPACE_GROUPEDCODE_FEATURE_ID:
        return getTarget().addToGroupedCode((CodeItem) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case CodeModelPackage.NAMESPACE_GROUPEDCODE_FEATURE_ID:
        return getTarget().removeFromGroupedCode((CodeItem) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>VisibleIn</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class VisibleInModelObject<E extends VisibleIn> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getVisibleInEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.VISIBLEIN_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.VISIBLEIN_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.VISIBLEIN_TO_FEATURE_ID:
        getTarget().setTo((CodeItem) value);
        return;
      case CodeModelPackage.VISIBLEIN_FROM_FEATURE_ID:
        getTarget().setFrom((CodeItem) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Imports</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ImportsModelObject<E extends Imports> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getImportsEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.IMPORTS_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.IMPORTS_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.IMPORTS_TO_FEATURE_ID:
        getTarget().setTo((CodeItem) value);
        return;
      case CodeModelPackage.IMPORTS_FROM_FEATURE_ID:
        getTarget().setFrom((CodeItem) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CodeElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CodeElementModelObject<E extends CodeElement> extends CodeItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCodeElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CodeRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CodeRelationshipModelObject<E extends CodeRelationship> extends
      AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCodeRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CODERELATIONSHIP_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.CODERELATIONSHIP_FROM_FEATURE_ID:
        return getTarget().getFrom();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CODERELATIONSHIP_TO_FEATURE_ID:
        getTarget().setTo((KDMEntity) value);
        return;
      case CodeModelPackage.CODERELATIONSHIP_FROM_FEATURE_ID:
        getTarget().setFrom((CodeItem) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }
}