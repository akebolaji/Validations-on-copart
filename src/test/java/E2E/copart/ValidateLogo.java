package E2E.copart;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import resources.Base;

public class ValidateLogo extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	public WebDriver driver;
@BeforeTest
public void intialize() throws IOException {
	driver=initializeBrowser();
	log.info("Intialize browser");
	driver.get(prop.getProperty("url"));
	log.info("Navigate to Home Page");
}
@Test

public void iconIsDisplayed() throws IOException {
	
	LandingPage lp= new LandingPage(driver);
	Assert.assertTrue(lp.getLogo().isDisplayed());
	log.info("Logo is displayed successfully");
	
}
@AfterTest
public void teardown() {
	driver.close();
}
}
	






