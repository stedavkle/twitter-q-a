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
 *   <li>{@link TwitterQAModel.Test#getT_limit <em>Tlimit</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getQuestion <em>Question</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getAttempts <em>Attempts</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getHints <em>Hints</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getPoints <em>Points</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getAnswers <em>Answers</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getOn_correct <em>On correct</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getOn_fail <em>On fail</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getOn_timeout <em>On timeout</em>}</li>
 *   <li>{@link TwitterQAModel.Test#getLocation <em>Location</em>}</li>
 *   <li>{@link TwitterQAModel.Test#isIs_initial <em>Is initial</em>}</li>
 *   <li>{@link TwitterQAModel.Test#isIs_final <em>Is final</em>}</li>
 * </ul>
 *
 * @see TwitterQAModel.TwitterQAModelPackage#getTest()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='initial_test'"
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
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Tlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tlimit</em>' attribute.
	 * @see #setT_limit(int)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTest_T_limit()
	 * @model required="true"
	 * @generated
	 */
	int getT_limit();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Test#getT_limit <em>Tlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tlimit</em>' attribute.
	 * @see #getT_limit()
	 * @generated
	 */
	void setT_limit(int value);

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
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(int)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTest_Points()
	 * @model required="true"
	 * @generated
	 */
	int getPoints();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Test#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(int value);

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
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTest_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Test#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Is initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is initial</em>' attribute.
	 * @see #setIs_initial(boolean)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTest_Is_initial()
	 * @model required="true"
	 * @generated
	 */
	boolean isIs_initial();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Test#isIs_initial <em>Is initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is initial</em>' attribute.
	 * @see #isIs_initial()
	 * @generated
	 */
	void setIs_initial(boolean value);

	/**
	 * Returns the value of the '<em><b>Is final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is final</em>' attribute.
	 * @see #setIs_final(boolean)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTest_Is_final()
	 * @model required="true"
	 * @generated
	 */
	boolean isIs_final();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Test#isIs_final <em>Is final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is final</em>' attribute.
	 * @see #isIs_final()
	 * @generated
	 */
	void setIs_final(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif is_final then\n\t\t\t\ton_correct.oclIsUndefined() and on_fail.oclIsUndefined()\n\t\t\telse\n\t\t\t\ton_correct.oclIsTypeOf(Test)\n\t\t\tendif'"
	 * @generated
	 */
	boolean initial_test(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Test
