package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame2 {


	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2019/07/example-of-html-iframe-alternative.html");
		
		/*
		 * WebElement inlineframe = driver.findElement(By.id("ID_Frame1"));
		 * driver.switchTo().frame(inlineframe);
		 */
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.name("ts_first_name")).sendKeys("Abhresh");
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(2);
		
		driver.findElement(By.name("ts_first_name")).sendKeys("Abhresh");

	
}
}