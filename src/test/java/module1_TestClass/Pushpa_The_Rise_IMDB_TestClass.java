package module1_TestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base_utility.BaseClass;
import base_utility.UtilityClass;
import module1_webpages.IMDB_Page;


public class Pushpa_The_Rise_IMDB_TestClass extends BaseClass
{
	IMDB_Page imdb_home;
	
	@BeforeTest
	public void OpenBrowser() throws IOException, InterruptedException
	{
		InitialiseBrowserIMDB();
		imdb_home = new IMDB_Page(driver);
		
	}
	@Test
	public void IMDB_Home_Page()
	{
		imdb_home.VerifyReleseDate();
		imdb_home.VerifyCountryOfOrigin();
	}

	@Test
	public void verifyPushpa_the_rise_IMDB_ReleseDate() throws EncryptedDocumentException, IOException
	{
		String actualReleseDate=imdb_home.VerifyReleseDate();
		String ExpectedReleseDate=UtilityClass.get_ReleseDate_Country_TestData(2,0);
		Assert.assertEquals(actualReleseDate, ExpectedReleseDate,"failed : both results diff");
	}
	@Test
	public void verifyPushpa_the_rise_IMDB_CountryOfOrigin() throws EncryptedDocumentException, IOException
	{
		String actualCountryOfOrigin=imdb_home.VerifyCountryOfOrigin();
		String ExpectedCountryOfOrigin = UtilityClass.get_ReleseDate_Country_TestData(1,1);
		Assert.assertEquals(actualCountryOfOrigin, ExpectedCountryOfOrigin,"failed : both results diff");
	}
	
	
	@AfterTest
	public void CloseBrowser() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}
}

