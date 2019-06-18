package module12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitBrowser {

	public static void main(String[] args) {

		WebDriver driver = new HtmlUnitDriver();

		driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		//driver.findElement(By.id("profession-1")).click();
			
		WebElement chkbox = driver.findElement(By.id("profession-1"));
		
		boolean Validation = chkbox.isSelected();
		
		System.out.println(Validation);
		
	}

}
