package seleniumDay17_TestNGgrouping;

import org.testng.annotations.Test;

public class GroupingTestNG {
	
	//Grouping
	@Test(groups = {"smoke","regression"}) //this method is used for smoke & regrssion groups
	public void TestMethod1() {

		System.out.println("This is test Method 1 of Class One");
	}

	@Test(groups = {"regression"})
	public void TestMethod2() {

		System.out.println("This is test another Method 2 of Class One");
	}

	@Test(groups = {"smoke","sanity"})
	public void TestMethod3() {

		System.out.println("This is test another Method 3 of Class One");
	}

	@Test(groups = {"sanity"})
	public void TestMethod4() {

		System.out.println("This is test another Method 4 of Class One");
	}
}
