package facebook_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Xpath {
public  WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");
	   	driver = new ChromeDriver();
	}
	
	@Test
	public void Xpath_method() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("manjunathbrsandra43@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Manju@1994");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(5000);

		Thread.sleep(2000);
		driver.close();
		
	}
	@Test
	public void Xpath_Contains() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
	   	driver.manage().window().maximize();
	   	driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("bifbevbbjvjd");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Manju@123");
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test
	public void Xpath_startswith() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
	   	driver.findElement(By.xpath("//input[starts-with(@id,'email')]")).sendKeys("jberkvrv");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("jhgngj@123");
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	public void usingTextFunction() throws InterruptedException {

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("8446151018");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Prashi@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void Xpath_byid() throws InterruptedException
	{
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("manjunathbrsandra43@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Manju@1994");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='u_0_9_Y4']")).click();

		Thread.sleep(2000);
		driver.close();
	}
}
