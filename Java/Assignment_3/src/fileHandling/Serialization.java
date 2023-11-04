package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) throws Exception{
		File file = new File("serialization.txt"); 
		FileOutputStream fileOutput = new FileOutputStream(file);  
		ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput); 
		objectOutput.writeObject(new Account(1, new Date(16,9,2000))); 
		System.out.println("Serialized");
		objectOutput.flush(); 
		objectOutput.close();
	}
}
