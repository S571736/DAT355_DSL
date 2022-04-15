/**
 */
package timedStateMachine.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import timedStateMachine.Condition;
import timedStateMachine.TimeEvent;
import timedStateMachine.TimedStateMachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link timedStateMachine.impl.ConditionImpl#getTimer <em>Timer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends NamedElementImpl implements Condition {
	/**
	 * The cached value of the '{@link #getTimer() <em>Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer()
	 * @generated
	 * @ordered
	 */
	protected TimeEvent timer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimedStateMachinePackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEvent getTimer() {
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimer(TimeEvent newTimer, NotificationChain msgs) {
		TimeEvent oldTimer = timer;
		timer = newTimer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TimedStateMachinePackage.CONDITION__TIMER, oldTimer, newTimer);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer(TimeEvent newTimer) {
		if (newTimer != timer) {
			NotificationChain msgs = null;
			if (timer != null)
				msgs = ((InternalEObject) timer).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TimedStateMachinePackage.CONDITION__TIMER, null, msgs);
			if (newTimer != null)
				msgs = ((InternalEObject) newTimer).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TimedStateMachinePackage.CONDITION__TIMER, null, msgs);
			msgs = basicSetTimer(newTimer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimedStateMachinePackage.CONDITION__TIMER, newTimer,
					newTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TimedStateMachinePackage.CONDITION__TIMER:
			return basicSetTimer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TimedStateMachinePackage.CONDITION__TIMER:
			return getTimer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TimedStateMachinePackage.CONDITION__TIMER:
			setTimer((TimeEvent) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TimedStateMachinePackage.CONDITION__TIMER:
			setTimer((TimeEvent) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TimedStateMachinePackage.CONDITION__TIMER:
			return timer != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionImpl
