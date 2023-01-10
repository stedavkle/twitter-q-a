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
	String eNS_URI = "TwitterQA/model/TwitterQA.ecore";

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
	 * The meta object id for the '{@link TwitterQAModel.impl.Twitter_QAImpl <em>Twitter QA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TwitterQAModel.impl.Twitter_QAImpl
	 * @see TwitterQAModel.impl.TwitterQAModelPackageImpl#getTwitter_QA()
	 * @generated
	 */
	int TWITTER_QA = 0;

	/**
	 * The feature id for the '<em><b>Games</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_QA__GAMES = 0;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_QA__PLAYERS = 1;

	/**
	 * The number of structural features of the '<em>Twitter QA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_QA_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Welcome msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__WELCOME_MSG = 0;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__PLAYERS = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__CITY = 2;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__TESTS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__ID = 4;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Initial test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___INITIAL_TEST__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Final test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___FINAL_TEST__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link TwitterQAModel.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TwitterQAModel.impl.PlayerImpl
	 * @see TwitterQAModel.impl.TwitterQAModelPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__ID = 0;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__POINTS = 1;

	/**
	 * The feature id for the '<em><b>Current test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__CURRENT_TEST = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = 3;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Langitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LANGITUDE = 1;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LATITUDE = 2;

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
	 * The meta object id for the '{@link TwitterQAModel.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TwitterQAModel.impl.TestImpl
	 * @see TwitterQAModel.impl.TwitterQAModelPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ID = 0;

	/**
	 * The feature id for the '<em><b>Tlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__TLIMIT = 1;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__QUESTION = 2;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ATTEMPTS = 3;

	/**
	 * The feature id for the '<em><b>Hints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__HINTS = 4;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__POINTS = 5;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ANSWERS = 6;

	/**
	 * The feature id for the '<em><b>On correct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ON_CORRECT = 7;

	/**
	 * The feature id for the '<em><b>On fail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ON_FAIL = 8;

	/**
	 * The feature id for the '<em><b>On timeout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ON_TIMEOUT = 9;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__LOCATION = 10;

	/**
	 * The feature id for the '<em><b>Is initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__IS_INITIAL = 11;

	/**
	 * The feature id for the '<em><b>Is final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__IS_FINAL = 12;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 13;

	/**
	 * The operation id for the '<em>Initial test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST___INITIAL_TEST__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link TwitterQAModel.Twitter_QA <em>Twitter QA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter QA</em>'.
	 * @see TwitterQAModel.Twitter_QA
	 * @generated
	 */
	EClass getTwitter_QA();

	/**
	 * Returns the meta object for the containment reference list '{@link TwitterQAModel.Twitter_QA#getGames <em>Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Games</em>'.
	 * @see TwitterQAModel.Twitter_QA#getGames()
	 * @see #getTwitter_QA()
	 * @generated
	 */
	EReference getTwitter_QA_Games();

	/**
	 * Returns the meta object for the containment reference list '{@link TwitterQAModel.Twitter_QA#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see TwitterQAModel.Twitter_QA#getPlayers()
	 * @see #getTwitter_QA()
	 * @generated
	 */
	EReference getTwitter_QA_Players();

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
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Game#getWelcome_msg <em>Welcome msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Welcome msg</em>'.
	 * @see TwitterQAModel.Game#getWelcome_msg()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Welcome_msg();

	/**
	 * Returns the meta object for the reference list '{@link TwitterQAModel.Game#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Players</em>'.
	 * @see TwitterQAModel.Game#getPlayers()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Players();

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
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Game#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see TwitterQAModel.Game#getId()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Id();

	/**
	 * Returns the meta object for the '{@link TwitterQAModel.Game#initial_test(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Initial test</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initial test</em>' operation.
	 * @see TwitterQAModel.Game#initial_test(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGame__Initial_test__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link TwitterQAModel.Game#final_test(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Final test</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Final test</em>' operation.
	 * @see TwitterQAModel.Game#final_test(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGame__Final_test__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link TwitterQAModel.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see TwitterQAModel.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Player#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see TwitterQAModel.Player#getId()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Id();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Player#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see TwitterQAModel.Player#getPoints()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Points();

	/**
	 * Returns the meta object for the reference '{@link TwitterQAModel.Player#getCurrent_test <em>Current test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current test</em>'.
	 * @see TwitterQAModel.Player#getCurrent_test()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Current_test();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TwitterQAModel.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

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
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Location#getLangitude <em>Langitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Langitude</em>'.
	 * @see TwitterQAModel.Location#getLangitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Langitude();

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
	 * Returns the meta object for class '{@link TwitterQAModel.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see TwitterQAModel.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Test#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see TwitterQAModel.Test#getId()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Id();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Test#getT_limit <em>Tlimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tlimit</em>'.
	 * @see TwitterQAModel.Test#getT_limit()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_T_limit();

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
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Test#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see TwitterQAModel.Test#getPoints()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Points();

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
	 * Returns the meta object for the containment reference '{@link TwitterQAModel.Test#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see TwitterQAModel.Test#getLocation()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Location();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Test#isIs_initial <em>Is initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is initial</em>'.
	 * @see TwitterQAModel.Test#isIs_initial()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Is_initial();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.Test#isIs_final <em>Is final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is final</em>'.
	 * @see TwitterQAModel.Test#isIs_final()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Is_final();

	/**
	 * Returns the meta object for the '{@link TwitterQAModel.Test#initial_test(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Initial test</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initial test</em>' operation.
	 * @see TwitterQAModel.Test#initial_test(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTest__Initial_test__DiagnosticChain_Map();

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
		 * The meta object literal for the '{@link TwitterQAModel.impl.Twitter_QAImpl <em>Twitter QA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TwitterQAModel.impl.Twitter_QAImpl
		 * @see TwitterQAModel.impl.TwitterQAModelPackageImpl#getTwitter_QA()
		 * @generated
		 */
		EClass TWITTER_QA = eINSTANCE.getTwitter_QA();

		/**
		 * The meta object literal for the '<em><b>Games</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWITTER_QA__GAMES = eINSTANCE.getTwitter_QA_Games();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWITTER_QA__PLAYERS = eINSTANCE.getTwitter_QA_Players();

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
		 * The meta object literal for the '<em><b>Welcome msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__WELCOME_MSG = eINSTANCE.getGame_Welcome_msg();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__PLAYERS = eINSTANCE.getGame_Players();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__CITY = eINSTANCE.getGame_City();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__TESTS = eINSTANCE.getGame_Tests();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__ID = eINSTANCE.getGame_Id();

		/**
		 * The meta object literal for the '<em><b>Initial test</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___INITIAL_TEST__DIAGNOSTICCHAIN_MAP = eINSTANCE.getGame__Initial_test__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Final test</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___FINAL_TEST__DIAGNOSTICCHAIN_MAP = eINSTANCE.getGame__Final_test__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link TwitterQAModel.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TwitterQAModel.impl.PlayerImpl
		 * @see TwitterQAModel.impl.TwitterQAModelPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__ID = eINSTANCE.getPlayer_Id();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__POINTS = eINSTANCE.getPlayer_Points();

		/**
		 * The meta object literal for the '<em><b>Current test</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__CURRENT_TEST = eINSTANCE.getPlayer_Current_test();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

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
		 * The meta object literal for the '<em><b>Langitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LANGITUDE = eINSTANCE.getLocation_Langitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LATITUDE = eINSTANCE.getLocation_Latitude();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__ID = eINSTANCE.getTest_Id();

		/**
		 * The meta object literal for the '<em><b>Tlimit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__TLIMIT = eINSTANCE.getTest_T_limit();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__QUESTION = eINSTANCE.getTest_Question();

		/**
		 * The meta object literal for the '<em><b>Attempts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__ATTEMPTS = eINSTANCE.getTest_Attempts();

		/**
		 * The meta object literal for the '<em><b>Hints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__HINTS = eINSTANCE.getTest_Hints();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__POINTS = eINSTANCE.getTest_Points();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__ANSWERS = eINSTANCE.getTest_Answers();

		/**
		 * The meta object literal for the '<em><b>On correct</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__ON_CORRECT = eINSTANCE.getTest_On_correct();

		/**
		 * The meta object literal for the '<em><b>On fail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__ON_FAIL = eINSTANCE.getTest_On_fail();

		/**
		 * The meta object literal for the '<em><b>On timeout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__ON_TIMEOUT = eINSTANCE.getTest_On_timeout();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__LOCATION = eINSTANCE.getTest_Location();

		/**
		 * The meta object literal for the '<em><b>Is initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__IS_INITIAL = eINSTANCE.getTest_Is_initial();

		/**
		 * The meta object literal for the '<em><b>Is final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__IS_FINAL = eINSTANCE.getTest_Is_final();

		/**
		 * The meta object literal for the '<em><b>Initial test</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEST___INITIAL_TEST__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTest__Initial_test__DiagnosticChain_Map();

	}

} //TwitterQAModelPackage
