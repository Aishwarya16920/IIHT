import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of rows: ");
		
		Scanner s = new Scanner(System.in);
		int rowNumber = s.nextInt();
		
		int total = countTotalBirds(rowNumber);
		
		System.out.println("Total Number Of Birds: " + total);
	}
	
	public static int countTotalBirds(int rowNumber) {
		int num1 = 1;
		int num2 = 2;
		int num3 = 0;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(num1);
		arr.add(num2);
		
		int total = 0;
		if (rowNumber == 1) {
			total = num1;
		}
		else if(rowNumber == 2) {
			total = num1 + num2;
		}
		
		for(int i = 3; i <= rowNumber; i++) {
			num3 = num1 + num2;
			arr.add(num3);
			num1 = num2;
			num2 = num3;
		}
		
		for(int x : arr) {
			total += x;
			System.out.println(x);
		}
		
		return total;
	}

}
