package inheritanceInsuranceDomain;

public class insurancePolicy {

	
	public long policyNumber;
	public int insurancePremium;
	
	public insurancePolicy(String custmomerName) {
		// TODO Auto-generated constructor stub
		
		System.out.println(custmomerName);
	}
	
	public insurancePolicy(int customePremium) {
		// TODO Auto-generated constructor stub
		
		System.out.println(customePremium);
	}
	
	public insurancePolicy(long policyNumber, int insurancePremium) {
		this.policyNumber = policyNumber;
		this.insurancePremium = insurancePremium;
	}
	public long getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}
	public int getInsurancePremium() {
		return insurancePremium;
	}

	public void setInsurancePremium(int insurancePremium) {
		this.insurancePremium = insurancePremium;
	}

	
	
}
