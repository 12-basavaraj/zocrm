package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="userName")private WebElement usernameTB;
	public void setUsername(String un)
	{
		usernameTB.sendKeys(un);
	}
	
	@FindBy(id="passWord") 
	private WebElement passwordTB;
	public void setPassword(String pwd)
	{
		passwordTB.sendKeys(pwd);
	}
	
	@FindBy(xpath="//input[@title='Sign In']")private WebElement LoginBtn;
	public void ClickLoginBtn()
	{
		LoginBtn.click();
	}
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
