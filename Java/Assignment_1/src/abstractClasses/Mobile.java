package abstractClasses;

public abstract class Mobile {
	
	public abstract void doubleTap();
	
	public void singleTap() {
		System.out.println("Single Tap");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m;
		m = new IOS();
		m.doubleTap();
		m= new Android();
		m.doubleTap();
		m.singleTap();
	}

}
