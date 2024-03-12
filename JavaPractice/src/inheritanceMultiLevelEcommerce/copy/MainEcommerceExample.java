package inheritanceMultiLevelEcommerce.copy;

public class MainEcommerceExample {
public double myprice ;
	
	public void setProductPrice(double price) {
		myprice=price ;
	}
	
	public static void main(String[] args) {
		
		mobileProduct mob= new mobileProduct("dskfsdf", "skdfsfj", 4646, "sdfndsf", "mahesh");
		
		System.out.println(mob.manufactureBy);
		
		System.out.println(mob.modelName);
		
		System.out.println(mob.productPrice);
		
	}
}
