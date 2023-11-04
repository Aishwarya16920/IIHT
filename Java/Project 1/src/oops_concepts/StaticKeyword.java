package oops_concepts;

public class StaticKeyword {
	
	static String name = "abc";
	byte age = 6;
	String grade = "2nd";
	
	public void displayDetails() {
		System.out.println("Student " + name + " is " + age + " years old and in " + grade + " grade.");
	}
	
	public static void doThis() {
		System.out.println("Do This!");
	}
}
