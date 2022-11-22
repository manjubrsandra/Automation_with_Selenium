package facebook_Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Javaexecuter {

public  WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");
	   	driver = new ChromeDriver();
	}
	
	@Test
	public void ScrollUpAndDown()
	{
		driver.get("http://seleniumhq.org/download");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");
		js.executeScript("window.scrollBy(0, -1000)");
		driver.close();
	}


}
