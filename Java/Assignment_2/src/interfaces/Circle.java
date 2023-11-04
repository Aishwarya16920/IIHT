package interfaces;

public class Circle implements Printable, Sortable{

	int radius;
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void print() {
		System.out.println("Circle Class");
	}
	
	public void printAll(Circle c) {
		System.out.println(c);
		System.out.println("Radius of the circle is " + radius);
	}

	public String toString() {
		return "[" + radius + "]";
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		Circle c1 = (Circle) o1;
        Circle c2 = (Circle) o2;
        if (c1.radius > c2.radius) {
            return 1;
        } else if (c1.radius < c2.radius) {
            return -1;
        } else {
            return 0;
        }
	}

}
