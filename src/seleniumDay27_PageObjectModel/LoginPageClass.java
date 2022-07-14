package seleniumDay27_PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPageClass extends A_BaseClass {
	
	public WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
	
	public WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
	
	public WebElement submit= driver.findElement(By.xpath("//button[@type='submit']"));
	
	
	public void login(String emailID,String PassWord)
	{
		email.sendKeys(emailID);
		password.sendKeys(PassWord);
		submit.click();
		
	}
}
