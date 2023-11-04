package java_basics;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		while(a > 50) {
			a-=5;
			System.out.println(a);
		}
		
		int b = 100;
		do {
			b-=5;
			System.out.println(b);
		}while(b > 50);
	}

}
