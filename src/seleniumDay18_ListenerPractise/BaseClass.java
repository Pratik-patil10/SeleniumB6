package seleniumDay18_ListenerPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class BaseClass {
	
static WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() throws Exception
	{
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}
}
