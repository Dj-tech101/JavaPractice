package inheritanceInsuranceDomain;

public class lifeInsurance extends insurancePolicy {


	

	public int policyTerm;
	public lifeInsurance(long policyNumber, int insurancePremium, int policyTerm) {
		super(policyNumber, insurancePremium);
		this.policyTerm = policyTerm;
	}
	public int getPolicyTerm() {
		return policyTerm;
	}
	public void setPolicyTerm(int policyTerm) {
		this.policyTerm = policyTerm;
	}
	
	
	
}
