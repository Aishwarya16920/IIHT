package programs;

import java.util.Scanner;

public class AddMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first matrix:");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter the second matrix:");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				b[i][j] = s.nextInt();
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(c[i][j]);
			}
		}
	}

}
