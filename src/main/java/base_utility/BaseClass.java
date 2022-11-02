package base_utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass 
{
	
	public WebDriver driver;
	public void InitialiseBrowserIMDB() throws IOException, InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\praja\\eclipse-workspace\\Assignment_Project\\Browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get(UtilityClass.getURLTestData("URL"));
		//Thread.sleep(2000);
		//((JavascriptExecutor)driver).executeScript("window.srollBy(0,2000)");
		js.executeScript("window.scrollBy(0,6000)");
		
	}

	
	public void InitialiseBrowserWiki() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\praja\\eclipse-workspace\\Assignment_Project\\Browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get(UtilityClass.getWikipediaURLTestData("URL"));
		//Thread.sleep(2000);
		js1.executeScript("window.scrollBy(0,500)");
	}	
}
