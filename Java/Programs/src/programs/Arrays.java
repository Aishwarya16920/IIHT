package programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>arr = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the count:");
		int count = s.nextInt();
		for(int i = 0; i < count; i++) {
			String j = s.nextLine();
			arr.add(j);
		}
		
		for(int i = 0; i < count; i++) {
			System.out.println(arr.get(i));
		}
		
		for(String x: arr) {
			System.out.println(x);
		}
		
		Iterator itr = arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
