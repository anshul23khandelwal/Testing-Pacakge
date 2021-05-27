package newpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {
 
	public static void main(String arg[]) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		  
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
	    
		//Resize The Browser
		int width = 600;
		int height = 400;
		Dimension dimension = new Dimension(width,height);
		driver.manage().window().setSize(dimension);
		
		Thread.sleep(5000);
		//Refresh
		driver.navigate().refresh();
		Thread.sleep(3000);
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		driver.get("https://www.twitter.com/");		
		
		Thread.sleep(2000);

		//Refresh
		driver.get(driver.getCurrentUrl());
		
		driver.quit();
	}
}
