package seleniumDay29_Log4j;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class A_MasterClass extends A_BaseClass {
	
	@Test
	public void masterRun() throws InterruptedException 
	{
		log = Logger.getLogger(A_MasterClass.class);
		
		log.info("running test case : loginTest");
		
		
		driver.get("file:///D:/Study/1.SDET/JAVA/OfflineWebsite/index.html");
		
		log.info("url opened");
		
		LoginPageClass lt=new LoginPageClass(driver);	//login
		lt.login("kiran@gmail.com", "123456");
		log.info("email and password entered");

		
		log.info("loginTest Pass");
		
	
	}
	

}
