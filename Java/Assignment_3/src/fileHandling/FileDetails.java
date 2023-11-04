package fileHandling;

import java.io.File;

public class FileDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("input.txt");
		System.out.println("File Name : "+ file.getName());
		System.out.println("File Size in Bytes : "+ file.length());
		System.out.println("File Path : "+ file.getPath());
		System.out.println("File Date : "+ file.lastModified());
		System.out.println("Permissions to Read : "+ file.canRead());
		System.out.println("Permissions to Execute: "+ file.canExecute());
		System.out.println("Permissions to Write: "+ file.canWrite());
	}

}
