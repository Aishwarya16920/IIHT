package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(16);
		arr.add(5);
		arr.add(22);
		arr.add(23);
		arr.add(1);
		
		ListIterator<Integer> list = arr.listIterator(arr.size());
		while(list.hasPrevious()) {
			System.out.println(list.previous());
		}
	}

}
