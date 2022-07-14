package seleniumDay19_DependsOn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoClass {
	//below is the test class if priority is not given it run albhabetically.
	//if priority given then it will run by priority
	//Using dependsON below flow is executed where on method is depend on previuos
	//if in this flow one of method fails ,next to that all test fails & it moves to skipped test
	//We can perform DependsOn 1.By methods 2.By group.+
	//IMP Point
	//If DependsOn method contains muliple method then it should pass multiple method if one of method had failed it also fails.
	//Dependacny method & Dependant both present in same class
	
	//Signup->Login->Search->adToCart->Payments->PlaceOrder->CheckStatus
	
	@Test(groups = {"smoke","regression","sanity"})
	public void SignUp1() {
		System.out.println("This is class SignUp");

	}
	
	@Test(dependsOnGroups ={"smoke","regression","sanity"} )
	public void SignUp() {
		System.out.println("This is class SignUp");

	}

	@Test(dependsOnMethods = { "SignUp" })
	public void login() {
		System.out.println("This is class login");

	}

	@Test(dependsOnMethods = { "login" })
	public void searchOrder() {
		System.out.println("This is class searchOrder");

	}

	@Test(dependsOnMethods = { "searchOrder" })
	public void addToCart() {
		System.out.println("This is class addToCart");
		 Assert.fail();

	}

	@Test(dependsOnMethods = { "addToCart","searchOrder" })
	public void checkOut() {
		System.out.println("This is class checkOut");

	}

	@Test(dependsOnMethods = { "checkOut" })
	public void payment() {
		System.out.println("This is class payment");
//		 Assert.fail(); //no method will executed if this uncommented

	}

	@Test(dependsOnMethods = { "payment" })
	public void statusOrder() {
		System.out.println("This is class statusOrder");

	}

}
