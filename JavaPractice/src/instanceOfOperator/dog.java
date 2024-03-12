package instanceOfOperator;

public class dog extends animal {

	public void caller() {
		System.out.println("caller the method");
	}
	
	public static void main(String[] args) {
		

		animal a= new dog();
		
		dog d= new dog();
		
		dog m= (dog)a;
		
		m.caller();
		
		
		
		
		
		
		
		
	}
	
}
