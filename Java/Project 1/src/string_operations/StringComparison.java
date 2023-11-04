package string_operations;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Equals
		String str1 = "ABCDE";
		String str2 = "abcde";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		if(str1.equals(str2)) {
			System.out.println("Strings are Equal.");
		}
		else {
			System.out.println("Strings are not Equal");
		}
		
		//Compare to
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		
		//Matches
		String patt = "[A-Z]{1,}";
		System.out.println(str1.matches(patt));
	}

}
