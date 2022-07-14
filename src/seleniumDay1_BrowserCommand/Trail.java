package seleniumDay1_BrowserCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trail {

	public static void main(String[] args) {
		
		
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		WebDriver driver = new ChromeDriver(); // -->this line will open browser
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		driver.findElement(By.tagName("input")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Hello");
		
		//driver.quit();

	}

}
