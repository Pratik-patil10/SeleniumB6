package seleniumDay5_DropDown;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		
		
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		WebDriver driver = new ChromeDriver(); // -->this line will open browser
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Study/1.SDET/JAVA/OfflineWebsite/index.html");		//this is offline web application.
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");	//input email id
	
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");;		//inputs password
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();				//click on submit
		
		
		driver.findElement(By.xpath("//span[text()='Users']")).click();					//click on users
		
		
		driver.findElement(By.xpath("//button[text()='Add User']")).click();			//click on add user
		
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));	////inputs usrname
		userName.sendKeys("Pratik Patil");
		
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7584459810");	//inputs mb no
			
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pratik@gmail.com");	//inputs email
	
		
		driver.findElement(By.xpath("//input[@id='Male']")).click();						//click on male radio button
		
		
		//Select se=new Select(Select Dropdown Web Element)
		Select se=new Select(driver.findElement(By.tagName("select")));
		
//		se.selectByIndex(1);		//it select the value by index no i.e. 0,1,2,3,4,5,......
//		Thread.sleep(2000);
//		
//		se.selectByValue("Delhi");		// option="value"<<--- select by vale in DOM
//		Thread.sleep(2000);
		
		se.selectByVisibleText("Punjab");		//we see the text on UI & select by that text
	
		Thread.sleep(2000);
		
		System.out.println(se.isMultiple()); 	//this is use to check whether the selct is multiple or not
	
		//if dropdown is multliple selection available then we can use below deselect command
		/*
		se.deselectByIndex(1);
		se.deselectByValue("Delhi");
		se.deselectByVisibleText("Punjab");
		se.deselectAll();
		*/
		
		List<WebElement> li=se.getAllSelectedOptions();		//this option gives the list of select web element. for this we use list collection
		System.out.println(li.get(0).getText()); 		//list object creted at get method called for list.
		
		
		driver.findElement(By.id("password")).sendKeys("1122330");		//password entered
		
		driver.findElement(By.id("submit")).click();				//submit clicked.
		Thread.sleep(2000);
		//below is interface to handle the alert window.
		//two types ln#83 is direct  use of accept
		//driver.switchTo().alert().accept();
		
		Alert al=driver.switchTo().alert();
		
		String alert=al.getText();
		System.out.println(alert);	//this show in console alert text present in ui
		
		al.accept();	//to accept only alert.
		//al.dismiss();	//to dismiss the alert.
		//al.sendKeys("Text to enter in alert is type of input text");

		Thread.sleep(2000);
		driver.quit();					//close the browser


	}

}
