package generics;

import java.util.Calendar;
import java.util.Date;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericRepository<Integer> fifteen = new GenericRepository<>(15);
		System.out.println(fifteen);
		
		GenericRepository<Double> tenPointOne = new GenericRepository<>(10.1);
		System.out.println(tenPointOne);
		
		GenericRepository<String> helloGenerics = new GenericRepository<>("Hello Generics!");
		System.out.println(helloGenerics);
		
		GenericRepository<Date> today = new GenericRepository<>(Calendar.getInstance().getTime());
		System.out.println(today);
	}

}
