package lists;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListsIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var list = new LinkedList<Double>(); 
		
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		list.add(1.4);
		list.add(1.5);
		list.add(1.6);
		
		ListIterator itr1 = list.listIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		ListIterator itr2 = list.listIterator(1);
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		ListIterator itr3 = list.listIterator(list.size());
		while (itr3.hasPrevious()) {
			System.out.println(itr3.previous());
		}
		
	}

}
