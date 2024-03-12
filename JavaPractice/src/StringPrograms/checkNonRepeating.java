package StringPrograms;

import BooleanDATA.booleantype1;

public class checkNonRepeating {

	public static void repeated(String a) {

		char[] arr = a.toCharArray();

		boolean rule;

		char t = ' ';

		for (int i = 0; i < a.length(); i++) {
			int count = 0;
			for (int j = 0; j < a.length(); j++) {

				if (i != j) {

					if (arr[i] == arr[j]) {

						// System.out.println(arr[i]+" is match with "+arr[j]);

						t = arr[i];
						
						count++;
						break;

					}
					
				}
				
				
			}
		
			
			if (count == 1) {

				System.out.println(t);
			}
		}
		
	

		
	}

	public static void main(String[] args) {

		String name = "dhana";

		repeated(name);

	}
}
