package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadandWrite {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1 = new File("input.txt"); 
		FileInputStream input = new FileInputStream(file1); 
		StringBuilder sb = new StringBuilder(""); 
		int i = 0; 
		do { 
			i = input.read(); 
			if(i != -1) 
				sb.append((char)i); 
		} while(i != -1);
		
		File file2 = new File("output.txt");
		FileOutputStream output = new FileOutputStream(file2); 
		output.write(sb.toString().getBytes()); 
		output.flush(); 
		output.close();
		
	

	}

}
