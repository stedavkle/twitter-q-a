/**
 */
package TwitterQAModel;

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
 *   <li>{@link TwitterQAModel.Test#getOn_wrong <em>On wrong</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getOn_failure <em>On failure</em>}</li>
 * </ul>
 *
 * @see TwitterQAModel.TwitterQAModelPackage#getTest()
 * @model
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
	 * Returns the value of the '<em><b>On wrong</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On wrong</em>' reference.
	 * @see #setOn_wrong(Test)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTest_On_wrong()
	 * @model
	 * @generated
	 */
	Test getOn_wrong();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Test#getOn_wrong <em>On wrong</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On wrong</em>' reference.
	 * @see #getOn_wrong()
	 * @generated
	 */
	void setOn_wrong(Test value);

	/**
	 * Returns the value of the '<em><b>On failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On failure</em>' reference.
	 * @see #setOn_failure(Test)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTest_On_failure()
	 * @model
	 * @generated
	 */
	Test getOn_failure();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Test#getOn_failure <em>On failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On failure</em>' reference.
	 * @see #getOn_failure()
	 * @generated
	 */
	void setOn_failure(Test value);

} // Test
