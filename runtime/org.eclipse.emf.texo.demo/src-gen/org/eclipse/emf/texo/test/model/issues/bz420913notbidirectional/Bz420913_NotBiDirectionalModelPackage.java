package org.eclipse.emf.texo.test.model.issues.bz420913notbidirectional;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>bz420913_NotBiDirectional</b></em>'.
 * It contains initialization code and access to the Factory to instantiate
 * types of this package.
 *
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Bz420913_NotBiDirectionalModelPackage extends ModelPackage {

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
	public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/bz420913_NotBiDirectional";

	/**
	 * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final Bz420913_NotBiDirectionalModelFactory MODELFACTORY = new Bz420913_NotBiDirectionalModelFactory();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int BZ420913_NOTBIDIRECTIONAL_O_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int BZ420913_NOTBIDIRECTIONAL_O_SINGLEBIDIRECTIONAL_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int BZ420913_NOTBIDIRECTIONAL_O_MULTIBIDIRECTIONAL_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int BZ420913_NOTBIDIRECTIONAL_T_CLASSIFIER_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int BZ420913_NOTBIDIRECTIONAL_T_SINGLEBIDIRECTIONAL_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int BZ420913_NOTBIDIRECTIONAL_T_MULTIBIDIRECTIONAL_FEATURE_ID = 1;

	/**
	 * The static member with the instance of this {@link ModelPackage}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final Bz420913_NotBiDirectionalModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return an initialized instance of this class
	 *
	 * @generated
	 */
	public static Bz420913_NotBiDirectionalModelPackage initialize() {

		if (isInitialized) {
			return (Bz420913_NotBiDirectionalModelPackage) ModelResolver
					.getInstance().getModelPackage(NS_URI);
		}

		final Bz420913_NotBiDirectionalModelPackage modelPackage = new Bz420913_NotBiDirectionalModelPackage();

		ModelResolver.getInstance().registerModelPackage(modelPackage);

		// read the model from the ecore file, the EPackage is registered in the
		// EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		ModelUtils.readEPackagesFromFile(modelPackage);

		isInitialized = true;

		// force the initialization of the EFactory proxy
		modelPackage.getEPackage();

		// register the relation between a Class and its EClassifier
		ModelResolver.getInstance().registerClassModelMapping(
				Bz420913_NotBiDirectional_O.class,
				modelPackage.getBz420913_NotBiDirectional_OEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				Bz420913_NotBiDirectional_T.class,
				modelPackage.getBz420913_NotBiDirectional_TEClass(),
				modelPackage);

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link ModelFactory} of this ModelPackage. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the {@link Bz420913_NotBiDirectionalModelFactory} instance.
	 * @generated
	 */
	@Override
	public Bz420913_NotBiDirectionalModelFactory getModelFactory() {
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
		return "bz420913_NotBiDirectional.ecore";
	}

	/**
	 * Returns the {@link EClass} '<em><b>bz420913_NotBiDirectional_O</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>bz420913_NotBiDirectional_O</b></em>'
	 * @generated
	 */
	public EClass getBz420913_NotBiDirectional_OEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				BZ420913_NOTBIDIRECTIONAL_O_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>bz420913_NotBiDirectional_O.singleBidirectional</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>bz420913_NotBiDirectional_O.singleBidirectional</b></em>'.
	 * @generated
	 */
	public EReference getBz420913_NotBiDirectional_O_SingleBidirectional() {
		return (EReference) getBz420913_NotBiDirectional_OEClass()
				.getEAllStructuralFeatures()
				.get(BZ420913_NOTBIDIRECTIONAL_O_SINGLEBIDIRECTIONAL_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>bz420913_NotBiDirectional_O.multiBidirectional</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>bz420913_NotBiDirectional_O.multiBidirectional</b></em>'.
	 * @generated
	 */
	public EReference getBz420913_NotBiDirectional_O_MultiBidirectional() {
		return (EReference) getBz420913_NotBiDirectional_OEClass()
				.getEAllStructuralFeatures()
				.get(BZ420913_NOTBIDIRECTIONAL_O_MULTIBIDIRECTIONAL_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>bz420913_NotBiDirectional_T</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>bz420913_NotBiDirectional_T</b></em>'
	 * @generated
	 */
	public EClass getBz420913_NotBiDirectional_TEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				BZ420913_NOTBIDIRECTIONAL_T_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>bz420913_NotBiDirectional_T.singleBidirectional</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>bz420913_NotBiDirectional_T.singleBidirectional</b></em>'.
	 * @generated
	 */
	public EReference getBz420913_NotBiDirectional_T_SingleBidirectional() {
		return (EReference) getBz420913_NotBiDirectional_TEClass()
				.getEAllStructuralFeatures()
				.get(BZ420913_NOTBIDIRECTIONAL_T_SINGLEBIDIRECTIONAL_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>bz420913_NotBiDirectional_T.multiBidirectional</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>bz420913_NotBiDirectional_T.multiBidirectional</b></em>'.
	 * @generated
	 */
	public EReference getBz420913_NotBiDirectional_T_MultiBidirectional() {
		return (EReference) getBz420913_NotBiDirectional_TEClass()
				.getEAllStructuralFeatures()
				.get(BZ420913_NOTBIDIRECTIONAL_T_MULTIBIDIRECTIONAL_FEATURE_ID);
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
		case BZ420913_NOTBIDIRECTIONAL_O_CLASSIFIER_ID:
			return Bz420913_NotBiDirectional_O.class;
		case BZ420913_NOTBIDIRECTIONAL_T_CLASSIFIER_ID:
			return Bz420913_NotBiDirectional_T.class;
		default:
			throw new IllegalArgumentException("The EClassifier '"
					+ eClassifier + "' is not defined in this EPackage");
		}
	}
}
