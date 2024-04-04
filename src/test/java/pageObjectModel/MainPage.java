package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Utill {
	ThreadLocal<WebDriver> driver;

	public MainPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);

	}

	@FindBy(xpath = "//input[@value=\"radio1\"]")
	WebElement element;

	public void radiobuttonBoxClick() {
		WaitTillElementInVisible(element);
		element.click();

	}

}
