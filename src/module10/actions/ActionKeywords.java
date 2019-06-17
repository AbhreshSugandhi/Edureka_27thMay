package module10.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {

	static WebDriver driver;
	
	public static void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		driver = new ChromeDriver();

		System.out.println("The Browser Opend Successfully");
	}
	
	public static void Navigate() {
		
		driver.navigate().to("https://google.com");
		System.out.println("AUT opened Successfully");
	}
	
	public static void ClickGmail() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("Clicked on GMail Link");
	}
	
}
