package facebook_Automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Auto_It {
public  WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");
	   	driver = new ChromeDriver();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void auto_It() throws InterruptedException, IOException
	 
	 {
		 driver.get("https://www.freepdfconvert.com/pdf-to-word");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//span[contains(text(),'Choose PDF file')]")).click();
		 Thread.sleep(2000);
		 Runtime.getRuntime().exec("D:\\File_upload.exe");
		 Thread.sleep(2000);
		 driver.close();
		 
		 
		 
	 }

}
