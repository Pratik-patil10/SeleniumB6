package seleniumDay30_ExcelSheetDemo;

import org.testng.annotations.DataProvider;

public class AllDataProviders {
	 @DataProvider(name="loginData")
	 public Object[][] excelData()     // return type of data provider , two dimentional array object
	 {
	 	Object[][] obj= ExcelRead.readExcel("D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\src\\seleniumDay30_ExcelSheetDemo\\hellow.xlsx", "sheet1");
	 	return obj;
	 	
	 }

}
