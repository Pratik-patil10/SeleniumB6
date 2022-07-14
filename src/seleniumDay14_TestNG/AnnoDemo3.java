package seleniumDay14_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnoDemo3 {
		/*
		 * The flow of our test would be:
	
	Go to the homepage and verify its title.
	Click REGISTER and verify the title of its target page.
	Go back to the homepage and verify if it still has the correct title.
	Click SUPPORT and verify the title of its target page.
	Go back to the homepage and verify if it still has the correct title.
		 */

	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
	
	public WebDriver driver;
	public String expected = null;
    public String actual = null;

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	
	@BeforeMethod
    public void verifyHomepageTitle() {
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

	//   
	@Test(priority = 0)
	public void register() {

		 driver.findElement(By.linkText("REGISTER")).click();
		 driver.navigate().back();
		 expected = "Register: Mercury Tours";
         actual = driver.getTitle();
         Assert.assertEquals(actual, expected);
	}
	
    @Test(priority = -1)
    public void support() {
          driver.findElement(By.linkText("SUPPORT")).click() ;
      //    driver.findElement(By.xpath("//div[@aria-label='Close ad']")).click();
//          driver.navigate().back();
//          driver.findElement(By.linkText("SUPPORT")).click() ;
          expected = "Under Construction: Mercury Tours";
          actual = driver.getTitle();
          Assert.assertEquals(actual, expected);
    }
    
    @AfterMethod
    public void goBackToHomepage ( ) {
          driver.findElement(By.linkText("Home")).click() ;
    }

	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
}
