package association2;

import java.util.ArrayList;
import java.util.List;

abstract class staff {

	String name;
	String address;
	long mob;
	
	List<logistic>logisticStaff;
	List<purchase>purchaseStaff;
	List<sales>salesStaff;
	List<production>productionStaff;
	
	
	public staff(String name, String address, long mob) {
		super();
		this.name = name;
		this.address = address;
		this.mob = mob;
	}

	
//
	@Override
	public String toString() {
		return "staff [name=" + name + ", address=" + address + ", mob=" + mob + "]";
	}

	public void addLogisticStaff(logistic obj) {
		
		logisticStaff= new ArrayList<logistic>();
		
		logisticStaff.add(obj);
		
		
		
		
	}
	
	public void displayLogisticDetails() {
		
		for (logistic details : logisticStaff) {
			
			
			System.out.println(details.name);
			System.out.println(details.address);
			System.out.println(details.mob);
			System.out.println(details.ot);
			System.out.println("---------------");
		}
	}

	public abstract double earning(double amount) ;
	
}
