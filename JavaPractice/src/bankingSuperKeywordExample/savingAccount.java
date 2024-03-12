package bankingSuperKeywordExample;

public class savingAccount extends bankAccount {

	public savingAccount(double balence) {
		super(balence);
		// TODO Auto-generated constructor stub
		
	}

	private static double feeRate=0.05;
	
	private double intrest;
	
	public void withdraw(double amount) {
		
		super.withdraw(amount+feeRate);
		
	}
	
	public static void main(String[] args) {
			
		savingAccount s= new savingAccount(1000);
		
	      s.withdraw(500);
	}
}
