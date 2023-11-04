package programs;

import java.util.Scanner;

public class MaxMinFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = s.nextLine();
		int n= str.length();
		int arr[] = new int[256];
		
		for(int i = 0; i < n; i++) {
			arr[str.charAt(i)]++;
		}
		
		int max = -1;
		int min = 256;
		char res_max= ' ';
		char res_min = ' ';
		
		for(int i = 0; i < n; i++) {
			if(max< arr[str.charAt(i)]) {
				max = arr[str.charAt(i)];
				res_max = str.charAt(i);
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(min> arr[str.charAt(i)]) {
				min = arr[str.charAt(i)];
				res_min = str.charAt(i);
			}
		}
		
		System.out.println(res_max);
		System.out.println(res_min);
	}

}
