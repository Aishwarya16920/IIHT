package sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set1 = new TreeSet<String>();
		
		set1.add("Rob");
		set1.add("Bob");
		set1.add("Andy");
		set1.add("Charls");
		
		System.out.println(set1);
		
		var set2 = new TreeSet<Integer>();
		
		set2.add(100);
		set2.add(10);
		set2.add(50);
		set2.add(2);
		set2.add(0);
		
		System.out.println(set2);
	}

}
