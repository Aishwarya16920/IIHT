package lists;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListsIteratorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var list = new LinkedList<Integer>(); 
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(null);
		list.add(400);
		list.add(500);
		list.add(null);
		list.add(null);
		list.add(600);
		
		ListIterator itr1 = list.listIterator();
		
		while(itr1.hasNext()) {
			if(itr1.next() == null) {
				itr1.set(0);
			}
		}
		System.out.println(list);
		
		ListIterator itr2 = list.listIterator();
		
		while(itr2.hasNext()) {
			int i = (int) itr2.next();
			if(i % 2 == 1) {
				i++;
				itr2.set(i);
			}
		}
		System.out.println(list);
		
	}

}
