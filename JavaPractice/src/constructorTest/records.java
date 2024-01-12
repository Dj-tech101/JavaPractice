package constructorTest;

public class records extends Persion {

	public records() {
		// TODO Auto-generated constructor stub
		this("record class");
		System.out.println("no arguments called ");
	}	

	public records(String name) {
		// TODO Auto-generated constructor stub
		//super();

		System.out.println("parameterized constructor called by super  " + name);
	}

	public static void main(String[] args) {

		records rec = new records();

	}
}	
