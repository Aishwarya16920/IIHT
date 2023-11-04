package abstractClasses;

public abstract class Shape {
	
	public abstract void draw();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s = new Line();
		s.draw();
		s = new Rectangle();
		s.draw();
		s = new Cube();
		s.draw();
		s= new Square();
		s.draw();
		s = new Circle();
		s.draw();
	}

}
