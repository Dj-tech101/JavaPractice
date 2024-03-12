package SUPERkEYWORD;

public class testGen  {

	 double commanPressure =12.5;
	 
	 int commanVolatgekIRLOSKAR=220;
	 
	 public testGen() {
		// TODO Auto-generated constructor stub
		 
		 System.out.println("i am parent constructor ");
	 }
	 
	public void checkPressuresendsor() {
		
		
		System.out.println("pressure is "+commanPressure);
         
	}
	
	
	public void displayVoltage(testGen myObject) {
		
		System.out.println(commanVolatgekIRLOSKAR);
	}
	
	
	public testGen createInstance() {
		
		return new testGen();
		
	}
}
