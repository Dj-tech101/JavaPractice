package thisKeyword;

public class b {

		
		public void getOtherDetails() {
			thisUsetopassargumentCallMethod a= new thisUsetopassargumentCallMethod();
			
			System.out.println("call super method to pass argu");
			a.GETsOMEdata(this);
			
		}
		public static void main(String[] args) {

			
		b n= new b();
		
		n.getOtherDetails();

			
		}
}
