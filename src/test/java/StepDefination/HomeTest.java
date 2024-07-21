package StepDefination;



import org.junit.jupiter.api.Assertions;

import PageLayer.HomePage;
import io.cucumber.java.en.When;

public class HomeTest
{
	
	private HomePage homepage;
	
	@When("user is on home page validate home page title as {string}")
	public void user_is_on_home_page_validate_home_page_title_as(String string) {
		 String actualTitle =  homepage.getTitle();
		  Assertions.assertEquals(actualTitle, string);

	}

	@When("user validate home page url")
	public void user_validate_home_page_url() {
		String actualUrl =  homepage.getUrl();
		 Assertions.assertEquals(actualUrl.contains("cogmento"), true);
	}

	@When("user validate home page logo")
	public void user_validate_home_page_logo() {
		homepage = new HomePage();
		boolean actualLogo = homepage.validateLogo();
		   Assertions.assertEquals(actualLogo, true);
	}


}
