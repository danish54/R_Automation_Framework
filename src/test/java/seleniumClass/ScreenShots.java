package seleniumClass;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShots {
	
	WebDriver driver;
	
	@Test
	public void captureSS() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		TakesScreenshot ssobj = (TakesScreenshot) driver;
		File ssfile = ssobj.getScreenshotAs(OutputType.FILE);
		File dsfile = new File(System.getProperty("user.dir")+"\\reports\\ScreenShots\\screenshort.jpeg");
		FileUtils.copyFile(ssfile, dsfile);
	}

}
