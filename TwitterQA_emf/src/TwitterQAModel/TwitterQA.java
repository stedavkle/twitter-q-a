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
 *   <li>{@link TwitterQAModel.TwitterQA#getConsumerKey <em>Consumer Key</em>}</li>
 *   <li>{@link TwitterQAModel.TwitterQA#getConsumerSecret <em>Consumer Secret</em>}</li>
 *   <li>{@link TwitterQAModel.TwitterQA#getAccessToken <em>Access Token</em>}</li>
 *   <li>{@link TwitterQAModel.TwitterQA#getAccessTokenSecret <em>Access Token Secret</em>}</li>
 *   <li>{@link TwitterQAModel.TwitterQA#getGames <em>Games</em>}</li>
 *   <li>{@link TwitterQAModel.TwitterQA#getLocations <em>Locations</em>}</li>
 *   <li>{@link TwitterQAModel.TwitterQA#getWelcomeMsg <em>Welcome Msg</em>}</li>
 * </ul>
 *
 * @see TwitterQAModel.TwitterQAModelPackage#getTwitterQA()
 * @model
 * @generated
 */
public interface TwitterQA extends EObject {
	/**
	 * Returns the value of the '<em><b>Consumer Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer Key</em>' attribute.
	 * @see #setConsumerKey(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTwitterQA_ConsumerKey()
	 * @model required="true"
	 * @generated
	 */
	String getConsumerKey();

	/**
	 * Sets the value of the '{@link TwitterQAModel.TwitterQA#getConsumerKey <em>Consumer Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer Key</em>' attribute.
	 * @see #getConsumerKey()
	 * @generated
	 */
	void setConsumerKey(String value);

	/**
	 * Returns the value of the '<em><b>Consumer Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer Secret</em>' attribute.
	 * @see #setConsumerSecret(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTwitterQA_ConsumerSecret()
	 * @model required="true"
	 * @generated
	 */
	String getConsumerSecret();

	/**
	 * Sets the value of the '{@link TwitterQAModel.TwitterQA#getConsumerSecret <em>Consumer Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer Secret</em>' attribute.
	 * @see #getConsumerSecret()
	 * @generated
	 */
	void setConsumerSecret(String value);

	/**
	 * Returns the value of the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Token</em>' attribute.
	 * @see #setAccessToken(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTwitterQA_AccessToken()
	 * @model required="true"
	 * @generated
	 */
	String getAccessToken();

	/**
	 * Sets the value of the '{@link TwitterQAModel.TwitterQA#getAccessToken <em>Access Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Token</em>' attribute.
	 * @see #getAccessToken()
	 * @generated
	 */
	void setAccessToken(String value);

	/**
	 * Returns the value of the '<em><b>Access Token Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Token Secret</em>' attribute.
	 * @see #setAccessTokenSecret(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTwitterQA_AccessTokenSecret()
	 * @model required="true"
	 * @generated
	 */
	String getAccessTokenSecret();

	/**
	 * Sets the value of the '{@link TwitterQAModel.TwitterQA#getAccessTokenSecret <em>Access Token Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Token Secret</em>' attribute.
	 * @see #getAccessTokenSecret()
	 * @generated
	 */
	void setAccessTokenSecret(String value);

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
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Welcome Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Welcome Msg</em>' attribute.
	 * @see #setWelcomeMsg(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getTwitterQA_WelcomeMsg()
	 * @model required="true"
	 * @generated
	 */
	String getWelcomeMsg();

	/**
	 * Sets the value of the '{@link TwitterQAModel.TwitterQA#getWelcomeMsg <em>Welcome Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Welcome Msg</em>' attribute.
	 * @see #getWelcomeMsg()
	 * @generated
	 */
	void setWelcomeMsg(String value);

} // TwitterQA
