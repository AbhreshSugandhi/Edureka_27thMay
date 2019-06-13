package module8.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelHomePageObjects {

	
	@FindBy(linkText = "Download")
	WebElement linkDownload;
	
	@FindBy(linkText = "Projects")
	WebElement linkProject;
	
	@FindBy(linkText = "Browser Automation")
	WebElement LinkHome;
	
	public SelHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickDownload() {
		linkDownload.click();
	}
	
	public void ClickProjects() {
		linkProject.click();
	}
	
	public void ClickHome() {
		LinkHome.click();
	}
	
	public void linkchecking() {
		
		linkDownload.click();
		linkProject.click();
		LinkHome.click();
	}
	
}
