package seleniumDay14_TestNG;

public class TestNGDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TestNG is framework which used to perform testing effectively
		// Advantages of TestNG

		/*
		 * Whaterver we are writing in Main method from now we will write in @Test .
		 */

		/*
		 * @BeforeMethod(4)
		 * 
		 * @AfterMEthod(6)
		 * 
		 * @Test(5) ------->>>>Main/Actual of appplication ---->>This is pivot point
		 * 
		 * 
		 * @Before Class (3)
		 * 
		 * @AfterClass (7)
		 * 
		 * @BeforeTest (2)
		 * 
		 * @AfterTest (8)
		 * 
		 * @BeforeSuite (1)
		 * 
		 * @AfterSuite (9)
		 */

		/*
		 * Execution Sequence
		 
		 * @BeforeSuite (1)
		 
		 * @BeforeTest (2)
		 
		 * @Before Class (3)
		 
		 * @BeforeMethod(4)
		 
		 * @Test(5)	------------------------->>If 2 @Test or multiple @Test are there. then 4,6 will run that X times
		 
		 * @AfterMethod(6)
		 
		 * @AfterClass (7)
		 
		 * @AfterTest (8)
		 
		 * @AfterSuite (9)
		 
		 */

	}

}
