package association;

public class runner {

	public static void name() {
		System.out.println("running");
	}
	
	public static void main(String[] args) {
		
		
		runner.name();
		
		building build= new building();
		
		build.setDesign();
		build.getPopDetails();
	}
}
