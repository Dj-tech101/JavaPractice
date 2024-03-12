package localdateTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class PrintSystem {

	
	public static void main(String[] args) {
		
		LocalDate local=LocalDate.now();
		
		System.out.println(local);
		
		
		//time zone 
		
//		LocalDate localZone=LocalDate.now(ZoneId.of("delhi"));
//		System.out.println(localZone);
		
		
		SimpleDateFormat simple=new SimpleDateFormat("dd:MM:yyyy");
		
		String date=simple.format(Calendar.getInstance().getTime());
		
		System.out.println(date);

	}
}
