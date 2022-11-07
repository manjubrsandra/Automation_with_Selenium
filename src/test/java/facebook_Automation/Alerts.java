package facebook_Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alerts {
public  WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");
	   	driver = new ChromeDriver();
	}
	@Test
	public void Alert2() throws InterruptedException
	 {

			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			driver.findElement(By.id("timerAlertButton")).click();
			Alert alert =driver.switchTo().alert();
			Thread.sleep(2000);
			System.out.println(alert.getText());
			Thread.sleep(2000);
			alert.accept();
			Thread.sleep(2000);
		 
	 }

	@Test
	public void Confirm_Alertbutton() throws InterruptedException
	{
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("confirmButton")).click();
		Alert alert =driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
	}

}
