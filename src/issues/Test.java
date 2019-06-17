package issues;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();
		
		/*
		 * driver.manage().deleteAllCookies();
		 * driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 * driver.manage().window().maximize();
		 */
		
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");					
        
		
		//Element which needs to drag.    		
        	WebElement From=driver.findElement(By.xpath("//span[contains(text(),'Draggable 1')]"));	
         
         //Element on which need to drop.		
         WebElement To=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]"));					
         		
         //Using Action class for drag and drop.		
         Actions builder = new Actions(driver);
                          		 
         builder.dragAndDrop(From, To).build().perform();
		
	}

}
