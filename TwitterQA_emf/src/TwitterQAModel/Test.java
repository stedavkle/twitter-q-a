/**
 */
package TwitterQAModel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TwitterQAModel.Test#getId <em>Id</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getLocation <em>Location</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getQuestion <em>Question</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getAnswers <em>Answers</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getHints <em>Hints</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getTimelimit <em>Timelimit</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getAttempts <em>Attempts</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getReward <em>Reward</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getOn_correct <em>On correct</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getOn_timeout <em>On timeout</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getOn_fail <em>On fail</em>}</li>
 * </ul>
 *
 * @see TwitterQAModel.TwitterQAModelPackage#getTest()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='attempts_positive'"
 * @generated
 */
public interface Test extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTest_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Test#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTest_Location()
	 * @model required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Test#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see #setQuestion(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTest_Question()
	 * @model required="true"
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Test#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(String value);

	/**
	 * Returns the value of the '<em><b>Answers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answers</em>' attribute list.
	 * @see TwitterQAModel.TwitterQAModelPackage#getTest_Answers()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getAnswers();

	/**
	 * Returns the value of the '<em><b>Hints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hints</em>' attribute list.
	 * @see TwitterQAModel.TwitterQAModelPackage#getTest_Hints()
	 * @model
	 * @generated
	 */
	EList<String> getHints();

	/**
	 * Returns the value of the '<em><b>Timelimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timelimit</em>' attribute.
	 * @see #setTimelimit(int)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTest_Timelimit()
	 * @model required="true"
	 * @generated
	 */
	int getTimelimit();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Test#getTimelimit <em>Timelimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timelimit</em>' attribute.
	 * @see #getTimelimit()
	 * @generated
	 */
	void setTimelimit(int value);

	/**
	 * Returns the value of the '<em><b>Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attempts</em>' attribute.
	 * @see #setAttempts(int)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTest_Attempts()
	 * @model required="true"
	 * @generated
	 */
	int getAttempts();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Test#getAttempts <em>Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attempts</em>' attribute.
	 * @see #getAttempts()
	 * @generated
	 */
	void setAttempts(int value);

	/**
	 * Returns the value of the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reward</em>' attribute.
	 * @see #setReward(int)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTest_Reward()
	 * @model required="true"
	 * @generated
	 */
	int getReward();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Test#getReward <em>Reward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reward</em>' attribute.
	 * @see #getReward()
	 * @generated
	 */
	void setReward(int value);

	/**
	 * Returns the value of the '<em><b>On correct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On correct</em>' reference.
	 * @see #setOn_correct(Test)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTest_On_correct()
	 * @model
	 * @generated
	 */
	Test getOn_correct();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Test#getOn_correct <em>On correct</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On correct</em>' reference.
	 * @see #getOn_correct()
	 * @generated
	 */
	void setOn_correct(Test value);

	/**
	 * Returns the value of the '<em><b>On timeout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On timeout</em>' reference.
	 * @see #setOn_timeout(Test)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTest_On_timeout()
	 * @model
	 * @generated
	 */
	Test getOn_timeout();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Test#getOn_timeout <em>On timeout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On timeout</em>' reference.
	 * @see #getOn_timeout()
	 * @generated
	 */
	void setOn_timeout(Test value);

	/**
	 * Returns the value of the '<em><b>On fail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On fail</em>' reference.
	 * @see #setOn_fail(Test)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTest_On_fail()
	 * @model
	 * @generated
	 */
	Test getOn_fail();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Test#getOn_fail <em>On fail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On fail</em>' reference.
	 * @see #getOn_fail()
	 * @generated
	 */
	void setOn_fail(Test value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='reward &gt; 0'"
	 * @generated
	 */
	boolean reward_positive(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='timelimit &gt; 0'"
	 * @generated
	 */
	boolean time_positive(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='attempts &gt; 0'"
	 * @generated
	 */
	boolean attempts_positive(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Test
