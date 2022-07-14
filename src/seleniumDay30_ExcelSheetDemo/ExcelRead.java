package seleniumDay30_ExcelSheetDemo;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

//	below is code for reading the code or test data from excel sheet 
	
	public static Object[][] readExcel(String fileName, String sheetName){
		
		String[][] data = null;
		try {
			FileInputStream fis = new FileInputStream(fileName);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheetName);
			XSSFRow row = sh.getRow(0);
			int noOfCols = row.getLastCellNum();    // give the used coloumn count in the row
			
			int noOfRows = sh.getPhysicalNumberOfRows();	 // get the total used rows count (counting from 1)		
			Cell cell;
			data = new String[noOfRows - 1][noOfCols];
			for (int i = 1; i < noOfRows; i++) {
				for (int j = 0; j < noOfCols; j++) {
					row = sh.getRow(i);
					cell = row.getCell(j);
					data[i - 1][j] = cell.getStringCellValue();
				}
			}
		} catch (Exception e) {
			System.out.println("The exception is: " + e.getMessage());
		}
		return data;
	}
}
