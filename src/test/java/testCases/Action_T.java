package testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

	@Test(groups = "smoke")
	public void RadioVuttonClick() throws IOException {
		util = Utilities.getObject();

		util.openUrl(util.getConfigProperty("url"));
		Utilities.getObject();
		WebElement button1 = Utilities.getDriver().findElement(By.xpath("//input[@value=\"radio1\"]"));

		Utilities.getObject().WWait(button1);
		button1.click();
		Listeners.getExtent().info("Button Clicked");
	}

	@Test(groups = "Regression")
	public void downloadUploadTest() throws IOException, InterruptedException {
		util = Utilities.getObject();
		driver = Utilities.getDriver();
		util.openUrl(util.getConfigProperty("uploadURL"));
		DownloadUploadPage dnld = new DownloadUploadPage(util);
		//dnld.ClickOnDownload();
		String file = System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\download.xlsx";
		dnld.UploadFile(file);
		
		//util.WaitTillElementInVisible(dnld.UploadAlert);
		util.WaitTillElementVisible(dnld.UploadAlert);
		String price = driver.findElement(By.xpath("//div[contains(text(),'Apple')]//parent::div//following-sibling::div[2]")).getText();
		System.out.println(price);
		int priceint= Integer.parseInt(price);
		Thread.sleep(1000);
		System.out.println("DanishDesktop");
		
		try {
			assertEquals(priceint, 300);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			captureScreenShot("TestFail");
			e.printStackTrace();
		}
	}
	
	@Test
	public void ScreeshotTest() throws IOException {
		util = Utilities.getObject();
		driver = Utilities.getDriver();
		util.openUrl(util.getConfigProperty("uploadURL"));
		//util.captureScreenShot("TestFail");
	}

	@Test(groups = "smoke")
	public void RadioVutton_2() {
		System.out.println("RadioVutton_2");
		Utilities.getObject();
		List<WebElement> urllist = Utilities.getDriver().findElements(By.tagName("a"));
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
		}

	}

	@Test(groups = "smoke")
	public void RadioVutton_4() throws IOException {

		System.out.println("RadioVutton_4");
	}
}
