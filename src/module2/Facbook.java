package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facbook {

	public static void main(String[] args) {
	
		//Instantiate the browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Selenium\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open the AUT
		driver.get("https://www.facebook.com/");
		
		/*Locating various elements
		 * and experience the various 
		 * locator techniques
		 */
		
		//ID locator
		driver.findElement(By.id("u_0_j")).sendKeys("Abhresh");
		driver.findElement(By.id("u_0_l")).sendKeys("Sugandhi");
		
		//Name
		//ClassName
		//Linktext
		//PartialLinktext
		//CSS
		//TagName
		//Xpath
		
		//Close the Browser
		//driver.quit();
		

	}

}
