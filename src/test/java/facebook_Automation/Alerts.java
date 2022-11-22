package facebook_Automation;

import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
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
	
	@Test
	public  void Alert_Promptpopup() throws InterruptedException {
		
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.sendKeys("manju");
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.dismiss();
	}
	
	@Test
	public void Hiddendivisionpopup() throws InterruptedException
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--disable-geolocation");
		option.addArguments("--ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@placeholder='Pick a date'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("24")).click();
	}
	

	/*public void FileDownload()
	{
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", "D:\\");
		//Assign this chromePrefs object with ChromeOptions object
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		//Create Capability object and assign the option object
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(cap);
		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(3000);
		String xp = "//td[.='Java']/following-sibling::td/a[.='Download']";
		driver.findElement(By.xpath(xp)).click();}*/
	
	
	@Test
	
	   public void SeleniumFileDwnld() throws InterruptedException {

		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[normalize-space()='4.4.0']")).click();
	}

}
	
	
