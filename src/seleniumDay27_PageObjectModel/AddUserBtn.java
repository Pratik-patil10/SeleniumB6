package seleniumDay27_PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddUserBtn extends A_BaseClass {
	
	public WebElement addUserBtn=driver.findElement(By.xpath("//button[text()='Add User']"));
	
	public void addUserBtn()
	{
		addUserBtn.click();
		
	}

}
