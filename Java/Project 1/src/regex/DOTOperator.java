package regex;

public class DOTOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String patt1 = "ABC.";
		String str1 = "ABC5";
		System.out.println(str1.matches(patt1));
		
		String patt2 = "ABC.*";
		String str2 = "ABC_51a";
		System.out.println(str2.matches(patt2));
	
	
	}

}
