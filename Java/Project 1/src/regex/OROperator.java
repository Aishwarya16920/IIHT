package regex;

public class OROperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String patt1 = "a(a|b|c|d|xyz|123)";
		String str1 = "axyz";
		System.out.println(str1.matches(patt1));
	
	}

}
