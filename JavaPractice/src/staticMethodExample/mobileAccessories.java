package staticMethodExample;

public class mobileAccessories extends product {


	public static void main(String[] args) {

		product p1 = new mobileAccessories();
		p1.displayModelDetails();
		
		
		p1.instanceCreate().caller();
		
	}
	
	
}
