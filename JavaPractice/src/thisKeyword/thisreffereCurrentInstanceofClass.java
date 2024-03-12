package thisKeyword;

public class thisreffereCurrentInstanceofClass {

	String name;
	
	String address;
	 int id =495656;
	
	
	public  void details(String name ,String address) {
		
		
	
		
		int id=2323;
		
		
		// to refere the current instance members  and we need to get that 
	    // we use the this keyword
		
		System.out.println(this.name);
		System.out.println(address);
		System.out.println(this.id);
	}
	
	public static void main(String[] args) {
		
		thisreffereCurrentInstanceofClass a= new thisreffereCurrentInstanceofClass()
				;
		
		a.details("mahesh","tetsvyefef");
	}
}
