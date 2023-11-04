package programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class Hashmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Jan");
        map.put(2, "Feb");
        map.put(3, "March");
        map.put(4, "April");
        map.put(5, "May");

        System.out.println(map);
        
        for(Entry<Integer, String> e: map.entrySet()) {
        	System.out.println(e);
        }
        
        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
	}

}
