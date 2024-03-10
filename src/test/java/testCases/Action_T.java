package testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import bsh.util.Util;
import pageobjects.HomePage;
import resources.BaseClass;
import resources.ExtendReportsNG;
import resources.Listeners;
import resources.Utilities;

public class Action_T extends BaseClass {
	Utilities util;
	HomePage home;
	ExtentTest ExtentLog;
	Listeners lsner;

	@Test(groups = "Regression")
	public void RadioVuttonClick() {
		WebElement button1 = Utilities.getObject().getDriver().findElement(By.xpath("//input[@value=\"radio1\"]"));
		
		Utilities.getObject().WWait(button1);
		button1.click();
		Listeners.getExtent().info("Button Clicked");

		
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
