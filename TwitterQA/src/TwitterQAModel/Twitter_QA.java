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
 *   <li>{@link TwitterQAModel.Twitter_QA#getGames <em>Games</em>}</li>
 *   <li>{@link TwitterQAModel.Twitter_QA#getPlayers <em>Players</em>}</li>
 * </ul>
 *
 * @see TwitterQAModel.TwitterQAModelPackage#getTwitter_QA()
 * @model
 * @generated
 */
public interface Twitter_QA extends EObject {
	/**
	 * Returns the value of the '<em><b>Games</b></em>' containment reference list.
	 * The list contents are of type {@link TwitterQAModel.Game}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Games</em>' containment reference list.
	 * @see TwitterQAModel.TwitterQAModelPackage#getTwitter_QA_Games()
	 * @model containment="true"
	 * @generated
	 */
	EList<Game> getGames();

	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference list.
	 * The list contents are of type {@link TwitterQAModel.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' containment reference list.
	 * @see TwitterQAModel.TwitterQAModelPackage#getTwitter_QA_Players()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Player> getPlayers();

} // Twitter_QA
