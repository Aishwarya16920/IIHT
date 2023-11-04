package oops_concepts;

public class AccessSpecifier {
	
	public int a = 100;
	private int b = 200;
	int c = 300;
	
	public void doThisPublic() {
		System.out.println("Public Method");
	}
	
	private void doThisPrivate() {
		System.out.println("Private Method");
	}
	
	void doThisDefault() {
		System.out.println("Default Method");
	}

}
