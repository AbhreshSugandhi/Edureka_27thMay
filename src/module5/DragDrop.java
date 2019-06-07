package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		
		WebElement iFrm = driver.findElement(By.tagName("iframe"));
		
		driver.switchTo().frame(iFrm);
		
		WebElement Source = driver.findElement(By.id("draggable"));
		
		WebElement Target = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(Source, Target).perform();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
