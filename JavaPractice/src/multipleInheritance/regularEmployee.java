package multipleInheritance;

public class regularEmployee extends employee {


	public regularEmployee(String name, String address, long phoneNumber, int empId, double rate, int hourWorked) {
		super(name, address, phoneNumber, empId, rate);
		this.hourWorked = hourWorked;
	}


	int hourWorked;
	
	
	public void updateHourWork(int hr) {
		
		hourWorked+=hr;
		
	}
	
	public double earning() {
		
		return hourWorked*super.rate;
	}
	@Override
	public String toString() {
		return "regularEmployee [hourWorked=" + hourWorked + "]"+super.toString();
	}
	
	
	
}
