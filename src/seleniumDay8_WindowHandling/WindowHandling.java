package seleniumDay8_WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) throws Exception{
		
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		WebDriver driver = new ChromeDriver(); // -->this line will open browser <<---mthod oveloading /runtime polymorphism
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String mainWindow=driver.getWindowHandle();
		System.out.println("Adress of Main windows is:"+mainWindow);
		
		System.out.println("--------------------------------------------------");
		
		WebElement btn=driver.findElement(By.id("newWindowsBtn"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",btn);	//this is just used here to scroll..  detail in next
		
		btn.click();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		for(String s:allWindows) {
			System.out.println("Adress of All windows Are: ");
			System.out.println(s);
			
			driver.switchTo().window(s).getCurrentUrl();	//Each window vr switch krel and url print.
			System.out.println();
			Thread.sleep(2000);
		}

		driver.quit();
	}

}
