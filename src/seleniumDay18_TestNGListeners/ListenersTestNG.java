package seleniumDay18_TestNGListeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenersTestNG {
	
	//Flow ListenersTestNG-->>Listerns-->>listeners.xml
	@Test
	public void TestMethod1() {

		System.out.println("This is test Method 1 of Class One");
	}

	@Test
	public void TestMethod2() {

		System.out.println("This is test another Method 2 of Class One");
		Assert.fail();//Just for referenece now
	}

//	@Test
//	public void TestMethod3() {
//
//		System.out.println("This is test another Method 3 of Class One");
//	}
//
//	@Test
//	public void TestMethod4() {
//
//		System.out.println("This is test another Method 4 of Class One");
//	}
}
