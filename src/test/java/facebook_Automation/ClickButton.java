package facebook_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClickButton {
    public  WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");
	   	driver = new ChromeDriver();
	}
	@Test
	public void VerifyButtonClick()
	{
		
		driver.get("https://facebook.com");
		String xp = "//button[text()='Log In']";
		driver.findElement(By.xpath(xp)).click();
		driver.close();
	}
	
	@Test
   public void VreifyButtonUsingSendkeys()
   {
	   
	   driver.get("https://facebook.com");
		String xp = "//button[text()='Log In']";
		driver.findElement(By.xpath(xp)).sendKeys(Keys.ENTER);
		driver.close();
   }
	@Test
	public void VreifyButtonUsingSubmitkeys()
	{
		driver.get("https://facebook.com");
		String xp = "//button[text()='Log In']";
		driver.findElement(By.xpath(xp)).submit();
		driver.close();
	}
	
}
