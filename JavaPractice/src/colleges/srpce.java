package colleges;

import java.util.ArrayList;
import java.util.List;

public class srpce extends secondYear {

	public srpce() {
		// TODO Auto-generated constructor stub
		
		super(Studentlistcreate());

		//System.out.println("list of students ");
	}


	
	
	
	public static void main(String[] args) {

		srpce caller = new srpce();

	}

	public  static List<String> Studentlistcreate() {

		List<String> studentList = new ArrayList<String>();

		for (int i = 0; i < 4; i++) {

			studentList.add("dj" + i);
		}

		return studentList;

	}
}
