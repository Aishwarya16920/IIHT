package regex;

public class NumberRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String patt1 =  "[0-9][0-9]?";
		String str1 = "99";
		System.out.println(str1.matches(patt1));
	
		String patt2 = "[0-9][0-9]?[0-9]?|1000";
		String str2 = "999";
		System.out.println(str2.matches(patt2));
		
		String patt3 = "99|[1-9][0-9][0-9][0-9]?";
		String str3 = "9999";
		System.out.println(str3.matches(patt3));
		
		String patt4 = "2[5-9]|[3-6][0-9]|7[0-5]";
		String str4 = "74";
		System.out.println(str4.matches(patt4));
		
		String patt5 = "2[2-3][0-9]|240";
		String str5 = "239";
		System.out.println(str5.matches(patt5));
	}

}
