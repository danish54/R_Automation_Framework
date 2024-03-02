package resources;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class BaseClass   {
	 Utilities util = Utilities.getObject();
	
	@BeforeTest(alwaysRun = true)
	@Parameters("browser")
	public void launchBroswe(@Optional String browser) throws IOException {
		util.SetupBrowser(browser);
		System.out.println(browser);
		util.openUrl(util.getConfigProperty("url"));
			
		}
	}
