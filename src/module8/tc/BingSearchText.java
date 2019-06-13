package module8.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module8.pages.BingHomePageObjects;
import module8.pages.SelHomePageObjects;

public class BingSearchText {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.bing.com/");
		
		BingHomePageObjects bPage = new BingHomePageObjects(driver);
		
		bPage.BingSearch("SeleniumHQ");
		
		Thread.sleep(3000);
		
		bPage.SelLinkClick();
		
		SelHomePageObjects sPage = new SelHomePageObjects(driver);
	
		sPage.linkchecking();
	}

}
