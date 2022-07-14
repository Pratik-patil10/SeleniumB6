package seleniumDay24_PropertyFIleOperation;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void userAddFlow() throws Exception {
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		WebDriver driver = new ChromeDriver(); // -->this line will open browser
		
		driver.manage().window().maximize();
		
		driver.get(PropertyFileOperation.readProperty("url"));		//Called url property from Property file->>>Classname.readproperty("key")
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(PropertyFileOperation.readProperty("username"));	//input email id using property file
	
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PropertyFileOperation.readProperty("password"));;		//inputs password using property file
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();				//click on submit
		
		driver.findElement(By.xpath("//span[text()='Users']")).click();					
		
		driver.findElement(By.xpath("//button[text()='Add User']")).click();			
		
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));	
		userName.sendKeys("Pratik Patil");
		
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7584459810");	
			
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pratik@gmail.com");	
	
		
		
		
		driver.findElement(By.xpath("//input[@id='Male']")).click();						//click on male radio button
		
		
		
		
		Select se=new Select(driver.findElement(By.tagName("select")));
		
		se.selectByVisibleText("Punjab");		
	
		Thread.sleep(2000);
		
		List<WebElement> li=se.getAllSelectedOptions();		
		System.out.println(li.get(0).getText()); 		
		
		
		driver.findElement(By.id("password")).sendKeys("1122330");		
		
		driver.findElement(By.id("submit")).click();			
		Thread.sleep(2000);

		
		Alert al=driver.switchTo().alert();
		
		String alert=al.getText();
		
		PropertyFileOperation.writeProperty("message", alert);	//file write in configPropertyFile
		
		System.out.println(alert);	
		
		al.accept();
		
		driver.quit();
		
	}

}
