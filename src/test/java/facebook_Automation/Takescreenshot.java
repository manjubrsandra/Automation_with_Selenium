package facebook_Automation;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Takescreenshot {
	
	@Test
	public void TakeScreenShot_method() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");	
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
	  Date a = new Date();
	  
	  String date1 = a.toString();
	  System.out.println("date is"+ date1);
	  
	  TakesScreenshot pic = (TakesScreenshot)driver;
	  File srcFile = pic.getScreenshotAs(OutputType.FILE);
	  File destFile = new File(".\\FB_Screenshots\\"+"facebook5.png");
	  FileHandler.copy(srcFile,destFile);
	  driver.close();
	  
	  
	  
	  
	}

}
