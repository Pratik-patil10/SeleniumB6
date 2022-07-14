package seleniumDay9_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		
		//ACtion Class is nothing but handling the all events related to mouce and keyboard.ALL
		
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
		
		Actions act=new Actions(driver);	//To perform action create action class obj ref.
		//mouse methods 06
		act.click(); //<<--normal click on web element
		
		act.clickAndHold();	//<<---to keep click pressing(click b)
		
		act.contextClick();	//mouse right click.
		
		act.doubleClick();//double click of mouse
		
		act.moveToElement(null);	//to move the mouse arrow from one place to another place
		
		act.dragAndDrop(null, null);	//elemt pick and drop action takes two element, source & Taget
		
		//keyboard events
		
		act.keyDown(Keys.TAB);	//Given key will be press in keydown
		act.keyUp(Keys.TAB);	//to release the pressed key use key up.
		
		
		
		

	}

}
