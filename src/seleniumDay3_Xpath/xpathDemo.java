package seleniumDay3_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {

	public static void main(String[] args) throws InterruptedException {
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		WebDriver driver = new ChromeDriver(); // -->this line will open browser
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Study/1.SDET/JAVA/OfflineWebsite/index.html");		//this is offline web application.
		
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();	//this absolute xpath type
		
		Thread.sleep(5000);
		
		WebElement email=driver.findElement(By.xpath("//input[@placeholder='Email']")); //this relative xpath type starts with//slsh
		email.sendKeys("kiran@gmail.com");
		

	}

}
