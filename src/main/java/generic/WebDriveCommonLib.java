package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class WebDriveCommonLib extends BaseTest{

	public void waitForPageLoad()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void waitForElementLoad(int sec,By locator)
	{
		 WebDriverWait wait=new WebDriverWait(driver,sec);
	     
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public void verifyTitle(String expectedTitle)
	{
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
		Reporter.log("The Title is matching==>PASSED");
	}
	
	public void verify(String message,String actual,String expected)
	{
		Assert.assertEquals(actual, expected);
	      Reporter.log(message+"Verifcation is matching ==>PASSED", true);	
	}
	
}
