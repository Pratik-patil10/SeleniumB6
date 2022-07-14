package seleniumDay28_POM2_PageFactory;

import org.openqa.selenium.Alert; 


public class AlertHandle extends A_BaseClass {
	
	public Alert al;
	//public WebElement alert=driver.findElement(By.xpath("//button[text()='Add User']"));
	
	public void alertHandle()
	{
		al=driver.switchTo().alert();
		al.accept();
		
	}

}
