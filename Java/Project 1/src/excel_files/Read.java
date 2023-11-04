package excel_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("D:\\Zensar Workspace\\ExlFiles\\File1.xlsx");
		
		XSSFWorkbook wkbook;
		XSSFSheet sheet;
		
		try {
			FileInputStream excel = new FileInputStream(file);
			wkbook = new XSSFWorkbook(excel);
			sheet = wkbook.getSheet("Sheet1");
			System.out.println(sheet.getRow(2).getCell(3).getDateCellValue());
			
			int start = sheet.getFirstRowNum();
			int end = sheet.getLastRowNum();
			
			for(int i = start; i<= end; i++) {
				System.out.print(sheet.getRow(i).getCell(0).getStringCellValue() + "\t");
				System.out.print(sheet.getRow(i).getCell(1).getNumericCellValue() + "\t");
				System.out.print(sheet.getRow(i).getCell(2).getBooleanCellValue() + "\t");
				System.out.println(sheet.getRow(i).getCell(3).getDateCellValue());
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
