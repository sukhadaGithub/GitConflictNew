package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LoginPage extends BaseClass
{
	@FindBy(name="email")
	private WebElement user;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	private WebElement submit;
	
	public LoginPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void enterCredentials(String username1,String password1)
	{
		Wait.sendKeys(user, username1);
		Wait.sendKeys(password, password1);
	}
	public void clickLogin()
	{
		Wait.click(submit);
	}

}
