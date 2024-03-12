package abstractionEcoomerce;

public interface shoppingCartApp {

	public static final String shopName = "C2Shop";
	
	public abstract void addItems(product pro);
	public abstract void removeItems(product pro);
	public abstract double calculateTotal();


}
