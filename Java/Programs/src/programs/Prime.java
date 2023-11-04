package programs;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		int flag = 0;
	
		for(int i = 2; i<num/2; i++) {
			if(num % i == 0) {
				flag = 1;
			}
		}
		if(flag==1) {
			System.out.println("The number is not prime");
		}
		else {
			System.out.println("The number is prime");
		}
	}

}
