package multipleInheritance;

public class employee extends staffmember{

  
  protected int empId;
  protected  double rate;
  

public employee(String name, String address, long phoneNumber, int empId, double rate) {
	super(name, address, phoneNumber);
	this.empId = empId;
	this.rate = rate;
}

@Override
public String toString() {
	return "employee [empId=" + empId + ", rate=" + rate + "]";
}

@Override
 public double earning() {
	return rate;
}
	
}
