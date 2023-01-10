/**
 */
package TwitterQAModel.impl;

import TwitterQAModel.Game;
import TwitterQAModel.Player;
import TwitterQAModel.Test;
import TwitterQAModel.TwitterQAModelPackage;
import TwitterQAModel.TwitterQAModelTables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TwitterQAModel.impl.GameImpl#getWelcome_msg <em>Welcome msg</em>}</li>
 *   <li>{@link TwitterQAModel.impl.GameImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link TwitterQAModel.impl.GameImpl#getCity <em>City</em>}</li>
 *   <li>{@link TwitterQAModel.impl.GameImpl#getTests <em>Tests</em>}</li>
 *   <li>{@link TwitterQAModel.impl.GameImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
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
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> players;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.GAME__WELCOME_MSG, oldWelcome_msg, welcome_msg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getPlayers() {
		if (players == null) {
			players = new EObjectResolvingEList<Player>(Player.class, this, TwitterQAModelPackage.GAME__PLAYERS);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.GAME__CITY, oldCity, city));
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
	public boolean initial_test(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Game::initial_test";
		try {
			/**
			 *
			 * inv initial_test:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = tests->one(t | t.is_initial)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, TwitterQAModelPackage.Literals.GAME___INITIAL_TEST__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, TwitterQAModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Test> tests = this.getTests();
				final /*@NonInvalid*/ OrderedSetValue BOXED_tests = idResolver.createOrderedSetOfAll(TwitterQAModelTables.ORD_CLSSid_Test, tests);
				/*@Thrown*/ boolean accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_t = BOXED_tests.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_t.hasNext()) {
						result = accumulator;
						break;
					}
					/*@NonInvalid*/ Test t = (Test)ITERATOR_t.next();
					/**
					 * t.is_initial
					 */
					final /*@NonInvalid*/ boolean is_initial = t.isIs_initial();
					//
					if (is_initial) {			// Carry on till something found
						if (accumulator) {
							result = false;
							break;
						}
						else {
							accumulator = true;
						}
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, TwitterQAModelTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean final_test(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Game::final_test";
		try {
			/**
			 *
			 * inv final_test:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = tests->one(t | t.is_final)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, TwitterQAModelPackage.Literals.GAME___FINAL_TEST__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, TwitterQAModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Test> tests = this.getTests();
				final /*@NonInvalid*/ OrderedSetValue BOXED_tests = idResolver.createOrderedSetOfAll(TwitterQAModelTables.ORD_CLSSid_Test, tests);
				/*@Thrown*/ boolean accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_t = BOXED_tests.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_t.hasNext()) {
						result = accumulator;
						break;
					}
					/*@NonInvalid*/ Test t = (Test)ITERATOR_t.next();
					/**
					 * t.is_final
					 */
					final /*@NonInvalid*/ boolean is_final = t.isIs_final();
					//
					if (is_final) {			// Carry on till something found
						if (accumulator) {
							result = false;
							break;
						}
						else {
							accumulator = true;
						}
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, TwitterQAModelTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
			case TwitterQAModelPackage.GAME__WELCOME_MSG:
				return getWelcome_msg();
			case TwitterQAModelPackage.GAME__PLAYERS:
				return getPlayers();
			case TwitterQAModelPackage.GAME__CITY:
				return getCity();
			case TwitterQAModelPackage.GAME__TESTS:
				return getTests();
			case TwitterQAModelPackage.GAME__ID:
				return getId();
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
			case TwitterQAModelPackage.GAME__WELCOME_MSG:
				setWelcome_msg((String)newValue);
				return;
			case TwitterQAModelPackage.GAME__PLAYERS:
				getPlayers().clear();
				getPlayers().addAll((Collection<? extends Player>)newValue);
				return;
			case TwitterQAModelPackage.GAME__CITY:
				setCity((String)newValue);
				return;
			case TwitterQAModelPackage.GAME__TESTS:
				getTests().clear();
				getTests().addAll((Collection<? extends Test>)newValue);
				return;
			case TwitterQAModelPackage.GAME__ID:
				setId((String)newValue);
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
			case TwitterQAModelPackage.GAME__WELCOME_MSG:
				setWelcome_msg(WELCOME_MSG_EDEFAULT);
				return;
			case TwitterQAModelPackage.GAME__PLAYERS:
				getPlayers().clear();
				return;
			case TwitterQAModelPackage.GAME__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case TwitterQAModelPackage.GAME__TESTS:
				getTests().clear();
				return;
			case TwitterQAModelPackage.GAME__ID:
				setId(ID_EDEFAULT);
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
			case TwitterQAModelPackage.GAME__WELCOME_MSG:
				return WELCOME_MSG_EDEFAULT == null ? welcome_msg != null : !WELCOME_MSG_EDEFAULT.equals(welcome_msg);
			case TwitterQAModelPackage.GAME__PLAYERS:
				return players != null && !players.isEmpty();
			case TwitterQAModelPackage.GAME__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case TwitterQAModelPackage.GAME__TESTS:
				return tests != null && !tests.isEmpty();
			case TwitterQAModelPackage.GAME__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TwitterQAModelPackage.GAME___INITIAL_TEST__DIAGNOSTICCHAIN_MAP:
				return initial_test((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TwitterQAModelPackage.GAME___FINAL_TEST__DIAGNOSTICCHAIN_MAP:
				return final_test((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (welcome_msg: ");
		result.append(welcome_msg);
		result.append(", city: ");
		result.append(city);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //GameImpl
