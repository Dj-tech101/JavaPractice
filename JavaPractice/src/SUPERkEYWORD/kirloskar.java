package SUPERkEYWORD;

public class kirloskar extends testGen {

	int voltage=315;

	private void displayVoltage() {

		
		System.out.println("kirloskar volatge "+voltage);
	
		//super.checkPressuresendsor();
		
		System.out.println("comman pressure is "+super.commanPressure);
		
	}
	
	
	public static void main(String[] args) {
		
		
		kirloskar controller=new kirloskar();
		
		controller.displayVoltage();
	}
	
}
