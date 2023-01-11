/**
 */
package TwitterQAModel.impl;

import TwitterQAModel.Game;
import TwitterQAModel.Test;
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
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TwitterQAModel.impl.GameImpl#getId <em>Id</em>}</li>
 *   <li>{@link TwitterQAModel.impl.GameImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link TwitterQAModel.impl.GameImpl#getInitialTest <em>Initial Test</em>}</li>
 *   <li>{@link TwitterQAModel.impl.GameImpl#getTests <em>Tests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitialTest() <em>Initial Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialTest()
	 * @generated
	 * @ordered
	 */
	protected Test initialTest;

	/**
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList<Test> tests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterQAModelPackage.Literals.GAME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.GAME__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.GAME__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test getInitialTest() {
		return initialTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialTest(Test newInitialTest, NotificationChain msgs) {
		Test oldInitialTest = initialTest;
		initialTest = newInitialTest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.GAME__INITIAL_TEST, oldInitialTest, newInitialTest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialTest(Test newInitialTest) {
		if (newInitialTest != initialTest) {
			NotificationChain msgs = null;
			if (initialTest != null)
				msgs = ((InternalEObject)initialTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TwitterQAModelPackage.GAME__INITIAL_TEST, null, msgs);
			if (newInitialTest != null)
				msgs = ((InternalEObject)newInitialTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TwitterQAModelPackage.GAME__INITIAL_TEST, null, msgs);
			msgs = basicSetInitialTest(newInitialTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.GAME__INITIAL_TEST, newInitialTest, newInitialTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Test> getTests() {
		if (tests == null) {
			tests = new EObjectContainmentEList<Test>(Test.class, this, TwitterQAModelPackage.GAME__TESTS);
		}
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterQAModelPackage.GAME__INITIAL_TEST:
				return basicSetInitialTest(null, msgs);
			case TwitterQAModelPackage.GAME__TESTS:
				return ((InternalEList<?>)getTests()).basicRemove(otherEnd, msgs);
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
			case TwitterQAModelPackage.GAME__ID:
				return getId();
			case TwitterQAModelPackage.GAME__DESCRIPTION:
				return getDescription();
			case TwitterQAModelPackage.GAME__INITIAL_TEST:
				return getInitialTest();
			case TwitterQAModelPackage.GAME__TESTS:
				return getTests();
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
			case TwitterQAModelPackage.GAME__ID:
				setId((String)newValue);
				return;
			case TwitterQAModelPackage.GAME__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TwitterQAModelPackage.GAME__INITIAL_TEST:
				setInitialTest((Test)newValue);
				return;
			case TwitterQAModelPackage.GAME__TESTS:
				getTests().clear();
				getTests().addAll((Collection<? extends Test>)newValue);
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
			case TwitterQAModelPackage.GAME__ID:
				setId(ID_EDEFAULT);
				return;
			case TwitterQAModelPackage.GAME__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TwitterQAModelPackage.GAME__INITIAL_TEST:
				setInitialTest((Test)null);
				return;
			case TwitterQAModelPackage.GAME__TESTS:
				getTests().clear();
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
			case TwitterQAModelPackage.GAME__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TwitterQAModelPackage.GAME__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TwitterQAModelPackage.GAME__INITIAL_TEST:
				return initialTest != null;
			case TwitterQAModelPackage.GAME__TESTS:
				return tests != null && !tests.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //GameImpl
