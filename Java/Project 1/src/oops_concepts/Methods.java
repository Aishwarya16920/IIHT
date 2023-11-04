package oops_concepts;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods m1 = new Methods();
		m1.doThis();
		m1.addition(100, 200);
		int x = m1.multiply(10, 20);
		System.out.println(x);
	}
	
	public void doThis() {
		System.out.println("Do This Executed!");
	}
	
	public void addition(int num1, int num2) {
		System.out.println(num1 + num2);	
	}
	
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
}
