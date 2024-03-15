package resources;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static Utilities util = Utilities.getObject();

	@BeforeMethod(alwaysRun = true)
	@Parameters("browser")
	public void launchBroswe(@Optional String browser) throws IOException {
		util.SetupBrowser(browser);
	}

	@AfterMethod(alwaysRun = true)
	public void teardown() throws InterruptedException {

		Thread.sleep(2000);
		util.getDriver().close();

	}

	public static String captureScreenShot(String testCaseName) throws IOException {

		Date date = new Date();
		long time = date.getTime();
		String st = String.valueOf(time);
		File source = ((TakesScreenshot) Utilities.getDriver()).getScreenshotAs(OutputType.FILE);
		File target = new File(
				System.getProperty("user.dir") + "\\reports\\ScreenShots\\screentshot" + st + testCaseName + ".jpeg");
		FileUtils.copyFile(source, target);
		String str = System.getProperty("user.dir") + "\\reports\\ScreenShots\\screentshot" + st + testCaseName
				+ ".jpeg";
		return str;

	}

}
