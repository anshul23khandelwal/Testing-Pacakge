package newpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OlxAd {
	
	public static void main (String arg[]) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.olx.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"postNewAdLink\"]/span")).click(); 
		
		driver.findElement(By.xpath("//*[@id=\"add-title\"]")).sendKeys("Selling hero bike");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"targetrenderSelect1-0\"]/dt/a")).click(); //category
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"cat-2198\"]/span[2]/strong")).click(); //bike
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"category-2198\"]/div[2]/div[2]/div/ul/li[1]/a")).click(); //motorcycle
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"category-81\"]/div[2]/div[2]/div/ul/li[6]/a")).click(); //hero
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"parameter-div-price\"]/div[2]/div/div[1]/p/span/input")).sendKeys("30000");
		
		driver.findElement(By.xpath("//*[@id=\"targetparam329\"]/dt/a")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"targetparam329\"]/dd/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"param3\"]")).sendKeys("2015");
		
		driver.findElement(By.xpath("//*[@id=\"param7\"]")).sendKeys("15000");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
        js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("//*[@id=\"add-description\"]")).sendKeys("selling a hero bike with very good condition");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"add-file-1\"]/div/a/span")).click(); //firstimage
		
		Thread.sleep(2000);
		
		StringSelection s = new StringSelection("C:\\Users\\Anshul\\Downloads\\currency_icon.png");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(5000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER); //end
		
		
        driver.findElement(By.xpath("//*[@id=\"add-file-2\"]/div/a")).click(); //secondimage
		
		StringSelection r = new StringSelection("C:\\Users\\Anshul\\Downloads\\loginimage.jpg");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(r, null);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER); //end
	
		
		
		js.executeScript("window.scrollBy(0,1000)"); //scroll
		
		driver.findElement(By.xpath("//*[@id=\"add-person\"]")).sendKeys("pta nhi");
		
		driver.findElement(By.xpath("//*[@id=\"add-phone\"]")).sendKeys("0000000000");
		
		driver.findElement(By.xpath("//*[@id=\"mapAddress\"]")).sendKeys("dfhsjh");
		
		
		
		
		

		
	}
	

}
