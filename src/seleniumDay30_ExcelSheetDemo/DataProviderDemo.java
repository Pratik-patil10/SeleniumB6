package seleniumDay30_ExcelSheetDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	//if below data provider is not in another class use only dataProvider = "loginData"
	
	//@Test(dataProvider = "loginData")	------if want to use data provider within class use this synatx.
  @Test(dataProviderClass=seleniumDay21_ParametDataProvider.AllDataProviders.class, dataProvider = "loginData")	
  public void login(String uname,String pw) throws Exception {	//String used because test data in format of string
	  
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		WebDriver driver = new ChromeDriver(); // -->this line will open browser
		
		driver.manage().window().maximize();
	    driver.get("file:///D:/Study/1.SDET/JAVA/OfflineWebsite/index.html");		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uname);	
	
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pw);;		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		Thread.sleep(2000);
		driver.quit();
  }
  


}
