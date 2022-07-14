package seleniumDay18_TestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;


public class Listners implements ITestListener {
	
	
	
	@Test
	public void f() {
	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("This is on Finish-Test Listener");
		
	}

	@Override
	public void onStart(ITestContext arg0) {

		System.out.println("This is on Start-Test Listener");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

		System.out.println("This is on ");
	}

	@Override
	public void onTestFailure(ITestResult arg0) {

		System.out.println("This is on Fail-Test Listener");
		//write here screenshot shot code if test fail it will take ss
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {

		System.out.println("This is on TestSkipped-Test Listener");
	}

	@Override
	public void onTestStart(ITestResult arg0) {

		System.out.println("This is on Test Started-Test Listener");
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {

		System.out.println("This is on Test Sucessed-Test Listener");
	}
	
	
	
}
