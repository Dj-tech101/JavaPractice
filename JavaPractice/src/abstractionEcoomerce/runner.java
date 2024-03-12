package abstractionEcoomerce;

public class runner {

	
	public static void main(String[] args) {
		
		
		product soap=new product("lux", 40, "hindustan uniliver");
		
		product oil= new product("musteredOil", 150, "safolla");
		
		
		shoppingCartApp appcart= new shoppingImp();
		
		appcart.addItems(oil);
		appcart.addItems(soap);
		
		double total=appcart.calculateTotal();
		
		System.out.println("Your total  price is  "+total);
		
	}
}
