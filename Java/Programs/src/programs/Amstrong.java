package programs;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner s = new Scanner(System.in);
	      System.out.print("Enter the number : ");
	      int num = s.nextInt();
	      int temp = num;
	      int result = 0;
	      while (temp != 0){
	         int rem = temp % 10;
	         result += Math.pow(rem, 3);
	         temp /= 10;
	      }
	      if(result == num)
	         System.out.println(num + " is an Armstrong number");
	      else
	         System.out.println(num + " is not an Armstrong number");
	   }
		
	}

