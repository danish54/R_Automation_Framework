package pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import resources.Utilities;

public class HomePage {

	Utilities util;

	public HomePage(Utilities util) {
		util = Utilities.getObject();
		this.util = util;

		// failing
		PageFactory.initElements(util.getDriver(), this);
	}

	@FindBy(tagName = "a")
	List<WebElement> links;
	
	@FindAll({
		
		@FindBy(xpath = "//input[@value=\"radio1\"]"),
		@FindBy(id="radioButton")
		})

	List<WebElement> buttonbox;

	
	public List<String> getLink() {
		List<String> matchingLinks = new ArrayList<>();
		for (WebElement link : links) {
			if (link.getAttribute("href") != null) {
				matchingLinks.add(link.getAttribute("href"));
			}
		}
		return matchingLinks;
	}

	public  void radiobuttonBoxClick() {
		
		
		System.out.println(buttonbox.size());
		
	}
}
