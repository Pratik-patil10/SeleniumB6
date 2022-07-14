package groupDiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // -->this line will open browser
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Study/1.SDET/JAVA/OfflineWebsite/index.html");		//this is offline web application.
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");	//input email id
		
		//Thread.sleep(2000);
		//email.clear();
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");;		//inputs password
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();				//click on submit
		
		
		driver.findElement(By.xpath("//span[text()='Users']")).click();					//click on users
		
		
		driver.findElement(By.xpath("//button[text()='Add User']")).click();			//click on add user
		
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));	////inputs usrname
		userName.sendKeys("Pratik Patil");
		
		System.out.println("Attribute Value is: "+userName.getAttribute("type"));	//this gives attribute value from html page.
		System.out.println("Tag name Value is: "+userName.getTagName());					//this gives tag name .
		
		String UiText=driver.findElement(By.xpath("//span[text()='Cancel']")).getText();	//this gives text present on UI to particlr tag.
		System.out.println("UI text is is: "+UiText);
		
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7584459810");	//inputs mb no
			
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pratik@gmail.com");	//inputs email
	
		
		driver.findElement(By.xpath("//input[@id='Male']")).click();						//click on male radio button
		
		System.out.println(driver.findElement(By.xpath("//input[@id='Male']")).isSelected()); //this give that whtere it is selected or not
		
		System.out.println(driver.findElement(By.xpath("//input[@id='Male']")).isEnabled());	//this will give T/F value whether the element is enables or not.
		
		System.out.println(driver.findElement(By.xpath("//input[@id='Male']")).isDisplayed());
		
		
		
		
		
//		Thread.sleep(2000);
//		driver.quit();					//close the browser
	}

}
