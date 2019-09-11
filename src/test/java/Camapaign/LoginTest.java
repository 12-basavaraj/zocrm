package Camapaign;

import generic.FileLib;
import generic.WebDriveCommonLib;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pom.HomePage;

@Listeners(generic.MyListener.class)
public class LoginTest extends generic.BaseTest {
	
	generic.WebDriveCommonLib Wlib;
	FileLib flib;
	HomePage HP;
	
	@Test
	public void verifyCRMLoginTest() throws Throwable
	{
		Wlib=new WebDriveCommonLib();
		flib=new FileLib();
		
	Wlib.verifyTitle(flib.getKeyPropertyValue(PROP_PATH, "LoginTitle"));
		Thread.sleep(3000);
		//loginToApp();
		
		Wlib.verifyTitle(flib.getKeyPropertyValue(PROP_PATH, "HomePageTitle"));
		
		HP=new HomePage(driver);
		if(HP.campaignTab().isDisplayed())
		{
			Reporter.log("Campaign tab is displayed", true);
			HP.campaignTab().click();
		}
		else
		{
			Reporter.log("Camapaign tab is not displayed",true);
		}
		
	}
	
	

}
