package seleniumDay1_BrowserCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserCommand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		WebDriver driver = new ChromeDriver(); // -->this line will open browser

		//Parent pc=new Child();
		//webdrive is interface of selenium. And Webdriver interface has all unimplementd comands.
		//webdriver driver=new WebDriver();--->>> Not possible 
		//ChromeDriver driver=new ChromeDriver():------->> Possible as chromeDriver having all implemented methods.

		driver.get("https://www.google.co.in"); // -->>This will open the given url in browser

		String pageTitle = driver.getTitle(); // this will fetch page titlez

		System.out.println("Page title is " + pageTitle);

		System.out.println(driver.getCurrentUrl()); // gives current url

//		System.out.println(driver.getPageSource()); // Sourcecode of current web page/

		driver.manage().window().maximize();	 // this will maximize the window.
		//driver.manage().window().fullscreen();	//this will make fullscreen
		
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();	//this will maximize the window
		driver.navigate().back();		//this will backward the window.
		Thread.sleep(2000);
		driver.navigate().forward();	//this will forward the window.
		Thread.sleep(2000);
		driver.navigate().refresh();	//this will refresh the current window
		
		driver.navigate().to("https://www.selenium.dev");	//this will navigate to particular window/site
		
		driver.close();	//this will close current window.	
		driver.quit();	//this will close all the window

	}

	

}
