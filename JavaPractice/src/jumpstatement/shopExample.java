package jumpstatement;

public class shopExample {

	public static void main(String[] args) {

		int shop = 0;

		for (shop = 1; shop <= 6; shop++) {

			if (shop == 2) {

				continue;

			}
			
			System.out.println("Rent is not collected for shop "+shop);
		}
	}
}
