package seleniumDay19_RetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoClass {
	
	
  @Test(retryAnalyzer = seleniumDay19_RetryAnalyzer.RetryAnalyzer.class)
  public void TestMethod1() {
	  System.out.println("This is class TestMEthod1");
	  Assert.fail();
	 
  }
  
//  @Test
//  public void TestMethod2() throws Exception {
//	  System.out.println("This is class TestMEthod2");
//	  Thread.sleep(2000);
//	  Assert.fail();
//	 
//  }
}
