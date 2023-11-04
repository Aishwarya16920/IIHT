package text_files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("D:\\Zensar Workspace\\TxtFiles\\File1.txt");
		String x = FileUtils.readFileToString(file, "UTF-8");
		System.out.println(x);
		
	}

}
