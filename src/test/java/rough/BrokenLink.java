package rough;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrokenLink {
	WebDriver driver;

	@Test
	public void CheckBrokenLink() throws IOException, InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("HEADLESS");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		String link = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(link);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("Total Link Count =" + Links.size());

		Set<String> alllinks = new HashSet<String>();
		for (WebElement linK : Links) {
			//System.out.println(linK.getAttribute("href"));
			 String href = linK.getAttribute("href");
		        if (href != null && !href.isEmpty()) {
		        	alllinks.add(href);
		        }
			

		}

		for (String string : alllinks) {
			try {
				// Thread.sleep(2000);
				//System.out.println("before url convesion");
				//System.out.println("Issue ="+string);
				URL url = new URL(string);
				//System.out.println("after url convesion");
				HttpURLConnection connct = (HttpURLConnection) url.openConnection();
				connct.setRequestMethod("HEAD");
				// Thread.sleep(2000);
				int code = connct.getResponseCode();
				System.out.println(code);
				// Thread.sleep(2000);
				connct.disconnect();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		// System.out.println(alllinks.size());
		// System.out.println(alllinks);

	}

}
