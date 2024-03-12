package association2;

import java.util.Random;
import java.util.Scanner;

public class emp {

	public void createEmp() {
		
		Scanner sc= new Scanner(System.in);
		
		 System.out.println("Enter employee name:");
	        String name = sc.nextLine();

	        System.out.println("Enter employee location:");
	        String location = sc.nextLine();

	        System.out.println("Enter employee mob number:");
	        Random rm= new Random();
	        int mob = Integer.parseInt(sc.nextLine());

	        System.out.println("Enter employee ot:");
	        int ot = Integer.parseInt(sc.nextLine());


			System.out.println("please enter the option");
			
			System.out.print("1- for logistic");
			System.out.print("   2- for production");
			System.out.println();
			
		int option = 1;

		switch (sc.nextInt()) {
		case 1: {

			logistic log1= new logistic(name, location, mob, ot);
			
			log1.addLogisticStaff(log1);
			log1.displayLogisticDetails();
			
			System.out.println("employee is created ");
			
			
			break;
		}
		case 2: {

			break;
		}
		case 3: {

			break;		}
		case 4: {

			break;		}
	}
}
	}
