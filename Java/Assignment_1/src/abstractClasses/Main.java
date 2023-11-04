package abstractClasses;

public class Main extends AbstractClassWithoutAbstractMethod{
	
	public void def() {
		System.out.println("DEF Executed");
	}
	
	public static void main(String[] args) {
		
		AbstractClassWithoutAbstractMethod a;
		a = new Main();
		a.abc();

	}

}
