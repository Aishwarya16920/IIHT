package string_operations;

public class StringSlice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "ABCDEFG";
		
		//char at
		System.out.println(str1.charAt(4));
		
		//Index out of bound Exception
		//System.out.println(str1.charAt(8));
		
		//Reverse a string
		String temp = "";
		for(int i = 0; i < str1.length(); i++) {
			temp = str1.charAt(i) + temp;
		}
		System.out.println(temp);
		
		//substring
		System.out.println(str1.substring(2));
		System.out.println(str1.substring(2, 4));
		
		//split
		String str2 = "A_B_C_D";
		String str3 = "_";
		String arr[] = str2.split(str3);
		
		for(String x: arr) {
			System.out.println(x);
		}
	}

}
