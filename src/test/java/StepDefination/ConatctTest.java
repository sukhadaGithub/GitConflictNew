package StepDefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;

import PageLayer.ContactPage;
import UtilityLayer.ExcelReader;
import io.cucumber.java.en.When;

public class ConatctTest
{
	private ContactPage contactpage;
	String ExcelSheetPath = System.getProperty("user.dir") + "//src//main//java//TestData//CogmentoTestData.xlsx";

	@When("user is on contact page and validate contact page url contains {string}")
	public void user_is_on_contact_page_and_validate_contact_page_url_contains(String string) throws InterruptedException {
		contactpage=new ContactPage();
		//String url=contactpage.clickContact();
		 //Assertions.assertEquals(url, string);	    
	}

	@When("user click on create button")
	public void user_click_on_create_button() throws InterruptedException {
		contactpage.createContact();
	}

@When("user enter contact information from Excel Sheet using {string} and {int}")
public void user_enter_contact_information_from_excel_sheet_using_and(String sheetname, Integer rownum) throws InterruptedException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> data = reader.getAllSheetData(ExcelSheetPath, sheetname);
		String fname = data.get(rownum).get("FirstName");
		String Mname = data.get(rownum).get("MiddleName");
		String Lname = data.get(rownum).get("LastName");
		String status = data.get(rownum).get("Status");
		contactpage.enterDetails(fname, Mname, Lname, status);


	}

	@When("user click on save button")
	public void user_click_on_save_button() {
		contactpage.clickSave();
	}

	@When("user delete contanct")
	public void user_delete_contanct() 
	{
		contactpage.deleteContact();
	   
	}


}
