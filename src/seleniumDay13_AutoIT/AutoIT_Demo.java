package seleniumDay13_AutoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT_Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String driverPath="D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\chrome100.0\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		WebDriver driver = new ChromeDriver(); // -->this line will open browser

		driver.manage().window().maximize();
		
		driver.get("http://blueimp.github.io/jQuery-File-Upload/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button")).click();
		Thread.sleep(2000);
		
		//Before below line Open Auto IT & Script Editior
		
		//Script editor text
		//1.ControlFocus("Open","","Edit1")		----->This will used to focus the text box
		//2.ControlSetText("Open","","Edit1","C:\Users\PRATIK\Desktop\New Text Document (2).txt")		--->This wil set the text/file path
		//3.ControlClick("Open","","Button1")	-------->Click on open.
		
		//After above Three stepss->Save the file->Compile script->Then give the path of file to below.
		
		Runtime.getRuntime().exec("D:\\Study\\1.SDET\\JAVA\\Selenium_Test\\#RequiredJar\\AutoIT_Files\\FileUpload.exe");
		driver.quit();
	}

}
