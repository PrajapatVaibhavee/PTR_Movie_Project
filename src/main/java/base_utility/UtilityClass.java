package base_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
	public static String get_ReleseDate_Country_TestData(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\praja\\eclipse-workspace\\Assignment_Project\\TestData\\Pushpa_The_Rise_Movie_TestData.xlsx");
		Sheet sheet = WorkbookFactory.create(fis).getSheet("Pushpa_The_Rise_Movie_Sheet");
		String value = sheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
	public static String getURLTestData(String key) throws IOException  
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\praja\\eclipse-workspace\\Assignment_Project\\PropertyFile\\URLData.properties");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	public static String getWikipediaURLTestData(String key) throws IOException  
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\praja\\eclipse-workspace\\Assignment_Project\\PropertyFile\\WikiURL.properties");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}


}
