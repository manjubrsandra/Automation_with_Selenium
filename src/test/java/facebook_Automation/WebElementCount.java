package facebook_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebElementCount {

public  WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");
	   	driver = new ChromeDriver();
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

}
