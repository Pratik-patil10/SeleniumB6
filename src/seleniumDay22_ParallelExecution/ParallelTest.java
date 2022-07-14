package seleniumDay22_ParallelExecution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ParallelTest extends BaseClass {
	
	@Test
	public void test1() throws InterruptedException {	
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Study/1.SDET/JAVA/OfflineWebsite/index.html");		//this is offline web application.
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");	//input email id
			
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");;		//inputs password
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	

}
