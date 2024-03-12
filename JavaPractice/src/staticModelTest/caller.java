package staticModelTest;

public class caller {

	
	public static void main(String[] args) {
		 
		
		staticVariableTest test1= new staticVariableTest("Mahesh");
		staticVariableTest test2= new staticVariableTest("suresh");
		staticVariableTest test3= new staticVariableTest("Ganesh");

		
		System.out.println(test1.companyName);
				
		System.out.println(test2.companyName);
		
		System.out.println(test3.companyName);
		
		
		System.out.println("calling local variable ");
		
		System.out.println("--------------------");
		
		System.out.println(test1.name);
		
		System.out.println(test2.name);
		
		System.out.println(test3.name);
	}
}
