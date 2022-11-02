package module1_webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Wiki_Page 
{
	@FindBy(xpath="//tbody/tr[12]/td[1]/div[1]/ul[1]/li[1]") private WebElement ReleseDate_wiki;
	@FindBy(xpath="//td[normalize-space()='India']")private WebElement CountryOfOrigin_wiki;
	
	public Wiki_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@Test
	public String VerifyReleseDate()
	{
		String actReleseDate = ReleseDate_wiki.getText();
		return actReleseDate;
	}
	@Test
	public String VerifyCountryOfOrigin()
	{
		String actCountryOfOrigin_wiki=CountryOfOrigin_wiki.getText();
		return actCountryOfOrigin_wiki;
	}

}
