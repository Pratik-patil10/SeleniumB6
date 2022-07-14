package seleniumDay25_WaitsInSelenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class FluentWaitDEmo {

	//No one use fluent wait -For interview only syntax of Fluent wait asked.....rarly.
	@Test
	public void FluentWaitDEmo() throws Exception {
		
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		WebDriver driver = new ChromeDriver(); // -->this line will open browser

		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		driver.findElement(By.xpath("//*[text()='Add Textbox2']")).click();
		
		FluentWait<WebDriver>  fl=new FluentWait<WebDriver>(driver)
				.withTimeout(10,TimeUnit.SECONDS)
				.pollingEvery(2,TimeUnit.SECONDS)
				.ignoring(NoAlertPresentException.class);
		
				fl.until(ExpectedConditions.alertIsPresent());
		
		
		
		
		
		
		driver.findElement(By.xpath("//*[text()='Add Textbox2']/following-sibling::h3/input")).sendKeys("Tester");
		Thread.sleep(2000);
		
		driver.quit();
	}
}
