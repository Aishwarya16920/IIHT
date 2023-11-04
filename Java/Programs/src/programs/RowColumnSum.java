package programs;

import java.util.Scanner;

public class RowColumnSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][3];
		
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				a[i][j] = s.nextInt();
			}
		}
		
		for(int i = 0; i < 3; i++) {
			int row = 0;
			for(int j = 0; j < 3; j++) {
				row += a[i][j];
			}
			System.out.println("Row Sum " + row);
		}
		
		for(int i = 0; i < 3; i++) {
			int col = 0;
			for(int j = 0; j < 3; j++) {
				col += a[j][i];
			}
			System.out.println("Col Sum " + col);
		}
		
	}
}
