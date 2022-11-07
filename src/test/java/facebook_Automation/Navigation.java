package facebook_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigation {
	
	@Test
	public void Navigation_Methods() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		 driver.navigate().to("https://www.snapdeal.com/?utm_source=affyguru_846&utm_campaign=102&utm_content=affyguru_846");
			
		    Thread.sleep(3000);
		    
			driver.navigate().back();
			
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			
			driver.navigate().forward();
			
			Thread.sleep(2000);
			
			driver.close();
	}
	

}
