package inheritance;

import inheritanceEcommerce.electronicsProduct;

public class testProtected extends electronicsProduct{

	
	public testProtected(String manufactureBy, String productName, double productPrice, String specification) {
		super(manufactureBy, productName, productPrice, specification);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		testProtected test= new testProtected("dksnvsk", "dsknsvkns", 0664, "snsnvsvs");
		
		
		
	}
}
