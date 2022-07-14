package seleniumDay18_ListenerPractise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreeShot  {

	public static void main(String[] args) throws IOException  {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/guru99home");
		
		// to take a screenshot
				
		TakesScreenshot scrShot =((TakesScreenshot)driver);	//narrwoing TYpe casting used
		
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\ScreenShots\\Scrennshot.jpeg");
		
		FileUtils.copyFile(SrcFile, DestFile);	//for this need to add FileUtils Package from Apache Sites.
		driver.quit();
		
	}

}
