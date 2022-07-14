package seleniumDay15;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsTenstNG {
//Flipkart Product search & Add to cart example
	
	@Test
	public void f() {
		System.out.println("I am Main Method/Actual Method Of TestNG!");
	}

	
	// In TC the term prerequisites are written in before method
	@BeforeMethod
	public void beforeMethod() {
		//prerequieste- login method call here if already written
		// prerequieste-product search method call here if already written

		System.out.println("I am Before-Method!");
	}

	@AfterMethod
	public void afterMethod() {

		// e.g. logOut method call here 

		System.out.println("I am afterMethod-Method!");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am beforeClass-Method!");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am afterClass-Method!");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am beforeTest-Method!");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am afterTest-Method!");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am beforeSuite-Method!");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I am afterSuite!");
	}

}
