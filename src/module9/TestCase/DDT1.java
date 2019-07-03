package module9.TestCase;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import module9.Pages.FormPage;

public class DDT1 {

	WebDriver driver;
	Workbook wb;
	Sheet sh;
	int norows;
	int nocols;
	
	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");

	}
	
	@Test(dataProvider = "testDataFeed")
	public void FormFill(String fName, String lName, String add) throws Exception {
		
		FormPage fp = new FormPage(driver);
		fp.formFill(fName, lName, add);
	}
	
	@DataProvider
	public Object[][] testDataFeed() throws Exception{
		
		FileInputStream fis = new FileInputStream("D:\\Training\\Selenium\\Programs\\Edureka_27thMay\\src\\module9\\TestData\\TestData.xlsx");
		
		wb = WorkbookFactory.create(fis);
		
		sh = wb.getSheet("Sheet1");
		
		norows = sh.getLastRowNum();//10
		
		nocols = sh.getRow(0).getLastCellNum();//3
		
		Object[][] formData = new Object[nocols][norows];
		
		for(int row=0; row<nocols; row++) 
		{
			for(int col=0; col<norows; col++) 
			{
				formData[row][col] = sh.getRow(row).getCell(col).toString();
			}
		}
		return formData;
	}

	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}
}