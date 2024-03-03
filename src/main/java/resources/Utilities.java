package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Utilities {

	static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	static Utilities util;
	static FileInputStream fis;
	static Properties prop;

	private Utilities() {

	}
	
	// This will return utilities object
	public static Utilities getObject() {
		if (util == null) {
			util = new Utilities();
		}
		return util;
	}

	public WebDriver getDriver() {
		return driver.get();
	}

	public void SetupBrowser(String broswename) {
		if (broswename == null || broswename.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver.set(new ChromeDriver(options));
			driver.get().manage().window().maximize();
			driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		else  {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver.set(new ChromeDriver(options));
			driver.get().manage().window().maximize();
			driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
		
	}

	public void openUrl(String url) {
		driver.get().get(url);
	}
	
	public String getConfigProperty(String key) throws IOException {
		
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\properties\\config.Properties");
		prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key.trim());
		
	}
}
