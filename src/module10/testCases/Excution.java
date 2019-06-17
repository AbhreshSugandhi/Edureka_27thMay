package module10.testCases;

import module10.actions.ActionKeywords;
import module10.utility.ExcelUtility;

public class Excution {

	public static void main(String[] args) throws Exception {
		
		String path = "D:\\Training\\Selenium\\Programs\\Edureka_27thMay\\src\\module10\\testData\\MyDataEngine.xlsx";
		
		ExcelUtility.SetupExcel(path, "Sheet1");
		
		for(int i=0; i<=3; i++) 
		{
			String Keyword = ExcelUtility.getData(i, 1);
			if(Keyword.equals("OpenBrowser")) 
			{
				ActionKeywords.OpenBrowser();
			}
			else if(Keyword.equals("Navigate"))
			{
				ActionKeywords.Navigate();
			}
			else if(Keyword.equals("ClickGmail")) 
			{
				ActionKeywords.ClickGmail();
			}
		}
	}
}
