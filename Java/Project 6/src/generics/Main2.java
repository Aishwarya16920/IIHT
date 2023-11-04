package generics;

import java.util.Calendar;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Repository fifteen = new Repository(15);
		System.out.println(fifteen);
		
		Repository tenPointOne = new Repository(10.1);
		System.out.println(tenPointOne);
		
		Repository helloGenerics = new Repository("Hello Generics!");
		System.out.println(helloGenerics);
		
		Repository today = new Repository(Calendar.getInstance().getTime());
		System.out.println(today);
		
		
	}

}
