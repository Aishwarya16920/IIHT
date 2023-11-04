package programs;

import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int c = s.nextInt();
		System.out.println("Enter the second number:");
        int d = s.nextInt();
        
        System.out.println("Before Swapping:-");
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        
        c = c ^ d;
        d = c ^ d;
        c = c ^ d;

        System.out.println("After Swapping:-");
        System.out.println("c: " + c);
        System.out.println("d: " + d);
	}

}
