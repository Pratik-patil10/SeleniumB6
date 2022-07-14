package seleniumDay28_POM2_PageFactory;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
	//1st stage-Using Page Factory WebElement Declaration is used as below
	
	
	WebDriver driver;	//global driver		.........this is not webdriver driver from parent clas
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	
	
	@FindBy(xpath = "//input[@id='password']']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']']")
	WebElement submit;
	
	//2nd stage initializing constructor
	LoginPageClass(WebDriver driver)
	{
		this.driver=driver;		//equate the global driver and input driver
		PageFactory.initElements(driver, this);
	}
	
	public void login(String emailID,String PassWord)
	{
		email.sendKeys(emailID);
		password.sendKeys(PassWord);
		submit.click();

		
	}
}
