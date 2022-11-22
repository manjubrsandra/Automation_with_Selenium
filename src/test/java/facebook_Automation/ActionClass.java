package facebook_Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionClass {
public static WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");
	   	driver = new ChromeDriver();
	}
	@Test
	public void Action_class() throws AWTException, InterruptedException
	{
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
	
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("manjunathbrsandra43@gmail.com");
		driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("9900916345");

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
	
	@Test
	public void Using_dragandarop() throws InterruptedException
	{
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement des = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(src,des).perform();
		actions.release(des).perform();
		actions.moveToElement(src).clickAndHold().perform();
		actions.release(des).perform();
		driver.close();
			
	}
	
	@Test
	    public void MouseHover()
	    {
	    driver.get("http://www.actimind.com/");
		Actions action = new Actions(driver);
		WebElement AreaOfExpertise = driver.findElement(By.xpath("//a[contains(text(),'AREAS OFEXPERTISE')]"));
		action.moveToElement(AreaOfExpertise).perform();
		WebElement cloudApp = driver.findElement(By.linkText("Cloud Applicationss"));
		action.moveToElement(cloudApp).click().perform();

	
      }
	//
	@Test
	public void Dropdown() throws InterruptedException {
		driver.get("http://www.istqb.in/");
		WebElement foundation = driver.findElement(By.xpath("//span[.='FOUNDATION']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(foundation).perform();
		Thread.sleep(3000);
		WebElement enrollment = driver.findElement(By.xpath("(//span[text()='ENROLLMENT'])[1]"));
		actions.moveToElement(enrollment).perform();
		Thread.sleep(3000);
		WebElement corporateEnrol = driver.findElement(By.xpath("//span[text()='CORPORATEENROLLMENT']"));
		actions.moveToElement(corporateEnrol).perform();
		Thread.sleep(3000);
	}
}
