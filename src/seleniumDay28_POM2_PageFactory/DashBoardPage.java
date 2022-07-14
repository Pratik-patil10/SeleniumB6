package seleniumDay28_POM2_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends A_BaseClass {
	
	WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Users']")
	WebElement dashBoard;
	
	DashBoardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void dashBoard()
	{
		dashBoard.click();
		
	}

}
