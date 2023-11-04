package fileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class AccountDetails {
	
	private static int accountNumber;
	private static double accountBalance;
	private static String name;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file = new File("account.txt");
        FileOutputStream fileOutput = new FileOutputStream(file);
        DataOutputStream dataOutput = new DataOutputStream(fileOutput);
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
        	System.out.println("Enter your name: ");
            name = s.next();
            System.out.println("Enter your account number: ");
            accountNumber = s.nextInt();
            System.out.println("Enter your account balance");
            accountBalance= s.nextDouble();
            s.nextLine();
            dataOutput.writeUTF(name);
            dataOutput.writeInt(accountNumber);
            dataOutput.writeDouble(accountBalance);
        }


        fileOutput.close();
        dataOutput.close();
        FileInputStream fileInput = new FileInputStream(file);
        DataInputStream dataInput = new DataInputStream(fileInput);
        for (int i = 1; i <= 3; i++) {
            String str = dataInput.readUTF();
            System.out.println(str);
            int num1 = dataInput.readInt();
            System.out.println(num1);
            Double num2 = dataInput.readDouble();
            System.out.println(num2);
        }

        fileInput.close();
        dataInput.close();
        s.close();

	}

}
