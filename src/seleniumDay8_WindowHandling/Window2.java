package seleniumDay8_WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window2 {

	// Handling windows of child
	// manin window->child window(basic control)->add text in textbox->close child
	// windiw->backto main window->close main

	public static void main(String[] args) {
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);
		WebDriver driver = new ChromeDriver(); // -->this line will open browser <<---mthod oveloading /runtime
												// polymorphism

		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		String mainWindow = driver.getWindowHandle();

		WebElement btn = driver.findElement(By.id("newWindowsBtn"));

		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true)", btn); 							// this is just used here
																								// to scroll.. detail in
																								// next

		btn.click();

		Set<String> allWindows = driver.getWindowHandles();

		for (String id : allWindows) {

			driver.switchTo().window(id);

			if (driver.getCurrentUrl().equals("https://www.hyrtutorials.com/p/basic-controls.html")) {

				
				driver.manage().window().maximize();

				// below line not working so commentd for now
				WebElement text=driver.findElement(By.id("firstName"));
				//WebElement text = driver.findElement(By.xpath("//input[@placeholer='Enter First Name']"));

				js.executeScript("arguments[0].scrollIntoView(true)", text);
				text.sendKeys("Pratik Patil");

			} else if (driver.getWindowHandle().equals(mainWindow) == false) {
				driver.close();

			}

		}
		driver.switchTo().window(mainWindow);

		driver.quit();

	}

}
