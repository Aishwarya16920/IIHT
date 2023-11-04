package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc();
		System.out.println("Hello Aishu!");
	}
	
	public static void abc() {
		try {
			FileInputStream x = new FileInputStream("Users/md/Downloads/abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
	}
}


