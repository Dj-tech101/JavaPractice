package inheritance;

public class test {

	public static void main(String[] args) {
		
	
		pappu p= new pappu();
		
		parent p1= new parent();
		
		parent c1=new pappu();
		
	
		
		System.out.println(p.educatiion);
		
		p.happyLife();
		
		System.out.println("---------- parent ----");
		
		System.out.println(p1.bodyParts);
		
		p1.happyLife();
		
		System.out.println("------------- child same calling-");
		
		c1.happyLife();

		 
		System.out.println(c1.bodyParts);
		
		
		
	}
}
