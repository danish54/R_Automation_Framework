package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TableTest extends BaseTest {
	TablePage tab;
	
	

	@Test(enabled = false)
	public void getText() throws InterruptedException, Exception {
		tab = new TablePage(driver);

		tab.GetLinkName();
		Thread.sleep(2000);
	}
	
	@Test
	public void IMpitTeext() throws InterruptedException {
		tab = new TablePage(driver);
		tab.inputText("Danish");
		tab.AlertButtobClick();
		Thread.sleep(2000);
		System.out.println(tab.driver.switchTo().alert().getText());
		
		//tab.driver.switchTo().alert().dismiss();
		tab.driver.switchTo().alert().accept();
		Thread.sleep(2000);
		tab.alertbtn1Click();
		Thread.sleep(2000);
		tab.driver.switchTo().alert().accept();
		}
	
	@Test
	public void JsInput() throws InterruptedException {
		tab = new TablePage(driver);
		tab.JsInptText();
		Thread.sleep(2000);
	}
	
	@Test
	public void KeYInout() throws InterruptedException {
		Thread.sleep(1000);
		tab = new TablePage(driver);
		tab.Select12();
		Thread.sleep(1000);
		tab.Select1.sendKeys(Keys.ARROW_DOWN);
		tab.Select1.sendKeys(Keys.ARROW_DOWN);
		tab.Select1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	
	}
	
	@Test
	public void KeYInout21() throws InterruptedException {
		Thread.sleep(1000);
		tab = new TablePage(driver);
		tab.inputbox.sendKeys(Keys.SHIFT, "danish");
		Thread.sleep(2000);
	}

}
