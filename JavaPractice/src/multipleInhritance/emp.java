package multipleInhritance;

public class emp implements staff,companyPolicy{

	@Override
	public void regularAttendance(int attendence) {
		// TODO Auto-generated method stub
		System.out.println("emp attendence is "+attendence);
	}

	@Override
	public void empDetails(String n, String a, long mob) {
		// TODO Auto-generated method stub
		
		System.out.println("emp name "+n);
		
		System.out.println("emp address "+a);
		System.out.println("emp mob "+mob);
		
		System.out.println("-----------------------");


	}

	
	
    public static void pay(int amount) {
		
		System.out.println(amount+"  on emp class");
	}
//	@Override
//	public void pay(int amount) {
//		
//		System.out.println("emp amount is "+amount);
//	}

	@Override
	public void designation() {
		// TODO Auto-generated method stub
		
		System.out.println("working as  driver");
	}

	
	public static void main(String[] args) {
		
		emp e= new emp()
				;
		
	}
	
	
}
