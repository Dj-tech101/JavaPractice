package multipleInheritance;

public class executiveemployee extends employee {

	

public String namewala;

	public double bonus;
	
	
	public executiveemployee(String name, String address, long phoneNumber, int empId, double rate, double bonus) {
		super(name, address, phoneNumber, empId, rate);
		this.bonus = bonus;
	}

	public void bonusRecieved(double amount) {
		
		bonus=amount;
	}
	
	public double earning() {
		
		return super.earning()+bonus;
	}
	@Override
	public String toString() {
		return "executiveemployee [bonus=" + bonus + "]"+super.toString();
	}
	
	
	
}
