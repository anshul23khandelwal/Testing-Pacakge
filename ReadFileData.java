package newpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ReadFileData {
	
	public static void main(String arg[]) {
		
   File file = new File("C:\\Users\\Anshul\\eclipse-workspace\\newproject\\src\\newpackage\\Log.properties");
   
   FileInputStream fileInput = null;
	try {
		
		fileInput = new FileInputStream(file);
		
	} 
	
	catch (FileNotFoundException e)
	{
		e.printStackTrace();
	}
	
	Properties prop = new Properties();
	
	//load properties file
	try {
		
		prop.load(fileInput);
		
	} 
	    catch (IOException e) 
	{
		e.printStackTrace();
	}
	
       System.out.println(prop.getProperty("username"));  
	
	}

}
