package seleniumDay20_Parameterization;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationDemo extends BaseClass {
	//driver.get("file:///D:/Study/1.SDET/JAVA/OfflineWebsite/index.html");
	//Parameters Annotation in TestNG is a method used to pass values to the
	//test methods as arguments using .xml file. Users may be required to pass the values to the test methods during run time.
	//for un ,pw,qurl go to xml file-> parameter are defined there & name are used here.
  @Test
  @Parameters({"qurl","un","pw"})	//we say that take the value from xml file

  public void loginTest(String url,String userName,String Password) throws Exception {
		driver.get(url);		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userName);	
	
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);;		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		Thread.sleep(2000);		
  }
  
  @Test
  @Parameters({"qurl","un","pw"})	//we say that take the value from xml file
  
  public void loginTest2(String url1,String userName,String Password) throws Exception {
		driver.get(url1);		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userName);	
	
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);;		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		Thread.sleep(2000);		
  }
  @Test
  @Parameters({"qurl","un","pw"})	//we say that take the value from xml file
  
  public void loginTest3(String url,String userName,String Password) throws Exception {
		driver.get(url);		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userName);	
	
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);;		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		Thread.sleep(2000);
		
  }
}
