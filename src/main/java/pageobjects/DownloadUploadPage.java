package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Utilities;

public class DownloadUploadPage {
	WebDriver driver;
	Utilities util;

	public DownloadUploadPage(Utilities util) {

		util = Utilities.getObject();
		this.util = util;
		PageFactory.initElements(util.getDriver(), this);
	}

	@FindBy(css = "#downloadButton")
	WebElement Download;
	
	@FindBy(xpath = "//input[@id=\"fileinput\"]")
	WebElement Upload;
	@FindBy(xpath = "//div[@role=\"alert\"]//child::div[2]")
	public
	WebElement UploadAlert;


	public void ClickOnDownload() {
		Download.click();

	}
	
	public void UploadFile(String str) {
		Upload.sendKeys(str);
	}

}
