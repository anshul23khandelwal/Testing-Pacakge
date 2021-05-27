package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	
	public static void main(String arg[]) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//INPUT[@id='u_0_j']")).sendKeys("anshul");
		driver.findElement(By.xpath("//INPUT[@id='u_0_l']")).sendKeys("khandelwal");
		driver.findElement(By.xpath("//INPUT[@id='u_0_o']")).sendKeys("anshul23khandelwal@gmail.com");
		driver.findElement(By.xpath("//INPUT[@id='u_0_r']")).sendKeys("anshul23khandelwal@gmail.com");
		driver.findElement(By.xpath("//INPUT[@id='u_0_v']")).sendKeys("456123");
		driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("20");
		driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("june");
		driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("2000");
		
		driver.findElement(By.xpath("//*[@id=\"u_0_z\"]/span[2]/label")).click();
		driver.findElement(By.xpath("//BUTTON[@id='u_0_11']")).click();
	}
}
