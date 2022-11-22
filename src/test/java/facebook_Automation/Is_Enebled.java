package facebook_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Is_Enebled {
	
    @Test
	public static void verifyUNtextboxisEnabledinFacebook() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");
	   	WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement UN = driver.findElement(By.id("email"));
		if (UN.isEnabled()) {
			System.out.println("Username text box is enabled");
		} else {
			System.out.println("Username text box is disabled");
		}
		WebElement PW = driver.findElement(By.name("pass"));
		if (PW.isEnabled()) {
			System.out.println("Password text box is enabled");
		} else {
			System.out.println("Password text box is disabled");
		}
		driver.close();
		
	}

}
