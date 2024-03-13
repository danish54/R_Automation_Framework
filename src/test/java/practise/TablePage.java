package practise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TablePage {
	WebDriver driver;

	public TablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//select[@id=\"dropdown-class-example\"]")
	WebElement Select1;

	@FindBy(css = ".blinkingText")
	WebElement name;
	@FindBy(css = "body h1")
	WebElement Title;
	
	@FindBy(css="input#alertbtn.btn-style")
	WebElement Alertbtn1;
	
	@FindBy(xpath = "//input[@name=\"enter-name\"]")
	WebElement inputbox;
	
	@FindBy(xpath = "//input[@id=\"confirmbtn\"]")
	WebElement AlertButton;
	
	public void Select12() {
		
		Select1.click();
	}

	public void JsInptText() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Danish';", inputbox);
	}
	public void GetLinkName() {

		System.out.println(name.getText());
		System.out.println(Title.getText());
	}
	
	public void inputText(String Text) {
		inputbox.sendKeys(Text);
	}
	
	public void AlertButtobClick() {
		AlertButton.click();
	}
	
	public void alertbtn1Click() {
		Alertbtn1.click();
	}

}
