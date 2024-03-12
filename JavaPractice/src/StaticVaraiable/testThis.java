package StaticVaraiable;

public class testThis {

	int n;
	
	public testThis(int n) {
		this.n=n;
	}
	 public void displayValue() {
	        System.out.println("The value is: " + this.n);
	    }

	    public void processInstance(testThis instance) {
	        System.out.println("Processing instance with value: " + instance.n);
	        // You can perform additional operations with the provided instance
	    }
	    
	    
	    public static void main(String[] args) {
			
	    testThis g1= new testThis(20);
	    
	    g1.displayValue();
	    
	    g1.processInstance(g1);
	    
	    	
		}
}
