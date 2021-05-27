package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {

	public static void main(String arg[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.airindia.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"skip-to-content\"]/li[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"divwithjs\"]/div/ul[3]/li[1]/fieldset/div[1]/label")).click();
		
		driver.findElement(By.xpath("//*[@id=\"from\"]")).sendKeys("Jaipur, Sanganer Airport, JAI, India");
		
		driver.findElement(By.xpath("//*[@id=\"to\"]")).sendKeys("Delhi, Indira Gandhi International Airport, DEL, India");
		
		driver.findElement(By.xpath("//*[@id=\"_depdateeu1\"]")).sendKeys("02/02/2019"); 
		
		driver.findElement(By.xpath("//*[@id=\"divwithjs\"]/div/ul[4]/li[4]/fieldset/div[1]/label")).click();
		
		driver.findElement(By.xpath("//*[@id=\"divwithjs\"]/div/ul[5]/li[2]/fieldset/div[1]/label")).click();
		
		driver.findElement(By.xpath("//*[@id=\"concessionaryType1\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"concessionaryType1\"]/option[5]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ddladult1\"]")).sendKeys("//*[@id=\"ddladult1\"]/option[4]");
		
		driver.findElement(By.xpath("//*[@id=\"ddlchildren1\"]")).sendKeys("//*[@id=\"ddlchildren1\"]/option[3]");
		
		driver.findElement(By.xpath("//*[@id=\"ddlinfants1\"]")).sendKeys("//*[@id=\"ddlinfants1\"]/option[2]");
		
		driver.findElement(By.xpath("//*[@id=\"_classType1\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"_classType1\"]/option[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"pcode1\"]")).sendKeys("Free2019");
		
		driver.findElement(By.xpath("//*[@id=\"btnbooking\"]")).click();	
	}
}
