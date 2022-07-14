package seleniumDay18_ListenerPractise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners extends BaseClass implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("This is on Finish");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("This is on start");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult object) {
		System.out.println("i am onTestFailure");
		
		String methodName = object.getMethod().getMethodName();
		
	
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File source = ts.getScreenshotAs(OutputType.FILE);
		System.out.println("ScreeshotTaken");
		
		File dest = new File("D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\ScreenShots\\"+methodName+".jpeg");
		
		System.out.println("ScreeshotTaken and saved to Desire file Location");
	
			try {
				FileUtils.copyFile(source, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("ScreeshotTaken and saved to Desire file Location");
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("This is on test skipped");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("This is on test start ");
		
	}

	@Override
	public void onTestSuccess(ITestResult Result) {
		System.out.println("This is on test passed");
		
		
		
	}
	

}