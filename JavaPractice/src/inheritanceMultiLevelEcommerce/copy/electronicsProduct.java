package inheritanceMultiLevelEcommerce.copy;


public class electronicsProduct extends product {

	 String manufactureBy;
	public String specification;
	
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
	public void productDetails() {
		System.out.println(manufactureBy);
	}
	
	
}
