package seleniumDay16_TestNG_XML;

import org.testng.annotations.Test;

public class ClassOne {
	@Test
	public void TestMethod1() {

		System.out.println("This is test Method 1 of Class One");
	}

	@Test
	public void TestMethod2() {

		System.out.println("This is test another Method 2 of Class One");
	}

//---->>enable= false means if this test under defferd Defect so this will not run under TestNG
	// by default enble is true.
	@Test
	public void TestMethod3() {

		System.out.println("This is test another Method 3 of Class One");
	}
//enabled = false
	@Test(enabled = false)
	public void TestMethod4() {

		System.out.println("This is test another Method 4 of Class One");
	}

}
