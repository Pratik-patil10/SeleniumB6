package seleniumDay10_RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException, Exception {
		// TODO Auto-generated method stub
		//go to Web->AddFiles->Select any file from PC ->open
		
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		WebDriver driver = new ChromeDriver(); // -->this line will open browser

		driver.manage().window().maximize();
		
		driver.get("http://blueimp.github.io/jQuery-File-Upload/"); // -->>This will open the given url in browser
		
		driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button")).click();
		
		//Google for copy code from clipboard
		
		StringSelection selection = new StringSelection("C:\\Users\\PRATIK\\Desktop\\New Text Document (2).txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot rob=new Robot();		//robot class created
		
		rob.keyPress(KeyEvent.VK_CONTROL);	//cntrl key pressed
		rob.keyPress(KeyEvent.VK_V);		//V key pressed
		
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		
		rob.keyPress(KeyEvent.VK_TAB);	//cntrl key pressed
		rob.keyRelease(KeyEvent.VK_TAB);		//V key pressed
		
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		//path entered at start run but after it is not pasting s dhiraj set dont waste to excute. only concpet should be clear.
		
		
//		rob.mouseWheel(100);	//mouse scrollling down
//		rob.mouseWheel(-100);	//mouse scrollling down
//		
		

	}

}
