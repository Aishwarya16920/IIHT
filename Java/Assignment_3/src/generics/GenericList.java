package generics;

import java.util.ArrayList;

public class GenericList{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list = new ArrayList<>();
		list.add(100000);
		list.add(10000);
		list.add(987387728);
		list.add(16);
		list.add(123.4);
		list.add(234.5f);
		
		for(Object x: list) {
			System.out.println(x);
		}

	}

}
