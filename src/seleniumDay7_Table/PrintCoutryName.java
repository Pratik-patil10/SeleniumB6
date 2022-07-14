package seleniumDay7_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintCoutryName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Find th  value from table-->> e.g. print UK
 */
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		WebDriver driver = new ChromeDriver(); // -->this line will open browser

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/html_tables.asp"); // this isweb application.

		List<WebElement> rowList = driver.findElements(By.xpath("//table[@id='Customers']/tbody/tr"));

		for (int i = 2; i <= rowList.size() - 1; i++) {

				String xpath = "//table[@id='Customers']/tbody/tr[" + i + "/td[1]";

				WebElement wb = driver.findElement(By.xpath(xpath));

				if (wb.getText().equals("Island Trading")) {

					String country = driver.findElement(By.xpath("//table[@id='Customers']/tbody/tr[" + i + "/td[3]")).getText();
					System.out.println(country);
				

					/* from offline table delete the user using above concept*/
					
			}
		}
	}

}
