package StringPrograms;

import java.util.Iterator;

public class reverseString {

	
	public static void main(String[] args) {
		
		
		String name="Welecome to india ";
		
		String[] strList=name.split(" ");
		
		
		String add=""
				;
		
		int idex=1;
		
		for (int i = 0; i < strList.length; i++) {
			
		  add=add+strList[strList.length-idex];
		 
		  idex++;
		}
		
		System.out.println(add);
	}
}
