package compositionPPractice;

import java.util.ArrayList;
import java.util.List;

public class college {

	String name;
	List<Student>studentList;
	
	public college(String name) {
		super();
		this.name = name;
	}
	public void setStudentName() {
		
		Student s1= new Student("manih");
		Student s2= new Student("harish");
		Student s3= new Student("manigdjd");
		studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
	}
	public void getname() {
		
		
	}
	

	public void getStudentList() {
		
		List<String>studentNames=new ArrayList<String>()
				;
		
		for (Student student : studentList) {
			
			studentNames.add(student.getStudentName());
			
		}
		
		for (String names : studentNames) {
			
			System.out.println(names);
		}
	}
}
