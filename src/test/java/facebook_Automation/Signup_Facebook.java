package facebook_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Signup_Facebook {
   
	@Test
	public void Webdriver_interface() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	    //driver.window().manage().maximize();
	    String title = driver.getTitle();
	    System.out.println("the title of the page is"+title );
	    
	    String url = driver.getCurrentUrl();
	    System.out.println("the current url is" + url);
	    
	    String pageSource = driver.getPageSource();
	    System.out.println("the current page source is"+pageSource);
	    
	    Thread.sleep(2000);
	    
	    driver.close();
	    
	}
	public void Signup()
	{
		
		
	}
}
