package java_basics;

public class NestedIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 99;
		
		if(marks >= 90) {
			System.out.println("A Grade");
		}
		else if(marks >= 75) {
			System.out.println("B Grade");
		}
		else if(marks >= 60) {
			System.out.println("C Grade");
		}
		else if(marks >= 40) {
			System.out.println("D Grade");
		}
		else {
			System.out.println("Fail");
		}
		
		int num1 = 100;
		int num2 = 400;
		int num3 = 300;
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("num1 is greater");
		}
		else if(num2 > num1 && num2 > num3) {
			System.out.println("num2 is greater");
		}
		else {
			System.out.println("num3 is greater");
		}
		
	}

}
