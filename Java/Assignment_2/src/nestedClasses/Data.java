package nestedClasses;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.HashMap;

public class Data {
    
	static class Cache{
		private int data;
		private Timestamp time;
		
		public Cache(int data) {
			this.data = data;
			this.time = Timestamp.from(Instant.now());
		}
	}
	
	public static HashMap<Integer,Cache> cacheHashMap = new HashMap<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cacheHashMap.put(1,new Cache(155));
        cacheHashMap.put(2,new Cache(156));
        cacheHashMap.put(3,new Cache(157));
        cacheHashMap.put(4,new Cache(158));
        System.out.println(cacheHashMap.get(2).data + " " + cacheHashMap.get(2).time );
		
	}

}
