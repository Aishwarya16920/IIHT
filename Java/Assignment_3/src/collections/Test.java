package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

@SuppressWarnings("rawtypes")
public class Test {
	
	public static void failFast() {
		try {
			ArrayList<Integer> arr = new ArrayList<>();
	        arr.add(1);
	        arr.add(2);
	        arr.add(3);
	        arr.add(4);
	        arr.add(5);
	        Iterator<Integer> itr1 = arr.iterator();
	        while (itr1.hasNext()) {
	            if (itr1.next() == 2) {
	                itr1.remove();
	            }
	        }
	        System.out.println(arr);
	        itr1 = arr.iterator();
	        while (itr1.hasNext()) {
	            if (itr1.next() == 3) {
	                arr.remove(3);
	            }
	        }
		}
		catch(Exception e){
			System.out.println(e);
		}
		try {
	        Map<Integer,Integer> map = new HashMap<>();
	        map.put(1,6);
	        map.put(2,5);
	        map.put(3,4);
	        map.put(4,3);
	        map.put(5,2);
	        map.put(6,1);

	        Iterator<Integer> itr2 =  map.keySet().iterator();

	        while(itr2.hasNext()){
	            System.out.println(map.get(itr2.next()));
	            map.put(7, 8);
	        }
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
		
	
	public static void failSafe() {
		 CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 2, 3, 4 });
		 Iterator itr3 = list.iterator();
	     while (itr3.hasNext()) {
	         Integer num = (Integer)itr3.next();
	         System.out.println(num);
	         if (num == 4)
	             list.add(5);
	     }
	     
	     ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();

	     map.put("ONE", 1);
	     map.put("TWO", 2);
	     map.put("THREE", 3);
	     map.put("FOUR", 4);
	
	     // Getting an Iterator from map
	     Iterator itr4 = map.keySet().iterator();
	
	     while (itr4.hasNext()) {
	         String key = (String)itr4.next();
	         System.out.println(key + " : " + map.get(key));
	         map.put("SEVEN", 7);
	     }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		failFast();
		failSafe();

	}

}
