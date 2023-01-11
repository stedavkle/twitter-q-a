/**
 */
package TwitterQAModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	String eNS_URI = "TwitterQA_emf/model/TwitterQA.ecore";

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
	 * The feature id for the '<em><b>Consumer Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_QA__CONSUMER_KEY = 0;

	/**
	 * The feature id for the '<em><b>Consumer Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_QA__CONSUMER_SECRET = 1;

	/**
	 * The feature id for the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_QA__ACCESS_TOKEN = 2;

	/**
	 * The feature id for the '<em><b>Access Token Secret</b></em>' attribute.
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
	 * The feature id for the '<em><b>Welcome Msg</b></em>' attribute.
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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Initial Test</b></em>' containment reference.
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
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ID = 0;

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
	 * The feature id for the '<em><b>On wrong</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ON_WRONG = 9;

	/**
	 * The feature id for the '<em><b>On failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ON_FAILURE = 10;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the attribute '{@link TwitterQAModel.TwitterQA#getConsumerKey <em>Consumer Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer Key</em>'.
	 * @see TwitterQAModel.TwitterQA#getConsumerKey()
	 * @see #getTwitterQA()
	 * @generated
	 */
	EAttribute getTwitterQA_ConsumerKey();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.TwitterQA#getConsumerSecret <em>Consumer Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer Secret</em>'.
	 * @see TwitterQAModel.TwitterQA#getConsumerSecret()
	 * @see #getTwitterQA()
	 * @generated
	 */
	EAttribute getTwitterQA_ConsumerSecret();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.TwitterQA#getAccessToken <em>Access Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Token</em>'.
	 * @see TwitterQAModel.TwitterQA#getAccessToken()
	 * @see #getTwitterQA()
	 * @generated
	 */
	EAttribute getTwitterQA_AccessToken();

	/**
	 * Returns the meta object for the attribute '{@link TwitterQAModel.TwitterQA#getAccessTokenSecret <em>Access Token Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Token Secret</em>'.
	 * @see TwitterQAModel.TwitterQA#getAccessTokenSecret()
	 * @see #getTwitterQA()
	 * @generated
	 */
	EAttribute getTwitterQA_AccessTokenSecret();

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
	 * Returns the meta object for the attribute '{@link TwitterQAModel.TwitterQA#getWelcomeMsg <em>Welcome Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Welcome Msg</em>'.
	 * @see TwitterQAModel.TwitterQA#getWelcomeMsg()
	 * @see #getTwitterQA()
	 * @generated
	 */
	EAttribute getTwitterQA_WelcomeMsg();

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
	 * Returns the meta object for the containment reference '{@link TwitterQAModel.Game#getInitialTest <em>Initial Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Test</em>'.
	 * @see TwitterQAModel.Game#getInitialTest()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_InitialTest();

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
	 * Returns the meta object for the reference '{@link TwitterQAModel.Test#getOn_wrong <em>On wrong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On wrong</em>'.
	 * @see TwitterQAModel.Test#getOn_wrong()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_On_wrong();

	/**
	 * Returns the meta object for the reference '{@link TwitterQAModel.Test#getOn_failure <em>On failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On failure</em>'.
	 * @see TwitterQAModel.Test#getOn_failure()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_On_failure();

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
		 * The meta object literal for the '<em><b>Consumer Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_QA__CONSUMER_KEY = eINSTANCE.getTwitterQA_ConsumerKey();

		/**
		 * The meta object literal for the '<em><b>Consumer Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_QA__CONSUMER_SECRET = eINSTANCE.getTwitterQA_ConsumerSecret();

		/**
		 * The meta object literal for the '<em><b>Access Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_QA__ACCESS_TOKEN = eINSTANCE.getTwitterQA_AccessToken();

		/**
		 * The meta object literal for the '<em><b>Access Token Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_QA__ACCESS_TOKEN_SECRET = eINSTANCE.getTwitterQA_AccessTokenSecret();

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
		 * The meta object literal for the '<em><b>Welcome Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_QA__WELCOME_MSG = eINSTANCE.getTwitterQA_WelcomeMsg();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__ID = eINSTANCE.getGame_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__DESCRIPTION = eINSTANCE.getGame_Description();

		/**
		 * The meta object literal for the '<em><b>Initial Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__INITIAL_TEST = eINSTANCE.getGame_InitialTest();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__TESTS = eINSTANCE.getGame_Tests();

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
		 * The meta object literal for the '<em><b>On wrong</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__ON_WRONG = eINSTANCE.getTest_On_wrong();

		/**
		 * The meta object literal for the '<em><b>On failure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__ON_FAILURE = eINSTANCE.getTest_On_failure();

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
