package org.eclipse.modisco.kdm.code;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.modisco.kdm.KdmModelPackage;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.code.dao.AbstractCodeElementDao;
import org.eclipse.modisco.kdm.code.dao.AbstractCodeRelationshipDao;
import org.eclipse.modisco.kdm.code.dao.ArrayTypeDao;
import org.eclipse.modisco.kdm.code.dao.BagTypeDao;
import org.eclipse.modisco.kdm.code.dao.BitTypeDao;
import org.eclipse.modisco.kdm.code.dao.BitstringTypeDao;
import org.eclipse.modisco.kdm.code.dao.BooleanTypeDao;
import org.eclipse.modisco.kdm.code.dao.CallableUnitDao;
import org.eclipse.modisco.kdm.code.dao.CharTypeDao;
import org.eclipse.modisco.kdm.code.dao.ChoiceTypeDao;
import org.eclipse.modisco.kdm.code.dao.ClassUnitDao;
import org.eclipse.modisco.kdm.code.dao.CodeAssemblyDao;
import org.eclipse.modisco.kdm.code.dao.CodeElementDao;
import org.eclipse.modisco.kdm.code.dao.CodeItemDao;
import org.eclipse.modisco.kdm.code.dao.CodeModelDao;
import org.eclipse.modisco.kdm.code.dao.CodeRelationshipDao;
import org.eclipse.modisco.kdm.code.dao.CommentUnitDao;
import org.eclipse.modisco.kdm.code.dao.CompilationUnitDao;
import org.eclipse.modisco.kdm.code.dao.CompositeTypeDao;
import org.eclipse.modisco.kdm.code.dao.ComputationalObjectDao;
import org.eclipse.modisco.kdm.code.dao.ConditionalDirectiveDao;
import org.eclipse.modisco.kdm.code.dao.ControlElementDao;
import org.eclipse.modisco.kdm.code.dao.DataElementDao;
import org.eclipse.modisco.kdm.code.dao.DatatypeDao;
import org.eclipse.modisco.kdm.code.dao.DateTypeDao;
import org.eclipse.modisco.kdm.code.dao.DecimalTypeDao;
import org.eclipse.modisco.kdm.code.dao.DefinedTypeDao;
import org.eclipse.modisco.kdm.code.dao.DerivedTypeDao;
import org.eclipse.modisco.kdm.code.dao.EnumeratedTypeDao;
import org.eclipse.modisco.kdm.code.dao.ExpandsDao;
import org.eclipse.modisco.kdm.code.dao.ExtendsDao;
import org.eclipse.modisco.kdm.code.dao.FloatTypeDao;
import org.eclipse.modisco.kdm.code.dao.GeneratedFromDao;
import org.eclipse.modisco.kdm.code.dao.HasTypeDao;
import org.eclipse.modisco.kdm.code.dao.HasValueDao;
import org.eclipse.modisco.kdm.code.dao.ImplementationOfDao;
import org.eclipse.modisco.kdm.code.dao.ImplementsDao;
import org.eclipse.modisco.kdm.code.dao.ImportsDao;
import org.eclipse.modisco.kdm.code.dao.IncludeDirectiveDao;
import org.eclipse.modisco.kdm.code.dao.IncludesDao;
import org.eclipse.modisco.kdm.code.dao.IndexUnitDao;
import org.eclipse.modisco.kdm.code.dao.InstanceOfDao;
import org.eclipse.modisco.kdm.code.dao.IntegerTypeDao;
import org.eclipse.modisco.kdm.code.dao.InterfaceUnitDao;
import org.eclipse.modisco.kdm.code.dao.ItemUnitDao;
import org.eclipse.modisco.kdm.code.dao.LanguageUnitDao;
import org.eclipse.modisco.kdm.code.dao.MacroDirectiveDao;
import org.eclipse.modisco.kdm.code.dao.MacroUnitDao;
import org.eclipse.modisco.kdm.code.dao.MemberUnitDao;
import org.eclipse.modisco.kdm.code.dao.MethodUnitDao;
import org.eclipse.modisco.kdm.code.dao.ModuleDao;
import org.eclipse.modisco.kdm.code.dao.NamespaceDao;
import org.eclipse.modisco.kdm.code.dao.OctetTypeDao;
import org.eclipse.modisco.kdm.code.dao.OctetstringTypeDao;
import org.eclipse.modisco.kdm.code.dao.OrdinalTypeDao;
import org.eclipse.modisco.kdm.code.dao.PackageDao;
import org.eclipse.modisco.kdm.code.dao.ParameterToDao;
import org.eclipse.modisco.kdm.code.dao.ParameterUnitDao;
import org.eclipse.modisco.kdm.code.dao.PointerTypeDao;
import org.eclipse.modisco.kdm.code.dao.PreprocessorDirectiveDao;
import org.eclipse.modisco.kdm.code.dao.PrimitiveTypeDao;
import org.eclipse.modisco.kdm.code.dao.RangeTypeDao;
import org.eclipse.modisco.kdm.code.dao.RecordTypeDao;
import org.eclipse.modisco.kdm.code.dao.RedefinesDao;
import org.eclipse.modisco.kdm.code.dao.ScaledTypeDao;
import org.eclipse.modisco.kdm.code.dao.SequenceTypeDao;
import org.eclipse.modisco.kdm.code.dao.SetTypeDao;
import org.eclipse.modisco.kdm.code.dao.SharedUnitDao;
import org.eclipse.modisco.kdm.code.dao.SignatureDao;
import org.eclipse.modisco.kdm.code.dao.StorableUnitDao;
import org.eclipse.modisco.kdm.code.dao.StringTypeDao;
import org.eclipse.modisco.kdm.code.dao.SynonymUnitDao;
import org.eclipse.modisco.kdm.code.dao.TemplateParameterDao;
import org.eclipse.modisco.kdm.code.dao.TemplateTypeDao;
import org.eclipse.modisco.kdm.code.dao.TemplateUnitDao;
import org.eclipse.modisco.kdm.code.dao.TimeTypeDao;
import org.eclipse.modisco.kdm.code.dao.TypeUnitDao;
import org.eclipse.modisco.kdm.code.dao.ValueDao;
import org.eclipse.modisco.kdm.code.dao.ValueElementDao;
import org.eclipse.modisco.kdm.code.dao.ValueListDao;
import org.eclipse.modisco.kdm.code.dao.VariantToDao;
import org.eclipse.modisco.kdm.code.dao.VisibleInDao;
import org.eclipse.modisco.kdm.code.dao.VoidTypeDao;
import org.eclipse.modisco.kdm.core.CoreModelPackage;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The <b>Package</b> for the model '<em><b>code</b></em>'. It contains initialization code and access to the Factory to
 * instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CodeModelPackage extends ModelPackage {

  /**
   * Is set when the package has been initialized.
   * 
   * @generated
   */
  private static boolean isInitialized = false;

  /**
   * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final String NS_URI = "http://www.eclipse.org/MoDisco/kdm/code";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final CodeModelFactory MODELFACTORY = new CodeModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CALLABLEKIND_CLASSIFIER_ID = 83;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int METHODKIND_CLASSIFIER_ID = 84;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXPORTKIND_CLASSIFIER_ID = 85;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STORABLEKIND_CLASSIFIER_ID = 86;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PARAMETERKIND_CLASSIFIER_ID = 87;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MACROKIND_CLASSIFIER_ID = 88;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CODEMODEL_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CODEMODEL_CODEELEMENT_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCODEELEMENT_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCODEELEMENT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCODEELEMENT_COMMENT_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCODEELEMENT_CODERELATION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCODEELEMENT_ENTRYFLOW_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENTUNIT_CLASSIFIER_ID = 77;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENTUNIT_TEXT_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCODERELATIONSHIP_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CODEITEM_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPUTATIONALOBJECT_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATATYPE_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MODULE_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MODULE_CODEELEMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPILATIONUNIT_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SHAREDUNIT_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LANGUAGEUNIT_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CODEASSEMBLY_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PACKAGE_CLASSIFIER_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTROLELEMENT_CLASSIFIER_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTROLELEMENT_TYPE_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTROLELEMENT_CODEELEMENT_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CALLABLEUNIT_CLASSIFIER_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CALLABLEUNIT_KIND_FEATURE_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int METHODUNIT_CLASSIFIER_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int METHODUNIT_KIND_FEATURE_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int METHODUNIT_EXPORT_FEATURE_ID = 24;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAELEMENT_CLASSIFIER_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAELEMENT_TYPE_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAELEMENT_EXT_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAELEMENT_SIZE_FEATURE_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAELEMENT_CODEELEMENT_FEATURE_ID = 24;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STORABLEUNIT_CLASSIFIER_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STORABLEUNIT_KIND_FEATURE_ID = 25;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEMUNIT_CLASSIFIER_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXUNIT_CLASSIFIER_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MEMBERUNIT_CLASSIFIER_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MEMBERUNIT_EXPORT_FEATURE_ID = 25;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PARAMETERUNIT_CLASSIFIER_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PARAMETERUNIT_KIND_FEATURE_ID = 25;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PARAMETERUNIT_POS_FEATURE_ID = 26;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VALUEELEMENT_CLASSIFIER_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VALUE_CLASSIFIER_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VALUELIST_CLASSIFIER_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VALUELIST_VALUEELEMENT_FEATURE_ID = 25;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRIMITIVETYPE_CLASSIFIER_ID = 24;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOLEANTYPE_CLASSIFIER_ID = 25;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHARTYPE_CLASSIFIER_ID = 26;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ORDINALTYPE_CLASSIFIER_ID = 27;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATETYPE_CLASSIFIER_ID = 28;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TIMETYPE_CLASSIFIER_ID = 29;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INTEGERTYPE_CLASSIFIER_ID = 30;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DECIMALTYPE_CLASSIFIER_ID = 31;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCALEDTYPE_CLASSIFIER_ID = 32;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FLOATTYPE_CLASSIFIER_ID = 33;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VOIDTYPE_CLASSIFIER_ID = 34;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STRINGTYPE_CLASSIFIER_ID = 35;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BITTYPE_CLASSIFIER_ID = 36;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BITSTRINGTYPE_CLASSIFIER_ID = 37;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int OCTETTYPE_CLASSIFIER_ID = 38;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int OCTETSTRINGTYPE_CLASSIFIER_ID = 39;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ENUMERATEDTYPE_CLASSIFIER_ID = 40;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ENUMERATEDTYPE_VALUE_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ENUMERATEDTYPE_CODEELEMENT_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOSITETYPE_CLASSIFIER_ID = 41;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOSITETYPE_ITEMUNIT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICETYPE_CLASSIFIER_ID = 42;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDTYPE_CLASSIFIER_ID = 43;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DERIVEDTYPE_CLASSIFIER_ID = 44;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DERIVEDTYPE_ITEMUNIT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ARRAYTYPE_CLASSIFIER_ID = 45;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ARRAYTYPE_SIZE_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ARRAYTYPE_INDEXUNIT_FEATURE_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POINTERTYPE_CLASSIFIER_ID = 46;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RANGETYPE_CLASSIFIER_ID = 47;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RANGETYPE_LOWER_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RANGETYPE_UPPER_FEATURE_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BAGTYPE_CLASSIFIER_ID = 48;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BAGTYPE_SIZE_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SETTYPE_CLASSIFIER_ID = 49;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SETTYPE_SIZE_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQUENCETYPE_CLASSIFIER_ID = 50;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQUENCETYPE_SIZE_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIGNATURE_CLASSIFIER_ID = 51;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIGNATURE_PARAMETERUNIT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DEFINEDTYPE_CLASSIFIER_ID = 52;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DEFINEDTYPE_TYPE_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DEFINEDTYPE_CODEELEMENT_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TYPEUNIT_CLASSIFIER_ID = 53;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SYNONYMUNIT_CLASSIFIER_ID = 54;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLASSUNIT_CLASSIFIER_ID = 55;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLASSUNIT_ISABSTRACT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLASSUNIT_CODEELEMENT_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INTERFACEUNIT_CLASSIFIER_ID = 56;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INTERFACEUNIT_CODEELEMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEMPLATEUNIT_CLASSIFIER_ID = 57;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEMPLATEUNIT_CODEELEMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEMPLATEPARAMETER_CLASSIFIER_ID = 58;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEMPLATETYPE_CLASSIFIER_ID = 59;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INSTANCEOF_CLASSIFIER_ID = 60;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INSTANCEOF_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INSTANCEOF_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PARAMETERTO_CLASSIFIER_ID = 61;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PARAMETERTO_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PARAMETERTO_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMPLEMENTS_CLASSIFIER_ID = 62;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMPLEMENTS_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMPLEMENTS_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMPLEMENTATIONOF_CLASSIFIER_ID = 63;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMPLEMENTATIONOF_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMPLEMENTATIONOF_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int HASTYPE_CLASSIFIER_ID = 64;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int HASTYPE_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int HASTYPE_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int HASVALUE_CLASSIFIER_ID = 65;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int HASVALUE_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int HASVALUE_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDS_CLASSIFIER_ID = 66;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDS_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDS_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PREPROCESSORDIRECTIVE_CLASSIFIER_ID = 67;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PREPROCESSORDIRECTIVE_CODEELEMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MACROUNIT_CLASSIFIER_ID = 68;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MACROUNIT_KIND_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MACRODIRECTIVE_CLASSIFIER_ID = 69;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INCLUDEDIRECTIVE_CLASSIFIER_ID = 70;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALDIRECTIVE_CLASSIFIER_ID = 71;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXPANDS_CLASSIFIER_ID = 72;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXPANDS_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXPANDS_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GENERATEDFROM_CLASSIFIER_ID = 73;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GENERATEDFROM_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GENERATEDFROM_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INCLUDES_CLASSIFIER_ID = 74;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INCLUDES_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INCLUDES_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VARIANTTO_CLASSIFIER_ID = 75;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VARIANTTO_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VARIANTTO_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REDEFINES_CLASSIFIER_ID = 76;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REDEFINES_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REDEFINES_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NAMESPACE_CLASSIFIER_ID = 78;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NAMESPACE_GROUPEDCODE_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VISIBLEIN_CLASSIFIER_ID = 79;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VISIBLEIN_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VISIBLEIN_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMPORTS_CLASSIFIER_ID = 80;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMPORTS_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMPORTS_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CODEELEMENT_CLASSIFIER_ID = 81;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CODERELATIONSHIP_CLASSIFIER_ID = 82;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CODERELATIONSHIP_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CODERELATIONSHIP_FROM_FEATURE_ID = 7;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final CodeModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static CodeModelPackage initialize() {

    if (isInitialized) {
      return (CodeModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final CodeModelPackage modelPackage = new CodeModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    isInitialized = true;

    KdmModelPackage.initialize();
    org.eclipse.modisco.kdm.kdm.KdmModelPackage.initialize();
    CoreModelPackage.initialize();
    SourceModelPackage.initialize();
    ActionModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(CodeModel.class, modelPackage.getCodeModelEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractCodeElement.class,
        modelPackage.getAbstractCodeElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CommentUnit.class, modelPackage.getCommentUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractCodeRelationship.class,
        modelPackage.getAbstractCodeRelationshipEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CodeItem.class, modelPackage.getCodeItemEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ComputationalObject.class,
        modelPackage.getComputationalObjectEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Datatype.class, modelPackage.getDatatypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Module.class, modelPackage.getModuleEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CompilationUnit.class,
        modelPackage.getCompilationUnitEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SharedUnit.class, modelPackage.getSharedUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(LanguageUnit.class, modelPackage.getLanguageUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CodeAssembly.class, modelPackage.getCodeAssemblyEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Package.class, modelPackage.getPackageEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ControlElement.class, modelPackage.getControlElementEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CallableUnit.class, modelPackage.getCallableUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(MethodUnit.class, modelPackage.getMethodUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DataElement.class, modelPackage.getDataElementEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(StorableUnit.class, modelPackage.getStorableUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ItemUnit.class, modelPackage.getItemUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(IndexUnit.class, modelPackage.getIndexUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(MemberUnit.class, modelPackage.getMemberUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ParameterUnit.class, modelPackage.getParameterUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ValueElement.class, modelPackage.getValueElementEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Value.class, modelPackage.getValueEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ValueList.class, modelPackage.getValueListEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PrimitiveType.class, modelPackage.getPrimitiveTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BooleanType.class, modelPackage.getBooleanTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CharType.class, modelPackage.getCharTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(OrdinalType.class, modelPackage.getOrdinalTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DateType.class, modelPackage.getDateTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TimeType.class, modelPackage.getTimeTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(IntegerType.class, modelPackage.getIntegerTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DecimalType.class, modelPackage.getDecimalTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ScaledType.class, modelPackage.getScaledTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(FloatType.class, modelPackage.getFloatTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(VoidType.class, modelPackage.getVoidTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(StringType.class, modelPackage.getStringTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BitType.class, modelPackage.getBitTypeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BitstringType.class, modelPackage.getBitstringTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(OctetType.class, modelPackage.getOctetTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(OctetstringType.class,
        modelPackage.getOctetstringTypeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(EnumeratedType.class, modelPackage.getEnumeratedTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CompositeType.class, modelPackage.getCompositeTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ChoiceType.class, modelPackage.getChoiceTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RecordType.class, modelPackage.getRecordTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DerivedType.class, modelPackage.getDerivedTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ArrayType.class, modelPackage.getArrayTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PointerType.class, modelPackage.getPointerTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RangeType.class, modelPackage.getRangeTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BagType.class, modelPackage.getBagTypeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SetType.class, modelPackage.getSetTypeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SequenceType.class, modelPackage.getSequenceTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Signature.class, modelPackage.getSignatureEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DefinedType.class, modelPackage.getDefinedTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TypeUnit.class, modelPackage.getTypeUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SynonymUnit.class, modelPackage.getSynonymUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ClassUnit.class, modelPackage.getClassUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(InterfaceUnit.class, modelPackage.getInterfaceUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TemplateUnit.class, modelPackage.getTemplateUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TemplateParameter.class,
        modelPackage.getTemplateParameterEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TemplateType.class, modelPackage.getTemplateTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(InstanceOf.class, modelPackage.getInstanceOfEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ParameterTo.class, modelPackage.getParameterToEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Implements.class, modelPackage.getImplementsEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ImplementationOf.class,
        modelPackage.getImplementationOfEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(HasType.class, modelPackage.getHasTypeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(HasValue.class, modelPackage.getHasValueEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Extends.class, modelPackage.getExtendsEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PreprocessorDirective.class,
        modelPackage.getPreprocessorDirectiveEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(MacroUnit.class, modelPackage.getMacroUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(MacroDirective.class, modelPackage.getMacroDirectiveEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(IncludeDirective.class,
        modelPackage.getIncludeDirectiveEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ConditionalDirective.class,
        modelPackage.getConditionalDirectiveEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Expands.class, modelPackage.getExpandsEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(GeneratedFrom.class, modelPackage.getGeneratedFromEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Includes.class, modelPackage.getIncludesEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(VariantTo.class, modelPackage.getVariantToEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Redefines.class, modelPackage.getRedefinesEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Namespace.class, modelPackage.getNamespaceEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(VisibleIn.class, modelPackage.getVisibleInEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Imports.class, modelPackage.getImportsEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CodeElement.class, modelPackage.getCodeElementEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CodeRelationship.class,
        modelPackage.getCodeRelationshipEClass(), modelPackage);

    ModelResolver.getInstance().registerClassModelMapping(CallableKind.class, modelPackage.getCallableKindEEnum(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(MethodKind.class, modelPackage.getMethodKindEEnum(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ExportKind.class, modelPackage.getExportKindEEnum(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(StorableKind.class, modelPackage.getStorableKindEEnum(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ParameterKind.class, modelPackage.getParameterKindEEnum(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(MacroKind.class, modelPackage.getMacroKindEEnum(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(CodeModel.class, CodeModelDao.class);
    DaoRegistry.getInstance().registerDao(AbstractCodeElement.class, AbstractCodeElementDao.class);
    DaoRegistry.getInstance().registerDao(CommentUnit.class, CommentUnitDao.class);
    DaoRegistry.getInstance().registerDao(AbstractCodeRelationship.class, AbstractCodeRelationshipDao.class);
    DaoRegistry.getInstance().registerDao(CodeItem.class, CodeItemDao.class);
    DaoRegistry.getInstance().registerDao(ComputationalObject.class, ComputationalObjectDao.class);
    DaoRegistry.getInstance().registerDao(Datatype.class, DatatypeDao.class);
    DaoRegistry.getInstance().registerDao(Module.class, ModuleDao.class);
    DaoRegistry.getInstance().registerDao(CompilationUnit.class, CompilationUnitDao.class);
    DaoRegistry.getInstance().registerDao(SharedUnit.class, SharedUnitDao.class);
    DaoRegistry.getInstance().registerDao(LanguageUnit.class, LanguageUnitDao.class);
    DaoRegistry.getInstance().registerDao(CodeAssembly.class, CodeAssemblyDao.class);
    DaoRegistry.getInstance().registerDao(Package.class, PackageDao.class);
    DaoRegistry.getInstance().registerDao(ControlElement.class, ControlElementDao.class);
    DaoRegistry.getInstance().registerDao(CallableUnit.class, CallableUnitDao.class);
    DaoRegistry.getInstance().registerDao(MethodUnit.class, MethodUnitDao.class);
    DaoRegistry.getInstance().registerDao(DataElement.class, DataElementDao.class);
    DaoRegistry.getInstance().registerDao(StorableUnit.class, StorableUnitDao.class);
    DaoRegistry.getInstance().registerDao(ItemUnit.class, ItemUnitDao.class);
    DaoRegistry.getInstance().registerDao(IndexUnit.class, IndexUnitDao.class);
    DaoRegistry.getInstance().registerDao(MemberUnit.class, MemberUnitDao.class);
    DaoRegistry.getInstance().registerDao(ParameterUnit.class, ParameterUnitDao.class);
    DaoRegistry.getInstance().registerDao(ValueElement.class, ValueElementDao.class);
    DaoRegistry.getInstance().registerDao(Value.class, ValueDao.class);
    DaoRegistry.getInstance().registerDao(ValueList.class, ValueListDao.class);
    DaoRegistry.getInstance().registerDao(PrimitiveType.class, PrimitiveTypeDao.class);
    DaoRegistry.getInstance().registerDao(BooleanType.class, BooleanTypeDao.class);
    DaoRegistry.getInstance().registerDao(CharType.class, CharTypeDao.class);
    DaoRegistry.getInstance().registerDao(OrdinalType.class, OrdinalTypeDao.class);
    DaoRegistry.getInstance().registerDao(DateType.class, DateTypeDao.class);
    DaoRegistry.getInstance().registerDao(TimeType.class, TimeTypeDao.class);
    DaoRegistry.getInstance().registerDao(IntegerType.class, IntegerTypeDao.class);
    DaoRegistry.getInstance().registerDao(DecimalType.class, DecimalTypeDao.class);
    DaoRegistry.getInstance().registerDao(ScaledType.class, ScaledTypeDao.class);
    DaoRegistry.getInstance().registerDao(FloatType.class, FloatTypeDao.class);
    DaoRegistry.getInstance().registerDao(VoidType.class, VoidTypeDao.class);
    DaoRegistry.getInstance().registerDao(StringType.class, StringTypeDao.class);
    DaoRegistry.getInstance().registerDao(BitType.class, BitTypeDao.class);
    DaoRegistry.getInstance().registerDao(BitstringType.class, BitstringTypeDao.class);
    DaoRegistry.getInstance().registerDao(OctetType.class, OctetTypeDao.class);
    DaoRegistry.getInstance().registerDao(OctetstringType.class, OctetstringTypeDao.class);
    DaoRegistry.getInstance().registerDao(EnumeratedType.class, EnumeratedTypeDao.class);
    DaoRegistry.getInstance().registerDao(CompositeType.class, CompositeTypeDao.class);
    DaoRegistry.getInstance().registerDao(ChoiceType.class, ChoiceTypeDao.class);
    DaoRegistry.getInstance().registerDao(RecordType.class, RecordTypeDao.class);
    DaoRegistry.getInstance().registerDao(DerivedType.class, DerivedTypeDao.class);
    DaoRegistry.getInstance().registerDao(ArrayType.class, ArrayTypeDao.class);
    DaoRegistry.getInstance().registerDao(PointerType.class, PointerTypeDao.class);
    DaoRegistry.getInstance().registerDao(RangeType.class, RangeTypeDao.class);
    DaoRegistry.getInstance().registerDao(BagType.class, BagTypeDao.class);
    DaoRegistry.getInstance().registerDao(SetType.class, SetTypeDao.class);
    DaoRegistry.getInstance().registerDao(SequenceType.class, SequenceTypeDao.class);
    DaoRegistry.getInstance().registerDao(Signature.class, SignatureDao.class);
    DaoRegistry.getInstance().registerDao(DefinedType.class, DefinedTypeDao.class);
    DaoRegistry.getInstance().registerDao(TypeUnit.class, TypeUnitDao.class);
    DaoRegistry.getInstance().registerDao(SynonymUnit.class, SynonymUnitDao.class);
    DaoRegistry.getInstance().registerDao(ClassUnit.class, ClassUnitDao.class);
    DaoRegistry.getInstance().registerDao(InterfaceUnit.class, InterfaceUnitDao.class);
    DaoRegistry.getInstance().registerDao(TemplateUnit.class, TemplateUnitDao.class);
    DaoRegistry.getInstance().registerDao(TemplateParameter.class, TemplateParameterDao.class);
    DaoRegistry.getInstance().registerDao(TemplateType.class, TemplateTypeDao.class);
    DaoRegistry.getInstance().registerDao(InstanceOf.class, InstanceOfDao.class);
    DaoRegistry.getInstance().registerDao(ParameterTo.class, ParameterToDao.class);
    DaoRegistry.getInstance().registerDao(Implements.class, ImplementsDao.class);
    DaoRegistry.getInstance().registerDao(ImplementationOf.class, ImplementationOfDao.class);
    DaoRegistry.getInstance().registerDao(HasType.class, HasTypeDao.class);
    DaoRegistry.getInstance().registerDao(HasValue.class, HasValueDao.class);
    DaoRegistry.getInstance().registerDao(Extends.class, ExtendsDao.class);
    DaoRegistry.getInstance().registerDao(PreprocessorDirective.class, PreprocessorDirectiveDao.class);
    DaoRegistry.getInstance().registerDao(MacroUnit.class, MacroUnitDao.class);
    DaoRegistry.getInstance().registerDao(MacroDirective.class, MacroDirectiveDao.class);
    DaoRegistry.getInstance().registerDao(IncludeDirective.class, IncludeDirectiveDao.class);
    DaoRegistry.getInstance().registerDao(ConditionalDirective.class, ConditionalDirectiveDao.class);
    DaoRegistry.getInstance().registerDao(Expands.class, ExpandsDao.class);
    DaoRegistry.getInstance().registerDao(GeneratedFrom.class, GeneratedFromDao.class);
    DaoRegistry.getInstance().registerDao(Includes.class, IncludesDao.class);
    DaoRegistry.getInstance().registerDao(VariantTo.class, VariantToDao.class);
    DaoRegistry.getInstance().registerDao(Redefines.class, RedefinesDao.class);
    DaoRegistry.getInstance().registerDao(Namespace.class, NamespaceDao.class);
    DaoRegistry.getInstance().registerDao(VisibleIn.class, VisibleInDao.class);
    DaoRegistry.getInstance().registerDao(Imports.class, ImportsDao.class);
    DaoRegistry.getInstance().registerDao(CodeElement.class, CodeElementDao.class);
    DaoRegistry.getInstance().registerDao(CodeRelationship.class, CodeRelationshipDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link CodeModelFactory} instance.
   * @generated
   */
  @Override
  public CodeModelFactory getModelFactory() {
    return MODELFACTORY;
  }

  /**
   * Returns the nsUri of the {@link EPackage} managed by this Package instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return the nsUri of the EPackage
   * @generated
   */
  @Override
  public String getNsURI() {
    return NS_URI;
  }

  /**
   * Returns the name of the ecore file containing the ecore model of the {@link EPackage} managed here. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the name of the ecore file
   * @generated
   */
  @Override
  public String getEcoreFileName() {
    return "code.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>CodeModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CodeModel</b></em>'
   * @generated
   */
  public EClass getCodeModelEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CODEMODEL_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CodeModel.codeElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CodeModel.codeElement</b></em>'.
   * @generated
   */
  public EReference getCodeModel_CodeElement() {
    return (EReference) getCodeModelEClass().getEAllStructuralFeatures().get(CODEMODEL_CODEELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractCodeElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractCodeElement</b></em>'
   * @generated
   */
  public EClass getAbstractCodeElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTCODEELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractCodeElement.source</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractCodeElement.source</b></em>'.
   * @generated
   */
  public EReference getAbstractCodeElement_Source() {
    return (EReference) getAbstractCodeElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTCODEELEMENT_SOURCE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractCodeElement.comment</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractCodeElement.comment</b></em>'.
   * @generated
   */
  public EReference getAbstractCodeElement_Comment() {
    return (EReference) getAbstractCodeElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTCODEELEMENT_COMMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractCodeElement.codeRelation</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractCodeElement.codeRelation</b></em>'.
   * @generated
   */
  public EReference getAbstractCodeElement_CodeRelation() {
    return (EReference) getAbstractCodeElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTCODEELEMENT_CODERELATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractCodeElement.entryFlow</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractCodeElement.entryFlow</b></em>'.
   * @generated
   */
  public EReference getAbstractCodeElement_EntryFlow() {
    return (EReference) getAbstractCodeElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTCODEELEMENT_ENTRYFLOW_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CommentUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CommentUnit</b></em>'
   * @generated
   */
  public EClass getCommentUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COMMENTUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CommentUnit.text</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CommentUnit.text</b></em>'.
   * @generated
   */
  public EAttribute getCommentUnit_Text() {
    return (EAttribute) getCommentUnitEClass().getEAllStructuralFeatures().get(COMMENTUNIT_TEXT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractCodeRelationship</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractCodeRelationship</b></em>'
   * @generated
   */
  public EClass getAbstractCodeRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTCODERELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CodeItem</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CodeItem</b></em>'
   * @generated
   */
  public EClass getCodeItemEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CODEITEM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ComputationalObject</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ComputationalObject</b></em>'
   * @generated
   */
  public EClass getComputationalObjectEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COMPUTATIONALOBJECT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Datatype</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Datatype</b></em>'
   * @generated
   */
  public EClass getDatatypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATATYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Module</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Module</b></em>'
   * @generated
   */
  public EClass getModuleEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MODULE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Module.codeElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Module.codeElement</b></em>'.
   * @generated
   */
  public EReference getModule_CodeElement() {
    return (EReference) getModuleEClass().getEAllStructuralFeatures().get(MODULE_CODEELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CompilationUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CompilationUnit</b></em>'
   * @generated
   */
  public EClass getCompilationUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COMPILATIONUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SharedUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SharedUnit</b></em>'
   * @generated
   */
  public EClass getSharedUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SHAREDUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>LanguageUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>LanguageUnit</b></em>'
   * @generated
   */
  public EClass getLanguageUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(LANGUAGEUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CodeAssembly</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CodeAssembly</b></em>'
   * @generated
   */
  public EClass getCodeAssemblyEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CODEASSEMBLY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Package</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Package</b></em>'
   * @generated
   */
  public EClass getPackageEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PACKAGE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ControlElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ControlElement</b></em>'
   * @generated
   */
  public EClass getControlElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONTROLELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ControlElement.type</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ControlElement.type</b></em>'.
   * @generated
   */
  public EReference getControlElement_Type() {
    return (EReference) getControlElementEClass().getEAllStructuralFeatures().get(CONTROLELEMENT_TYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ControlElement.codeElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ControlElement.codeElement</b></em>'.
   * @generated
   */
  public EReference getControlElement_CodeElement() {
    return (EReference) getControlElementEClass().getEAllStructuralFeatures()
        .get(CONTROLELEMENT_CODEELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CallableUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CallableUnit</b></em>'
   * @generated
   */
  public EClass getCallableUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CALLABLEUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CallableUnit.kind</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CallableUnit.kind</b></em>'.
   * @generated
   */
  public EAttribute getCallableUnit_Kind() {
    return (EAttribute) getCallableUnitEClass().getEAllStructuralFeatures().get(CALLABLEUNIT_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>MethodUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>MethodUnit</b></em>'
   * @generated
   */
  public EClass getMethodUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(METHODUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>MethodUnit.kind</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>MethodUnit.kind</b></em>'.
   * @generated
   */
  public EAttribute getMethodUnit_Kind() {
    return (EAttribute) getMethodUnitEClass().getEAllStructuralFeatures().get(METHODUNIT_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>MethodUnit.export</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>MethodUnit.export</b></em>'.
   * @generated
   */
  public EAttribute getMethodUnit_Export() {
    return (EAttribute) getMethodUnitEClass().getEAllStructuralFeatures().get(METHODUNIT_EXPORT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DataElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DataElement</b></em>'
   * @generated
   */
  public EClass getDataElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATAELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataElement.type</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataElement.type</b></em>'.
   * @generated
   */
  public EReference getDataElement_Type() {
    return (EReference) getDataElementEClass().getEAllStructuralFeatures().get(DATAELEMENT_TYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataElement.ext</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataElement.ext</b></em>'.
   * @generated
   */
  public EAttribute getDataElement_Ext() {
    return (EAttribute) getDataElementEClass().getEAllStructuralFeatures().get(DATAELEMENT_EXT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataElement.size</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataElement.size</b></em>'.
   * @generated
   */
  public EAttribute getDataElement_Size() {
    return (EAttribute) getDataElementEClass().getEAllStructuralFeatures().get(DATAELEMENT_SIZE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataElement.codeElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataElement.codeElement</b></em>'.
   * @generated
   */
  public EReference getDataElement_CodeElement() {
    return (EReference) getDataElementEClass().getEAllStructuralFeatures().get(DATAELEMENT_CODEELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>StorableUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>StorableUnit</b></em>'
   * @generated
   */
  public EClass getStorableUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(STORABLEUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>StorableUnit.kind</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>StorableUnit.kind</b></em>'.
   * @generated
   */
  public EAttribute getStorableUnit_Kind() {
    return (EAttribute) getStorableUnitEClass().getEAllStructuralFeatures().get(STORABLEUNIT_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ItemUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ItemUnit</b></em>'
   * @generated
   */
  public EClass getItemUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ITEMUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>IndexUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>IndexUnit</b></em>'
   * @generated
   */
  public EClass getIndexUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(INDEXUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>MemberUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>MemberUnit</b></em>'
   * @generated
   */
  public EClass getMemberUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MEMBERUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>MemberUnit.export</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>MemberUnit.export</b></em>'.
   * @generated
   */
  public EAttribute getMemberUnit_Export() {
    return (EAttribute) getMemberUnitEClass().getEAllStructuralFeatures().get(MEMBERUNIT_EXPORT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ParameterUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ParameterUnit</b></em>'
   * @generated
   */
  public EClass getParameterUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PARAMETERUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ParameterUnit.kind</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ParameterUnit.kind</b></em>'.
   * @generated
   */
  public EAttribute getParameterUnit_Kind() {
    return (EAttribute) getParameterUnitEClass().getEAllStructuralFeatures().get(PARAMETERUNIT_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ParameterUnit.pos</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ParameterUnit.pos</b></em>'.
   * @generated
   */
  public EAttribute getParameterUnit_Pos() {
    return (EAttribute) getParameterUnitEClass().getEAllStructuralFeatures().get(PARAMETERUNIT_POS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ValueElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ValueElement</b></em>'
   * @generated
   */
  public EClass getValueElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(VALUEELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Value</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Value</b></em>'
   * @generated
   */
  public EClass getValueEClass() {
    return (EClass) getEPackage().getEClassifiers().get(VALUE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ValueList</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ValueList</b></em>'
   * @generated
   */
  public EClass getValueListEClass() {
    return (EClass) getEPackage().getEClassifiers().get(VALUELIST_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ValueList.valueElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ValueList.valueElement</b></em>'.
   * @generated
   */
  public EReference getValueList_ValueElement() {
    return (EReference) getValueListEClass().getEAllStructuralFeatures().get(VALUELIST_VALUEELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PrimitiveType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PrimitiveType</b></em>'
   * @generated
   */
  public EClass getPrimitiveTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PRIMITIVETYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BooleanType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BooleanType</b></em>'
   * @generated
   */
  public EClass getBooleanTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BOOLEANTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CharType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CharType</b></em>'
   * @generated
   */
  public EClass getCharTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CHARTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>OrdinalType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>OrdinalType</b></em>'
   * @generated
   */
  public EClass getOrdinalTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ORDINALTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DateType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DateType</b></em>'
   * @generated
   */
  public EClass getDateTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATETYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>TimeType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TimeType</b></em>'
   * @generated
   */
  public EClass getTimeTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TIMETYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>IntegerType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>IntegerType</b></em>'
   * @generated
   */
  public EClass getIntegerTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(INTEGERTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DecimalType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DecimalType</b></em>'
   * @generated
   */
  public EClass getDecimalTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DECIMALTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ScaledType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ScaledType</b></em>'
   * @generated
   */
  public EClass getScaledTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SCALEDTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>FloatType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>FloatType</b></em>'
   * @generated
   */
  public EClass getFloatTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(FLOATTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>VoidType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>VoidType</b></em>'
   * @generated
   */
  public EClass getVoidTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(VOIDTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>StringType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>StringType</b></em>'
   * @generated
   */
  public EClass getStringTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(STRINGTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BitType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BitType</b></em>'
   * @generated
   */
  public EClass getBitTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BITTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BitstringType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BitstringType</b></em>'
   * @generated
   */
  public EClass getBitstringTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BITSTRINGTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>OctetType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>OctetType</b></em>'
   * @generated
   */
  public EClass getOctetTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(OCTETTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>OctetstringType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>OctetstringType</b></em>'
   * @generated
   */
  public EClass getOctetstringTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(OCTETSTRINGTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>EnumeratedType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>EnumeratedType</b></em>'
   * @generated
   */
  public EClass getEnumeratedTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ENUMERATEDTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>EnumeratedType.value</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>EnumeratedType.value</b></em>'.
   * @generated
   */
  public EReference getEnumeratedType_Value() {
    return (EReference) getEnumeratedTypeEClass().getEAllStructuralFeatures().get(ENUMERATEDTYPE_VALUE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>EnumeratedType.codeElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>EnumeratedType.codeElement</b></em>'.
   * @generated
   */
  public EReference getEnumeratedType_CodeElement() {
    return (EReference) getEnumeratedTypeEClass().getEAllStructuralFeatures()
        .get(ENUMERATEDTYPE_CODEELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CompositeType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CompositeType</b></em>'
   * @generated
   */
  public EClass getCompositeTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COMPOSITETYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CompositeType.itemUnit</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CompositeType.itemUnit</b></em>'.
   * @generated
   */
  public EReference getCompositeType_ItemUnit() {
    return (EReference) getCompositeTypeEClass().getEAllStructuralFeatures().get(COMPOSITETYPE_ITEMUNIT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ChoiceType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ChoiceType</b></em>'
   * @generated
   */
  public EClass getChoiceTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CHOICETYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RecordType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RecordType</b></em>'
   * @generated
   */
  public EClass getRecordTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RECORDTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DerivedType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DerivedType</b></em>'
   * @generated
   */
  public EClass getDerivedTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DERIVEDTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DerivedType.itemUnit</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DerivedType.itemUnit</b></em>'.
   * @generated
   */
  public EReference getDerivedType_ItemUnit() {
    return (EReference) getDerivedTypeEClass().getEAllStructuralFeatures().get(DERIVEDTYPE_ITEMUNIT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ArrayType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ArrayType</b></em>'
   * @generated
   */
  public EClass getArrayTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ARRAYTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ArrayType.size</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ArrayType.size</b></em>'.
   * @generated
   */
  public EAttribute getArrayType_Size() {
    return (EAttribute) getArrayTypeEClass().getEAllStructuralFeatures().get(ARRAYTYPE_SIZE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ArrayType.indexUnit</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ArrayType.indexUnit</b></em>'.
   * @generated
   */
  public EReference getArrayType_IndexUnit() {
    return (EReference) getArrayTypeEClass().getEAllStructuralFeatures().get(ARRAYTYPE_INDEXUNIT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PointerType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PointerType</b></em>'
   * @generated
   */
  public EClass getPointerTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(POINTERTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RangeType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RangeType</b></em>'
   * @generated
   */
  public EClass getRangeTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RANGETYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RangeType.lower</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RangeType.lower</b></em>'.
   * @generated
   */
  public EAttribute getRangeType_Lower() {
    return (EAttribute) getRangeTypeEClass().getEAllStructuralFeatures().get(RANGETYPE_LOWER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RangeType.upper</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RangeType.upper</b></em>'.
   * @generated
   */
  public EAttribute getRangeType_Upper() {
    return (EAttribute) getRangeTypeEClass().getEAllStructuralFeatures().get(RANGETYPE_UPPER_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BagType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BagType</b></em>'
   * @generated
   */
  public EClass getBagTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BAGTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BagType.size</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BagType.size</b></em>'.
   * @generated
   */
  public EAttribute getBagType_Size() {
    return (EAttribute) getBagTypeEClass().getEAllStructuralFeatures().get(BAGTYPE_SIZE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SetType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SetType</b></em>'
   * @generated
   */
  public EClass getSetTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SETTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SetType.size</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SetType.size</b></em>'.
   * @generated
   */
  public EAttribute getSetType_Size() {
    return (EAttribute) getSetTypeEClass().getEAllStructuralFeatures().get(SETTYPE_SIZE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SequenceType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SequenceType</b></em>'
   * @generated
   */
  public EClass getSequenceTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SEQUENCETYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SequenceType.size</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SequenceType.size</b></em>'.
   * @generated
   */
  public EAttribute getSequenceType_Size() {
    return (EAttribute) getSequenceTypeEClass().getEAllStructuralFeatures().get(SEQUENCETYPE_SIZE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Signature</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Signature</b></em>'
   * @generated
   */
  public EClass getSignatureEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SIGNATURE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Signature.parameterUnit</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Signature.parameterUnit</b></em>'.
   * @generated
   */
  public EReference getSignature_ParameterUnit() {
    return (EReference) getSignatureEClass().getEAllStructuralFeatures().get(SIGNATURE_PARAMETERUNIT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DefinedType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DefinedType</b></em>'
   * @generated
   */
  public EClass getDefinedTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DEFINEDTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DefinedType.type</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DefinedType.type</b></em>'.
   * @generated
   */
  public EReference getDefinedType_Type() {
    return (EReference) getDefinedTypeEClass().getEAllStructuralFeatures().get(DEFINEDTYPE_TYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DefinedType.codeElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DefinedType.codeElement</b></em>'.
   * @generated
   */
  public EReference getDefinedType_CodeElement() {
    return (EReference) getDefinedTypeEClass().getEAllStructuralFeatures().get(DEFINEDTYPE_CODEELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>TypeUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TypeUnit</b></em>'
   * @generated
   */
  public EClass getTypeUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TYPEUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SynonymUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SynonymUnit</b></em>'
   * @generated
   */
  public EClass getSynonymUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SYNONYMUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ClassUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ClassUnit</b></em>'
   * @generated
   */
  public EClass getClassUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CLASSUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ClassUnit.isAbstract</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ClassUnit.isAbstract</b></em>'.
   * @generated
   */
  public EAttribute getClassUnit_IsAbstract() {
    return (EAttribute) getClassUnitEClass().getEAllStructuralFeatures().get(CLASSUNIT_ISABSTRACT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ClassUnit.codeElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ClassUnit.codeElement</b></em>'.
   * @generated
   */
  public EReference getClassUnit_CodeElement() {
    return (EReference) getClassUnitEClass().getEAllStructuralFeatures().get(CLASSUNIT_CODEELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>InterfaceUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>InterfaceUnit</b></em>'
   * @generated
   */
  public EClass getInterfaceUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(INTERFACEUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>InterfaceUnit.codeElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>InterfaceUnit.codeElement</b></em>'.
   * @generated
   */
  public EReference getInterfaceUnit_CodeElement() {
    return (EReference) getInterfaceUnitEClass().getEAllStructuralFeatures().get(INTERFACEUNIT_CODEELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>TemplateUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TemplateUnit</b></em>'
   * @generated
   */
  public EClass getTemplateUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TEMPLATEUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TemplateUnit.codeElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TemplateUnit.codeElement</b></em>'.
   * @generated
   */
  public EReference getTemplateUnit_CodeElement() {
    return (EReference) getTemplateUnitEClass().getEAllStructuralFeatures().get(TEMPLATEUNIT_CODEELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>TemplateParameter</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TemplateParameter</b></em>'
   * @generated
   */
  public EClass getTemplateParameterEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TEMPLATEPARAMETER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>TemplateType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TemplateType</b></em>'
   * @generated
   */
  public EClass getTemplateTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TEMPLATETYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>InstanceOf</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>InstanceOf</b></em>'
   * @generated
   */
  public EClass getInstanceOfEClass() {
    return (EClass) getEPackage().getEClassifiers().get(INSTANCEOF_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>InstanceOf.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>InstanceOf.to</b></em>'.
   * @generated
   */
  public EReference getInstanceOf_To() {
    return (EReference) getInstanceOfEClass().getEAllStructuralFeatures().get(INSTANCEOF_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>InstanceOf.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>InstanceOf.from</b></em>'.
   * @generated
   */
  public EReference getInstanceOf_From() {
    return (EReference) getInstanceOfEClass().getEAllStructuralFeatures().get(INSTANCEOF_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ParameterTo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ParameterTo</b></em>'
   * @generated
   */
  public EClass getParameterToEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PARAMETERTO_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ParameterTo.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ParameterTo.to</b></em>'.
   * @generated
   */
  public EReference getParameterTo_To() {
    return (EReference) getParameterToEClass().getEAllStructuralFeatures().get(PARAMETERTO_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ParameterTo.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ParameterTo.from</b></em>'.
   * @generated
   */
  public EReference getParameterTo_From() {
    return (EReference) getParameterToEClass().getEAllStructuralFeatures().get(PARAMETERTO_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Implements</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Implements</b></em>'
   * @generated
   */
  public EClass getImplementsEClass() {
    return (EClass) getEPackage().getEClassifiers().get(IMPLEMENTS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Implements.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Implements.to</b></em>'.
   * @generated
   */
  public EReference getImplements_To() {
    return (EReference) getImplementsEClass().getEAllStructuralFeatures().get(IMPLEMENTS_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Implements.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Implements.from</b></em>'.
   * @generated
   */
  public EReference getImplements_From() {
    return (EReference) getImplementsEClass().getEAllStructuralFeatures().get(IMPLEMENTS_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ImplementationOf</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ImplementationOf</b></em>'
   * @generated
   */
  public EClass getImplementationOfEClass() {
    return (EClass) getEPackage().getEClassifiers().get(IMPLEMENTATIONOF_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ImplementationOf.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ImplementationOf.to</b></em>'.
   * @generated
   */
  public EReference getImplementationOf_To() {
    return (EReference) getImplementationOfEClass().getEAllStructuralFeatures().get(IMPLEMENTATIONOF_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ImplementationOf.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ImplementationOf.from</b></em>'.
   * @generated
   */
  public EReference getImplementationOf_From() {
    return (EReference) getImplementationOfEClass().getEAllStructuralFeatures().get(IMPLEMENTATIONOF_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>HasType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>HasType</b></em>'
   * @generated
   */
  public EClass getHasTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(HASTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>HasType.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>HasType.to</b></em>'.
   * @generated
   */
  public EReference getHasType_To() {
    return (EReference) getHasTypeEClass().getEAllStructuralFeatures().get(HASTYPE_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>HasType.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>HasType.from</b></em>'.
   * @generated
   */
  public EReference getHasType_From() {
    return (EReference) getHasTypeEClass().getEAllStructuralFeatures().get(HASTYPE_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>HasValue</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>HasValue</b></em>'
   * @generated
   */
  public EClass getHasValueEClass() {
    return (EClass) getEPackage().getEClassifiers().get(HASVALUE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>HasValue.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>HasValue.to</b></em>'.
   * @generated
   */
  public EReference getHasValue_To() {
    return (EReference) getHasValueEClass().getEAllStructuralFeatures().get(HASVALUE_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>HasValue.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>HasValue.from</b></em>'.
   * @generated
   */
  public EReference getHasValue_From() {
    return (EReference) getHasValueEClass().getEAllStructuralFeatures().get(HASVALUE_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Extends</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Extends</b></em>'
   * @generated
   */
  public EClass getExtendsEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EXTENDS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Extends.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Extends.to</b></em>'.
   * @generated
   */
  public EReference getExtends_To() {
    return (EReference) getExtendsEClass().getEAllStructuralFeatures().get(EXTENDS_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Extends.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Extends.from</b></em>'.
   * @generated
   */
  public EReference getExtends_From() {
    return (EReference) getExtendsEClass().getEAllStructuralFeatures().get(EXTENDS_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PreprocessorDirective</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PreprocessorDirective</b></em>'
   * @generated
   */
  public EClass getPreprocessorDirectiveEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PREPROCESSORDIRECTIVE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PreprocessorDirective.codeElement</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PreprocessorDirective.codeElement</b></em>'.
   * @generated
   */
  public EReference getPreprocessorDirective_CodeElement() {
    return (EReference) getPreprocessorDirectiveEClass().getEAllStructuralFeatures().get(
        PREPROCESSORDIRECTIVE_CODEELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>MacroUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>MacroUnit</b></em>'
   * @generated
   */
  public EClass getMacroUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MACROUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>MacroUnit.kind</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>MacroUnit.kind</b></em>'.
   * @generated
   */
  public EAttribute getMacroUnit_Kind() {
    return (EAttribute) getMacroUnitEClass().getEAllStructuralFeatures().get(MACROUNIT_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>MacroDirective</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>MacroDirective</b></em>'
   * @generated
   */
  public EClass getMacroDirectiveEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MACRODIRECTIVE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>IncludeDirective</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>IncludeDirective</b></em>'
   * @generated
   */
  public EClass getIncludeDirectiveEClass() {
    return (EClass) getEPackage().getEClassifiers().get(INCLUDEDIRECTIVE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ConditionalDirective</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ConditionalDirective</b></em>'
   * @generated
   */
  public EClass getConditionalDirectiveEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONDITIONALDIRECTIVE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Expands</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Expands</b></em>'
   * @generated
   */
  public EClass getExpandsEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EXPANDS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Expands.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Expands.to</b></em>'.
   * @generated
   */
  public EReference getExpands_To() {
    return (EReference) getExpandsEClass().getEAllStructuralFeatures().get(EXPANDS_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Expands.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Expands.from</b></em>'.
   * @generated
   */
  public EReference getExpands_From() {
    return (EReference) getExpandsEClass().getEAllStructuralFeatures().get(EXPANDS_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>GeneratedFrom</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>GeneratedFrom</b></em>'
   * @generated
   */
  public EClass getGeneratedFromEClass() {
    return (EClass) getEPackage().getEClassifiers().get(GENERATEDFROM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GeneratedFrom.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GeneratedFrom.to</b></em>'.
   * @generated
   */
  public EReference getGeneratedFrom_To() {
    return (EReference) getGeneratedFromEClass().getEAllStructuralFeatures().get(GENERATEDFROM_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GeneratedFrom.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GeneratedFrom.from</b></em>'.
   * @generated
   */
  public EReference getGeneratedFrom_From() {
    return (EReference) getGeneratedFromEClass().getEAllStructuralFeatures().get(GENERATEDFROM_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Includes</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Includes</b></em>'
   * @generated
   */
  public EClass getIncludesEClass() {
    return (EClass) getEPackage().getEClassifiers().get(INCLUDES_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Includes.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Includes.to</b></em>'.
   * @generated
   */
  public EReference getIncludes_To() {
    return (EReference) getIncludesEClass().getEAllStructuralFeatures().get(INCLUDES_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Includes.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Includes.from</b></em>'.
   * @generated
   */
  public EReference getIncludes_From() {
    return (EReference) getIncludesEClass().getEAllStructuralFeatures().get(INCLUDES_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>VariantTo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>VariantTo</b></em>'
   * @generated
   */
  public EClass getVariantToEClass() {
    return (EClass) getEPackage().getEClassifiers().get(VARIANTTO_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>VariantTo.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>VariantTo.to</b></em>'.
   * @generated
   */
  public EReference getVariantTo_To() {
    return (EReference) getVariantToEClass().getEAllStructuralFeatures().get(VARIANTTO_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>VariantTo.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>VariantTo.from</b></em>'.
   * @generated
   */
  public EReference getVariantTo_From() {
    return (EReference) getVariantToEClass().getEAllStructuralFeatures().get(VARIANTTO_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Redefines</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Redefines</b></em>'
   * @generated
   */
  public EClass getRedefinesEClass() {
    return (EClass) getEPackage().getEClassifiers().get(REDEFINES_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Redefines.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Redefines.to</b></em>'.
   * @generated
   */
  public EReference getRedefines_To() {
    return (EReference) getRedefinesEClass().getEAllStructuralFeatures().get(REDEFINES_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Redefines.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Redefines.from</b></em>'.
   * @generated
   */
  public EReference getRedefines_From() {
    return (EReference) getRedefinesEClass().getEAllStructuralFeatures().get(REDEFINES_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Namespace</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Namespace</b></em>'
   * @generated
   */
  public EClass getNamespaceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(NAMESPACE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Namespace.groupedCode</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Namespace.groupedCode</b></em>'.
   * @generated
   */
  public EReference getNamespace_GroupedCode() {
    return (EReference) getNamespaceEClass().getEAllStructuralFeatures().get(NAMESPACE_GROUPEDCODE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>VisibleIn</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>VisibleIn</b></em>'
   * @generated
   */
  public EClass getVisibleInEClass() {
    return (EClass) getEPackage().getEClassifiers().get(VISIBLEIN_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>VisibleIn.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>VisibleIn.to</b></em>'.
   * @generated
   */
  public EReference getVisibleIn_To() {
    return (EReference) getVisibleInEClass().getEAllStructuralFeatures().get(VISIBLEIN_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>VisibleIn.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>VisibleIn.from</b></em>'.
   * @generated
   */
  public EReference getVisibleIn_From() {
    return (EReference) getVisibleInEClass().getEAllStructuralFeatures().get(VISIBLEIN_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Imports</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Imports</b></em>'
   * @generated
   */
  public EClass getImportsEClass() {
    return (EClass) getEPackage().getEClassifiers().get(IMPORTS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Imports.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Imports.to</b></em>'.
   * @generated
   */
  public EReference getImports_To() {
    return (EReference) getImportsEClass().getEAllStructuralFeatures().get(IMPORTS_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Imports.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Imports.from</b></em>'.
   * @generated
   */
  public EReference getImports_From() {
    return (EReference) getImportsEClass().getEAllStructuralFeatures().get(IMPORTS_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CodeElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CodeElement</b></em>'
   * @generated
   */
  public EClass getCodeElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CODEELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CodeRelationship</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CodeRelationship</b></em>'
   * @generated
   */
  public EClass getCodeRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CODERELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CodeRelationship.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CodeRelationship.to</b></em>'.
   * @generated
   */
  public EReference getCodeRelationship_To() {
    return (EReference) getCodeRelationshipEClass().getEAllStructuralFeatures().get(CODERELATIONSHIP_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CodeRelationship.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CodeRelationship.from</b></em>'.
   * @generated
   */
  public EReference getCodeRelationship_From() {
    return (EReference) getCodeRelationshipEClass().getEAllStructuralFeatures().get(CODERELATIONSHIP_FROM_FEATURE_ID);
  }

  /**
   * Returns the EEnum '<em><b>CallableKind</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>CallableKind</b></em>'
   * @generated
   */
  public EEnum getCallableKindEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(CALLABLEKIND_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>MethodKind</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>MethodKind</b></em>'
   * @generated
   */
  public EEnum getMethodKindEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(METHODKIND_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>ExportKind</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>ExportKind</b></em>'
   * @generated
   */
  public EEnum getExportKindEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(EXPORTKIND_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>StorableKind</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>StorableKind</b></em>'
   * @generated
   */
  public EEnum getStorableKindEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(STORABLEKIND_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>ParameterKind</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>ParameterKind</b></em>'
   * @generated
   */
  public EEnum getParameterKindEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(PARAMETERKIND_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>MacroKind</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>MacroKind</b></em>'
   * @generated
   */
  public EEnum getMacroKindEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(MACROKIND_CLASSIFIER_ID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClassifier
   *          the {@link EClassifier}
   * @return the class implementing a specific {@link EClass}.
   * @generated
   */
  @Override
  public Class<?> getEClassifierClass(EClassifier eClassifier) {
    switch (eClassifier.getClassifierID()) {
    case CODEMODEL_CLASSIFIER_ID:
      return CodeModel.class;
    case ABSTRACTCODEELEMENT_CLASSIFIER_ID:
      return AbstractCodeElement.class;
    case COMMENTUNIT_CLASSIFIER_ID:
      return CommentUnit.class;
    case ABSTRACTCODERELATIONSHIP_CLASSIFIER_ID:
      return AbstractCodeRelationship.class;
    case CODEITEM_CLASSIFIER_ID:
      return CodeItem.class;
    case COMPUTATIONALOBJECT_CLASSIFIER_ID:
      return ComputationalObject.class;
    case DATATYPE_CLASSIFIER_ID:
      return Datatype.class;
    case MODULE_CLASSIFIER_ID:
      return Module.class;
    case COMPILATIONUNIT_CLASSIFIER_ID:
      return CompilationUnit.class;
    case SHAREDUNIT_CLASSIFIER_ID:
      return SharedUnit.class;
    case LANGUAGEUNIT_CLASSIFIER_ID:
      return LanguageUnit.class;
    case CODEASSEMBLY_CLASSIFIER_ID:
      return CodeAssembly.class;
    case PACKAGE_CLASSIFIER_ID:
      return Package.class;
    case CONTROLELEMENT_CLASSIFIER_ID:
      return ControlElement.class;
    case CALLABLEUNIT_CLASSIFIER_ID:
      return CallableUnit.class;
    case METHODUNIT_CLASSIFIER_ID:
      return MethodUnit.class;
    case DATAELEMENT_CLASSIFIER_ID:
      return DataElement.class;
    case STORABLEUNIT_CLASSIFIER_ID:
      return StorableUnit.class;
    case ITEMUNIT_CLASSIFIER_ID:
      return ItemUnit.class;
    case INDEXUNIT_CLASSIFIER_ID:
      return IndexUnit.class;
    case MEMBERUNIT_CLASSIFIER_ID:
      return MemberUnit.class;
    case PARAMETERUNIT_CLASSIFIER_ID:
      return ParameterUnit.class;
    case VALUEELEMENT_CLASSIFIER_ID:
      return ValueElement.class;
    case VALUE_CLASSIFIER_ID:
      return Value.class;
    case VALUELIST_CLASSIFIER_ID:
      return ValueList.class;
    case PRIMITIVETYPE_CLASSIFIER_ID:
      return PrimitiveType.class;
    case BOOLEANTYPE_CLASSIFIER_ID:
      return BooleanType.class;
    case CHARTYPE_CLASSIFIER_ID:
      return CharType.class;
    case ORDINALTYPE_CLASSIFIER_ID:
      return OrdinalType.class;
    case DATETYPE_CLASSIFIER_ID:
      return DateType.class;
    case TIMETYPE_CLASSIFIER_ID:
      return TimeType.class;
    case INTEGERTYPE_CLASSIFIER_ID:
      return IntegerType.class;
    case DECIMALTYPE_CLASSIFIER_ID:
      return DecimalType.class;
    case SCALEDTYPE_CLASSIFIER_ID:
      return ScaledType.class;
    case FLOATTYPE_CLASSIFIER_ID:
      return FloatType.class;
    case VOIDTYPE_CLASSIFIER_ID:
      return VoidType.class;
    case STRINGTYPE_CLASSIFIER_ID:
      return StringType.class;
    case BITTYPE_CLASSIFIER_ID:
      return BitType.class;
    case BITSTRINGTYPE_CLASSIFIER_ID:
      return BitstringType.class;
    case OCTETTYPE_CLASSIFIER_ID:
      return OctetType.class;
    case OCTETSTRINGTYPE_CLASSIFIER_ID:
      return OctetstringType.class;
    case ENUMERATEDTYPE_CLASSIFIER_ID:
      return EnumeratedType.class;
    case COMPOSITETYPE_CLASSIFIER_ID:
      return CompositeType.class;
    case CHOICETYPE_CLASSIFIER_ID:
      return ChoiceType.class;
    case RECORDTYPE_CLASSIFIER_ID:
      return RecordType.class;
    case DERIVEDTYPE_CLASSIFIER_ID:
      return DerivedType.class;
    case ARRAYTYPE_CLASSIFIER_ID:
      return ArrayType.class;
    case POINTERTYPE_CLASSIFIER_ID:
      return PointerType.class;
    case RANGETYPE_CLASSIFIER_ID:
      return RangeType.class;
    case BAGTYPE_CLASSIFIER_ID:
      return BagType.class;
    case SETTYPE_CLASSIFIER_ID:
      return SetType.class;
    case SEQUENCETYPE_CLASSIFIER_ID:
      return SequenceType.class;
    case SIGNATURE_CLASSIFIER_ID:
      return Signature.class;
    case DEFINEDTYPE_CLASSIFIER_ID:
      return DefinedType.class;
    case TYPEUNIT_CLASSIFIER_ID:
      return TypeUnit.class;
    case SYNONYMUNIT_CLASSIFIER_ID:
      return SynonymUnit.class;
    case CLASSUNIT_CLASSIFIER_ID:
      return ClassUnit.class;
    case INTERFACEUNIT_CLASSIFIER_ID:
      return InterfaceUnit.class;
    case TEMPLATEUNIT_CLASSIFIER_ID:
      return TemplateUnit.class;
    case TEMPLATEPARAMETER_CLASSIFIER_ID:
      return TemplateParameter.class;
    case TEMPLATETYPE_CLASSIFIER_ID:
      return TemplateType.class;
    case INSTANCEOF_CLASSIFIER_ID:
      return InstanceOf.class;
    case PARAMETERTO_CLASSIFIER_ID:
      return ParameterTo.class;
    case IMPLEMENTS_CLASSIFIER_ID:
      return Implements.class;
    case IMPLEMENTATIONOF_CLASSIFIER_ID:
      return ImplementationOf.class;
    case HASTYPE_CLASSIFIER_ID:
      return HasType.class;
    case HASVALUE_CLASSIFIER_ID:
      return HasValue.class;
    case EXTENDS_CLASSIFIER_ID:
      return Extends.class;
    case PREPROCESSORDIRECTIVE_CLASSIFIER_ID:
      return PreprocessorDirective.class;
    case MACROUNIT_CLASSIFIER_ID:
      return MacroUnit.class;
    case MACRODIRECTIVE_CLASSIFIER_ID:
      return MacroDirective.class;
    case INCLUDEDIRECTIVE_CLASSIFIER_ID:
      return IncludeDirective.class;
    case CONDITIONALDIRECTIVE_CLASSIFIER_ID:
      return ConditionalDirective.class;
    case EXPANDS_CLASSIFIER_ID:
      return Expands.class;
    case GENERATEDFROM_CLASSIFIER_ID:
      return GeneratedFrom.class;
    case INCLUDES_CLASSIFIER_ID:
      return Includes.class;
    case VARIANTTO_CLASSIFIER_ID:
      return VariantTo.class;
    case REDEFINES_CLASSIFIER_ID:
      return Redefines.class;
    case NAMESPACE_CLASSIFIER_ID:
      return Namespace.class;
    case VISIBLEIN_CLASSIFIER_ID:
      return VisibleIn.class;
    case IMPORTS_CLASSIFIER_ID:
      return Imports.class;
    case CODEELEMENT_CLASSIFIER_ID:
      return CodeElement.class;
    case CODERELATIONSHIP_CLASSIFIER_ID:
      return CodeRelationship.class;
    case CALLABLEKIND_CLASSIFIER_ID:
      return CallableKind.class;
    case METHODKIND_CLASSIFIER_ID:
      return MethodKind.class;
    case EXPORTKIND_CLASSIFIER_ID:
      return ExportKind.class;
    case STORABLEKIND_CLASSIFIER_ID:
      return StorableKind.class;
    case PARAMETERKIND_CLASSIFIER_ID:
      return ParameterKind.class;
    case MACROKIND_CLASSIFIER_ID:
      return MacroKind.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
