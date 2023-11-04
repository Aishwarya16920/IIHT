package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class CRUDOperationsOnAccount {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int accountNumber;
		double accountBalance;
		String name;
		int choice = -1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File file = new File("userAccounts.txt");
   		RandomAccessFile r = new RandomAccessFile(file, "rw");
   		
   		System.out.println("ACCOUNT");
		System.out.println("1. Create Account");
		System.out.println("2. Read Account details");
		System.out.println("0. Exit");
		
		while(choice != 0) {
			choice = Integer.parseInt(br.readLine());
			
			switch(choice) {
			case 1: 
				System.out.println("Enter your name:");
				name = br.readLine();
				System.out.println("Enter your account number:");
		   		accountNumber=Integer.parseInt(br.readLine());
		   		System.out.println("Enter your account balance:");
		   		accountBalance=Double.parseDouble(br.readLine());
		   		r.writeUTF(name);
		   		r.writeInt(accountNumber);
		   		r.writeDouble(accountBalance);
		   		long currentPositionToCreate= r.getFilePointer();
		   		r.seek(0);
				break;
			case 2:
				try {
					long currentPositionToRead= r.getFilePointer();
					r.seek(0);
					do{	
		   				String str = r.readUTF();
		   				int num1 = r.readInt();
		   				double num2 = r.readDouble();
		   				r.readLine();
		   				System.out.println("Account Details: \n Name:" + str + "\n Account Number: " + num1 + "\n Account Balance: " + num2);
					}while(true);
				}
				catch (Exception e){
					System.out.println("");
				}
			case 0:
				break;
			default:
				System.out.println("Invalid Input, Try again!");
				break;
			}
		}
	
	}

}
