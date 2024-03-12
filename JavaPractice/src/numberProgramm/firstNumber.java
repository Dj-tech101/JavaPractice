package numberProgramm;

import java.util.ArrayList;
import java.util.List;

public class firstNumber {

	
	public static void main(String[] args) {
		
		
		int n=1325;
		
		
		
		List<Integer>myNumber=new ArrayList<Integer>();
		
		int rev=0;
		
	while(n>0) {
		int mod=n%10;
		
		rev=rev*10+mod;
		 myNumber.add(mod);
		 n=n/10;
	}
	
	System.out.println(rev);
	
	}
}
