package windowhandel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Switchwindoiw {
	WebDriver driver;
	

	@Test
	public void testName() throws Exception {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		driver = new ChromeDriver(option);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.switchTo().window("");
		//String defaulttab =driver.getWindowHandle();
		Set<String> alltabs = driver.getWindowHandles();
		Iterator<String> it = alltabs.iterator();
		
		while(it.hasNext()) {
			
			it.next().toString();
			System.out.println(it.next().toString());
		}
		
	}
}
