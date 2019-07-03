package module9.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {

	
	@FindBy(name = "ts_first_name")
	WebElement firstName;
	
	@FindBy(name = "ts_last_name")
	WebElement lastName;
	
	@FindBy(name = "ts_address")
	WebElement address;
	
	
	public FormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	public void formFill(String fName, String lName, String add) throws Exception {
		firstName.clear();
		firstName.sendKeys(fName);
		
		lastName.clear();
		lastName.sendKeys(lName);
		
		address.clear();
		address.sendKeys(add);
		
		Thread.sleep(5000);
		
	}
	
}
