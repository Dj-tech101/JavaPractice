package StaticVaraiable;

public class block {

	static int a;

	static {

		a = 4565;

	}

	static {

		a = 30;

		System.out.println("print 0");

	}

	static {

		System.out.println("print 1");
	}

	static {

		System.out.println("this is non static block");
	}

	{

		a = 45623235;

	}

	public static void main(String[] args) {

		block d = new block();

		System.out.println(d.a);
	}

}
