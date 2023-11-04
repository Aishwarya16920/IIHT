package programs;

import java.util.Scanner;

public class Fibonacci2 {
	static int num1 = 0;
	static int num2 = 1;
	static int num3 = 0;
	
	public static void fibonacci(int count) {
		if(count>0) {
			num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
			fibonacci(count-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the count:");
		int count = s.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		fibonacci(count-2);
	}

}
