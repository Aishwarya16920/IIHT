package programs;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[3][3];
		
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				a[i][j] = s.nextInt();
			}
		}
		
		int transpose[][] = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				transpose[i][j] = a[j][i];
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(transpose[i][j]);
			}
		}
	}

}
