package seleniumDay15;

import org.testng.annotations.Test;


public class TestNGpriority {
//If no of @test are writeen and no prioirty no defined
	//then testNG run the @test based on alphabetically
	//to give priority write @test(priority=int)
	//Sequence-->> -1,0,1,2,3,..............
	//If @test ------>> only this writeen then it take as a default priority=0 and sort by alphabetically of all are default
	
	@Test(priority=-1)
	public void testMethod1() {
		System.out.println("I am Main Method1/Actual Method1 Of TestNG!");
	}
	
	@Test(priority=2)
	public void testMethod2() {
		System.out.println("I am Main Method2/Actual Method2 Of TestNG!");
	}
	
	@Test
	public void testMethod3() {
		System.out.println("I am Main Method23Actual Method3 Of TestNG!");
	}

	
	

}
