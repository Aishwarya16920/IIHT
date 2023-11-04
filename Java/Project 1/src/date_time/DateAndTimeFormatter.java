package date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAndTimeFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "16-9-2000";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[MM-dd-yyyy][MMM-dd-yyyy][dd/MM/yy]");
		LocalDate d1 = LocalDate.parse(str1, formatter);
		System.out.println(d1);
	}

}
