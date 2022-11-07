package facebook_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Locators {
	
public  WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");
	   	driver = new ChromeDriver();
	}
	
	@Test
	public void Locators_idmethod() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		
		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("manjunathbrsandra43@gmail.com");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Manju@1994");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log In")).click();

		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	public void Locators_namemethod() throws InterruptedException
	{
		
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("firstname")).sendKeys("Manju");
		Thread.sleep(2000);

		driver.findElement(By.name("lastname")).sendKeys("B S");
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		driver.close();

	}

}
