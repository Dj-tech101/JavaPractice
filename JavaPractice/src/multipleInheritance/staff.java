package multipleInheritance;

import java.util.ArrayList;
import java.util.List;

public class staff {

	
	public List<staffmember>members=new ArrayList<staffmember>();
	
	
	
	public staff() {
	members.add(new executiveemployee("mahesh", "pune", 64464644, 5564, 251, 1000));
	members.add(new employee("checker", "mumbai", 54646, 5445, 6645));
	members.add(new regularEmployee("dsfsdnmfsl", "pune", 646232323, 123, 5656, 5));
	
	members.add(new apreciant("checker", "pune3", 466589));
	
	   executiveemployee emp=(executiveemployee) members.get(0);
	   
	   emp.bonusRecieved(125);
	   
	   regularEmployee reg=(regularEmployee) members.get(2);
	
	   reg.updateHourWork(465);
	}



	public void pay() {
		
		for (staffmember m : members) {
			
			System.out.println(m.toString());
			System.out.println("earning :"+m.earning());
			System.out.println("------------");
		}
		
		
	}
	
}
