package pageObjectModel;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestCase extends BaseClass {
	
	@Test
	public void buttonClick() throws Exception {
		openUrl();
		MainPage mpage = new MainPage(driver);
		mpage.radiobuttonBoxClick();
		Thread.sleep(2000);
		assertTrue(false);
	}

}
