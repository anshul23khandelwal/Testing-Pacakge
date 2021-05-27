package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesiredCapability {
	
	public static void main(String arg[]) {
		
         String baseurl = "https://www.facebook.com/login/identify?ctx=recover";
         System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
 		
 		WebDriver driver = new ChromeDriver();
 		
 		driver.get(baseurl);
 		driver.manage().window().maximize();
 		
 		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();
 		if(driver.getTitle().equals("Facebook - log in or sign up")) 
 		{
 			System.out.println("We Are Back To Facebook Home Page");
 		}
 		else
 		{
 			System.out.println("We Are Not In Facebook Home Page");
 		}
 		
 		
		driver.quit();
	}

}
