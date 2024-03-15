package testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pageobjects.DownloadUploadPage;
import pageobjects.HomePage;
import resources.BaseClass;
import resources.Listeners;
import resources.Utilities;

public class Action_T extends BaseClass {
	Utilities util;
	HomePage home;
	ExtentTest ExtentLog;
	Listeners lsner;
	WebDriver driver;

	@Test(groups = "Regression")
	public void RadioVuttonClick() throws IOException {
		util = Utilities.getObject();

		util.openUrl(util.getConfigProperty("url"));
		Utilities.getObject();
		WebElement button1 = Utilities.getDriver().findElement(By.xpath("//input[@value=\"radio1\"]"));

		Utilities.getObject().WWait(button1);
		button1.click();
		Listeners.getExtent().info("Button Clicked");
	}

	@Test
	public void downloadUploadTest() throws IOException, InterruptedException {
		util = Utilities.getObject();
		driver = Utilities.getDriver();
		util.openUrl(util.getConfigProperty("uploadURL"));
		DownloadUploadPage dnld = new DownloadUploadPage(util);
		//dnld.ClickOnDownload();
		String file = "C:\\Users\\danish2545\\eclipse-workspace\\R_Automation\\src\\test\\resources\\TestData\\download.xlsx";
		dnld.UploadFile(file);
		
		util.WaitTillElementInVisible(dnld.UploadAlert);
		util.WaitTillElementVisible(dnld.UploadAlert);
		String price = driver.findElement(By.xpath("//div[contains(text(),'Apple')]//parent::div//following-sibling::div[2]")).getText();
		System.out.println(price);
		Thread.sleep(3000);
		
		
	}

	@Test(groups = "smoke")
	public void RadioVutton_2() {
		System.out.println("RadioVutton_2");
		List<WebElement> urllist = Utilities.getObject().getDriver().findElements(By.tagName("a"));
		for (WebElement webElement : urllist) {
			String url = webElement.getAttribute("href");
			if (url != null && !url.isEmpty()) {
				System.out.println(url);

			}
		}
	}

	@Test(groups = "smoke")
	public void testLink() {
		home = new HomePage(util);
		System.out.println(home.getLink());

		List<String> linkss = home.getLink();
		String linkCount = String.valueOf(linkss.size());
		for (String string : linkss) {
			if (string != null && !string.isEmpty()) {
				Listeners.getExtent().info(string);
				Listeners.getExtent().info(linkCount);
			}
		}

	}

	@Test(groups = "smoke")
	public void RadioVutton_3() {
		System.out.println("RadioVutton_3");
		try {
			Assert.assertTrue(false);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Test(groups = "smoke")
	public void RadioVutton_4() throws IOException {

		System.out.println("RadioVutton_4");
	}
}
