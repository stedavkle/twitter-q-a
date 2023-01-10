/**
 */
package TwitterQAModel.util;

import TwitterQAModel.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see TwitterQAModel.TwitterQAModelPackage
 * @generated
 */
public class TwitterQAModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TwitterQAModelValidator INSTANCE = new TwitterQAModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "TwitterQAModel";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Initial test' of 'Game'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GAME__INITIAL_TEST = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Final test' of 'Game'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GAME__FINAL_TEST = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Initial test' of 'Test'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEST__INITIAL_TEST = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterQAModelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TwitterQAModelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TwitterQAModelPackage.TWITTER_QA:
				return validateTwitter_QA((Twitter_QA)value, diagnostics, context);
			case TwitterQAModelPackage.GAME:
				return validateGame((Game)value, diagnostics, context);
			case TwitterQAModelPackage.PLAYER:
				return validatePlayer((Player)value, diagnostics, context);
			case TwitterQAModelPackage.LOCATION:
				return validateLocation((Location)value, diagnostics, context);
			case TwitterQAModelPackage.TEST:
				return validateTest((Test)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTwitter_QA(Twitter_QA twitter_QA, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(twitter_QA, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(game, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(game, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(game, diagnostics, context);
		if (result || diagnostics != null) result &= validateGame_final_test(game, diagnostics, context);
		if (result || diagnostics != null) result &= validateGame_initial_test(game, diagnostics, context);
		return result;
	}

	/**
	 * Validates the final_test constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame_final_test(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return game.final_test(diagnostics, context);
	}

	/**
	 * Validates the initial_test constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame_initial_test(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return game.initial_test(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayer(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(player, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(location, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTest(Test test, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(test, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(test, diagnostics, context);
		if (result || diagnostics != null) result &= validateTest_initial_test(test, diagnostics, context);
		return result;
	}

	/**
	 * Validates the initial_test constraint of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTest_initial_test(Test test, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return test.initial_test(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TwitterQAModelValidator
