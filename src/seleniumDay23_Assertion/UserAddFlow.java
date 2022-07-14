package seleniumDay23_Assertion;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserAddFlow {
	
	/*
	1)Assert.assertEquals(driver.findElement(By.xpath("//input[@id='Male']")), true);		//<<---If by default male selected then only TC pass.
	
	2)Assert.assertTrue(boalean);		<<------if given parameter is true then it goes next.
	3)Assert.assertFalse(boolean)		<<------if given parameter is false then it goes next.
	*/
	
	@Test
	public void userAddFlow() throws Exception {
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);
		
		WebDriver driver = new ChromeDriver(); // -->this line will open browser
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Study/1.SDET/JAVA/OfflineWebsite/index.html");		//this is offline web application.
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");	//input email id
	
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");;		//inputs password
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();				//click on submit
		
		//check if the login is successfull or not.........With help of URL,If both url are equal then only it goes next
		Assert.assertEquals(driver.getCurrentUrl(),"file:///D:/Study/1.SDET/JAVA/OfflineWebsite/pages/examples/dashboard.html");
		
		
		driver.findElement(By.xpath("//span[text()='Users']")).click();					
		
		driver.findElement(By.xpath("//button[text()='Add User']")).click();			
		
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));	
		userName.sendKeys("Pratik Patil");
		
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7584459810");	
			
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pratik@gmail.com");	
	
		
		//Assert.assertEquals(driver.findElement(By.xpath("//input[@id='Male']")), true);		//<<---If by default male selected then only TC pass.
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='Male']")).isSelected());
		
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
		System.out.println(alert);	
		
//		Assert.assertEquals(alert, "User Added Successfully. You can see added user." );	//<-----If alert message and this msg is equls then only It goes ahead.
	
		Assert.assertEquals(alert, "User Added Successfully. You can see added user.", "Wrong Alert Message on alert box" );
		
		al.accept();	//to accept only alert.
	}
	
//	
//	@Test
//	public void userAddFlow2() throws Exception {
//		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
//		
//		System.setProperty("webdriver.chrome.driver",driverPath);
//		
//		WebDriver driver = new ChromeDriver(); // -->this line will open browser
//		
//		driver.manage().window().maximize();
//		
//		driver.get("file:///D:/Study/1.SDET/JAVA/OfflineWebsite/index.html");		//this is offline web application.
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");	//input email id
//	
//		
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");;		//inputs password
//		
//		driver.findElement(By.xpath("//button[@type='submit']")).click();				//click on submit
//		
//		//check if the login is successfull or not.........With help of URL,If both url are equal then only it goes next
//		Assert.assertEquals(driver.getCurrentUrl(),"file:///D:/Study/1.SDET/JAVA/OfflineWebsite/pages/examples/dashboard.html");
//		
//		
//		driver.findElement(By.xpath("//span[text()='Users']")).click();					
//		
//		driver.findElement(By.xpath("//button[text()='Add User']")).click();			
//		
//		
//		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));	
//		userName.sendKeys("Pratik Patil");
//		
//		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7584459810");	
//			
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pratik@gmail.com");	
//	
//		
//		//Assert.assertEquals(driver.findElement(By.xpath("//input[@id='Male']")), true);		//<<---If by default male selected then only TC pass.
//		
//		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='Male']")).isSelected());
//		
//		driver.findElement(By.xpath("//input[@id='Male']")).click();						//click on male radio button
//		
//		
//		
//		
//		Select se=new Select(driver.findElement(By.tagName("select")));
//		
//		se.selectByVisibleText("Punjab");		
//	
//		Thread.sleep(2000);
//		
//		List<WebElement> li=se.getAllSelectedOptions();		
//		System.out.println(li.get(0).getText()); 		
//		
//		
//		driver.findElement(By.id("password")).sendKeys("1122330");		
//		
//		driver.findElement(By.id("submit")).click();			
//		Thread.sleep(2000);
//
//		
//		Alert al=driver.switchTo().alert();
//		
//		String alert=al.getText();
//		System.out.println(alert);	
//		
////		Assert.assertEquals(alert, "User Added Successfully. You can see added user." );	//<-----If alert message and this msg is equls then only It goes ahead.
//	
//		Assert.assertEquals(alert, "User Added Successfully. You can see added user.", "Wrong Alert Message on alert box" );
//		
//		al.accept();	//to accept only alert.
//	}
//	

}
