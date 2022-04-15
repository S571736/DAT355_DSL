/**
 */
package timedStateMachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link timedStateMachine.State#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link timedStateMachine.State#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see timedStateMachine.TimedStateMachinePackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link timedStateMachine.Transition}.
	 * It is bidirectional and its opposite is '{@link timedStateMachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see timedStateMachine.TimedStateMachinePackage#getState_Incoming()
	 * @see timedStateMachine.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link timedStateMachine.Transition}.
	 * It is bidirectional and its opposite is '{@link timedStateMachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see timedStateMachine.TimedStateMachinePackage#getState_Outgoing()
	 * @see timedStateMachine.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

} // State
