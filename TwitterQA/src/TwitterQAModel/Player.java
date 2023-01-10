/**
 */
package TwitterQAModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TwitterQAModel.Player#getId <em>Id</em>}</li>
 *   <li>{@link TwitterQAModel.Player#getPoints <em>Points</em>}</li>
 *   <li>{@link TwitterQAModel.Player#getCurrent_test <em>Current test</em>}</li>
 *   <li>{@link TwitterQAModel.Player#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see TwitterQAModel.TwitterQAModelPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getPlayer_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Player#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(int)
	 * @see TwitterQAModel.TwitterQAModelPackage#getPlayer_Points()
	 * @model required="true"
	 * @generated
	 */
	int getPoints();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Player#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(int value);

	/**
	 * Returns the value of the '<em><b>Current test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current test</em>' reference.
	 * @see #setCurrent_test(Test)
	 * @see TwitterQAModel.TwitterQAModelPackage#getPlayer_Current_test()
	 * @model
	 * @generated
	 */
	Test getCurrent_test();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Player#getCurrent_test <em>Current test</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current test</em>' reference.
	 * @see #getCurrent_test()
	 * @generated
	 */
	void setCurrent_test(Test value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getPlayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Player#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Player
