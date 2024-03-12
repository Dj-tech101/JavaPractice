package multipleInheritance;

public abstract class staffmember {

	String name;
	String address;
	long phoneNumber;
	public staffmember(String name, String address, long phoneNumber) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "staffmember [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}
	
	public abstract double earning();
	
}
