package handlingMultipleElem;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class HandlingRbt {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException 
	{
//		Runtime.getRuntime().exec("notepad");
		
		Robot rbt=new Robot();
//		rbt.keyPress(KeyEvent.VK_SHIFT);
//		rbt.keyPress(KeyEvent.VK_H);
		
//		Thread.sleep(1000);
//		rbt.keyRelease(KeyEvent.VK_SHIFT);
//		rbt.keyPress(KeyEvent.VK_I);
		
		for(int i=1;i<=400;i=i+5)
		{
			rbt.mouseMove(200+i,150);
			Thread.sleep(500);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
