package groupDiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // -->this line will open browser
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Study/1.SDET/JAVA/OfflineWebsite/index.html");
		
//		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");
		
		
		
		
	}

}
