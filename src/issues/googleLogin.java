package issues;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleLogin {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
		
		Thread.sleep(3000);
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		for(String awn : driver.getWindowHandles()) {

			driver.switchTo().window(awn);
			System.out.println(awn);

		}
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("mitali.gupta@edureka.co");
	}
}