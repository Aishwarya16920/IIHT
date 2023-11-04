package sets_maps;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet <String> set1 = new HashSet <String>();
		
		set1.add("Volvo");
		set1.add("BMW");
		set1.add("Ford");
		set1.add("Mazda");
		
		set1.add("BMW");
		
		set1.remove("Mazda");
		
		set1.add(null);
		
		System.out.println(set1);
		
		System.out.println(set1 instanceof HashSet);
		System.out.println(set1 instanceof Set);
		System.out.println(set1 instanceof Collection);
		System.out.println(set1 instanceof Iterable);
		
		HashSet <String> set2 = new HashSet <String>();
		
		set2.add("Yamaha");
		set2.add("Suzuki");
		set2.add("KTM");
		set2.add("BMW");
		
		System.out.println(set2);
		
		set1.addAll(set2);
		System.out.println(set1);
		
		set1.retainAll(set2);
		System.out.println(set1);
		
		set1.removeAll(set2);
		System.out.println(set1);
		
	}

}
