package module1_webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class IMDB_Page 
{
		
		@FindBy(xpath="//a[normalize-space()='December 17, 2021 (United States)']") private WebElement ReleseDate;
		@FindBy(xpath="//a[normalize-space()='India']") private WebElement CountryOfOrigin;
		
		
		
		public IMDB_Page(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}

		@Test
		public String VerifyReleseDate()
		{
			String actReleseDate = ReleseDate.getText();
			return actReleseDate;
		}

		@Test
		public String VerifyCountryOfOrigin()
		{
			String actCountryOfOrigin=CountryOfOrigin.getText();
			return actCountryOfOrigin;
		}
	}



