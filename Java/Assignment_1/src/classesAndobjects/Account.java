package classesAndobjects;

public class Account {
	
	private long accNo;
	private String accName;
	private double accBal;
	
	public Account(long accNo, String accName, double accBal) {
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}
	
	public void deposit(double amnt){
		if(amnt > 0) {
			accBal = accBal + amnt;
			System.out.println("Successfully Deposited Rs." + amnt);
			System.out.println();
		}
		else {
			System.out.println("Cannot Deposit " + amnt);
			System.out.println();
		}
	}
	
	public void withdraw(double amnt) {
		if(amnt > 0) {
			accBal = accBal - amnt;
			System.out.println("Successfully Withdrawn Rs." + amnt);
			System.out.println();
		}
		else {
			System.out.println("Cannot Withdraw " + amnt);
			System.out.println();
		}
	}
	
	public void displayAccountDetails() {
		System.out.println("Your Account Details:");
		System.out.println("  Account Number: " + accNo);
		System.out.println("  Account Name: " + accName);
		System.out.println("  Current Balance: Rs." + accBal);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(123456, "Aishu", 100000);
		acc.displayAccountDetails();
		acc.withdraw(2000);
		acc.displayAccountDetails();
		acc.deposit(-1000);
		acc.displayAccountDetails();
		acc.deposit(2000);
		acc.displayAccountDetails();
	}

}
