package StringPrograms;

import java.util.Iterator;

public class StringCharacterLentgth {

	
	public static void main(String[] args) {
		 String name ="Dhananjay";
		 
		
		 char[] chararray=name.toCharArray();
		 
		for (int i = 0; i < chararray.length; i++) {
			
			System.out.println(chararray[i]);
			
		
		}
		
		System.out.println("total size of the array is "+chararray.length);
	}
}
