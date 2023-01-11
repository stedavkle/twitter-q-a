/**
 */
package TwitterQAModel.impl;

import TwitterQAModel.Game;
import TwitterQAModel.Location;
import TwitterQAModel.TwitterQA;
import TwitterQAModel.TwitterQAModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Twitter QA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TwitterQAModel.impl.TwitterQAImpl#getConsumerKey <em>Consumer Key</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TwitterQAImpl#getConsumerSecret <em>Consumer Secret</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TwitterQAImpl#getAccessToken <em>Access Token</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TwitterQAImpl#getAccessTokenSecret <em>Access Token Secret</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TwitterQAImpl#getGames <em>Games</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TwitterQAImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TwitterQAImpl#getWelcomeMsg <em>Welcome Msg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TwitterQAImpl extends MinimalEObjectImpl.Container implements TwitterQA {
	/**
	 * The default value of the '{@link #getConsumerKey() <em>Consumer Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerKey()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMER_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumerKey() <em>Consumer Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerKey()
	 * @generated
	 * @ordered
	 */
	protected String consumerKey = CONSUMER_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsumerSecret() <em>Consumer Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerSecret()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMER_SECRET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumerSecret() <em>Consumer Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerSecret()
	 * @generated
	 * @ordered
	 */
	protected String consumerSecret = CONSUMER_SECRET_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessToken() <em>Access Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessToken()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessToken() <em>Access Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessToken()
	 * @generated
	 * @ordered
	 */
	protected String accessToken = ACCESS_TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessTokenSecret() <em>Access Token Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessTokenSecret()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_TOKEN_SECRET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessTokenSecret() <em>Access Token Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessTokenSecret()
	 * @generated
	 * @ordered
	 */
	protected String accessTokenSecret = ACCESS_TOKEN_SECRET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGames() <em>Games</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGames()
	 * @generated
	 * @ordered
	 */
	protected EList<Game> games;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The default value of the '{@link #getWelcomeMsg() <em>Welcome Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWelcomeMsg()
	 * @generated
	 * @ordered
	 */
	protected static final String WELCOME_MSG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWelcomeMsg() <em>Welcome Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWelcomeMsg()
	 * @generated
	 * @ordered
	 */
	protected String welcomeMsg = WELCOME_MSG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TwitterQAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterQAModelPackage.Literals.TWITTER_QA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsumerKey() {
		return consumerKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumerKey(String newConsumerKey) {
		String oldConsumerKey = consumerKey;
		consumerKey = newConsumerKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TWITTER_QA__CONSUMER_KEY, oldConsumerKey, consumerKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsumerSecret() {
		return consumerSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumerSecret(String newConsumerSecret) {
		String oldConsumerSecret = consumerSecret;
		consumerSecret = newConsumerSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TWITTER_QA__CONSUMER_SECRET, oldConsumerSecret, consumerSecret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessToken(String newAccessToken) {
		String oldAccessToken = accessToken;
		accessToken = newAccessToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN, oldAccessToken, accessToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessTokenSecret() {
		return accessTokenSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessTokenSecret(String newAccessTokenSecret) {
		String oldAccessTokenSecret = accessTokenSecret;
		accessTokenSecret = newAccessTokenSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN_SECRET, oldAccessTokenSecret, accessTokenSecret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Game> getGames() {
		if (games == null) {
			games = new EObjectContainmentEList<Game>(Game.class, this, TwitterQAModelPackage.TWITTER_QA__GAMES);
		}
		return games;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Location>(Location.class, this, TwitterQAModelPackage.TWITTER_QA__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWelcomeMsg() {
		return welcomeMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWelcomeMsg(String newWelcomeMsg) {
		String oldWelcomeMsg = welcomeMsg;
		welcomeMsg = newWelcomeMsg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TWITTER_QA__WELCOME_MSG, oldWelcomeMsg, welcomeMsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterQAModelPackage.TWITTER_QA__GAMES:
				return ((InternalEList<?>)getGames()).basicRemove(otherEnd, msgs);
			case TwitterQAModelPackage.TWITTER_QA__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TwitterQAModelPackage.TWITTER_QA__CONSUMER_KEY:
				return getConsumerKey();
			case TwitterQAModelPackage.TWITTER_QA__CONSUMER_SECRET:
				return getConsumerSecret();
			case TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN:
				return getAccessToken();
			case TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN_SECRET:
				return getAccessTokenSecret();
			case TwitterQAModelPackage.TWITTER_QA__GAMES:
				return getGames();
			case TwitterQAModelPackage.TWITTER_QA__LOCATIONS:
				return getLocations();
			case TwitterQAModelPackage.TWITTER_QA__WELCOME_MSG:
				return getWelcomeMsg();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TwitterQAModelPackage.TWITTER_QA__CONSUMER_KEY:
				setConsumerKey((String)newValue);
				return;
			case TwitterQAModelPackage.TWITTER_QA__CONSUMER_SECRET:
				setConsumerSecret((String)newValue);
				return;
			case TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN:
				setAccessToken((String)newValue);
				return;
			case TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN_SECRET:
				setAccessTokenSecret((String)newValue);
				return;
			case TwitterQAModelPackage.TWITTER_QA__GAMES:
				getGames().clear();
				getGames().addAll((Collection<? extends Game>)newValue);
				return;
			case TwitterQAModelPackage.TWITTER_QA__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case TwitterQAModelPackage.TWITTER_QA__WELCOME_MSG:
				setWelcomeMsg((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TwitterQAModelPackage.TWITTER_QA__CONSUMER_KEY:
				setConsumerKey(CONSUMER_KEY_EDEFAULT);
				return;
			case TwitterQAModelPackage.TWITTER_QA__CONSUMER_SECRET:
				setConsumerSecret(CONSUMER_SECRET_EDEFAULT);
				return;
			case TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN:
				setAccessToken(ACCESS_TOKEN_EDEFAULT);
				return;
			case TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN_SECRET:
				setAccessTokenSecret(ACCESS_TOKEN_SECRET_EDEFAULT);
				return;
			case TwitterQAModelPackage.TWITTER_QA__GAMES:
				getGames().clear();
				return;
			case TwitterQAModelPackage.TWITTER_QA__LOCATIONS:
				getLocations().clear();
				return;
			case TwitterQAModelPackage.TWITTER_QA__WELCOME_MSG:
				setWelcomeMsg(WELCOME_MSG_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TwitterQAModelPackage.TWITTER_QA__CONSUMER_KEY:
				return CONSUMER_KEY_EDEFAULT == null ? consumerKey != null : !CONSUMER_KEY_EDEFAULT.equals(consumerKey);
			case TwitterQAModelPackage.TWITTER_QA__CONSUMER_SECRET:
				return CONSUMER_SECRET_EDEFAULT == null ? consumerSecret != null : !CONSUMER_SECRET_EDEFAULT.equals(consumerSecret);
			case TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN:
				return ACCESS_TOKEN_EDEFAULT == null ? accessToken != null : !ACCESS_TOKEN_EDEFAULT.equals(accessToken);
			case TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN_SECRET:
				return ACCESS_TOKEN_SECRET_EDEFAULT == null ? accessTokenSecret != null : !ACCESS_TOKEN_SECRET_EDEFAULT.equals(accessTokenSecret);
			case TwitterQAModelPackage.TWITTER_QA__GAMES:
				return games != null && !games.isEmpty();
			case TwitterQAModelPackage.TWITTER_QA__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case TwitterQAModelPackage.TWITTER_QA__WELCOME_MSG:
				return WELCOME_MSG_EDEFAULT == null ? welcomeMsg != null : !WELCOME_MSG_EDEFAULT.equals(welcomeMsg);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (consumerKey: ");
		result.append(consumerKey);
		result.append(", consumerSecret: ");
		result.append(consumerSecret);
		result.append(", accessToken: ");
		result.append(accessToken);
		result.append(", accessTokenSecret: ");
		result.append(accessTokenSecret);
		result.append(", welcomeMsg: ");
		result.append(welcomeMsg);
		result.append(')');
		return result.toString();
	}

} //TwitterQAImpl
