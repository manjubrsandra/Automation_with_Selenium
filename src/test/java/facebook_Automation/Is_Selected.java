package facebook_Automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Is_Selected {
	
	
@Test
	public void is_Selected()  
	{ 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");
	   	WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	  
	  driver.manage().window().maximize(); 
	 

	
	  driver.close(); 
	 } 

}

