package module10.utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	static Workbook wb;
	static Sheet sh;
	
	public static void SetupExcel(String path, String sheetname) throws Exception {
		
		FileInputStream fis = new FileInputStream(path);

		wb = WorkbookFactory.create(fis);
		
		sh = wb.getSheet(sheetname);
	}
	
	public static String getData(int rownum, int cellnum) {
		
		String data = sh.getRow(rownum).getCell(cellnum).toString();

		return data;
		
	}
}
