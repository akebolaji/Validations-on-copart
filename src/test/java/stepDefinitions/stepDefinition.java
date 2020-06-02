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
	
	@Given("^I Navigate to \"([^\"]*)\" site$")
    public void i_navigate_to_something_site(String strArg1) throws Throwable {
		driver=initializeBrowser();
		driver.manage().window().maximize();
		driver.get(strArg1);
    }
	@And("^I login to the home page$")
    public void i_login_to_the_home_page() throws Throwable {
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

    @Then("^verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
    	PortalHomePage ph= new PortalHomePage(driver);
 	   Assert.assertTrue(ph.getSearchIcon().isDisplayed());
 	  driver.quit();
    }

    


}
