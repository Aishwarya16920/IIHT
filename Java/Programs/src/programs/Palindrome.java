package programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);	        
		System.out.println("Enter a string: ");
		String str1 = s.nextLine();
        String str2 = "";

        for(int i = 0; i <= str1.length()-1; i++){
            str2 = str1.charAt(i) + str2;
        }

        if(str1.equals(str2)) {
        	System.out.println("The String is palindrome");
        }
        else {
        	System.out.println("The string is not a palindrome");
        }
	}

}
