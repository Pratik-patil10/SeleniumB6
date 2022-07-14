package seleniumDay22_ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	 static WebDriver driver;
	
	@BeforeTest
	@Parameters("browserName")
	public void openBrowser(String browserName) {
		
		if(browserName.equals("chrome")) {
			String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
			
			System.setProperty("webdriver.chrome.driver",driverPath);

			 driver = new ChromeDriver(); 
			System.out.println("Code to be open Chrome Browser!");
		
			
		}else {
			System.out.println("Code to be open Firefox Browser!");
			//driver=new FirefoxDriver();
		}
	}
	@AfterTest
	public void closeBrowser() {
//		driver.quit();
	}

}
