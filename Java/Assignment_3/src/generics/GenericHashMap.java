package generics;

import java.util.HashMap;
import java.util.Map.Entry;

public class GenericHashMap {
	
	public static void printMapKeyValues() {
		HashMap<Object, String> map = new HashMap<>();
		map.put(100000, "Integer");
		map.put(10000, "Short");
		map.put(987387728, "Long");
		map.put(16, "Byte");
		map.put(123.4, "Double");
		map.put(234.5f, "Float");
		
		for (Entry<Object, String> entry : map.entrySet()) {
			System.out.println(entry.getValue() + ": " + entry.getKey());
		}
	 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMapKeyValues();
	}

}
