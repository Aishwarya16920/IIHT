package regex;

public class CharacterClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String patt1 = "\\d{3}";
		String str1 = "516";
		System.out.println(str1.matches(patt1));
		
		String patt2 = "\\w{4}";
		String str2 = "A_51";
		System.out.println(str2.matches(patt2));
		
		String patt3 = "\\s";
		String str3 = " ";
		System.out.println(str3.matches(patt3));
		
		String patt4 = "\\D{2,9}";
		String str4 = "%*ABCDr()";
		System.out.println(str4.matches(patt4));
		
		String patt5 = "\\W{1,}";
		String str5 = "@&##&*(@&#&#(())";
		System.out.println(str5.matches(patt5));
		
		String patt6 = "678\\d{7}";
		String str6 = "6780291567";
		System.out.println(str6.matches(patt6));
		
		String patt7 = "\\w{2,6}\\W{2}";
		String str7 = "ab**";
		System.out.println(str7.matches(patt7));
		
	}

}
