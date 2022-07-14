package seleniumDay2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		WebDriver driver = new ChromeDriver(); // -->this line will open browser
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Study/1.SDET/JAVA/OfflineWebsite/index.html");		//this is offline web application.
		
		//return type web element so we store in on obj. emailText.
		WebElement emailText = driver.findElement(By.id("email"));	//this will locate particular element by id Locator.
	//above line similar to	Char c=str.length 						//similar for name locator if name attribute is present
		emailText.sendKeys("kiran@gmail.com"); 	//this will put input on the particualr element.
		
		
		WebElement pasword=driver.findElement(By.id("password"));
		pasword.sendKeys("123456");
		
		WebElement submitBtn=driver.findElement(By.tagName("button"));		//tagName
		submitBtn.click();
		Thread.sleep(5000); 
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement registerLink=driver.findElement(By.linkText("Register a new membership"));	//linkText
		registerLink.click();
		Thread.sleep(2000);
		
		WebElement partialLink=driver.findElement(By.partialLinkText("have a membership"));		//partialLinkText -if want find by partial text 
		partialLink.click();		
	
	}

}
