package string_operations;

public class StringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 100;
		
		//to string
		System.out.println(Integer.toString(num));
		
		//to binary string
		System.out.println(Integer.toBinaryString(num));
		
		//to hex string
		System.out.println(Integer.toHexString(num));
		
		//to octal string
		System.out.println(Integer.toOctalString(num));
		
		//parse int
		String str1 = "100";
		String str2 = "1100100";
		String str3 = "64";
		String str4 = "144";
		
		System.out.println(Integer.parseInt(str1));
		System.out.println(Integer.parseInt(str2, 2));
		System.out.println(Integer.parseInt(str3, 16));
		System.out.println(Integer.parseInt(str4, 8));
	}

}
