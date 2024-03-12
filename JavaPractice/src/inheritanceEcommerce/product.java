package inheritanceEcommerce;

public class product {

	public String productName;
	
	public  double productPrice;
	
	public product() {
		// TODO Auto-generated constructor stub
		
		this.productPrice=6565;
		
		System.out.println("welcome to kgf");
	}

	public product(String name) {
		// TODO Auto-generated constructor stub
		
		System.out.println("welcome string name");
		this.productName=name;
		
	}

	
	public product(String productName, double productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		
		System.out.println(productPrice);
		this.productPrice = productPrice;
	}
	
	
}
