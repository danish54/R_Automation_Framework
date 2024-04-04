package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utill {
	

	WebDriverWait Wait;
	ThreadLocal<WebDriver> driver;

	public Utill(ThreadLocal<WebDriver> driver) {
		
		this.driver= driver;
	}

	public void WaitTillElementInVisible(WebElement element) {
		Wait = new WebDriverWait(driver.get(), Duration.ofSeconds(3));
		Wait.until(ExpectedConditions.visibilityOf(element));
	}
}
