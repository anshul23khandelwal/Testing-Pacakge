package newpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CdacForm {

	public static void main(String arg[]) throws InterruptedException, AWTException, IOException {
		
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://skillbharat.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/center/div[2]/div/a/img")).click();
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[1]/div[1]/input")).sendKeys("ramesh"); //candiadatename
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[1]/div[2]/input")).sendKeys("suresh"); //fathername
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[1]/div[3]/input")).sendKeys("geeta"); //mothername
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[1]/div[4]/select[1]")).sendKeys("2"); //day
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[1]/div[4]/select[2]")).sendKeys("june"); //month
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[1]/div[4]/select[3]")).sendKeys("1994"); //year
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[1]/div[5]/select")).sendKeys("Male"); //gender
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[1]/div[6]/select")).sendKeys("Unmarried"); //martialstatus
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
		
        js.executeScript("window.scrollBy(0,1000)");
	    
		driver.findElement(By.xpath("//*[@id=\"course\"]")).sendKeys("Testing"); //course
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[1]/div[8]/select")).sendKeys("General");
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[1]/div[9]/input")).sendKeys("pratapnagar jaipur"); //address
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[1]/div[10]/input[1]")).sendKeys("Jaipur"); //district
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[1]/div[10]/input[2]")).sendKeys("302033"); //pincode
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[1]/div[11]/input")).sendKeys("Testing"); //interest
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[1]/div[12]/input")).click(); //chooseimage
		
		Thread.sleep(2000);
		
		StringSelection p = new StringSelection("C:\\Users\\Anshul\\Downloads\\loginimage.jpg");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(p, null);
		
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		 robot.keyRelease(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER); //endimage
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[2]/div/div[1]/input")).sendKeys("9874561230"); //mobileno
		 
		 driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[2]/div/div[2]/input")).sendKeys("01412000255"); //phoneno
		 
		 driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[2]/div/div[3]/input")).sendKeys("abc@gmail.com"); //mail
		 
		 driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[2]/div/div[4]/input")).sendKeys("Business"); //occupation
		 
		 driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[2]/div/div[5]/input")).sendKeys("MCA"); //qualification
		 
		 driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[2]/div/div[6]/input")).sendKeys("02/02/2019"); //date of registration
		 
		 driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[2]/div/div[7]/input")).sendKeys("JU"); //college name
		 
		 driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[2]/div/div[8]/input")).sendKeys("company website");
		
		driver.findElement(By.xpath("//*[@id=\"pcourse\"]")).sendKeys("Testing");
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[2]/div/div[10]/textarea")).sendKeys("Create a company website where all information about company is provide");

		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[2]/div/div[11]/input")).sendKeys("cdac");
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div/div/div[2]/div/div[2]/div/div[12]/input")).click(); //secondimage
		
		Thread.sleep(2000);
		
		StringSelection q = new StringSelection("C:\\Users\\Anshul\\Desktop\\AResume.doc");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(q, null);
		
	   	robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		 robot.keyRelease(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 Thread.sleep(2000); //endsecondimage
		 
		 driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[2]/td[3]/input")).sendKeys("GPS"); //10th
		 
		 driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[2]/td[4]/input")).sendKeys("RBSE");
		 
		 driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[2]/td[5]/select")).sendKeys("2012");
		 
		 driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[2]/td[6]/input")).sendKeys("90%"); //10end
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[3]/td[2]/input")).sendKeys("science"); //12th
		 
		 driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[3]/td[3]/input")).sendKeys("GPS");
		 
		 driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[3]/td[4]/input")).sendKeys("RBSE");
		 
		 driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[3]/td[5]/select")).sendKeys("2014");
		 
		 driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[3]/td[6]/input")).sendKeys("80%"); //12end
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@id=\"dropdownadd\"]")).sendKeys("BCA"); //graduation
		 
		 driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[4]/td[2]/input")).sendKeys("Computer Application"); 
		 
		 driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[4]/td[3]/input")).sendKeys("UOK");
		 
		 driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[4]/td[4]/input")).sendKeys("UOK");
		 
		 driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[4]/td[5]/select")).sendKeys("2017");
		 
		 driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[4]/td[6]/input")).sendKeys("80%"); //graduation end
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@id=\"dropdownadd1\"]")).sendKeys("MCA"); //post
		 
		 driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[5]/td[3]/input")).sendKeys("JU");
		 
		 driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[5]/td[4]/input")).sendKeys("JU");
		 
		 driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[5]/td[5]/select")).sendKeys("2019");
		 
		 driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[5]/td[6]/input")).sendKeys("80%"); //post end
		 		
	     File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     File dest = new File("C:\\Users\\Anshul\\Documents\\screenshot\\image.png");
	     FileUtils.copyFile(scr, dest);
	}
}
