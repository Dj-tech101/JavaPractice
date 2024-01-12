package terneryOperator;

import BooleanDATA.booleantype1;

public class codeQuestionUseNaveen {

	public static void main(String[] args) {

		int x = 7, y = 8, z = 4;

		z = (x++ > 7) ? (y++ < 8 ? x++ : y++) : (y++ > 6 ? x-- : y--);

//		boolean type = (x++> 7) ? true : false;
		// x=7 after compare x become 8
//       y=8 after compare y become 9 
//		System.out.println(type);
		// after result z=7
		//and then x become 7
		
		// first increase x =8
		
//		boolean type = (x++ > 7) ? (y++ < 8 ? true : false) : (y++ > 6 ? true : false);
//
//
//		System.out.println(type);
		
		//after assigning x to z then it will become x-- means x=8 assign to z=8 and again x become 7
		
		
		System.out.println("value of x is" + x);//7
		System.out.println("value of y is" + y);//9
		System.out.println("value of z is" + z);//7

	}
}
