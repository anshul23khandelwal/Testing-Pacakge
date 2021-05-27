package newpackage;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;


public class WorkingLink {
	
	private static WebDriver driver = null;

     public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        
    	
    	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		  
        String homePage = "http://dolphinsoftwares.in/";
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;
        
        Thread.sleep(5000);
        
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get(homePage);
        
        Thread.sleep(3000);
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        Iterator<WebElement> it = links.iterator();
        
        while(it.hasNext()){
            
            url = it.next().getAttribute("href");
            
            System.out.println(url);
        
            if(url == null || url.isEmpty()){
            System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }
            
            if(!url.startsWith(homePage)){
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }
            
            try {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                
                huc.setRequestMethod("HEAD");
                
                huc.connect();
                
                respCode = huc.getResponseCode();
                
                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                    System.out.println(url+" is a valid link");
                }
                    
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        driver.quit();

    }
}  

    		
  /*  public static void main(String[] args) {									
        String baseUrl = "http://kidsshoot.com/serviceauto/";					
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");			
        WebDriver driver = new ChromeDriver();					
        		
        String underConsTitle = "Under Construction: Mercury Tours";					
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);					

			driver.get(baseUrl);					
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));							
        String[] linkTexts = new String[linkElements.size()];							
			int	i = 0;					

			//extract the link texts of each link element		
			for (WebElement e : linkElements) {							
			linkTexts[i] = e.getText();							
			i++;			
        }		

			//test each link		
			for (String t : linkTexts) {							
			driver.findElement(By.linkText(t)).click();					
			if (driver.getTitle().equals(underConsTitle)) {							
                System.out.println("\"" + t + "\""								
                        + " is under construction.");			
            } else {			
                System.out.println("\"" + t + "\""								
                        + " is working.");			
            }		
			driver.navigate().back();			
        }		
			driver.quit();			
    }	
} */