package programs;

import java.util.Scanner;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter count: ");
		int count = s.nextInt();
		int arr[] = new int [count];
		
		System.out.println("Enter the numbers:");
		for(int i = 0; i < count; i++) {
			arr[i] = s.nextInt();
		}
		
		int temp = 0;
		for(int i=0; i < count; i++) {
			for(int j = i+1; j < count; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(arr[1]);
		
	}

}
