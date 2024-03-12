package multipleInheritance;

public class apreciant extends staffmember{

	public apreciant(String name, String address, long phoneNumber) {
		super(name, address, phoneNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double earning() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public String toString() {
		
		return
				super.toString();
		
	}
	
	
	
}
