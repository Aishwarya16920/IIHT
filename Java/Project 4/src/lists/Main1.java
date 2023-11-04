package lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> list1 = new ArrayList <>();
		
		System.out.println("ArrayList Class: " + list1.getClass());
		
		System.out.println();
		
		System.out.println("ArrayList instance of List: " + (list1 instanceof List<?>));
		System.out.println("ArrayList instance of Collection: " + (list1 instanceof Collection<?>));
		System.out.println("ArrayList instance of Iterable: " + (list1 instanceof Iterable<?>));
		
		ArrayList <String> list2 = new ArrayList <>();
		
		list2.add("EUR");
		list2.add("USD");
		list2.add("INR");
		
		System.out.println();
		
		System.out.println(list2);
		
		System.out.println();
		
		ArrayList <Car> list3 = new ArrayList <>();
		
		list3.add(new Car("Honda", "Civic", 21000.0));
		list3.add(new Car("Toyota", "Camry", 29000.0));
		list3.add(new Car("BMW", "Civic", 65000.0));
		
		System.out.println(list3);
		
		
	}

}
