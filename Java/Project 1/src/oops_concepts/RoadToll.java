package oops_concepts;

public class RoadToll {
		// TODO Auto-generated method stub
		String type;
		int tyreCount;
		
		public RoadToll() {
			System.out.println("Constructor is executed!");
		}
		
		public RoadToll(String type, int tyreCount) {
			this.type= type;
			this.tyreCount = tyreCount;
		}
		
		public void calculateToll() {
			if (tyreCount == 2) {
				System.out.println("You toll amount is 0.");
			}
			else if(tyreCount == 4) {
				System.out.println("Your toll amount is 10.");
			}
			else if(tyreCount > 4){
				System.out.println("Your toll amount is 20.");
			}
			else {
				System.out.println("Incorrect tyre count!");
			}
		}

}
