package module5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/");

		driver.findElement(By.xpath("//*[@class=\"desktop-searchBar\"]")).sendKeys("Jackets");
		
		driver.findElement(By.xpath("//*[@class=\"desktop-submit\"]")).click();
		
		WebElement mh = driver.findElement(By.xpath("//*[@class=\"desktop-submit\"]//following::img[1]"));
		
		Actions act = new Actions(driver);
	
		act.moveToElement(mh).perform();
		
		
	}

}
