package bankingSuperKeywordExample;

public class bankAccount {

	 double balence ;

	public bankAccount(double balence) {
		super();
		this.balence = balence;
	}
	
	public void deposite(double amount) {
		
		balence+=amount;
		
		System.out.println(balence);
	}
	
	public void withdraw(double amount) {
		balence-=amount;
		
		System.out.println(balence);
		
	}
}
