package seleniumDay25_WaitsInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class ExplicitWaitReal {

	@Test
	public void ImplicitWaitReal() throws Exception {
		
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		WebDriver driver = new ChromeDriver(); // -->this line will open browser

		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		driver.findElement(By.xpath("//*[text()='Add Textbox2']")).click();
		
		
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//*[text()='Add Textbox2']/following-sibling::h3/input"))));
//		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[text()='Add Textbox2']/following-sibling::h3/input"))))	;
//		wait.until(ExpectedConditions.elementToBeSelected((By.xpath("//*[text()='Add Textbox2']/following-sibling::h3/input"))))	;
//		
		//this mean wait for 10sec element may occur in 10 otherwise u can give exception.
		//Explicit wait will wait for 10sec before throwing TIMEOUT Exception
		//by mean element value changed to demo the wait i.e. to get TIMEOUT element
		//if above wait codeline commented then it directly throws exception ,,try
		
		driver.findElement(By.xpath("//*[text()='Add Textbox2']/following-sibling::h3/input")).sendKeys("Tester");
		Thread.sleep(2000);
		
		driver.quit();
	}
}
