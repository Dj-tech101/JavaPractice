package StringPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class swaping {

	public static String swape(String str, int i, int j) {

		char[] b = str.toCharArray();

		// System.out.println(b.length);
		char ch;

		ch = b[i];
		b[i] = b[j];
		b[j] = ch;

		return String.valueOf(b);

	}

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<String>();
		
		
          
		String str = "ABC";

		for (int i = 0; i < str.length(); i++) {

			for (int j = 0; j < str.length(); j++) {
				
				if (!list.contains(swape(str, i, j))) {
					
					list.add(swape(str, i, j));
					
				}
			}
			
		}

		list.forEach(f->System.out.println(f));
		
	}
}
