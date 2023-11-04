package date_time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class FutureAndPastTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime t1 = LocalTime.now().plusHours(1);
		System.out.println(t1);
		
		LocalTime t2 = LocalTime.now().minusHours(1);
		System.out.println(t2);
		
		LocalTime t3 = LocalTime.now().minus(5, ChronoUnit.MINUTES);
		System.out.println(t3);
		
		LocalTime t4 = LocalTime.now().plus(5, ChronoUnit.MINUTES);
		System.out.println(t4);
		
	}

}
