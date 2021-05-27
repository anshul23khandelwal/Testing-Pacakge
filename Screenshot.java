package newpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String ar[]) throws IOException 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe")	;
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File dest = new File("C:\\Users\\Anshul\\Documents\\screenshot\\ab.png");
    FileUtils.copyFile(scr, dest); 
	
	}

}
