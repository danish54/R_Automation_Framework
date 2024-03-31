package javaTop1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SelWeight {

	WebDriver driver;
	WebDriverWait wait;
	
	@Test
	public void testName() throws Exception {
		
		driver = new ChromeDriver();
		
		WebElement ele =driver.findElement(By.xpath(""));
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(ele));
		List<WebElement> eleL = driver.findElements(By.xpath(""));
		wait.until(ExpectedConditions.visibilityOfAllElements(eleL));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView", ele);
				
	}
}
