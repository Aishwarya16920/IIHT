import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int choice = 0;
        while (choice !=3){
            System.out.println("1.open acoount \n2.Banking\n3.close");
            try {
                choice = s.nextInt();

            }
            catch (Exception e)
            {
                choice = -1;
                s.next();
            }
            switch (choice)
            {
                case 1: System.out.println(Account.openAccount()); break;
                case 2: Account.personalAccount.Banking(); break;
                case 3: break;
                default: System.out.println("Invalid Input! Try again");
            }
        }
    }
}
