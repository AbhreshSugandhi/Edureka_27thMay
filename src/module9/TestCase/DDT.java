package module9.TestCase;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT {

	WebDriver driver;
	Workbook wb;
	Sheet sh;
	int numrows;
	int numcols;

	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
	}

	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}

	@Test(dataProvider = "testDataFeed")
	public void FormFill(String FName, String LName, String Add) throws InterruptedException {

		driver.findElement(By.id("ts_first_name")).clear();
		driver.findElement(By.id("ts_first_name")).sendKeys(FName);

		driver.findElement(By.id("ts_last_name")).clear();
		driver.findElement(By.id("ts_last_name")).sendKeys(LName);

		driver.findElement(By.id("ts_address")).clear();
		driver.findElement(By.id("ts_address")).sendKeys(Add);

		Thread.sleep(5000);

	}

	@DataProvider
	public Object[][] testDataFeed() throws Exception{
		
		FileInputStream fis = new FileInputStream("D:\\Training\\Selenium\\Programs\\Edureka_27thMay\\src\\module9\\TestData\\TestData.xlsx");
		
		wb = WorkbookFactory.create(fis);
		
		sh = wb.getSheet("Sheet1");
		
		numrows = sh.getLastRowNum();//10
		
		numcols = sh.getRow(0).getLastCellNum();//3
		
		Object[][] formData = new Object[numrows][numcols];
		
		for(int row=0; row<numrows; row++) 
		{
			for(int col=0; col<numcols; col++) 
			{
				formData[row][col] = sh.getRow(row).getCell(col).toString();
			}
		}
		return formData;
		
	}

}