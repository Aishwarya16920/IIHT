package programs;

import java.util.Scanner;

public class LongestRepeatingString {
	
	public static String longestRepeatingString(String x, String y){
        int m = Math.min(x.length(),y.length());
        for(int i = 0; i < m; i++){
            if(x.charAt(i) != y.charAt(i)){
                return x.substring(0,i);
            }
        }
        return x.substring(0,m);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str1= s.nextLine();
		String str2="";
		int n = str1.length();
		for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                String res = longestRepeatingString(str1.substring(i,n),str1.substring(j,n));
                if(res.length() > str2.length()) {
                	str2 = res;  
                }
            }
        }
        System.out.println(str2);
		
	}

}
