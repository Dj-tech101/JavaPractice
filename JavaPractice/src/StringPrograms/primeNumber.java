package StringPrograms;

import jumpstatement.breakStatement;

public class primeNumber {

	
	public static void main(String[] args) {
		
		checkPrime(5);
	}
	private static void checkPrime(int a) {
		
		int flag=0;
		
		int m=a/2;;
		
		if (a==0||a==1) {
			
			System.out.println("not prime number ");
		}
		else {
			for (int i = 2; i <=m; i++) {
				
				if (a%i==0) {
					System.out.println(a+" is not prime number ");
					flag=1;
					break;
				}
			}
			
			if (flag==0) {
				
				System.out.println("");
			}
		}
		
	}
}
