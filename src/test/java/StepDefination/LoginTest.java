package StepDefination;

import java.util.List;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	
	private LoginPage loginPage;


	@Given("user is on login Page")
	public void user_is_on_login_page() {
	    BaseClass.initialization("chrome");
	}

	@When("user enter valid credentails")
	public void user_enter_valid_credentails(io.cucumber.datatable.DataTable dataTable) 
	{
		List<List<String>> list = dataTable.asLists();
	    String uname = list.get(0).get(0);
	    String pass = list.get(0).get(1);
	    loginPage = new LoginPage();
	    loginPage.enterCredentials(uname, pass);

	    
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	  loginPage.clickLogin();
	}



}
