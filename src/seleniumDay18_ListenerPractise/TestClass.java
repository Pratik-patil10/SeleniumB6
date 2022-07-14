package seleniumDay18_ListenerPractise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
	
	@Test
	public void testMethod1() {
		driver.get("www.guru99.com");
		System.out.println("This is test method from class 1");
		
	}


	@Test
	public void testMethod2() throws InterruptedException {
		System.out.println("This is test method from class 2");	
		driver.get("www.google.com");
		Thread.sleep(2000);
		Assert.fail();
	}
	
}
