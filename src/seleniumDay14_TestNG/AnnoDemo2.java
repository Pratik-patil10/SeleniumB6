package seleniumDay14_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnoDemo2 {
	/*
	 * 1st – launchBrowser() 
	 * 2nd – verifyHomepageTitle() 
	 * 3rd – terminateBrowser()
	 */

	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
	
	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test
	public void verifyHomepageTitle() {

		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
}
