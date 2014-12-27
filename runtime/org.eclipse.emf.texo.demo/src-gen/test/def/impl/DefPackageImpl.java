/**
 */
package test.def.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import test.abc.AbcPackage;

import test.def.DefFactory;
import test.def.DefPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DefPackageImpl extends EPackageImpl implements DefPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t1EClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see test.def.DefPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DefPackageImpl() {
		super(eNS_URI, DefFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DefPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DefPackage init() {
		if (isInited) return (DefPackage)EPackage.Registry.INSTANCE.getEPackage(DefPackage.eNS_URI);

		// Obtain or create and register package
		DefPackageImpl theDefPackage = (DefPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DefPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DefPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AbcPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDefPackage.createPackageContents();

		// Initialize created meta-data
		theDefPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDefPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DefPackage.eNS_URI, theDefPackage);
		return theDefPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT1() {
		return t1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefFactory getDefFactory() {
		return (DefFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		t1EClass = createEClass(T1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AbcPackage theAbcPackage = (AbcPackage)EPackage.Registry.INSTANCE.getEPackage(AbcPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		t1EClass.getESuperTypes().add(theAbcPackage.getTest());

		// Initialize classes, features, and operations; add parameters
		initEClass(t1EClass, test.def.T1.class, "T1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DefPackageImpl
