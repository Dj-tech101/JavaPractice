package abstractionEcoomerce;

public class product {

	String name;
	double price;
	String speci;
	public product(String name, double price, String speci) {
		super();
		this.name = name;
		this.price = price;
		this.speci = speci;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSpeci() {
		return speci;
	}
	public void setSpeci(String speci) {
		this.speci = speci;
	}
	
}
