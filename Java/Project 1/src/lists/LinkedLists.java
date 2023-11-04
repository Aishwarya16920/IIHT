package lists;

import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var list = new LinkedList<Double>(); 
		
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		list.add(1.4);
		list.add(1.5);
		list.add(1.6);
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		list.set(2, 3.3);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.remove(1.6);
		System.out.println(list);
		
		list.add(2, 5.9);
		System.out.println(list);
		
		System.out.println(list.indexOf(1.2));
		System.out.println(list.indexOf(1.99)); //output -1
		System.out.println(list.lastIndexOf(5.9));
		System.out.println(list.contains(1.5));
		
		System.out.println(list.subList(2, 4));
		
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		
		System.out.println(list.pollFirst());
		System.out.println(list.pollLast());
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
	}

}
