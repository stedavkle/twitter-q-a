/**
 */
package TwitterQAModel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TwitterQAModel.Game#getName <em>Name</em>}</li>
 *   <li>{@link TwitterQAModel.Game#getDescription <em>Description</em>}</li>
 *   <li>{@link TwitterQAModel.Game#getInitial_test <em>Initial test</em>}</li>
 *   <li>{@link TwitterQAModel.Game#getTests <em>Tests</em>}</li>
 *   <li>{@link TwitterQAModel.Game#getCity <em>City</em>}</li>
 * </ul>
 *
 * @see TwitterQAModel.TwitterQAModelPackage#getGame()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='no_jump_back_fail'"
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getGame_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Game#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getGame_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Game#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Initial test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial test</em>' containment reference.
	 * @see #setInitial_test(Test)
	 * @see TwitterQAModel.TwitterQAModelPackage#getGame_Initial_test()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Test getInitial_test();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Game#getInitial_test <em>Initial test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial test</em>' containment reference.
	 * @see #getInitial_test()
	 * @generated
	 */
	void setInitial_test(Test value);

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
	 * The list contents are of type {@link TwitterQAModel.Test}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference list.
	 * @see TwitterQAModel.TwitterQAModelPackage#getGame_Tests()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Test> getTests();

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getGame_City()
	 * @model required="true"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Game#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='tests-&gt;isUnique(t | t.order) and tests-&gt;forAll(t | t.order &gt; 0)'"
	 * @generated
	 */
	boolean no_order_twice(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tlet not_final_tests = tests-&gt;select(t | t.on_correct.oclIsUndefined() = false) in\n\t\t\t\tnot_final_tests-&gt;forAll(t | t.on_correct.order &gt; t.order)'"
	 * @generated
	 */
	boolean no_jump_back_correct(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='initial_test.order = 0'"
	 * @generated
	 */
	boolean initial_order_zero(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not initial_test.on_correct.oclIsUndefined()'"
	 * @generated
	 */
	boolean initial_onsuccess_notnull(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tlet not_final_tests = tests-&gt;select(t | t.on_timeout.oclIsUndefined() = false) in\n\t\t\t\tnot_final_tests-&gt;forAll(t | t.on_timeout.order &gt; t.order)'"
	 * @generated
	 */
	boolean no_jump_back_timeout(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tlet not_final_tests = tests-&gt;select(t | t.on_fail.oclIsUndefined() = false) in\n\t\t\t\tnot_final_tests-&gt;forAll(t | t.on_fail.order &gt; t.order)'"
	 * @generated
	 */
	boolean no_jump_back_fail(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Game
