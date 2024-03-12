package thisKeyword;

public class thisusetoInvokeconstructor {

	
	String name;
	String address;
	 thisusetoInvokeconstructor(String name, String address) {
		this.name = name;
		this.address = address;
		
		System.out.println("me as child constructor");
	}
	 
	 {
		 
		 System.out.println("welcome ");
	 }
	
	
	
	 thisusetoInvokeconstructor() {
		 
		 this("mahesh", "pune");
		 
		 System.out.println("calling one constuctor");
		
	 }
	
	 
	 public static void main(String[] args) {
		
		 thisusetoInvokeconstructor a= new thisusetoInvokeconstructor()
				 ;
		 
		
	}
}
