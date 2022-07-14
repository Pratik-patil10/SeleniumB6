package seleniumDay11_JSExc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		WebDriver driver = new ChromeDriver(); // -->this line will open browser

		driver.manage().window().maximize();
		
		driver.get("http://www.seleniumeasy.com"); // 
		
		JavascriptExecutor js=(JavascriptExecutor)driver; 	//Narrowing -castning
		
		//------------TO SCROLL VARTICALLYTLLY ONLY
		
		js.executeScript("window.scrollBy(0,1000)", "");	//vertical down scrolling
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-1000)", ""); //vertical UP scrolling
		Thread.sleep(2000);
		//-----------------TO SCROLL HORIZONATLLY
	//	js.executeScript("window.scrollBy(1000,0)", "");	//hORIZONATAL RIGHT scrolling
	//	Thread.sleep(2000);
	//	js.executeScript("window.scrollBy(1000,0)", "");	//hORIZONATAL left scrolling
	//	Thread.sleep(2000);
		
		//if you want to go directly to the specfic location e.g. subscribe btn at bottm
		
		WebElement text=driver.findElement(By.xpath("//a[text()='Read more in Java']"));
		js.executeScript("arguments[0].scrollIntoView(true)", text);
		Thread.sleep(2000);
		
		WebElement submitBtn=driver.findElement(By.xpath("//input[@value='Subscribe']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", submitBtn);	//joparent submit btnn dist nahi toprent scrool hoil
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-1500)", "");	//up scrolled
		Thread.sleep(2000);
//		
//		//if you want to directly to the bottom//bottom footer of page
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");	//scroll to boootm of page /footer
//		
//		//----------Below is set data to textbox
		WebElement emailText=driver.findElement(By.xpath("//input[@type='email']"));
//		
		js.executeScript("arguments[0].value='hi@m'",emailText);
		Thread.sleep(2000);
//		
//		//-------------below is used to click the web element
		js.executeScript("arguments[0].click()", submitBtn);
		
		driver.quit();
	}

}
