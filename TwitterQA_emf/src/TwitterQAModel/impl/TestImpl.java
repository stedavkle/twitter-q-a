/**
 */
package TwitterQAModel.impl;

import TwitterQAModel.Location;
import TwitterQAModel.Test;
import TwitterQAModel.TwitterQAModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getId <em>Id</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getAnswers <em>Answers</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getHints <em>Hints</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getTimelimit <em>Timelimit</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getAttempts <em>Attempts</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getReward <em>Reward</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getOn_correct <em>On correct</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getOn_wrong <em>On wrong</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getOn_failure <em>On failure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestImpl extends MinimalEObjectImpl.Container implements Test {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The default value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected String question = QUESTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnswers() <em>Answers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> answers;

	/**
	 * The cached value of the '{@link #getHints() <em>Hints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> hints;

	/**
	 * The default value of the '{@link #getTimelimit() <em>Timelimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimelimit()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMELIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimelimit() <em>Timelimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimelimit()
	 * @generated
	 * @ordered
	 */
	protected int timelimit = TIMELIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttempts() <em>Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttempts()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTEMPTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttempts() <em>Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttempts()
	 * @generated
	 * @ordered
	 */
	protected int attempts = ATTEMPTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReward() <em>Reward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReward()
	 * @generated
	 * @ordered
	 */
	protected static final int REWARD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReward() <em>Reward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReward()
	 * @generated
	 * @ordered
	 */
	protected int reward = REWARD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOn_correct() <em>On correct</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn_correct()
	 * @generated
	 * @ordered
	 */
	protected Test on_correct;

	/**
	 * The cached value of the '{@link #getOn_wrong() <em>On wrong</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn_wrong()
	 * @generated
	 * @ordered
	 */
	protected Test on_wrong;

	/**
	 * The cached value of the '{@link #getOn_failure() <em>On failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn_failure()
	 * @generated
	 * @ordered
	 */
	protected Test on_failure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterQAModelPackage.Literals.TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TEST__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TwitterQAModelPackage.TEST__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TEST__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestion(String newQuestion) {
		String oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TEST__QUESTION, oldQuestion, question));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAnswers() {
		if (answers == null) {
			answers = new EDataTypeUniqueEList<String>(String.class, this, TwitterQAModelPackage.TEST__ANSWERS);
		}
		return answers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getHints() {
		if (hints == null) {
			hints = new EDataTypeUniqueEList<String>(String.class, this, TwitterQAModelPackage.TEST__HINTS);
		}
		return hints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimelimit() {
		return timelimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimelimit(int newTimelimit) {
		int oldTimelimit = timelimit;
		timelimit = newTimelimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TEST__TIMELIMIT, oldTimelimit, timelimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttempts() {
		return attempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttempts(int newAttempts) {
		int oldAttempts = attempts;
		attempts = newAttempts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TEST__ATTEMPTS, oldAttempts, attempts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReward() {
		return reward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReward(int newReward) {
		int oldReward = reward;
		reward = newReward;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TEST__REWARD, oldReward, reward));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test getOn_correct() {
		if (on_correct != null && on_correct.eIsProxy()) {
			InternalEObject oldOn_correct = (InternalEObject)on_correct;
			on_correct = (Test)eResolveProxy(oldOn_correct);
			if (on_correct != oldOn_correct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TwitterQAModelPackage.TEST__ON_CORRECT, oldOn_correct, on_correct));
			}
		}
		return on_correct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test basicGetOn_correct() {
		return on_correct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOn_correct(Test newOn_correct) {
		Test oldOn_correct = on_correct;
		on_correct = newOn_correct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TEST__ON_CORRECT, oldOn_correct, on_correct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test getOn_wrong() {
		if (on_wrong != null && on_wrong.eIsProxy()) {
			InternalEObject oldOn_wrong = (InternalEObject)on_wrong;
			on_wrong = (Test)eResolveProxy(oldOn_wrong);
			if (on_wrong != oldOn_wrong) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TwitterQAModelPackage.TEST__ON_WRONG, oldOn_wrong, on_wrong));
			}
		}
		return on_wrong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test basicGetOn_wrong() {
		return on_wrong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOn_wrong(Test newOn_wrong) {
		Test oldOn_wrong = on_wrong;
		on_wrong = newOn_wrong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TEST__ON_WRONG, oldOn_wrong, on_wrong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test getOn_failure() {
		if (on_failure != null && on_failure.eIsProxy()) {
			InternalEObject oldOn_failure = (InternalEObject)on_failure;
			on_failure = (Test)eResolveProxy(oldOn_failure);
			if (on_failure != oldOn_failure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TwitterQAModelPackage.TEST__ON_FAILURE, oldOn_failure, on_failure));
			}
		}
		return on_failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test basicGetOn_failure() {
		return on_failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOn_failure(Test newOn_failure) {
		Test oldOn_failure = on_failure;
		on_failure = newOn_failure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TEST__ON_FAILURE, oldOn_failure, on_failure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TwitterQAModelPackage.TEST__ID:
				return getId();
			case TwitterQAModelPackage.TEST__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case TwitterQAModelPackage.TEST__QUESTION:
				return getQuestion();
			case TwitterQAModelPackage.TEST__ANSWERS:
				return getAnswers();
			case TwitterQAModelPackage.TEST__HINTS:
				return getHints();
			case TwitterQAModelPackage.TEST__TIMELIMIT:
				return getTimelimit();
			case TwitterQAModelPackage.TEST__ATTEMPTS:
				return getAttempts();
			case TwitterQAModelPackage.TEST__REWARD:
				return getReward();
			case TwitterQAModelPackage.TEST__ON_CORRECT:
				if (resolve) return getOn_correct();
				return basicGetOn_correct();
			case TwitterQAModelPackage.TEST__ON_WRONG:
				if (resolve) return getOn_wrong();
				return basicGetOn_wrong();
			case TwitterQAModelPackage.TEST__ON_FAILURE:
				if (resolve) return getOn_failure();
				return basicGetOn_failure();
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
			case TwitterQAModelPackage.TEST__ID:
				setId((String)newValue);
				return;
			case TwitterQAModelPackage.TEST__LOCATION:
				setLocation((Location)newValue);
				return;
			case TwitterQAModelPackage.TEST__QUESTION:
				setQuestion((String)newValue);
				return;
			case TwitterQAModelPackage.TEST__ANSWERS:
				getAnswers().clear();
				getAnswers().addAll((Collection<? extends String>)newValue);
				return;
			case TwitterQAModelPackage.TEST__HINTS:
				getHints().clear();
				getHints().addAll((Collection<? extends String>)newValue);
				return;
			case TwitterQAModelPackage.TEST__TIMELIMIT:
				setTimelimit((Integer)newValue);
				return;
			case TwitterQAModelPackage.TEST__ATTEMPTS:
				setAttempts((Integer)newValue);
				return;
			case TwitterQAModelPackage.TEST__REWARD:
				setReward((Integer)newValue);
				return;
			case TwitterQAModelPackage.TEST__ON_CORRECT:
				setOn_correct((Test)newValue);
				return;
			case TwitterQAModelPackage.TEST__ON_WRONG:
				setOn_wrong((Test)newValue);
				return;
			case TwitterQAModelPackage.TEST__ON_FAILURE:
				setOn_failure((Test)newValue);
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
			case TwitterQAModelPackage.TEST__ID:
				setId(ID_EDEFAULT);
				return;
			case TwitterQAModelPackage.TEST__LOCATION:
				setLocation((Location)null);
				return;
			case TwitterQAModelPackage.TEST__QUESTION:
				setQuestion(QUESTION_EDEFAULT);
				return;
			case TwitterQAModelPackage.TEST__ANSWERS:
				getAnswers().clear();
				return;
			case TwitterQAModelPackage.TEST__HINTS:
				getHints().clear();
				return;
			case TwitterQAModelPackage.TEST__TIMELIMIT:
				setTimelimit(TIMELIMIT_EDEFAULT);
				return;
			case TwitterQAModelPackage.TEST__ATTEMPTS:
				setAttempts(ATTEMPTS_EDEFAULT);
				return;
			case TwitterQAModelPackage.TEST__REWARD:
				setReward(REWARD_EDEFAULT);
				return;
			case TwitterQAModelPackage.TEST__ON_CORRECT:
				setOn_correct((Test)null);
				return;
			case TwitterQAModelPackage.TEST__ON_WRONG:
				setOn_wrong((Test)null);
				return;
			case TwitterQAModelPackage.TEST__ON_FAILURE:
				setOn_failure((Test)null);
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
			case TwitterQAModelPackage.TEST__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TwitterQAModelPackage.TEST__LOCATION:
				return location != null;
			case TwitterQAModelPackage.TEST__QUESTION:
				return QUESTION_EDEFAULT == null ? question != null : !QUESTION_EDEFAULT.equals(question);
			case TwitterQAModelPackage.TEST__ANSWERS:
				return answers != null && !answers.isEmpty();
			case TwitterQAModelPackage.TEST__HINTS:
				return hints != null && !hints.isEmpty();
			case TwitterQAModelPackage.TEST__TIMELIMIT:
				return timelimit != TIMELIMIT_EDEFAULT;
			case TwitterQAModelPackage.TEST__ATTEMPTS:
				return attempts != ATTEMPTS_EDEFAULT;
			case TwitterQAModelPackage.TEST__REWARD:
				return reward != REWARD_EDEFAULT;
			case TwitterQAModelPackage.TEST__ON_CORRECT:
				return on_correct != null;
			case TwitterQAModelPackage.TEST__ON_WRONG:
				return on_wrong != null;
			case TwitterQAModelPackage.TEST__ON_FAILURE:
				return on_failure != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", question: ");
		result.append(question);
		result.append(", answers: ");
		result.append(answers);
		result.append(", hints: ");
		result.append(hints);
		result.append(", timelimit: ");
		result.append(timelimit);
		result.append(", attempts: ");
		result.append(attempts);
		result.append(", reward: ");
		result.append(reward);
		result.append(')');
		return result.toString();
	}

} //TestImpl
