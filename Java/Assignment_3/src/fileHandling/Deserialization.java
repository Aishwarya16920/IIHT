package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		File file = new File("serialization.txt"); 
		FileInputStream fileInput = new FileInputStream(file);  
		ObjectInputStream objectInput = new ObjectInputStream(fileInput); 
		Account acc = (Account)objectInput.readObject(); 
		System.out.println("Account = " + acc);
		System.out.println("Deserialized");
	}
}
