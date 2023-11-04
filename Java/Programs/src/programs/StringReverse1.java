package programs;

import java.util.Scanner;

public class StringReverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);	        
		System.out.println("Enter the string: ");
		String str1 = s.nextLine();
        String str2 = "";

        for(int i = 0; i <= str1.length()-1; i++){
            str2 = str1.charAt(i) + str2;
        }

        System.out.println(str2);
        
	}

}
