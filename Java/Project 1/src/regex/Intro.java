package regex;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "84829!@#)2039/3)@##1@+@@+387398222290";
		String patt = "[^A-Za-z0-9]";
		
		String str3 = str1.replaceAll(patt, "");
		System.out.println(str3);
	}

}
