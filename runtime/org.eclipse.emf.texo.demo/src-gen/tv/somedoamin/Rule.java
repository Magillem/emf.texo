package tv.somedoamin;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * A representation of the model object '<em><b>Rule</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "TstTx_Rule")
public class Rule {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String iD = "";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String processStep = "";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String ruleType = "";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String ruleName = "";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String condition = "";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String outcome = "";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String notes = "";

	/**
	 * Returns the value of '<em><b>ID</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>ID</b></em>' feature
	 * @generated
	 */
	public String getID() {
		return iD;
	}

	/**
	 * Sets the '{@link Rule#getID() <em>ID</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newID
	 *            the new value of the '{@link Rule#getID() ID}' feature.
	 * @generated
	 */
	public void setID(String newID) {
		iD = newID;
	}

	/**
	 * Returns the value of '<em><b>ProcessStep</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>ProcessStep</b></em>' feature
	 * @generated
	 */
	public String getProcessStep() {
		return processStep;
	}

	/**
	 * Sets the '{@link Rule#getProcessStep() <em>ProcessStep</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProcessStep
	 *            the new value of the '{@link Rule#getProcessStep()
	 *            ProcessStep}' feature.
	 * @generated
	 */
	public void setProcessStep(String newProcessStep) {
		processStep = newProcessStep;
	}

	/**
	 * Returns the value of '<em><b>RuleType</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>RuleType</b></em>' feature
	 * @generated
	 */
	public String getRuleType() {
		return ruleType;
	}

	/**
	 * Sets the '{@link Rule#getRuleType() <em>RuleType</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newRuleType
	 *            the new value of the '{@link Rule#getRuleType() RuleType}'
	 *            feature.
	 * @generated
	 */
	public void setRuleType(String newRuleType) {
		ruleType = newRuleType;
	}

	/**
	 * Returns the value of '<em><b>RuleName</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>RuleName</b></em>' feature
	 * @generated
	 */
	public String getRuleName() {
		return ruleName;
	}

	/**
	 * Sets the '{@link Rule#getRuleName() <em>RuleName</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newRuleName
	 *            the new value of the '{@link Rule#getRuleName() RuleName}'
	 *            feature.
	 * @generated
	 */
	public void setRuleName(String newRuleName) {
		ruleName = newRuleName;
	}

	/**
	 * Returns the value of '<em><b>Condition</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>Condition</b></em>' feature
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * Sets the '{@link Rule#getCondition() <em>Condition</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCondition
	 *            the new value of the '{@link Rule#getCondition() Condition}'
	 *            feature.
	 * @generated
	 */
	public void setCondition(String newCondition) {
		condition = newCondition;
	}

	/**
	 * Returns the value of '<em><b>Outcome</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>Outcome</b></em>' feature
	 * @generated
	 */
	public String getOutcome() {
		return outcome;
	}

	/**
	 * Sets the '{@link Rule#getOutcome() <em>Outcome</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newOutcome
	 *            the new value of the '{@link Rule#getOutcome() Outcome}'
	 *            feature.
	 * @generated
	 */
	public void setOutcome(String newOutcome) {
		outcome = newOutcome;
	}

	/**
	 * Returns the value of '<em><b>Notes</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>Notes</b></em>' feature
	 * @generated
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * Sets the '{@link Rule#getNotes() <em>Notes</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newNotes
	 *            the new value of the '{@link Rule#getNotes() Notes}' feature.
	 * @generated
	 */
	public void setNotes(String newNotes) {
		notes = newNotes;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Rule " + " [iD: " + getID() + "]" + " [processStep: "
				+ getProcessStep() + "]" + " [ruleType: " + getRuleType() + "]"
				+ " [ruleName: " + getRuleName() + "]" + " [condition: "
				+ getCondition() + "]" + " [outcome: " + getOutcome() + "]"
				+ " [notes: " + getNotes() + "]";
	}
}
