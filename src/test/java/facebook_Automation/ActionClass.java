package facebook_Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {
	@Test
	public void Action_class() throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");	
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		Actions actions = new Actions(driver);
		actions.contextClick(link).perform();
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		driver.quit();
	}
	
	@Test
	public void verifyContextClickusingActionsClass() throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");	
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  WebElement link = driver.findElement(By.linkText("Forgotten password?"));
			Actions actions = new Actions(driver);
			actions.contextClick(link).perform();
			Thread.sleep(3000);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_W);
			r.keyRelease(KeyEvent.VK_W);
			driver.quit();
	}
	
	@Test
	public void gmail_contextClickDemo_archieve() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");	
		  WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("manjunathbrsandra43@gmail.com");
		driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Manju@1996");

		driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
		Thread.sleep(10000);

		String xp = "(//b[contains(.,'Following Openings (for Bangalore)')])[2]";

		WebElement mail = driver.findElement(By.xpath(xp));

		System.out.println(mail.getText());

		Actions actions = new Actions(driver);

		actions.contextClick(mail).perform();
		Thread.sleep(6000);

		driver.findElement(By.xpath("(//div[@class='J-N-JX aDE aDD'])[1]")).click();
	}
}
