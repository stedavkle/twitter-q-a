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
 *   <li>{@link TwitterQAModel.impl.TwitterQAImpl#getConsumer_key <em>Consumer key</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TwitterQAImpl#getConsumer_secret <em>Consumer secret</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TwitterQAImpl#getAccess_token <em>Access token</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TwitterQAImpl#getAccess_token_secret <em>Access token secret</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TwitterQAImpl#getGames <em>Games</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TwitterQAImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TwitterQAImpl#getWelcome_msg <em>Welcome msg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TwitterQAImpl extends MinimalEObjectImpl.Container implements TwitterQA {
	/**
	 * The default value of the '{@link #getConsumer_key() <em>Consumer key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumer_key()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMER_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumer_key() <em>Consumer key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumer_key()
	 * @generated
	 * @ordered
	 */
	protected String consumer_key = CONSUMER_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsumer_secret() <em>Consumer secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumer_secret()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMER_SECRET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumer_secret() <em>Consumer secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumer_secret()
	 * @generated
	 * @ordered
	 */
	protected String consumer_secret = CONSUMER_SECRET_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccess_token() <em>Access token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess_token()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccess_token() <em>Access token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess_token()
	 * @generated
	 * @ordered
	 */
	protected String access_token = ACCESS_TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccess_token_secret() <em>Access token secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess_token_secret()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_TOKEN_SECRET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccess_token_secret() <em>Access token secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess_token_secret()
	 * @generated
	 * @ordered
	 */
	protected String access_token_secret = ACCESS_TOKEN_SECRET_EDEFAULT;

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
	 * The default value of the '{@link #getWelcome_msg() <em>Welcome msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWelcome_msg()
	 * @generated
	 * @ordered
	 */
	protected static final String WELCOME_MSG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWelcome_msg() <em>Welcome msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWelcome_msg()
	 * @generated
	 * @ordered
	 */
	protected String welcome_msg = WELCOME_MSG_EDEFAULT;

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
	public String getConsumer_key() {
		return consumer_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumer_key(String newConsumer_key) {
		String oldConsumer_key = consumer_key;
		consumer_key = newConsumer_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TWITTER_QA__CONSUMER_KEY, oldConsumer_key, consumer_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsumer_secret() {
		return consumer_secret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumer_secret(String newConsumer_secret) {
		String oldConsumer_secret = consumer_secret;
		consumer_secret = newConsumer_secret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TWITTER_QA__CONSUMER_SECRET, oldConsumer_secret, consumer_secret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccess_token() {
		return access_token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess_token(String newAccess_token) {
		String oldAccess_token = access_token;
		access_token = newAccess_token;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN, oldAccess_token, access_token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccess_token_secret() {
		return access_token_secret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess_token_secret(String newAccess_token_secret) {
		String oldAccess_token_secret = access_token_secret;
		access_token_secret = newAccess_token_secret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN_SECRET, oldAccess_token_secret, access_token_secret));
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
	public String getWelcome_msg() {
		return welcome_msg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWelcome_msg(String newWelcome_msg) {
		String oldWelcome_msg = welcome_msg;
		welcome_msg = newWelcome_msg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TWITTER_QA__WELCOME_MSG, oldWelcome_msg, welcome_msg));
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
				return getConsumer_key();
			case TwitterQAModelPackage.TWITTER_QA__CONSUMER_SECRET:
				return getConsumer_secret();
			case TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN:
				return getAccess_token();
			case TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN_SECRET:
				return getAccess_token_secret();
			case TwitterQAModelPackage.TWITTER_QA__GAMES:
				return getGames();
			case TwitterQAModelPackage.TWITTER_QA__LOCATIONS:
				return getLocations();
			case TwitterQAModelPackage.TWITTER_QA__WELCOME_MSG:
				return getWelcome_msg();
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
				setConsumer_key((String)newValue);
				return;
			case TwitterQAModelPackage.TWITTER_QA__CONSUMER_SECRET:
				setConsumer_secret((String)newValue);
				return;
			case TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN:
				setAccess_token((String)newValue);
				return;
			case TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN_SECRET:
				setAccess_token_secret((String)newValue);
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
				setWelcome_msg((String)newValue);
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
				setConsumer_key(CONSUMER_KEY_EDEFAULT);
				return;
			case TwitterQAModelPackage.TWITTER_QA__CONSUMER_SECRET:
				setConsumer_secret(CONSUMER_SECRET_EDEFAULT);
				return;
			case TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN:
				setAccess_token(ACCESS_TOKEN_EDEFAULT);
				return;
			case TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN_SECRET:
				setAccess_token_secret(ACCESS_TOKEN_SECRET_EDEFAULT);
				return;
			case TwitterQAModelPackage.TWITTER_QA__GAMES:
				getGames().clear();
				return;
			case TwitterQAModelPackage.TWITTER_QA__LOCATIONS:
				getLocations().clear();
				return;
			case TwitterQAModelPackage.TWITTER_QA__WELCOME_MSG:
				setWelcome_msg(WELCOME_MSG_EDEFAULT);
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
				return CONSUMER_KEY_EDEFAULT == null ? consumer_key != null : !CONSUMER_KEY_EDEFAULT.equals(consumer_key);
			case TwitterQAModelPackage.TWITTER_QA__CONSUMER_SECRET:
				return CONSUMER_SECRET_EDEFAULT == null ? consumer_secret != null : !CONSUMER_SECRET_EDEFAULT.equals(consumer_secret);
			case TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN:
				return ACCESS_TOKEN_EDEFAULT == null ? access_token != null : !ACCESS_TOKEN_EDEFAULT.equals(access_token);
			case TwitterQAModelPackage.TWITTER_QA__ACCESS_TOKEN_SECRET:
				return ACCESS_TOKEN_SECRET_EDEFAULT == null ? access_token_secret != null : !ACCESS_TOKEN_SECRET_EDEFAULT.equals(access_token_secret);
			case TwitterQAModelPackage.TWITTER_QA__GAMES:
				return games != null && !games.isEmpty();
			case TwitterQAModelPackage.TWITTER_QA__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case TwitterQAModelPackage.TWITTER_QA__WELCOME_MSG:
				return WELCOME_MSG_EDEFAULT == null ? welcome_msg != null : !WELCOME_MSG_EDEFAULT.equals(welcome_msg);
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
		result.append(" (consumer_key: ");
		result.append(consumer_key);
		result.append(", consumer_secret: ");
		result.append(consumer_secret);
		result.append(", access_token: ");
		result.append(access_token);
		result.append(", access_token_secret: ");
		result.append(access_token_secret);
		result.append(", welcome_msg: ");
		result.append(welcome_msg);
		result.append(')');
		return result.toString();
	}

} //TwitterQAImpl
