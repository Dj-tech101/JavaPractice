package StringPrograms;

public class dublicateCharacterPresent {

	public static void main(String[] args) {

		String name = "Dhananjay";

		char[] arr = name.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					System.out.print(arr[i]);
					System.out.print("  ");
					System.out.print(arr[j]);
					System.out.print("  ");
					System.out.println();
					if (arr[i] == arr[j]) {
						count++;
						swape(name, i, j);
					}
				}
			}
			System.out.println(arr[i]+ " count is "+count);
		}
	}
	private static void swape(String a,int i,int j) {
		
		char[] ar=a.toCharArray();
		char ch;
		ch=ar[i];
		ar[i]=ar[j];
		ar[j]=ch;
	}
}
