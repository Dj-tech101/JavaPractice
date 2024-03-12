package thisKeyword;

public class thisInvokeCurrentMethod {

	
	String name;
	String address;
	
	
	public void details (String name ) {
		int id =3468364;
		
		
		System.out.println(id );
		
		System.out.println("name "+name );
	}
	
	public void getTouch() {
		
		System.out.println("getting touch ");
		
		details("test28372932");
		
	}
	
	public static void main(String[] args) {
		
		thisInvokeCurrentMethod a= new thisInvokeCurrentMethod()
		;
		a.getTouch();
	}
}
