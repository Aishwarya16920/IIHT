package maps;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var map = new HashMap<Integer, String>();
		
		map.put(1, "Jan");
		map.put(2, "Feb");
		map.put(3, "March");
		map.put(4, "April");
		map.put(5, "May");
		
		System.out.println(map);
		
		System.out.println(map.get(2));
		
		System.out.println(map.get(23));  //null
		
		System.out.println(map.containsKey(5));
		
		map.put(4, "Sep");
		System.out.println(map);
		
		map.remove(3);
		System.out.println(map);
		
		map.remove(2, "Feb");
		System.out.println(map);
		
		var set1 = map.keySet();
		var set2 = map.values();
		var set3 = map.entrySet();
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		
		map.clear();
		System.out.println(map);
		
	}

}
