package newpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	
	public static void main(String arg[]) throws InterruptedException, AWTException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Apple");
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[3]/a")).click();
		WebElement loc = driver.findElement(By.xpath("//*[@id=\"-TtEc9M5pE7LPM:\"]"));
		
		Actions oAction = new Actions(driver).contextClick();
		oAction.moveToElement(loc);
		
		Thread.sleep(3000);
		oAction.contextClick(loc).build().perform();
		
        Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		
		robot.keyRelease(KeyEvent.VK_DOWN);
	      
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		
		robot.keyRelease(KeyEvent.VK_DOWN);
		 
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		
        Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
