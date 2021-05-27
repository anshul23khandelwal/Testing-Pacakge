package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli {

	public static void main(String arg[]) throws InterruptedException, FindFailed {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
				
		driver.get("https://www.youtube.com/watch?v=gMxcf9G0l80");
		
		 Screen screen = new Screen();
		 
		 Pattern pattern = new Pattern("abc.png");
		 
		 screen.wait(pattern,3000);
		 
		  screen.click("abc.png"); //click pause button
		  System.out.println("pause button clicked");
	}
}
