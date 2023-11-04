package lambdas;

public class Main1 {
	
	private static void greet(Greeting1 greeting) {
		System.out.println(greeting.simpleGreeting());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		greet(new Greeting1(){
			public String simpleGreeting() {
				return "Hello Aishu";
			}
		});
		
		greet(() -> "Good Morning");
		
		greet(() -> "Here is a simple interface method which takes in no parameter");
		
		
	}


}
