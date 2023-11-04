package programs;

import java.util.Scanner;

public class Fibonacci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the count:");
		int count = s.nextInt();
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		
		System.out.println(num1);
		System.out.println(num2);

		
		for(int i = 2; i < count; i++) {
			num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
	}

}
