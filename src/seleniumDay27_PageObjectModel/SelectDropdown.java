package seleniumDay27_PageObjectModel;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown extends A_BaseClass {
	
	public static Select se;
	
	
	public static void selectByVisbibleText(WebElement  wb,String text)
	{
		se=new Select(wb);	
		se.selectByVisibleText(text);
		
	}

}
