package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String arg[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&openid.pape.max_auth_age=0");
	    
	    driver.manage().window().maximize();
	    
	   
	    driver.findElement(By.xpath("//A[@id='createAccountSubmit']")).click();
	    
	    
	    driver.findElement(By.xpath("//INPUT[@id='ap_customer_name']")).sendKeys("Anshul Khandelwal");
	    driver.findElement(By.xpath("//INPUT[@id='ap_phone_number']")).sendKeys("9694735101");
	    driver.findElement(By.xpath("//INPUT[@id='ap_email']")).sendKeys("anshul23khandelwal@gmail.com");
	    driver.findElement(By.xpath("//INPUT[@id='ap_password']")).sendKeys("852963147");
	    driver.findElement(By.xpath("//INPUT[@id='continue']")).click(); 
	    
	    String title = driver.findElement(By.xpath("//h1[@class=\"a-spacing-small moa_desktop_signup\"]")).getText();

	    System.out.println(title); 
	     
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//*[@id=\"ap_register_form\"]/div/div/div[8]/a")).click();
	    driver.findElement(By.xpath("//INPUT[@id='ap_email']")).sendKeys("anshul23khandelwal@gmail.com");
	    driver.findElement(By.xpath("//INPUT[@id='continue']")).click();
	    driver.findElement(By.xpath("//INPUT[@id='ap_password']")).sendKeys("165251");
	    driver.findElement(By.xpath("//INPUT[@id='signInSubmit']")).click();
	    
	    driver.close();
	}
}
