package staticMethodExample;

public class product {

	
	static  String mobModel="Vivo132";
	 
	
	public void caller() {
		
		System.out.println("welcome");
	}
	
	public static   void displayModelDetails() {
		
		System.out.println("Model Name is  "+mobModel);
	}
	
	public product instanceCreate() {
		
		return new product();
		
	}
}
