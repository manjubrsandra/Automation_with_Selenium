package facebook_Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage {
	public  WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");
	   	driver = new ChromeDriver();
	}
 

@Test
public void  login() throws InterruptedException
 {
   	driver.get("https://www.facebook.com/");
   	
    driver.manage().window().maximize();
   	driver.manage().window().minimize();
   	
   	/*WebElement Rise = driver.findElement(By.name("email"));
    Rise.clear();
   	Rise.sendKeys("manju123@gmail.com");*/
    driver.manage().window().maximize();
    
    String title = driver.getTitle();
   	System.out.println(title);
   	
   	String currentUrl = driver.getCurrentUrl();
	System.out.println("the URL of the page is :" + currentUrl);
	
	String pageSource = driver.getPageSource();
	System.out.println("the source code of the page is :" + pageSource);
   	
   	driver.findElement(By.cssSelector("#email")).sendKeys("manjunathbrsandra43@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#pass")).sendKeys("Manju@1994");
	Thread.sleep(3000);
	//driver.findElement(By.cssSelector("#u_0_9_DM")).click();
	
    Thread.sleep(2000);
	driver.close();
   	
   	//driver.findElement(By.linkText("Forgotten password?")).click();
   	//driver.findElement(By.partialLinkText("Forgotten ")).click();
   	
   	driver.findElement(By.cssSelector("#email")).sendKeys("manju123@gmail.com");
   	driver.findElement(By.cssSelector("input[type='text']"));
   	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("manju123@gmail.com");
   	driver.findElement(By.cssSelector("input#email")).sendKeys("manju123@gmail.com");
    driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi")).sendKeys("Manju@123");
   	
   	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("bhfhfhjfhf");
   	driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
 }
@Test
public void Signup() throws InterruptedException
{
   	driver.get("https://www.facebook.com/");
   	
   	driver.manage().window().maximize();
    driver.findElement(By.partialLinkText("Create New")).click();
    Thread.sleep(2000);

    //driver.findElement(By.cssSelector("#u_0_1_YW")).sendKeys("Manjunath");
   // driver.findElement(By.cssSelector("input[class='fbIndex UIPage_LoggedOut _-kb _605a b_c3pyn-ahh chrome webkit win x1 Locale_en_GB cores-gte4 _19_u']")).sendKeys("Manjunath");
    driver.findElement(By.name("firstname")).sendKeys("Manjunath");
    Thread.sleep(2000);

    driver.findElement(By.name("lastname")).sendKeys("B S");
	Thread.sleep(2000);
	
	driver.findElement(By.name("reg_email__")).sendKeys("manjunathbrsandra43@gmail.com");
	Thread.sleep(2000);

	driver.findElement(By.name("reg_passwd__")).sendKeys("Manju@123");
	Thread.sleep(2000);

	driver.findElement(By.name("birthday_day")).sendKeys("4");
	Thread.sleep(2000);

	driver.findElement(By.name("birthday_month")).sendKeys("apr");
	Thread.sleep(2000);

	driver.findElement(By.name("birthday_year")).sendKeys("1994");
	Thread.sleep(2000);

	driver.findElements(By.name("sex")).get(1).click();
	Thread.sleep(2000);

	driver.findElement(By.name("websubmit")).click();
	Thread.sleep(2000);
	driver.close();

}

@Test
public void Navigate_methods() throws InterruptedException
{
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
public void Css_selectors_methods() throws InterruptedException
{
   	driver.get("https://www.facebook.com/");
   	
    driver.manage().window().maximize();
   	
   	driver.findElement(By.cssSelector("#email")).sendKeys("manjunathbrsandra43@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#pass")).sendKeys("Manju@1994");
	Thread.sleep(3000);
	//driver.findElement(By.cssSelector("#u_0_9_DM")).click();
	
    Thread.sleep(2000);
	driver.close();
}
@Test
public void Keyboard_operations() throws AWTException, InterruptedException 
{
   	driver.get("https://www.facebook.com/");
   	Robot r = new Robot();

	r.mouseMove(300, 500);

	r.keyPress(KeyEvent.VK_CAPS_LOCK);

	r.keyPress(KeyEvent.VK_F);

	r.keyRelease(KeyEvent.VK_F);


	r.keyPress(KeyEvent.VK_W);

	r.keyRelease(KeyEvent.VK_W);
	Thread.sleep(3000);

	driver.quit();
	
}
@Test
public void Take_screenshots() throws IOException, InterruptedException
{
   	driver.get("https://www.facebook.com/");
   	
   	/*TakesScreenshot ts = (TakesScreenshot) driver;

	File srcFile = ts.getScreenshotAs(OutputType.FILE);

	File destFile = new File(".\\FB_Screenshots\\" + "__Facebook1.png");

	FileHandler.copy(srcFile, destFile);*/
	
	driver.findElement(By.cssSelector("#email")).sendKeys("manjunathbrsandra43@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#pass")).sendKeys("Manju@1994");
	Thread.sleep(3000);
    
	TakesScreenshot ts = (TakesScreenshot) driver;

	File srcFile = ts.getScreenshotAs(OutputType.FILE);

	File destFile = new File(".\\FB_Screenshots\\" + "Facebook2.png");

	FileHandler.copy(srcFile, destFile);
	
	driver.close();
}
@Test
 public void Xpath_methods() throws InterruptedException
 {
	   	driver.get("https://www.facebook.com/");
	   	driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vdYUGCWICE");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Manju@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(5000);
		Thread.sleep(2000);
		driver.close();

 }
@Test
public void Xpath_contains() throws InterruptedException
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
public void Text() throws InterruptedException
{
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("manjunathbrsandra43@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Manju@1994");
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//button[text()='Log In']")).click();
	//Thread.sleep(2000);
	driver.close();
}

@Test
 public void Text_isdisabled() throws InterruptedException
 {
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

@Test
 public void Scrollup_down() throws InterruptedException
 {
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
 public void Frame() throws InterruptedException
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
public void Context_click_gmail() throws InterruptedException
{
	driver.get("https://www.gmail.com");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("manjunathbrsandra43@gmail.com");
	driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("6360610683");

}
@Test
public void Navigate_to_botttom() throws InterruptedException
{
	driver.get("http://www.seleniumhq.org/download/");
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

public void Chromedriver() throws InterruptedException
{
	driver.get("https://www.facebook.com/");

	WebElement email = driver.findElement(By.id("email"));
	email.clear();
	email.sendKeys("8446251018");
	Thread.sleep(3000);
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("Prashi@123");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Log In")).click();

	Thread.sleep(2000);
	driver.close();
}
@Test
public void Webelement_count()
{
	driver.get("");
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	int linkCount = links.size();
	System.out.println("Total Number of link count on webpage = " + linkCount);
}

@Test
public void Image_count()
{
	driver.get("https://www.facebook.com/");
	List<WebElement> image = driver.findElements(By.xpath("//img"));
	int imageCount = image.size();
	System.out.println("Total Number of image count on webpage = " + imageCount);
}

@Test
public void Input_tagcount()
{
	driver.get("");
	List<WebElement> inputTag = driver.findElements(By.xpath("//input"));
	int inputTagCount = inputTag.size();
	System.out.println("Total Number of input tag count on webpage = " + inputTagCount);
}

public void headtag_count()
{
	driver.get("");
	List<WebElement> headTag = driver.findElements(By.xpath("//head"));
	int headTagCount = headTag.size();
	System.out.println("Total Number of head tag count on webpage = " + headTagCount);
}

@Test

public void bodytag_count()
{
	driver.get("https://www.facebook.com/");
	List<WebElement> bodyTag = driver.findElements(By.xpath("//body"));
	int bodyTagCount = bodyTag.size();
	System.out.println("Total Number of body tag count on webpage = " + bodyTagCount);
}
@Test
public void scripttag_count()
{
	driver.get("");
	List<WebElement> scriptTag = driver.findElements(By.xpath("//script"));
	int scriptTagCount = scriptTag.size();
	System.out.println("Total Number of script tag count on webpage = " + scriptTagCount);
}
@Test
public void styletag_count()
{
	driver.get("https://www.facebook.com/");
	List<WebElement> styleTag = driver.findElements(By.xpath("//style"));
	int styleTagCount = styleTag.size();
	System.out.println("Total Number of style tag count on webpage = " + styleTagCount);
}

@Test
public void spantag_count()
{
	driver.get("");
	List<WebElement> spanTag = driver.findElements(By.xpath("//span"));
	int spanTagCount = spanTag.size();
	System.out.println("Total Number of span tag count on webpage = " + spanTagCount);
}
@Test
public void button_count()
{
	driver.get("https://www.facebook.com/");
	List<WebElement> button = driver.findElements(By.xpath("//button"));
	int buttonCount = button.size();
	System.out.println("Total Number of button count on webpage = " + buttonCount);
}

@Test
public void table_count()
{
	driver.get("");
	List<WebElement> table = driver.findElements(By.xpath("//table"));
	int TableCount = table.size();
	System.out.println("Total Number of table count on webpage = " + TableCount);

}

@Test
public void allelement_count()
{
	driver.get("");
	List<WebElement> allElements = driver.findElements(By.xpath("//*"));
	int elementsCount = allElements.size();
	System.out.println("Total Number of All Element on webpage = " + elementsCount);
}

@Test
public void Simple_alert() throws InterruptedException
{
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	driver.findElement(By.id("alertButton")).click();
	Alert alert =driver.switchTo().alert();
	Thread.sleep(2000);
	System.out.println(alert.getText());
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	
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
@SuppressWarnings("deprecation")
@Test
public void auto_It() throws InterruptedException, IOException
 
 {
	 driver.get("https://www.freepdfconvert.com/pdf-to-word");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//span[contains(text(),'Choose PDF file')]")).click();
	 Thread.sleep(2000);
	 Runtime.getRuntime().exec("D:\\File_upload.exe");
	 Thread.sleep(2000);
	 driver.close();
	 
	 
	 
 }
}

