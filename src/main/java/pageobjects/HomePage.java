package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Utilities;

public class HomePage {
	
	Utilities util;
	
	HomePage(Utilities util){
		this.util = util;
		PageFactory.initElements(this.util.getDriver(), this);
	}
	
	@FindBy(tagName = "a") List<WebElement> links;
	

}
