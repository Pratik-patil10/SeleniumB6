package seleniumDay9_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteUsingActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PS:- Copy the username text From UI And paste the texte next to the username text box.
		
		
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		WebDriver driver = new ChromeDriver(); // -->this line will open browser
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Study/1.SDET/JAVA/OfflineWebsite/index.html");		//this is offline web application.
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");	//input email id
	
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");;		//inputs password
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();				//click on submit
		
		driver.findElement(By.xpath("//span[text()='Users']")).click();					//click on users
		
		
		driver.findElement(By.xpath("//button[text()='Add User']")).click();			//click on add user
		
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.xpath("//label[text()=\"Username\"]"))).build().perform();
		
		ac.doubleClick().perform();
		
		ac.keyDown(Keys.CONTROL).build().perform();
		
		ac.sendKeys("c").build().perform();
		

		ac.keyUp(Keys.CONTROL).build().perform();
		
		ac.sendKeys(Keys.TAB).build().perform();

		
		ac.keyDown(Keys.CONTROL).build().perform();

		
		ac.sendKeys("v").build().perform();
		
		ac.keyUp(Keys.CONTROL).build().perform();
		
		driver.quit();
		
		
	}

}
