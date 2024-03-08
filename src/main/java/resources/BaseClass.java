package resources;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class BaseClass   {
	 public static Utilities util = Utilities.getObject();
	
	@BeforeMethod(alwaysRun = true)
	@Parameters("browser")
	public void launchBroswe(@Optional String browser) throws IOException {
		util.SetupBrowser(browser);
		System.out.println(browser);
		util.openUrl(util.getConfigProperty("url"));
			
		}
	@AfterMethod(alwaysRun = true)
	public void teardown() throws InterruptedException{
		
		Thread.sleep(2000);
		util.getDriver().close();
		
	}
	
	}
