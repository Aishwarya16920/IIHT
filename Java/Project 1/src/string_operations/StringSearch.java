package string_operations;

public class StringSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "I Love Java and I Love Selenium";
		String str2 = "java";
	
		//contains
		System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));
		
		//starts with
		System.out.println(str1.startsWith("I"));
		
		//ends with
		System.out.println(str1.endsWith("Selenium"));
		
		//Index of and Last Index of
		System.out.println(str1.indexOf("Love"));
		System.out.println(str1.indexOf("Love", 6));
		System.out.println(str1.lastIndexOf("Love"));
	}

}
