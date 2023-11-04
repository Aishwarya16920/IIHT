package programs;

import java.util.Scanner;

public class StringReverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the string:");
		 	StringBuilder str3 = new StringBuilder(s.nextLine());
	        str3.reverse();
	        System.out.println(str3);
	}

}
