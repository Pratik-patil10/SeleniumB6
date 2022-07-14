package seleniumDay26_FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandlingDemo {

	@Test
	public void tc1() throws Exception {

		String driverPath = "D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverPath);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1600)", "");
		// to perform frame handling first need to switch the frame then we can use
		// xpath & all.
		// to enter in child frame below three type
//	 driver.switchTo().frame(2);		//by index no
//	 driver.switchTo().frame(driver.findElement(By.id("frm2")));	//by xpath ID
		driver.switchTo().frame("frm2"); // by string args.

		driver.findElement(By.xpath("//input[@placeholder='Enter First Name'][@name='fName']")).sendKeys("Tester");
		driver.navigate().refresh();
		Thread.sleep(2000);

		// to switch from frame2 to any element of parent/to out frome child frame use
		// below
		driver.switchTo().defaultContent();
		// this will fail beacause xpath in main frame is not present

		js.executeScript("window.scrollBy(0,-1600)", "");
		driver.findElement(By.xpath("//input[@placeholder='Enter First Name'][@name='fName']")).sendKeys("Tester");

	}

}
