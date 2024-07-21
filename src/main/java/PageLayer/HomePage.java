package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass
{
	@FindBy(xpath="//div[@class='header item']")
	private WebElement logo;
	
	
	public HomePage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	 public boolean validateLogo()
	 {
		 Boolean b=logo.isDisplayed();
		 return b;
	 }
	 public String getTitle()
	 {
		 String actualTitle=getDriver().getTitle();
		 return actualTitle;
	 }
	 
	 public String getUrl()
	 {
		 String actualTitle=getDriver().getCurrentUrl();
		 return actualTitle;
	 }

}
