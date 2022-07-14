package seleniumDay14_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

public class AnnoDemo {
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
	
    public WebDriver driver ; 
    

    
  @Test
  public void verifyHomepageTitle() {
      
      System.out.println("launching Chrome browser"); 
      System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
//  
//  @Test
//  public void verifyHomepageTitle2() {
//      
//      System.out.println("launching Chrome browser"); 
//      System.setProperty("webdriver.chrome.driver", driverPath);
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get(baseUrl);
//      String expectedTitle = "Welcome: Mercury Tours";
//      String actualTitle = driver.getTitle();
//      Assert.assertEquals(actualTitle, expectedTitle);
//      driver.close();
//  }
//  
//  @Test
//  public void verifyHomepageTitle3() {
//      
//      System.out.println("launching Chrome browser"); 
//      System.setProperty("webdriver.chrome.driver", driverPath);
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get(baseUrl);
//      String expectedTitle = "Welcome: Mercury Tours";
//      String actualTitle = driver.getTitle();
//      Assert.assertEquals(actualTitle, expectedTitle);
//      driver.close();
//  }
//  
//  @Test
//  public void verifyHomepageTitle4() {
//      
//      System.out.println("launching Chrome browser"); 
//      System.setProperty("webdriver.chrome.driver", driverPath);
//      driver = new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.get(baseUrl);
//      String expectedTitle = "Welcome: Mercury Tours";
//      String actualTitle = driver.getTitle();
//      Assert.assertEquals(actualTitle, expectedTitle);
//      driver.close();
//  }
  
}
