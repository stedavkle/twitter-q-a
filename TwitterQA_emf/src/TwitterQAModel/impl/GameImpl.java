/**
 */
package TwitterQAModel.impl;

import TwitterQAModel.Game;
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
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TwitterQAModel.impl.GameImpl#getName <em>Name</em>}</li>
 *   <li>{@link TwitterQAModel.impl.GameImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link TwitterQAModel.impl.GameImpl#getInitial_test <em>Initial test</em>}</li>
 *   <li>{@link TwitterQAModel.impl.GameImpl#getTests <em>Tests</em>}</li>
 *   <li>{@link TwitterQAModel.impl.GameImpl#getCity <em>City</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getInitial_test() <em>Initial test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial_test()
	 * @generated
	 * @ordered
	 */
	protected Test initial_test;

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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.GAME__NAME, oldName, name));
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
	public Test getInitial_test() {
		return initial_test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitial_test(Test newInitial_test, NotificationChain msgs) {
		Test oldInitial_test = initial_test;
		initial_test = newInitial_test;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.GAME__INITIAL_TEST, oldInitial_test, newInitial_test);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial_test(Test newInitial_test) {
		if (newInitial_test != initial_test) {
			NotificationChain msgs = null;
			if (initial_test != null)
				msgs = ((InternalEObject)initial_test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TwitterQAModelPackage.GAME__INITIAL_TEST, null, msgs);
			if (newInitial_test != null)
				msgs = ((InternalEObject)newInitial_test).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TwitterQAModelPackage.GAME__INITIAL_TEST, null, msgs);
			msgs = basicSetInitial_test(newInitial_test, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.GAME__INITIAL_TEST, newInitial_test, newInitial_test));
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
	public boolean no_order_twice(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Game::no_order_twice";
		try {
			/**
			 *
			 * inv no_order_twice:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = tests->isUnique(t | t.order) and
			 *         tests->forAll(t | t.order > 0)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, TwitterQAModelPackage.Literals.GAME___NO_ORDER_TWICE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, TwitterQAModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Test> tests_0 = this.getTests();
					final /*@NonInvalid*/ OrderedSetValue BOXED_tests_0 = idResolver.createOrderedSetOfAll(TwitterQAModelTables.ORD_CLSSid_Test, tests_0);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(TwitterQAModelTables.ORD_CLSSid_Test);
					Iterator<Object> ITERATOR_t = BOXED_tests_0.iterator();
					/*@NonInvalid*/ boolean isUnique;
					while (true) {
						if (!ITERATOR_t.hasNext()) {
							isUnique = true;
							break;
						}
						/*@NonInvalid*/ Test t = (Test)ITERATOR_t.next();
						/**
						 * t.order
						 */
						final /*@NonInvalid*/ int order = t.getOrder();
						final /*@NonInvalid*/ IntegerValue BOXED_order = ValueUtil.integerValueOf(order);
						//
						if (accumulator.includes(BOXED_order) == ValueUtil.TRUE_VALUE) {
							isUnique = false;
							break;			// Abort after second find
						}
						else {
							accumulator.add(BOXED_order);
						}
					}
					final /*@Thrown*/ Boolean result;
					if (!isUnique) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_t_0 = BOXED_tests_0.iterator();
						/*@NonInvalid*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_t_0.hasNext()) {
								if (accumulator_0 == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ Test t_0 = (Test)ITERATOR_t_0.next();
							/**
							 * t.order > 0
							 */
							final /*@NonInvalid*/ int order_0 = t_0.getOrder();
							final /*@NonInvalid*/ IntegerValue BOXED_order_0 = ValueUtil.integerValueOf(order_0);
							final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_order_0, TwitterQAModelTables.INT_0).booleanValue();
							//
							if (!gt) {					// Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break;														// Stop immediately
							}
							else if (gt) {				// Normal successful body evaluation result
								;															// Carry on
							}
							else {															// Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						if (forAll == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							if (forAll == null) {
								result = null;
							}
							else {
								result = ValueUtil.TRUE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, TwitterQAModelTables.INT_0).booleanValue();
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
	public boolean no_jump_back_correct(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Game::no_jump_back_correct";
		try {
			/**
			 *
			 * inv no_jump_back_correct:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = let
			 *           not_final_tests : OrderedSet(TwitterQAModel::Test) = tests->select(t |
			 *             t.on_correct.oclIsUndefined() = false)
			 *         in
			 *           not_final_tests->forAll(t | t.on_correct.order > t.order)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, TwitterQAModelPackage.Literals.GAME___NO_JUMP_BACK_CORRECT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, TwitterQAModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_forAll;
				try {
					final /*@NonInvalid*/ List<Test> tests = this.getTests();
					final /*@NonInvalid*/ OrderedSetValue BOXED_tests = idResolver.createOrderedSetOfAll(TwitterQAModelTables.ORD_CLSSid_Test, tests);
					/*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(TwitterQAModelTables.ORD_CLSSid_Test);
					Iterator<Object> ITERATOR_t = BOXED_tests.iterator();
					/*@NonInvalid*/ OrderedSetValue not_final_tests;
					while (true) {
						if (!ITERATOR_t.hasNext()) {
							not_final_tests = accumulator;
							break;
						}
						/*@NonInvalid*/ Test t = (Test)ITERATOR_t.next();
						/**
						 * t.on_correct.oclIsUndefined() = false
						 */
						final /*@NonInvalid*/ Test on_correct = t.getOn_correct();
						final /*@NonInvalid*/ boolean oclIsUndefined = on_correct == null;
						final /*@NonInvalid*/ boolean eq = !oclIsUndefined;
						//
						if (eq) {
							accumulator.add(t);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_t_0 = not_final_tests.iterator();
					/*@Thrown*/ Boolean forAll;
					while (true) {
						if (!ITERATOR_t_0.hasNext()) {
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								forAll = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ Test t_0 = (Test)ITERATOR_t_0.next();
						/**
						 * t.on_correct.order > t.order
						 */
						/*@Caught*/ Object CAUGHT_gt;
						try {
							final /*@NonInvalid*/ Test on_correct_0 = t_0.getOn_correct();
							if (on_correct_0 == null) {
								throw new InvalidValueException("Null source for \'\'TwitterQA_emf/model/TwitterQA.ecore\'::Test::order\'");
							}
							final /*@Thrown*/ int order = on_correct_0.getOrder();
							final /*@Thrown*/ IntegerValue BOXED_order = ValueUtil.integerValueOf(order);
							final /*@NonInvalid*/ int order_0 = t_0.getOrder();
							final /*@NonInvalid*/ IntegerValue BOXED_order_0 = ValueUtil.integerValueOf(order_0);
							final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_order, BOXED_order_0).booleanValue();
							CAUGHT_gt = gt;
						}
						catch (Exception e) {
							CAUGHT_gt = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_gt == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							forAll = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_gt == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_gt instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator_0 = CAUGHT_gt;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_forAll = forAll;
				}
				catch (Exception e) {
					CAUGHT_forAll = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_forAll, TwitterQAModelTables.INT_0).booleanValue();
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
	public boolean initial_order_zero(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Game::initial_order_zero";
		try {
			/**
			 *
			 * inv initial_order_zero:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = initial_test.order = 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, TwitterQAModelPackage.Literals.GAME___INITIAL_ORDER_ZERO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, TwitterQAModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ Test initial_test = this.getInitial_test();
				final /*@NonInvalid*/ int order = initial_test.getOrder();
				final /*@NonInvalid*/ IntegerValue BOXED_order = ValueUtil.integerValueOf(order);
				final /*@NonInvalid*/ boolean result = BOXED_order.equals(TwitterQAModelTables.INT_0);
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
	public boolean no_jump_back_timeout(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Game::no_jump_back_timeout";
		try {
			/**
			 *
			 * inv no_jump_back_timeout:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = let
			 *           not_final_tests : OrderedSet(TwitterQAModel::Test) = tests->select(t |
			 *             t.on_timeout.oclIsUndefined() = false)
			 *         in
			 *           not_final_tests->forAll(t | t.on_timeout.order > t.order)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, TwitterQAModelPackage.Literals.GAME___NO_JUMP_BACK_TIMEOUT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, TwitterQAModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_forAll;
				try {
					final /*@NonInvalid*/ List<Test> tests = this.getTests();
					final /*@NonInvalid*/ OrderedSetValue BOXED_tests = idResolver.createOrderedSetOfAll(TwitterQAModelTables.ORD_CLSSid_Test, tests);
					/*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(TwitterQAModelTables.ORD_CLSSid_Test);
					Iterator<Object> ITERATOR_t = BOXED_tests.iterator();
					/*@NonInvalid*/ OrderedSetValue not_final_tests;
					while (true) {
						if (!ITERATOR_t.hasNext()) {
							not_final_tests = accumulator;
							break;
						}
						/*@NonInvalid*/ Test t = (Test)ITERATOR_t.next();
						/**
						 * t.on_timeout.oclIsUndefined() = false
						 */
						final /*@NonInvalid*/ Test on_timeout = t.getOn_timeout();
						final /*@NonInvalid*/ boolean oclIsUndefined = on_timeout == null;
						final /*@NonInvalid*/ boolean eq = !oclIsUndefined;
						//
						if (eq) {
							accumulator.add(t);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_t_0 = not_final_tests.iterator();
					/*@Thrown*/ Boolean forAll;
					while (true) {
						if (!ITERATOR_t_0.hasNext()) {
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								forAll = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ Test t_0 = (Test)ITERATOR_t_0.next();
						/**
						 * t.on_timeout.order > t.order
						 */
						/*@Caught*/ Object CAUGHT_gt;
						try {
							final /*@NonInvalid*/ Test on_timeout_0 = t_0.getOn_timeout();
							if (on_timeout_0 == null) {
								throw new InvalidValueException("Null source for \'\'TwitterQA_emf/model/TwitterQA.ecore\'::Test::order\'");
							}
							final /*@Thrown*/ int order = on_timeout_0.getOrder();
							final /*@Thrown*/ IntegerValue BOXED_order = ValueUtil.integerValueOf(order);
							final /*@NonInvalid*/ int order_0 = t_0.getOrder();
							final /*@NonInvalid*/ IntegerValue BOXED_order_0 = ValueUtil.integerValueOf(order_0);
							final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_order, BOXED_order_0).booleanValue();
							CAUGHT_gt = gt;
						}
						catch (Exception e) {
							CAUGHT_gt = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_gt == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							forAll = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_gt == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_gt instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator_0 = CAUGHT_gt;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_forAll = forAll;
				}
				catch (Exception e) {
					CAUGHT_forAll = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_forAll, TwitterQAModelTables.INT_0).booleanValue();
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
	public boolean no_jump_back_fail(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Game::no_jump_back_fail";
		try {
			/**
			 *
			 * inv no_jump_back_fail:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = let
			 *           not_final_tests : OrderedSet(TwitterQAModel::Test) = tests->select(t |
			 *             t.on_fail.oclIsUndefined() = false)
			 *         in
			 *           not_final_tests->forAll(t | t.on_fail.order > t.order)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, TwitterQAModelPackage.Literals.GAME___NO_JUMP_BACK_FAIL__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, TwitterQAModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_forAll;
				try {
					final /*@NonInvalid*/ List<Test> tests = this.getTests();
					final /*@NonInvalid*/ OrderedSetValue BOXED_tests = idResolver.createOrderedSetOfAll(TwitterQAModelTables.ORD_CLSSid_Test, tests);
					/*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(TwitterQAModelTables.ORD_CLSSid_Test);
					Iterator<Object> ITERATOR_t = BOXED_tests.iterator();
					/*@NonInvalid*/ OrderedSetValue not_final_tests;
					while (true) {
						if (!ITERATOR_t.hasNext()) {
							not_final_tests = accumulator;
							break;
						}
						/*@NonInvalid*/ Test t = (Test)ITERATOR_t.next();
						/**
						 * t.on_fail.oclIsUndefined() = false
						 */
						final /*@NonInvalid*/ Test on_fail = t.getOn_fail();
						final /*@NonInvalid*/ boolean oclIsUndefined = on_fail == null;
						final /*@NonInvalid*/ boolean eq = !oclIsUndefined;
						//
						if (eq) {
							accumulator.add(t);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_t_0 = not_final_tests.iterator();
					/*@Thrown*/ Boolean forAll;
					while (true) {
						if (!ITERATOR_t_0.hasNext()) {
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								forAll = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ Test t_0 = (Test)ITERATOR_t_0.next();
						/**
						 * t.on_fail.order > t.order
						 */
						/*@Caught*/ Object CAUGHT_gt;
						try {
							final /*@NonInvalid*/ Test on_fail_0 = t_0.getOn_fail();
							if (on_fail_0 == null) {
								throw new InvalidValueException("Null source for \'\'TwitterQA_emf/model/TwitterQA.ecore\'::Test::order\'");
							}
							final /*@Thrown*/ int order = on_fail_0.getOrder();
							final /*@Thrown*/ IntegerValue BOXED_order = ValueUtil.integerValueOf(order);
							final /*@NonInvalid*/ int order_0 = t_0.getOrder();
							final /*@NonInvalid*/ IntegerValue BOXED_order_0 = ValueUtil.integerValueOf(order_0);
							final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_order, BOXED_order_0).booleanValue();
							CAUGHT_gt = gt;
						}
						catch (Exception e) {
							CAUGHT_gt = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_gt == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							forAll = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_gt == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_gt instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator_0 = CAUGHT_gt;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_forAll = forAll;
				}
				catch (Exception e) {
					CAUGHT_forAll = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_forAll, TwitterQAModelTables.INT_0).booleanValue();
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
	public boolean initial_on_correct_notnull(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Game::initial_on_correct_notnull";
		try {
			/**
			 *
			 * inv initial_on_correct_notnull:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = not initial_test.on_correct.oclIsUndefined()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, TwitterQAModelPackage.Literals.GAME___INITIAL_ON_CORRECT_NOTNULL__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, TwitterQAModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ Test initial_test = this.getInitial_test();
				final /*@NonInvalid*/ Test on_correct = initial_test.getOn_correct();
				final /*@NonInvalid*/ boolean oclIsUndefined = on_correct == null;
				final /*@NonInvalid*/ Boolean result;
				if (!oclIsUndefined) {
					result = ValueUtil.TRUE_VALUE;
				}
				else {
					if (oclIsUndefined) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						result = null;
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
			case TwitterQAModelPackage.GAME__INITIAL_TEST:
				return basicSetInitial_test(null, msgs);
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
			case TwitterQAModelPackage.GAME__NAME:
				return getName();
			case TwitterQAModelPackage.GAME__DESCRIPTION:
				return getDescription();
			case TwitterQAModelPackage.GAME__INITIAL_TEST:
				return getInitial_test();
			case TwitterQAModelPackage.GAME__TESTS:
				return getTests();
			case TwitterQAModelPackage.GAME__CITY:
				return getCity();
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
			case TwitterQAModelPackage.GAME__NAME:
				setName((String)newValue);
				return;
			case TwitterQAModelPackage.GAME__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TwitterQAModelPackage.GAME__INITIAL_TEST:
				setInitial_test((Test)newValue);
				return;
			case TwitterQAModelPackage.GAME__TESTS:
				getTests().clear();
				getTests().addAll((Collection<? extends Test>)newValue);
				return;
			case TwitterQAModelPackage.GAME__CITY:
				setCity((String)newValue);
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
			case TwitterQAModelPackage.GAME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TwitterQAModelPackage.GAME__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TwitterQAModelPackage.GAME__INITIAL_TEST:
				setInitial_test((Test)null);
				return;
			case TwitterQAModelPackage.GAME__TESTS:
				getTests().clear();
				return;
			case TwitterQAModelPackage.GAME__CITY:
				setCity(CITY_EDEFAULT);
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
			case TwitterQAModelPackage.GAME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TwitterQAModelPackage.GAME__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TwitterQAModelPackage.GAME__INITIAL_TEST:
				return initial_test != null;
			case TwitterQAModelPackage.GAME__TESTS:
				return tests != null && !tests.isEmpty();
			case TwitterQAModelPackage.GAME__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
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
			case TwitterQAModelPackage.GAME___NO_ORDER_TWICE__DIAGNOSTICCHAIN_MAP:
				return no_order_twice((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TwitterQAModelPackage.GAME___NO_JUMP_BACK_CORRECT__DIAGNOSTICCHAIN_MAP:
				return no_jump_back_correct((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TwitterQAModelPackage.GAME___INITIAL_ORDER_ZERO__DIAGNOSTICCHAIN_MAP:
				return initial_order_zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TwitterQAModelPackage.GAME___NO_JUMP_BACK_TIMEOUT__DIAGNOSTICCHAIN_MAP:
				return no_jump_back_timeout((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TwitterQAModelPackage.GAME___NO_JUMP_BACK_FAIL__DIAGNOSTICCHAIN_MAP:
				return no_jump_back_fail((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TwitterQAModelPackage.GAME___INITIAL_ON_CORRECT_NOTNULL__DIAGNOSTICCHAIN_MAP:
				return initial_on_correct_notnull((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", city: ");
		result.append(city);
		result.append(')');
		return result.toString();
	}

} //GameImpl
