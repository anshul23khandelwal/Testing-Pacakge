package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {
	
		
		public static void main(String[] args) throws InterruptedException {  
	          
	        // System Property for Gecko Driver   
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	         
	        WebDriver  driver = new ChromeDriver();
	        
	        Thread.sleep(3000);
	        
	        driver.get("http://demo.guru99.com/test/drag_drop.html");	
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
    		
            js.executeScript("window.scrollBy(0,500)");
            
            Thread.sleep(2000);
	         
			//Element which needs to drag.    		
	        	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
	         
	         //Element on which need to drop.		
	         WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
	         		
	         //Using Action class for drag and drop.		
	         Actions act=new Actions(driver);					

		//Dragged and dropped.		
	         act.dragAndDrop(From, To).build().perform();		
	         
	        driver.quit();
	        
	        
	        
		}		
	}
	        
	       