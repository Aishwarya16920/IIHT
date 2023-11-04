package regex;

public class Quantifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String patt1 = "abc*";
		String str1 = "abc";
		System.out.println(str1.matches(patt1));
		
		String patt2 = "abc+";
		String str2 = "abc";
		System.out.println(str2.matches(patt2));
		
		String patt3 = "abc?";
		String str3 = "abc";
		System.out.println(str3.matches(patt3));
		
		String patt4 = "ab(xyz)?";
		String str4 = "ab";
		System.out.println(str4.matches(patt4));
		
		String patt5 = "ab(xyz){2}";
		String str5 = "abxyzxyz";
		System.out.println(str5.matches(patt5));
		
		String patt6 = "ab(xyz){2,6}";
		String str6 = "abxyzxyz";
		System.out.println(str6.matches(patt6));
		
		String patt7 = "ab(xyz){2,}";
		String str7 = "abxyzxyz";
		System.out.println(str7.matches(patt7));
				
		
	}

}
