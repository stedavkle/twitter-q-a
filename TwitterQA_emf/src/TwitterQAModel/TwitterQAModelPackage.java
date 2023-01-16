/**
 */
package TwitterQAModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see TwitterQAModel.TwitterQAModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface TwitterQAModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TwitterQAModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "/TwitterQA_emf/model/TwitterQA.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TwitterQA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TwitterQAModelPackage eINSTANCE = TwitterQAModel.impl.TwitterQAModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link TwitterQAModel.impl.TwitterQAImpl <em>Twitter QA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TwitterQAModel.impl.TwitterQAImpl
	 * @see TwitterQAModel.impl.TwitterQAModelPackageImpl#getTwitterQA()
	 * @generated
	 */
	int TWITTER_QA = 0;

	/**
	 * The feature id for the '<em><b>Consumer key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_QA__CONSUMER_KEY = 0;

	/**
	 * The feature id for the '<em><b>Consumer secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_QA__CONSUMER_SECRET = 1;

	/**
	 * The feature id for the '<em><b>Access token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_QA__ACCESS_TOKEN = 2;

	/**
	 * The feature id for the '<em><b>Access token secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_QA__ACCESS_TOKEN_SECRET = 3;

	/**
	 * The feature id for the '<em><b>Games</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_QA__GAMES = 4;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_QA__LOCATIONS = 5;

	/**
	 * The feature id for the '<em><b>Welcome msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_QA__WELCOME_MSG = 6;

	/**
	 * The number of structural features of the '<em>Twitter QA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_QA_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Twitter QA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_QA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TwitterQAModel.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TwitterQAModel.impl.GameImpl
	 * @see TwitterQAModel.impl.TwitterQAModelPackageImpl#getGame()
	 * @generated
	 */
	int GAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Initial test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__INITIAL_TEST = 2;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__TESTS = 3;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__CITY = 4;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>No order twice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___NO_ORDER_TWICE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>No jump back correct</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___NO_JUMP_BACK_CORRECT__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Initial order zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___INITIAL_ORDER_ZERO__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>No jump back timeout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___NO_JUMP_BACK_TIMEOUT__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>No jump back fail</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___NO_JUMP_BACK_FAIL__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>Initial on correct notnull</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___INITIAL_ON_CORRECT_NOTNULL__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link TwitterQAModel.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TwitterQAModel.impl.TestImpl
	 * @see TwitterQAModel.impl.TwitterQAModelPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__QUESTION = 2;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ANSWERS = 3;

	/**
	 * The feature id for the '<em><b>Hints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__HINTS = 4;

	/**
	 * The feature id for the '<em><b>Timelimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__TIMELIMIT = 5;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ATTEMPTS = 6;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__REWARD = 7;

	/**
	 * The feature id for the '<em><b>On correct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ON_CORRECT = 8;

	/**
	 * The feature id for the '<em><b>On timeout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ON_TIMEOUT = 9;

	/**
	 * The feature id for the '<em><b>On fail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ON_FAIL = 10;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ORDER = 11;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 12;

	/**
	 * The operation id for the '<em>Attempts positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST___ATTEMPTS_POSITIVE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Order positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST___ORDER_POSITIVE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Time positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST___TIME_POSITIVE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Reward positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST___REWARD_POSITIVE__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link TwitterQAModel.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TwitterQAModel.impl.LocationImpl
	 * @see TwitterQAModel.impl.TwitterQAModelPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LATITUDE = 1;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LONGITUDE = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link TwitterQAModel.TwitterQA <em>Twitter QA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter QA</em>'.
	 * @see TwitterQAModel.TwitterQA
	 * @generated
	 */
	EClass getTwitterQA();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.TwitterQA#getConsumer_key <em>Consumer key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer key</em>'.
	 * @see TwitterQAModel.TwitterQA#getConsumer_key()
	 * @see #getTwitterQA()
	 * @generated
	 */
	EAttribute getTwitterQA_Consumer_key();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.TwitterQA#getConsumer_secret <em>Consumer secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer secret</em>'.
	 * @see TwitterQAModel.TwitterQA#getConsumer_secret()
	 * @see #getTwitterQA()
	 * @generated
	 */
	EAttribute getTwitterQA_Consumer_secret();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.TwitterQA#getAccess_token <em>Access token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access token</em>'.
	 * @see TwitterQAModel.TwitterQA#getAccess_token()
	 * @see #getTwitterQA()
	 * @generated
	 */
	EAttribute getTwitterQA_Access_token();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.TwitterQA#getAccess_token_secret <em>Access token secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access token secret</em>'.
	 * @see TwitterQAModel.TwitterQA#getAccess_token_secret()
	 * @see #getTwitterQA()
	 * @generated
	 */
	EAttribute getTwitterQA_Access_token_secret();

	/**
	 * Returns the meta object for the containment reference list '{@link TwitterQAModel.TwitterQA#getGames <em>Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Games</em>'.
	 * @see TwitterQAModel.TwitterQA#getGames()
	 * @see #getTwitterQA()
	 * @generated
	 */
	EReference getTwitterQA_Games();

	/**
	 * Returns the meta object for the containment reference list '{@link TwitterQAModel.TwitterQA#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see TwitterQAModel.TwitterQA#getLocations()
	 * @see #getTwitterQA()
	 * @generated
	 */
	EReference getTwitterQA_Locations();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.TwitterQA#getWelcome_msg <em>Welcome msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Welcome msg</em>'.
	 * @see TwitterQAModel.TwitterQA#getWelcome_msg()
	 * @see #getTwitterQA()
	 * @generated
	 */
	EAttribute getTwitterQA_Welcome_msg();

	/**
	 * Returns the meta object for class '{@link TwitterQAModel.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see TwitterQAModel.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Game#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TwitterQAModel.Game#getName()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Name();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Game#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see TwitterQAModel.Game#getDescription()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Description();

	/**
	 * Returns the meta object for the containment reference '{@link TwitterQAModel.Game#getInitial_test <em>Initial test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial test</em>'.
	 * @see TwitterQAModel.Game#getInitial_test()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Initial_test();

	/**
	 * Returns the meta object for the containment reference list '{@link TwitterQAModel.Game#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see TwitterQAModel.Game#getTests()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Tests();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Game#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see TwitterQAModel.Game#getCity()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_City();

	/**
	 * Returns the meta object for the '{@link TwitterQAModel.Game#no_order_twice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No order twice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No order twice</em>' operation.
	 * @see TwitterQAModel.Game#no_order_twice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGame__No_order_twice__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link TwitterQAModel.Game#no_jump_back_correct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No jump back correct</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No jump back correct</em>' operation.
	 * @see TwitterQAModel.Game#no_jump_back_correct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGame__No_jump_back_correct__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link TwitterQAModel.Game#initial_order_zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Initial order zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initial order zero</em>' operation.
	 * @see TwitterQAModel.Game#initial_order_zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGame__Initial_order_zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link TwitterQAModel.Game#no_jump_back_timeout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No jump back timeout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No jump back timeout</em>' operation.
	 * @see TwitterQAModel.Game#no_jump_back_timeout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGame__No_jump_back_timeout__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link TwitterQAModel.Game#no_jump_back_fail(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No jump back fail</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No jump back fail</em>' operation.
	 * @see TwitterQAModel.Game#no_jump_back_fail(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGame__No_jump_back_fail__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link TwitterQAModel.Game#initial_on_correct_notnull(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Initial on correct notnull</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initial on correct notnull</em>' operation.
	 * @see TwitterQAModel.Game#initial_on_correct_notnull(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGame__Initial_on_correct_notnull__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link TwitterQAModel.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see TwitterQAModel.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Test#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TwitterQAModel.Test#getName()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Name();

	/**
	 * Returns the meta object for the reference '{@link TwitterQAModel.Test#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see TwitterQAModel.Test#getLocation()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Location();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Test#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see TwitterQAModel.Test#getQuestion()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Question();

	/**
	 * Returns the meta object for the attribute list '{@link TwitterQAModel.Test#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Answers</em>'.
	 * @see TwitterQAModel.Test#getAnswers()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Answers();

	/**
	 * Returns the meta object for the attribute list '{@link TwitterQAModel.Test#getHints <em>Hints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Hints</em>'.
	 * @see TwitterQAModel.Test#getHints()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Hints();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Test#getTimelimit <em>Timelimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timelimit</em>'.
	 * @see TwitterQAModel.Test#getTimelimit()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Timelimit();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Test#getAttempts <em>Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attempts</em>'.
	 * @see TwitterQAModel.Test#getAttempts()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Attempts();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Test#getReward <em>Reward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reward</em>'.
	 * @see TwitterQAModel.Test#getReward()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Reward();

	/**
	 * Returns the meta object for the reference '{@link TwitterQAModel.Test#getOn_correct <em>On correct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On correct</em>'.
	 * @see TwitterQAModel.Test#getOn_correct()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_On_correct();

	/**
	 * Returns the meta object for the reference '{@link TwitterQAModel.Test#getOn_timeout <em>On timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On timeout</em>'.
	 * @see TwitterQAModel.Test#getOn_timeout()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_On_timeout();

	/**
	 * Returns the meta object for the reference '{@link TwitterQAModel.Test#getOn_fail <em>On fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On fail</em>'.
	 * @see TwitterQAModel.Test#getOn_fail()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_On_fail();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Test#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see TwitterQAModel.Test#getOrder()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Order();

	/**
	 * Returns the meta object for the '{@link TwitterQAModel.Test#reward_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Reward positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reward positive</em>' operation.
	 * @see TwitterQAModel.Test#reward_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTest__Reward_positive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link TwitterQAModel.Test#time_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Time positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Time positive</em>' operation.
	 * @see TwitterQAModel.Test#time_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTest__Time_positive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link TwitterQAModel.Test#attempts_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Attempts positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attempts positive</em>' operation.
	 * @see TwitterQAModel.Test#attempts_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTest__Attempts_positive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link TwitterQAModel.Test#order_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Order positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Order positive</em>' operation.
	 * @see TwitterQAModel.Test#order_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTest__Order_positive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link TwitterQAModel.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see TwitterQAModel.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Location#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TwitterQAModel.Location#getName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Name();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Location#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see TwitterQAModel.Location#getLatitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Location#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see TwitterQAModel.Location#getLongitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Longitude();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TwitterQAModelFactory getTwitterQAModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link TwitterQAModel.impl.TwitterQAImpl <em>Twitter QA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TwitterQAModel.impl.TwitterQAImpl
		 * @see TwitterQAModel.impl.TwitterQAModelPackageImpl#getTwitterQA()
		 * @generated
		 */
		EClass TWITTER_QA = eINSTANCE.getTwitterQA();

		/**
		 * The meta object literal for the '<em><b>Consumer key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_QA__CONSUMER_KEY = eINSTANCE.getTwitterQA_Consumer_key();

		/**
		 * The meta object literal for the '<em><b>Consumer secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_QA__CONSUMER_SECRET = eINSTANCE.getTwitterQA_Consumer_secret();

		/**
		 * The meta object literal for the '<em><b>Access token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_QA__ACCESS_TOKEN = eINSTANCE.getTwitterQA_Access_token();

		/**
		 * The meta object literal for the '<em><b>Access token secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_QA__ACCESS_TOKEN_SECRET = eINSTANCE.getTwitterQA_Access_token_secret();

		/**
		 * The meta object literal for the '<em><b>Games</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWITTER_QA__GAMES = eINSTANCE.getTwitterQA_Games();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWITTER_QA__LOCATIONS = eINSTANCE.getTwitterQA_Locations();

		/**
		 * The meta object literal for the '<em><b>Welcome msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_QA__WELCOME_MSG = eINSTANCE.getTwitterQA_Welcome_msg();

		/**
		 * The meta object literal for the '{@link TwitterQAModel.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TwitterQAModel.impl.GameImpl
		 * @see TwitterQAModel.impl.TwitterQAModelPackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__NAME = eINSTANCE.getGame_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__DESCRIPTION = eINSTANCE.getGame_Description();

		/**
		 * The meta object literal for the '<em><b>Initial test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__INITIAL_TEST = eINSTANCE.getGame_Initial_test();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__TESTS = eINSTANCE.getGame_Tests();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__CITY = eINSTANCE.getGame_City();

		/**
		 * The meta object literal for the '<em><b>No order twice</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___NO_ORDER_TWICE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getGame__No_order_twice__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No jump back correct</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___NO_JUMP_BACK_CORRECT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getGame__No_jump_back_correct__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Initial order zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___INITIAL_ORDER_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getGame__Initial_order_zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No jump back timeout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___NO_JUMP_BACK_TIMEOUT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getGame__No_jump_back_timeout__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No jump back fail</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___NO_JUMP_BACK_FAIL__DIAGNOSTICCHAIN_MAP = eINSTANCE.getGame__No_jump_back_fail__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Initial on correct notnull</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___INITIAL_ON_CORRECT_NOTNULL__DIAGNOSTICCHAIN_MAP = eINSTANCE.getGame__Initial_on_correct_notnull__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link TwitterQAModel.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TwitterQAModel.impl.TestImpl
		 * @see TwitterQAModel.impl.TwitterQAModelPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__NAME = eINSTANCE.getTest_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__LOCATION = eINSTANCE.getTest_Location();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__QUESTION = eINSTANCE.getTest_Question();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__ANSWERS = eINSTANCE.getTest_Answers();

		/**
		 * The meta object literal for the '<em><b>Hints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__HINTS = eINSTANCE.getTest_Hints();

		/**
		 * The meta object literal for the '<em><b>Timelimit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__TIMELIMIT = eINSTANCE.getTest_Timelimit();

		/**
		 * The meta object literal for the '<em><b>Attempts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__ATTEMPTS = eINSTANCE.getTest_Attempts();

		/**
		 * The meta object literal for the '<em><b>Reward</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__REWARD = eINSTANCE.getTest_Reward();

		/**
		 * The meta object literal for the '<em><b>On correct</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__ON_CORRECT = eINSTANCE.getTest_On_correct();

		/**
		 * The meta object literal for the '<em><b>On timeout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__ON_TIMEOUT = eINSTANCE.getTest_On_timeout();

		/**
		 * The meta object literal for the '<em><b>On fail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__ON_FAIL = eINSTANCE.getTest_On_fail();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__ORDER = eINSTANCE.getTest_Order();

		/**
		 * The meta object literal for the '<em><b>Reward positive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEST___REWARD_POSITIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTest__Reward_positive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Time positive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEST___TIME_POSITIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTest__Time_positive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Attempts positive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEST___ATTEMPTS_POSITIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTest__Attempts_positive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Order positive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEST___ORDER_POSITIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTest__Order_positive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link TwitterQAModel.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TwitterQAModel.impl.LocationImpl
		 * @see TwitterQAModel.impl.TwitterQAModelPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LATITUDE = eINSTANCE.getLocation_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LONGITUDE = eINSTANCE.getLocation_Longitude();

	}

} //TwitterQAModelPackage
