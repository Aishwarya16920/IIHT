package oops_concepts;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount b1 = new BankAccount(123456, "Aishu", 100000);
		b1.displayCurrentBalance();
		b1.withdraw(2000);
		b1.displayCurrentBalance();
		b1.deposit(-1000);
		b1.displayCurrentBalance();
		b1.deposit(2000);
		b1.displayCurrentBalance();
	}

}
