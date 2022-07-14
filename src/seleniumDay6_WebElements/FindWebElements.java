package seleniumDay6_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindWebElements {

	public static void main(String[] args) throws InterruptedException {
	
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
		
				
		List<WebElement> li= driver.findElements(By.tagName("a")); 			//this give multiple elements 
		System.out.println("Size of anchor tag list is: "+li.size()); 		//gives size of list
		
		for(WebElement wb:li) {
			System.out.println(wb.getAttribute("href"));			//this prints all the link of web elements
		}
		driver.quit();
		

	}

}
