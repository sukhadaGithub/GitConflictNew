package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LogoutPage extends BaseClass{
	
	@FindBy(xpath="//div[@role='listbox']")
	private WebElement setting;
	
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logout;
	
	public LogoutPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void clickSetting()
	{
		Wait.click(setting);
	}
	
	public void clickLogout()
	{
		
		Wait.click(logout);
	}
	public void quitDriver()
	{
		getDriver().quit();
	}
}
