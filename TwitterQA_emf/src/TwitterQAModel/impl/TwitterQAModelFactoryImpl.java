/**
 */
package TwitterQAModel.impl;

import TwitterQAModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TwitterQAModelFactoryImpl extends EFactoryImpl implements TwitterQAModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TwitterQAModelFactory init() {
		try {
			TwitterQAModelFactory theTwitterQAModelFactory = (TwitterQAModelFactory)EPackage.Registry.INSTANCE.getEFactory(TwitterQAModelPackage.eNS_URI);
			if (theTwitterQAModelFactory != null) {
				return theTwitterQAModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TwitterQAModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterQAModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TwitterQAModelPackage.TWITTER_QA: return createTwitterQA();
			case TwitterQAModelPackage.GAME: return createGame();
			case TwitterQAModelPackage.TEST: return createTest();
			case TwitterQAModelPackage.LOCATION: return createLocation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterQA createTwitterQA() {
		TwitterQAImpl twitterQA = new TwitterQAImpl();
		return twitterQA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test createTest() {
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterQAModelPackage getTwitterQAModelPackage() {
		return (TwitterQAModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TwitterQAModelPackage getPackage() {
		return TwitterQAModelPackage.eINSTANCE;
	}

} //TwitterQAModelFactoryImpl
