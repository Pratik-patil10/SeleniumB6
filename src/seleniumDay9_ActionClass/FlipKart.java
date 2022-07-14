package seleniumDay9_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https:www.flipkart.com");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.ESCAPE).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//*[text()='Electronics']"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//*[text()='Gaming']"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//*[text()='Games']"))).build().perform();
		act.click().build().perform();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
