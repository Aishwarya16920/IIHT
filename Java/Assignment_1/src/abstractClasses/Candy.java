package abstractClasses;

public class Candy extends DessertItem{
	
	int cost = 3;
	
	@Override
	public int getCost() {
		return cost*60;
	}

}
