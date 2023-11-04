package oops_concepts;

public class RoadTollMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoadToll rt1 = new RoadToll();
		rt1.type = "Sadan";
		rt1.tyreCount = 4;
		rt1.calculateToll();
		
		RoadToll rt2 = new RoadToll("Truck", 6);
		rt2.calculateToll();
	}

}
