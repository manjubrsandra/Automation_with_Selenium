package facebook_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectors {
	
	@Test
	public void CssSelector_method() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("manjunathbesandra43@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#pass")).sendKeys("Manju@1994");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#loginbutton")).click();
		
	    Thread.sleep(2000);
		driver.close();
	}

}
