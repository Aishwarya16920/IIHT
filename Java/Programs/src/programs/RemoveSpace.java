package programs;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);	        
		System.out.println("Enter the string: ");
		String str = s.nextLine();
		
		str = str.replace(" ", "");
		System.out.println(str);
	}

}
