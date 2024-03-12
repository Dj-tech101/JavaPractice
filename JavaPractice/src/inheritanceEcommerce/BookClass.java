package inheritanceEcommerce;

public class BookClass extends product {
	public String authoredBy;
	public String specification;
	
	
	public BookClass(String productName,String authoredBy,String specification,double productPrice) {
		super(productName, productPrice);
		// TODO Auto-generated constructor stub
	}
	
	public String getAuthoredBy() {
		return authoredBy;
	}
	public void setAuthoredBy(String authoredBy) {
		this.authoredBy = authoredBy;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	
	
	
}
