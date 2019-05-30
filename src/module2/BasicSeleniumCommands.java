package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicSeleniumCommands {

	public static void main(String[] args) {
		
		// single line comment
		/*
		 * Multi 
		 * Line 
		 * comments
		 */
		
		//Browser initialization OR instantiating
		//Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Selenium\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();
		
		//FirefoxBrowser
		System.setProperty("webdriver.gecko.driver", "D:\\Training\\Selenium\\Selenium\\drivers\\geckodriver_0.24.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		//Close or Quit the browser
		driver.close();//it will close the correct active window in this current instance 
		driver.quit();// it will close all the windows in the current instance
		
		//Get Commands
		driver.get("URL");//this is used to open an Application URL in the Browser
		driver.getTitle();//this is used to get the current title of the page
		driver.getCurrentUrl();//this will give you the current URL on the browser
		
		//navigation commands
		driver.navigate().back();// take you to the previous page
		driver.navigate().forward();// take you to the next page
		driver.navigate().refresh();// to do page refresh
		
		//Element Handling commands
		driver.findElement(By.id("")).click();// to click
		driver.findElement(By.id("")).sendKeys("");// to type
		driver.findElement(By.id("")).clear();// to erase data
		
	}

}
