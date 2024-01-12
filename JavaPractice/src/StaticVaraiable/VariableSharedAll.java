package StaticVaraiable;

public class VariableSharedAll {

	static String collegeName;
	
	public String myname="aaaa";
	
	
	public static void changeMethod(String name) {
		VariableSharedAll.collegeName = "srpce";

	
		System.out.println(collegeName);

	}

	public static void main(String[] args) {
		VariableSharedAll a = new VariableSharedAll();
		VariableSharedAll b = new VariableSharedAll();

		a.collegeName = "servcpe2343";

		a.myname="radhakrushna";
		
		System.out.println(b.myname);
		System.out.println(a.myname);
		
		System.out.println(b.collegeName);
	}
}
