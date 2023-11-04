package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr1 = new ArrayList<String>();
		List<String> arr2 = new ArrayList<String>();
		
		arr1.add("Red");
		arr1.add("Black");
		arr1.add("Blue");
		
		System.out.println(arr1);
		
		System.out.println(arr1.get(1));
		
		arr1.set(2, "White");
		System.out.println(arr1);
		
		System.out.println(arr1.indexOf("White"));
		System.out.println(arr1.lastIndexOf("White"));
		System.out.println(arr1.contains("Black"));
		
		arr2 = arr1.subList(0, 3);
		System.out.println(arr2);
		
		System.out.println(arr1.size());
		
		for(String x: arr1) {
			System.out.println(x);
		}
		
		arr1.remove(0);
		System.out.println(arr1);
		
		arr1.remove("White");
		System.out.println(arr1);
		
		arr1.clear();
		System.out.println(arr1);
		
		System.out.println(arr1.isEmpty());
	}

}
