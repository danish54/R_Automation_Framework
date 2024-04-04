package pageObjectModel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import resources.Utilities;

public class BaseClass {

	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	@BeforeMethod
	public void SetupBrowser() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver.set(new ChromeDriver(options));
		driver.get().manage().window().maximize();
		
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public void openUrl() {
		driver.get().get("https://rahulshettyacademy.com/AutomationPractice");
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.get().quit();
	}
	
	public static String captureScreenShot(String testCaseName) throws IOException {

		Date date = new Date();
		long time = date.getTime();
		String st = String.valueOf(time);
		File source = ((TakesScreenshot) driver.get()).getScreenshotAs(OutputType.FILE);
		File target = new File(
				System.getProperty("user.dir") + "\\reports\\ScreenShots\\screentshot" + st + testCaseName + ".jpeg");
		FileUtils.copyFile(source, target);
		String str = System.getProperty("user.dir") + "\\reports\\ScreenShots\\screentshot" + st + testCaseName
				+ ".jpeg";
		return str;

	}
}
