/**
 */
package TwitterQAModel.impl;

import TwitterQAModel.Location;
import TwitterQAModel.Test;
import TwitterQAModel.TwitterQAModelPackage;
import TwitterQAModel.TwitterQAModelTables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getId <em>Id</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getT_limit <em>Tlimit</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getAttempts <em>Attempts</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getHints <em>Hints</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getAnswers <em>Answers</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getOn_correct <em>On correct</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getOn_fail <em>On fail</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getOn_timeout <em>On timeout</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#isIs_initial <em>Is initial</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#isIs_final <em>Is final</em>}</li>
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
	 * The default value of the '{@link #getT_limit() <em>Tlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_limit()
	 * @generated
	 * @ordered
	 */
	protected static final int TLIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getT_limit() <em>Tlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_limit()
	 * @generated
	 * @ordered
	 */
	protected int t_limit = TLIMIT_EDEFAULT;

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
	 * The cached value of the '{@link #getHints() <em>Hints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> hints;

	/**
	 * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected int points = POINTS_EDEFAULT;

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
	 * The cached value of the '{@link #getOn_correct() <em>On correct</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn_correct()
	 * @generated
	 * @ordered
	 */
	protected Test on_correct;

	/**
	 * The cached value of the '{@link #getOn_fail() <em>On fail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn_fail()
	 * @generated
	 * @ordered
	 */
	protected Test on_fail;

	/**
	 * The cached value of the '{@link #getOn_timeout() <em>On timeout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn_timeout()
	 * @generated
	 * @ordered
	 */
	protected Test on_timeout;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The default value of the '{@link #isIs_initial() <em>Is initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_initial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INITIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_initial() <em>Is initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_initial()
	 * @generated
	 * @ordered
	 */
	protected boolean is_initial = IS_INITIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIs_final() <em>Is final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_final()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_final() <em>Is final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_final()
	 * @generated
	 * @ordered
	 */
	protected boolean is_final = IS_FINAL_EDEFAULT;

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
	public int getT_limit() {
		return t_limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT_limit(int newT_limit) {
		int oldT_limit = t_limit;
		t_limit = newT_limit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TEST__TLIMIT, oldT_limit, t_limit));
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
	public int getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(int newPoints) {
		int oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TEST__POINTS, oldPoints, points));
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
	public Test getOn_fail() {
		if (on_fail != null && on_fail.eIsProxy()) {
			InternalEObject oldOn_fail = (InternalEObject)on_fail;
			on_fail = (Test)eResolveProxy(oldOn_fail);
			if (on_fail != oldOn_fail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TwitterQAModelPackage.TEST__ON_FAIL, oldOn_fail, on_fail));
			}
		}
		return on_fail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test basicGetOn_fail() {
		return on_fail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOn_fail(Test newOn_fail) {
		Test oldOn_fail = on_fail;
		on_fail = newOn_fail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TEST__ON_FAIL, oldOn_fail, on_fail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test getOn_timeout() {
		if (on_timeout != null && on_timeout.eIsProxy()) {
			InternalEObject oldOn_timeout = (InternalEObject)on_timeout;
			on_timeout = (Test)eResolveProxy(oldOn_timeout);
			if (on_timeout != oldOn_timeout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TwitterQAModelPackage.TEST__ON_TIMEOUT, oldOn_timeout, on_timeout));
			}
		}
		return on_timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test basicGetOn_timeout() {
		return on_timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOn_timeout(Test newOn_timeout) {
		Test oldOn_timeout = on_timeout;
		on_timeout = newOn_timeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TEST__ON_TIMEOUT, oldOn_timeout, on_timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TEST__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TwitterQAModelPackage.TEST__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TwitterQAModelPackage.TEST__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TEST__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIs_initial() {
		return is_initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs_initial(boolean newIs_initial) {
		boolean oldIs_initial = is_initial;
		is_initial = newIs_initial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TEST__IS_INITIAL, oldIs_initial, is_initial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIs_final() {
		return is_final;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs_final(boolean newIs_final) {
		boolean oldIs_final = is_final;
		is_final = newIs_final;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TEST__IS_FINAL, oldIs_final, is_final));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean initial_test(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Test::initial_test";
		try {
			/**
			 *
			 * inv initial_test:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = if is_final
			 *         then on_correct.oclIsUndefined() and on_fail.oclIsUndefined()
			 *         else on_correct.oclIsTypeOf(Test)
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, TwitterQAModelPackage.Literals.TEST___INITIAL_TEST__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, TwitterQAModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Test on_correct_0 = this.getOn_correct();
					final /*@NonInvalid*/ boolean is_final = this.isIs_final();
					/*@Thrown*/ Boolean result;
					if (is_final) {
						final /*@NonInvalid*/ boolean oclIsUndefined = on_correct_0 == null;
						final /*@NonInvalid*/ Boolean and;
						if (!oclIsUndefined) {
							and = ValueUtil.FALSE_VALUE;
						}
						else {
							final /*@NonInvalid*/ Test on_fail = this.getOn_fail();
							final /*@NonInvalid*/ boolean oclIsUndefined_0 = on_fail == null;
							if (!oclIsUndefined_0) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						result = and;
					}
					else {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_TwitterQAModel_c_c_Test = idResolver.getClass(TwitterQAModelTables.CLSSid_Test, null);
						final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, on_correct_0, TYP_TwitterQAModel_c_c_Test).booleanValue();
						result = oclIsTypeOf;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterQAModelPackage.TEST__LOCATION:
				return basicSetLocation(null, msgs);
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
			case TwitterQAModelPackage.TEST__ID:
				return getId();
			case TwitterQAModelPackage.TEST__TLIMIT:
				return getT_limit();
			case TwitterQAModelPackage.TEST__QUESTION:
				return getQuestion();
			case TwitterQAModelPackage.TEST__ATTEMPTS:
				return getAttempts();
			case TwitterQAModelPackage.TEST__HINTS:
				return getHints();
			case TwitterQAModelPackage.TEST__POINTS:
				return getPoints();
			case TwitterQAModelPackage.TEST__ANSWERS:
				return getAnswers();
			case TwitterQAModelPackage.TEST__ON_CORRECT:
				if (resolve) return getOn_correct();
				return basicGetOn_correct();
			case TwitterQAModelPackage.TEST__ON_FAIL:
				if (resolve) return getOn_fail();
				return basicGetOn_fail();
			case TwitterQAModelPackage.TEST__ON_TIMEOUT:
				if (resolve) return getOn_timeout();
				return basicGetOn_timeout();
			case TwitterQAModelPackage.TEST__LOCATION:
				return getLocation();
			case TwitterQAModelPackage.TEST__IS_INITIAL:
				return isIs_initial();
			case TwitterQAModelPackage.TEST__IS_FINAL:
				return isIs_final();
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
			case TwitterQAModelPackage.TEST__TLIMIT:
				setT_limit((Integer)newValue);
				return;
			case TwitterQAModelPackage.TEST__QUESTION:
				setQuestion((String)newValue);
				return;
			case TwitterQAModelPackage.TEST__ATTEMPTS:
				setAttempts((Integer)newValue);
				return;
			case TwitterQAModelPackage.TEST__HINTS:
				getHints().clear();
				getHints().addAll((Collection<? extends String>)newValue);
				return;
			case TwitterQAModelPackage.TEST__POINTS:
				setPoints((Integer)newValue);
				return;
			case TwitterQAModelPackage.TEST__ANSWERS:
				getAnswers().clear();
				getAnswers().addAll((Collection<? extends String>)newValue);
				return;
			case TwitterQAModelPackage.TEST__ON_CORRECT:
				setOn_correct((Test)newValue);
				return;
			case TwitterQAModelPackage.TEST__ON_FAIL:
				setOn_fail((Test)newValue);
				return;
			case TwitterQAModelPackage.TEST__ON_TIMEOUT:
				setOn_timeout((Test)newValue);
				return;
			case TwitterQAModelPackage.TEST__LOCATION:
				setLocation((Location)newValue);
				return;
			case TwitterQAModelPackage.TEST__IS_INITIAL:
				setIs_initial((Boolean)newValue);
				return;
			case TwitterQAModelPackage.TEST__IS_FINAL:
				setIs_final((Boolean)newValue);
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
			case TwitterQAModelPackage.TEST__TLIMIT:
				setT_limit(TLIMIT_EDEFAULT);
				return;
			case TwitterQAModelPackage.TEST__QUESTION:
				setQuestion(QUESTION_EDEFAULT);
				return;
			case TwitterQAModelPackage.TEST__ATTEMPTS:
				setAttempts(ATTEMPTS_EDEFAULT);
				return;
			case TwitterQAModelPackage.TEST__HINTS:
				getHints().clear();
				return;
			case TwitterQAModelPackage.TEST__POINTS:
				setPoints(POINTS_EDEFAULT);
				return;
			case TwitterQAModelPackage.TEST__ANSWERS:
				getAnswers().clear();
				return;
			case TwitterQAModelPackage.TEST__ON_CORRECT:
				setOn_correct((Test)null);
				return;
			case TwitterQAModelPackage.TEST__ON_FAIL:
				setOn_fail((Test)null);
				return;
			case TwitterQAModelPackage.TEST__ON_TIMEOUT:
				setOn_timeout((Test)null);
				return;
			case TwitterQAModelPackage.TEST__LOCATION:
				setLocation((Location)null);
				return;
			case TwitterQAModelPackage.TEST__IS_INITIAL:
				setIs_initial(IS_INITIAL_EDEFAULT);
				return;
			case TwitterQAModelPackage.TEST__IS_FINAL:
				setIs_final(IS_FINAL_EDEFAULT);
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
			case TwitterQAModelPackage.TEST__TLIMIT:
				return t_limit != TLIMIT_EDEFAULT;
			case TwitterQAModelPackage.TEST__QUESTION:
				return QUESTION_EDEFAULT == null ? question != null : !QUESTION_EDEFAULT.equals(question);
			case TwitterQAModelPackage.TEST__ATTEMPTS:
				return attempts != ATTEMPTS_EDEFAULT;
			case TwitterQAModelPackage.TEST__HINTS:
				return hints != null && !hints.isEmpty();
			case TwitterQAModelPackage.TEST__POINTS:
				return points != POINTS_EDEFAULT;
			case TwitterQAModelPackage.TEST__ANSWERS:
				return answers != null && !answers.isEmpty();
			case TwitterQAModelPackage.TEST__ON_CORRECT:
				return on_correct != null;
			case TwitterQAModelPackage.TEST__ON_FAIL:
				return on_fail != null;
			case TwitterQAModelPackage.TEST__ON_TIMEOUT:
				return on_timeout != null;
			case TwitterQAModelPackage.TEST__LOCATION:
				return location != null;
			case TwitterQAModelPackage.TEST__IS_INITIAL:
				return is_initial != IS_INITIAL_EDEFAULT;
			case TwitterQAModelPackage.TEST__IS_FINAL:
				return is_final != IS_FINAL_EDEFAULT;
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
			case TwitterQAModelPackage.TEST___INITIAL_TEST__DIAGNOSTICCHAIN_MAP:
				return initial_test((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (id: ");
		result.append(id);
		result.append(", t_limit: ");
		result.append(t_limit);
		result.append(", question: ");
		result.append(question);
		result.append(", attempts: ");
		result.append(attempts);
		result.append(", hints: ");
		result.append(hints);
		result.append(", points: ");
		result.append(points);
		result.append(", answers: ");
		result.append(answers);
		result.append(", is_initial: ");
		result.append(is_initial);
		result.append(", is_final: ");
		result.append(is_final);
		result.append(')');
		return result.toString();
	}

} //TestImpl
