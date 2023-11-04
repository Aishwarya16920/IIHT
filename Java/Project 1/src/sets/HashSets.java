package sets;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var set1 = new HashSet<Integer>();
		
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(10);
		set1.add(20);
		
		System.out.println(set1);
		
		set1.remove(20);
		System.out.println(set1);
		
		System.out.println(set1.contains(50));
		System.out.println(set1.size());
		
		var set2 = new HashSet<Integer>();
		
		set2.add(10);
		set2.add(40);
		set2.add(50);
		set2.add(70);
		set2.add(80);
		
		set1.addAll(set2);
		System.out.println(set1);
		
		set1.retainAll(set2);
		System.out.println(set1);
		
		set1.clear();
		System.out.println(set1);
		
		var list = new ArrayList<Integer>();
		
		list.addAll(set2);
		System.out.println(list);
	}

}
