package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet_vs_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet<String>();
		h.add("Dog");
		h.add("Cat");
		h.add("Lion");
		h.add("Tiger");
		h.add("Rabbit");
		h.add("Elephant");
		
		System.out.println("Hash Set:");
		System.out.println(h);
		System.out.println();
		
		LinkedHashSet<String> l = new LinkedHashSet<String>();
		l.add("Dog");
		l.add("Cat");
		l.add("Lion");
		l.add("Tiger");
		l.add("Rabbit");
		l.add("Elephant");
		
		System.out.println("Linked Hash Set:");
		System.out.println(l);
	}

}
