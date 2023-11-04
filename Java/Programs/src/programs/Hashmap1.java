package programs;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "I like java and I like python";
		 
        Map<String, Integer> hashMap = new HashMap<>();
 
        String[] words = str.split(" ");
        
        for (String x : words) {
            if (hashMap.containsKey(x)) {
                hashMap.put(x, hashMap.get(x) + 1);
            }
            else
                hashMap.put(x, 1);
        }
 
        System.out.println(hashMap);
	}

}
