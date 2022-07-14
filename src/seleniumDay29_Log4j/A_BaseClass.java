package seleniumDay29_Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class A_BaseClass {
	
	
	static WebDriver driver;
	
	SoftAssert soft=new SoftAssert();
	static Logger log;
	
	@BeforeSuite
	@Parameters("browserName")
	public void openBrowser(String browserName) {
		
		PropertyConfigurator.configure("D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\Log4jConfig.properties");
			
			if(browserName.equals("chrome")) {
				
				System.out.println("Code to be open Chrome Browser!");
				
				String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
				
				System.setProperty("webdriver.chrome.driver",driverPath);
				
				driver=new ChromeDriver();
				driver.manage().window().maximize();
//				driver.get("file:///D:/Study/1.SDET/JAVA/OfflineWebsite/index.html");
				
			}else {
				System.out.println("Code to be open Firefox Browser! Install Firefox Driver First");
				//driver=new FirefoxDriver();
		}
	}
	
@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
	}

}
