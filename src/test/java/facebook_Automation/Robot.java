package facebook_Automation;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Robot {
	
	@Test
	public void Mouse_Keyboard_Methods() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Robot m = new Robot();
		
		m.mouseMove(200,600);
		
		m.mouseMove(100,900);
		
		m.keyPress(KeyEvent.VK_CAPS_LOCK);
		
		m.keyPress(KeyEvent.VK_F);
		m.keyRelease(KeyEvent.VK_F);
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
	}

	private void keyRelease(int vkF) {
		// TODO Auto-generated method stub
		
	}

	private void keyPress(int vkCapsLock) {
		// TODO Auto-generated method stub
		
	}

	private void mouseMove(int i, int j) {
		// TODO Auto-generated method stub
		
	}



}
