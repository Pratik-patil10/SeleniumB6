package seleniumDay27_PageObjectModel;

import org.testng.annotations.Test;

public class A_MasterClass extends A_BaseClass {
	
	@Test
	public void masterRun() throws InterruptedException 
	{

		LoginPageClass lt=new LoginPageClass();	//login
		lt.login("kiran@gmail.com", "123456");
		
		DashBoardPage db=new DashBoardPage();	//dashboard user click
		db.dashBoard();
		
		AddUserBtn au=new AddUserBtn();		//add userbtn click
		au.addUserBtn();
		
		RegistrationForm rf=new RegistrationForm();
		rf.registrationForm("Pratik Patil", "1235588", "test@test.com", "HP", "24448054");
		
		Thread.sleep(1000);
		
		AlertHandle al=new AlertHandle();
		al.alertHandle();
	}
	

}
