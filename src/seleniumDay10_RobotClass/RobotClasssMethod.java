package seleniumDay10_RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;

public class RobotClasssMethod {

	public static void main(String[] args) throws AWTException {
		//RObot is class of java awt package.
		//Robot is used to handle the mouse and keyboard event
		
		Robot rob=new Robot();
		
		rob.keyPress(KeyEvent.VK_TAB);   //same as per keydown from action class
		rob.keyRelease(KeyEvent.VK_TAB); //same as per keydown from action class
		
		rob.keyPress(KeyEvent.VK_0);
		rob.keyRelease(KeyEvent.VK_0);
		
	
		rob.mousePress(InputEvent.BUTTON1_DOWN_MASK);	//click/press the mouse right button
		rob.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); //release the mouse right button

	}

}
