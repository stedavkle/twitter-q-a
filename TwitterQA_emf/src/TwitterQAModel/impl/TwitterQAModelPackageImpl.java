/**
 */
package TwitterQAModel.impl;

import TwitterQAModel.Game;
import TwitterQAModel.Location;
import TwitterQAModel.Test;
import TwitterQAModel.TwitterQA;
import TwitterQAModel.TwitterQAModelFactory;
import TwitterQAModel.TwitterQAModelPackage;

import TwitterQAModel.util.TwitterQAModelValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TwitterQAModelPackageImpl extends EPackageImpl implements TwitterQAModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twitterQAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

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
	 * @see TwitterQAModel.TwitterQAModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TwitterQAModelPackageImpl() {
		super(eNS_URI, TwitterQAModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TwitterQAModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TwitterQAModelPackage init() {
		if (isInited) return (TwitterQAModelPackage)EPackage.Registry.INSTANCE.getEPackage(TwitterQAModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTwitterQAModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TwitterQAModelPackageImpl theTwitterQAModelPackage = registeredTwitterQAModelPackage instanceof TwitterQAModelPackageImpl ? (TwitterQAModelPackageImpl)registeredTwitterQAModelPackage : new TwitterQAModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTwitterQAModelPackage.createPackageContents();

		// Initialize created meta-data
		theTwitterQAModelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTwitterQAModelPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TwitterQAModelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTwitterQAModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TwitterQAModelPackage.eNS_URI, theTwitterQAModelPackage);
		return theTwitterQAModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwitterQA() {
		return twitterQAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwitterQA_Consumer_key() {
		return (EAttribute)twitterQAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwitterQA_Consumer_secret() {
		return (EAttribute)twitterQAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwitterQA_Access_token() {
		return (EAttribute)twitterQAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwitterQA_Access_token_secret() {
		return (EAttribute)twitterQAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTwitterQA_Games() {
		return (EReference)twitterQAEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTwitterQA_Locations() {
		return (EReference)twitterQAEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwitterQA_Welcome_msg() {
		return (EAttribute)twitterQAEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGame() {
		return gameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_Name() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_Description() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Initial_test() {
		return (EReference)gameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Tests() {
		return (EReference)gameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_City() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__No_order_twice__DiagnosticChain_Map() {
		return gameEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__No_jump_back_correct__DiagnosticChain_Map() {
		return gameEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__Initial_order_zero__DiagnosticChain_Map() {
		return gameEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__No_jump_back_timeout__DiagnosticChain_Map() {
		return gameEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__No_jump_back_fail__DiagnosticChain_Map() {
		return gameEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__Initial_on_correct_notnull__DiagnosticChain_Map() {
		return gameEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTest() {
		return testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_Name() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_Location() {
		return (EReference)testEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_Question() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_Answers() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_Hints() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_Timelimit() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_Attempts() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_Reward() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_On_correct() {
		return (EReference)testEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_On_timeout() {
		return (EReference)testEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_On_fail() {
		return (EReference)testEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_Order() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTest__Reward_positive__DiagnosticChain_Map() {
		return testEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTest__Time_positive__DiagnosticChain_Map() {
		return testEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTest__Attempts_positive__DiagnosticChain_Map() {
		return testEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTest__Order_positive__DiagnosticChain_Map() {
		return testEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Name() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Latitude() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Longitude() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterQAModelFactory getTwitterQAModelFactory() {
		return (TwitterQAModelFactory)getEFactoryInstance();
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
		twitterQAEClass = createEClass(TWITTER_QA);
		createEAttribute(twitterQAEClass, TWITTER_QA__CONSUMER_KEY);
		createEAttribute(twitterQAEClass, TWITTER_QA__CONSUMER_SECRET);
		createEAttribute(twitterQAEClass, TWITTER_QA__ACCESS_TOKEN);
		createEAttribute(twitterQAEClass, TWITTER_QA__ACCESS_TOKEN_SECRET);
		createEReference(twitterQAEClass, TWITTER_QA__GAMES);
		createEReference(twitterQAEClass, TWITTER_QA__LOCATIONS);
		createEAttribute(twitterQAEClass, TWITTER_QA__WELCOME_MSG);

		gameEClass = createEClass(GAME);
		createEAttribute(gameEClass, GAME__NAME);
		createEAttribute(gameEClass, GAME__DESCRIPTION);
		createEReference(gameEClass, GAME__INITIAL_TEST);
		createEReference(gameEClass, GAME__TESTS);
		createEAttribute(gameEClass, GAME__CITY);
		createEOperation(gameEClass, GAME___NO_ORDER_TWICE__DIAGNOSTICCHAIN_MAP);
		createEOperation(gameEClass, GAME___NO_JUMP_BACK_CORRECT__DIAGNOSTICCHAIN_MAP);
		createEOperation(gameEClass, GAME___INITIAL_ORDER_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(gameEClass, GAME___NO_JUMP_BACK_TIMEOUT__DIAGNOSTICCHAIN_MAP);
		createEOperation(gameEClass, GAME___NO_JUMP_BACK_FAIL__DIAGNOSTICCHAIN_MAP);
		createEOperation(gameEClass, GAME___INITIAL_ON_CORRECT_NOTNULL__DIAGNOSTICCHAIN_MAP);

		testEClass = createEClass(TEST);
		createEAttribute(testEClass, TEST__NAME);
		createEReference(testEClass, TEST__LOCATION);
		createEAttribute(testEClass, TEST__QUESTION);
		createEAttribute(testEClass, TEST__ANSWERS);
		createEAttribute(testEClass, TEST__HINTS);
		createEAttribute(testEClass, TEST__TIMELIMIT);
		createEAttribute(testEClass, TEST__ATTEMPTS);
		createEAttribute(testEClass, TEST__REWARD);
		createEReference(testEClass, TEST__ON_CORRECT);
		createEReference(testEClass, TEST__ON_TIMEOUT);
		createEReference(testEClass, TEST__ON_FAIL);
		createEAttribute(testEClass, TEST__ORDER);
		createEOperation(testEClass, TEST___ATTEMPTS_POSITIVE__DIAGNOSTICCHAIN_MAP);
		createEOperation(testEClass, TEST___ORDER_POSITIVE__DIAGNOSTICCHAIN_MAP);
		createEOperation(testEClass, TEST___TIME_POSITIVE__DIAGNOSTICCHAIN_MAP);
		createEOperation(testEClass, TEST___REWARD_POSITIVE__DIAGNOSTICCHAIN_MAP);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__NAME);
		createEAttribute(locationEClass, LOCATION__LATITUDE);
		createEAttribute(locationEClass, LOCATION__LONGITUDE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(twitterQAEClass, TwitterQA.class, "TwitterQA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwitterQA_Consumer_key(), ecorePackage.getEString(), "consumer_key", null, 1, 1, TwitterQA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwitterQA_Consumer_secret(), ecorePackage.getEString(), "consumer_secret", null, 1, 1, TwitterQA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwitterQA_Access_token(), ecorePackage.getEString(), "access_token", null, 1, 1, TwitterQA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwitterQA_Access_token_secret(), ecorePackage.getEString(), "access_token_secret", null, 1, 1, TwitterQA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTwitterQA_Games(), this.getGame(), null, "games", null, 1, -1, TwitterQA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTwitterQA_Locations(), this.getLocation(), null, "locations", null, 1, -1, TwitterQA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwitterQA_Welcome_msg(), ecorePackage.getEString(), "welcome_msg", null, 1, 1, TwitterQA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGame_Name(), ecorePackage.getEString(), "name", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_Description(), ecorePackage.getEString(), "description", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Initial_test(), this.getTest(), null, "initial_test", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Tests(), this.getTest(), null, "tests", null, 1, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_City(), ecorePackage.getEString(), "city", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getGame__No_order_twice__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "no_order_twice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGame__No_jump_back_correct__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "no_jump_back_correct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGame__Initial_order_zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "initial_order_zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGame__No_jump_back_timeout__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "no_jump_back_timeout", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGame__No_jump_back_fail__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "no_jump_back_fail", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGame__Initial_on_correct_notnull__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "initial_on_correct_notnull", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testEClass, Test.class, "Test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTest_Name(), ecorePackage.getEString(), "name", null, 1, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_Location(), this.getLocation(), null, "location", null, 1, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTest_Question(), ecorePackage.getEString(), "question", null, 1, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTest_Answers(), ecorePackage.getEString(), "answers", null, 1, -1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTest_Hints(), ecorePackage.getEString(), "hints", null, 0, -1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTest_Timelimit(), ecorePackage.getEInt(), "timelimit", null, 1, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTest_Attempts(), ecorePackage.getEInt(), "attempts", null, 1, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTest_Reward(), ecorePackage.getEInt(), "reward", null, 1, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_On_correct(), this.getTest(), null, "on_correct", null, 0, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_On_timeout(), this.getTest(), null, "on_timeout", null, 0, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_On_fail(), this.getTest(), null, "on_fail", null, 0, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTest_Order(), ecorePackage.getEInt(), "order", null, 1, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTest__Attempts_positive__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "attempts_positive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTest__Order_positive__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "order_positive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTest__Time_positive__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "time_positive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTest__Reward_positive__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "reward_positive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Latitude(), ecorePackage.getEDouble(), "latitude", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Longitude(), ecorePackage.getEDouble(), "longitude", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (gameEClass,
		   source,
		   new String[] {
			   "constraints", "initial_on_correct_notnull"
		   });
		addAnnotation
		  (testEClass,
		   source,
		   new String[] {
			   "constraints", "reward_positive"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getGame__No_order_twice__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "tests->isUnique(t | t.order) and tests->forAll(t | t.order > 0)"
		   });
		addAnnotation
		  (getGame__No_jump_back_correct__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tlet not_final_tests = tests->select(t | t.on_correct.oclIsUndefined() = false) in\n\t\t\t\tnot_final_tests->forAll(t | t.on_correct.order > t.order)"
		   });
		addAnnotation
		  (getGame__Initial_order_zero__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "initial_test.order = 0"
		   });
		addAnnotation
		  (getGame__No_jump_back_timeout__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tlet not_final_tests = tests->select(t | t.on_timeout.oclIsUndefined() = false) in\n\t\t\t\tnot_final_tests->forAll(t | t.on_timeout.order > t.order)"
		   });
		addAnnotation
		  (getGame__No_jump_back_fail__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tlet not_final_tests = tests->select(t | t.on_fail.oclIsUndefined() = false) in\n\t\t\t\tnot_final_tests->forAll(t | t.on_fail.order > t.order)"
		   });
		addAnnotation
		  (getGame__Initial_on_correct_notnull__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "not initial_test.on_correct.oclIsUndefined()"
		   });
		addAnnotation
		  (getTest__Attempts_positive__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "attempts > 0"
		   });
		addAnnotation
		  (getTest__Order_positive__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "order >= 0"
		   });
		addAnnotation
		  (getTest__Time_positive__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "timelimit > 0"
		   });
		addAnnotation
		  (getTest__Reward_positive__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "reward > 0"
		   });
	}

} //TwitterQAModelPackageImpl
