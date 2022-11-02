package module1_TestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base_utility.BaseClass;
import base_utility.UtilityClass;
import module1_webpages.Wikipedia_Page;

public class Pushpa_The_Rise_Wiki_TestClass extends BaseClass
{
	Wikipedia_Page wiki_home;
	@BeforeTest
	public void OpenBrowser() throws IOException, InterruptedException
	{
		InitialiseBrowserWiki();
		wiki_home=new Wikipedia_Page(driver);
	}
	@Test
	public void Wiki_Home_Page()
	{
		wiki_home.VerifyReleseDate_Wikipedia();
		wiki_home.VerifyCountryOfOrigin_Wikipedia();
	}
	@Test
	public void verifyPushpa_the_rise_Wiki_ReleseDate() throws EncryptedDocumentException, IOException
	{
		String actualReleseDate=wiki_home.VerifyReleseDate_Wikipedia();
		String ExpectedReleseDate=UtilityClass.get_ReleseDate_Country_TestData(1,0);  // instead of (1,0) giving (2,0) then test become fails or data mismatch
		Assert.assertEquals(actualReleseDate, ExpectedReleseDate,"Failed : if both results different");
		
	}
	@Test
	public void verifyPushpa_the_rise_Wiki_CountryOfOrigin() throws EncryptedDocumentException, IOException
	{
		String actualCountryOfOrigin_wiki=wiki_home.VerifyCountryOfOrigin_Wikipedia();
		String ExpectedCountryOfOrigin_wiki = UtilityClass.get_ReleseDate_Country_TestData(1,1);
		Assert.assertEquals(actualCountryOfOrigin_wiki, ExpectedCountryOfOrigin_wiki,"Failed : if both results different");
	}
	@AfterTest
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}

}
