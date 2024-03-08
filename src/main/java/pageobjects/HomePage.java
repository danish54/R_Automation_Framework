package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Utilities;

public class HomePage {

	Utilities util;

	public HomePage(Utilities util) {
		this.util = Utilities.getObject();

		// failing
		PageFactory.initElements(util.getDriver(), this);
	}

	@FindBy(tagName = "a")
	List<WebElement> links;

	public List<String> getLink() {
		List<String> matchingLinks = null;
		for (WebElement link : links) {
			if (link.getAttribute("href") != null) {
				matchingLinks.add(link.getAttribute("href"));
			}
		}
		return matchingLinks;
	}

}
