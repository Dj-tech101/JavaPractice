package SUPERkEYWORD;

public class mahindra extends testGen{

	int  voltage=415;
	
	
	public void displayVolatge() {
		
		
		display(this);
		
		super.displayVoltage(super.createInstance());
		
	}
	
	public void display(mahindra d) {
		
		System.out.println("my object ");
	}

	
	public static void main(String[] args) {
		
		mahindra b= new mahindra();
		b.displayVolatge();
	}
	
	
}
