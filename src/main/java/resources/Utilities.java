package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	public static Logger log = LogManager.getLogger();
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	static Utilities util;
	static FileInputStream fis;
	static Properties prop;
	static WebDriverWait Wait; 
	static HttpURLConnection connect; 
	public Utilities(){
		
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
			System.out.println("Broswer name insdside if block=--> "+broswename);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver.set(new ChromeDriver(options));
			System.out.println("Lauching broswer from if Block");
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
	
	public void WWait(WebElement element) {
		
		Wait = new WebDriverWait(getDriver(), Duration.ofSeconds(3));
		Wait.until(ExpectedConditions.elementToBeClickable(element));
		
		
	}
	
	public static int geturlReponseTest(URL url) throws IOException {
		
		connect = (HttpURLConnection) url.openConnection();
		connect.setRequestMethod("HEAD");
		int codename =  connect.getResponseCode();
		System.out.println(codename);
		return codename;
	
	}
}
