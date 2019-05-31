package module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facbook {

	public static void main(String[] args) throws InterruptedException {
	
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
		
		//name
		driver.findElement(By.name("reg_email__")).sendKeys("0987654321");
		
		/* 
		 * //ClassName
		 * driver.findElement(By.className("inputtext")).sendKeys("Abhresh");
		 * driver.findElement(By.className("inputtext")).sendKeys("Sugandhi");
		 * 
		 * //Linktext driver.findElement(By.linkText("Messenger")).click();
		 * 
		 * driver.navigate().back();
		 * 
		 * driver.navigate().refresh();
		 * 
		 * //PartialLinktext driver.findElement(By.partialLinkText("account?")).click();
		
		
		//CSS
		driver.findElement(By.cssSelector("#u_0_a")).click();
		 */
		
		//TagName
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		
		//Xpath
		
		
		//Close the Browser
		Thread.sleep(5000);
		driver.quit();
		

	}

}
