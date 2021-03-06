/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package soamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import soamodel.DataType;
import soamodel.Entity;
import soamodel.ServiceComponent;
import soamodel.SoamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link soamodel.impl.DataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link soamodel.impl.DataTypeImpl#getExtendedBy <em>Extended By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataTypeImpl extends EObjectImpl implements DataType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtendedBy() <em>Extended By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedBy()
	 * @generated
	 * @ordered
	 */
	protected Entity extendedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SoamodelPackage.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoamodelPackage.DATA_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getExtendedBy() {
		if (extendedBy != null && extendedBy.eIsProxy()) {
			InternalEObject oldExtendedBy = (InternalEObject)extendedBy;
			extendedBy = (Entity)eResolveProxy(oldExtendedBy);
			if (extendedBy != oldExtendedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoamodelPackage.DATA_TYPE__EXTENDED_BY, oldExtendedBy, extendedBy));
			}
		}
		return extendedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetExtendedBy() {
		return extendedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedBy(Entity newExtendedBy) {
		Entity oldExtendedBy = extendedBy;
		extendedBy = newExtendedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoamodelPackage.DATA_TYPE__EXTENDED_BY, oldExtendedBy, extendedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoamodelPackage.DATA_TYPE__NAME:
				return getName();
			case SoamodelPackage.DATA_TYPE__EXTENDED_BY:
				if (resolve) return getExtendedBy();
				return basicGetExtendedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SoamodelPackage.DATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case SoamodelPackage.DATA_TYPE__EXTENDED_BY:
				setExtendedBy((Entity)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SoamodelPackage.DATA_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SoamodelPackage.DATA_TYPE__EXTENDED_BY:
				setExtendedBy((Entity)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SoamodelPackage.DATA_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SoamodelPackage.DATA_TYPE__EXTENDED_BY:
				return extendedBy != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DataTypeImpl
