package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeProfileLoad {
	WebDriver driver;
	@Test
	public void testName() throws Exception {
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("user-data-dir=C:\\Users\\danish2545\\AppData\\Local\\Google\\Chrome\\User Data");
		option.addArguments("--profile-directory=Profile 3");
		driver = new ChromeDriver(option);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
}
