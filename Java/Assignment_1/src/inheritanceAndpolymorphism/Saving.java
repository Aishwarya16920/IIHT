package inheritanceAndpolymorphism;

public class Saving extends Account{
	
	double fixedDeposits = 300000;
	
	public double accountBalance() {
		return fixedDeposits;
	}
}
