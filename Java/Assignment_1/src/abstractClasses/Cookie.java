package abstractClasses;

public class Cookie extends DessertItem{
	
	int cost = 5;
	
	@Override
	public int getCost() {
		return cost*70;
	}

}
