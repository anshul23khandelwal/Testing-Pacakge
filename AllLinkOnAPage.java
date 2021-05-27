package newpackage;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkOnAPage {
	
	public static void main(String arg[]) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		  
		WebDriver  driver = new ChromeDriver();
		
	    driver.get("https://www.twitter.com/");
	    
	    int width = 100;
	    int height = 100;
	    
	    Dimension dimension = new Dimension(width,height);
	    driver.manage().window().setSize(dimension);
	    	    
	    List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	    
	    for (WebElement link:allLinks) {
	    	System.out.println(link.getText() + " -  " + link.getAttribute("href"));
	    	
	       	
	   
	    }
	    
	    
	}

}
