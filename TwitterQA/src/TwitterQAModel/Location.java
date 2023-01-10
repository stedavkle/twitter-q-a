/**
 */
package TwitterQAModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TwitterQAModel.Location#getName <em>Name</em>}</li>
 *   <li>{@link TwitterQAModel.Location#getLangitude <em>Langitude</em>}</li>
 *   <li>{@link TwitterQAModel.Location#getLatitude <em>Latitude</em>}</li>
 * </ul>
 *
 * @see TwitterQAModel.TwitterQAModelPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TwitterQAModel.TwitterQAModelPackage#getLocation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Location#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Langitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Langitude</em>' attribute.
	 * @see #setLangitude(float)
	 * @see TwitterQAModel.TwitterQAModelPackage#getLocation_Langitude()
	 * @model required="true"
	 * @generated
	 */
	float getLangitude();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Location#getLangitude <em>Langitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Langitude</em>' attribute.
	 * @see #getLangitude()
	 * @generated
	 */
	void setLangitude(float value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(float)
	 * @see TwitterQAModel.TwitterQAModelPackage#getLocation_Latitude()
	 * @model required="true"
	 * @generated
	 */
	float getLatitude();

	/**
	 * Sets the value of the '{@link TwitterQAModel.Location#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(float value);

} // Location
