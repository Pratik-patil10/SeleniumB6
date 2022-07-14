package seleniumDay6_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinElementsIMP {

	public static void main(String[] args) {
		// 3D Plm Int. Que
		//IMP Interview que. 10 vajata element search kel ki disto and run hoto but 12 la run kel ki web element dist nahi & throws NoSuchException
		//ans use webElements, foreach loop and ArrayList. cz list size is dynamic and for each loop 
		//webElements use kelyamule if no any element is present it do not give exception.
		//ln#28-33 try changing the text to see whther exception comes or not also check by replcing elements->element
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		WebDriver driver = new ChromeDriver(); // -->this line will open browser
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Study/1.SDET/JAVA/OfflineWebsite/index.html");		//this is offline web application.
		//Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//a[text()='Register a new membership1']")).click();
		
		List<WebElement> li=driver.findElements(By.xpath("//a[text()='Register a new membership1']"));
		
		for(WebElement wb:li){
			wb.click();
		}

		driver.quit();

	}

}
