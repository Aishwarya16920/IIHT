package fileHandling;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class ReadFileContents {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            FileInputStream file1 = new FileInputStream("file1.txt");
            FileInputStream file2 = new FileInputStream("file2.txt");
            FileInputStream file3 = new FileInputStream("file3.txt");
            Vector v = new Vector();
            v.add(file1);
            v.add(file2);
            v.add(file3);

         Enumeration e = v.elements();
         int i =0;
            SequenceInputStream input = new SequenceInputStream(e);
            while((i= input.read()) != -1){
                System.out.print((char)i);
            }
            file1.close();
            file2.close();
            file3.close();
            input.close();
        }catch(Exception e){
            e.printStackTrace();
        }

	}

}
