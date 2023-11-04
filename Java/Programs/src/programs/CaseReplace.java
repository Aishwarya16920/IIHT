package programs;

import java.util.Scanner;

public class CaseReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);	        
		System.out.println("Enter the string: ");
		String str1 = s.nextLine();
		String str2 = "";
		
		for(int i = 0; i <  str1.length(); i++) {
			char c = str1.charAt(i);
			if(Character.isUpperCase(c)) {
				str2 += Character.toLowerCase(c);
			}
			else if(Character.isLowerCase(c)) {
				str2 += Character.toUpperCase(c);
			}
		}
		System.out.println(str2);
		
	}

}
