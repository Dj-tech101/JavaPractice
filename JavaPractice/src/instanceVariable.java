
public class instanceVariable {

	public int a;

	public String name;

	public static void main(String[] args) {

		// Lets call non-static method in static main method

		instanceVariable check1 = new instanceVariable();

		
		check1.moneyCarry(1236);

	}

	public void moneyCarry(int a) {

		System.out.println("money on customer side is  " + a);
		
		System.out.println("money of the this "+this.a);

		System.out.println("name of the customer is " + name);
	}
}
