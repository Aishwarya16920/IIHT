//Since the Singleton class has private constructor, it cannot be inherited.
package classesAndobjects;

public class Singleton {
	private static Singleton obj = new Singleton();
	
	private Singleton() {

	}
	
	public static Singleton getObject() {
		return obj;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj1 = Singleton.getObject();
		System.out.println(obj1);
	}

}

