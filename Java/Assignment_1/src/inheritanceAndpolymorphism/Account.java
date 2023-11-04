package inheritanceAndpolymorphism;

public class Account {
	
	public double accountBalance(){
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Account a;
        
        a = new Saving();
        double s = a.accountBalance();
        
        a = new Current();
        double c = a.accountBalance();
        
        double total = s+c;
        
        System.out.println("Total cash in the Account: " + total);
	}

}
