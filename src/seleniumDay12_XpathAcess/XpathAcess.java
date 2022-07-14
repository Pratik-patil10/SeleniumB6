package seleniumDay12_XpathAcess;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAcess {

	public static void main(String[] args) {
		// Xpath acess :-
		//Whenever we want to move from one element to its sibling above/below elements ,and basic xpath is same for all,we use Acess Xpath
		//Types-following sibiling (below),preceding sibling(Above), parent(Upper)-Sabka baap ,child(Next)-.
		
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);
		WebDriver driver = new ChromeDriver(); // -->this line will open browser
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		
		WebElement lName=driver.findElement(By.xpath("//input[@name='name'] [@maxlength='15']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", lName);
	//	driver.findElement(By.xpath("//input[@name='name'] [@maxlength='15']")).sendKeys("Patil");
		
		
	}

}
