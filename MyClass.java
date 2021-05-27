package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	public static void main(String ar[]) 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe")	;
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
	
	driver.manage().window().maximize();
	
	String title = driver.findElement(By.xpath("//DIV[@id='logInPanelHeading']")).getText();
	
	System.out.println(title);
	
	driver.findElement(By.xpath("//INPUT[@id='txtUsername']")).sendKeys("admin");
	driver.findElement(By.xpath("//INPUT[@id='txtPassword']")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//INPUT[@id='btnLogin']")).click();
	
	driver.close();
	
	}
}
