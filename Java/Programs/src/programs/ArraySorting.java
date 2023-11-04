package programs;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the count:");
		int n = s.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the numbers:");
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		int temp = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
