package facebook_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateToBottonPage {

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

}
