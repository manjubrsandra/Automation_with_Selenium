package facebook_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SpecifyWebElement {
	
public  WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");
	   	driver = new ChromeDriver();
	}
	
	@Test
	public void scrollUpAndDownToSecifyElementOnFBPage()
	{
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Facebook Lite for Android.']"));
		System.out.println("Facebook Lite webelement found");
		driver.close();
	}
	@Test
	public void scrollUpAndDownToSecifyElementOnWebPage()
	{
		driver.get("http://seleniumhq.org/download");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Applitools']"));
		System.out.println("Applitool webelement found");
		driver.close();
	}
	
	@Test
    public void scrollUpAndDownToSecifyElementByCoordinates()
    {
    	driver.get("http://seleniumhq.org/download");
		WebElement element = driver.findElement(By.xpath("//img[@alt='Perfecto']"));
		System.out.println("webelement found");
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ")");
		driver.close();
    }
	
	}

}
