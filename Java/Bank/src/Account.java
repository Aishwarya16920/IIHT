import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Account {
    public static Scanner Scan = new Scanner(System.in);

    private static HashMap<Integer,personalAccount> allaccounts = new HashMap<Integer, personalAccount>();



    public static class  personalAccount {
        private int accountNumber;
        private String accountName;
        private float accountBalance;
        private int accountPIN;
        protected static int currentAccountNUmber = 169200;

        public personalAccount(int accNumber, String accName, float initalBalance, int pin) {
            this.accountNumber = accNumber;
            this.accountName = accName;
            this.accountBalance = initalBalance;
            this.accountPIN = pin;
        }

        public static void Banking() {

            int AccountNumber = 0;
            personalAccount temp;
            int PIN = -1;
            inner:
            try{
                System.out.println("Enter Account number");
                AccountNumber = Scan.nextInt();
            }
            catch (Exception e){
                System.out.println("Invalid Account number! Try Again!");
                Scan.next();
                break inner;
            }

            if (allaccounts.get(AccountNumber) == null){
                System.out.println("Account Not Found!");
                return;
            }
            else {
                temp = allaccounts.get(AccountNumber);
            }

            try {
                System.out.println("Enter Account PIN");
                PIN = Scan.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Invalid PIN!");
                Scan.next();
                return;
            }

            if (temp.accountPIN == PIN){
                int choice = 0;
                while (choice !=4){
                    System.out.println("1.Check Balance\n2.Deposit\n3.Withdrawal\n4.close");
                    try {
                        choice = Scan.nextInt();

                    }
                    catch (Exception e)
                    {
                        choice = -1;
                        Scan.next();
                    }
                    switch (choice){
                        case 1:CheckBalance(temp); break;
                        case 2:Deposit(temp); break;
                        case 3:Withdraw(temp); break;
                        case 4:break;
                        default: System.out.println("Invalid option");
                }
                }
            }else{
                System.out.println("Wrong PIN! Try Again!");
            }
        }

        public static void CheckBalance(personalAccount currentAccount) {
            System.out.println("Account Balance" + currentAccount.accountBalance);
        }
        public static void Withdraw(personalAccount currentAccount) {
            float amount =0;
            try {
                System.out.println("Enter Amount :");
                amount = Scan.nextFloat();
            }
            catch (Exception e)
            {
                System.out.println("Invalid Amount value!");
                Scan.next();
                return;
            }
            if(amount > currentAccount.accountBalance){
                System.out.println("Insufficient Fund!");
            }
            else{
                currentAccount.accountBalance -= amount;
                System.out.println("Withdrawal Successful!\nAccount Balance" + currentAccount.accountBalance);
            }
        }
        public static void Deposit(personalAccount currentAccount) {
            float amount =0f;
            try {
                System.out.println("Enter Amount :");
                amount = Scan.nextFloat();
            }
            catch (Exception e)
            {
                System.out.println("Invalid Amount value!");
                Scan.next();
                return;
            }
            currentAccount.accountBalance += amount;
            System.out.println("Deposit Successful!\nAccount Balance" + currentAccount.accountBalance);
        }
    }
    public static String openAccount(){
        Float balance = 0f;
        int pin =0;
        System.out.println("Enter Name:");
        String Name = Scan.next();

        try {
            System.out.println("Inital Deposit Amount");
            balance = Scan.nextFloat();
        }
        catch (Exception e)
        {
            System.out.println("Invalid Amount value!");
            Scan.next();
            return "Account not crated Try again!";
        }

        try {
            System.out.println("Enter PIN for the Account");
            pin = Scan.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("Invalid PIN");
            Scan.next();
            return "Account not crated Try again!";
        }


        allaccounts.put(++personalAccount.currentAccountNUmber,new personalAccount(personalAccount.currentAccountNUmber, Name, balance,pin));
        return ""+personalAccount.currentAccountNUmber;
    }

}
