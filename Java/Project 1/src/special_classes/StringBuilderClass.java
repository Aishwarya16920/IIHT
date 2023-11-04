package special_classes;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "I";
		str1 = str1 + " Like ";
		str1 = str1+ "Java!";
		System.out.println(str1);
		
		//I / Like / I Like / Java! / I Like Java!
		
		StringBuilder sb1 = new StringBuilder("I");
		
		sb1.append(" Like ");
		sb1.append("Java!");
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("Learning is fun.");
		
		sb2.insert(9, "Java ");
		System.out.println(sb2);
		
		sb2.replace(9, 13, "Everything");
		System.out.println(sb2);
		
		sb2.deleteCharAt(0);
		System.out.println(sb2);
		
		sb2.delete(0, 8);
		System.out.println(sb2);
		
		sb2.reverse();
		System.out.println(sb2);
	}

}
