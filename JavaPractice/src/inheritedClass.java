
public class inheritedClass extends accessControl {

	public void name() {

		
		//it throws an compile time error 
		
		//System.out.println(a);
	}

	
	
	public static void main(String[] args) {
		inheritedClass caller = new inheritedClass();

		caller.name();
	}
}
