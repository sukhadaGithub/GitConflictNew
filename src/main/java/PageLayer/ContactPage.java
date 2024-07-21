package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDopdown;
import UtilityLayer.Wait;

public class ContactPage extends BaseClass
{
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/div[3]/a/span")
	private WebElement contacts;
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement create;
	
	@FindBy(name="first_name")
	private WebElement fname;
	
	@FindBy(name="middle_name")
	private WebElement mname;
	
	@FindBy(name="last_name")
	private WebElement lname;
	
	@FindBy(xpath="//label[text()='Category']/following-sibling::div")
	private WebElement category;
	
	@FindBys(@FindBy(xpath="//div[@class='visible menu transition']/child::div"))
	private List<WebElement> listCategory;

	@FindBy(xpath="//button[@class='ui linkedin button']")
	private WebElement save;
	
	@FindBy(xpath="//i[@class='trash icon']")
	private WebElement delete;
	
	@FindBy(xpath="//button/i[@class='remove icon']")
	private WebElement cdelete;
	
	public ContactPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void clickContact() throws InterruptedException
	{
		Thread.sleep(8000);
		Wait.click(contacts);
		// String actualTitle=getDriver().getTitle();
		 //return actualTitle;
	}
	public void createContact() throws InterruptedException
	{
		Thread.sleep(8000);
		Wait.click(create);
	}
	
	public void enterDetails(String fname1,String mname1,String lname1,String status1) throws InterruptedException
	{
		
		Wait.sendKeys(fname, fname1);
		Wait.sendKeys(mname, mname1);
		Wait.sendKeys(lname, lname1);
		HandleDopdown hd=new HandleDopdown();
		Wait.click(category);
		hd.selectDropDown(listCategory, status1);
	    
		
	}
	public void clickSave()
	{
		Wait.click(save);
	}
	public void deleteContact()
	{
		Wait.click(delete);
		Wait.click(cdelete);
	}

}
