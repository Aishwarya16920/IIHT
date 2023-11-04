package text_files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CopyAndMove {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file1 = new File("D:\\Zensar Workspace\\TxtFiles\\File1.txt");
		File file2 = new File("D:\\Zensar Workspace\\TxtFiles\\File2.txt");
		File dir = new File("D:\\Zensar Workspace\\TxtFiles\\Dir1");
		File file3 = new File("D:\\Zensar Workspace\\TxtFiles\\File3.txt");
		FileUtils.copyFile(file1, file2);
		FileUtils.copyFileToDirectory(file1, dir);
		FileUtils.moveFile(file1, file3);
		
	}

}
