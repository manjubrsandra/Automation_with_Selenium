package facebook_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame {
     
	@Test
	public void Frames() throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");
		   	WebDriver driver = new ChromeDriver();
		   	driver.get("file:///C:/Users/manju/OneDrive/Desktop/pagehtml2.html"); 
		   	/*driver.switchTo().frame(0);
			driver.findElement(By.id("t1")).sendKeys("manju");
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			driver.findElement(By.id("t2")).sendKeys("B S");
			Thread.sleep(2000);*/
			
			driver.switchTo().frame(0);
			driver.findElement(By.id("t1")).sendKeys("manjunath");
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			driver.findElement(By.id("t2")).sendKeys("BS");
			Thread.sleep(2000);
			driver.close();
	 }

}
