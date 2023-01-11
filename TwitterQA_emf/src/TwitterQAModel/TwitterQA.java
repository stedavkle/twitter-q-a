/**
 */
package TwitterQAModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Twitter QA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TwitterQAModel.TwitterQA#getConsumer_key <em>Consumer key</em>}</li>
 *   <li>{@link TwitterQAModel.TwitterQA#getConsumer_secret <em>Consumer secret</em>}</li>
 *   <li>{@link TwitterQAModel.TwitterQA#getAccess_token <em>Access token</em>}</li>
 *   <li>{@link TwitterQAModel.TwitterQA#getAccess_token_secret <em>Access token secret</em>}</li>
 *   <li>{@link TwitterQAModel.TwitterQA#getGames <em>Games</em>}</li>
 *   <li>{@link TwitterQAModel.TwitterQA#getLocations <em>Locations</em>}</li>
 *   <li>{@link TwitterQAModel.TwitterQA#getWelcome_msg <em>Welcome msg</em>}</li>
 * </ul>
 *
 * @see TwitterQAModel.TwitterQAModelPackage#getTwitterQA()
 * @model
 * @generated
 */
public interface TwitterQA extends EObject {
	/**
	 * Returns the value of the '<em><b>Consumer key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer key</em>' attribute.
	 * @see #setConsumer_key(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTwitterQA_Consumer_key()
	 * @model required="true"
	 * @generated
	 */
	String getConsumer_key();

	/**
	 * Sets the value of the '{@link TwitterQAModel.TwitterQA#getConsumer_key <em>Consumer key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer key</em>' attribute.
	 * @see #getConsumer_key()
	 * @generated
	 */
	void setConsumer_key(String value);

	/**
	 * Returns the value of the '<em><b>Consumer secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer secret</em>' attribute.
	 * @see #setConsumer_secret(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTwitterQA_Consumer_secret()
	 * @model required="true"
	 * @generated
	 */
	String getConsumer_secret();

	/**
	 * Sets the value of the '{@link TwitterQAModel.TwitterQA#getConsumer_secret <em>Consumer secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer secret</em>' attribute.
	 * @see #getConsumer_secret()
	 * @generated
	 */
	void setConsumer_secret(String value);

	/**
	 * Returns the value of the '<em><b>Access token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access token</em>' attribute.
	 * @see #setAccess_token(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTwitterQA_Access_token()
	 * @model required="true"
	 * @generated
	 */
	String getAccess_token();

	/**
	 * Sets the value of the '{@link TwitterQAModel.TwitterQA#getAccess_token <em>Access token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access token</em>' attribute.
	 * @see #getAccess_token()
	 * @generated
	 */
	void setAccess_token(String value);

	/**
	 * Returns the value of the '<em><b>Access token secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access token secret</em>' attribute.
	 * @see #setAccess_token_secret(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTwitterQA_Access_token_secret()
	 * @model required="true"
	 * @generated
	 */
	String getAccess_token_secret();

	/**
	 * Sets the value of the '{@link TwitterQAModel.TwitterQA#getAccess_token_secret <em>Access token secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access token secret</em>' attribute.
	 * @see #getAccess_token_secret()
	 * @generated
	 */
	void setAccess_token_secret(String value);

	/**
	 * Returns the value of the '<em><b>Games</b></em>' containment reference list.
	 * The list contents are of type {@link TwitterQAModel.Game}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Games</em>' containment reference list.
	 * @see TwitterQAModel.TwitterQAModelPackage#getTwitterQA_Games()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Game> getGames();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link TwitterQAModel.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see TwitterQAModel.TwitterQAModelPackage#getTwitterQA_Locations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Welcome msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Welcome msg</em>' attribute.
	 * @see #setWelcome_msg(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTwitterQA_Welcome_msg()
	 * @model required="true"
	 * @generated
	 */
	String getWelcome_msg();

	/**
	 * Sets the value of the '{@link TwitterQAModel.TwitterQA#getWelcome_msg <em>Welcome msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Welcome msg</em>' attribute.
	 * @see #getWelcome_msg()
	 * @generated
	 */
	void setWelcome_msg(String value);

} // TwitterQA
