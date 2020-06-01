package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import pageobjects.PortalHomePage;
import resources.Base;

public class stepDefinition extends Base{
	@Given("Intialize the browser with chrome")
	public void intialize_the_browser_with_chrome() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		driver=initializeBrowser();
		driver.manage().window().maximize();
	}

	@Given("Navigate to {string} site")
	public void navigate_to_site(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("click on Login link in home page to land on secure sign in page")
	public void click_on_Login_link_in_home_page_to_land_on_secure_sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage lp = new LandingPage(driver);
		lp.getLogIn().click();
		lp.getMember().click();
	}

	 @When("^User enters (.+) and (.+) and logs in$")
	    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
	       
	    
		LoginPage l= new LoginPage(driver);
		l.getEmail().sendKeys(username);
		l.getPassword().sendKeys(password);
		l.getSignAcct().click();
	}

	@Then("verify that user is successfully logged in")
	public void verify_that_user_is_successfully_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    PortalHomePage ph= new PortalHomePage(driver);
	   Assert.assertTrue(ph.getSearchIcon().isDisplayed()); 
	}
	@And("^close browser$")
    public void close_browser() throws Throwable {
        driver.quit();
    }



}
