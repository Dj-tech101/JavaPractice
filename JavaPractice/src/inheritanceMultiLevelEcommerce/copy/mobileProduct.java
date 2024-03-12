package inheritanceMultiLevelEcommerce.copy;

public class mobileProduct extends electronicsProduct{

	public String modelName;

	public mobileProduct(String manufactureBy, String productName, double productPrice, String specification,
			String modelName) {
		super(manufactureBy, productName, productPrice, specification);
		this.modelName = modelName;
	}

	public String getModelName() {
		
		return modelName;
		
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	
	
	
	
	
	
}
