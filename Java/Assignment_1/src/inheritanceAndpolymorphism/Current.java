package inheritanceAndpolymorphism;

public class Current extends Account{
	
	double cashCredit = 100000;
	
	public double accountBalance() {
		return cashCredit;
	}
}
