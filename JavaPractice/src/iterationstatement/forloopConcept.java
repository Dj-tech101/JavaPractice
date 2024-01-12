package iterationstatement;

import java.util.Iterator;

public class forloopConcept {

	void forloopstate() {

		int i = 5, j = 2, count = 1;

		for (; i <= 10; i++) {

			System.out.println("value of i :" + j);
			j = i;

			count++;

		}
		System.out.println("--------------");
		System.out.println("count of loop is: " + count);
	}

	void method1() {

		int i = 2;
		for (; true;) {
			// by default compiler decide its true

			System.out.println("ptint value i:" + i);

		}
		// will not execute the unreachable code
		// System.out.println("--------------");

	}

	void method2() {

		int i = 2;
		for (; true;) {
			// by default compiler decide its true

			System.out.println("print value i:" + i);
			break;

		}
		// will not execute the unreachable code
		System.out.println("--------------");

	}

	public static void main(String[] args) {

		forloopConcept call = new forloopConcept();

		// call.forloopstate();
		// call.method1();
		call.method2();
	}
}
