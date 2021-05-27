package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	
	public static void main(String arg[]) 
	{
		
		System.setProperty("WebDriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//INPUT[@id='u_0_j']")).sendKeys("anshul");
		driver.findElement(By.xpath("//INPUT[@id='u_0_l']")).sendKeys("khandelwal");
		driver.findElement(By.xpath("//INPUT[@id='u_0_o']")).sendKeys("anshul23khandelwal@gmail.com");
		driver.findElement(By.xpath("//INPUT[@id='u_0_v']")).sendKeys("456123");
		driver.findElement(By.xpath("//SELECT[@id='day']/self::SELECT")).sendKeys("");
	}
}