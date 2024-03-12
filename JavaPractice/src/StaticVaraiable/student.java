package StaticVaraiable;

public class student {

	static String studentName;
	static int rollNumber;
	
	
	
	public void details(){
		
		String studentName="mahesh";
		
		int rollNumber=2323;
		
		System.out.println("name of the student Name "+studentName);
		
		System.out.println("roll number is  "+rollNumber);
		
	}
	
public static void main(String[] args) {
	
   student s1= new student();
   //s1.details();
   
//   System.out.println(studentName);
//   System.out.println(rollNumber);
   
}


}

