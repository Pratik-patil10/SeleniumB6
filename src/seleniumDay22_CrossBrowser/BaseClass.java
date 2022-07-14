package seleniumDay22_CrossBrowser;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseClass {
	
//	 static WebDriver driver;
	
	
	@BeforeSuite
	@Parameters("browserName")
	public void openBrowser(String browserName) {
		
		if(browserName.equals("chrome")) {
			
			System.out.println("Code to be open Chrome Browser!");
		//	driver=new ChromeDriver();
			
		}else {
			System.out.println("Code to be open Firefox Browser!");
			//driver=new FirefoxDriver();
		}
	}

}
