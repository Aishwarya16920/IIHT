package programs;

import java.util.Scanner;

public class Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = s.nextInt();
		System.out.println("Enter the second number:");
        int b = s.nextInt();
        
        System.out.println("Before Swapping:-");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping:-");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
	}

}
