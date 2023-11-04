package regex;

public class BracketExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String patt1 = "[cbmh]at";
		String str1 = "cat";
		System.out.println(str1.matches(patt1));
		
		String patt2 = "[A-Z]at";
		String str2 = "Bat";
		System.out.println(str2.matches(patt2));
		
		String patt3 = "[^a-z]at";
		String str3 = "Bat";
		System.out.println(str3.matches(patt3));
		
		String patt4 = "[A-Za-z0-9_]{3}at";
		String str4 = "A_5at";
		System.out.println(str4.matches(patt4));
		
	}

}
