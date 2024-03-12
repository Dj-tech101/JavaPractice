package staticModelTest;

public class classLevelMembers {

	String MyVariable;
	
	private void mymethod() {

	System.out.println("the hhggj");
	} 
	static  {
		
		System.out.println("welcome in class level members");
	
	}
	static String variiable ;
	
	
	public static void classLevelMethod() {
		
		System.out.println("this is the class level method ");
	}
	
	public static void main(String[] args) {
		
		classLevelMembers m= new classLevelMembers();
		
		classLevelMethod();
		variiable="jgfdbfsfdsf";
		System.out.println(variiable);
		
		
	}
}
