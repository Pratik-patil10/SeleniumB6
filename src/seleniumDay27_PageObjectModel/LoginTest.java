package seleniumDay27_PageObjectModel;

import org.testng.annotations.Test; 
import org.testng.asserts.SoftAssert;

public class LoginTest extends A_BaseClass {
	
	@Test
	public void loginTest()
	{
		driver.get("file:///D:/Study/1.SDET/JAVA/OfflineWebsite/index.html");
		LoginPageClass lp=new LoginPageClass();
		
		
		lp.login("kiran@gmail.com", "123456");
		
//		soft.assertEquals(driver.getCurrentUrl(),"file:///D:/Study/1.SDET/JAVA/OfflineWebsite/pages/examples/dashboardDEmo.html");
//		soft.assertAll();
	}

}
