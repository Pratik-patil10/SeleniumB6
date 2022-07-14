package seleniumDay27_PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashBoardPage extends A_BaseClass {
	
	public WebElement dashBoard=driver.findElement(By.xpath("//span[text()='Users']"));
	
	public void dashBoard()
	{
		dashBoard.click();
		
	}

}
