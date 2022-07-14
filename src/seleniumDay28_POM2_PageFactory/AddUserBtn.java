package seleniumDay28_POM2_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserBtn extends A_BaseClass {
	
	WebDriver driver;
	
	@FindBy(xpath = "//button[text()='Add User']")
	WebElement addUserBtn;
	
	AddUserBtn(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addUserBtn()
	{
		addUserBtn.click();
		
	}

}
