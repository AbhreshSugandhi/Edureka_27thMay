package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MDbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@type = 'text' and @class = '_2zrpKA _1dBPDZ']")).sendKeys("Abhresh");

		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@class ='_2AkmmA _29YdH8']")).click();
		
	}

}
