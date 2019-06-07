package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseActions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");

		WebElement Add = driver.findElement(By.name("ts_address"));
		
		Actions act = new Actions(driver);
		
		
		  act.moveToElement(Add)
		  .keyDown(Add, Keys.SHIFT)
		  .sendKeys(Add, "abhresh")
		  .keyUp(Add, Keys.SHIFT)
		  .doubleClick(Add)
		  .contextClick(Add)
		  .perform();
		 

		
		/*
		 * Action NewAct = act.moveToElement(Add) .keyDown(Add, Keys.SHIFT)
		 * .sendKeys(Add, "abhresh") .keyUp(Add, Keys.SHIFT) .doubleClick(Add)
		 * .contextClick(Add) .build();
		 * 
		 * 
		 * NewAct.perform();
		 */
		 		
		
		
		

	}

}
