package StaticVaraiable;

public class A {

	 private int a;
	    private float b;
	A() { System.out.println("Calling The Constructor"); }
	 
    A setint(int a)
    {
        this.a = a;
        return this;
    }
 
    float setfloat(float b)
    {
        this.b = b;
        return this.b;
    }
 
    void display()
    {
        System.out.println("Display=" + a + " " + b);
    }
}
