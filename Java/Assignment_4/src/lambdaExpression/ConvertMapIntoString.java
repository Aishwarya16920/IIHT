package lambdaExpression;

import java.util.HashMap;
import java.util.Map;

public class ConvertMapIntoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hashMap=new HashMap<Integer,String>();
		hashMap.put(1, "Aishu");
		hashMap.put(2,"Akshay");
		hashMap.put(3,"Zara");
		StringBuilder sb=new StringBuilder();
		
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			 sb.append(entry.getKey());
			 sb.append(entry.getValue());

		}
		System.out.println(sb);

	}

}
