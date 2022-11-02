package module1_webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Wikipedia_Page 
{
	@FindBy(xpath="//body[1]/div[3]/div[3]/div[5]/div[1]/table[1]/tbody[1]/tr[12]/td[1]") private WebElement ReleseDate_Wikipedia; 
	               
	@FindBy(xpath="//td[normalize-space()='India']") private WebElement CountryOfOrigin_Wikipedia;
	
	
	public Wikipedia_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@Test
	public String VerifyReleseDate_Wikipedia()
	{
		String actReleseDate_Wikipedia = ReleseDate_Wikipedia.getText();
		return actReleseDate_Wikipedia;
	}
	@Test
	public String VerifyCountryOfOrigin_Wikipedia()
	{
		String actCountryOfOrigin_Wikipedia=CountryOfOrigin_Wikipedia.getText();
		return actCountryOfOrigin_Wikipedia;
	}

}
