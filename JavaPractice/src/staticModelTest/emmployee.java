package staticModelTest;

public class emmployee {
	
	static int a=10;
	
	int b=20;
	
	static void m1()
	{
		System.err.println("this is static method");
		
	}
	public void m2() {
		
		System.out.println("this is the non-static method");
	}
	
//	 static public  void main(String[] args) {
//		
//		 m1();
//	}
	
	static void  main(String[] args) {
		
		m1();
	}
	

}
