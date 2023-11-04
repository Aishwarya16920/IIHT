package text_files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Edit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("D:\\Zensar Workspace\\TxtFiles\\File1.txt");
		FileUtils.write(file, "Learning is Growing", "UTF-8", true); //append
		//FileUtils.write(file, "Learning is Growing", "UTF-8", false); //overwrite
 		
	}

}
