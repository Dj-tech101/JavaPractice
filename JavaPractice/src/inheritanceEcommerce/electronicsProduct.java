package inheritanceEcommerce;

public class electronicsProduct extends product {

	 String manufactureBy;
	public String specification;
	
	public electronicsProduct() {
		// TODO Auto-generated constructor stub
	}
	
	public void setProductPrice(double price) {
		
		System.out.println(price);
		
	}
	public electronicsProduct(String manufactureBy,String productName,double productPrice,String specification) {
		super(productName, productPrice);
		this.manufactureBy = manufactureBy;
		this.specification = specification;
	}
	
	public String getManufactureBy() {
		return manufactureBy;
	}
	public void setManufactureBy(String manufactureBy) {
		this.manufactureBy = manufactureBy;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public static void main(String[] args) {
		
		electronicsProduct e1=
				new electronicsProduct();
		
	      e1.setProductName("manuauuauaua");
		
	}
	 
	
}
