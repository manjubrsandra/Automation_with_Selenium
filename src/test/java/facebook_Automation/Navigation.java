package facebook_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigation {
	
	@Test
	public void Navigation_Methods() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		 driver.navigate().to("https://www.snapdeal.com/?utm_source=affyguru_846&utm_campaign=102&utm_content=affyguru_846");
			
		    Thread.sleep(3000);
		    
			driver.navigate().back();
			
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			
			driver.navigate().forward();
			
			Thread.sleep(2000);
			
			driver.close();
	}
	@Test
	public void NavigatetoBottomPage() throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");	
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
			WebElement element = driver.findElement(By.xpath("//a[@href='/about/']"));
			System.out.println("Element is found");
			int x = element.getLocation().getX();
			int y = element.getLocation().getY();
			System.out.println("X coordinate is :"+x + " and Y coordinate is :"+ y);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy("+x+","+y+")");
			Thread.sleep(3000);
			element.click();
			driver.close();
	 }
	@Test
	 public void Text_isdisabled() throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");	
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.get("file:///C:/Users/manju/OneDrive/Desktop/html1.html");
		  JavascriptExecutor js = (JavascriptExecutor) driver;
			Thread.sleep(2000);
			js.executeScript("document.getElementById('t1').value='man'");
			Thread.sleep(2000);
			js.executeScript("document.getElementById('t2').value=''");
			js.executeScript("document.getElementById('t2').value='manager'");
			js.executeScript("document.getElementById('t2').type='button'");
			driver.close(); 	
	 }
	
	public void Scrollup_down() throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");	
		  WebDriver driver = new ChromeDriver();
		   	driver.get("https://www.facebook.com/");
		   	JavascriptExecutor js = (JavascriptExecutor) driver;
		   	js.executeScript("window.scrollBy(0, 100)");
		   	Thread.sleep(2000);
		   	js.executeScript("window.scrollBy(0, -500)");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0, -1000)");
			Thread.sleep(2000);
			/*for (int i = 1; i < 10; i++) {
				js.executeScript("window.scrollBy(0, 100)");
				Thread.sleep(3000);
			}
			for (int i = 1; i < 10; i++) {
				js.executeScript("window.scrollBy(0, -500)");
				Thread.sleep(3000);
			}*/
			driver.close();
			
			
	 }
	@Test
	public static void scrollUpAndDownToSecifyElementOnFBPage() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");	
		  WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 1; i < 10; i++) {
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(3000);
		}
		driver.findElement(By.xpath("//a[@title='Facebook Lite for Android.']"));
		System.out.println("Facebook Lite webelement found");
		driver.close();
	}

	

}
