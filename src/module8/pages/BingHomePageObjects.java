package module8.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingHomePageObjects {

	public BingHomePageObjects(WebDriver driver) {
		
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(name="q")
	WebElement txtSearch;

	@FindBy(name="go")
	WebElement btnSearch;
	
	@FindBy(linkText = "Selenium - Web Browser Automation")
	WebElement linkSelenium;
	
	public void BingSearch(String txtinput) {
		
		txtSearch.clear();
		txtSearch.sendKeys(txtinput);
		btnSearch.click();
	}
	
	public void SelLinkClick() {
		
		linkSelenium.click();
	}
}
