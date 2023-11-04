package lambdas;

public class Main2 {
	
	private static void greet(String name, Greeting2 greeting) {
		System.out.println(greeting.simpleGreetingByName(name));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		greet("Akshay", new Greeting2(){
			public String simpleGreetingByName(String name) {
				return ("Hello " + name);
			}
		});
		
		greet("Carrie", (name) -> "Good Morning " + name);
		
		greet("Ronald ", (name) -> name + "It is a beautiful day");
	}

}
