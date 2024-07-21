package StepDefination;

import PageLayer.LogoutPage;
import io.cucumber.java.en.When;

public class LogoutTest {
	
	
	private LogoutPage logoutpage;
	

@When("user click on profile icon")
public void user_click_on_profile_icon() {
	logoutpage=new LogoutPage();
	logoutpage.clickSetting();
	
}
	
	@When("user logout the application")
	public void user_logout_the_application() {
		
		logoutpage.clickLogout();
	 
	}

	@When("user close the session")
	public void user_close_the_session() {
		logoutpage.quitDriver();
	}

}
