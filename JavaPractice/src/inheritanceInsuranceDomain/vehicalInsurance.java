package inheritanceInsuranceDomain;

public class vehicalInsurance extends insurancePolicy {

	
	public int policyTerm;

	public vehicalInsurance() {
		// TODO Auto-generated constructor stub
		super(465454);
	}
	
	
	public vehicalInsurance(long policyNumber, int insurancePremium, int policyTerm) {
		
		super(policyNumber, insurancePremium);
		
		this.policyTerm = policyTerm;
	}

	public int getPolicyTerm() {
		
		return policyTerm;
	}

	public void setPolicyTerm(int policyTerm) {
		
		this.policyTerm = policyTerm;
	}
	
	
	public void finalPrmium() {
		
		double discount=0.05;
		
		vehicalInsurance i= new vehicalInsurance();
		
		
	}
}
