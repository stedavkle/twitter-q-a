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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No order twice' of 'Game'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GAME__NO_ORDER_TWICE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No jump back correct' of 'Game'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GAME__NO_JUMP_BACK_CORRECT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Initial order zero' of 'Game'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GAME__INITIAL_ORDER_ZERO = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No jump back timeout' of 'Game'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GAME__NO_JUMP_BACK_TIMEOUT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No jump back fail' of 'Game'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GAME__NO_JUMP_BACK_FAIL = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Initial on correct notnull' of 'Game'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GAME__INITIAL_ON_CORRECT_NOTNULL = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Reward positive' of 'Test'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEST__REWARD_POSITIVE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Time positive' of 'Test'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEST__TIME_POSITIVE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Attempts positive' of 'Test'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEST__ATTEMPTS_POSITIVE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Order positive' of 'Test'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEST__ORDER_POSITIVE = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 10;

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
				return validateTwitterQA((TwitterQA)value, diagnostics, context);
			case TwitterQAModelPackage.GAME:
				return validateGame((Game)value, diagnostics, context);
			case TwitterQAModelPackage.TEST:
				return validateTest((Test)value, diagnostics, context);
			case TwitterQAModelPackage.LOCATION:
				return validateLocation((Location)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTwitterQA(TwitterQA twitterQA, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(twitterQA, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateGame_initial_on_correct_notnull(game, diagnostics, context);
		if (result || diagnostics != null) result &= validateGame_no_order_twice(game, diagnostics, context);
		if (result || diagnostics != null) result &= validateGame_no_jump_back_correct(game, diagnostics, context);
		if (result || diagnostics != null) result &= validateGame_initial_order_zero(game, diagnostics, context);
		if (result || diagnostics != null) result &= validateGame_no_jump_back_timeout(game, diagnostics, context);
		if (result || diagnostics != null) result &= validateGame_no_jump_back_fail(game, diagnostics, context);
		return result;
	}

	/**
	 * Validates the initial_on_correct_notnull constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame_initial_on_correct_notnull(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return game.initial_on_correct_notnull(diagnostics, context);
	}

	/**
	 * Validates the no_jump_back_fail constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame_no_jump_back_fail(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return game.no_jump_back_fail(diagnostics, context);
	}

	/**
	 * Validates the no_order_twice constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame_no_order_twice(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return game.no_order_twice(diagnostics, context);
	}

	/**
	 * Validates the no_jump_back_correct constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame_no_jump_back_correct(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return game.no_jump_back_correct(diagnostics, context);
	}

	/**
	 * Validates the initial_order_zero constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame_initial_order_zero(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return game.initial_order_zero(diagnostics, context);
	}

	/**
	 * Validates the no_jump_back_timeout constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame_no_jump_back_timeout(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return game.no_jump_back_timeout(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateTest_reward_positive(test, diagnostics, context);
		if (result || diagnostics != null) result &= validateTest_attempts_positive(test, diagnostics, context);
		if (result || diagnostics != null) result &= validateTest_order_positive(test, diagnostics, context);
		if (result || diagnostics != null) result &= validateTest_time_positive(test, diagnostics, context);
		return result;
	}

	/**
	 * Validates the attempts_positive constraint of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTest_attempts_positive(Test test, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return test.attempts_positive(diagnostics, context);
	}

	/**
	 * Validates the order_positive constraint of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTest_order_positive(Test test, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return test.order_positive(diagnostics, context);
	}

	/**
	 * Validates the reward_positive constraint of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTest_reward_positive(Test test, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return test.reward_positive(diagnostics, context);
	}

	/**
	 * Validates the time_positive constraint of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTest_time_positive(Test test, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return test.time_positive(diagnostics, context);
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
