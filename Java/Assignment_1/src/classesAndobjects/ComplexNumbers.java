package classesAndobjects;

import java.util.Scanner;

public class ComplexNumbers{

	private int real;
	private int imaginary;
	
	public ComplexNumbers(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public static void add(ComplexNumbers c1, ComplexNumbers c2) {
		ComplexNumbers add = new ComplexNumbers(0,0);
		add.real= c1.real + c2.real;
		add.imaginary = c1.imaginary + c2.imaginary;
		System.out.println("Addition: " + add.real + " + " + add.imaginary + "i" );
	}
	
	public static void subtract(ComplexNumbers c1, ComplexNumbers c2) {
		ComplexNumbers sub = new ComplexNumbers(0,0);
		sub.real= c1.real - c2.real;
		sub.imaginary = c1.imaginary - c2.imaginary;
		System.out.println("Subtraction: " + sub.real + " + " + sub.imaginary + "i" );
	}
	
	public static void multiply(ComplexNumbers c1, ComplexNumbers c2) {
		ComplexNumbers mul1 = new ComplexNumbers(0,0);
		mul1.real= c1.real * c2.real;
		mul1.imaginary = c1.imaginary * c2.imaginary;
		int diff = mul1.real - mul1.imaginary;
		ComplexNumbers mul2 = new ComplexNumbers(0,0);
		mul2.real = c1.real * c2.imaginary;
		mul2.imaginary = c1.imaginary * c2.real;
		int add = mul2.real + mul2.imaginary;
		System.out.println("Multiplication: " + diff + " + " + add + "i" );
	}
	
	public static void swap(ComplexNumbers c1, ComplexNumbers c2) {
		System.out.println("Before Swap: ");
		System.out.println("First Complex Number: " + c1.real + " + " + c1.imaginary + "i");
		System.out.println("Second Complex Number: " + c2.real + " + " + c2.imaginary + "i");
		
		var temp = c1;
		c1 = c2;
		c2 = temp;
		
		System.out.println("After Swap: ");
		System.out.println("First Complex Number: " + c1.real + " + " + c1.imaginary + "i");
		System.out.println("Second Complex Number: " + c2.real + " + " + c2.imaginary + "i");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Real Number: ");
		int real1 = s.nextInt();
		System.out.println("Enter First Imaginary Number: ");
		int imaginary1 = s.nextInt();
		System.out.println("Enter Second Real Number: ");
		int real2 = s.nextInt();
		System.out.println("Enter First Imaginary Number: ");
		int imaginary2 = s.nextInt();
		s.close();
		
		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);
		
		add(c1,c2);
		subtract(c1,c2);
		multiply(c1,c2);
		swap(c1,c2);
	}

}
