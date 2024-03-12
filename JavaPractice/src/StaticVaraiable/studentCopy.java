package StaticVaraiable;

import java.util.Calendar;

public class studentCopy {

	
	String address="normal 1";
	
	public studentCopy() {
		
		System.out.println("check the name ");
	}

	public studentCopy(String msg) {
		
		String address="normal 2";
		
		
		this.address=address;
		
	}
	public void caller () {
		
		System.out.println(this.address);
	}
	
	public static void cheker() {
	}
	public static void main(String[] args) {
		
	
		
		
	}
}
