package rough;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadTest {

	WebDriver driver;

	@Test
	public void Login() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");	
		
		  Thread.sleep(2000); 
		  String file = "C:\\Users\\danish2545\\Downloads\\Asset1.png";
		  WebElement fileInput = driver.findElement(By.xpath("//input[@name=\"userfile\"]"));
		  WebElement sendBTN = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		  fileInput.sendKeys(file);
		  sendBTN.click();
		  
	}
	
	@Test
	public void UplaodImage() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		String url = "https://www.ilovepdf.com/jpg_to_pdf";
		driver.get(url);
		
	}

}
