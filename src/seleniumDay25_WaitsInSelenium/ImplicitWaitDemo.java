package seleniumDay25_WaitsInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class ImplicitWaitDemo {

	@Test
	public void ImplicitWaitDemo() {
		
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		WebDriver driver = new ChromeDriver(); // -->this line will open browser

		driver.manage().window().maximize();
		driver.get("file:///D:/Study/1.SDET/JAVA/OfflineWebsite/index.html");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com"); // input email id using

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	//this mean wait for 10sec element may occur in 10 otherwise u can give exception.
		//Implicit wait will wait for 10sec before throwing NO SUCH ELEMENT Exception
		driver.findElement(By.xpath("//button[@type='SigIN']")).click();	//by mean element value changed to demo the wait i.e. to get no such element
		driver.quit();
	}
}
