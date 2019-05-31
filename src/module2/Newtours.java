package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours {

	public static void main(String[] args) throws Exception {

		// Instantiate the browser
		System.setProperty("webdriver.chrome.driver",
				"D:\\Training\\Selenium\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("tripType")).click();
			
		driver.findElement(By.name("findFlights")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("ITINERARY")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("ISTE")).click();
				
	}

}
