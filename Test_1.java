package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 {
	
	public static void main (String args[]) throws InterruptedException {
		
		System.setProperty("webriver.chrome.driver.", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://heliaus.aus.com/toursv2/manage_work_flow.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

	}

}
