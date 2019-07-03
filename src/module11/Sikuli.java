package module11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");
		
		Screen s = new Screen();
		
		Pattern loginFB = new Pattern("D:\\Training\\Selenium\\Programs\\Edureka_27thMay\\Autoit&Sikuli\\Login.JPG");
		
		Pattern Email = new Pattern("D:\\Training\\Selenium\\Programs\\Edureka_27thMay\\Autoit&Sikuli\\Email.JPG");

		s.getScreen().click(loginFB);
		
		Thread.sleep(5000);
		
		s.getScreen().type(Email, "Abhresh");
		
		
	}

}
