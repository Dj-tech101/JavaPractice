package terneryOperator;

public class methodsCompaire {

	public static void main(String[] args) {

		methodsCompaire caller = new methodsCompaire();

		String result = "save";

		String print = (result.equals("save")) ? caller.clickonsaveButtonn() : caller.clickonClosedButton();

		System.out.println(print);

	}

	public String clickonsaveButtonn() {

		return "lets click on button";

	}

	public String clickonClosedButton() {
		
		return "lets click on closed button";

	}
}
