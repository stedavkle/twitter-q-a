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

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
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
 *   <li>{@link TwitterQAModel.impl.TestImpl#getName <em>Name</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getAnswers <em>Answers</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getHints <em>Hints</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getTimelimit <em>Timelimit</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getAttempts <em>Attempts</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getReward <em>Reward</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getOn_correct <em>On correct</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getOn_timeout <em>On timeout</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getOn_fail <em>On fail</em>}</li>
 *   <li>{@link TwitterQAModel.impl.TestImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestImpl extends MinimalEObjectImpl.Container implements Test {
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
	 * The cached value of the '{@link #getOn_timeout() <em>On timeout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn_timeout()
	 * @generated
	 * @ordered
	 */
	protected Test on_timeout;

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
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TEST__NAME, oldName, name));
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
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterQAModelPackage.TEST__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean reward_positive(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Test::reward_positive";
		try {
			/**
			 *
			 * inv reward_positive:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = reward > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, TwitterQAModelPackage.Literals.TEST___REWARD_POSITIVE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, TwitterQAModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ int reward = this.getReward();
				final /*@NonInvalid*/ IntegerValue BOXED_reward = ValueUtil.integerValueOf(reward);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_reward, TwitterQAModelTables.INT_0).booleanValue();
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
	public boolean time_positive(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Test::time_positive";
		try {
			/**
			 *
			 * inv time_positive:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = timelimit > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, TwitterQAModelPackage.Literals.TEST___TIME_POSITIVE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, TwitterQAModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ int timelimit = this.getTimelimit();
				final /*@NonInvalid*/ IntegerValue BOXED_timelimit = ValueUtil.integerValueOf(timelimit);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_timelimit, TwitterQAModelTables.INT_0).booleanValue();
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
	public boolean attempts_positive(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Test::attempts_positive";
		try {
			/**
			 *
			 * inv attempts_positive:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = attempts > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, TwitterQAModelPackage.Literals.TEST___ATTEMPTS_POSITIVE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, TwitterQAModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ int attempts = this.getAttempts();
				final /*@NonInvalid*/ IntegerValue BOXED_attempts = ValueUtil.integerValueOf(attempts);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_attempts, TwitterQAModelTables.INT_0).booleanValue();
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
	public boolean order_positive(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Test::order_positive";
		try {
			/**
			 *
			 * inv order_positive:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = order >= 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, TwitterQAModelPackage.Literals.TEST___ORDER_POSITIVE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, TwitterQAModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ int order = this.getOrder();
				final /*@NonInvalid*/ IntegerValue BOXED_order = ValueUtil.integerValueOf(order);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_order, TwitterQAModelTables.INT_0).booleanValue();
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TwitterQAModelPackage.TEST__NAME:
				return getName();
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
			case TwitterQAModelPackage.TEST__ON_TIMEOUT:
				if (resolve) return getOn_timeout();
				return basicGetOn_timeout();
			case TwitterQAModelPackage.TEST__ON_FAIL:
				if (resolve) return getOn_fail();
				return basicGetOn_fail();
			case TwitterQAModelPackage.TEST__ORDER:
				return getOrder();
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
			case TwitterQAModelPackage.TEST__NAME:
				setName((String)newValue);
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
			case TwitterQAModelPackage.TEST__ON_TIMEOUT:
				setOn_timeout((Test)newValue);
				return;
			case TwitterQAModelPackage.TEST__ON_FAIL:
				setOn_fail((Test)newValue);
				return;
			case TwitterQAModelPackage.TEST__ORDER:
				setOrder((Integer)newValue);
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
			case TwitterQAModelPackage.TEST__NAME:
				setName(NAME_EDEFAULT);
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
			case TwitterQAModelPackage.TEST__ON_TIMEOUT:
				setOn_timeout((Test)null);
				return;
			case TwitterQAModelPackage.TEST__ON_FAIL:
				setOn_fail((Test)null);
				return;
			case TwitterQAModelPackage.TEST__ORDER:
				setOrder(ORDER_EDEFAULT);
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
			case TwitterQAModelPackage.TEST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
			case TwitterQAModelPackage.TEST__ON_TIMEOUT:
				return on_timeout != null;
			case TwitterQAModelPackage.TEST__ON_FAIL:
				return on_fail != null;
			case TwitterQAModelPackage.TEST__ORDER:
				return order != ORDER_EDEFAULT;
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
			case TwitterQAModelPackage.TEST___ATTEMPTS_POSITIVE__DIAGNOSTICCHAIN_MAP:
				return attempts_positive((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TwitterQAModelPackage.TEST___ORDER_POSITIVE__DIAGNOSTICCHAIN_MAP:
				return order_positive((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TwitterQAModelPackage.TEST___TIME_POSITIVE__DIAGNOSTICCHAIN_MAP:
				return time_positive((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TwitterQAModelPackage.TEST___REWARD_POSITIVE__DIAGNOSTICCHAIN_MAP:
				return reward_positive((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //TestImpl
