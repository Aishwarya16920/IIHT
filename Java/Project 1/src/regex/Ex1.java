package regex;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String patt =  "www\\.(dezlearn|dez)\\.(com|us)";
		String str = "www.dezlearn.us";
		System.out.println(str.matches(patt));
	}

}
