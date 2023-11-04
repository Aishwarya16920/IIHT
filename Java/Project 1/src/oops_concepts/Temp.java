package oops_concepts;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cars c1 = new Cars();
		c1.color = "Black";
		c1.make = "BMW";
		c1.displayDetails();
		
		Cars c2 = new Cars();
		c2.color = "Red";
		c2.make = "Toyota";
		c2.type = "Sadan";	
		c2.displayDetails();
		
		
		Methods m2 = new Methods();
		m2.addition(200, 300);
		m2.doThis();
		int x= m2.multiply(5, 16);
		System.out.println(x);
		
		MethodOverloading m1 = new MethodOverloading();
		m1.addition(10, 20);
		m1.addition(12.12, 30);
		m1.addition(33.33, 44.44);
		m1.addition(31, 21.23);
		m1.addition(12, 34, 55);
	}

}
