package oops_concepts;

public class BankAccount {
	
	private long accNo;
	private String accName;
	private double accBal;
	
	public void deposit(double amnt) {
		if(amnt > 0) {
			accBal = accBal + amnt;
			System.out.println("Successfully Deposited $ " + amnt);
		}
		else {
			System.out.println("Cannot Deposit " + amnt);
		}
	}
	
	public void withdraw(double amnt) {
		if(amnt > 0) {
			accBal = accBal - amnt;
			System.out.println("Successfully Withdrawn $ " + amnt);
		}
		else {
			System.out.println("Cannot Withdraw " + amnt);
		}
	}
	
	public void displayCurrentBalance() {
		System.out.println("Your Current Balance is " + accBal);
	}
	
	public BankAccount(long accNo, String accName, double accBal) {
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}
}
