package seleniumDay28_POM2_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationForm {
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement Username;
	
	
	@FindBy(xpath = "//input[@id='mobile']']")
	WebElement Mobile;
	
	@FindBy(xpath = "//input[@id='email']']")
	WebElement Email1;
	
	@FindBy(xpath = "//input[@id='Male']']")
	WebElement Gender;
	
	@FindBy(tagName ="select" )
	WebElement State;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(id = "submit")
	WebElement submit;
	
	
	
	
//	public WebElement Username=driver.findElement(By.xpath("//input[@id='username']"));
	//public WebElement Mobile=driver.findElement(By.xpath("//input[@id='mobile']"));
//	public WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
//	public WebElement Gender=driver.findElement(By.xpath("//input[@id='Male']"));
//	public WebElement State=driver.findElement(By.tagName("select"));
//	public WebElement Password=driver.findElement(By.id("password"));
//	public WebElement submit = driver.findElement(By.id("submit"));
	
	
	RegistrationForm(WebDriver driver)
	{
		this.driver=driver;		//equate the global driver and input driver
		PageFactory.initElements(driver, this);
	}
	
	public void registrationForm(String userN,String mbN,String email,String text,String pw)
	{
		Username.sendKeys(userN);
		Mobile.sendKeys(mbN);
		Email1.sendKeys(email);
		Gender.click();
		SelectDropdown.selectByVisbibleText(State, text);
		SelectDropdown.se.selectByVisibleText(text);
		Password.sendKeys(pw);
		submit.click();
		
	}

}
