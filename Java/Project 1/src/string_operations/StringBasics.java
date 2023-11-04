package string_operations;

public class StringBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Concatenation
		String str1 = "Zensar";
		String str2 = "Technologies";
		String str3 = str1 + str2;
		System.out.println(str3);
		
		String str4 = str1.concat(str2);
		System.out.println(str4);
		
		int num1 = 16;
		String str5 = str4 + num1;
		System.out.println(str5);
		
		//Length
		System.out.println(str1.length());
		
		//Trim
		String str6 = "          Aishu Akshay         ";
		System.out.println(str6.trim());
		
		//Upper Case
		System.out.println(str1.toUpperCase());
		
		//Lower Case
		System.out.println(str2.toLowerCase());
		
		//Empty
		String str7 = "";
		System.out.println(str7.isEmpty());
	}

}
