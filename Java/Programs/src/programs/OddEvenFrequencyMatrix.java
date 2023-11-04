package programs;

import java.util.Scanner;

public class OddEvenFrequencyMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[3][3];
		
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				a[i][j] = s.nextInt();
			}
		}
		int even = 0;
		int odd = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(a[i][j] % 2 == 0) {
					even++;
				}
				else {
					odd++;
				}
			}
		}
		
		System.out.println("Even Count: " + even);
		System.out.println("Odd Count: " + odd);
	}

}
