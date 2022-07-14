package seleniumDay27_PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class A_BaseClass {
	
	//POM-Page Object Model works like for every module create a one class impleemtn it in another by creating object of that class.
	//Master(All-class)->Loginpageclass->DashBoard->AddUserBtn->DropDownHandle->Registration Form->Alert
	
	static WebDriver driver;
	
	SoftAssert soft=new SoftAssert();
	
	@BeforeSuite
	@Parameters("browserName")
	public void openBrowser(String browserName) {
			
			if(browserName.equals("chrome")) {
				
				System.out.println("Code to be open Chrome Browser!");
				
				String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
				
				System.setProperty("webdriver.chrome.driver",driverPath);
				
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("file:///D:/Study/1.SDET/JAVA/OfflineWebsite/index.html");
				
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
