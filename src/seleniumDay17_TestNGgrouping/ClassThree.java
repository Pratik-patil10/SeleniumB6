package seleniumDay17_TestNGgrouping;

import org.testng.annotations.Test;

public class ClassThree {
	
  @Test(invocationCount = 2)
 public void TestMethod1() {
	  
	  System.out.println("This is test Method of Class Three");
  }
}
