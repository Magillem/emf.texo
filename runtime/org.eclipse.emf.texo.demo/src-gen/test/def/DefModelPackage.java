package test.def;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.utils.ModelUtils;
import test.abc.AbcModelPackage;
import test.def.dao.T1Dao;
import test.def.dao.T2Dao;

/**
 * The <b>Package</b> for the model '<em><b>def</b></em>'. It contains
 * initialization code and access to the Factory to instantiate types of this
 * package.
 *
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DefModelPackage extends ModelPackage {

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
	public static final String NS_URI = "test.def";

	/**
	 * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final DefModelFactory MODELFACTORY = new DefModelFactory();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int T1_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int T1_NAME_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int T2_CLASSIFIER_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int T2_NAME_FEATURE_ID = 0;

	/**
	 * The static member with the instance of this {@link ModelPackage}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final DefModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return an initialized instance of this class
	 *
	 * @generated
	 */
	public static DefModelPackage initialize() {

		if (isInitialized) {
			return (DefModelPackage) ModelResolver.getInstance()
					.getModelPackage(NS_URI);
		}

		final DefModelPackage modelPackage = new DefModelPackage();

		ModelResolver.getInstance().registerModelPackage(modelPackage);

		// read the model from the ecore file, the EPackage is registered in the
		// EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		ModelUtils.readEPackagesFromFile(modelPackage);

		isInitialized = true;

		AbcModelPackage.initialize();

		// force the initialization of the EFactory proxy
		modelPackage.getEPackage();

		// register the relation between a Class and its EClassifier
		ModelResolver.getInstance().registerClassModelMapping(T1.class,
				modelPackage.getT1EClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(T2.class,
				modelPackage.getT2EClass(), modelPackage);

		DaoRegistry.getInstance().registerDao(T1.class, T1Dao.class);
		DaoRegistry.getInstance().registerDao(T2.class, T2Dao.class);

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link ModelFactory} of this ModelPackage. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the {@link DefModelFactory} instance.
	 * @generated
	 */
	@Override
	public DefModelFactory getModelFactory() {
		return MODELFACTORY;
	}

	/**
	 * Returns the nsUri of the {@link EPackage} managed by this Package
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the nsUri of the EPackage
	 * @generated
	 */
	@Override
	public String getNsURI() {
		return NS_URI;
	}

	/**
	 * Returns the name of the ecore file containing the ecore model of the
	 * {@link EPackage} managed here. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the name of the ecore file
	 * @generated
	 */
	@Override
	public String getEcoreFileName() {
		return "def.ecore";
	}

	/**
	 * Returns the {@link EClass} '<em><b>T1</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>T1</b></em>'
	 * @generated
	 */
	public EClass getT1EClass() {
		return (EClass) getEPackage().getEClassifiers().get(T1_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>T2</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>T2</b></em>'
	 * @generated
	 */
	public EClass getT2EClass() {
		return (EClass) getEPackage().getEClassifiers().get(T2_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>T2.name</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>T2.name</b></em>'.
	 * @generated
	 */
	public EAttribute getT2_Name() {
		return (EAttribute) getT2EClass().getEAllStructuralFeatures().get(
				T2_NAME_FEATURE_ID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eClassifier
	 *            the {@link EClassifier}
	 * @return the class implementing a specific {@link EClass}.
	 * @generated
	 */
	@Override
	public Class<?> getEClassifierClass(EClassifier eClassifier) {
		switch (eClassifier.getClassifierID()) {
		case T1_CLASSIFIER_ID:
			return T1.class;
		case T2_CLASSIFIER_ID:
			return T2.class;
		default:
			throw new IllegalArgumentException("The EClassifier '"
					+ eClassifier + "' is not defined in this EPackage");
		}
	}
}
