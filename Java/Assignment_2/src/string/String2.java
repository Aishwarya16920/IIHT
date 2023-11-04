package string;

public class String2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Immutable
		String  str1 =  new String("Java");
		str1.concat(" is fun!");
		System.out.println("String: " + str1);
		
		//Mutable
		StringBuilder str2 = new StringBuilder("Java");
		str2.append(" is fun!");
		System.out.println("StringBuilder: " + str2);
		
		//Mutable
		StringBuffer str3 = new StringBuffer("Java");
		str3.append(" is fun!");
		System.out.println("StringBuffer: " + str3);
	}

}
