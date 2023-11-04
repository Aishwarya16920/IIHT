package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyAndLazyMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "XXdnjbsjhbYYnbsaxbjhXXjsbcjhazbjYYsvbanvxghaXXbnsczvshzgvYYxbvJAVjh";
		String patt1 = "XX.*YY";  //Greedy
		String patt2 = "XX.*?YY"; //Non Greedy
		
		Pattern p = Pattern.compile(patt1);
		Matcher m = p.matcher(str1);
		
		System.out.println(m.results().count());
		
		m.reset();
		
		while(m.find()) {
			System.out.println("Starts at: " + m.start());
			System.out.println(m.group());
		}
	}

}
