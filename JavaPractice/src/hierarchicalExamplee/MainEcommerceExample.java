package hierarchicalExamplee;

public class MainEcommerceExample {
public double myprice ;
	
	public void setProductPrice(double price) {
		
		myprice=price ;
		
	}
	public static void main(String[] args) {
		
		electronicsProduct eleProduct=
				new electronicsProduct("apple", "ipad11", 8200, "m12");
		
		
		BookClass bookProduct=
				new BookClass("neverSplit", "ramcharan", "aboutlife", 125);
		
		System.out.println(eleProduct.manufactureBy);
		System.out.println(eleProduct.getProductName());
		System.out.println(eleProduct.getManufactureBy());
		System.out.println(eleProduct.getProductPrice());
		
		
		
		
	}
}
