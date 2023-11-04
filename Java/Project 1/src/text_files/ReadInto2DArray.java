package text_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadInto2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object [][] arr2 = ReadExcelData();
		System.out.println(arr2[0][0]);
		System.out.println(arr2[2][2]);
		System.out.println(arr2[3][1]);
	}
	
	public static Object [][] ReadExcelData(){
		File file = new File("D:\\Zensar Workspace\\ExlFiles\\File1.xlsx");
		
		XSSFWorkbook wkbook;
		XSSFSheet sheet;
		
		Object [][] arr = new Object [0][0];
		
		try {
			FileInputStream excel = new FileInputStream(file);
			wkbook = new XSSFWorkbook(excel);
			sheet = wkbook.getSheet("Sheet1");
			
			int start = sheet.getFirstRowNum();
			int end = sheet.getLastRowNum();
			
			arr = new Object[end - start + 1][4];
			
			for(int i = start; i<= end; i++) {
				arr[i][0] = sheet.getRow(i).getCell(0).getStringCellValue();
				arr[i][1] = sheet.getRow(i).getCell(1).getNumericCellValue();
				arr[i][2] = sheet.getRow(i).getCell(2).getBooleanCellValue();
				arr[i][3] = sheet.getRow(i).getCell(3).getDateCellValue();
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		return arr;
	}

}
