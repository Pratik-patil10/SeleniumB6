package seleniumDay20_Parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void openBrowsrer(){
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

			driver = new ChromeDriver(); // -->this line will open browser
			
			driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void closeBrowsrer(){

			
			driver.quit();
	}

}
