
public class accessControl {

	private int a=12365;
	
	private String name;
	private boolean check;

	public void Accessstatus(int a) {
		
		System.out.println("print a "+a);
		
		System.out.println("string name "+name );

	}
	public static void main(String[] args) {
			accessControl a= new accessControl();
			a.Accessstatus(120);
	}
}
