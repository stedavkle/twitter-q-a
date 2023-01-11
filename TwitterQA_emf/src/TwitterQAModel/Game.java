/**
 */
package TwitterQAModel;

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
 *   <li>{@link TwitterQAModel.Game#getId <em>Id</em>}</li>
 *   <li>{@link TwitterQAModel.Game#getDescription <em>Description</em>}</li>
 *   <li>{@link TwitterQAModel.Game#getInitialTest <em>Initial Test</em>}</li>
 *   <li>{@link TwitterQAModel.Game#getTests <em>Tests</em>}</li>
 * </ul>
 *
 * @see TwitterQAModel.TwitterQAModelPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getGame_Id()
	 * @model id="true" required="true"
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
	 * Returns the value of the '<em><b>Initial Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Test</em>' containment reference.
	 * @see #setInitialTest(Test)
	 * @see TwitterQAModel.TwitterQAModelPackage#getGame_InitialTest()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Test getInitialTest();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Game#getInitialTest <em>Initial Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Test</em>' containment reference.
	 * @see #getInitialTest()
	 * @generated
	 */
	void setInitialTest(Test value);

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
	 * The list contents are of type {@link TwitterQAModel.Test}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference list.
	 * @see TwitterQAModel.TwitterQAModelPackage#getGame_Tests()
	 * @model containment="true"
	 * @generated
	 */
	EList<Test> getTests();

} // Game
