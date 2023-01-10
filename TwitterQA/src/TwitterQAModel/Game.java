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
 *   <li>{@link TwitterQAModel.Game#getWelcome_msg <em>Welcome msg</em>}</li>
 *   <li>{@link TwitterQAModel.Game#getPlayers <em>Players</em>}</li>
 *   <li>{@link TwitterQAModel.Game#getCity <em>City</em>}</li>
 *   <li>{@link TwitterQAModel.Game#getTests <em>Tests</em>}</li>
 *   <li>{@link TwitterQAModel.Game#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see TwitterQAModel.TwitterQAModelPackage#getGame()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='final_test'"
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Welcome msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Welcome msg</em>' attribute.
	 * @see #setWelcome_msg(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getGame_Welcome_msg()
	 * @model required="true"
	 * @generated
	 */
	String getWelcome_msg();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Game#getWelcome_msg <em>Welcome msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Welcome msg</em>' attribute.
	 * @see #getWelcome_msg()
	 * @generated
	 */
	void setWelcome_msg(String value);

	/**
	 * Returns the value of the '<em><b>Players</b></em>' reference list.
	 * The list contents are of type {@link TwitterQAModel.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' reference list.
	 * @see TwitterQAModel.TwitterQAModelPackage#getGame_Players()
	 * @model required="true"
	 * @generated
	 */
	EList<Player> getPlayers();

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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getGame_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Game#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='tests-&gt;one(t | t.is_initial)'"
	 * @generated
	 */
	boolean initial_test(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='tests-&gt;one(t | t.is_final)'"
	 * @generated
	 */
	boolean final_test(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Game
