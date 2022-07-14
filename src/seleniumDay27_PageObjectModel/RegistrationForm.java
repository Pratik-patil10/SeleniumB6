package seleniumDay27_PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationForm extends A_BaseClass {
	
	public WebElement Username=driver.findElement(By.xpath("//input[@id='username']"));
	public WebElement Mobile=driver.findElement(By.xpath("//input[@id='mobile']"));
	public WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
	public WebElement Gender=driver.findElement(By.xpath("//input[@id='Male']"));
	public WebElement State=driver.findElement(By.tagName("select"));
	public WebElement Password=driver.findElement(By.id("password"));
	public WebElement submit = driver.findElement(By.id("submit"));
	
	public void registrationForm(String userN,String mbN,String email,String text,String pw)
	{
		Username.sendKeys(userN);
		Mobile.sendKeys(mbN);
		Email.sendKeys(email);
		Gender.click();
		SelectDropdown.selectByVisbibleText(State, text);
		SelectDropdown.se.selectByVisibleText(text);
		Password.sendKeys(pw);
		submit.click();
		
	}

}
