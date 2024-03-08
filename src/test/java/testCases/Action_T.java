package testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import bsh.util.Util;
import pageobjects.HomePage;
import resources.BaseClass;
import resources.Utilities;

public class Action_T extends BaseClass {
	Utilities util;
	ExtentReports ext;
	HomePage home;
	

	@Test(groups = "smoke")
	public void RadioVutton_1() {

		System.out.println("RadioVutton_1");
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
	
	@Test(groups = "Regression")
	public void testLink() {
		home = new HomePage(util);
		System.out.println(home.getLink());
		
		
		
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
