package date_time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FutureAndPastDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate d1 = LocalDate.now().plusMonths(3);
		System.out.println(d1);
		
		LocalDate d2 = LocalDate.now().minusMonths(3);
		System.out.println(d2);
		
		LocalDate d3 = LocalDate.now().minus(10,ChronoUnit.DECADES);
		System.out.println(d3);
		
		LocalDate d4 = LocalDate.now().plus(10,ChronoUnit.DECADES);
		System.out.println(d4);
	}

}
