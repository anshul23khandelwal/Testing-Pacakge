package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SslHandling {
	
	public static void main(String arg[]) {
	
	// Create object of DesiredCapabilities class
	DesiredCapabilities cap=DesiredCapabilities.chrome();
	 
	// Set ACCEPT_SSL_CERTS  variable to true
	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	 
	// Set the driver path
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	 
	// Open browser with capability
	WebDriver driver=new ChromeDriver(cap);
	
	driver.get("https://google.com");
	}
	

}
