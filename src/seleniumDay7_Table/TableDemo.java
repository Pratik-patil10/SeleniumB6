package seleniumDay7_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		WebDriver driver = new ChromeDriver(); // -->this line will open browser
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Study/1.SDET/JAVA/OfflineWebsite/index.html");		//this is offline web application.
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");	//input email id
	
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");;		//inputs password
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();				//click on submit
		
		driver.findElement(By.xpath("//span[text()='Operators']")).click();					//click on users
		
		
		List<WebElement> rowNum=driver.findElements(By.xpath("//table/tbody/tr"));		//list of rows by find elements
		System.out.println(rowNum.size());												//gives size
		
		for (int i = 0; i <= rowNum.size() ; i++) {

			String colXpath = "//table/tbody/tr[" + i + "]/td"; // table/tbody/tr[1]/td <<---------simi.2,3,4,5,6 till
			//table/tbody/tr[i]/td[j]

			List<WebElement> colNum = driver.findElements(By.xpath(colXpath));

			// System.out.println(colNum.size());

			for (int j = 1; j < colNum.size() ; j++) { // for coloum of each row

				String xpath = "//table/tbody/tr[" + i + "]/td[" + j + "]"; // xpath for each colom of each row
				String value = driver.findElement(By.xpath(xpath)).getText();
				System.out.print(value + " | ");
			}
			System.out.println();
		}

	}

}
